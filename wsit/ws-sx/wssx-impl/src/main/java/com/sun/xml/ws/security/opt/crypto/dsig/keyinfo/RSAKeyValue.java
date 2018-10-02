/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

/*
 * RSAKeyValue.java
 *
 * Created on January 25, 2006, 6:50 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.sun.xml.ws.security.opt.crypto.dsig.keyinfo;

import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author root
 */
@XmlRootElement(name="RSAKeyValue", namespace = "http://www.w3.org/2000/09/xmldsig#")

public class RSAKeyValue extends com.sun.xml.security.core.dsig.RSAKeyValueType {
    
    /** Creates a new instance of RSAKeyValue */
    public RSAKeyValue() {
    }
    
    public RSAKeyValue(PublicKey pubKey) {        
        setExponent(((RSAPublicKey)pubKey).getPublicExponent().toByteArray());
        setModulus(((RSAPublicKey)pubKey).getModulus().toByteArray());
    }
    
}
