/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jcache;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class JCacheEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":cacheName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(24);
        props.add("cacheWriterFactory");
        props.add("expiryPolicyFactory");
        props.add("writeThrough");
        props.add("filteredEvents");
        props.add("statisticsEnabled");
        props.add("synchronous");
        props.add("exchangePattern");
        props.add("lookupProviders");
        props.add("storeByValue");
        props.add("cachingProvider");
        props.add("configurationUri");
        props.add("cacheConfigurationProperties");
        props.add("cacheConfiguration");
        props.add("eventFilters");
        props.add("lazyStartProducer");
        props.add("cacheName");
        props.add("bridgeErrorHandler");
        props.add("managementEnabled");
        props.add("oldValueRequired");
        props.add("cacheLoaderFactory");
        props.add("action");
        props.add("createCacheIfNotExists");
        props.add("readThrough");
        props.add("exceptionHandler");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "jcache".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "cacheName", null, true, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

