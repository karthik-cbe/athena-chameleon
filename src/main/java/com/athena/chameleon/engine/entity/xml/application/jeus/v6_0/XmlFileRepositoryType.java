//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.17 at 07:02:27 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.application.jeus.v6_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xml-file-repositoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xml-file-repositoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="config-file" type="{http://www.tmaxsoft.com/xml/ns/jeus}config-fileType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xml-file-repositoryType", propOrder = {
    "configFile"
})
public class XmlFileRepositoryType {

    @XmlElement(name = "config-file", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected ConfigFileType configFile;

    /**
     * Gets the value of the configFile property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigFileType }
     *     
     */
    public ConfigFileType getConfigFile() {
        return configFile;
    }

    /**
     * Sets the value of the configFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigFileType }
     *     
     */
    public void setConfigFile(ConfigFileType value) {
        this.configFile = value;
    }

}
