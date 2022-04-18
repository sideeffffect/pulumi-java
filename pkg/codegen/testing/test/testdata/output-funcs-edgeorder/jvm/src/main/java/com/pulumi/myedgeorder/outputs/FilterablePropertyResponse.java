// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.myedgeorder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class FilterablePropertyResponse {
    /**
     * Values to be filtered.
     * 
     */
    private final List<String> supportedValues;
    /**
     * Type of product filter.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private FilterablePropertyResponse(
        @CustomType.Parameter("supportedValues") List<String> supportedValues,
        @CustomType.Parameter("type") String type) {
        this.supportedValues = supportedValues;
        this.type = type;
    }

    /**
     * Values to be filtered.
     * 
    */
    public List<String> supportedValues() {
        return this.supportedValues;
    }
    /**
     * Type of product filter.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterablePropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> supportedValues;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterablePropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.supportedValues = defaults.supportedValues;
    	      this.type = defaults.type;
        }

        public Builder supportedValues(List<String> supportedValues) {
            this.supportedValues = Objects.requireNonNull(supportedValues);
            return this;
        }
        public Builder supportedValues(String... supportedValues) {
            return supportedValues(List.of(supportedValues));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public FilterablePropertyResponse build() {
            return new FilterablePropertyResponse(supportedValues, type);
        }
    }
}
