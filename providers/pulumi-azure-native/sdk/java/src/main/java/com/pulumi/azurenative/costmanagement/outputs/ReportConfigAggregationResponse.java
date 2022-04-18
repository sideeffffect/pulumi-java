// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ReportConfigAggregationResponse {
    /**
     * The name of the aggregation function to use.
     * 
     */
    private final String function;
    /**
     * The name of the column to aggregate.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private ReportConfigAggregationResponse(
        @CustomType.Parameter("function") String function,
        @CustomType.Parameter("name") String name) {
        this.function = function;
        this.name = name;
    }

    /**
     * The name of the aggregation function to use.
     * 
    */
    public String function() {
        return this.function;
    }
    /**
     * The name of the column to aggregate.
     * 
    */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportConfigAggregationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String function;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportConfigAggregationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.function = defaults.function;
    	      this.name = defaults.name;
        }

        public Builder function(String function) {
            this.function = Objects.requireNonNull(function);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public ReportConfigAggregationResponse build() {
            return new ReportConfigAggregationResponse(function, name);
        }
    }
}
