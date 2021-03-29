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
import org.apache.camel.component.hazelcast.atomicnumber.HazelcastAtomicnumberComponent;

/**
 * Increment, decrement, set, etc. Hazelcast atomic number (a grid wide number).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface HazelcastAtomicvalueComponentBuilderFactory {

    /**
     * Hazelcast Atomic Number (camel-hazelcast)
     * Increment, decrement, set, etc. Hazelcast atomic number (a grid wide
     * number).
     * 
     * Category: cache,datagrid
     * Since: 2.7
     * Maven coordinates: org.apache.camel:camel-hazelcast
     * 
     * @return the dsl builder
     */
    static HazelcastAtomicvalueComponentBuilder hazelcastAtomicvalue() {
        return new HazelcastAtomicvalueComponentBuilderImpl();
    }

    /**
     * Builder for the Hazelcast Atomic Number component.
     */
    interface HazelcastAtomicvalueComponentBuilder
            extends
                ComponentBuilder<HazelcastAtomicnumberComponent> {
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
        default HazelcastAtomicvalueComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
        default HazelcastAtomicvalueComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint. If you don't specify the instance reference, camel use the
         * default hazelcast instance from the camel-hazelcast instance.
         * 
         * The option is a:
         * &lt;code&gt;com.hazelcast.core.HazelcastInstance&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param hazelcastInstance the value to set
         * @return the dsl builder
         */
        default HazelcastAtomicvalueComponentBuilder hazelcastInstance(
                com.hazelcast.core.HazelcastInstance hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast mode reference which kind of instance should be used.
         * If you don't specify the mode, then the node mode will be the
         * default.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: node
         * Group: advanced
         * 
         * @param hazelcastMode the value to set
         * @return the dsl builder
         */
        default HazelcastAtomicvalueComponentBuilder hazelcastMode(
                java.lang.String hazelcastMode) {
            doSetProperty("hazelcastMode", hazelcastMode);
            return this;
        }
    }

    class HazelcastAtomicvalueComponentBuilderImpl
            extends
                AbstractComponentBuilder<HazelcastAtomicnumberComponent>
            implements
                HazelcastAtomicvalueComponentBuilder {
        @Override
        protected HazelcastAtomicnumberComponent buildConcreteComponent() {
            return new HazelcastAtomicnumberComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "lazyStartProducer": ((HazelcastAtomicnumberComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((HazelcastAtomicnumberComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "hazelcastInstance": ((HazelcastAtomicnumberComponent) component).setHazelcastInstance((com.hazelcast.core.HazelcastInstance) value); return true;
            case "hazelcastMode": ((HazelcastAtomicnumberComponent) component).setHazelcastMode((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}