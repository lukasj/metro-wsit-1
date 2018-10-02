/*
 * Copyright (c) 2010, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.02.24 at 05:55:09 PM PST 
//


package com.sun.xml.ws.policy.impl.bindings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.sun.xml.ws.policy.impl.bindings.AppliesTo;
import com.sun.xml.ws.policy.impl.bindings.Policy;
import com.sun.xml.ws.policy.impl.bindings.PolicyAttachment;
import com.sun.xml.ws.policy.impl.bindings.PolicyReference;
import org.w3c.dom.Element;


/**
 * <p>Java class for PolicyAttachment element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="PolicyAttachment"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://schemas.xmlsoap.org/ws/2004/09/policy}AppliesTo"/&gt;
 *           &lt;choice maxOccurs="unbounded"&gt;
 *             &lt;element ref="{http://schemas.xmlsoap.org/ws/2004/09/policy}Policy"/&gt;
 *             &lt;element ref="{http://schemas.xmlsoap.org/ws/2004/09/policy}PolicyReference"/&gt;
 *           &lt;/choice&gt;
 *           &lt;any/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *     &lt;/complexContent&gt;
 *   &lt;/complexType&gt;
 * &lt;/element&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "appliesTo",
    "policyOrPolicyReference",
    "any"
})
@XmlRootElement(name = "PolicyAttachment")
public class PolicyAttachment {

    @XmlElement(name = "AppliesTo", namespace = "http://schemas.xmlsoap.org/ws/2004/09/policy")
    protected AppliesTo appliesTo;
    @XmlElements({
        @XmlElement(name = "Policy", namespace = "http://schemas.xmlsoap.org/ws/2004/09/policy", type = Policy.class),
        @XmlElement(name = "PolicyReference", namespace = "http://schemas.xmlsoap.org/ws/2004/09/policy", type = PolicyReference.class)
    })
    protected List<Object> policyOrPolicyReference;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the appliesTo property.
     * 
     * @return
     *     possible object is
     *     {@link AppliesTo }
     *     
     */
    public AppliesTo getAppliesTo() {
        return appliesTo;
    }

    /**
     * Sets the value of the appliesTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppliesTo }
     *     
     */
    public void setAppliesTo(AppliesTo value) {
        this.appliesTo = value;
    }

    /**
     * Gets the value of the policyOrPolicyReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyOrPolicyReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyOrPolicyReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Policy }
     * {@link PolicyReference }
     * 
     * 
     */
    public List<Object> getPolicyOrPolicyReference() {
        if (policyOrPolicyReference == null) {
            policyOrPolicyReference = new ArrayList<Object>();
        }
        return this.policyOrPolicyReference;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
