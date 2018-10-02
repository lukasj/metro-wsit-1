/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package wsrm.v1_1.invm.wsa_member_submission_support.client;

import junit.framework.TestCase;
import java.io.Closeable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marek Potociar (marek.potociar at sun.com)
 */
public class ClientTest extends TestCase {

    private static final Logger LOGGER = Logger.getLogger(ClientTest.class.getName());

    public void testMemberSubmissionAddressingVersionSupport() throws Exception {
        IPing port = null;
        try {
            PingService service = new PingService();
            port = service.getPingPort();
            port.ping("Hello world!");
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, "WS proxy invocation failed with an unexpected exception.", ex);
            fail(String.format("Test failed with the execption: %s", ex));
        } finally {
            if (port != null) {
                ((Closeable) port).close();
            }
        }
    }
}
