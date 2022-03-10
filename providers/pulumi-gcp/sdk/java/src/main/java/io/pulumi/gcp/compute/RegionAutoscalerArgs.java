// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionAutoscalerArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionAutoscalerArgs Empty = new RegionAutoscalerArgs();

    /**
     * The configuration parameters for the autoscaling algorithm. You can
     * define one or more of the policies for an autoscaler: cpuUtilization,
     * customMetricUtilizations, and loadBalancingUtilization.
     * If none of these are specified, the default will be to autoscale based
     * on cpuUtilization to 0.6 or 60%.
     * Structure is documented below.
     * 
     */
    @InputImport(name="autoscalingPolicy", required=true)
      private final Input<RegionAutoscalerAutoscalingPolicyArgs> autoscalingPolicy;

    public Input<RegionAutoscalerAutoscalingPolicyArgs> getAutoscalingPolicy() {
        return this.autoscalingPolicy;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * URL of the region where the instance group resides.
     * 
     */
    @InputImport(name="region")
      private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * Fraction of backend capacity utilization (set in HTTP(s) load
     * balancing configuration) that autoscaler should maintain. Must
     * be a positive float value. If not defined, the default is 0.8.
     * 
     */
    @InputImport(name="target", required=true)
      private final Input<String> target;

    public Input<String> getTarget() {
        return this.target;
    }

    public RegionAutoscalerArgs(
        Input<RegionAutoscalerAutoscalingPolicyArgs> autoscalingPolicy,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        Input<String> target) {
        this.autoscalingPolicy = Objects.requireNonNull(autoscalingPolicy, "expected parameter 'autoscalingPolicy' to be non-null");
        this.description = description;
        this.name = name;
        this.project = project;
        this.region = region;
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private RegionAutoscalerArgs() {
        this.autoscalingPolicy = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.target = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionAutoscalerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<RegionAutoscalerAutoscalingPolicyArgs> autoscalingPolicy;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private Input<String> target;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionAutoscalerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingPolicy = defaults.autoscalingPolicy;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.target = defaults.target;
        }

        public Builder autoscalingPolicy(Input<RegionAutoscalerAutoscalingPolicyArgs> autoscalingPolicy) {
            this.autoscalingPolicy = Objects.requireNonNull(autoscalingPolicy);
            return this;
        }

        public Builder autoscalingPolicy(RegionAutoscalerAutoscalingPolicyArgs autoscalingPolicy) {
            this.autoscalingPolicy = Input.of(Objects.requireNonNull(autoscalingPolicy));
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder region(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder target(Input<String> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder target(String target) {
            this.target = Input.of(Objects.requireNonNull(target));
            return this;
        }
        public RegionAutoscalerArgs build() {
            return new RegionAutoscalerArgs(autoscalingPolicy, description, name, project, region, target);
        }
    }
}
