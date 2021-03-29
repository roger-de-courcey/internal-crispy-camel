/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.debezium;

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
public class DebeziumSqlserverEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":name";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(69);
        props.add("maxBatchSize");
        props.add("internalKeyConverter");
        props.add("snapshotDelayMs");
        props.add("snapshotIsolationMode");
        props.add("offsetStorageTopic");
        props.add("bridgeErrorHandler");
        props.add("datatypePropagateSourceType");
        props.add("provideTransactionMetadata");
        props.add("converters");
        props.add("tombstonesOnDelete");
        props.add("databaseHistoryKafkaBootstrapServers");
        props.add("heartbeatIntervalMs");
        props.add("heartbeatTopicsPrefix");
        props.add("databaseHistoryKafkaRecoveryPollIntervalMs");
        props.add("decimalHandlingMode");
        props.add("skippedOperations");
        props.add("sourceStructVersion");
        props.add("databaseServerTimezone");
        props.add("binaryHandlingMode");
        props.add("databaseHostname");
        props.add("eventProcessingFailureHandlingMode");
        props.add("offsetCommitTimeoutMs");
        props.add("snapshotSelectStatementOverrides");
        props.add("offsetFlushIntervalMs");
        props.add("offsetStorageFileName");
        props.add("columnBlacklist");
        props.add("name");
        props.add("snapshotFetchSize");
        props.add("offsetStoragePartitions");
        props.add("additionalProperties");
        props.add("offsetStorageReplicationFactor");
        props.add("exceptionHandler");
        props.add("sourceTimestampMode");
        props.add("databasePort");
        props.add("databaseUser");
        props.add("snapshotIncludeCollectionList");
        props.add("databaseHistoryFileFilename");
        props.add("databaseHistory");
        props.add("columnPropagateSourceType");
        props.add("offsetStorage");
        props.add("includeSchemaChanges");
        props.add("internalValueConverter");
        props.add("snapshotMaxThreads");
        props.add("retriableRestartConnectorWaitMs");
        props.add("maxQueueSize");
        props.add("messageKeyColumns");
        props.add("timePrecisionMode");
        props.add("columnWhitelist");
        props.add("pollIntervalMs");
        props.add("sanitizeFieldNames");
        props.add("databaseHistoryKafkaTopic");
        props.add("tableWhitelist");
        props.add("tableIgnoreBuiltin");
        props.add("exchangePattern");
        props.add("databaseInstance");
        props.add("databaseServerName");
        props.add("tableBlacklist");
        props.add("queryFetchSize");
        props.add("snapshotMode");
        props.add("maxQueueSizeInBytes");
        props.add("snapshotLockTimeoutMs");
        props.add("tableExcludeList");
        props.add("offsetCommitPolicy");
        props.add("tableIncludeList");
        props.add("columnExcludeList");
        props.add("columnIncludeList");
        props.add("databasePassword");
        props.add("databaseDbname");
        props.add("databaseHistoryKafkaRecoveryAttempts");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "debezium-sqlserver".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "name", null, true, copy);
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

