/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Revision History
 * Author			Date				Description
 * ---------------	----------------	------------
 * Hyo-jeong Lee	2012. 8. 29.		First Draft.
 */
package com.athena.chameleon.engine.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Component;

import com.athena.chameleon.common.utils.PropertyUtil;
import com.athena.chameleon.engine.entity.file.MigrationFile;
import com.athena.chameleon.engine.entity.xml.application.ApplicationType;
import com.athena.chameleon.engine.entity.xml.webapp.WebAppType;
import com.athena.chameleon.engine.utils.JaxbUtils;

/**
 * Migration 을 위한 Context
 * 
 * @author Hyo-jeong Lee
 * @version 1.0
 */

@Component("migrationComponent")
public class MigrationComponent {

    public String                   rootPath;
    public File                     webXmlFile;
    public String                   webXmlVersion;
    public File                     applicationXmlFile;
    public String                   applicationXmlVersion;
    public File                     ejbXmlFile;
    public String                   ejbXmlVersion;
    public File                     weblogicEjbXmlFile;
    public List<MigrationFile>      migrationFileList = new ArrayList<MigrationFile>();
    
    /**
     * 
     * file diractory 안에 있는 file list setting 
     *
     * @param file diractory file
     * @param rootPath 최상위 path
     * @throws Exception
     */
    public void setMigrationFileList(File file, String rootPath) throws Exception {
        this.rootPath = rootPath;
        setMigrationFileList(file);
    }
    
    /**
     * 
     * file diractory 안에 있는 file list setting 
     *
     * @param file diractory file
     * @throws Exception
     */
    public void setMigrationFileList(File file) throws Exception {

        Pattern p = Pattern.compile(".*test.*"); //추후 pattern 변경
        Matcher match = null;
        
        if(file.isDirectory()) {
            for (int i=0;i < file.listFiles().length;i++) {
                File f = file.listFiles()[i];
                if(f.isDirectory()) {
                    setMigrationFileList(f);
                } else {
                    
                    String filePath = f.getAbsolutePath().substring(rootPath.length(), f.getAbsolutePath().length()).replace('\\', '/');
                    String changeTarget = PropertyUtil.getProperty("unzip.change.target");
                    
                    MigrationFile fileEntity = new MigrationFile();
                    fileEntity.setFileName(filePath);
                    
                    //문서 라인 추출
                    if(changeTarget.indexOf(filePath.substring(filePath.lastIndexOf(".")+1, filePath.length())) > -1) {
                    
                        HashMap<Integer, String> lineMap = new LinkedHashMap<Integer, String>();
                        
                        //xml file pasing
                        boolean webXmlFlag, applicationXmlFlag, ejbXmlFlag = false;
                        if(filePath.indexOf("WEB-INF/web.xml") > -1) {
                            webXmlFile = f;
                            webXmlFlag = true;
                        } else if(filePath.indexOf("WEB-INF/application.xml") > -1) {
                        	applicationXmlFile = f;
                        	applicationXmlFlag = true;
                        } else if(filePath.indexOf("META-INF/ejb-jar.xml") > -1) {
                            ejbXmlFile = f;
                            ejbXmlFlag = true;
                        } else if(filePath.indexOf("META-INF/weblogic-ejb-jar.xml") > -1) {
                            weblogicEjbXmlFile = f;
                        }
                        
                        try {
                            FileReader reader = new FileReader(f);
                            BufferedReader buffer = new BufferedReader(reader);
                            
                            
                            String lineStr = null;
                            int line = 0;
                            while((lineStr = buffer.readLine()) != null) {
                                
                                line++;
                                
                                match = p.matcher(lineStr);
                                if(match.matches()) {
                                    lineMap.put(line, lineStr);
                                }
                                
                                if(ejbXmlFlag){
                                    
                                }
                            }
                            fileEntity.setLineMap(lineMap);
                            migrationFileList.add(fileEntity);
                            
                        } catch(Exception e) {
                            e.printStackTrace();
                        }
                        
                    }
                 
                }
            }
        }
    }

    /**
     * 
     * web.xml pasing
     *
     * @param xmlFile web.xml file
     * @return WebAppType
     */
    public WebAppType webXmlPasing(File xmlFile) {
        this.webXmlFile = xmlFile;
        return webXmlPasing();
    }
    
