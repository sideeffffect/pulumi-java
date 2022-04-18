// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_v2beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InputMappingResponse {
    /**
     * The name of the field that is going to be injected.
     * 
     */
    private final String fieldName;
    /**
     * The location where this mapping applies.
     * 
     */
    private final String location;
    /**
     * Regex to evaluate on method to decide if input applies.
     * 
     */
    private final String methodMatch;
    /**
     * A jsonPath expression to select an element.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private InputMappingResponse(
        @CustomType.Parameter("fieldName") String fieldName,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("methodMatch") String methodMatch,
        @CustomType.Parameter("value") String value) {
        this.fieldName = fieldName;
        this.location = location;
        this.methodMatch = methodMatch;
        this.value = value;
    }

    /**
     * The name of the field that is going to be injected.
     * 
    */
    public String fieldName() {
        return this.fieldName;
    }
    /**
     * The location where this mapping applies.
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * Regex to evaluate on method to decide if input applies.
     * 
    */
    public String methodMatch() {
        return this.methodMatch;
    }
    /**
     * A jsonPath expression to select an element.
     * 
    */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InputMappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fieldName;
        private String location;
        private String methodMatch;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(InputMappingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldName = defaults.fieldName;
    	      this.location = defaults.location;
    	      this.methodMatch = defaults.methodMatch;
    	      this.value = defaults.value;
        }

        public Builder fieldName(String fieldName) {
            this.fieldName = Objects.requireNonNull(fieldName);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder methodMatch(String methodMatch) {
            this.methodMatch = Objects.requireNonNull(methodMatch);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public InputMappingResponse build() {
            return new InputMappingResponse(fieldName, location, methodMatch, value);
        }
    }
}
