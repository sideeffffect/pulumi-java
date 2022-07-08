// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NodePoolAutoscalingResponse {
    /**
     * @return Can this node pool be deleted automatically.
     * 
     */
    private final Boolean autoprovisioned;
    /**
     * @return Is autoscaling enabled for this node pool.
     * 
     */
    private final Boolean enabled;
    /**
     * @return Location policy used when scaling up a nodepool.
     * 
     */
    private final String locationPolicy;
    /**
     * @return Maximum number of nodes for one location in the NodePool. Must be &gt;= min_node_count. There has to be enough quota to scale up the cluster.
     * 
     */
    private final Integer maxNodeCount;
    /**
     * @return Minimum number of nodes for one location in the NodePool. Must be &gt;= 1 and &lt;= max_node_count.
     * 
     */
    private final Integer minNodeCount;
    /**
     * @return Maximum number of nodes in the node pool. Must be greater than total_min_node_count. There has to be enough quota to scale up the cluster. The total_*_node_count fields are mutually exclusive with the *_node_count fields.
     * 
     */
    private final Integer totalMaxNodeCount;
    /**
     * @return Minimum number of nodes in the node pool. Must be greater than 1 less than total_max_node_count. The total_*_node_count fields are mutually exclusive with the *_node_count fields.
     * 
     */
    private final Integer totalMinNodeCount;

    @CustomType.Constructor
    private NodePoolAutoscalingResponse(
        @CustomType.Parameter("autoprovisioned") Boolean autoprovisioned,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("locationPolicy") String locationPolicy,
        @CustomType.Parameter("maxNodeCount") Integer maxNodeCount,
        @CustomType.Parameter("minNodeCount") Integer minNodeCount,
        @CustomType.Parameter("totalMaxNodeCount") Integer totalMaxNodeCount,
        @CustomType.Parameter("totalMinNodeCount") Integer totalMinNodeCount) {
        this.autoprovisioned = autoprovisioned;
        this.enabled = enabled;
        this.locationPolicy = locationPolicy;
        this.maxNodeCount = maxNodeCount;
        this.minNodeCount = minNodeCount;
        this.totalMaxNodeCount = totalMaxNodeCount;
        this.totalMinNodeCount = totalMinNodeCount;
    }

    /**
     * @return Can this node pool be deleted automatically.
     * 
     */
    public Boolean autoprovisioned() {
        return this.autoprovisioned;
    }
    /**
     * @return Is autoscaling enabled for this node pool.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Location policy used when scaling up a nodepool.
     * 
     */
    public String locationPolicy() {
        return this.locationPolicy;
    }
    /**
     * @return Maximum number of nodes for one location in the NodePool. Must be &gt;= min_node_count. There has to be enough quota to scale up the cluster.
     * 
     */
    public Integer maxNodeCount() {
        return this.maxNodeCount;
    }
    /**
     * @return Minimum number of nodes for one location in the NodePool. Must be &gt;= 1 and &lt;= max_node_count.
     * 
     */
    public Integer minNodeCount() {
        return this.minNodeCount;
    }
    /**
     * @return Maximum number of nodes in the node pool. Must be greater than total_min_node_count. There has to be enough quota to scale up the cluster. The total_*_node_count fields are mutually exclusive with the *_node_count fields.
     * 
     */
    public Integer totalMaxNodeCount() {
        return this.totalMaxNodeCount;
    }
    /**
     * @return Minimum number of nodes in the node pool. Must be greater than 1 less than total_max_node_count. The total_*_node_count fields are mutually exclusive with the *_node_count fields.
     * 
     */
    public Integer totalMinNodeCount() {
        return this.totalMinNodeCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolAutoscalingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoprovisioned;
        private Boolean enabled;
        private String locationPolicy;
        private Integer maxNodeCount;
        private Integer minNodeCount;
        private Integer totalMaxNodeCount;
        private Integer totalMinNodeCount;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolAutoscalingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoprovisioned = defaults.autoprovisioned;
    	      this.enabled = defaults.enabled;
    	      this.locationPolicy = defaults.locationPolicy;
    	      this.maxNodeCount = defaults.maxNodeCount;
    	      this.minNodeCount = defaults.minNodeCount;
    	      this.totalMaxNodeCount = defaults.totalMaxNodeCount;
    	      this.totalMinNodeCount = defaults.totalMinNodeCount;
        }

        public Builder autoprovisioned(Boolean autoprovisioned) {
            this.autoprovisioned = Objects.requireNonNull(autoprovisioned);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder locationPolicy(String locationPolicy) {
            this.locationPolicy = Objects.requireNonNull(locationPolicy);
            return this;
        }
        public Builder maxNodeCount(Integer maxNodeCount) {
            this.maxNodeCount = Objects.requireNonNull(maxNodeCount);
            return this;
        }
        public Builder minNodeCount(Integer minNodeCount) {
            this.minNodeCount = Objects.requireNonNull(minNodeCount);
            return this;
        }
        public Builder totalMaxNodeCount(Integer totalMaxNodeCount) {
            this.totalMaxNodeCount = Objects.requireNonNull(totalMaxNodeCount);
            return this;
        }
        public Builder totalMinNodeCount(Integer totalMinNodeCount) {
            this.totalMinNodeCount = Objects.requireNonNull(totalMinNodeCount);
            return this;
        }        public NodePoolAutoscalingResponse build() {
            return new NodePoolAutoscalingResponse(autoprovisioned, enabled, locationPolicy, maxNodeCount, minNodeCount, totalMaxNodeCount, totalMinNodeCount);
        }
    }
}
