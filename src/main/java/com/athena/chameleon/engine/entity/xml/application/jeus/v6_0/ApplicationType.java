//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.17 at 07:02:27 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.application.jeus.v6_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for applicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="absolute-path" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *           &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *           &lt;element name="deployment-type" type="{http://www.tmaxsoft.com/xml/ns/jeus}deployment-typeType" minOccurs="0"/>
 *           &lt;element name="client-component" type="{http://www.tmaxsoft.com/xml/ns/jeus}client-componentType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="connector-component" type="{http://www.tmaxsoft.com/xml/ns/jeus}connector-componentType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="ejb-component" type="{http://www.tmaxsoft.com/xml/ns/jeus}ejb-componentType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="web-component" type="{http://www.tmaxsoft.com/xml/ns/jeus}web-componentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="absolute-ejb-jar" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="absolute-jeus-ejb-dd" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;group ref="{http://www.tmaxsoft.com/xml/ns/jeus}application-propertyGroup"/>
 *         &lt;element name="auto-deploy" type="{http://www.tmaxsoft.com/xml/ns/jeus}auto-deployType" minOccurs="0"/>
 *         &lt;element name="deploy-when-booting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationType", propOrder = {
    "absolutePath",
    "nameAndPathAndDeploymentType",
    "absoluteEjbJar",
    "absoluteJeusEjbDd",
    "deploymentTarget",
    "classloading",
    "classFtpUnit",
    "securityDomainName",
    "rolePermission",
    "javaSecurityPermission",
    "keepGenerated",
    "fastDeploy",
    "libraryDirectory",
    "libraryRef",
    "autoDeploy",
    "deployWhenBooting"
})
public class ApplicationType {

