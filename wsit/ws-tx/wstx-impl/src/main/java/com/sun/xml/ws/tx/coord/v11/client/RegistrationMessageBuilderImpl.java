/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package com.sun.xml.ws.tx.coord.v11.client;

import com.sun.xml.ws.tx.at.WSATConstants;
import com.sun.xml.ws.tx.at.WSATHelper;
import com.sun.xml.ws.tx.coord.common.EndpointReferenceBuilder;
import com.sun.xml.ws.tx.coord.common.client.RegistrationMessageBuilder;
import com.sun.xml.ws.tx.coord.common.types.BaseRegisterResponseType;
import com.sun.xml.ws.tx.coord.common.types.BaseRegisterType;
import com.sun.xml.ws.tx.coord.v11.XmlTypeAdapter;




public class RegistrationMessageBuilderImpl extends RegistrationMessageBuilder {

    public RegistrationMessageBuilderImpl() {
    }

    public RegistrationMessageBuilder durable(boolean durable) {
        super.durable(durable);
        if (protocolIdentifier == null) {
            protocolIdentifier(durable ?
                    WSATConstants.WSAT11_DURABLE_2PC :
                    WSATConstants.WSAT11_VOLATILE_2PC);
        }
        return this;
    }

    @Override
    protected BaseRegisterType newRegistrationRequest() {
        return XmlTypeAdapter.newRegisterType();
    }

    protected String getDefaultParticipantAddress() {
        return WSATHelper.V11.getParticipantAddress();
    }

    @Override
    protected BaseRegisterResponseType buildRegistrationResponse() {
        return XmlTypeAdapter.newRegisterResponseType();
    }

    @Override
    protected EndpointReferenceBuilder getEndpointReferenceBuilder() {
        return EndpointReferenceBuilder.W3C();
    }
}
