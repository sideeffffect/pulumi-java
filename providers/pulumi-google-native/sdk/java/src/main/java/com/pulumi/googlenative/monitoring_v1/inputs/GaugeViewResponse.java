// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


/**
 * A gauge chart shows where the current value sits within a pre-defined range. The upper and lower bounds should define the possible range of values for the scorecard&#39;s query (inclusive).
 * 
 */
public final class GaugeViewResponse extends com.pulumi.resources.InvokeArgs {

    public static final GaugeViewResponse Empty = new GaugeViewResponse();

    /**
     * The lower bound for this gauge chart. The value of the chart should always be greater than or equal to this.
     * 
     */
    @Import(name="lowerBound", required=true)
    private Double lowerBound;

    public Double lowerBound() {
        return this.lowerBound;
    }

    /**
     * The upper bound for this gauge chart. The value of the chart should always be less than or equal to this.
     * 
     */
    @Import(name="upperBound", required=true)
    private Double upperBound;

    public Double upperBound() {
        return this.upperBound;
    }

    private GaugeViewResponse() {}

    private GaugeViewResponse(GaugeViewResponse $) {
        this.lowerBound = $.lowerBound;
        this.upperBound = $.upperBound;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GaugeViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GaugeViewResponse $;

        public Builder() {
            $ = new GaugeViewResponse();
        }

        public Builder(GaugeViewResponse defaults) {
            $ = new GaugeViewResponse(Objects.requireNonNull(defaults));
        }

        public Builder lowerBound(Double lowerBound) {
            $.lowerBound = lowerBound;
            return this;
        }

        public Builder upperBound(Double upperBound) {
            $.upperBound = upperBound;
            return this;
        }

        public GaugeViewResponse build() {
            $.lowerBound = Objects.requireNonNull($.lowerBound, "expected parameter 'lowerBound' to be non-null");
            $.upperBound = Objects.requireNonNull($.upperBound, "expected parameter 'upperBound' to be non-null");
            return $;
        }
    }

}
