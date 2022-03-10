// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.monitoring_v1.outputs.AggregationResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RatioPartResponse {
    /**
     * By default, the raw time series data is returned. Use this field to combine multiple time series for different views of the data.
     * 
     */
    private final AggregationResponse aggregation;
    /**
     * The monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies the metric types, resources, and projects to query.
     * 
     */
    private final String filter;

    @OutputCustomType.Constructor
    private RatioPartResponse(
        @OutputCustomType.Parameter("aggregation") AggregationResponse aggregation,
        @OutputCustomType.Parameter("filter") String filter) {
        this.aggregation = aggregation;
        this.filter = filter;
    }

    /**
     * By default, the raw time series data is returned. Use this field to combine multiple time series for different views of the data.
     * 
    */
    public AggregationResponse getAggregation() {
        return this.aggregation;
    }
    /**
     * The monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies the metric types, resources, and projects to query.
     * 
    */
    public String getFilter() {
        return this.filter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RatioPartResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AggregationResponse aggregation;
        private String filter;

        public Builder() {
    	      // Empty
        }

        public Builder(RatioPartResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregation = defaults.aggregation;
    	      this.filter = defaults.filter;
        }

        public Builder aggregation(AggregationResponse aggregation) {
            this.aggregation = Objects.requireNonNull(aggregation);
            return this;
        }

        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public RatioPartResponse build() {
            return new RatioPartResponse(aggregation, filter);
        }
    }
}
