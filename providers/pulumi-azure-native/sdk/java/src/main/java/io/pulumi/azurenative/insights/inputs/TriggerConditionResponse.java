// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.LogMetricTriggerResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The condition that results in the Log Search rule.
 * 
 */
public final class TriggerConditionResponse extends io.pulumi.resources.InvokeArgs {

    public static final TriggerConditionResponse Empty = new TriggerConditionResponse();

    /**
     * Trigger condition for metric query rule
     * 
     */
    @InputImport(name="metricTrigger")
      private final @Nullable LogMetricTriggerResponse metricTrigger;

    public Optional<LogMetricTriggerResponse> getMetricTrigger() {
        return this.metricTrigger == null ? Optional.empty() : Optional.ofNullable(this.metricTrigger);
    }

    /**
     * Result or count threshold based on which rule should be triggered.
     * 
     */
    @InputImport(name="threshold", required=true)
      private final Double threshold;

    public Double getThreshold() {
        return this.threshold;
    }

    /**
     * Evaluation operation for rule - 'GreaterThan' or 'LessThan.
     * 
     */
    @InputImport(name="thresholdOperator", required=true)
      private final String thresholdOperator;

    public String getThresholdOperator() {
        return this.thresholdOperator;
    }

    public TriggerConditionResponse(
        @Nullable LogMetricTriggerResponse metricTrigger,
        Double threshold,
        String thresholdOperator) {
        this.metricTrigger = metricTrigger;
        this.threshold = Objects.requireNonNull(threshold, "expected parameter 'threshold' to be non-null");
        this.thresholdOperator = Objects.requireNonNull(thresholdOperator, "expected parameter 'thresholdOperator' to be non-null");
    }

    private TriggerConditionResponse() {
        this.metricTrigger = null;
        this.threshold = null;
        this.thresholdOperator = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LogMetricTriggerResponse metricTrigger;
        private Double threshold;
        private String thresholdOperator;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricTrigger = defaults.metricTrigger;
    	      this.threshold = defaults.threshold;
    	      this.thresholdOperator = defaults.thresholdOperator;
        }

        public Builder metricTrigger(@Nullable LogMetricTriggerResponse metricTrigger) {
            this.metricTrigger = metricTrigger;
            return this;
        }

        public Builder threshold(Double threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }

        public Builder thresholdOperator(String thresholdOperator) {
            this.thresholdOperator = Objects.requireNonNull(thresholdOperator);
            return this;
        }
        public TriggerConditionResponse build() {
            return new TriggerConditionResponse(metricTrigger, threshold, thresholdOperator);
        }
    }
}
