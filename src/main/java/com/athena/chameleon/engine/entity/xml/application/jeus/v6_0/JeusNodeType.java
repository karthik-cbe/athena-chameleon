//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.17 at 07:02:27 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.application.jeus.v6_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for jeus-nodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jeus-nodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="listener" type="{http://www.tmaxsoft.com/xml/ns/jeus}listenerType" minOccurs="0"/>
 *         &lt;element name="backup-node" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="engine-container" type="{http://www.tmaxsoft.com/xml/ns/jeus}engine-containerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="class-ftp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="auto-restart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sequential-start" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="scheduler" type="{http://www.tmaxsoft.com/xml/ns/jeus}schedulerType" minOccurs="0"/>
 *         &lt;element name="enable-webadmin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="webadmin-config" type="{http://www.tmaxsoft.com/xml/ns/jeus}webadmin-configType" minOccurs="0"/>
 *         &lt;element name="system-logging" type="{http://www.tmaxsoft.com/xml/ns/jeus}system-loggingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.tmaxsoft.com/xml/ns/jeus}log-stdout-to-raw-format-group"/>
 *         &lt;element name="session-server" type="{http://www.tmaxsoft.com/xml/ns/jeus}jeusmain-session-serverType" minOccurs="0"/>
 *         &lt;element name="session-router-config" type="{http://www.tmaxsoft.com/xml/ns/jeus}session-router-configType" minOccurs="0"/>
 *         &lt;element name="jmx-manager" type="{http://www.tmaxsoft.com/xml/ns/jeus}jmx-managerType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jeus-nodeType", propOrder = {
    "name",
    "listener",
    "backupNode",
    "engineContainer",
    "classFtp",
    "autoRestart",
    "sequentialStart",
    "scheduler",
    "enableWebadmin",
    "webadminConfig",
    "systemLogging",
    "logStdoutToRawFormat",
    "sessionServer",
    "sessionRouterConfig",
    "jmxManager"
})
public class JeusNodeType {

