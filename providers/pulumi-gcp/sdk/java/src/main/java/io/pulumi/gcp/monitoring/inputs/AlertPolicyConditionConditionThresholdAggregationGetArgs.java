// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlertPolicyConditionConditionThresholdAggregationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertPolicyConditionConditionThresholdAggregationGetArgs Empty = new AlertPolicyConditionConditionThresholdAggregationGetArgs();

    /**
     * The alignment period for per-time
     * series alignment. If present,
     * alignmentPeriod must be at least
     * 60 seconds. After per-time series
     * alignment, each time series will
     * contain data points only on the
     * period boundaries. If
     * perSeriesAligner is not specified
     * or equals ALIGN_NONE, then this
     * field is ignored. If
     * perSeriesAligner is specified and
     * does not equal ALIGN_NONE, then
     * this field must be defined;
     * otherwise an error is returned.
     * 
     */
    @Import(name="alignmentPeriod")
      private final @Nullable Output<String> alignmentPeriod;

    public Output<String> alignmentPeriod() {
        return this.alignmentPeriod == null ? Codegen.empty() : this.alignmentPeriod;
    }

    /**
     * The approach to be used to combine
     * time series. Not all reducer
     * functions may be applied to all
     * time series, depending on the
     * metric type and the value type of
     * the original time series.
     * Reduction may change the metric
     * type of value type of the time
     * series.Time series data must be
     * aligned in order to perform cross-
     * time series reduction. If
     * crossSeriesReducer is specified,
     * then perSeriesAligner must be
     * specified and not equal ALIGN_NONE
     * and alignmentPeriod must be
     * specified; otherwise, an error is
     * returned.
     * Possible values are `REDUCE_NONE`, `REDUCE_MEAN`, `REDUCE_MIN`, `REDUCE_MAX`, `REDUCE_SUM`, `REDUCE_STDDEV`, `REDUCE_COUNT`, `REDUCE_COUNT_TRUE`, `REDUCE_COUNT_FALSE`, `REDUCE_FRACTION_TRUE`, `REDUCE_PERCENTILE_99`, `REDUCE_PERCENTILE_95`, `REDUCE_PERCENTILE_50`, and `REDUCE_PERCENTILE_05`.
     * 
     */
    @Import(name="crossSeriesReducer")
      private final @Nullable Output<String> crossSeriesReducer;

    public Output<String> crossSeriesReducer() {
        return this.crossSeriesReducer == null ? Codegen.empty() : this.crossSeriesReducer;
    }

    /**
     * The set of fields to preserve when
     * crossSeriesReducer is specified.
     * The groupByFields determine how
     * the time series are partitioned
     * into subsets prior to applying the
     * aggregation function. Each subset
     * contains time series that have the
     * same value for each of the
     * grouping fields. Each individual
     * time series is a member of exactly
     * one subset. The crossSeriesReducer
     * is applied to each subset of time
     * series. It is not possible to
     * reduce across different resource
     * types, so this field implicitly
     * contains resource.type. Fields not
     * specified in groupByFields are
     * aggregated away. If groupByFields
     * is not specified and all the time
     * series have the same resource
     * type, then the time series are
     * aggregated into a single output
     * time series. If crossSeriesReducer
     * is not defined, this field is
     * ignored.
     * 
     */
    @Import(name="groupByFields")
      private final @Nullable Output<List<String>> groupByFields;

    public Output<List<String>> groupByFields() {
        return this.groupByFields == null ? Codegen.empty() : this.groupByFields;
    }

    /**
     * The approach to be used to align
     * individual time series. Not all
     * alignment functions may be applied
     * to all time series, depending on
     * the metric type and value type of
     * the original time series.
     * Alignment may change the metric
     * type or the value type of the time
     * series.Time series data must be
     * aligned in order to perform cross-
     * time series reduction. If
     * crossSeriesReducer is specified,
     * then perSeriesAligner must be
     * specified and not equal ALIGN_NONE
     * and alignmentPeriod must be
     * specified; otherwise, an error is
     * returned.
     * Possible values are `ALIGN_NONE`, `ALIGN_DELTA`, `ALIGN_RATE`, `ALIGN_INTERPOLATE`, `ALIGN_NEXT_OLDER`, `ALIGN_MIN`, `ALIGN_MAX`, `ALIGN_MEAN`, `ALIGN_COUNT`, `ALIGN_SUM`, `ALIGN_STDDEV`, `ALIGN_COUNT_TRUE`, `ALIGN_COUNT_FALSE`, `ALIGN_FRACTION_TRUE`, `ALIGN_PERCENTILE_99`, `ALIGN_PERCENTILE_95`, `ALIGN_PERCENTILE_50`, `ALIGN_PERCENTILE_05`, and `ALIGN_PERCENT_CHANGE`.
     * 
     */
    @Import(name="perSeriesAligner")
      private final @Nullable Output<String> perSeriesAligner;

    public Output<String> perSeriesAligner() {
        return this.perSeriesAligner == null ? Codegen.empty() : this.perSeriesAligner;
    }

    public AlertPolicyConditionConditionThresholdAggregationGetArgs(
        @Nullable Output<String> alignmentPeriod,
        @Nullable Output<String> crossSeriesReducer,
        @Nullable Output<List<String>> groupByFields,
        @Nullable Output<String> perSeriesAligner) {
        this.alignmentPeriod = alignmentPeriod;
        this.crossSeriesReducer = crossSeriesReducer;
        this.groupByFields = groupByFields;
        this.perSeriesAligner = perSeriesAligner;
    }

    private AlertPolicyConditionConditionThresholdAggregationGetArgs() {
        this.alignmentPeriod = Codegen.empty();
        this.crossSeriesReducer = Codegen.empty();
        this.groupByFields = Codegen.empty();
        this.perSeriesAligner = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyConditionConditionThresholdAggregationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> alignmentPeriod;
        private @Nullable Output<String> crossSeriesReducer;
        private @Nullable Output<List<String>> groupByFields;
        private @Nullable Output<String> perSeriesAligner;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyConditionConditionThresholdAggregationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alignmentPeriod = defaults.alignmentPeriod;
    	      this.crossSeriesReducer = defaults.crossSeriesReducer;
    	      this.groupByFields = defaults.groupByFields;
    	      this.perSeriesAligner = defaults.perSeriesAligner;
        }

        public Builder alignmentPeriod(@Nullable Output<String> alignmentPeriod) {
            this.alignmentPeriod = alignmentPeriod;
            return this;
        }
        public Builder alignmentPeriod(@Nullable String alignmentPeriod) {
            this.alignmentPeriod = Codegen.ofNullable(alignmentPeriod);
            return this;
        }
        public Builder crossSeriesReducer(@Nullable Output<String> crossSeriesReducer) {
            this.crossSeriesReducer = crossSeriesReducer;
            return this;
        }
        public Builder crossSeriesReducer(@Nullable String crossSeriesReducer) {
            this.crossSeriesReducer = Codegen.ofNullable(crossSeriesReducer);
            return this;
        }
        public Builder groupByFields(@Nullable Output<List<String>> groupByFields) {
            this.groupByFields = groupByFields;
            return this;
        }
        public Builder groupByFields(@Nullable List<String> groupByFields) {
            this.groupByFields = Codegen.ofNullable(groupByFields);
            return this;
        }
        public Builder groupByFields(String... groupByFields) {
            return groupByFields(List.of(groupByFields));
        }
        public Builder perSeriesAligner(@Nullable Output<String> perSeriesAligner) {
            this.perSeriesAligner = perSeriesAligner;
            return this;
        }
        public Builder perSeriesAligner(@Nullable String perSeriesAligner) {
            this.perSeriesAligner = Codegen.ofNullable(perSeriesAligner);
            return this;
        }        public AlertPolicyConditionConditionThresholdAggregationGetArgs build() {
            return new AlertPolicyConditionConditionThresholdAggregationGetArgs(alignmentPeriod, crossSeriesReducer, groupByFields, perSeriesAligner);
        }
    }
}
