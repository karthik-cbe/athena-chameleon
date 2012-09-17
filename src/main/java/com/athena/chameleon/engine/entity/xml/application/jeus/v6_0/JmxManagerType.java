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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jmx-managerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jmx-managerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jmx-connector" type="{http://www.tmaxsoft.com/xml/ns/jeus}jmx-connectorType" minOccurs="0"/>
 *         &lt;element name="html-adaptor-port" type="{http://www.tmaxsoft.com/xml/ns/jeus}off-intType" minOccurs="0"/>
 *         &lt;element name="snmp-adaptor" type="{http://www.tmaxsoft.com/xml/ns/jeus}snmp-adaptorType" minOccurs="0"/>
 *         &lt;element name="mlet-url" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jmx-managerType", propOrder = {
    "jmxConnector",
    "htmlAdaptorPort",
    "snmpAdaptor",
    "mletUrl"
})
public class JmxManagerType {

    @XmlElement(name = "jmx-connector", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected JmxConnectorType jmxConnector;
    @XmlElement(name = "html-adaptor-port", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected Integer htmlAdaptorPort;
    @XmlElement(name = "snmp-adaptor", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected SnmpAdaptorType snmpAdaptor;
    @XmlElementRef(name = "mlet-url", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", type = JAXBElement.class)
    protected List<JAXBElement<String>> mletUrl;

    /**
     * Gets the value of the jmxConnector property.
     * 
     * @return
     *     possible object is
     *     {@link JmxConnectorType }
     *     
     */
    public JmxConnectorType getJmxConnector() {
        return jmxConnector;
    }

    /**
     * Sets the value of the jmxConnector property.
     * 
     * @param value
     *     allowed object is
     *     {@link JmxConnectorType }
     *     
     */
    public void setJmxConnector(JmxConnectorType value) {
        this.jmxConnector = value;
    }

    /**
     * Gets the value of the htmlAdaptorPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHtmlAdaptorPort() {
        return htmlAdaptorPort;
    }

    /**
     * Sets the value of the htmlAdaptorPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHtmlAdaptorPort(Integer value) {
        this.htmlAdaptorPort = value;
    }

    /**
     * Gets the value of the snmpAdaptor property.
     * 
     * @return
     *     possible object is
     *     {@link SnmpAdaptorType }
     *     
     */
    public SnmpAdaptorType getSnmpAdaptor() {
        return snmpAdaptor;
    }

    /**
     * Sets the value of the snmpAdaptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnmpAdaptorType }
     *     
     */
    public void setSnmpAdaptor(SnmpAdaptorType value) {
        this.snmpAdaptor = value;
    }

    /**
     * Gets the value of the mletUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mletUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMletUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getMletUrl() {
        if (mletUrl == null) {
            mletUrl = new ArrayList<JAXBElement<String>>();
        }
        return this.mletUrl;
    }

}
