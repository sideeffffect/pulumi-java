// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.inputs.AutoscalingPolicyArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionAutoscalerArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionAutoscalerArgs Empty = new RegionAutoscalerArgs();

    /**
     * The configuration parameters for the autoscaling algorithm. You can define one or more signals for an autoscaler: cpuUtilization, customMetricUtilizations, and loadBalancingUtilization. If none of these are specified, the default will be to autoscale based on cpuUtilization to 0.6 or 60%.
     * 
     */
    @Import(name="autoscalingPolicy")
    private @Nullable Output<AutoscalingPolicyArgs> autoscalingPolicy;

    public Optional<Output<AutoscalingPolicyArgs>> autoscalingPolicy() {
        return Optional.ofNullable(this.autoscalingPolicy);
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * URL of the managed instance group that this autoscaler will scale. This field is required when creating an autoscaler.
     * 
     */
    @Import(name="target")
    private @Nullable Output<String> target;

    public Optional<Output<String>> target() {
        return Optional.ofNullable(this.target);
    }

    private RegionAutoscalerArgs() {}

    private RegionAutoscalerArgs(RegionAutoscalerArgs $) {
        this.autoscalingPolicy = $.autoscalingPolicy;
        this.description = $.description;
        this.name = $.name;
        this.project = $.project;
        this.region = $.region;
        this.requestId = $.requestId;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionAutoscalerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionAutoscalerArgs $;

        public Builder() {
            $ = new RegionAutoscalerArgs();
        }

        public Builder(RegionAutoscalerArgs defaults) {
            $ = new RegionAutoscalerArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoscalingPolicy(@Nullable Output<AutoscalingPolicyArgs> autoscalingPolicy) {
            $.autoscalingPolicy = autoscalingPolicy;
            return this;
        }

        public Builder autoscalingPolicy(AutoscalingPolicyArgs autoscalingPolicy) {
            return autoscalingPolicy(Output.of(autoscalingPolicy));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder target(@Nullable Output<String> target) {
            $.target = target;
            return this;
        }

        public Builder target(String target) {
            return target(Output.of(target));
        }

        public RegionAutoscalerArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
