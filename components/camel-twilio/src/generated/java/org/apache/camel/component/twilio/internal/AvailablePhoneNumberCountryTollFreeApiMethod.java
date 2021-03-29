
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.twilio.rest.api.v2010.account.availablephonenumbercountry.TollFree;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.twilio.rest.api.v2010.account.availablephonenumbercountry.TollFree
 */
public enum AvailablePhoneNumberCountryTollFreeApiMethod implements ApiMethod {

    READER(
        com.twilio.rest.api.v2010.account.availablephonenumbercountry.TollFreeReader.class,
        "reader",
        arg("pathCountryCode", String.class)),

    READER_1(
        com.twilio.rest.api.v2010.account.availablephonenumbercountry.TollFreeReader.class,
        "reader",
        arg("pathAccountSid", String.class),
        arg("pathCountryCode", String.class));

    private final ApiMethod apiMethod;

    private AvailablePhoneNumberCountryTollFreeApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(TollFree.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public Class<?> getResultType() { return apiMethod.getResultType(); }

    @Override
    public List<String> getArgNames() { return apiMethod.getArgNames(); }

    @Override
    public List<Class<?>> getArgTypes() { return apiMethod.getArgTypes(); }

    @Override
    public Method getMethod() { return apiMethod.getMethod(); }
}
