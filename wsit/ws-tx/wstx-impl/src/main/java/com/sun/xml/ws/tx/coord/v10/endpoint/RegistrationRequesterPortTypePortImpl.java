/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package com.sun.xml.ws.tx.coord.v10.endpoint;

import com.sun.xml.ws.developer.MemberSubmissionAddressing;
import com.sun.xml.ws.tx.coord.common.endpoint.RegistrationRequester;
import com.sun.xml.ws.tx.coord.v10.types.RegisterResponseType;
import com.sun.xml.ws.tx.coord.v10.types.RegistrationRequesterPortType;
import com.sun.xml.ws.tx.coord.v10.XmlTypeAdapter;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.WebServiceContext;

@WebService(portName = "RegistrationRequesterPortTypePort", serviceName = "RegistrationService_V10", targetNamespace = "http://schemas.xmlsoap.org/ws/2004/10/wscoor", wsdlLocation = "/wsdls/wsc10/wscoor.wsdl", endpointInterface = "com.sun.xml.ws.tx.coord.v10.types.RegistrationRequesterPortType")
@BindingType("http://schemas.xmlsoap.org/wsdl/soap/http")
@MemberSubmissionAddressing
public class RegistrationRequesterPortTypePortImpl
    implements RegistrationRequesterPortType
{

    @javax.annotation.Resource
    private WebServiceContext m_context;

    public RegistrationRequesterPortTypePortImpl() {
    }

    /**
     * 
     * @param parameters
     */
    public void registerResponse(RegisterResponseType parameters) {
        RegistrationRequester proxy = new RegistrationRequesterImpl(m_context);
        proxy.registerResponse(XmlTypeAdapter.adapt(parameters));
    }

}
