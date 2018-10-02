/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package wsrm.v1_0.persistent.secureroundtrip.server;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface="wsrm.v1_0.persistent.secureroundtrip.server.IPingService")
public class IPingImpl {

    private static final Logger LOGGER = Logger.getLogger(IPingImpl.class.getName());

    /**
     * @param String
     */
    @WebMethod
    public String echo(String message) {
        LOGGER.log(Level.ALL, String.format("On the server side received '%s'", message));
        return message;
    }
}
