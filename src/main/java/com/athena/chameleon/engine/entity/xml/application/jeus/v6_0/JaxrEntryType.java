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
 * <p>Java class for jaxr-entryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jaxr-entryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="export-name" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="connection-factory-class-name" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="query-manager-URL" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="lifeCycle-manager-URL" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="authentication-method" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="jaxr-property" type="{http://www.tmaxsoft.com/xml/ns/jeus}jaxr-propertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jaxr-entryType", propOrder = {
    "exportName",
    "connectionFactoryClassName",
    "queryManagerURL",
    "lifeCycleManagerURL",
    "authenticationMethod",
    "jaxrProperty"
})
public class JaxrEntryType {

    @XmlElement(name = "export-name", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String exportName;
    @XmlElement(name = "connection-factory-class-name", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String connectionFactoryClassName;
    @XmlElement(name = "query-manager-URL", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String queryManagerURL;
    @XmlElement(name = "lifeCycle-manager-URL", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lifeCycleManagerURL;
    @XmlElement(name = "authentication-method", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String authenticationMethod;
    @XmlElement(name = "jaxr-property", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", required = true)
    protected List<JaxrPropertyType> jaxrProperty;

    /**
     * Gets the value of the exportName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportName() {
        return exportName;
    }

    /**
     * Sets the value of the exportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportName(String value) {
        this.exportName = value;
    }

    /**
     * Gets the value of the connectionFactoryClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionFactoryClassName() {
        return connectionFactoryClassName;
    }

    /**
     * Sets the value of the connectionFactoryClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionFactoryClassName(String value) {
        this.connectionFactoryClassName = value;
    }

    /**
     * Gets the value of the queryManagerURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryManagerURL() {
        return queryManagerURL;
    }

    /**
     * Sets the value of the queryManagerURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryManagerURL(String value) {
        this.queryManagerURL = value;
    }

    /**
     * Gets the value of the lifeCycleManagerURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeCycleManagerURL() {
        return lifeCycleManagerURL;
    }

    /**
     * Sets the value of the lifeCycleManagerURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeCycleManagerURL(String value) {
        this.lifeCycleManagerURL = value;
    }

    /**
     * Gets the value of the authenticationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationMethod() {
        return authenticationMethod;
    }

    /**
     * Sets the value of the authenticationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationMethod(String value) {
        this.authenticationMethod = value;
    }

    /**
     * Gets the value of the jaxrProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jaxrProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJaxrProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxrPropertyType }
     * 
     * 
     */
    public List<JaxrPropertyType> getJaxrProperty() {
        if (jaxrProperty == null) {
            jaxrProperty = new ArrayList<JaxrPropertyType>();
        }
        return this.jaxrProperty;
    }

}
