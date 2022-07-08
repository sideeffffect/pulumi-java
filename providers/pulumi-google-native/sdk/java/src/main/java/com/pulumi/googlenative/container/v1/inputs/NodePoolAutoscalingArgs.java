// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container.v1.enums.NodePoolAutoscalingLocationPolicy;
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

    /**
     * @return Can this node pool be deleted automatically.
     * 
     */
    public Optional<Output<Boolean>> autoprovisioned() {
        return Optional.ofNullable(this.autoprovisioned);
    }

    /**
     * Is autoscaling enabled for this node pool.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Is autoscaling enabled for this node pool.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Location policy used when scaling up a nodepool.
     * 
     */
    @Import(name="locationPolicy")
    private @Nullable Output<NodePoolAutoscalingLocationPolicy> locationPolicy;

    /**
     * @return Location policy used when scaling up a nodepool.
     * 
     */
    public Optional<Output<NodePoolAutoscalingLocationPolicy>> locationPolicy() {
        return Optional.ofNullable(this.locationPolicy);
    }

    /**
     * Maximum number of nodes for one location in the NodePool. Must be &gt;= min_node_count. There has to be enough quota to scale up the cluster.
     * 
     */
    @Import(name="maxNodeCount")
    private @Nullable Output<Integer> maxNodeCount;

    /**
     * @return Maximum number of nodes for one location in the NodePool. Must be &gt;= min_node_count. There has to be enough quota to scale up the cluster.
     * 
     */
    public Optional<Output<Integer>> maxNodeCount() {
        return Optional.ofNullable(this.maxNodeCount);
    }

    /**
     * Minimum number of nodes for one location in the NodePool. Must be &gt;= 1 and &lt;= max_node_count.
     * 
     */
    @Import(name="minNodeCount")
    private @Nullable Output<Integer> minNodeCount;

    /**
     * @return Minimum number of nodes for one location in the NodePool. Must be &gt;= 1 and &lt;= max_node_count.
     * 
     */
    public Optional<Output<Integer>> minNodeCount() {
        return Optional.ofNullable(this.minNodeCount);
    }

    /**
     * Maximum number of nodes in the node pool. Must be greater than total_min_node_count. There has to be enough quota to scale up the cluster. The total_*_node_count fields are mutually exclusive with the *_node_count fields.
     * 
     */
    @Import(name="totalMaxNodeCount")
    private @Nullable Output<Integer> totalMaxNodeCount;

    /**
     * @return Maximum number of nodes in the node pool. Must be greater than total_min_node_count. There has to be enough quota to scale up the cluster. The total_*_node_count fields are mutually exclusive with the *_node_count fields.
     * 
     */
    public Optional<Output<Integer>> totalMaxNodeCount() {
        return Optional.ofNullable(this.totalMaxNodeCount);
    }

    /**
     * Minimum number of nodes in the node pool. Must be greater than 1 less than total_max_node_count. The total_*_node_count fields are mutually exclusive with the *_node_count fields.
     * 
     */
    @Import(name="totalMinNodeCount")
    private @Nullable Output<Integer> totalMinNodeCount;

    /**
     * @return Minimum number of nodes in the node pool. Must be greater than 1 less than total_max_node_count. The total_*_node_count fields are mutually exclusive with the *_node_count fields.
     * 
     */
    public Optional<Output<Integer>> totalMinNodeCount() {
        return Optional.ofNullable(this.totalMinNodeCount);
    }

    private NodePoolAutoscalingArgs() {}

    private NodePoolAutoscalingArgs(NodePoolAutoscalingArgs $) {
        this.autoprovisioned = $.autoprovisioned;
        this.enabled = $.enabled;
        this.locationPolicy = $.locationPolicy;
        this.maxNodeCount = $.maxNodeCount;
        this.minNodeCount = $.minNodeCount;
        this.totalMaxNodeCount = $.totalMaxNodeCount;
        this.totalMinNodeCount = $.totalMinNodeCount;
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

        /**
         * @param autoprovisioned Can this node pool be deleted automatically.
         * 
         * @return builder
         * 
         */
        public Builder autoprovisioned(@Nullable Output<Boolean> autoprovisioned) {
            $.autoprovisioned = autoprovisioned;
            return this;
        }

        /**
         * @param autoprovisioned Can this node pool be deleted automatically.
         * 
         * @return builder
         * 
         */
        public Builder autoprovisioned(Boolean autoprovisioned) {
            return autoprovisioned(Output.of(autoprovisioned));
        }

        /**
         * @param enabled Is autoscaling enabled for this node pool.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Is autoscaling enabled for this node pool.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param locationPolicy Location policy used when scaling up a nodepool.
         * 
         * @return builder
         * 
         */
        public Builder locationPolicy(@Nullable Output<NodePoolAutoscalingLocationPolicy> locationPolicy) {
            $.locationPolicy = locationPolicy;
            return this;
        }

        /**
         * @param locationPolicy Location policy used when scaling up a nodepool.
         * 
         * @return builder
         * 
         */
        public Builder locationPolicy(NodePoolAutoscalingLocationPolicy locationPolicy) {
            return locationPolicy(Output.of(locationPolicy));
        }

        /**
         * @param maxNodeCount Maximum number of nodes for one location in the NodePool. Must be &gt;= min_node_count. There has to be enough quota to scale up the cluster.
         * 
         * @return builder
         * 
         */
        public Builder maxNodeCount(@Nullable Output<Integer> maxNodeCount) {
            $.maxNodeCount = maxNodeCount;
            return this;
        }

        /**
         * @param maxNodeCount Maximum number of nodes for one location in the NodePool. Must be &gt;= min_node_count. There has to be enough quota to scale up the cluster.
         * 
         * @return builder
         * 
         */
        public Builder maxNodeCount(Integer maxNodeCount) {
            return maxNodeCount(Output.of(maxNodeCount));
        }

        /**
         * @param minNodeCount Minimum number of nodes for one location in the NodePool. Must be &gt;= 1 and &lt;= max_node_count.
         * 
         * @return builder
         * 
         */
        public Builder minNodeCount(@Nullable Output<Integer> minNodeCount) {
            $.minNodeCount = minNodeCount;
            return this;
        }

        /**
         * @param minNodeCount Minimum number of nodes for one location in the NodePool. Must be &gt;= 1 and &lt;= max_node_count.
         * 
         * @return builder
         * 
         */
        public Builder minNodeCount(Integer minNodeCount) {
            return minNodeCount(Output.of(minNodeCount));
        }

        /**
         * @param totalMaxNodeCount Maximum number of nodes in the node pool. Must be greater than total_min_node_count. There has to be enough quota to scale up the cluster. The total_*_node_count fields are mutually exclusive with the *_node_count fields.
         * 
         * @return builder
         * 
         */
        public Builder totalMaxNodeCount(@Nullable Output<Integer> totalMaxNodeCount) {
            $.totalMaxNodeCount = totalMaxNodeCount;
            return this;
        }

        /**
         * @param totalMaxNodeCount Maximum number of nodes in the node pool. Must be greater than total_min_node_count. There has to be enough quota to scale up the cluster. The total_*_node_count fields are mutually exclusive with the *_node_count fields.
         * 
         * @return builder
         * 
         */
        public Builder totalMaxNodeCount(Integer totalMaxNodeCount) {
            return totalMaxNodeCount(Output.of(totalMaxNodeCount));
        }

        /**
         * @param totalMinNodeCount Minimum number of nodes in the node pool. Must be greater than 1 less than total_max_node_count. The total_*_node_count fields are mutually exclusive with the *_node_count fields.
         * 
         * @return builder
         * 
         */
        public Builder totalMinNodeCount(@Nullable Output<Integer> totalMinNodeCount) {
            $.totalMinNodeCount = totalMinNodeCount;
            return this;
        }

        /**
         * @param totalMinNodeCount Minimum number of nodes in the node pool. Must be greater than 1 less than total_max_node_count. The total_*_node_count fields are mutually exclusive with the *_node_count fields.
         * 
         * @return builder
         * 
         */
        public Builder totalMinNodeCount(Integer totalMinNodeCount) {
            return totalMinNodeCount(Output.of(totalMinNodeCount));
        }

        public NodePoolAutoscalingArgs build() {
            return $;
        }
    }

}
