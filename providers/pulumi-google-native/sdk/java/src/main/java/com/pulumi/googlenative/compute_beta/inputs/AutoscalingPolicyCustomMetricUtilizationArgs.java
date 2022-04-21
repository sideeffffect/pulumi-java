// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.enums.AutoscalingPolicyCustomMetricUtilizationUtilizationTargetType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Custom utilization metric policy.
 * 
 */
public final class AutoscalingPolicyCustomMetricUtilizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoscalingPolicyCustomMetricUtilizationArgs Empty = new AutoscalingPolicyCustomMetricUtilizationArgs();

    /**
     * A filter string, compatible with a Stackdriver Monitoring filter string for TimeSeries.list API call. This filter is used to select a specific TimeSeries for the purpose of autoscaling and to determine whether the metric is exporting per-instance or per-group data. For the filter to be valid for autoscaling purposes, the following rules apply: - You can only use the AND operator for joining selectors. - You can only use direct equality comparison operator (=) without any functions for each selector. - You can specify the metric in both the filter string and in the metric field. However, if specified in both places, the metric must be identical. - The monitored resource type determines what kind of values are expected for the metric. If it is a gce_instance, the autoscaler expects the metric to include a separate TimeSeries for each instance in a group. In such a case, you cannot filter on resource labels. If the resource type is any other value, the autoscaler expects this metric to contain values that apply to the entire autoscaled instance group and resource label filtering can be performed to point autoscaler at the correct TimeSeries to scale upon. This is called a *per-group metric* for the purpose of autoscaling. If not specified, the type defaults to gce_instance. Try to provide a filter that is selective enough to pick just one TimeSeries for the autoscaled group or for each of the instances (if you are using gce_instance resource type). If multiple TimeSeries are returned upon the query execution, the autoscaler will sum their respective values to obtain its scaling value.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<String> filter;

    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * The identifier (type) of the Stackdriver Monitoring metric. The metric cannot have negative values. The metric must have a value type of INT64 or DOUBLE.
     * 
     */
    @Import(name="metric")
    private @Nullable Output<String> metric;

    public Optional<Output<String>> metric() {
        return Optional.ofNullable(this.metric);
    }

    /**
     * If scaling is based on a per-group metric value that represents the total amount of work to be done or resource usage, set this value to an amount assigned for a single instance of the scaled group. Autoscaler keeps the number of instances proportional to the value of this metric. The metric itself does not change value due to group resizing. A good metric to use with the target is for example pubsub.googleapis.com/subscription/num_undelivered_messages or a custom metric exporting the total number of requests coming to your instances. A bad example would be a metric exporting an average or median latency, since this value can&#39;t include a chunk assignable to a single instance, it could be better used with utilization_target instead.
     * 
     */
    @Import(name="singleInstanceAssignment")
    private @Nullable Output<Double> singleInstanceAssignment;

    public Optional<Output<Double>> singleInstanceAssignment() {
        return Optional.ofNullable(this.singleInstanceAssignment);
    }

    /**
     * The target value of the metric that autoscaler maintains. This must be a positive value. A utilization metric scales number of virtual machines handling requests to increase or decrease proportionally to the metric. For example, a good metric to use as a utilization_target is https://www.googleapis.com/compute/v1/instance/network/received_bytes_count. The autoscaler works to keep this value constant for each of the instances.
     * 
     */
    @Import(name="utilizationTarget")
    private @Nullable Output<Double> utilizationTarget;

    public Optional<Output<Double>> utilizationTarget() {
        return Optional.ofNullable(this.utilizationTarget);
    }

    /**
     * Defines how target utilization value is expressed for a Stackdriver Monitoring metric. Either GAUGE, DELTA_PER_SECOND, or DELTA_PER_MINUTE.
     * 
     */
    @Import(name="utilizationTargetType")
    private @Nullable Output<AutoscalingPolicyCustomMetricUtilizationUtilizationTargetType> utilizationTargetType;

    public Optional<Output<AutoscalingPolicyCustomMetricUtilizationUtilizationTargetType>> utilizationTargetType() {
        return Optional.ofNullable(this.utilizationTargetType);
    }

    private AutoscalingPolicyCustomMetricUtilizationArgs() {}

    private AutoscalingPolicyCustomMetricUtilizationArgs(AutoscalingPolicyCustomMetricUtilizationArgs $) {
        this.filter = $.filter;
        this.metric = $.metric;
        this.singleInstanceAssignment = $.singleInstanceAssignment;
        this.utilizationTarget = $.utilizationTarget;
        this.utilizationTargetType = $.utilizationTargetType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoscalingPolicyCustomMetricUtilizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscalingPolicyCustomMetricUtilizationArgs $;

        public Builder() {
            $ = new AutoscalingPolicyCustomMetricUtilizationArgs();
        }

        public Builder(AutoscalingPolicyCustomMetricUtilizationArgs defaults) {
            $ = new AutoscalingPolicyCustomMetricUtilizationArgs(Objects.requireNonNull(defaults));
        }

        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        public Builder metric(@Nullable Output<String> metric) {
            $.metric = metric;
            return this;
        }

        public Builder metric(String metric) {
            return metric(Output.of(metric));
        }

        public Builder singleInstanceAssignment(@Nullable Output<Double> singleInstanceAssignment) {
            $.singleInstanceAssignment = singleInstanceAssignment;
            return this;
        }

        public Builder singleInstanceAssignment(Double singleInstanceAssignment) {
            return singleInstanceAssignment(Output.of(singleInstanceAssignment));
        }

        public Builder utilizationTarget(@Nullable Output<Double> utilizationTarget) {
            $.utilizationTarget = utilizationTarget;
            return this;
        }

        public Builder utilizationTarget(Double utilizationTarget) {
            return utilizationTarget(Output.of(utilizationTarget));
        }

        public Builder utilizationTargetType(@Nullable Output<AutoscalingPolicyCustomMetricUtilizationUtilizationTargetType> utilizationTargetType) {
            $.utilizationTargetType = utilizationTargetType;
            return this;
        }

        public Builder utilizationTargetType(AutoscalingPolicyCustomMetricUtilizationUtilizationTargetType utilizationTargetType) {
            return utilizationTargetType(Output.of(utilizationTargetType));
        }

        public AutoscalingPolicyCustomMetricUtilizationArgs build() {
            return $;
        }
    }

}
