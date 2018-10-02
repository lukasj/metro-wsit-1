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
 * DSAKeyValue.java
 *
 * Created on January 26, 2006, 1:52 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.sun.xml.ws.security.opt.crypto.dsig.keyinfo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Abhijit Das
 */
@XmlRootElement(name="DSAKeyValue", namespace = "http://www.w3.org/2000/09/xmldsig#")
public class DSAKeyValue extends com.sun.xml.security.core.dsig.DSAKeyValueType {
    
    /** Creates a new instance of DSAKeyValue */
    public DSAKeyValue() {
    }
    
}
