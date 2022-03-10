// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.AutoscalingPolicyArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscalerArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalerArgs Empty = new AutoscalerArgs();

    /**
     * The configuration parameters for the autoscaling algorithm. You can define one or more signals for an autoscaler: cpuUtilization, customMetricUtilizations, and loadBalancingUtilization. If none of these are specified, the default will be to autoscale based on cpuUtilization to 0.6 or 60%.
     * 
     */
    @InputImport(name="autoscalingPolicy")
      private final @Nullable Input<AutoscalingPolicyArgs> autoscalingPolicy;

    public Input<AutoscalingPolicyArgs> getAutoscalingPolicy() {
        return this.autoscalingPolicy == null ? Input.empty() : this.autoscalingPolicy;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * URL of the managed instance group that this autoscaler will scale. This field is required when creating an autoscaler.
     * 
     */
    @InputImport(name="target")
      private final @Nullable Input<String> target;

    public Input<String> getTarget() {
        return this.target == null ? Input.empty() : this.target;
    }

    @InputImport(name="zone")
      private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public AutoscalerArgs(
        @Nullable Input<AutoscalingPolicyArgs> autoscalingPolicy,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<String> target,
        @Nullable Input<String> zone) {
        this.autoscalingPolicy = autoscalingPolicy;
        this.description = description;
        this.name = name;
        this.project = project;
        this.requestId = requestId;
        this.target = target;
        this.zone = zone;
    }

    private AutoscalerArgs() {
        this.autoscalingPolicy = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.target = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AutoscalingPolicyArgs> autoscalingPolicy;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<String> target;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingPolicy = defaults.autoscalingPolicy;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.target = defaults.target;
    	      this.zone = defaults.zone;
        }

        public Builder autoscalingPolicy(@Nullable Input<AutoscalingPolicyArgs> autoscalingPolicy) {
            this.autoscalingPolicy = autoscalingPolicy;
            return this;
        }

        public Builder autoscalingPolicy(@Nullable AutoscalingPolicyArgs autoscalingPolicy) {
            this.autoscalingPolicy = Input.ofNullable(autoscalingPolicy);
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

        public Builder requestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder target(@Nullable Input<String> target) {
            this.target = target;
            return this;
        }

        public Builder target(@Nullable String target) {
            this.target = Input.ofNullable(target);
            return this;
        }

        public Builder zone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder zone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }
        public AutoscalerArgs build() {
            return new AutoscalerArgs(autoscalingPolicy, description, name, project, requestId, target, zone);
        }
    }
}
