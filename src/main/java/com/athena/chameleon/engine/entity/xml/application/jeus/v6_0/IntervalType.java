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
 * <p>Java class for intervalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="intervalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="millisecond" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="minutely" type="{http://www.tmaxsoft.com/xml/ns/jeus}nonNegativeIntType"/>
 *         &lt;element name="hourly" type="{http://www.tmaxsoft.com/xml/ns/jeus}nonNegativeIntType"/>
 *         &lt;element name="daily" type="{http://www.tmaxsoft.com/xml/ns/jeus}nonNegativeIntType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "intervalType", propOrder = {
    "millisecond",
    "minutely",
    "hourly",
    "daily"
})
public class IntervalType {

    @XmlElement(namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected Long millisecond;
    @XmlElement(namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected Integer minutely;
    @XmlElement(namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected Integer hourly;
    @XmlElement(namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected Integer daily;

    /**
     * Gets the value of the millisecond property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMillisecond() {
        return millisecond;
    }

    /**
     * Sets the value of the millisecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMillisecond(Long value) {
        this.millisecond = value;
    }

    /**
     * Gets the value of the minutely property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinutely() {
        return minutely;
    }

    /**
     * Sets the value of the minutely property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinutely(Integer value) {
        this.minutely = value;
    }

    /**
     * Gets the value of the hourly property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHourly() {
        return hourly;
    }

    /**
     * Sets the value of the hourly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHourly(Integer value) {
        this.hourly = value;
    }

    /**
     * Gets the value of the daily property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaily() {
        return daily;
    }

    /**
     * Sets the value of the daily property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaily(Integer value) {
        this.daily = value;
    }

}
