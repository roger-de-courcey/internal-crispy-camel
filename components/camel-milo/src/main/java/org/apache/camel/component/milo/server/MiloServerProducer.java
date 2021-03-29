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
package org.apache.camel.component.milo.server;

import org.apache.camel.Exchange;
import org.apache.camel.component.milo.server.internal.CamelServerItem;
import org.apache.camel.support.DefaultProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MiloServerProducer extends DefaultProducer {

    private static final Logger LOG = LoggerFactory.getLogger(MiloServerProducer.class);

    private CamelServerItem item;

    public MiloServerProducer(final MiloServerEndpoint endpoint) {
        super(endpoint);
    }

    @Override
    public MiloServerEndpoint getEndpoint() {
        return (MiloServerEndpoint) super.getEndpoint();
    }

    @Override
    protected void doStart() throws Exception {
        super.doStart();
        this.item = getEndpoint().getItem();
    }

    @Override
    public void process(final Exchange exchange) throws Exception {
        final Object value = exchange.getIn().getBody();

        LOG.trace("Update item value - {} = {}", this.item, value);

        this.item.update(value);
    }
}
