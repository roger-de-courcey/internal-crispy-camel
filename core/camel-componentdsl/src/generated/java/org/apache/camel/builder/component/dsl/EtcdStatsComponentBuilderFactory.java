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
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.etcd.EtcdStatsComponent;

/**
 * Access etcd cluster statistcs.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface EtcdStatsComponentBuilderFactory {

    /**
     * Etcd Stats (camel-etcd)
     * Access etcd cluster statistcs.
     * 
     * Category: clustering,database
     * Since: 2.18
     * Maven coordinates: org.apache.camel:camel-etcd
     * 
     * @return the dsl builder
     */
    static EtcdStatsComponentBuilder etcdStats() {
        return new EtcdStatsComponentBuilderImpl();
    }

    /**
     * Builder for the Etcd Stats component.
     */
    interface EtcdStatsComponentBuilder
            extends
                ComponentBuilder<EtcdStatsComponent> {
        /**
         * Component configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.etcd.EtcdConfiguration&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default EtcdStatsComponentBuilder configuration(
                org.apache.camel.component.etcd.EtcdConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * To apply an action recursively.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param recursive the value to set
         * @return the dsl builder
         */
        default EtcdStatsComponentBuilder recursive(boolean recursive) {
            doSetProperty("recursive", recursive);
            return this;
        }
        /**
         * The path to look for for service discovery.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: /services/
         * Group: common
         * 
         * @param servicePath the value to set
         * @return the dsl builder
         */
        default EtcdStatsComponentBuilder servicePath(
                java.lang.String servicePath) {
            doSetProperty("servicePath", servicePath);
            return this;
        }
        /**
         * To set the maximum time an action could take to complete.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default EtcdStatsComponentBuilder timeout(java.lang.Long timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * To set the URIs the client connects.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: http://localhost:2379,http://localhost:4001
         * Group: common
         * 
         * @param uris the value to set
         * @return the dsl builder
         */
        default EtcdStatsComponentBuilder uris(java.lang.String uris) {
            doSetProperty("uris", uris);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default EtcdStatsComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * To send an empty message in case of timeout watching for a key.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param sendEmptyExchangeOnTimeout the value to set
         * @return the dsl builder
         */
        default EtcdStatsComponentBuilder sendEmptyExchangeOnTimeout(
                boolean sendEmptyExchangeOnTimeout) {
            doSetProperty("sendEmptyExchangeOnTimeout", sendEmptyExchangeOnTimeout);
            return this;
        }
        /**
         * The index to watch from.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 0
         * Group: consumer (advanced)
         * 
         * @param fromIndex the value to set
         * @return the dsl builder
         */
        default EtcdStatsComponentBuilder fromIndex(long fromIndex) {
            doSetProperty("fromIndex", fromIndex);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default EtcdStatsComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * To set the lifespan of a key in milliseconds.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param timeToLive the value to set
         * @return the dsl builder
         */
        default EtcdStatsComponentBuilder timeToLive(
                java.lang.Integer timeToLive) {
            doSetProperty("timeToLive", timeToLive);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default EtcdStatsComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * The password to use for basic authentication.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default EtcdStatsComponentBuilder password(java.lang.String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.support.jsse.SSLContextParameters&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslContextParameters the value to set
         * @return the dsl builder
         */
        default EtcdStatsComponentBuilder sslContextParameters(
                org.apache.camel.support.jsse.SSLContextParameters sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * Enable usage of global SSL context parameters.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useGlobalSslContextParameters the value to set
         * @return the dsl builder
         */
        default EtcdStatsComponentBuilder useGlobalSslContextParameters(
                boolean useGlobalSslContextParameters) {
            doSetProperty("useGlobalSslContextParameters", useGlobalSslContextParameters);
            return this;
        }
        /**
         * The user name to use for basic authentication.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param userName the value to set
         * @return the dsl builder
         */
        default EtcdStatsComponentBuilder userName(java.lang.String userName) {
            doSetProperty("userName", userName);
            return this;
        }
    }

    class EtcdStatsComponentBuilderImpl
            extends
                AbstractComponentBuilder<EtcdStatsComponent>
            implements
                EtcdStatsComponentBuilder {
        @Override
        protected EtcdStatsComponent buildConcreteComponent() {
            return new EtcdStatsComponent();
        }
        private org.apache.camel.component.etcd.EtcdConfiguration getOrCreateConfiguration(
                org.apache.camel.component.etcd.EtcdStatsComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.etcd.EtcdConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "configuration": ((EtcdStatsComponent) component).setConfiguration((org.apache.camel.component.etcd.EtcdConfiguration) value); return true;
            case "recursive": getOrCreateConfiguration((EtcdStatsComponent) component).setRecursive((boolean) value); return true;
            case "servicePath": getOrCreateConfiguration((EtcdStatsComponent) component).setServicePath((java.lang.String) value); return true;
            case "timeout": getOrCreateConfiguration((EtcdStatsComponent) component).setTimeout((java.lang.Long) value); return true;
            case "uris": getOrCreateConfiguration((EtcdStatsComponent) component).setUris((java.lang.String) value); return true;
            case "bridgeErrorHandler": ((EtcdStatsComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "sendEmptyExchangeOnTimeout": getOrCreateConfiguration((EtcdStatsComponent) component).setSendEmptyExchangeOnTimeout((boolean) value); return true;
            case "fromIndex": getOrCreateConfiguration((EtcdStatsComponent) component).setFromIndex((long) value); return true;
            case "lazyStartProducer": ((EtcdStatsComponent) component).setLazyStartProducer((boolean) value); return true;
            case "timeToLive": getOrCreateConfiguration((EtcdStatsComponent) component).setTimeToLive((java.lang.Integer) value); return true;
            case "autowiredEnabled": ((EtcdStatsComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "password": getOrCreateConfiguration((EtcdStatsComponent) component).setPassword((java.lang.String) value); return true;
            case "sslContextParameters": getOrCreateConfiguration((EtcdStatsComponent) component).setSslContextParameters((org.apache.camel.support.jsse.SSLContextParameters) value); return true;
            case "useGlobalSslContextParameters": ((EtcdStatsComponent) component).setUseGlobalSslContextParameters((boolean) value); return true;
            case "userName": getOrCreateConfiguration((EtcdStatsComponent) component).setUserName((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}