    /**
     * 
     * web.xml pasing
     *
     * @return WebAppType
     */
    public WebAppType webXmlPasing() {
        
    	if(webXmlFile == null)
    		return null;
    		
        WebAppType webApp = null;
        try {
            Unmarshaller unmarshaller = JaxbUtils.createUnmarshaller("com.athena.chameleon.engine.entity.xml.webapp");
            JAXBElement<?> result = (JAXBElement<?>) unmarshaller.unmarshal(webXmlFile);
            
            webApp = (WebAppType)result.getValue();
            
        } catch(JAXBException je) {
            je.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return webApp;
    }
    
    /**
     * 
     * web.xml 안에 있는 element 가져오기
     *
     * @param webApp web.xml 최상위 객체
     * @param elementEntity 가져올 elementEntity
     * @return Object
     */
    public Object getWebXmlElementEntity(WebAppType webApp, Object elementEntity) {

    	if(webApp == null)
    		return null;
    	
        List<JAXBElement<?>> elementList = webApp.getDescriptionAndDisplayNameAndIcon();
        Object entity = null;
        
        for(JAXBElement<?> element : elementList) {
            if(element.getValue().getClass().equals(elementEntity.getClass())) {
                entity = element.getValue();
            }
        }
        return entity;
    }

    /**
     * 
     * web.xml 안에 있는 element list를 HashMap 가져오기
     *
     * @param webApp web.xml 최상위 객체
     * @param elementEntityList 가져올 elementEntity List
     * @return HashMap<?, ?>
     */
    public HashMap<?, ?> getWebXmlElementEntityMap(WebAppType webApp, List<Object> elementEntityList) {

        List<JAXBElement<?>> elementList = webApp.getDescriptionAndDisplayNameAndIcon();
        HashMap<Object, Object> entityMap = new HashMap<Object, Object>();
        
        for(JAXBElement<?> element : elementList) {
            for(Object elementEntity : elementEntityList) {
                if(element.getValue().getClass().equals(elementEntity.getClass())) {
                    entityMap.put(elementEntity, element.getValue());
                }
            }
        }
        return entityMap;
    }

    /**
     * 
     * application.xml pasing
     *
     * @param xmlFile application.xml file
     * @return ApplicationType
     */
    public ApplicationType applicationXmlPasing(File xmlFile) {
        this.applicationXmlFile = xmlFile;
        return applicationXmlPasing();
    }
    
    /**
     * 
     * application.xml pasing
     *
     * @return ApplicationType
     */
    public ApplicationType applicationXmlPasing() {
        
    	if(applicationXmlFile == null)
    		return null;
    	
    	ApplicationType app = null;
        try {
            Unmarshaller unmarshaller = JaxbUtils.createUnmarshaller("com.athena.chameleon.engine.entity.xml.application");
            JAXBElement<?> result = (JAXBElement<?>) unmarshaller.unmarshal(applicationXmlFile);
            
            app = (ApplicationType)result.getValue();
            
        } catch(JAXBException je) {
            je.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return app;
    }

    /**
     * 
     * ejb-jar.xml pasing
     *
     * @param xmlFile ejb-jar.xml file
     * @return EjbJarType
     */
    public Object ejbXmlPasing(File xmlFile) {
        this.ejbXmlFile = xmlFile;
        return ejbXmlPasing();
    }
    
    /**
     * 
     *  ejb-jar.xml pasing
     *
     * @return EjbJarType
     */
    public Object ejbXmlPasing() {
        
    	if(ejbXmlFile == null)
    		return null;
    	
    	Object ejb = null;
        try {
            Unmarshaller unmarshaller = JaxbUtils.createUnmarshaller("com.athena.chameleon.engine.entity.xml.ejbjar.v2_1");
            Object result = unmarshaller.unmarshal(ejbXmlFile);
            
            if(result instanceof JAXBElement<?>) {
                return ((JAXBElement<?>) result).getValue();
            } else {
                return result;
            }
            
        } catch(JAXBException je) {
            je.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return ejb;
    }

    /**
     * 
     * weblogic-ejb-jar.xml pasing
     *
     * @param xmlFile weblogic-ejb-jar.xml file
     * @return EjbJarType
     */
    public Object weblogicEjbXmlPasing(File xmlFile) {
        this.weblogicEjbXmlFile = xmlFile;
        return weblogicEjbXmlPasing();
    }
    
    /**
     * 
     *  ejb-jar.xml pasing
     *
     * @return EjbJarType
     */
    public Object weblogicEjbXmlPasing() {
        
        if(weblogicEjbXmlFile == null)
            return null;
        
        try {
            Unmarshaller unmarshaller = JaxbUtils.createUnmarshaller("com.athena.chameleon.engine.entity.xml.weblogicejbjar");
            Object result = unmarshaller.unmarshal(weblogicEjbXmlFile);
            
            if(result instanceof JAXBElement<?>) {
                return ((JAXBElement<?>) result).getValue();
            } else {
                return result;
            }
            
        } catch(JAXBException je) {
            je.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
       
    /**
     * @return the migrationFileList
     */
    public List<MigrationFile> getMigrationFileList() {
        return migrationFileList;
    }

    /**
     * @return the rootPath
     */
    public String getRootPath() {
        return rootPath;
    }

    /**
     * @return the webXmlFile
     */
    public File getWebXmlFile() {
        return webXmlFile;
    }

    /**
     * @param webXmlFile the webXmlFile to set
     */
    public void setWebXmlFile(File webXmlFile) {
        this.webXmlFile = webXmlFile;
    }
    
    /**
     * 
     * @return the applicationXmlFile
     */
    public File getApplicationXmlFile() {
		return applicationXmlFile;
	}

    /**
     * 
     * @param applicationXmlFile the applicationXmlFile to set
     */
	public void setApplicationXmlFile(File applicationXmlFile) {
		this.applicationXmlFile = applicationXmlFile;
	}

}
//end of MigrationContext.java