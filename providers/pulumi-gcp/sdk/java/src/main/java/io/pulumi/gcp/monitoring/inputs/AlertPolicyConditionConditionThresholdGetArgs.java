// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionThresholdAggregationGetArgs;
import io.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionThresholdDenominatorAggregationGetArgs;
import io.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionThresholdTriggerGetArgs;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlertPolicyConditionConditionThresholdGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertPolicyConditionConditionThresholdGetArgs Empty = new AlertPolicyConditionConditionThresholdGetArgs();

    /**
     * Specifies the alignment of data points in
     * individual time series as well as how to
     * combine the retrieved time series together
     * (such as when aggregating multiple streams
     * on each resource to a single stream for each
     * resource or when aggregating streams across
     * all members of a group of resources).
     * Multiple aggregations are applied in the
     * order specified.This field is similar to the
     * one in the MetricService.ListTimeSeries
     * request. It is advisable to use the
     * ListTimeSeries method when debugging this
     * field.
     * Structure is documented below.
     * 
     */
    @Import(name="aggregations")
      private final @Nullable Output<List<AlertPolicyConditionConditionThresholdAggregationGetArgs>> aggregations;

    public Output<List<AlertPolicyConditionConditionThresholdAggregationGetArgs>> aggregations() {
        return this.aggregations == null ? Codegen.empty() : this.aggregations;
    }

    /**
     * The comparison to apply between the time
     * series (indicated by filter and aggregation)
     * and the threshold (indicated by
     * threshold_value). The comparison is applied
     * on each time series, with the time series on
     * the left-hand side and the threshold on the
     * right-hand side. Only COMPARISON_LT and
     * COMPARISON_GT are supported currently.
     * Possible values are `COMPARISON_GT`, `COMPARISON_GE`, `COMPARISON_LT`, `COMPARISON_LE`, `COMPARISON_EQ`, and `COMPARISON_NE`.
     * 
     */
    @Import(name="comparison", required=true)
      private final Output<String> comparison;

    public Output<String> comparison() {
        return this.comparison;
    }

    /**
     * Specifies the alignment of data points in
     * individual time series selected by
     * denominatorFilter as well as how to combine
     * the retrieved time series together (such as
     * when aggregating multiple streams on each
     * resource to a single stream for each
     * resource or when aggregating streams across
     * all members of a group of resources).When
     * computing ratios, the aggregations and
     * denominator_aggregations fields must use the
     * same alignment period and produce time
     * series that have the same periodicity and
     * labels.This field is similar to the one in
     * the MetricService.ListTimeSeries request. It
     * is advisable to use the ListTimeSeries
     * method when debugging this field.
     * Structure is documented below.
     * 
     */
    @Import(name="denominatorAggregations")
      private final @Nullable Output<List<AlertPolicyConditionConditionThresholdDenominatorAggregationGetArgs>> denominatorAggregations;

    public Output<List<AlertPolicyConditionConditionThresholdDenominatorAggregationGetArgs>> denominatorAggregations() {
        return this.denominatorAggregations == null ? Codegen.empty() : this.denominatorAggregations;
    }

    /**
     * A filter that identifies a time series that
     * should be used as the denominator of a ratio
     * that will be compared with the threshold. If
     * a denominator_filter is specified, the time
     * series specified by the filter field will be
     * used as the numerator.The filter is similar
     * to the one that is specified in the
     * MetricService.ListTimeSeries request (that
     * call is useful to verify the time series
     * that will be retrieved / processed) and must
     * specify the metric type and optionally may
     * contain restrictions on resource type,
     * resource labels, and metric labels. This
     * field may not exceed 2048 Unicode characters
     * in length.
     * 
     */
    @Import(name="denominatorFilter")
      private final @Nullable Output<String> denominatorFilter;

    public Output<String> denominatorFilter() {
        return this.denominatorFilter == null ? Codegen.empty() : this.denominatorFilter;
    }

    /**
     * The amount of time that a time series must
     * violate the threshold to be considered
     * failing. Currently, only values that are a
     * multiple of a minute--e.g., 0, 60, 120, or
     * 300 seconds--are supported. If an invalid
     * value is given, an error will be returned.
     * When choosing a duration, it is useful to
     * keep in mind the frequency of the underlying
     * time series data (which may also be affected
     * by any alignments specified in the
     * aggregations field); a good duration is long
     * enough so that a single outlier does not
     * generate spurious alerts, but short enough
     * that unhealthy states are detected and
     * alerted on quickly.
     * 
     */
    @Import(name="duration", required=true)
      private final Output<String> duration;

    public Output<String> duration() {
        return this.duration;
    }

    /**
     * A logs-based filter.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<String> filter;

    public Output<String> filter() {
        return this.filter == null ? Codegen.empty() : this.filter;
    }

    /**
     * A value against which to compare the time
     * series.
     * 
     */
    @Import(name="thresholdValue")
      private final @Nullable Output<Double> thresholdValue;

    public Output<Double> thresholdValue() {
        return this.thresholdValue == null ? Codegen.empty() : this.thresholdValue;
    }

    /**
     * The number/percent of time series for which
     * the comparison must hold in order for the
     * condition to trigger. If unspecified, then
     * the condition will trigger if the comparison
     * is true for any of the time series that have
     * been identified by filter and aggregations,
     * or by the ratio, if denominator_filter and
     * denominator_aggregations are specified.
     * Structure is documented below.
     * 
     */
    @Import(name="trigger")
      private final @Nullable Output<AlertPolicyConditionConditionThresholdTriggerGetArgs> trigger;

    public Output<AlertPolicyConditionConditionThresholdTriggerGetArgs> trigger() {
        return this.trigger == null ? Codegen.empty() : this.trigger;
    }

    public AlertPolicyConditionConditionThresholdGetArgs(
        @Nullable Output<List<AlertPolicyConditionConditionThresholdAggregationGetArgs>> aggregations,
        Output<String> comparison,
        @Nullable Output<List<AlertPolicyConditionConditionThresholdDenominatorAggregationGetArgs>> denominatorAggregations,
        @Nullable Output<String> denominatorFilter,
        Output<String> duration,
        @Nullable Output<String> filter,
        @Nullable Output<Double> thresholdValue,
        @Nullable Output<AlertPolicyConditionConditionThresholdTriggerGetArgs> trigger) {
        this.aggregations = aggregations;
        this.comparison = Objects.requireNonNull(comparison, "expected parameter 'comparison' to be non-null");
        this.denominatorAggregations = denominatorAggregations;
        this.denominatorFilter = denominatorFilter;
        this.duration = Objects.requireNonNull(duration, "expected parameter 'duration' to be non-null");
        this.filter = filter;
        this.thresholdValue = thresholdValue;
        this.trigger = trigger;
    }

    private AlertPolicyConditionConditionThresholdGetArgs() {
        this.aggregations = Codegen.empty();
        this.comparison = Codegen.empty();
        this.denominatorAggregations = Codegen.empty();
        this.denominatorFilter = Codegen.empty();
        this.duration = Codegen.empty();
        this.filter = Codegen.empty();
        this.thresholdValue = Codegen.empty();
        this.trigger = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyConditionConditionThresholdGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<AlertPolicyConditionConditionThresholdAggregationGetArgs>> aggregations;
        private Output<String> comparison;
        private @Nullable Output<List<AlertPolicyConditionConditionThresholdDenominatorAggregationGetArgs>> denominatorAggregations;
        private @Nullable Output<String> denominatorFilter;
        private Output<String> duration;
        private @Nullable Output<String> filter;
        private @Nullable Output<Double> thresholdValue;
        private @Nullable Output<AlertPolicyConditionConditionThresholdTriggerGetArgs> trigger;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyConditionConditionThresholdGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregations = defaults.aggregations;
    	      this.comparison = defaults.comparison;
    	      this.denominatorAggregations = defaults.denominatorAggregations;
    	      this.denominatorFilter = defaults.denominatorFilter;
    	      this.duration = defaults.duration;
    	      this.filter = defaults.filter;
    	      this.thresholdValue = defaults.thresholdValue;
    	      this.trigger = defaults.trigger;
        }

        public Builder aggregations(@Nullable Output<List<AlertPolicyConditionConditionThresholdAggregationGetArgs>> aggregations) {
            this.aggregations = aggregations;
            return this;
        }
        public Builder aggregations(@Nullable List<AlertPolicyConditionConditionThresholdAggregationGetArgs> aggregations) {
            this.aggregations = Codegen.ofNullable(aggregations);
            return this;
        }
        public Builder aggregations(AlertPolicyConditionConditionThresholdAggregationGetArgs... aggregations) {
            return aggregations(List.of(aggregations));
        }
        public Builder comparison(Output<String> comparison) {
            this.comparison = Objects.requireNonNull(comparison);
            return this;
        }
        public Builder comparison(String comparison) {
            this.comparison = Output.of(Objects.requireNonNull(comparison));
            return this;
        }
        public Builder denominatorAggregations(@Nullable Output<List<AlertPolicyConditionConditionThresholdDenominatorAggregationGetArgs>> denominatorAggregations) {
            this.denominatorAggregations = denominatorAggregations;
            return this;
        }
        public Builder denominatorAggregations(@Nullable List<AlertPolicyConditionConditionThresholdDenominatorAggregationGetArgs> denominatorAggregations) {
            this.denominatorAggregations = Codegen.ofNullable(denominatorAggregations);
            return this;
        }
        public Builder denominatorAggregations(AlertPolicyConditionConditionThresholdDenominatorAggregationGetArgs... denominatorAggregations) {
            return denominatorAggregations(List.of(denominatorAggregations));
        }
        public Builder denominatorFilter(@Nullable Output<String> denominatorFilter) {
            this.denominatorFilter = denominatorFilter;
            return this;
        }
        public Builder denominatorFilter(@Nullable String denominatorFilter) {
            this.denominatorFilter = Codegen.ofNullable(denominatorFilter);
            return this;
        }
        public Builder duration(Output<String> duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        public Builder duration(String duration) {
            this.duration = Output.of(Objects.requireNonNull(duration));
            return this;
        }
        public Builder filter(@Nullable Output<String> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable String filter) {
            this.filter = Codegen.ofNullable(filter);
            return this;
        }
        public Builder thresholdValue(@Nullable Output<Double> thresholdValue) {
            this.thresholdValue = thresholdValue;
            return this;
        }
        public Builder thresholdValue(@Nullable Double thresholdValue) {
            this.thresholdValue = Codegen.ofNullable(thresholdValue);
            return this;
        }
        public Builder trigger(@Nullable Output<AlertPolicyConditionConditionThresholdTriggerGetArgs> trigger) {
            this.trigger = trigger;
            return this;
        }
        public Builder trigger(@Nullable AlertPolicyConditionConditionThresholdTriggerGetArgs trigger) {
            this.trigger = Codegen.ofNullable(trigger);
            return this;
        }        public AlertPolicyConditionConditionThresholdGetArgs build() {
            return new AlertPolicyConditionConditionThresholdGetArgs(aggregations, comparison, denominatorAggregations, denominatorFilter, duration, filter, thresholdValue, trigger);
        }
    }
}
