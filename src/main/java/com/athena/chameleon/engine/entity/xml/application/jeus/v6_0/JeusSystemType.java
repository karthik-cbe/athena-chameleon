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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for jeus-systemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jeus-systemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="node" type="{http://www.tmaxsoft.com/xml/ns/jeus}jeus-nodeType" maxOccurs="unbounded"/>
 *         &lt;element name="naming-server" type="{http://www.tmaxsoft.com/xml/ns/jeus}naming-serverType" minOccurs="0"/>
 *         &lt;element name="security-manager" type="{http://www.tmaxsoft.com/xml/ns/jeus}security-managerType" minOccurs="0"/>
 *         &lt;element name="resource" type="{http://www.tmaxsoft.com/xml/ns/jeus}resourceType" minOccurs="0"/>
 *         &lt;element name="application" type="{http://www.tmaxsoft.com/xml/ns/jeus}applicationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.tmaxsoft.com/xml/ns/jeus}jeus-versionType" default="5.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jeus-systemType", propOrder = {
    "node",
    "namingServer",
    "securityManager",
    "resource",
    "application"
})
public class JeusSystemType {

    @XmlElement(namespace = "http://www.tmaxsoft.com/xml/ns/jeus", required = true)
    protected List<JeusNodeType> node;
    @XmlElement(name = "naming-server", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected NamingServerType namingServer;
    @XmlElement(name = "security-manager", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected SecurityManagerType securityManager;
    @XmlElement(namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected ResourceType resource;
    @XmlElement(namespace = "http://www.tmaxsoft.com/xml/ns/jeus", required = true)
    protected List<ApplicationType> application;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the node property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the node property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JeusNodeType }
     * 
     * 
     */
    public List<JeusNodeType> getNode() {
        if (node == null) {
            node = new ArrayList<JeusNodeType>();
        }
        return this.node;
    }

    /**
     * Gets the value of the namingServer property.
     * 
     * @return
     *     possible object is
     *     {@link NamingServerType }
     *     
     */
    public NamingServerType getNamingServer() {
        return namingServer;
    }

    /**
     * Sets the value of the namingServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamingServerType }
     *     
     */
    public void setNamingServer(NamingServerType value) {
        this.namingServer = value;
    }

    /**
     * Gets the value of the securityManager property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityManagerType }
     *     
     */
    public SecurityManagerType getSecurityManager() {
        return securityManager;
    }

    /**
     * Sets the value of the securityManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityManagerType }
     *     
     */
    public void setSecurityManager(SecurityManagerType value) {
        this.securityManager = value;
    }

    /**
     * Gets the value of the resource property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceType }
     *     
     */
    public ResourceType getResource() {
        return resource;
    }

    /**
     * Sets the value of the resource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceType }
     *     
     */
    public void setResource(ResourceType value) {
        this.resource = value;
    }

    /**
     * Gets the value of the application property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the application property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationType }
     * 
     * 
     */
    public List<ApplicationType> getApplication() {
        if (application == null) {
            application = new ArrayList<ApplicationType>();
        }
        return this.application;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "5.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
