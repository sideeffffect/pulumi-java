// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.enums.ConditionalOperator;
import com.pulumi.azurenative.insights.enums.MetricTriggerType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A log metrics trigger descriptor.
 * 
 */
public final class LogMetricTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogMetricTriggerArgs Empty = new LogMetricTriggerArgs();

    /**
     * Evaluation of metric on a particular column
     * 
     */
    @Import(name="metricColumn")
    private @Nullable Output<String> metricColumn;

    public Optional<Output<String>> metricColumn() {
        return Optional.ofNullable(this.metricColumn);
    }

    /**
     * Metric Trigger Type - &#39;Consecutive&#39; or &#39;Total&#39;
     * 
     */
    @Import(name="metricTriggerType")
    private @Nullable Output<Either<String,MetricTriggerType>> metricTriggerType;

    public Optional<Output<Either<String,MetricTriggerType>>> metricTriggerType() {
        return Optional.ofNullable(this.metricTriggerType);
    }

    /**
     * The threshold of the metric trigger.
     * 
     */
    @Import(name="threshold")
    private @Nullable Output<Double> threshold;

    public Optional<Output<Double>> threshold() {
        return Optional.ofNullable(this.threshold);
    }

    /**
     * Evaluation operation for Metric -&#39;GreaterThan&#39; or &#39;LessThan&#39; or &#39;Equal&#39;.
     * 
     */
    @Import(name="thresholdOperator")
    private @Nullable Output<Either<String,ConditionalOperator>> thresholdOperator;

    public Optional<Output<Either<String,ConditionalOperator>>> thresholdOperator() {
        return Optional.ofNullable(this.thresholdOperator);
    }

    private LogMetricTriggerArgs() {}

    private LogMetricTriggerArgs(LogMetricTriggerArgs $) {
        this.metricColumn = $.metricColumn;
        this.metricTriggerType = $.metricTriggerType;
        this.threshold = $.threshold;
        this.thresholdOperator = $.thresholdOperator;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogMetricTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogMetricTriggerArgs $;

        public Builder() {
            $ = new LogMetricTriggerArgs();
        }

        public Builder(LogMetricTriggerArgs defaults) {
            $ = new LogMetricTriggerArgs(Objects.requireNonNull(defaults));
        }

        public Builder metricColumn(@Nullable Output<String> metricColumn) {
            $.metricColumn = metricColumn;
            return this;
        }

        public Builder metricColumn(String metricColumn) {
            return metricColumn(Output.of(metricColumn));
        }

        public Builder metricTriggerType(@Nullable Output<Either<String,MetricTriggerType>> metricTriggerType) {
            $.metricTriggerType = metricTriggerType;
            return this;
        }

        public Builder metricTriggerType(Either<String,MetricTriggerType> metricTriggerType) {
            return metricTriggerType(Output.of(metricTriggerType));
        }

        public Builder threshold(@Nullable Output<Double> threshold) {
            $.threshold = threshold;
            return this;
        }

        public Builder threshold(Double threshold) {
            return threshold(Output.of(threshold));
        }

        public Builder thresholdOperator(@Nullable Output<Either<String,ConditionalOperator>> thresholdOperator) {
            $.thresholdOperator = thresholdOperator;
            return this;
        }

        public Builder thresholdOperator(Either<String,ConditionalOperator> thresholdOperator) {
            return thresholdOperator(Output.of(thresholdOperator));
        }

        public LogMetricTriggerArgs build() {
            return $;
        }
    }

}
