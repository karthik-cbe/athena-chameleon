//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.17 at 07:02:27 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.application.jeus.v6_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for destroy-policy-on-check-queryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="destroy-policy-on-check-queryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="FailedConnectionOnly"/>
 *     &lt;enumeration value="AllConnections"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum DestroyPolicyOnCheckQueryType {

    @XmlEnumValue("AllConnections")
    ALL_CONNECTIONS("AllConnections"),
    @XmlEnumValue("FailedConnectionOnly")
    FAILED_CONNECTION_ONLY("FailedConnectionOnly");
    private final String value;

    DestroyPolicyOnCheckQueryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DestroyPolicyOnCheckQueryType fromValue(String v) {
        for (DestroyPolicyOnCheckQueryType c: DestroyPolicyOnCheckQueryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
