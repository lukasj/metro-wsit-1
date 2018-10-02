/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package com.sun.xml.ws.rx.rm.protocol.wsrm200502;

import com.sun.xml.ws.rx.rm.runtime.sequence.Sequence;
import java.util.Calendar;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
"value"
})
@XmlRootElement(name = "Expires")
public class Expires {

    @XmlValue
    protected Duration value;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    public Expires() {
    }

    public Expires(Duration value) {
        this.value = value;
    }

    public Expires(long duration) {
        setDuration(duration);
    }

    public long getDuration() {
        if (value == null || "PT0S".equals(value.toString())) {
            return Sequence.NO_EXPIRY;
        }
        
        return getValue().getTimeInMillis(Calendar.getInstance());
    }

    public void setDuration(long value) {
        if (value == Sequence.NO_EXPIRY) {
            // TODO implement
        } else {
            // TODO implement
        }
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setValue(Duration value) {
        this.value = value;
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
