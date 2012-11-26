/**
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2012 ForgeRock AS Inc. All Rights Reserved
 *
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the License). You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the License at
 * https://opensso.dev.java.net/public/CDDLv1.0.html or
 * opensso/legal/CDDLv1.0.txt
 * See the License for the specific language governing
 * permission and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * Header Notice in each file and include the License file
 * at opensso/legal/CDDLv1.0.txt.
 *
 * If applicable, add the following below the CDDL Header,
 * with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * Portions Copyrighted [2010-2012] [ForgeRock AS]
 *
 */

package com.iplanet.dpro.session.service;

import com.iplanet.am.util.SystemProperties;
import com.sun.identity.coretoken.interfaces.AMTokenRepository;
import com.sun.identity.sm.ldap.CTSPersistentStoreInjector;
import org.junit.Ignore;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.*;

/**
 * AMSessionRepositoryEncodingTest Tester.
 *
 * @author jeff.schenk@forgerock.com
 * @version 10.1
 * @since <pre>Sep 3, 2012</pre>
 */
public class AMSessionRepositoryGetInstanceTest {

    @BeforeClass
    public void before() throws Exception {
    }

    @AfterClass
    public void after() throws Exception {
    }

    @Ignore
    public void testGetInstance() throws Exception {
        // Not working.  As it needs too much environment
        // to properly test, which is unfortunate.

        // Acquire System Properties for minimum environment.
        SystemProperties systemProperties = new SystemProperties();
        AMTokenRepository amTokenRepository = AMTokenRepositoryFactory.getInstance();
        assertNotNull(amTokenRepository);
        assertEquals(new CTSPersistentStoreInjector().getInstanceClassName(), amTokenRepository.getClass().getName());
    }


} 
