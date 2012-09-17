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
 * <p>Java class for repository-serviceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="repository-serviceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="xml-file-repository" type="{http://www.tmaxsoft.com/xml/ns/jeus}xml-file-repositoryType" minOccurs="0"/>
 *           &lt;element name="database-repository" type="{http://www.tmaxsoft.com/xml/ns/jeus}database-repositoryType" minOccurs="0"/>
 *           &lt;element name="custom-repository" type="{http://www.tmaxsoft.com/xml/ns/jeus}SecurityServiceType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repository-serviceType", propOrder = {
    "xmlFileRepository",
    "databaseRepository",
    "customRepository"
})
public class RepositoryServiceType {

    @XmlElement(name = "xml-file-repository", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected XmlFileRepositoryType xmlFileRepository;
    @XmlElement(name = "database-repository", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected DatabaseRepositoryType databaseRepository;
    @XmlElement(name = "custom-repository", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected SecurityServiceType customRepository;

    /**
     * Gets the value of the xmlFileRepository property.
     * 
     * @return
     *     possible object is
     *     {@link XmlFileRepositoryType }
     *     
     */
    public XmlFileRepositoryType getXmlFileRepository() {
        return xmlFileRepository;
    }

    /**
     * Sets the value of the xmlFileRepository property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlFileRepositoryType }
     *     
     */
    public void setXmlFileRepository(XmlFileRepositoryType value) {
        this.xmlFileRepository = value;
    }

    /**
     * Gets the value of the databaseRepository property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseRepositoryType }
     *     
     */
    public DatabaseRepositoryType getDatabaseRepository() {
        return databaseRepository;
    }

    /**
     * Sets the value of the databaseRepository property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseRepositoryType }
     *     
     */
    public void setDatabaseRepository(DatabaseRepositoryType value) {
        this.databaseRepository = value;
    }

    /**
     * Gets the value of the customRepository property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityServiceType }
     *     
     */
    public SecurityServiceType getCustomRepository() {
        return customRepository;
    }

    /**
     * Sets the value of the customRepository property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityServiceType }
     *     
     */
    public void setCustomRepository(SecurityServiceType value) {
        this.customRepository = value;
    }

}
