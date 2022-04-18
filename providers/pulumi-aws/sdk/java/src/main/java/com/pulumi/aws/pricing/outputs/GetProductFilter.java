// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pricing.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetProductFilter {
    /**
     * The product attribute name that you want to filter on.
     * 
     */
    private final String field;
    /**
     * The product attribute value that you want to filter on.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private GetProductFilter(
        @CustomType.Parameter("field") String field,
        @CustomType.Parameter("value") String value) {
        this.field = field;
        this.value = value;
    }

    /**
     * The product attribute name that you want to filter on.
     * 
    */
    public String field() {
        return this.field;
    }
    /**
     * The product attribute value that you want to filter on.
     * 
    */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProductFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String field;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProductFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.value = defaults.value;
        }

        public Builder field(String field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GetProductFilter build() {
            return new GetProductFilter(field, value);
        }
    }
}
