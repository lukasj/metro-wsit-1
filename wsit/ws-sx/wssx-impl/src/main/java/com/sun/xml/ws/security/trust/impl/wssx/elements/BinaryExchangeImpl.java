/*
 * Copyright (c) 2010, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

/*
 * $Id: BinaryExchangeImpl.java,v 1.2 2010-10-21 15:37:04 snajper Exp $
 */

package com.sun.xml.ws.security.trust.impl.wssx.elements;

import org.apache.xml.security.exceptions.Base64DecodingException;
import org.apache.xml.security.utils.Base64;
import com.sun.xml.ws.security.trust.elements.BinaryExchange;
import com.sun.xml.ws.security.trust.impl.wssx.bindings.BinaryExchangeType;

/**
 *
 * @author Manveen Kaur (manveen.kaur@sun.com).
 */

public class BinaryExchangeImpl extends BinaryExchangeType implements BinaryExchange {
    
    public BinaryExchangeImpl(String encodingType, String valueType, byte[] rawText) {
        setEncodingType(encodingType);
        setValueType(valueType);
        setRawValue(rawText);
    }
    
    public BinaryExchangeImpl(BinaryExchangeType bcType)throws Exception{
        setEncodingType(bcType.getEncodingType());
        setValueType(bcType.getValueType());
        setValue(bcType.getValue());
    }
    
    public byte[] getRawValue() {
        try {
            return Base64.decode(getTextValue());
        } catch (Base64DecodingException de) {
            throw new RuntimeException("Error while decoding " +
                    de.getMessage());
        }
    }
    
    public String getTextValue() {
        return super.getValue();
    }
    
    public void setTextValue(String encodedText) {
        super.setValue(encodedText);
    }
    
    public void setRawValue(byte[] rawText) {
        super.setValue(Base64.encode(rawText));
    }
    
}
