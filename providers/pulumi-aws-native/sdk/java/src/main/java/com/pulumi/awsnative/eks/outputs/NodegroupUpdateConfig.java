// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.eks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodegroupUpdateConfig {
    /**
     * @return The maximum number of nodes unavailable at once during a version update. Nodes will be updated in parallel. This value or maxUnavailablePercentage is required to have a value.The maximum number is 100.
     * 
     */
    private final @Nullable Double maxUnavailable;
    /**
     * @return The maximum percentage of nodes unavailable during a version update. This percentage of nodes will be updated in parallel, up to 100 nodes at once. This value or maxUnavailable is required to have a value.
     * 
     */
    private final @Nullable Double maxUnavailablePercentage;

    @CustomType.Constructor
    private NodegroupUpdateConfig(
        @CustomType.Parameter("maxUnavailable") @Nullable Double maxUnavailable,
        @CustomType.Parameter("maxUnavailablePercentage") @Nullable Double maxUnavailablePercentage) {
        this.maxUnavailable = maxUnavailable;
        this.maxUnavailablePercentage = maxUnavailablePercentage;
    }

    /**
     * @return The maximum number of nodes unavailable at once during a version update. Nodes will be updated in parallel. This value or maxUnavailablePercentage is required to have a value.The maximum number is 100.
     * 
     */
    public Optional<Double> maxUnavailable() {
        return Optional.ofNullable(this.maxUnavailable);
    }
    /**
     * @return The maximum percentage of nodes unavailable during a version update. This percentage of nodes will be updated in parallel, up to 100 nodes at once. This value or maxUnavailable is required to have a value.
     * 
     */
    public Optional<Double> maxUnavailablePercentage() {
        return Optional.ofNullable(this.maxUnavailablePercentage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodegroupUpdateConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double maxUnavailable;
        private @Nullable Double maxUnavailablePercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(NodegroupUpdateConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxUnavailable = defaults.maxUnavailable;
    	      this.maxUnavailablePercentage = defaults.maxUnavailablePercentage;
        }

        public Builder maxUnavailable(@Nullable Double maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }
        public Builder maxUnavailablePercentage(@Nullable Double maxUnavailablePercentage) {
            this.maxUnavailablePercentage = maxUnavailablePercentage;
            return this;
        }        public NodegroupUpdateConfig build() {
            return new NodegroupUpdateConfig(maxUnavailable, maxUnavailablePercentage);
        }
    }
}
