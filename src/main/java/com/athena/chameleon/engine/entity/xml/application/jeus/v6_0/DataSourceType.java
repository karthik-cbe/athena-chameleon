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
 * <p>Java class for data-sourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="data-sourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="database" type="{http://www.tmaxsoft.com/xml/ns/jeus}databaseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cluster-ds" type="{http://www.tmaxsoft.com/xml/ns/jeus}cluster-dsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "data-sourceType", propOrder = {
    "database",
    "clusterDs"
})
public class DataSourceType {

    @XmlElement(namespace = "http://www.tmaxsoft.com/xml/ns/jeus", required = true)
    protected List<DatabaseType> database;
    @XmlElement(name = "cluster-ds", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", required = true)
    protected List<ClusterDsType> clusterDs;

    /**
     * Gets the value of the database property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the database property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatabase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatabaseType }
     * 
     * 
     */
    public List<DatabaseType> getDatabase() {
        if (database == null) {
            database = new ArrayList<DatabaseType>();
        }
        return this.database;
    }

    /**
     * Gets the value of the clusterDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clusterDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClusterDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterDsType }
     * 
     * 
     */
    public List<ClusterDsType> getClusterDs() {
        if (clusterDs == null) {
            clusterDs = new ArrayList<ClusterDsType>();
        }
        return this.clusterDs;
    }

}
