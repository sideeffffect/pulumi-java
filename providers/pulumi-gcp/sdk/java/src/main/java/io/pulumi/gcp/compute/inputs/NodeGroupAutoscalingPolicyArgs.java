// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeGroupAutoscalingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeGroupAutoscalingPolicyArgs Empty = new NodeGroupAutoscalingPolicyArgs();

    /**
     * Maximum size of the node group. Set to a value less than or equal
     * to 100 and greater than or equal to min-nodes.
     * 
     */
    @InputImport(name="maxNodes")
      private final @Nullable Input<Integer> maxNodes;

    public Input<Integer> getMaxNodes() {
        return this.maxNodes == null ? Input.empty() : this.maxNodes;
    }

    /**
     * Minimum size of the node group. Must be less
     * than or equal to max-nodes. The default value is 0.
     * 
     */
    @InputImport(name="minNodes")
      private final @Nullable Input<Integer> minNodes;

    public Input<Integer> getMinNodes() {
        return this.minNodes == null ? Input.empty() : this.minNodes;
    }

    /**
     * The autoscaling mode. Set to one of the following:
     * - OFF: Disables the autoscaler.
     * - ON: Enables scaling in and scaling out.
     * - ONLY_SCALE_OUT: Enables only scaling out.
     *   You must use this mode if your node groups are configured to
     *   restart their hosted VMs on minimal servers.
     *   Possible values are `OFF`, `ON`, and `ONLY_SCALE_OUT`.
     * 
     */
    @InputImport(name="mode")
      private final @Nullable Input<String> mode;

    public Input<String> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    public NodeGroupAutoscalingPolicyArgs(
        @Nullable Input<Integer> maxNodes,
        @Nullable Input<Integer> minNodes,
        @Nullable Input<String> mode) {
        this.maxNodes = maxNodes;
        this.minNodes = minNodes;
        this.mode = mode;
    }

    private NodeGroupAutoscalingPolicyArgs() {
        this.maxNodes = Input.empty();
        this.minNodes = Input.empty();
        this.mode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupAutoscalingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> maxNodes;
        private @Nullable Input<Integer> minNodes;
        private @Nullable Input<String> mode;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupAutoscalingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxNodes = defaults.maxNodes;
    	      this.minNodes = defaults.minNodes;
    	      this.mode = defaults.mode;
        }

        public Builder maxNodes(@Nullable Input<Integer> maxNodes) {
            this.maxNodes = maxNodes;
            return this;
        }

        public Builder maxNodes(@Nullable Integer maxNodes) {
            this.maxNodes = Input.ofNullable(maxNodes);
            return this;
        }

        public Builder minNodes(@Nullable Input<Integer> minNodes) {
            this.minNodes = minNodes;
            return this;
        }

        public Builder minNodes(@Nullable Integer minNodes) {
            this.minNodes = Input.ofNullable(minNodes);
            return this;
        }

        public Builder mode(@Nullable Input<String> mode) {
            this.mode = mode;
            return this;
        }

        public Builder mode(@Nullable String mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }
        public NodeGroupAutoscalingPolicyArgs build() {
            return new NodeGroupAutoscalingPolicyArgs(maxNodes, minNodes, mode);
        }
    }
}
