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
 * <p>Java class for vendorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="vendorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="oracle"/>
 *     &lt;enumeration value="sybase"/>
 *     &lt;enumeration value="mssql"/>
 *     &lt;enumeration value="db2"/>
 *     &lt;enumeration value="tibero"/>
 *     &lt;enumeration value="informix"/>
 *     &lt;enumeration value="mysql"/>
 *     &lt;enumeration value="others"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum VendorType {

    @XmlEnumValue("db2")
    DB_2("db2"),
    @XmlEnumValue("informix")
    INFORMIX("informix"),
    @XmlEnumValue("mssql")
    MSSQL("mssql"),
    @XmlEnumValue("mysql")
    MYSQL("mysql"),
    @XmlEnumValue("oracle")
    ORACLE("oracle"),
    @XmlEnumValue("others")
    OTHERS("others"),
    @XmlEnumValue("sybase")
    SYBASE("sybase"),
    @XmlEnumValue("tibero")
    TIBERO("tibero");
    private final String value;

    VendorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VendorType fromValue(String v) {
        for (VendorType c: VendorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
