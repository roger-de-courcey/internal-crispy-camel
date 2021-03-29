/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.camel.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public final class SensitiveUtils {
    private static final Set<String> SENSITIVE_KEYS = new HashSet<>(
            Arrays.asList(
                    // Generated by camel build tools - do NOT edit this list!
                    // SENSITIVE-KEYS: START
                    "accesskey",
                    "accesstoken",
                    "accesstokensecret",
                    "accountsid",
                    "acltoken",
                    "authorizationtoken",
                    "blobaccesskey",
                    "blobstoragesharedkeycredential",
                    "certresourcepassword",
                    "clientsecret",
                    "connectionstring",
                    "consumerkey",
                    "consumersecret",
                    "emailaddress",
                    "fulltokenid",
                    "httpproxypassword",
                    "keypassword",
                    "keystore",
                    "keystorepassword",
                    "login",
                    "oauthaccesstoken",
                    "oauthappid",
                    "oauthappsecret",
                    "oauthclientid",
                    "oauthclientsecret",
                    "oauthtoken",
                    "oauthtokenurl",
                    "p12filename",
                    "passcode",
                    "passphrase",
                    "password",
                    "privatekey",
                    "privatekeyfile",
                    "privatekeyname",
                    "privatekeypassword",
                    "proxyauthpassword",
                    "proxyauthusername",
                    "proxypassword",
                    "proxyuser",
                    "publickeyid",
                    "queueownerawsaccountid",
                    "refreshtoken",
                    "sasljaasconfig",
                    "secretkey",
                    "securerandom",
                    "sharedaccesskey",
                    "sslkeypassword",
                    "sslkeystore",
                    "sslkeystorepassword",
                    "sslpassword",
                    "ssltruststorepassword",
                    "systemid",
                    "token",
                    "user",
                    "userauthenticationcredentials",
                    "username",
                    "userpassword",
                    "verificationcode",
                    "zookeeperpassword"
            // SENSITIVE-KEYS: END
            ));

    private SensitiveUtils() {
    }

    /**
     * Whether the given configuration property contains a sensitive a sensitive key (such as password, accesstoken,
     * etc.)
     *
     * @param  text the configuration property
     * @return      true if sensitive, false otherwise
     */
    public static boolean containsSensitive(String text) {
        int lastPeriod = text.lastIndexOf('.');
        if (lastPeriod >= 0) {
            text = text.substring(lastPeriod + 1);
        }
        text = text.toLowerCase(Locale.ENGLISH);
        text = StringHelper.replaceAll(text, "-", "");
        return SENSITIVE_KEYS.contains(text);
    }
}
