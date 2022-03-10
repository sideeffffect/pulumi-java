// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v3.inputs.AggregationArgs;
import io.pulumi.googlenative.monitoring_v3.inputs.TriggerArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A condition type that checks that monitored resources are reporting data. The configuration defines a metric and a set of monitored resources. The predicate is considered in violation when a time series for the specified metric of a monitored resource does not include any data in the specified duration.
 * 
 */
public final class MetricAbsenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricAbsenceArgs Empty = new MetricAbsenceArgs();

    /**
     * Specifies the alignment of data points in individual time series as well as how to combine the retrieved time series together (such as when aggregating multiple streams on each resource to a single stream for each resource or when aggregating streams across all members of a group of resources). Multiple aggregations are applied in the order specified.This field is similar to the one in the ListTimeSeries request (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list). It is advisable to use the ListTimeSeries method when debugging this field.
     * 
     */
    @InputImport(name="aggregations")
      private final @Nullable Input<List<AggregationArgs>> aggregations;

    public Input<List<AggregationArgs>> getAggregations() {
        return this.aggregations == null ? Input.empty() : this.aggregations;
    }

    /**
     * The amount of time that a time series must fail to report new data to be considered failing. The minimum value of this field is 120 seconds. Larger values that are a multiple of a minute--for example, 240 or 300 seconds--are supported. If an invalid value is given, an error will be returned. The Duration.nanos field is ignored.
     * 
     */
    @InputImport(name="duration")
      private final @Nullable Input<String> duration;

    public Input<String> getDuration() {
        return this.duration == null ? Input.empty() : this.duration;
    }

    /**
     * A filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies which time series should be compared with the threshold.The filter is similar to the one that is specified in the ListTimeSeries request (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list) (that call is useful to verify the time series that will be retrieved / processed). The filter must specify the metric type and the resource type. Optionally, it can specify resource labels and metric labels. This field must not exceed 2048 Unicode characters in length.
     * 
     */
    @InputImport(name="filter", required=true)
      private final Input<String> filter;

    public Input<String> getFilter() {
        return this.filter;
    }

    /**
     * The number/percent of time series for which the comparison must hold in order for the condition to trigger. If unspecified, then the condition will trigger if the comparison is true for any of the time series that have been identified by filter and aggregations.
     * 
     */
    @InputImport(name="trigger")
      private final @Nullable Input<TriggerArgs> trigger;

    public Input<TriggerArgs> getTrigger() {
        return this.trigger == null ? Input.empty() : this.trigger;
    }

    public MetricAbsenceArgs(
        @Nullable Input<List<AggregationArgs>> aggregations,
        @Nullable Input<String> duration,
        Input<String> filter,
        @Nullable Input<TriggerArgs> trigger) {
        this.aggregations = aggregations;
        this.duration = duration;
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.trigger = trigger;
    }

    private MetricAbsenceArgs() {
        this.aggregations = Input.empty();
        this.duration = Input.empty();
        this.filter = Input.empty();
        this.trigger = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricAbsenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AggregationArgs>> aggregations;
        private @Nullable Input<String> duration;
        private Input<String> filter;
        private @Nullable Input<TriggerArgs> trigger;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricAbsenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregations = defaults.aggregations;
    	      this.duration = defaults.duration;
    	      this.filter = defaults.filter;
    	      this.trigger = defaults.trigger;
        }

        public Builder aggregations(@Nullable Input<List<AggregationArgs>> aggregations) {
            this.aggregations = aggregations;
            return this;
        }

        public Builder aggregations(@Nullable List<AggregationArgs> aggregations) {
            this.aggregations = Input.ofNullable(aggregations);
            return this;
        }

        public Builder duration(@Nullable Input<String> duration) {
            this.duration = duration;
            return this;
        }

        public Builder duration(@Nullable String duration) {
            this.duration = Input.ofNullable(duration);
            return this;
        }

        public Builder filter(Input<String> filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder filter(String filter) {
            this.filter = Input.of(Objects.requireNonNull(filter));
            return this;
        }

        public Builder trigger(@Nullable Input<TriggerArgs> trigger) {
            this.trigger = trigger;
            return this;
        }

        public Builder trigger(@Nullable TriggerArgs trigger) {
            this.trigger = Input.ofNullable(trigger);
            return this;
        }
        public MetricAbsenceArgs build() {
            return new MetricAbsenceArgs(aggregations, duration, filter, trigger);
        }
    }
}
