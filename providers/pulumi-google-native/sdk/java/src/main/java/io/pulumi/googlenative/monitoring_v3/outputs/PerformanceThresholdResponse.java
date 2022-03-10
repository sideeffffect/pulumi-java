// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.monitoring_v3.outputs.BasicSliResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.RequestBasedSliResponse;
import java.lang.Double;
import java.util.Objects;

@OutputCustomType
public final class PerformanceThresholdResponse {
    /**
     * BasicSli to evaluate to judge window quality.
     * 
     */
    private final BasicSliResponse basicSliPerformance;
    /**
     * RequestBasedSli to evaluate to judge window quality.
     * 
     */
    private final RequestBasedSliResponse performance;
    /**
     * If window performance >= threshold, the window is counted as good.
     * 
     */
    private final Double threshold;

    @OutputCustomType.Constructor
    private PerformanceThresholdResponse(
        @OutputCustomType.Parameter("basicSliPerformance") BasicSliResponse basicSliPerformance,
        @OutputCustomType.Parameter("performance") RequestBasedSliResponse performance,
        @OutputCustomType.Parameter("threshold") Double threshold) {
        this.basicSliPerformance = basicSliPerformance;
        this.performance = performance;
        this.threshold = threshold;
    }

    /**
     * BasicSli to evaluate to judge window quality.
     * 
    */
    public BasicSliResponse getBasicSliPerformance() {
        return this.basicSliPerformance;
    }
    /**
     * RequestBasedSli to evaluate to judge window quality.
     * 
    */
    public RequestBasedSliResponse getPerformance() {
        return this.performance;
    }
    /**
     * If window performance >= threshold, the window is counted as good.
     * 
    */
    public Double getThreshold() {
        return this.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PerformanceThresholdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasicSliResponse basicSliPerformance;
        private RequestBasedSliResponse performance;
        private Double threshold;

        public Builder() {
    	      // Empty
        }

        public Builder(PerformanceThresholdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicSliPerformance = defaults.basicSliPerformance;
    	      this.performance = defaults.performance;
    	      this.threshold = defaults.threshold;
        }

        public Builder basicSliPerformance(BasicSliResponse basicSliPerformance) {
            this.basicSliPerformance = Objects.requireNonNull(basicSliPerformance);
            return this;
        }

        public Builder performance(RequestBasedSliResponse performance) {
            this.performance = Objects.requireNonNull(performance);
            return this;
        }

        public Builder threshold(Double threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }
        public PerformanceThresholdResponse build() {
            return new PerformanceThresholdResponse(basicSliPerformance, performance, threshold);
        }
    }
}
