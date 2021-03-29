/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.impl;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.ExtendedCamelContext;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ExtendedCamelContextConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.ExtendedCamelContext target = (org.apache.camel.ExtendedCamelContext) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowuseoriginalmessage":
        case "AllowUseOriginalMessage": target.setAllowUseOriginalMessage(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "annotationbasedprocessorfactory":
        case "AnnotationBasedProcessorFactory": target.setAnnotationBasedProcessorFactory(property(camelContext, org.apache.camel.spi.AnnotationBasedProcessorFactory.class, value)); return true;
        case "applicationcontextclassloader":
        case "ApplicationContextClassLoader": target.setApplicationContextClassLoader(property(camelContext, java.lang.ClassLoader.class, value)); return true;
        case "asyncprocessorawaitmanager":
        case "AsyncProcessorAwaitManager": target.setAsyncProcessorAwaitManager(property(camelContext, org.apache.camel.spi.AsyncProcessorAwaitManager.class, value)); return true;
        case "autostartup":
        case "AutoStartup": target.setAutoStartup(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "autowiredenabled":
        case "AutowiredEnabled": target.setAutowiredEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "backlogtracing":
        case "BacklogTracing": target.setBacklogTracing(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "beanintrospection":
        case "BeanIntrospection": target.setBeanIntrospection(property(camelContext, org.apache.camel.spi.BeanIntrospection.class, value)); return true;
        case "bootstrapconfigurerresolver":
        case "BootstrapConfigurerResolver": target.setBootstrapConfigurerResolver(property(camelContext, org.apache.camel.spi.ConfigurerResolver.class, value)); return true;
        case "bootstrapfactoryfinder":
        case "BootstrapFactoryFinder": target.setBootstrapFactoryFinder(property(camelContext, org.apache.camel.spi.FactoryFinder.class, value)); return true;
        case "caseinsensitiveheaders":
        case "CaseInsensitiveHeaders": target.setCaseInsensitiveHeaders(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "classresolver":
        case "ClassResolver": target.setClassResolver(property(camelContext, org.apache.camel.spi.ClassResolver.class, value)); return true;
        case "componentnameresolver":
        case "ComponentNameResolver": target.setComponentNameResolver(property(camelContext, org.apache.camel.spi.ComponentNameResolver.class, value)); return true;
        case "componentresolver":
        case "ComponentResolver": target.setComponentResolver(property(camelContext, org.apache.camel.spi.ComponentResolver.class, value)); return true;
        case "configurerresolver":
        case "ConfigurerResolver": target.setConfigurerResolver(property(camelContext, org.apache.camel.spi.ConfigurerResolver.class, value)); return true;
        case "dataformatresolver":
        case "DataFormatResolver": target.setDataFormatResolver(property(camelContext, org.apache.camel.spi.DataFormatResolver.class, value)); return true;
        case "debugger":
        case "Debugger": target.setDebugger(property(camelContext, org.apache.camel.spi.Debugger.class, value)); return true;
        case "debugging":
        case "Debugging": target.setDebugging(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "deferservicefactory":
        case "DeferServiceFactory": target.setDeferServiceFactory(property(camelContext, org.apache.camel.spi.DeferServiceFactory.class, value)); return true;
        case "delayer":
        case "Delayer": target.setDelayer(property(camelContext, java.lang.Long.class, value)); return true;
        case "errorhandlerfactory":
        case "ErrorHandlerFactory": target.setErrorHandlerFactory(property(camelContext, org.apache.camel.ErrorHandlerFactory.class, value)); return true;
        case "eventnotificationapplicable":
        case "EventNotificationApplicable": target.setEventNotificationApplicable(property(camelContext, boolean.class, value)); return true;
        case "exchangefactory":
        case "ExchangeFactory": target.setExchangeFactory(property(camelContext, org.apache.camel.spi.ExchangeFactory.class, value)); return true;
        case "exchangefactorymanager":
        case "ExchangeFactoryManager": target.setExchangeFactoryManager(property(camelContext, org.apache.camel.spi.ExchangeFactoryManager.class, value)); return true;
        case "executorservicemanager":
        case "ExecutorServiceManager": target.setExecutorServiceManager(property(camelContext, org.apache.camel.spi.ExecutorServiceManager.class, value)); return true;
        case "factoryfinderresolver":
        case "FactoryFinderResolver": target.setFactoryFinderResolver(property(camelContext, org.apache.camel.spi.FactoryFinderResolver.class, value)); return true;
        case "globaloptions":
        case "GlobalOptions": target.setGlobalOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "headersmapfactory":
        case "HeadersMapFactory": target.setHeadersMapFactory(property(camelContext, org.apache.camel.spi.HeadersMapFactory.class, value)); return true;
        case "inflightrepository":
        case "InflightRepository": target.setInflightRepository(property(camelContext, org.apache.camel.spi.InflightRepository.class, value)); return true;
        case "injector":
        case "Injector": target.setInjector(property(camelContext, org.apache.camel.spi.Injector.class, value)); return true;
        case "interceptendpointfactory":
        case "InterceptEndpointFactory": target.setInterceptEndpointFactory(property(camelContext, org.apache.camel.spi.InterceptEndpointFactory.class, value)); return true;
        case "internalprocessorfactory":
        case "InternalProcessorFactory": target.setInternalProcessorFactory(property(camelContext, org.apache.camel.spi.InternalProcessorFactory.class, value)); return true;
        case "languageresolver":
        case "LanguageResolver": target.setLanguageResolver(property(camelContext, org.apache.camel.spi.LanguageResolver.class, value)); return true;
        case "lightweight":
        case "Lightweight": target.setLightweight(property(camelContext, boolean.class, value)); return true;
        case "loadtypeconverters":
        case "LoadTypeConverters": target.setLoadTypeConverters(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "logexhaustedmessagebody":
        case "LogExhaustedMessageBody": target.setLogExhaustedMessageBody(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "logmask":
        case "LogMask": target.setLogMask(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "mdcloggingkeyspattern":
        case "MDCLoggingKeysPattern": target.setMDCLoggingKeysPattern(property(camelContext, java.lang.String.class, value)); return true;
        case "managementname":
        case "ManagementName": target.setManagementName(property(camelContext, java.lang.String.class, value)); return true;
        case "managementnamestrategy":
        case "ManagementNameStrategy": target.setManagementNameStrategy(property(camelContext, org.apache.camel.spi.ManagementNameStrategy.class, value)); return true;
        case "managementstrategy":
        case "ManagementStrategy": target.setManagementStrategy(property(camelContext, org.apache.camel.spi.ManagementStrategy.class, value)); return true;
        case "messagehistory":
        case "MessageHistory": target.setMessageHistory(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "messagehistoryfactory":
        case "MessageHistoryFactory": target.setMessageHistoryFactory(property(camelContext, org.apache.camel.spi.MessageHistoryFactory.class, value)); return true;
        case "modeljaxbcontextfactory":
        case "ModelJAXBContextFactory": target.setModelJAXBContextFactory(property(camelContext, org.apache.camel.spi.ModelJAXBContextFactory.class, value)); return true;
        case "modeltoxmldumper":
        case "ModelToXMLDumper": target.setModelToXMLDumper(property(camelContext, org.apache.camel.spi.ModelToXMLDumper.class, value)); return true;
        case "name":
        case "Name": target.setName(property(camelContext, java.lang.String.class, value)); return true;
        case "namestrategy":
        case "NameStrategy": target.setNameStrategy(property(camelContext, org.apache.camel.spi.CamelContextNameStrategy.class, value)); return true;
        case "nodeidfactory":
        case "NodeIdFactory": target.setNodeIdFactory(property(camelContext, org.apache.camel.spi.NodeIdFactory.class, value)); return true;
        case "packagescanclassresolver":
        case "PackageScanClassResolver": target.setPackageScanClassResolver(property(camelContext, org.apache.camel.spi.PackageScanClassResolver.class, value)); return true;
        case "packagescanresourceresolver":
        case "PackageScanResourceResolver": target.setPackageScanResourceResolver(property(camelContext, org.apache.camel.spi.PackageScanResourceResolver.class, value)); return true;
        case "processorfactory":
        case "ProcessorFactory": target.setProcessorFactory(property(camelContext, org.apache.camel.spi.ProcessorFactory.class, value)); return true;
        case "propertiescomponent":
        case "PropertiesComponent": target.setPropertiesComponent(property(camelContext, org.apache.camel.spi.PropertiesComponent.class, value)); return true;
        case "reactiveexecutor":
        case "ReactiveExecutor": target.setReactiveExecutor(property(camelContext, org.apache.camel.spi.ReactiveExecutor.class, value)); return true;
        case "registry":
        case "Registry": target.setRegistry(property(camelContext, org.apache.camel.spi.Registry.class, value)); return true;
        case "resourceloader":
        case "ResourceLoader": target.setResourceLoader(property(camelContext, org.apache.camel.spi.ResourceLoader.class, value)); return true;
        case "restbindingjaxbdataformatfactory":
        case "RestBindingJaxbDataFormatFactory": target.setRestBindingJaxbDataFormatFactory(property(camelContext, org.apache.camel.spi.RestBindingJaxbDataFormatFactory.class, value)); return true;
        case "restconfiguration":
        case "RestConfiguration": target.setRestConfiguration(property(camelContext, org.apache.camel.spi.RestConfiguration.class, value)); return true;
        case "restregistry":
        case "RestRegistry": target.setRestRegistry(property(camelContext, org.apache.camel.spi.RestRegistry.class, value)); return true;
        case "routecontroller":
        case "RouteController": target.setRouteController(property(camelContext, org.apache.camel.spi.RouteController.class, value)); return true;
        case "routefactory":
        case "RouteFactory": target.setRouteFactory(property(camelContext, org.apache.camel.spi.RouteFactory.class, value)); return true;
        case "routesloader":
        case "RoutesLoader": target.setRoutesLoader(property(camelContext, org.apache.camel.spi.RoutesLoader.class, value)); return true;
        case "runtimecamelcatalog":
        case "RuntimeCamelCatalog": target.setRuntimeCamelCatalog(property(camelContext, org.apache.camel.catalog.RuntimeCamelCatalog.class, value)); return true;
        case "runtimeendpointregistry":
        case "RuntimeEndpointRegistry": target.setRuntimeEndpointRegistry(property(camelContext, org.apache.camel.spi.RuntimeEndpointRegistry.class, value)); return true;
        case "sslcontextparameters":
        case "SSLContextParameters": target.setSSLContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "shutdownroute":
        case "ShutdownRoute": target.setShutdownRoute(property(camelContext, org.apache.camel.ShutdownRoute.class, value)); return true;
        case "shutdownrunningtask":
        case "ShutdownRunningTask": target.setShutdownRunningTask(property(camelContext, org.apache.camel.ShutdownRunningTask.class, value)); return true;
        case "shutdownstrategy":
        case "ShutdownStrategy": target.setShutdownStrategy(property(camelContext, org.apache.camel.spi.ShutdownStrategy.class, value)); return true;
        case "startupsteprecorder":
        case "StartupStepRecorder": target.setStartupStepRecorder(property(camelContext, org.apache.camel.spi.StartupStepRecorder.class, value)); return true;
        case "startupsummarylevel":
        case "StartupSummaryLevel": target.setStartupSummaryLevel(property(camelContext, org.apache.camel.StartupSummaryLevel.class, value)); return true;
        case "streamcaching":
        case "StreamCaching": target.setStreamCaching(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "streamcachingstrategy":
        case "StreamCachingStrategy": target.setStreamCachingStrategy(property(camelContext, org.apache.camel.spi.StreamCachingStrategy.class, value)); return true;
        case "tracer":
        case "Tracer": target.setTracer(property(camelContext, org.apache.camel.spi.Tracer.class, value)); return true;
        case "tracing":
        case "Tracing": target.setTracing(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "tracingpattern":
        case "TracingPattern": target.setTracingPattern(property(camelContext, java.lang.String.class, value)); return true;
        case "typeconverterregistry":
        case "TypeConverterRegistry": target.setTypeConverterRegistry(property(camelContext, org.apache.camel.spi.TypeConverterRegistry.class, value)); return true;
        case "typeconverterstatisticsenabled":
        case "TypeConverterStatisticsEnabled": target.setTypeConverterStatisticsEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "unitofworkfactory":
        case "UnitOfWorkFactory": target.setUnitOfWorkFactory(property(camelContext, org.apache.camel.spi.UnitOfWorkFactory.class, value)); return true;
        case "urifactoryresolver":
        case "UriFactoryResolver": target.setUriFactoryResolver(property(camelContext, org.apache.camel.spi.UriFactoryResolver.class, value)); return true;
        case "usebreadcrumb":
        case "UseBreadcrumb": target.setUseBreadcrumb(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "usedatatype":
        case "UseDataType": target.setUseDataType(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "usemdclogging":
        case "UseMDCLogging": target.setUseMDCLogging(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "uuidgenerator":
        case "UuidGenerator": target.setUuidGenerator(property(camelContext, org.apache.camel.spi.UuidGenerator.class, value)); return true;
        case "xmlroutesdefinitionloader":
        case "XMLRoutesDefinitionLoader": target.setXMLRoutesDefinitionLoader(property(camelContext, org.apache.camel.spi.XMLRoutesDefinitionLoader.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowuseoriginalmessage":
        case "AllowUseOriginalMessage": return java.lang.Boolean.class;
        case "annotationbasedprocessorfactory":
        case "AnnotationBasedProcessorFactory": return org.apache.camel.spi.AnnotationBasedProcessorFactory.class;
        case "applicationcontextclassloader":
        case "ApplicationContextClassLoader": return java.lang.ClassLoader.class;
        case "asyncprocessorawaitmanager":
        case "AsyncProcessorAwaitManager": return org.apache.camel.spi.AsyncProcessorAwaitManager.class;
        case "autostartup":
        case "AutoStartup": return java.lang.Boolean.class;
        case "autowiredenabled":
        case "AutowiredEnabled": return java.lang.Boolean.class;
        case "backlogtracing":
        case "BacklogTracing": return java.lang.Boolean.class;
        case "beanintrospection":
        case "BeanIntrospection": return org.apache.camel.spi.BeanIntrospection.class;
        case "bootstrapconfigurerresolver":
        case "BootstrapConfigurerResolver": return org.apache.camel.spi.ConfigurerResolver.class;
        case "bootstrapfactoryfinder":
        case "BootstrapFactoryFinder": return org.apache.camel.spi.FactoryFinder.class;
        case "caseinsensitiveheaders":
        case "CaseInsensitiveHeaders": return java.lang.Boolean.class;
        case "classresolver":
        case "ClassResolver": return org.apache.camel.spi.ClassResolver.class;
        case "componentnameresolver":
        case "ComponentNameResolver": return org.apache.camel.spi.ComponentNameResolver.class;
        case "componentresolver":
        case "ComponentResolver": return org.apache.camel.spi.ComponentResolver.class;
        case "configurerresolver":
        case "ConfigurerResolver": return org.apache.camel.spi.ConfigurerResolver.class;
        case "dataformatresolver":
        case "DataFormatResolver": return org.apache.camel.spi.DataFormatResolver.class;
        case "debugger":
        case "Debugger": return org.apache.camel.spi.Debugger.class;
        case "debugging":
        case "Debugging": return java.lang.Boolean.class;
        case "deferservicefactory":
        case "DeferServiceFactory": return org.apache.camel.spi.DeferServiceFactory.class;
        case "delayer":
        case "Delayer": return java.lang.Long.class;
        case "errorhandlerfactory":
        case "ErrorHandlerFactory": return org.apache.camel.ErrorHandlerFactory.class;
        case "eventnotificationapplicable":
        case "EventNotificationApplicable": return boolean.class;
        case "exchangefactory":
        case "ExchangeFactory": return org.apache.camel.spi.ExchangeFactory.class;
        case "exchangefactorymanager":
        case "ExchangeFactoryManager": return org.apache.camel.spi.ExchangeFactoryManager.class;
        case "executorservicemanager":
        case "ExecutorServiceManager": return org.apache.camel.spi.ExecutorServiceManager.class;
        case "factoryfinderresolver":
        case "FactoryFinderResolver": return org.apache.camel.spi.FactoryFinderResolver.class;
        case "globaloptions":
        case "GlobalOptions": return java.util.Map.class;
        case "headersmapfactory":
        case "HeadersMapFactory": return org.apache.camel.spi.HeadersMapFactory.class;
        case "inflightrepository":
        case "InflightRepository": return org.apache.camel.spi.InflightRepository.class;
        case "injector":
        case "Injector": return org.apache.camel.spi.Injector.class;
        case "interceptendpointfactory":
        case "InterceptEndpointFactory": return org.apache.camel.spi.InterceptEndpointFactory.class;
        case "internalprocessorfactory":
        case "InternalProcessorFactory": return org.apache.camel.spi.InternalProcessorFactory.class;
        case "languageresolver":
        case "LanguageResolver": return org.apache.camel.spi.LanguageResolver.class;
        case "lightweight":
        case "Lightweight": return boolean.class;
        case "loadtypeconverters":
        case "LoadTypeConverters": return java.lang.Boolean.class;
        case "logexhaustedmessagebody":
        case "LogExhaustedMessageBody": return java.lang.Boolean.class;
        case "logmask":
        case "LogMask": return java.lang.Boolean.class;
        case "mdcloggingkeyspattern":
        case "MDCLoggingKeysPattern": return java.lang.String.class;
        case "managementname":
        case "ManagementName": return java.lang.String.class;
        case "managementnamestrategy":
        case "ManagementNameStrategy": return org.apache.camel.spi.ManagementNameStrategy.class;
        case "managementstrategy":
        case "ManagementStrategy": return org.apache.camel.spi.ManagementStrategy.class;
        case "messagehistory":
        case "MessageHistory": return java.lang.Boolean.class;
        case "messagehistoryfactory":
        case "MessageHistoryFactory": return org.apache.camel.spi.MessageHistoryFactory.class;
        case "modeljaxbcontextfactory":
        case "ModelJAXBContextFactory": return org.apache.camel.spi.ModelJAXBContextFactory.class;
        case "modeltoxmldumper":
        case "ModelToXMLDumper": return org.apache.camel.spi.ModelToXMLDumper.class;
        case "name":
        case "Name": return java.lang.String.class;
        case "namestrategy":
        case "NameStrategy": return org.apache.camel.spi.CamelContextNameStrategy.class;
        case "nodeidfactory":
        case "NodeIdFactory": return org.apache.camel.spi.NodeIdFactory.class;
        case "packagescanclassresolver":
        case "PackageScanClassResolver": return org.apache.camel.spi.PackageScanClassResolver.class;
        case "packagescanresourceresolver":
        case "PackageScanResourceResolver": return org.apache.camel.spi.PackageScanResourceResolver.class;
        case "processorfactory":
        case "ProcessorFactory": return org.apache.camel.spi.ProcessorFactory.class;
        case "propertiescomponent":
        case "PropertiesComponent": return org.apache.camel.spi.PropertiesComponent.class;
        case "reactiveexecutor":
        case "ReactiveExecutor": return org.apache.camel.spi.ReactiveExecutor.class;
        case "registry":
        case "Registry": return org.apache.camel.spi.Registry.class;
        case "resourceloader":
        case "ResourceLoader": return org.apache.camel.spi.ResourceLoader.class;
        case "restbindingjaxbdataformatfactory":
        case "RestBindingJaxbDataFormatFactory": return org.apache.camel.spi.RestBindingJaxbDataFormatFactory.class;
        case "restconfiguration":
        case "RestConfiguration": return org.apache.camel.spi.RestConfiguration.class;
        case "restregistry":
        case "RestRegistry": return org.apache.camel.spi.RestRegistry.class;
        case "routecontroller":
        case "RouteController": return org.apache.camel.spi.RouteController.class;
        case "routefactory":
        case "RouteFactory": return org.apache.camel.spi.RouteFactory.class;
        case "routesloader":
        case "RoutesLoader": return org.apache.camel.spi.RoutesLoader.class;
        case "runtimecamelcatalog":
        case "RuntimeCamelCatalog": return org.apache.camel.catalog.RuntimeCamelCatalog.class;
        case "runtimeendpointregistry":
        case "RuntimeEndpointRegistry": return org.apache.camel.spi.RuntimeEndpointRegistry.class;
        case "sslcontextparameters":
        case "SSLContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "shutdownroute":
        case "ShutdownRoute": return org.apache.camel.ShutdownRoute.class;
        case "shutdownrunningtask":
        case "ShutdownRunningTask": return org.apache.camel.ShutdownRunningTask.class;
        case "shutdownstrategy":
        case "ShutdownStrategy": return org.apache.camel.spi.ShutdownStrategy.class;
        case "startupsteprecorder":
        case "StartupStepRecorder": return org.apache.camel.spi.StartupStepRecorder.class;
        case "startupsummarylevel":
        case "StartupSummaryLevel": return org.apache.camel.StartupSummaryLevel.class;
        case "streamcaching":
        case "StreamCaching": return java.lang.Boolean.class;
        case "streamcachingstrategy":
        case "StreamCachingStrategy": return org.apache.camel.spi.StreamCachingStrategy.class;
        case "tracer":
        case "Tracer": return org.apache.camel.spi.Tracer.class;
        case "tracing":
        case "Tracing": return java.lang.Boolean.class;
        case "tracingpattern":
        case "TracingPattern": return java.lang.String.class;
        case "typeconverterregistry":
        case "TypeConverterRegistry": return org.apache.camel.spi.TypeConverterRegistry.class;
        case "typeconverterstatisticsenabled":
        case "TypeConverterStatisticsEnabled": return java.lang.Boolean.class;
        case "unitofworkfactory":
        case "UnitOfWorkFactory": return org.apache.camel.spi.UnitOfWorkFactory.class;
        case "urifactoryresolver":
        case "UriFactoryResolver": return org.apache.camel.spi.UriFactoryResolver.class;
        case "usebreadcrumb":
        case "UseBreadcrumb": return java.lang.Boolean.class;
        case "usedatatype":
        case "UseDataType": return java.lang.Boolean.class;
        case "usemdclogging":
        case "UseMDCLogging": return java.lang.Boolean.class;
        case "uuidgenerator":
        case "UuidGenerator": return org.apache.camel.spi.UuidGenerator.class;
        case "xmlroutesdefinitionloader":
        case "XMLRoutesDefinitionLoader": return org.apache.camel.spi.XMLRoutesDefinitionLoader.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.ExtendedCamelContext target = (org.apache.camel.ExtendedCamelContext) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowuseoriginalmessage":
        case "AllowUseOriginalMessage": return target.isAllowUseOriginalMessage();
        case "annotationbasedprocessorfactory":
        case "AnnotationBasedProcessorFactory": return target.getAnnotationBasedProcessorFactory();
        case "applicationcontextclassloader":
        case "ApplicationContextClassLoader": return target.getApplicationContextClassLoader();
        case "asyncprocessorawaitmanager":
        case "AsyncProcessorAwaitManager": return target.getAsyncProcessorAwaitManager();
        case "autostartup":
        case "AutoStartup": return target.isAutoStartup();
        case "autowiredenabled":
        case "AutowiredEnabled": return target.isAutowiredEnabled();
        case "backlogtracing":
        case "BacklogTracing": return target.isBacklogTracing();
        case "beanintrospection":
        case "BeanIntrospection": return target.getBeanIntrospection();
        case "bootstrapconfigurerresolver":
        case "BootstrapConfigurerResolver": return target.getBootstrapConfigurerResolver();
        case "bootstrapfactoryfinder":
        case "BootstrapFactoryFinder": return target.getBootstrapFactoryFinder();
        case "caseinsensitiveheaders":
        case "CaseInsensitiveHeaders": return target.isCaseInsensitiveHeaders();
        case "classresolver":
        case "ClassResolver": return target.getClassResolver();
        case "componentnameresolver":
        case "ComponentNameResolver": return target.getComponentNameResolver();
        case "componentresolver":
        case "ComponentResolver": return target.getComponentResolver();
        case "configurerresolver":
        case "ConfigurerResolver": return target.getConfigurerResolver();
        case "dataformatresolver":
        case "DataFormatResolver": return target.getDataFormatResolver();
        case "debugger":
        case "Debugger": return target.getDebugger();
        case "debugging":
        case "Debugging": return target.isDebugging();
        case "deferservicefactory":
        case "DeferServiceFactory": return target.getDeferServiceFactory();
        case "delayer":
        case "Delayer": return target.getDelayer();
        case "errorhandlerfactory":
        case "ErrorHandlerFactory": return target.getErrorHandlerFactory();
        case "eventnotificationapplicable":
        case "EventNotificationApplicable": return target.isEventNotificationApplicable();
        case "exchangefactory":
        case "ExchangeFactory": return target.getExchangeFactory();
        case "exchangefactorymanager":
        case "ExchangeFactoryManager": return target.getExchangeFactoryManager();
        case "executorservicemanager":
        case "ExecutorServiceManager": return target.getExecutorServiceManager();
        case "factoryfinderresolver":
        case "FactoryFinderResolver": return target.getFactoryFinderResolver();
        case "globaloptions":
        case "GlobalOptions": return target.getGlobalOptions();
        case "headersmapfactory":
        case "HeadersMapFactory": return target.getHeadersMapFactory();
        case "inflightrepository":
        case "InflightRepository": return target.getInflightRepository();
        case "injector":
        case "Injector": return target.getInjector();
        case "interceptendpointfactory":
        case "InterceptEndpointFactory": return target.getInterceptEndpointFactory();
        case "internalprocessorfactory":
        case "InternalProcessorFactory": return target.getInternalProcessorFactory();
        case "languageresolver":
        case "LanguageResolver": return target.getLanguageResolver();
        case "lightweight":
        case "Lightweight": return target.isLightweight();
        case "loadtypeconverters":
        case "LoadTypeConverters": return target.isLoadTypeConverters();
        case "logexhaustedmessagebody":
        case "LogExhaustedMessageBody": return target.isLogExhaustedMessageBody();
        case "logmask":
        case "LogMask": return target.isLogMask();
        case "mdcloggingkeyspattern":
        case "MDCLoggingKeysPattern": return target.getMDCLoggingKeysPattern();
        case "managementname":
        case "ManagementName": return target.getManagementName();
        case "managementnamestrategy":
        case "ManagementNameStrategy": return target.getManagementNameStrategy();
        case "managementstrategy":
        case "ManagementStrategy": return target.getManagementStrategy();
        case "messagehistory":
        case "MessageHistory": return target.isMessageHistory();
        case "messagehistoryfactory":
        case "MessageHistoryFactory": return target.getMessageHistoryFactory();
        case "modeljaxbcontextfactory":
        case "ModelJAXBContextFactory": return target.getModelJAXBContextFactory();
        case "modeltoxmldumper":
        case "ModelToXMLDumper": return target.getModelToXMLDumper();
        case "name":
        case "Name": return target.getName();
        case "namestrategy":
        case "NameStrategy": return target.getNameStrategy();
        case "nodeidfactory":
        case "NodeIdFactory": return target.getNodeIdFactory();
        case "packagescanclassresolver":
        case "PackageScanClassResolver": return target.getPackageScanClassResolver();
        case "packagescanresourceresolver":
        case "PackageScanResourceResolver": return target.getPackageScanResourceResolver();
        case "processorfactory":
        case "ProcessorFactory": return target.getProcessorFactory();
        case "propertiescomponent":
        case "PropertiesComponent": return target.getPropertiesComponent();
        case "reactiveexecutor":
        case "ReactiveExecutor": return target.getReactiveExecutor();
        case "registry":
        case "Registry": return target.getRegistry();
        case "resourceloader":
        case "ResourceLoader": return target.getResourceLoader();
        case "restbindingjaxbdataformatfactory":
        case "RestBindingJaxbDataFormatFactory": return target.getRestBindingJaxbDataFormatFactory();
        case "restconfiguration":
        case "RestConfiguration": return target.getRestConfiguration();
        case "restregistry":
        case "RestRegistry": return target.getRestRegistry();
        case "routecontroller":
        case "RouteController": return target.getRouteController();
        case "routefactory":
        case "RouteFactory": return target.getRouteFactory();
        case "routesloader":
        case "RoutesLoader": return target.getRoutesLoader();
        case "runtimecamelcatalog":
        case "RuntimeCamelCatalog": return target.getRuntimeCamelCatalog();
        case "runtimeendpointregistry":
        case "RuntimeEndpointRegistry": return target.getRuntimeEndpointRegistry();
        case "sslcontextparameters":
        case "SSLContextParameters": return target.getSSLContextParameters();
        case "shutdownroute":
        case "ShutdownRoute": return target.getShutdownRoute();
        case "shutdownrunningtask":
        case "ShutdownRunningTask": return target.getShutdownRunningTask();
        case "shutdownstrategy":
        case "ShutdownStrategy": return target.getShutdownStrategy();
        case "startupsteprecorder":
        case "StartupStepRecorder": return target.getStartupStepRecorder();
        case "startupsummarylevel":
        case "StartupSummaryLevel": return target.getStartupSummaryLevel();
        case "streamcaching":
        case "StreamCaching": return target.isStreamCaching();
        case "streamcachingstrategy":
        case "StreamCachingStrategy": return target.getStreamCachingStrategy();
        case "tracer":
        case "Tracer": return target.getTracer();
        case "tracing":
        case "Tracing": return target.isTracing();
        case "tracingpattern":
        case "TracingPattern": return target.getTracingPattern();
        case "typeconverterregistry":
        case "TypeConverterRegistry": return target.getTypeConverterRegistry();
        case "typeconverterstatisticsenabled":
        case "TypeConverterStatisticsEnabled": return target.isTypeConverterStatisticsEnabled();
        case "unitofworkfactory":
        case "UnitOfWorkFactory": return target.getUnitOfWorkFactory();
        case "urifactoryresolver":
        case "UriFactoryResolver": return target.getUriFactoryResolver();
        case "usebreadcrumb":
        case "UseBreadcrumb": return target.isUseBreadcrumb();
        case "usedatatype":
        case "UseDataType": return target.isUseDataType();
        case "usemdclogging":
        case "UseMDCLogging": return target.isUseMDCLogging();
        case "uuidgenerator":
        case "UuidGenerator": return target.getUuidGenerator();
        case "xmlroutesdefinitionloader":
        case "XMLRoutesDefinitionLoader": return target.getXMLRoutesDefinitionLoader();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "globaloptions":
        case "GlobalOptions": return java.lang.String.class;
        default: return null;
        }
    }
}