    @XmlElement(namespace = "http://www.tmaxsoft.com/xml/ns/jeus", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;
    @XmlElement(namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected ListenerType listener;
    @XmlElement(name = "backup-node", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String backupNode;
    @XmlElement(name = "engine-container", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", required = true)
    protected List<EngineContainerType> engineContainer;
    @XmlElement(name = "class-ftp", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected Boolean classFtp;
    @XmlElement(name = "auto-restart", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected Boolean autoRestart;
    @XmlElement(name = "sequential-start", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "true")
    protected Boolean sequentialStart;
    @XmlElement(namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected SchedulerType scheduler;
    @XmlElement(name = "enable-webadmin", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected Boolean enableWebadmin;
    @XmlElement(name = "webadmin-config", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected WebadminConfigType webadminConfig;
    @XmlElement(name = "system-logging", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", required = true)
    protected List<SystemLoggingType> systemLogging;
    @XmlElement(name = "log-stdout-to-raw-format", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected Boolean logStdoutToRawFormat;
    @XmlElement(name = "session-server", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected JeusmainSessionServerType sessionServer;
    @XmlElement(name = "session-router-config", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected SessionRouterConfigType sessionRouterConfig;
    @XmlElement(name = "jmx-manager", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected JmxManagerType jmxManager;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the listener property.
     * 
     * @return
     *     possible object is
     *     {@link ListenerType }
     *     
     */
    public ListenerType getListener() {
        return listener;
    }

    /**
     * Sets the value of the listener property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListenerType }
     *     
     */
    public void setListener(ListenerType value) {
        this.listener = value;
    }

    /**
     * Gets the value of the backupNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupNode() {
        return backupNode;
    }

    /**
     * Sets the value of the backupNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupNode(String value) {
        this.backupNode = value;
    }

    /**
     * Gets the value of the engineContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the engineContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEngineContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EngineContainerType }
     * 
     * 
     */
    public List<EngineContainerType> getEngineContainer() {
        if (engineContainer == null) {
            engineContainer = new ArrayList<EngineContainerType>();
        }
        return this.engineContainer;
    }

    /**
     * Gets the value of the classFtp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassFtp() {
        return classFtp;
    }

    /**
     * Sets the value of the classFtp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassFtp(Boolean value) {
        this.classFtp = value;
    }

    /**
     * Gets the value of the autoRestart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoRestart() {
        return autoRestart;
    }

    /**
     * Sets the value of the autoRestart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoRestart(Boolean value) {
        this.autoRestart = value;
    }

    /**
     * Gets the value of the sequentialStart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSequentialStart() {
        return sequentialStart;
    }

    /**
     * Sets the value of the sequentialStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSequentialStart(Boolean value) {
        this.sequentialStart = value;
    }

    /**
     * Gets the value of the scheduler property.
     * 
     * @return
     *     possible object is
     *     {@link SchedulerType }
     *     
     */
    public SchedulerType getScheduler() {
        return scheduler;
    }

    /**
     * Sets the value of the scheduler property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchedulerType }
     *     
     */
    public void setScheduler(SchedulerType value) {
        this.scheduler = value;
    }

    /**
     * Gets the value of the enableWebadmin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableWebadmin() {
        return enableWebadmin;
    }

    /**
     * Sets the value of the enableWebadmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableWebadmin(Boolean value) {
        this.enableWebadmin = value;
    }

    /**
     * Gets the value of the webadminConfig property.
     * 
     * @return
     *     possible object is
     *     {@link WebadminConfigType }
     *     
     */
    public WebadminConfigType getWebadminConfig() {
        return webadminConfig;
    }

    /**
     * Sets the value of the webadminConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebadminConfigType }
     *     
     */
    public void setWebadminConfig(WebadminConfigType value) {
        this.webadminConfig = value;
    }

    /**
     * Gets the value of the systemLogging property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemLogging property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemLogging().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemLoggingType }
     * 
     * 
     */
    public List<SystemLoggingType> getSystemLogging() {
        if (systemLogging == null) {
            systemLogging = new ArrayList<SystemLoggingType>();
        }
        return this.systemLogging;
    }

    /**
     * Gets the value of the logStdoutToRawFormat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogStdoutToRawFormat() {
        return logStdoutToRawFormat;
    }

    /**
     * Sets the value of the logStdoutToRawFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogStdoutToRawFormat(Boolean value) {
        this.logStdoutToRawFormat = value;
    }

    /**
     * Gets the value of the sessionServer property.
     * 
     * @return
     *     possible object is
     *     {@link JeusmainSessionServerType }
     *     
     */
    public JeusmainSessionServerType getSessionServer() {
        return sessionServer;
    }

    /**
     * Sets the value of the sessionServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JeusmainSessionServerType }
     *     
     */
    public void setSessionServer(JeusmainSessionServerType value) {
        this.sessionServer = value;
    }

    /**
     * Gets the value of the sessionRouterConfig property.
     * 
     * @return
     *     possible object is
     *     {@link SessionRouterConfigType }
     *     
     */
    public SessionRouterConfigType getSessionRouterConfig() {
        return sessionRouterConfig;
    }

    /**
     * Sets the value of the sessionRouterConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionRouterConfigType }
     *     
     */
    public void setSessionRouterConfig(SessionRouterConfigType value) {
        this.sessionRouterConfig = value;
    }

    /**
     * Gets the value of the jmxManager property.
     * 
     * @return
     *     possible object is
     *     {@link JmxManagerType }
     *     
     */
    public JmxManagerType getJmxManager() {
        return jmxManager;
    }

    /**
     * Sets the value of the jmxManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link JmxManagerType }
     *     
     */
    public void setJmxManager(JmxManagerType value) {
        this.jmxManager = value;
    }

}
