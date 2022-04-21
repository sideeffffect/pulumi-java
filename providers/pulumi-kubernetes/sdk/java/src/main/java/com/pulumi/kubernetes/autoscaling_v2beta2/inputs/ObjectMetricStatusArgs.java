// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling_v2beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.autoscaling_v2beta2.inputs.CrossVersionObjectReferenceArgs;
import com.pulumi.kubernetes.autoscaling_v2beta2.inputs.MetricIdentifierArgs;
import com.pulumi.kubernetes.autoscaling_v2beta2.inputs.MetricValueStatusArgs;
import java.util.Objects;


/**
 * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
 * 
 */
public final class ObjectMetricStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectMetricStatusArgs Empty = new ObjectMetricStatusArgs();

    /**
     * current contains the current value for the given metric
     * 
     */
    @Import(name="current", required=true)
    private Output<MetricValueStatusArgs> current;

    public Output<MetricValueStatusArgs> current() {
        return this.current;
    }

    @Import(name="describedObject", required=true)
    private Output<CrossVersionObjectReferenceArgs> describedObject;

    public Output<CrossVersionObjectReferenceArgs> describedObject() {
        return this.describedObject;
    }

    /**
     * metric identifies the target metric by name and selector
     * 
     */
    @Import(name="metric", required=true)
    private Output<MetricIdentifierArgs> metric;

    public Output<MetricIdentifierArgs> metric() {
        return this.metric;
    }

    private ObjectMetricStatusArgs() {}

    private ObjectMetricStatusArgs(ObjectMetricStatusArgs $) {
        this.current = $.current;
        this.describedObject = $.describedObject;
        this.metric = $.metric;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectMetricStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectMetricStatusArgs $;

        public Builder() {
            $ = new ObjectMetricStatusArgs();
        }

        public Builder(ObjectMetricStatusArgs defaults) {
            $ = new ObjectMetricStatusArgs(Objects.requireNonNull(defaults));
        }

        public Builder current(Output<MetricValueStatusArgs> current) {
            $.current = current;
            return this;
        }

        public Builder current(MetricValueStatusArgs current) {
            return current(Output.of(current));
        }

        public Builder describedObject(Output<CrossVersionObjectReferenceArgs> describedObject) {
            $.describedObject = describedObject;
            return this;
        }

        public Builder describedObject(CrossVersionObjectReferenceArgs describedObject) {
            return describedObject(Output.of(describedObject));
        }

        public Builder metric(Output<MetricIdentifierArgs> metric) {
            $.metric = metric;
            return this;
        }

        public Builder metric(MetricIdentifierArgs metric) {
            return metric(Output.of(metric));
        }

        public ObjectMetricStatusArgs build() {
            $.current = Objects.requireNonNull($.current, "expected parameter 'current' to be non-null");
            $.describedObject = Objects.requireNonNull($.describedObject, "expected parameter 'describedObject' to be non-null");
            $.metric = Objects.requireNonNull($.metric, "expected parameter 'metric' to be non-null");
            return $;
        }
    }

}
