//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.17 at 07:02:27 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.application.jeus.v6_0;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for transportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BIND"/>
 *     &lt;enumeration value="CLIENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum TransportType {

    BIND,
    CLIENT;

    public String value() {
        return name();
    }

    public static TransportType fromValue(String v) {
        return valueOf(v);
    }

}
