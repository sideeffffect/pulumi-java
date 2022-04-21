// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Allows autoscaling based on Stackdriver metrics.
 * 
 */
public final class CustomMetricResponse extends com.pulumi.resources.InvokeArgs {

    public static final CustomMetricResponse Empty = new CustomMetricResponse();

    /**
     * Allows filtering on the metric&#39;s fields.
     * 
     */
    @Import(name="filter", required=true)
    private String filter;

    public String filter() {
        return this.filter;
    }

    /**
     * The name of the metric.
     * 
     */
    @Import(name="metricName", required=true)
    private String metricName;

    public String metricName() {
        return this.metricName;
    }

    /**
     * May be used instead of target_utilization when an instance can handle a specific amount of work/resources and the metric value is equal to the current amount of work remaining. The autoscaler will try to keep the number of instances equal to the metric value divided by single_instance_assignment.
     * 
     */
    @Import(name="singleInstanceAssignment", required=true)
    private Double singleInstanceAssignment;

    public Double singleInstanceAssignment() {
        return this.singleInstanceAssignment;
    }

    /**
     * The type of the metric. Must be a string representing a Stackdriver metric type e.g. GAGUE, DELTA_PER_SECOND, etc.
     * 
     */
    @Import(name="targetType", required=true)
    private String targetType;

    public String targetType() {
        return this.targetType;
    }

    /**
     * The target value for the metric.
     * 
     */
    @Import(name="targetUtilization", required=true)
    private Double targetUtilization;

    public Double targetUtilization() {
        return this.targetUtilization;
    }

    private CustomMetricResponse() {}

    private CustomMetricResponse(CustomMetricResponse $) {
        this.filter = $.filter;
        this.metricName = $.metricName;
        this.singleInstanceAssignment = $.singleInstanceAssignment;
        this.targetType = $.targetType;
        this.targetUtilization = $.targetUtilization;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomMetricResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomMetricResponse $;

        public Builder() {
            $ = new CustomMetricResponse();
        }

        public Builder(CustomMetricResponse defaults) {
            $ = new CustomMetricResponse(Objects.requireNonNull(defaults));
        }

        public Builder filter(String filter) {
            $.filter = filter;
            return this;
        }

        public Builder metricName(String metricName) {
            $.metricName = metricName;
            return this;
        }

        public Builder singleInstanceAssignment(Double singleInstanceAssignment) {
            $.singleInstanceAssignment = singleInstanceAssignment;
            return this;
        }

        public Builder targetType(String targetType) {
            $.targetType = targetType;
            return this;
        }

        public Builder targetUtilization(Double targetUtilization) {
            $.targetUtilization = targetUtilization;
            return this;
        }

        public CustomMetricResponse build() {
            $.filter = Objects.requireNonNull($.filter, "expected parameter 'filter' to be non-null");
            $.metricName = Objects.requireNonNull($.metricName, "expected parameter 'metricName' to be non-null");
            $.singleInstanceAssignment = Objects.requireNonNull($.singleInstanceAssignment, "expected parameter 'singleInstanceAssignment' to be non-null");
            $.targetType = Objects.requireNonNull($.targetType, "expected parameter 'targetType' to be non-null");
            $.targetUtilization = Objects.requireNonNull($.targetUtilization, "expected parameter 'targetUtilization' to be non-null");
            return $;
        }
    }

}
