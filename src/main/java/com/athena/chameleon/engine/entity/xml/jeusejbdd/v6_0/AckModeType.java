//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.05 at 10:14:54 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.jeusejbdd.v6_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for ack-modeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ack-modeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Auto-acknowledge"/>
 *     &lt;enumeration value="Dups-ok-acknowledge"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum AckModeType {

    @XmlEnumValue("Auto-acknowledge")
    AUTO_ACKNOWLEDGE("Auto-acknowledge"),
    @XmlEnumValue("Dups-ok-acknowledge")
    DUPS_OK_ACKNOWLEDGE("Dups-ok-acknowledge");
    private final String value;

    AckModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AckModeType fromValue(String v) {
        for (AckModeType c: AckModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}