// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * NodePoolAutoscaling contains information required by cluster autoscaler to adjust the size of the node pool to the current cluster usage.
 * 
 */
public final class NodePoolAutoscalingArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolAutoscalingArgs Empty = new NodePoolAutoscalingArgs();

    /**
     * Can this node pool be deleted automatically.
     * 
     */
    @Import(name="autoprovisioned")
    private @Nullable Output<Boolean> autoprovisioned;

    public Optional<Output<Boolean>> autoprovisioned() {
        return Optional.ofNullable(this.autoprovisioned);
    }

    /**
     * Is autoscaling enabled for this node pool.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Maximum number of nodes for one location in the NodePool. Must be &gt;= min_node_count. There has to be enough quota to scale up the cluster.
     * 
     */
    @Import(name="maxNodeCount")
    private @Nullable Output<Integer> maxNodeCount;

    public Optional<Output<Integer>> maxNodeCount() {
        return Optional.ofNullable(this.maxNodeCount);
    }

    /**
     * Minimum number of nodes for one location in the NodePool. Must be &gt;= 1 and &lt;= max_node_count.
     * 
     */
    @Import(name="minNodeCount")
    private @Nullable Output<Integer> minNodeCount;

    public Optional<Output<Integer>> minNodeCount() {
        return Optional.ofNullable(this.minNodeCount);
    }

    private NodePoolAutoscalingArgs() {}

    private NodePoolAutoscalingArgs(NodePoolAutoscalingArgs $) {
        this.autoprovisioned = $.autoprovisioned;
        this.enabled = $.enabled;
        this.maxNodeCount = $.maxNodeCount;
        this.minNodeCount = $.minNodeCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolAutoscalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolAutoscalingArgs $;

        public Builder() {
            $ = new NodePoolAutoscalingArgs();
        }

        public Builder(NodePoolAutoscalingArgs defaults) {
            $ = new NodePoolAutoscalingArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoprovisioned(@Nullable Output<Boolean> autoprovisioned) {
            $.autoprovisioned = autoprovisioned;
            return this;
        }

        public Builder autoprovisioned(Boolean autoprovisioned) {
            return autoprovisioned(Output.of(autoprovisioned));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder maxNodeCount(@Nullable Output<Integer> maxNodeCount) {
            $.maxNodeCount = maxNodeCount;
            return this;
        }

        public Builder maxNodeCount(Integer maxNodeCount) {
            return maxNodeCount(Output.of(maxNodeCount));
        }

        public Builder minNodeCount(@Nullable Output<Integer> minNodeCount) {
            $.minNodeCount = minNodeCount;
            return this;
        }

        public Builder minNodeCount(Integer minNodeCount) {
            return minNodeCount(Output.of(minNodeCount));
        }

        public NodePoolAutoscalingArgs build() {
            return $;
        }
    }

}
