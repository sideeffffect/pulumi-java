// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.vertex.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class AiFeatureStoreOnlineServingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AiFeatureStoreOnlineServingConfigArgs Empty = new AiFeatureStoreOnlineServingConfigArgs();

    /**
     * The number of nodes for each cluster. The number of nodes will not scale automatically but can be scaled manually by providing different values when updating.
     * 
     */
    @InputImport(name="fixedNodeCount", required=true)
      private final Input<Integer> fixedNodeCount;

    public Input<Integer> getFixedNodeCount() {
        return this.fixedNodeCount;
    }

    public AiFeatureStoreOnlineServingConfigArgs(Input<Integer> fixedNodeCount) {
        this.fixedNodeCount = Objects.requireNonNull(fixedNodeCount, "expected parameter 'fixedNodeCount' to be non-null");
    }

    private AiFeatureStoreOnlineServingConfigArgs() {
        this.fixedNodeCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AiFeatureStoreOnlineServingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> fixedNodeCount;

        public Builder() {
    	      // Empty
        }

        public Builder(AiFeatureStoreOnlineServingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedNodeCount = defaults.fixedNodeCount;
        }

        public Builder fixedNodeCount(Input<Integer> fixedNodeCount) {
            this.fixedNodeCount = Objects.requireNonNull(fixedNodeCount);
            return this;
        }

        public Builder fixedNodeCount(Integer fixedNodeCount) {
            this.fixedNodeCount = Input.of(Objects.requireNonNull(fixedNodeCount));
            return this;
        }
        public AiFeatureStoreOnlineServingConfigArgs build() {
            return new AiFeatureStoreOnlineServingConfigArgs(fixedNodeCount);
        }
    }
}
