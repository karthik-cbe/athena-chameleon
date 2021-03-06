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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deployment-targetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deployment-targetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="all-targets" type="{http://www.tmaxsoft.com/xml/ns/jeus}all-targetsType"/>
 *         &lt;element name="target" type="{http://www.tmaxsoft.com/xml/ns/jeus}app-targetType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deployment-targetType", propOrder = {
    "allTargetsOrTarget"
})
public class DeploymentTargetType {

    @XmlElements({
        @XmlElement(name = "target", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", required = true, type = AppTargetType.class),
        @XmlElement(name = "all-targets", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", required = true, type = AllTargetsType.class)
    })
    protected List<Object> allTargetsOrTarget;

    /**
     * Gets the value of the allTargetsOrTarget property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allTargetsOrTarget property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllTargetsOrTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppTargetType }
     * {@link AllTargetsType }
     * 
     * 
     */
    public List<Object> getAllTargetsOrTarget() {
        if (allTargetsOrTarget == null) {
            allTargetsOrTarget = new ArrayList<Object>();
        }
        return this.allTargetsOrTarget;
    }

}
