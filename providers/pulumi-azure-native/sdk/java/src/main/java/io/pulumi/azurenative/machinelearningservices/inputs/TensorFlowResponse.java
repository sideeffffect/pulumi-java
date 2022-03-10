// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * TensorFlow distribution configuration.
 * 
 */
public final class TensorFlowResponse extends io.pulumi.resources.InvokeArgs {

    public static final TensorFlowResponse Empty = new TensorFlowResponse();

    /**
     * Enum to determine the job distribution type.
     * Expected value is 'TensorFlow'.
     * 
     */
    @InputImport(name="distributionType", required=true)
      private final String distributionType;

    public String getDistributionType() {
        return this.distributionType;
    }

    /**
     * Number of parameter server tasks.
     * 
     */
    @InputImport(name="parameterServerCount")
      private final @Nullable Integer parameterServerCount;

    public Optional<Integer> getParameterServerCount() {
        return this.parameterServerCount == null ? Optional.empty() : Optional.ofNullable(this.parameterServerCount);
    }

    /**
     * Number of workers. Overwrites the node count in compute binding.
     * 
     */
    @InputImport(name="workerCount")
      private final @Nullable Integer workerCount;

    public Optional<Integer> getWorkerCount() {
        return this.workerCount == null ? Optional.empty() : Optional.ofNullable(this.workerCount);
    }

    public TensorFlowResponse(
        String distributionType,
        @Nullable Integer parameterServerCount,
        @Nullable Integer workerCount) {
        this.distributionType = Objects.requireNonNull(distributionType, "expected parameter 'distributionType' to be non-null");
        this.parameterServerCount = parameterServerCount;
        this.workerCount = workerCount;
    }

    private TensorFlowResponse() {
        this.distributionType = null;
        this.parameterServerCount = null;
        this.workerCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TensorFlowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String distributionType;
        private @Nullable Integer parameterServerCount;
        private @Nullable Integer workerCount;

        public Builder() {
    	      // Empty
        }

        public Builder(TensorFlowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributionType = defaults.distributionType;
    	      this.parameterServerCount = defaults.parameterServerCount;
    	      this.workerCount = defaults.workerCount;
        }

        public Builder distributionType(String distributionType) {
            this.distributionType = Objects.requireNonNull(distributionType);
            return this;
        }

        public Builder parameterServerCount(@Nullable Integer parameterServerCount) {
            this.parameterServerCount = parameterServerCount;
            return this;
        }

        public Builder workerCount(@Nullable Integer workerCount) {
            this.workerCount = workerCount;
            return this;
        }
        public TensorFlowResponse build() {
            return new TensorFlowResponse(distributionType, parameterServerCount, workerCount);
        }
    }
}
