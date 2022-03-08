// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.AmlComputeNodeInformationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ListMachineLearningComputeNodesResult {
    /**
     * The type of compute
     * Expected value is 'AmlCompute'.
     * 
     */
    private final String computeType;
    /**
     * The continuation token.
     * 
     */
    private final String nextLink;
    /**
     * The collection of returned AmlCompute nodes details.
     * 
     */
    private final List<AmlComputeNodeInformationResponse> nodes;

    @OutputCustomType.Constructor({"computeType","nextLink","nodes"})
    private ListMachineLearningComputeNodesResult(
        String computeType,
        String nextLink,
        List<AmlComputeNodeInformationResponse> nodes) {
        this.computeType = computeType;
        this.nextLink = nextLink;
        this.nodes = nodes;
    }

    /**
     * The type of compute
     * Expected value is 'AmlCompute'.
     * 
    */
    public String getComputeType() {
        return this.computeType;
    }
    /**
     * The continuation token.
     * 
    */
    public String getNextLink() {
        return this.nextLink;
    }
    /**
     * The collection of returned AmlCompute nodes details.
     * 
    */
    public List<AmlComputeNodeInformationResponse> getNodes() {
        return this.nodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListMachineLearningComputeNodesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String computeType;
        private String nextLink;
        private List<AmlComputeNodeInformationResponse> nodes;

        public Builder() {
    	      // Empty
        }

        public Builder(ListMachineLearningComputeNodesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeType = defaults.computeType;
    	      this.nextLink = defaults.nextLink;
    	      this.nodes = defaults.nodes;
        }

        public Builder setComputeType(String computeType) {
            this.computeType = Objects.requireNonNull(computeType);
            return this;
        }

        public Builder setNextLink(String nextLink) {
            this.nextLink = Objects.requireNonNull(nextLink);
            return this;
        }

        public Builder setNodes(List<AmlComputeNodeInformationResponse> nodes) {
            this.nodes = Objects.requireNonNull(nodes);
            return this;
        }
        public ListMachineLearningComputeNodesResult build() {
            return new ListMachineLearningComputeNodesResult(computeType, nextLink, nodes);
        }
    }
}
