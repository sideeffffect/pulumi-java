// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Latency percentile rank and value.
 * 
 */
public final class LatencyPercentileResponse extends com.pulumi.resources.InvokeArgs {

    public static final LatencyPercentileResponse Empty = new LatencyPercentileResponse();

    /**
     * percent-th percentile of latency observed, in microseconds. Fraction of percent/100 of samples have latency lower or equal to the value of this field.
     * 
     */
    @Import(name="latencyMicros", required=true)
      private final String latencyMicros;

    public String latencyMicros() {
        return this.latencyMicros;
    }

    /**
     * Percentage of samples this data point applies to.
     * 
     */
    @Import(name="percent", required=true)
      private final Integer percent;

    public Integer percent() {
        return this.percent;
    }

    public LatencyPercentileResponse(
        String latencyMicros,
        Integer percent) {
        this.latencyMicros = Objects.requireNonNull(latencyMicros, "expected parameter 'latencyMicros' to be non-null");
        this.percent = Objects.requireNonNull(percent, "expected parameter 'percent' to be non-null");
    }

    private LatencyPercentileResponse() {
        this.latencyMicros = null;
        this.percent = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LatencyPercentileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String latencyMicros;
        private Integer percent;

        public Builder() {
    	      // Empty
        }

        public Builder(LatencyPercentileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.latencyMicros = defaults.latencyMicros;
    	      this.percent = defaults.percent;
        }

        public Builder latencyMicros(String latencyMicros) {
            this.latencyMicros = Objects.requireNonNull(latencyMicros);
            return this;
        }
        public Builder percent(Integer percent) {
            this.percent = Objects.requireNonNull(percent);
            return this;
        }        public LatencyPercentileResponse build() {
            return new LatencyPercentileResponse(latencyMicros, percent);
        }
    }
}
