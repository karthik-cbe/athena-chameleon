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
 * <p>Java class for action-on-resource-leakType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="action-on-resource-leakType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NoAction"/>
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="AutoClose"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ActionOnResourceLeakType {

    @XmlEnumValue("AutoClose")
    AUTO_CLOSE("AutoClose"),
    @XmlEnumValue("NoAction")
    NO_ACTION("NoAction"),
    @XmlEnumValue("Warning")
    WARNING("Warning");
    private final String value;

    ActionOnResourceLeakType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionOnResourceLeakType fromValue(String v) {
        for (ActionOnResourceLeakType c: ActionOnResourceLeakType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
