// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeGroupUpdateConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeGroupUpdateConfigGetArgs Empty = new NodeGroupUpdateConfigGetArgs();

    /**
     * Desired max number of unavailable worker nodes during node group update.
     * 
     */
    @InputImport(name="maxUnavailable")
      private final @Nullable Input<Integer> maxUnavailable;

    public Input<Integer> getMaxUnavailable() {
        return this.maxUnavailable == null ? Input.empty() : this.maxUnavailable;
    }

    /**
     * Desired max percentage of unavailable worker nodes during node group update.
     * 
     */
    @InputImport(name="maxUnavailablePercentage")
      private final @Nullable Input<Integer> maxUnavailablePercentage;

    public Input<Integer> getMaxUnavailablePercentage() {
        return this.maxUnavailablePercentage == null ? Input.empty() : this.maxUnavailablePercentage;
    }

    public NodeGroupUpdateConfigGetArgs(
        @Nullable Input<Integer> maxUnavailable,
        @Nullable Input<Integer> maxUnavailablePercentage) {
        this.maxUnavailable = maxUnavailable;
        this.maxUnavailablePercentage = maxUnavailablePercentage;
    }

    private NodeGroupUpdateConfigGetArgs() {
        this.maxUnavailable = Input.empty();
        this.maxUnavailablePercentage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupUpdateConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> maxUnavailable;
        private @Nullable Input<Integer> maxUnavailablePercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupUpdateConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxUnavailable = defaults.maxUnavailable;
    	      this.maxUnavailablePercentage = defaults.maxUnavailablePercentage;
        }

        public Builder maxUnavailable(@Nullable Input<Integer> maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }

        public Builder maxUnavailable(@Nullable Integer maxUnavailable) {
            this.maxUnavailable = Input.ofNullable(maxUnavailable);
            return this;
        }

        public Builder maxUnavailablePercentage(@Nullable Input<Integer> maxUnavailablePercentage) {
            this.maxUnavailablePercentage = maxUnavailablePercentage;
            return this;
        }

        public Builder maxUnavailablePercentage(@Nullable Integer maxUnavailablePercentage) {
            this.maxUnavailablePercentage = Input.ofNullable(maxUnavailablePercentage);
            return this;
        }
        public NodeGroupUpdateConfigGetArgs build() {
            return new NodeGroupUpdateConfigGetArgs(maxUnavailable, maxUnavailablePercentage);
        }
    }
}
