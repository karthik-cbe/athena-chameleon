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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for tm-configType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tm-configType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="use-nio" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pooling" type="{http://www.tmaxsoft.com/xml/ns/jeus}poolingType" minOccurs="0"/>
 *         &lt;element name="active-timeout" type="{http://www.tmaxsoft.com/xml/ns/jeus}nonNegativeLongType" minOccurs="0"/>
 *         &lt;element name="prepare-timeout" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="prepared-timeout" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="commit-timeout" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="recovery-timeout" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="uncompleted-timeout" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="capacity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="recovery-log-file" type="{http://www.tmaxsoft.com/xml/ns/jeus}file-handlerType" minOccurs="0"/>
 *         &lt;element name="tx-log-dir" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tm-configType", propOrder = {
    "useNio",
    "pooling",
    "activeTimeout",
    "prepareTimeout",
    "preparedTimeout",
    "commitTimeout",
    "recoveryTimeout",
    "uncompletedTimeout",
    "capacity",
    "recoveryLogFile",
    "txLogDir"
})
public class TmConfigType {

    @XmlElement(name = "use-nio", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "true")
    protected Boolean useNio;
    @XmlElement(namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected PoolingType pooling;
    @XmlElement(name = "active-timeout", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "600000")
    protected Long activeTimeout;
    @XmlElement(name = "prepare-timeout", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "120000")
    protected Long prepareTimeout;
    @XmlElement(name = "prepared-timeout", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "60000")
    protected Long preparedTimeout;
    @XmlElement(name = "commit-timeout", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "240000")
    protected Long commitTimeout;
    @XmlElement(name = "recovery-timeout", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "120000")
    protected Long recoveryTimeout;
    @XmlElement(name = "uncompleted-timeout", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "86400000")
    protected Long uncompletedTimeout;
    @XmlElement(namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "10000")
    protected Integer capacity;
    @XmlElement(name = "recovery-log-file", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected FileHandlerType recoveryLogFile;
    @XmlElement(name = "tx-log-dir", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String txLogDir;

    /**
     * Gets the value of the useNio property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseNio() {
        return useNio;
    }

    /**
     * Sets the value of the useNio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseNio(Boolean value) {
        this.useNio = value;
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

    /**
     * Gets the value of the activeTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActiveTimeout() {
        return activeTimeout;
    }

    /**
     * Sets the value of the activeTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActiveTimeout(Long value) {
        this.activeTimeout = value;
    }

    /**
     * Gets the value of the prepareTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrepareTimeout() {
        return prepareTimeout;
    }

    /**
     * Sets the value of the prepareTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrepareTimeout(Long value) {
        this.prepareTimeout = value;
    }

    /**
     * Gets the value of the preparedTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPreparedTimeout() {
        return preparedTimeout;
    }

    /**
     * Sets the value of the preparedTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPreparedTimeout(Long value) {
        this.preparedTimeout = value;
    }

    /**
     * Gets the value of the commitTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCommitTimeout() {
        return commitTimeout;
    }

    /**
     * Sets the value of the commitTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCommitTimeout(Long value) {
        this.commitTimeout = value;
    }

    /**
     * Gets the value of the recoveryTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecoveryTimeout() {
        return recoveryTimeout;
    }

    /**
     * Sets the value of the recoveryTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecoveryTimeout(Long value) {
        this.recoveryTimeout = value;
    }

    /**
     * Gets the value of the uncompletedTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUncompletedTimeout() {
        return uncompletedTimeout;
    }

    /**
     * Sets the value of the uncompletedTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUncompletedTimeout(Long value) {
        this.uncompletedTimeout = value;
    }

    /**
     * Gets the value of the capacity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCapacity(Integer value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the recoveryLogFile property.
     * 
     * @return
     *     possible object is
     *     {@link FileHandlerType }
     *     
     */
    public FileHandlerType getRecoveryLogFile() {
        return recoveryLogFile;
    }

    /**
     * Sets the value of the recoveryLogFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileHandlerType }
     *     
     */
    public void setRecoveryLogFile(FileHandlerType value) {
        this.recoveryLogFile = value;
    }

    /**
     * Gets the value of the txLogDir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxLogDir() {
        return txLogDir;
    }

    /**
     * Sets the value of the txLogDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxLogDir(String value) {
        this.txLogDir = value;
    }

}
