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
 * PolicySuite.java
 * JUnit based test
 *
 * Created on August 24, 2006, 12:28 AM
 */

package com.sun.xml.ws.security.impl.policy;

import junit.framework.*;

/**
 *
 * @author mayank
 */
public class PolicySuite extends TestCase {
    
    public PolicySuite(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    /**
     * suite method automatically generated by JUnit module
     */
    public static Test suite() {
        TestSuite suite = new TestSuite("PolicySuite");
        suite.addTest(com.sun.xml.ws.security.impl.policy.AsymmetricBindingTest.suite());
        suite.addTest(com.sun.xml.ws.security.impl.policy.EncryptedPartsTest.suite());
        suite.addTest(com.sun.xml.ws.security.impl.policy.EncryptedSupportingTokensTest.suite());
        suite.addTest(com.sun.xml.ws.security.impl.policy.EndorsingEncryptedSupportingTokensTest.suite());
        suite.addTest(com.sun.xml.ws.security.impl.policy.EndorsingSupportingTokensTest.suite());   
	suite.addTest(com.sun.xml.ws.security.impl.policy.HttpsTokenTest.suite());
        suite.addTest(com.sun.xml.ws.security.impl.policy.IssuedTokenTest.suite());     
        suite.addTest(com.sun.xml.ws.security.impl.policy.KerberosTokenTest.suite()); 
        suite.addTest(com.sun.xml.ws.security.impl.policy.KeyValueTokenTest.suite()); 
        suite.addTest(com.sun.xml.ws.security.impl.policy.RelTokenTest.suite());      
        suite.addTest(com.sun.xml.ws.security.impl.policy.SamlTokenTest.suite());
        suite.addTest(com.sun.xml.ws.security.impl.policy.SecureConversationTokenTest.suite());
        suite.addTest(com.sun.xml.ws.security.impl.policy.SecurityContextTokenTest.suite());
        suite.addTest(com.sun.xml.ws.security.impl.policy.SecurityPoliciesTest.suite());
        suite.addTest(com.sun.xml.ws.security.impl.policy.SignedElementsTest.suite());
        suite.addTest(com.sun.xml.ws.security.impl.policy.SignedEncryptedSupportingTokensTest.suite());
        suite.addTest(com.sun.xml.ws.security.impl.policy.SignedEndorsingEncryptedSupportingTokensTest.suite());
        suite.addTest(com.sun.xml.ws.security.impl.policy.SignedEndorsingSupportingTokensTest.suite());
        suite.addTest(com.sun.xml.ws.security.impl.policy.SignedPartsTest.suite());
        suite.addTest(com.sun.xml.ws.security.impl.policy.SignedSupportingTokensTest.suite());
        suite.addTest(com.sun.xml.ws.security.impl.policy.SpnegoContextTokenTest.suite());
        suite.addTest(com.sun.xml.ws.security.impl.policy.SupportingTokensTest.suite());
        suite.addTest(com.sun.xml.ws.security.impl.policy.SymmetricBindingTest.suite());
        suite.addTest(com.sun.xml.ws.security.impl.policy.TransportBindingTest.suite());  
        suite.addTest(com.sun.xml.ws.security.impl.policy.UsernameTokenTest.suite());     
        suite.addTest(com.sun.xml.ws.security.impl.policy.X509TokenTest.suite());
        return suite;
    }
    
}
