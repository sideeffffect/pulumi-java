// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NodePoolAutoscaling contains information required by cluster autoscaler to adjust the size of the node pool to the current cluster usage.
 * 
 */
public final class NodePoolAutoscalingArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodePoolAutoscalingArgs Empty = new NodePoolAutoscalingArgs();

    /**
     * Can this node pool be deleted automatically.
     * 
     */
    @InputImport(name="autoprovisioned")
      private final @Nullable Input<Boolean> autoprovisioned;

    public Input<Boolean> getAutoprovisioned() {
        return this.autoprovisioned == null ? Input.empty() : this.autoprovisioned;
    }

    /**
     * Is autoscaling enabled for this node pool.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Maximum number of nodes for one location in the NodePool. Must be >= min_node_count. There has to be enough quota to scale up the cluster.
     * 
     */
    @InputImport(name="maxNodeCount")
      private final @Nullable Input<Integer> maxNodeCount;

    public Input<Integer> getMaxNodeCount() {
        return this.maxNodeCount == null ? Input.empty() : this.maxNodeCount;
    }

    /**
     * Minimum number of nodes for one location in the NodePool. Must be >= 1 and <= max_node_count.
     * 
     */
    @InputImport(name="minNodeCount")
      private final @Nullable Input<Integer> minNodeCount;

    public Input<Integer> getMinNodeCount() {
        return this.minNodeCount == null ? Input.empty() : this.minNodeCount;
    }

    public NodePoolAutoscalingArgs(
        @Nullable Input<Boolean> autoprovisioned,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<Integer> maxNodeCount,
        @Nullable Input<Integer> minNodeCount) {
        this.autoprovisioned = autoprovisioned;
        this.enabled = enabled;
        this.maxNodeCount = maxNodeCount;
        this.minNodeCount = minNodeCount;
    }

    private NodePoolAutoscalingArgs() {
        this.autoprovisioned = Input.empty();
        this.enabled = Input.empty();
        this.maxNodeCount = Input.empty();
        this.minNodeCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolAutoscalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoprovisioned;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<Integer> maxNodeCount;
        private @Nullable Input<Integer> minNodeCount;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolAutoscalingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoprovisioned = defaults.autoprovisioned;
    	      this.enabled = defaults.enabled;
    	      this.maxNodeCount = defaults.maxNodeCount;
    	      this.minNodeCount = defaults.minNodeCount;
        }

        public Builder autoprovisioned(@Nullable Input<Boolean> autoprovisioned) {
            this.autoprovisioned = autoprovisioned;
            return this;
        }

        public Builder autoprovisioned(@Nullable Boolean autoprovisioned) {
            this.autoprovisioned = Input.ofNullable(autoprovisioned);
            return this;
        }

        public Builder enabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder maxNodeCount(@Nullable Input<Integer> maxNodeCount) {
            this.maxNodeCount = maxNodeCount;
            return this;
        }

        public Builder maxNodeCount(@Nullable Integer maxNodeCount) {
            this.maxNodeCount = Input.ofNullable(maxNodeCount);
            return this;
        }

        public Builder minNodeCount(@Nullable Input<Integer> minNodeCount) {
            this.minNodeCount = minNodeCount;
            return this;
        }

        public Builder minNodeCount(@Nullable Integer minNodeCount) {
            this.minNodeCount = Input.ofNullable(minNodeCount);
            return this;
        }
        public NodePoolAutoscalingArgs build() {
            return new NodePoolAutoscalingArgs(autoprovisioned, enabled, maxNodeCount, minNodeCount);
        }
    }
}
