// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class GetNodeGroupScalingConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetNodeGroupScalingConfig Empty = new GetNodeGroupScalingConfig();

    /**
     * Desired number of worker nodes.
     * 
     */
    @Import(name="desiredSize", required=true)
      private final Integer desiredSize;

    public Integer desiredSize() {
        return this.desiredSize;
    }

    /**
     * Maximum number of worker nodes.
     * 
     */
    @Import(name="maxSize", required=true)
      private final Integer maxSize;

    public Integer maxSize() {
        return this.maxSize;
    }

    /**
     * Minimum number of worker nodes.
     * 
     */
    @Import(name="minSize", required=true)
      private final Integer minSize;

    public Integer minSize() {
        return this.minSize;
    }

    public GetNodeGroupScalingConfig(
        Integer desiredSize,
        Integer maxSize,
        Integer minSize) {
        this.desiredSize = Objects.requireNonNull(desiredSize, "expected parameter 'desiredSize' to be non-null");
        this.maxSize = Objects.requireNonNull(maxSize, "expected parameter 'maxSize' to be non-null");
        this.minSize = Objects.requireNonNull(minSize, "expected parameter 'minSize' to be non-null");
    }

    private GetNodeGroupScalingConfig() {
        this.desiredSize = null;
        this.maxSize = null;
        this.minSize = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeGroupScalingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer desiredSize;
        private Integer maxSize;
        private Integer minSize;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNodeGroupScalingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.desiredSize = defaults.desiredSize;
    	      this.maxSize = defaults.maxSize;
    	      this.minSize = defaults.minSize;
        }

        public Builder desiredSize(Integer desiredSize) {
            this.desiredSize = Objects.requireNonNull(desiredSize);
            return this;
        }
        public Builder maxSize(Integer maxSize) {
            this.maxSize = Objects.requireNonNull(maxSize);
            return this;
        }
        public Builder minSize(Integer minSize) {
            this.minSize = Objects.requireNonNull(minSize);
            return this;
        }        public GetNodeGroupScalingConfig build() {
            return new GetNodeGroupScalingConfig(desiredSize, maxSize, minSize);
        }
    }
}
