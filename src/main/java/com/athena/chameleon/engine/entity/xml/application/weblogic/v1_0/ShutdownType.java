//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.12 at 01:39:08 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.application.weblogic.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shutdownType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shutdownType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shutdown-class" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shutdown-uri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shutdownType", namespace = "http://www.bea.com/ns/weblogic/weblogic-application", propOrder = {
    "shutdownClass",
    "shutdownUri"
})
public class ShutdownType {

    @XmlElement(name = "shutdown-class", namespace = "http://www.bea.com/ns/weblogic/weblogic-application", required = true)
    protected java.lang.String shutdownClass;
    @XmlElement(name = "shutdown-uri", namespace = "http://www.bea.com/ns/weblogic/weblogic-application")
    protected java.lang.String shutdownUri;

    /**
     * Gets the value of the shutdownClass property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getShutdownClass() {
        return shutdownClass;
    }

    /**
     * Sets the value of the shutdownClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setShutdownClass(java.lang.String value) {
        this.shutdownClass = value;
    }

    /**
     * Gets the value of the shutdownUri property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getShutdownUri() {
        return shutdownUri;
    }

    /**
     * Sets the value of the shutdownUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setShutdownUri(java.lang.String value) {
        this.shutdownUri = value;
    }

}