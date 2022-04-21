// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class AzureNodePoolAutoscalingArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureNodePoolAutoscalingArgs Empty = new AzureNodePoolAutoscalingArgs();

    /**
     * Required. Maximum number of nodes in the node pool. Must be &gt;= min_node_count.
     * 
     */
    @Import(name="maxNodeCount", required=true)
    private Output<Integer> maxNodeCount;

    public Output<Integer> maxNodeCount() {
        return this.maxNodeCount;
    }

    /**
     * Required. Minimum number of nodes in the node pool. Must be &gt;= 1 and &lt;= max_node_count.
     * 
     */
    @Import(name="minNodeCount", required=true)
    private Output<Integer> minNodeCount;

    public Output<Integer> minNodeCount() {
        return this.minNodeCount;
    }

    private AzureNodePoolAutoscalingArgs() {}

    private AzureNodePoolAutoscalingArgs(AzureNodePoolAutoscalingArgs $) {
        this.maxNodeCount = $.maxNodeCount;
        this.minNodeCount = $.minNodeCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureNodePoolAutoscalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureNodePoolAutoscalingArgs $;

        public Builder() {
            $ = new AzureNodePoolAutoscalingArgs();
        }

        public Builder(AzureNodePoolAutoscalingArgs defaults) {
            $ = new AzureNodePoolAutoscalingArgs(Objects.requireNonNull(defaults));
        }

        public Builder maxNodeCount(Output<Integer> maxNodeCount) {
            $.maxNodeCount = maxNodeCount;
            return this;
        }

        public Builder maxNodeCount(Integer maxNodeCount) {
            return maxNodeCount(Output.of(maxNodeCount));
        }

        public Builder minNodeCount(Output<Integer> minNodeCount) {
            $.minNodeCount = minNodeCount;
            return this;
        }

        public Builder minNodeCount(Integer minNodeCount) {
            return minNodeCount(Output.of(minNodeCount));
        }

        public AzureNodePoolAutoscalingArgs build() {
            $.maxNodeCount = Objects.requireNonNull($.maxNodeCount, "expected parameter 'maxNodeCount' to be non-null");
            $.minNodeCount = Objects.requireNonNull($.minNodeCount, "expected parameter 'minNodeCount' to be non-null");
            return $;
        }
    }

}