    @XmlElement(name = "absolute-path", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String absolutePath;
    @XmlElementRefs({
        @XmlElementRef(name = "name", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", type = JAXBElement.class),
        @XmlElementRef(name = "ejb-component", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", type = JAXBElement.class),
        @XmlElementRef(name = "connector-component", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", type = JAXBElement.class),
        @XmlElementRef(name = "deployment-type", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", type = JAXBElement.class),
        @XmlElementRef(name = "client-component", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", type = JAXBElement.class),
        @XmlElementRef(name = "web-component", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", type = JAXBElement.class),
        @XmlElementRef(name = "path", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> nameAndPathAndDeploymentType;
    @XmlElement(name = "absolute-ejb-jar", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String absoluteEjbJar;
    @XmlElement(name = "absolute-jeus-ejb-dd", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String absoluteJeusEjbDd;
    @XmlElement(name = "deployment-target", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected DeploymentTargetType deploymentTarget;
    @XmlElement(namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected ClassloadingType classloading;
    @XmlElement(name = "class-ftp-unit", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "JAR")
    protected ClassFtpUnitType classFtpUnit;
    @XmlElement(name = "security-domain-name", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String securityDomainName;
    @XmlElement(name = "role-permission", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", required = true)
    protected List<RolePermissionType> rolePermission;
    @XmlElement(name = "java-security-permission", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected SecurityPermissionType javaSecurityPermission;
    @XmlElement(name = "keep-generated", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected Boolean keepGenerated;
    @XmlElement(name = "fast-deploy", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected Boolean fastDeploy;
    @XmlElement(name = "library-directory", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String libraryDirectory;
    @XmlElement(name = "library-ref", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", required = true)
    protected List<LibraryRefType> libraryRef;
    @XmlElement(name = "auto-deploy", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected AutoDeployType autoDeploy;
    @XmlElement(name = "deploy-when-booting", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "true")
    protected Boolean deployWhenBooting;

    /**
     * Gets the value of the absolutePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbsolutePath() {
        return absolutePath;
    }

    /**
     * Sets the value of the absolutePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbsolutePath(String value) {
        this.absolutePath = value;
    }

    /**
     * Gets the value of the nameAndPathAndDeploymentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameAndPathAndDeploymentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameAndPathAndDeploymentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link EjbComponentType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConnectorComponentType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeploymentTypeType }{@code >}
     * {@link JAXBElement }{@code <}{@link ClientComponentType }{@code >}
     * {@link JAXBElement }{@code <}{@link WebComponentType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getNameAndPathAndDeploymentType() {
        if (nameAndPathAndDeploymentType == null) {
            nameAndPathAndDeploymentType = new ArrayList<JAXBElement<?>>();
        }
        return this.nameAndPathAndDeploymentType;
    }

    /**
     * Gets the value of the absoluteEjbJar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbsoluteEjbJar() {
        return absoluteEjbJar;
    }

    /**
     * Sets the value of the absoluteEjbJar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbsoluteEjbJar(String value) {
        this.absoluteEjbJar = value;
    }

    /**
     * Gets the value of the absoluteJeusEjbDd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbsoluteJeusEjbDd() {
        return absoluteJeusEjbDd;
    }

    /**
     * Sets the value of the absoluteJeusEjbDd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbsoluteJeusEjbDd(String value) {
        this.absoluteJeusEjbDd = value;
    }

    /**
     * Gets the value of the deploymentTarget property.
     * 
     * @return
     *     possible object is
     *     {@link DeploymentTargetType }
     *     
     */
    public DeploymentTargetType getDeploymentTarget() {
        return deploymentTarget;
    }

    /**
     * Sets the value of the deploymentTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeploymentTargetType }
     *     
     */
    public void setDeploymentTarget(DeploymentTargetType value) {
        this.deploymentTarget = value;
    }

    /**
     * Gets the value of the classloading property.
     * 
     * @return
     *     possible object is
     *     {@link ClassloadingType }
     *     
     */
    public ClassloadingType getClassloading() {
        return classloading;
    }

    /**
     * Sets the value of the classloading property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassloadingType }
     *     
     */
    public void setClassloading(ClassloadingType value) {
        this.classloading = value;
    }

    /**
     * Gets the value of the classFtpUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ClassFtpUnitType }
     *     
     */
    public ClassFtpUnitType getClassFtpUnit() {
        return classFtpUnit;
    }

    /**
     * Sets the value of the classFtpUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassFtpUnitType }
     *     
     */
    public void setClassFtpUnit(ClassFtpUnitType value) {
        this.classFtpUnit = value;
    }

    /**
     * Gets the value of the securityDomainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityDomainName() {
        return securityDomainName;
    }

    /**
     * Sets the value of the securityDomainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityDomainName(String value) {
        this.securityDomainName = value;
    }

    /**
     * Gets the value of the rolePermission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rolePermission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRolePermission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RolePermissionType }
     * 
     * 
     */
    public List<RolePermissionType> getRolePermission() {
        if (rolePermission == null) {
            rolePermission = new ArrayList<RolePermissionType>();
        }
        return this.rolePermission;
    }

    /**
     * Gets the value of the javaSecurityPermission property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityPermissionType }
     *     
     */
    public SecurityPermissionType getJavaSecurityPermission() {
        return javaSecurityPermission;
    }

    /**
     * Sets the value of the javaSecurityPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityPermissionType }
     *     
     */
    public void setJavaSecurityPermission(SecurityPermissionType value) {
        this.javaSecurityPermission = value;
    }

    /**
     * Gets the value of the keepGenerated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeepGenerated() {
        return keepGenerated;
    }

    /**
     * Sets the value of the keepGenerated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepGenerated(Boolean value) {
        this.keepGenerated = value;
    }

    /**
     * Gets the value of the fastDeploy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFastDeploy() {
        return fastDeploy;
    }

    /**
     * Sets the value of the fastDeploy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFastDeploy(Boolean value) {
        this.fastDeploy = value;
    }

    /**
     * Gets the value of the libraryDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryDirectory() {
        return libraryDirectory;
    }

    /**
     * Sets the value of the libraryDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryDirectory(String value) {
        this.libraryDirectory = value;
    }

    /**
     * Gets the value of the libraryRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the libraryRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibraryRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LibraryRefType }
     * 
     * 
     */
    public List<LibraryRefType> getLibraryRef() {
        if (libraryRef == null) {
            libraryRef = new ArrayList<LibraryRefType>();
        }
        return this.libraryRef;
    }

    /**
     * Gets the value of the autoDeploy property.
     * 
     * @return
     *     possible object is
     *     {@link AutoDeployType }
     *     
     */
    public AutoDeployType getAutoDeploy() {
        return autoDeploy;
    }

    /**
     * Sets the value of the autoDeploy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoDeployType }
     *     
     */
    public void setAutoDeploy(AutoDeployType value) {
        this.autoDeploy = value;
    }

    /**
     * Gets the value of the deployWhenBooting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeployWhenBooting() {
        return deployWhenBooting;
    }

    /**
     * Sets the value of the deployWhenBooting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeployWhenBooting(Boolean value) {
        this.deployWhenBooting = value;
    }

}
