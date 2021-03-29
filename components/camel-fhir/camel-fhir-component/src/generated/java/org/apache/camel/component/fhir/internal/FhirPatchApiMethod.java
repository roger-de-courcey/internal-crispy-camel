
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.fhir.internal;

import java.lang.reflect.Method;
import java.util.List;

import org.apache.camel.component.fhir.api.FhirPatch;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for org.apache.camel.component.fhir.api.FhirPatch
 */
public enum FhirPatchApiMethod implements ApiMethod {

    PATCH_BY_ID(
        ca.uhn.fhir.rest.api.MethodOutcome.class,
        "patchById",
        arg("patchBody", String.class),
        arg("id", org.hl7.fhir.instance.model.api.IIdType.class),
        arg("preferReturn", ca.uhn.fhir.rest.api.PreferReturnEnum.class),
        arg("extraParameters", java.util.Map.class)),

    PATCH_BY_ID_1(
        ca.uhn.fhir.rest.api.MethodOutcome.class,
        "patchById",
        arg("patchBody", String.class),
        arg("stringId", String.class),
        arg("preferReturn", ca.uhn.fhir.rest.api.PreferReturnEnum.class),
        arg("extraParameters", java.util.Map.class)),

    PATCH_BY_URL(
        ca.uhn.fhir.rest.api.MethodOutcome.class,
        "patchByUrl",
        arg("patchBody", String.class),
        arg("url", String.class),
        arg("preferReturn", ca.uhn.fhir.rest.api.PreferReturnEnum.class),
        arg("extraParameters", java.util.Map.class));

    private final ApiMethod apiMethod;

    private FhirPatchApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(FhirPatch.class, resultType, name, args);
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
