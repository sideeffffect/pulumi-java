// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LogMetricTriggerResponse {
    /**
     * @return Evaluation of metric on a particular column
     * 
     */
    private final @Nullable String metricColumn;
    /**
     * @return Metric Trigger Type - &#39;Consecutive&#39; or &#39;Total&#39;
     * 
     */
    private final @Nullable String metricTriggerType;
    /**
     * @return The threshold of the metric trigger.
     * 
     */
    private final @Nullable Double threshold;
    /**
     * @return Evaluation operation for Metric -&#39;GreaterThan&#39; or &#39;LessThan&#39; or &#39;Equal&#39;.
     * 
     */
    private final @Nullable String thresholdOperator;

    @CustomType.Constructor
    private LogMetricTriggerResponse(
        @CustomType.Parameter("metricColumn") @Nullable String metricColumn,
        @CustomType.Parameter("metricTriggerType") @Nullable String metricTriggerType,
        @CustomType.Parameter("threshold") @Nullable Double threshold,
        @CustomType.Parameter("thresholdOperator") @Nullable String thresholdOperator) {
        this.metricColumn = metricColumn;
        this.metricTriggerType = metricTriggerType;
        this.threshold = threshold;
        this.thresholdOperator = thresholdOperator;
    }

    /**
     * @return Evaluation of metric on a particular column
     * 
     */
    public Optional<String> metricColumn() {
        return Optional.ofNullable(this.metricColumn);
    }
    /**
     * @return Metric Trigger Type - &#39;Consecutive&#39; or &#39;Total&#39;
     * 
     */
    public Optional<String> metricTriggerType() {
        return Optional.ofNullable(this.metricTriggerType);
    }
    /**
     * @return The threshold of the metric trigger.
     * 
     */
    public Optional<Double> threshold() {
        return Optional.ofNullable(this.threshold);
    }
    /**
     * @return Evaluation operation for Metric -&#39;GreaterThan&#39; or &#39;LessThan&#39; or &#39;Equal&#39;.
     * 
     */
    public Optional<String> thresholdOperator() {
        return Optional.ofNullable(this.thresholdOperator);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogMetricTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String metricColumn;
        private @Nullable String metricTriggerType;
        private @Nullable Double threshold;
        private @Nullable String thresholdOperator;

        public Builder() {
    	      // Empty
        }

        public Builder(LogMetricTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricColumn = defaults.metricColumn;
    	      this.metricTriggerType = defaults.metricTriggerType;
    	      this.threshold = defaults.threshold;
    	      this.thresholdOperator = defaults.thresholdOperator;
        }

        public Builder metricColumn(@Nullable String metricColumn) {
            this.metricColumn = metricColumn;
            return this;
        }
        public Builder metricTriggerType(@Nullable String metricTriggerType) {
            this.metricTriggerType = metricTriggerType;
            return this;
        }
        public Builder threshold(@Nullable Double threshold) {
            this.threshold = threshold;
            return this;
        }
        public Builder thresholdOperator(@Nullable String thresholdOperator) {
            this.thresholdOperator = thresholdOperator;
            return this;
        }        public LogMetricTriggerResponse build() {
            return new LogMetricTriggerResponse(metricColumn, metricTriggerType, threshold, thresholdOperator);
        }
    }
}
