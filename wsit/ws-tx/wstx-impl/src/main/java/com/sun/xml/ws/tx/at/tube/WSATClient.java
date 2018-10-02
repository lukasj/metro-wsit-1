/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package com.sun.xml.ws.tx.at.tube;

import com.sun.xml.ws.api.message.Header;

import java.util.List;
import java.util.Map;

/**
 * User: paulparkinson
 * Date: Jan 19, 2010
 * Time: 12:19:26 PM
 */
public interface WSATClient {

    List<Header> doHandleRequest(TransactionalAttribute transactionalAttribute, Map<String, Object> map);

    boolean doHandleResponse(Map<String, Object> map);

    void doHandleException(Map<String, Object> map);
}
