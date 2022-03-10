// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.inputs;

import io.pulumi.awsnative.lookoutmetrics.enums.AnomalyDetectorMetricAggregationFunction;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnomalyDetectorMetric extends io.pulumi.resources.InvokeArgs {

    public static final AnomalyDetectorMetric Empty = new AnomalyDetectorMetric();

    /**
     * Operator used to aggregate metric values
     * 
     */
    @InputImport(name="aggregationFunction", required=true)
      private final AnomalyDetectorMetricAggregationFunction aggregationFunction;

    public AnomalyDetectorMetricAggregationFunction getAggregationFunction() {
        return this.aggregationFunction;
    }

    @InputImport(name="metricName", required=true)
      private final String metricName;

    public String getMetricName() {
        return this.metricName;
    }

    @InputImport(name="namespace")
      private final @Nullable String namespace;

    public Optional<String> getNamespace() {
        return this.namespace == null ? Optional.empty() : Optional.ofNullable(this.namespace);
    }

    public AnomalyDetectorMetric(
        AnomalyDetectorMetricAggregationFunction aggregationFunction,
        String metricName,
        @Nullable String namespace) {
        this.aggregationFunction = Objects.requireNonNull(aggregationFunction, "expected parameter 'aggregationFunction' to be non-null");
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.namespace = namespace;
    }

    private AnomalyDetectorMetric() {
        this.aggregationFunction = null;
        this.metricName = null;
        this.namespace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorMetric defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnomalyDetectorMetricAggregationFunction aggregationFunction;
        private String metricName;
        private @Nullable String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorMetric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationFunction = defaults.aggregationFunction;
    	      this.metricName = defaults.metricName;
    	      this.namespace = defaults.namespace;
        }

        public Builder aggregationFunction(AnomalyDetectorMetricAggregationFunction aggregationFunction) {
            this.aggregationFunction = Objects.requireNonNull(aggregationFunction);
            return this;
        }

        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        public AnomalyDetectorMetric build() {
            return new AnomalyDetectorMetric(aggregationFunction, metricName, namespace);
        }
    }
}
