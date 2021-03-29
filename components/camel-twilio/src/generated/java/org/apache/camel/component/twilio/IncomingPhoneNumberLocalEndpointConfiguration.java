
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.incomingphonenumber.Local}.
 */
@ApiParams(apiName = "incoming-phone-number-local", 
           description = "",
           apiMethods = {@ApiMethod(methodName = "creator", description="Create a LocalCreator to execute create", signatures={"com.twilio.rest.api.v2010.account.incomingphonenumber.LocalCreator creator(com.twilio.type.PhoneNumber phoneNumber)", "com.twilio.rest.api.v2010.account.incomingphonenumber.LocalCreator creator(String pathAccountSid, com.twilio.type.PhoneNumber phoneNumber)"}), @ApiMethod(methodName = "reader", description="Create a LocalReader to execute read", signatures={"com.twilio.rest.api.v2010.account.incomingphonenumber.LocalReader reader()", "com.twilio.rest.api.v2010.account.incomingphonenumber.LocalReader reader(String pathAccountSid)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer(extended = true)
public final class IncomingPhoneNumberLocalEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The SID of the Account that will create the resource"), @ApiMethod(methodName = "reader", description="The SID of the Account that created the resources to read")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The phone number to purchase in E.164 format")})
    private com.twilio.type.PhoneNumber phoneNumber;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public com.twilio.type.PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(com.twilio.type.PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
