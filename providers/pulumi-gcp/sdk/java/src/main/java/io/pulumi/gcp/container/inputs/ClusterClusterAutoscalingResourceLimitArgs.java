// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClusterAutoscalingResourceLimitArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClusterAutoscalingResourceLimitArgs Empty = new ClusterClusterAutoscalingResourceLimitArgs();

    /**
     * Maximum amount of the resource in the cluster.
     * 
     */
    @Import(name="maximum")
      private final @Nullable Output<Integer> maximum;

    public Output<Integer> maximum() {
        return this.maximum == null ? Codegen.empty() : this.maximum;
    }

    /**
     * Minimum amount of the resource in the cluster.
     * 
     */
    @Import(name="minimum")
      private final @Nullable Output<Integer> minimum;

    public Output<Integer> minimum() {
        return this.minimum == null ? Codegen.empty() : this.minimum;
    }

    /**
     * The type of the resource. For example, `cpu` and
     * `memory`.  See the [guide to using Node Auto-Provisioning](https://cloud.google.com/kubernetes-engine/docs/how-to/node-auto-provisioning)
     * for a list of types.
     * 
     */
    @Import(name="resourceType", required=true)
      private final Output<String> resourceType;

    public Output<String> resourceType() {
        return this.resourceType;
    }

    public ClusterClusterAutoscalingResourceLimitArgs(
        @Nullable Output<Integer> maximum,
        @Nullable Output<Integer> minimum,
        Output<String> resourceType) {
        this.maximum = maximum;
        this.minimum = minimum;
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
    }

    private ClusterClusterAutoscalingResourceLimitArgs() {
        this.maximum = Codegen.empty();
        this.minimum = Codegen.empty();
        this.resourceType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterAutoscalingResourceLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maximum;
        private @Nullable Output<Integer> minimum;
        private Output<String> resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterAutoscalingResourceLimitArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximum = defaults.maximum;
    	      this.minimum = defaults.minimum;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder maximum(@Nullable Output<Integer> maximum) {
            this.maximum = maximum;
            return this;
        }
        public Builder maximum(@Nullable Integer maximum) {
            this.maximum = Codegen.ofNullable(maximum);
            return this;
        }
        public Builder minimum(@Nullable Output<Integer> minimum) {
            this.minimum = minimum;
            return this;
        }
        public Builder minimum(@Nullable Integer minimum) {
            this.minimum = Codegen.ofNullable(minimum);
            return this;
        }
        public Builder resourceType(Output<String> resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public Builder resourceType(String resourceType) {
            this.resourceType = Output.of(Objects.requireNonNull(resourceType));
            return this;
        }        public ClusterClusterAutoscalingResourceLimitArgs build() {
            return new ClusterClusterAutoscalingResourceLimitArgs(maximum, minimum, resourceType);
        }
    }
}
