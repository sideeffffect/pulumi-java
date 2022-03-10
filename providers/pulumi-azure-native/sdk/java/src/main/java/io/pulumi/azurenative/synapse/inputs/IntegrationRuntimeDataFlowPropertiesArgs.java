// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.azurenative.synapse.enums.DataFlowComputeType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Data flow properties for managed integration runtime.
 * 
 */
public final class IntegrationRuntimeDataFlowPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationRuntimeDataFlowPropertiesArgs Empty = new IntegrationRuntimeDataFlowPropertiesArgs();

    /**
     * Compute type of the cluster which will execute data flow job.
     * 
     */
    @InputImport(name="computeType")
      private final @Nullable Input<Either<String,DataFlowComputeType>> computeType;

    public Input<Either<String,DataFlowComputeType>> getComputeType() {
        return this.computeType == null ? Input.empty() : this.computeType;
    }

    /**
     * Core count of the cluster which will execute data flow job. Supported values are: 8, 16, 32, 48, 80, 144 and 272.
     * 
     */
    @InputImport(name="coreCount")
      private final @Nullable Input<Integer> coreCount;

    public Input<Integer> getCoreCount() {
        return this.coreCount == null ? Input.empty() : this.coreCount;
    }

    /**
     * Time to live (in minutes) setting of the cluster which will execute data flow job.
     * 
     */
    @InputImport(name="timeToLive")
      private final @Nullable Input<Integer> timeToLive;

    public Input<Integer> getTimeToLive() {
        return this.timeToLive == null ? Input.empty() : this.timeToLive;
    }

    public IntegrationRuntimeDataFlowPropertiesArgs(
        @Nullable Input<Either<String,DataFlowComputeType>> computeType,
        @Nullable Input<Integer> coreCount,
        @Nullable Input<Integer> timeToLive) {
        this.computeType = computeType;
        this.coreCount = coreCount;
        this.timeToLive = timeToLive;
    }

    private IntegrationRuntimeDataFlowPropertiesArgs() {
        this.computeType = Input.empty();
        this.coreCount = Input.empty();
        this.timeToLive = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeDataFlowPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,DataFlowComputeType>> computeType;
        private @Nullable Input<Integer> coreCount;
        private @Nullable Input<Integer> timeToLive;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeDataFlowPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeType = defaults.computeType;
    	      this.coreCount = defaults.coreCount;
    	      this.timeToLive = defaults.timeToLive;
        }

        public Builder computeType(@Nullable Input<Either<String,DataFlowComputeType>> computeType) {
            this.computeType = computeType;
            return this;
        }

        public Builder computeType(@Nullable Either<String,DataFlowComputeType> computeType) {
            this.computeType = Input.ofNullable(computeType);
            return this;
        }

        public Builder coreCount(@Nullable Input<Integer> coreCount) {
            this.coreCount = coreCount;
            return this;
        }

        public Builder coreCount(@Nullable Integer coreCount) {
            this.coreCount = Input.ofNullable(coreCount);
            return this;
        }

        public Builder timeToLive(@Nullable Input<Integer> timeToLive) {
            this.timeToLive = timeToLive;
            return this;
        }

        public Builder timeToLive(@Nullable Integer timeToLive) {
            this.timeToLive = Input.ofNullable(timeToLive);
            return this;
        }
        public IntegrationRuntimeDataFlowPropertiesArgs build() {
            return new IntegrationRuntimeDataFlowPropertiesArgs(computeType, coreCount, timeToLive);
        }
    }
}
