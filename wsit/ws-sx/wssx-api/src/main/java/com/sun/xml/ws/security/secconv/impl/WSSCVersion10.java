/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package com.sun.xml.ws.security.secconv.impl;

import com.sun.xml.ws.security.secconv.WSSCVersion;

/**
 *
 * @author Shyam Rao
 */
public class WSSCVersion10 extends WSSCVersion{

   private String nsURI;
   private String trustNSURI;

   public WSSCVersion10(){
        nsURI = "http://schemas.xmlsoap.org/ws/2005/02/sc";
        trustNSURI = "http://schemas.xmlsoap.org/ws/2005/02/trust";
   }
    public String getNamespaceURI(){
        return nsURI;
    }
    
    public String getSCTTokenTypeURI(){
        return nsURI + "/sct";
    }
    
    public String getDKTokenTypeURI(){
        return nsURI + "/dk";
    }

    public String getSCTRequestAction(){
        return trustNSURI + "/RST/SCT";
    }

    public String getSCTResponseAction(){
        return trustNSURI + "/RSTR/SCT";
    }    

    public String getSCTRenewRequestAction(){
        return trustNSURI + "/RST/SCT/Renew";
    }
    
    public String getSCTRenewResponseAction(){
        return trustNSURI + "/RSTR/SCT/Renew";
    }

    public String getSCTCancelRequestAction(){
        return trustNSURI + "/RST/SCT/Cancel";
    }

    public String getSCTCancelResponseAction(){
        return trustNSURI + "/RSTR/SCT/Cancel";
    }
                   
}
