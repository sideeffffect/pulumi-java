// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.AutoscalarAutoscalingPolicyArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutoscalarArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoscalarArgs Empty = new AutoscalarArgs();

    /**
     * The configuration parameters for the autoscaling algorithm. You can
     * define one or more of the policies for an autoscaler: cpuUtilization,
     * customMetricUtilizations, and loadBalancingUtilization.
     * If none of these are specified, the default will be to autoscale based
     * on cpuUtilization to 0.6 or 60%.
     * Structure is documented below.
     * 
     */
    @Import(name="autoscalingPolicy", required=true)
    private Output<AutoscalarAutoscalingPolicyArgs> autoscalingPolicy;

    public Output<AutoscalarAutoscalingPolicyArgs> autoscalingPolicy() {
        return this.autoscalingPolicy;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Fraction of backend capacity utilization (set in HTTP(s) load
     * balancing configuration) that autoscaler should maintain. Must
     * be a positive float value. If not defined, the default is 0.8.
     * 
     */
    @Import(name="target", required=true)
    private Output<String> target;

    public Output<String> target() {
        return this.target;
    }

    /**
     * URL of the zone where the instance group resides.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private AutoscalarArgs() {}

    private AutoscalarArgs(AutoscalarArgs $) {
        this.autoscalingPolicy = $.autoscalingPolicy;
        this.description = $.description;
        this.name = $.name;
        this.project = $.project;
        this.target = $.target;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoscalarArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscalarArgs $;

        public Builder() {
            $ = new AutoscalarArgs();
        }

        public Builder(AutoscalarArgs defaults) {
            $ = new AutoscalarArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoscalingPolicy(Output<AutoscalarAutoscalingPolicyArgs> autoscalingPolicy) {
            $.autoscalingPolicy = autoscalingPolicy;
            return this;
        }

        public Builder autoscalingPolicy(AutoscalarAutoscalingPolicyArgs autoscalingPolicy) {
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

        public Builder target(Output<String> target) {
            $.target = target;
            return this;
        }

        public Builder target(String target) {
            return target(Output.of(target));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public AutoscalarArgs build() {
            $.autoscalingPolicy = Objects.requireNonNull($.autoscalingPolicy, "expected parameter 'autoscalingPolicy' to be non-null");
            $.target = Objects.requireNonNull($.target, "expected parameter 'target' to be non-null");
            return $;
        }
    }

}
