/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.kinesis;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Kinesis2EndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Kinesis2Endpoint target = (Kinesis2Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": target.getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazonkinesisclient":
        case "amazonKinesisClient": target.getConfiguration().setAmazonKinesisClient(property(camelContext, software.amazon.awssdk.services.kinesis.KinesisClient.class, value)); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "cborenabled":
        case "cborEnabled": target.getConfiguration().setCborEnabled(property(camelContext, boolean.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "iteratortype":
        case "iteratorType": target.getConfiguration().setIteratorType(property(camelContext, software.amazon.awssdk.services.kinesis.model.ShardIteratorType.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxresultsperrequest":
        case "maxResultsPerRequest": target.getConfiguration().setMaxResultsPerRequest(property(camelContext, int.class, value)); return true;
        case "overrideendpoint":
        case "overrideEndpoint": target.getConfiguration().setOverrideEndpoint(property(camelContext, boolean.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": target.getConfiguration().setProxyProtocol(property(camelContext, software.amazon.awssdk.core.Protocol.class, value)); return true;
        case "region": target.getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.Object.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "secretkey":
        case "secretKey": target.getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "sequencenumber":
        case "sequenceNumber": target.getConfiguration().setSequenceNumber(property(camelContext, java.lang.String.class, value)); return true;
        case "shardclosed":
        case "shardClosed": target.getConfiguration().setShardClosed(property(camelContext, org.apache.camel.component.aws2.kinesis.Kinesis2ShardClosedStrategyEnum.class, value)); return true;
        case "shardid":
        case "shardId": target.getConfiguration().setShardId(property(camelContext, java.lang.String.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "trustallcertificates":
        case "trustAllCertificates": target.getConfiguration().setTrustAllCertificates(property(camelContext, boolean.class, value)); return true;
        case "uriendpointoverride":
        case "uriEndpointOverride": target.getConfiguration().setUriEndpointOverride(property(camelContext, java.lang.String.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public String[] getAutowiredNames() {
        return new String[]{"amazonKinesisClient"};
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return java.lang.String.class;
        case "amazonkinesisclient":
        case "amazonKinesisClient": return software.amazon.awssdk.services.kinesis.KinesisClient.class;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return int.class;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return int.class;
        case "backoffmultiplier":
        case "backoffMultiplier": return int.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "cborenabled":
        case "cborEnabled": return boolean.class;
        case "delay": return long.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "greedy": return boolean.class;
        case "initialdelay":
        case "initialDelay": return long.class;
        case "iteratortype":
        case "iteratorType": return software.amazon.awssdk.services.kinesis.model.ShardIteratorType.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "maxresultsperrequest":
        case "maxResultsPerRequest": return int.class;
        case "overrideendpoint":
        case "overrideEndpoint": return boolean.class;
        case "pollstrategy":
        case "pollStrategy": return org.apache.camel.spi.PollingConsumerPollStrategy.class;
        case "proxyhost":
        case "proxyHost": return java.lang.String.class;
        case "proxyport":
        case "proxyPort": return java.lang.Integer.class;
        case "proxyprotocol":
        case "proxyProtocol": return software.amazon.awssdk.core.Protocol.class;
        case "region": return java.lang.String.class;
        case "repeatcount":
        case "repeatCount": return long.class;
        case "runlogginglevel":
        case "runLoggingLevel": return org.apache.camel.LoggingLevel.class;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return java.util.concurrent.ScheduledExecutorService.class;
        case "scheduler": return java.lang.Object.class;
        case "schedulerproperties":
        case "schedulerProperties": return java.util.Map.class;
        case "secretkey":
        case "secretKey": return java.lang.String.class;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return boolean.class;
        case "sequencenumber":
        case "sequenceNumber": return java.lang.String.class;
        case "shardclosed":
        case "shardClosed": return org.apache.camel.component.aws2.kinesis.Kinesis2ShardClosedStrategyEnum.class;
        case "shardid":
        case "shardId": return java.lang.String.class;
        case "startscheduler":
        case "startScheduler": return boolean.class;
        case "timeunit":
        case "timeUnit": return java.util.concurrent.TimeUnit.class;
        case "trustallcertificates":
        case "trustAllCertificates": return boolean.class;
        case "uriendpointoverride":
        case "uriEndpointOverride": return java.lang.String.class;
        case "usefixeddelay":
        case "useFixedDelay": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        Kinesis2Endpoint target = (Kinesis2Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return target.getConfiguration().getAccessKey();
        case "amazonkinesisclient":
        case "amazonKinesisClient": return target.getConfiguration().getAmazonKinesisClient();
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return target.getBackoffErrorThreshold();
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return target.getBackoffIdleThreshold();
        case "backoffmultiplier":
        case "backoffMultiplier": return target.getBackoffMultiplier();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "cborenabled":
        case "cborEnabled": return target.getConfiguration().isCborEnabled();
        case "delay": return target.getDelay();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "greedy": return target.isGreedy();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "iteratortype":
        case "iteratorType": return target.getConfiguration().getIteratorType();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxresultsperrequest":
        case "maxResultsPerRequest": return target.getConfiguration().getMaxResultsPerRequest();
        case "overrideendpoint":
        case "overrideEndpoint": return target.getConfiguration().isOverrideEndpoint();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "proxyhost":
        case "proxyHost": return target.getConfiguration().getProxyHost();
        case "proxyport":
        case "proxyPort": return target.getConfiguration().getProxyPort();
        case "proxyprotocol":
        case "proxyProtocol": return target.getConfiguration().getProxyProtocol();
        case "region": return target.getConfiguration().getRegion();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "secretkey":
        case "secretKey": return target.getConfiguration().getSecretKey();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "sequencenumber":
        case "sequenceNumber": return target.getConfiguration().getSequenceNumber();
        case "shardclosed":
        case "shardClosed": return target.getConfiguration().getShardClosed();
        case "shardid":
        case "shardId": return target.getConfiguration().getShardId();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "trustallcertificates":
        case "trustAllCertificates": return target.getConfiguration().isTrustAllCertificates();
        case "uriendpointoverride":
        case "uriEndpointOverride": return target.getConfiguration().getUriEndpointOverride();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "schedulerproperties":
        case "schedulerProperties": return java.lang.Object.class;
        default: return null;
        }
    }
}

