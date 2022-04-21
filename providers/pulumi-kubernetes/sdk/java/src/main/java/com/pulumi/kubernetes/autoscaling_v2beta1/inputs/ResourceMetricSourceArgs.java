// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling_v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the &#34;pods&#34; source.  Only one &#34;target&#34; type should be set.
 * 
 */
public final class ResourceMetricSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceMetricSourceArgs Empty = new ResourceMetricSourceArgs();

    /**
     * name is the name of the resource in question.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * targetAverageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
     * 
     */
    @Import(name="targetAverageUtilization")
    private @Nullable Output<Integer> targetAverageUtilization;

    public Optional<Output<Integer>> targetAverageUtilization() {
        return Optional.ofNullable(this.targetAverageUtilization);
    }

    /**
     * targetAverageValue is the target value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the &#34;pods&#34; metric source type.
     * 
     */
    @Import(name="targetAverageValue")
    private @Nullable Output<String> targetAverageValue;

    public Optional<Output<String>> targetAverageValue() {
        return Optional.ofNullable(this.targetAverageValue);
    }

    private ResourceMetricSourceArgs() {}

    private ResourceMetricSourceArgs(ResourceMetricSourceArgs $) {
        this.name = $.name;
        this.targetAverageUtilization = $.targetAverageUtilization;
        this.targetAverageValue = $.targetAverageValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceMetricSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceMetricSourceArgs $;

        public Builder() {
            $ = new ResourceMetricSourceArgs();
        }

        public Builder(ResourceMetricSourceArgs defaults) {
            $ = new ResourceMetricSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder targetAverageUtilization(@Nullable Output<Integer> targetAverageUtilization) {
            $.targetAverageUtilization = targetAverageUtilization;
            return this;
        }

        public Builder targetAverageUtilization(Integer targetAverageUtilization) {
            return targetAverageUtilization(Output.of(targetAverageUtilization));
        }

        public Builder targetAverageValue(@Nullable Output<String> targetAverageValue) {
            $.targetAverageValue = targetAverageValue;
            return this;
        }

        public Builder targetAverageValue(String targetAverageValue) {
            return targetAverageValue(Output.of(targetAverageValue));
        }

        public ResourceMetricSourceArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
