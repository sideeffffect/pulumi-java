// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.outputs;

import io.pulumi.awsnative.lookoutmetrics.enums.AnomalyDetectorFrequency;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class AnomalyDetectorConfig {
    /**
     * Frequency of anomaly detection
     * 
     */
    private final AnomalyDetectorFrequency anomalyDetectorFrequency;

    @OutputCustomType.Constructor
    private AnomalyDetectorConfig(@OutputCustomType.Parameter("anomalyDetectorFrequency") AnomalyDetectorFrequency anomalyDetectorFrequency) {
        this.anomalyDetectorFrequency = anomalyDetectorFrequency;
    }

    /**
     * Frequency of anomaly detection
     * 
    */
    public AnomalyDetectorFrequency getAnomalyDetectorFrequency() {
        return this.anomalyDetectorFrequency;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnomalyDetectorFrequency anomalyDetectorFrequency;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.anomalyDetectorFrequency = defaults.anomalyDetectorFrequency;
        }

        public Builder anomalyDetectorFrequency(AnomalyDetectorFrequency anomalyDetectorFrequency) {
            this.anomalyDetectorFrequency = Objects.requireNonNull(anomalyDetectorFrequency);
            return this;
        }
        public AnomalyDetectorConfig build() {
            return new AnomalyDetectorConfig(anomalyDetectorFrequency);
        }
    }
}
