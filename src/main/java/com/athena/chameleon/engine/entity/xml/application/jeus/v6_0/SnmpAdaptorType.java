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


/**
 * <p>Java class for snmp-adaptorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="snmp-adaptorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="snmp-adaptor-port" type="{http://www.tmaxsoft.com/xml/ns/jeus}snmp-adaptor-portType"/>
 *         &lt;element name="snmp-version" type="{http://www.tmaxsoft.com/xml/ns/jeus}snmp-versionType" minOccurs="0"/>
 *         &lt;element name="snmp-max-packet-size" type="{http://www.tmaxsoft.com/xml/ns/jeus}snmp-max-packet-sizeType" minOccurs="0"/>
 *         &lt;element name="snmp-security" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="trap-demon" type="{http://www.tmaxsoft.com/xml/ns/jeus}trap-demonType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pooling" type="{http://www.tmaxsoft.com/xml/ns/jeus}poolingType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "snmp-adaptorType", propOrder = {
    "snmpAdaptorPort",
    "snmpVersion",
    "snmpMaxPacketSize",
    "snmpSecurity",
    "trapDemon",
    "pooling"
})
public class SnmpAdaptorType {

    @XmlElement(name = "snmp-adaptor-port", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected int snmpAdaptorPort;
    @XmlElement(name = "snmp-version", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "3")
    protected Integer snmpVersion;
    @XmlElement(name = "snmp-max-packet-size", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "4096")
    protected Integer snmpMaxPacketSize;
    @XmlElement(name = "snmp-security", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "false")
    protected Boolean snmpSecurity;
    @XmlElement(name = "trap-demon", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", required = true)
    protected List<TrapDemonType> trapDemon;
    @XmlElement(namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected PoolingType pooling;

    /**
     * Gets the value of the snmpAdaptorPort property.
     * 
     */
    public int getSnmpAdaptorPort() {
        return snmpAdaptorPort;
    }

    /**
     * Sets the value of the snmpAdaptorPort property.
     * 
     */
    public void setSnmpAdaptorPort(int value) {
        this.snmpAdaptorPort = value;
    }

    /**
     * Gets the value of the snmpVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSnmpVersion() {
        return snmpVersion;
    }

    /**
     * Sets the value of the snmpVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSnmpVersion(Integer value) {
        this.snmpVersion = value;
    }

    /**
     * Gets the value of the snmpMaxPacketSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSnmpMaxPacketSize() {
        return snmpMaxPacketSize;
    }

    /**
     * Sets the value of the snmpMaxPacketSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSnmpMaxPacketSize(Integer value) {
        this.snmpMaxPacketSize = value;
    }

    /**
     * Gets the value of the snmpSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSnmpSecurity() {
        return snmpSecurity;
    }

    /**
     * Sets the value of the snmpSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSnmpSecurity(Boolean value) {
        this.snmpSecurity = value;
    }

    /**
     * Gets the value of the trapDemon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trapDemon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrapDemon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrapDemonType }
     * 
     * 
     */
    public List<TrapDemonType> getTrapDemon() {
        if (trapDemon == null) {
            trapDemon = new ArrayList<TrapDemonType>();
        }
        return this.trapDemon;
    }

    /**
     * Gets the value of the pooling property.
     * 
     * @return
     *     possible object is
     *     {@link PoolingType }
     *     
     */
    public PoolingType getPooling() {
        return pooling;
    }

    /**
     * Sets the value of the pooling property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoolingType }
     *     
     */
    public void setPooling(PoolingType value) {
        this.pooling = value;
    }

}
