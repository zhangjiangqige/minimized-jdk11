/*
 * Copyright (c) 2000, 2017, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package com.sun.net.ssl;

import org.checkerframework.framework.qual.AnnotatedFor;
import java.security.KeyManagementException;
import java.security.PrivateKey;
import java.security.Principal;
import java.security.cert.X509Certificate;

@AnnotatedFor("nullness")
@Deprecated()
public interface X509KeyManager extends KeyManager {

    public String[] getClientAliases(String keyType, Principal[] issuers);

    public String chooseClientAlias(String keyType, Principal[] issuers);

    public String[] getServerAliases(String keyType, Principal[] issuers);

    public String chooseServerAlias(String keyType, Principal[] issuers);

    public X509Certificate[] getCertificateChain(String alias);

    public PrivateKey getPrivateKey(String alias);
}
