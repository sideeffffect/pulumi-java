// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.BatchOutputConfigurationResponse;
import com.pulumi.azurenative.machinelearningservices.inputs.BatchRetrySettingsResponse;
import com.pulumi.azurenative.machinelearningservices.inputs.CodeConfigurationResponse;
import com.pulumi.azurenative.machinelearningservices.inputs.ComputeConfigurationResponse;
import com.pulumi.azurenative.machinelearningservices.inputs.DataPathAssetReferenceResponse;
import com.pulumi.azurenative.machinelearningservices.inputs.IdAssetReferenceResponse;
import com.pulumi.azurenative.machinelearningservices.inputs.OutputPathAssetReferenceResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Batch inference settings per deployment.
 * 
 */
public final class BatchDeploymentResponse extends com.pulumi.resources.InvokeArgs {

    public static final BatchDeploymentResponse Empty = new BatchDeploymentResponse();

    /**
     * Code configuration for the endpoint deployment.
     * 
     */
    @Import(name="codeConfiguration")
      private final @Nullable CodeConfigurationResponse codeConfiguration;

    public Optional<CodeConfigurationResponse> codeConfiguration() {
        return this.codeConfiguration == null ? Optional.empty() : Optional.ofNullable(this.codeConfiguration);
    }

    /**
     * Configuration for compute binding.
     * 
     */
    @Import(name="compute")
      private final @Nullable ComputeConfigurationResponse compute;

    public Optional<ComputeConfigurationResponse> compute() {
        return this.compute == null ? Optional.empty() : Optional.ofNullable(this.compute);
    }

    /**
     * Description of the endpoint deployment.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * ARM resource ID of the environment specification for the endpoint deployment.
     * 
     */
    @Import(name="environmentId")
      private final @Nullable String environmentId;

    public Optional<String> environmentId() {
        return this.environmentId == null ? Optional.empty() : Optional.ofNullable(this.environmentId);
    }

    /**
     * Environment variables configuration for the deployment.
     * 
     */
    @Import(name="environmentVariables")
      private final @Nullable Map<String,String> environmentVariables;

    public Map<String,String> environmentVariables() {
        return this.environmentVariables == null ? Map.of() : this.environmentVariables;
    }

    /**
     * Error threshold, if the error count for the entire input goes above this value,
     * the batch inference will be aborted. Range is [-1, int.MaxValue].
     * For FileDataset, this value is the count of file failures.
     * For TabularDataset, this value is the count of record failures.
     * If set to -1 (the lower bound), all failures during batch inference will be ignored.
     * 
     */
    @Import(name="errorThreshold")
      private final @Nullable Integer errorThreshold;

    public Optional<Integer> errorThreshold() {
        return this.errorThreshold == null ? Optional.empty() : Optional.ofNullable(this.errorThreshold);
    }

    /**
     * Logging level for batch inference operation.
     * 
     */
    @Import(name="loggingLevel")
      private final @Nullable String loggingLevel;

    public Optional<String> loggingLevel() {
        return this.loggingLevel == null ? Optional.empty() : Optional.ofNullable(this.loggingLevel);
    }

    /**
     * Size of the mini-batch passed to each batch invocation.
     * For FileDataset, this is the number of files per mini-batch.
     * For TabularDataset, this is the size of the records in bytes, per mini-batch.
     * 
     */
    @Import(name="miniBatchSize")
      private final @Nullable Double miniBatchSize;

    public Optional<Double> miniBatchSize() {
        return this.miniBatchSize == null ? Optional.empty() : Optional.ofNullable(this.miniBatchSize);
    }

    /**
     * Reference to the model asset for the endpoint deployment.
     * 
     */
    @Import(name="model")
      private final @Nullable Object model;

    public Object model() {
        return this.model == null ? null : this.model;
    }

    /**
     * Output configuration for the batch inference operation.
     * 
     */
    @Import(name="outputConfiguration")
      private final @Nullable BatchOutputConfigurationResponse outputConfiguration;

    public Optional<BatchOutputConfigurationResponse> outputConfiguration() {
        return this.outputConfiguration == null ? Optional.empty() : Optional.ofNullable(this.outputConfiguration);
    }

    /**
     * Partition keys list used for Named partitioning.
     * 
     */
    @Import(name="partitionKeys")
      private final @Nullable List<String> partitionKeys;

    public List<String> partitionKeys() {
        return this.partitionKeys == null ? List.of() : this.partitionKeys;
    }

    /**
     * Property dictionary. Properties can be added, but not removed or altered.
     * 
     */
    @Import(name="properties")
      private final @Nullable Map<String,String> properties;

    public Map<String,String> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    /**
     * Retry Settings for the batch inference operation.
     * 
     */
    @Import(name="retrySettings")
      private final @Nullable BatchRetrySettingsResponse retrySettings;

    public Optional<BatchRetrySettingsResponse> retrySettings() {
        return this.retrySettings == null ? Optional.empty() : Optional.ofNullable(this.retrySettings);
    }

    public BatchDeploymentResponse(
        @Nullable CodeConfigurationResponse codeConfiguration,
        @Nullable ComputeConfigurationResponse compute,
        @Nullable String description,
        @Nullable String environmentId,
        @Nullable Map<String,String> environmentVariables,
        @Nullable Integer errorThreshold,
        @Nullable String loggingLevel,
        @Nullable Double miniBatchSize,
        @Nullable Object model,
        @Nullable BatchOutputConfigurationResponse outputConfiguration,
        @Nullable List<String> partitionKeys,
        @Nullable Map<String,String> properties,
        @Nullable BatchRetrySettingsResponse retrySettings) {
        this.codeConfiguration = codeConfiguration;
        this.compute = compute;
        this.description = description;
        this.environmentId = environmentId;
        this.environmentVariables = environmentVariables;
        this.errorThreshold = errorThreshold;
        this.loggingLevel = loggingLevel;
        this.miniBatchSize = miniBatchSize;
        this.model = model;
        this.outputConfiguration = outputConfiguration;
        this.partitionKeys = partitionKeys;
        this.properties = properties;
        this.retrySettings = retrySettings;
    }

    private BatchDeploymentResponse() {
        this.codeConfiguration = null;
        this.compute = null;
        this.description = null;
        this.environmentId = null;
        this.environmentVariables = Map.of();
        this.errorThreshold = null;
        this.loggingLevel = null;
        this.miniBatchSize = null;
        this.model = null;
        this.outputConfiguration = null;
        this.partitionKeys = List.of();
        this.properties = Map.of();
        this.retrySettings = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BatchDeploymentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CodeConfigurationResponse codeConfiguration;
        private @Nullable ComputeConfigurationResponse compute;
        private @Nullable String description;
        private @Nullable String environmentId;
        private @Nullable Map<String,String> environmentVariables;
        private @Nullable Integer errorThreshold;
        private @Nullable String loggingLevel;
        private @Nullable Double miniBatchSize;
        private @Nullable Object model;
        private @Nullable BatchOutputConfigurationResponse outputConfiguration;
        private @Nullable List<String> partitionKeys;
        private @Nullable Map<String,String> properties;
        private @Nullable BatchRetrySettingsResponse retrySettings;

        public Builder() {
    	      // Empty
        }

        public Builder(BatchDeploymentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeConfiguration = defaults.codeConfiguration;
    	      this.compute = defaults.compute;
    	      this.description = defaults.description;
    	      this.environmentId = defaults.environmentId;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.errorThreshold = defaults.errorThreshold;
    	      this.loggingLevel = defaults.loggingLevel;
    	      this.miniBatchSize = defaults.miniBatchSize;
    	      this.model = defaults.model;
    	      this.outputConfiguration = defaults.outputConfiguration;
    	      this.partitionKeys = defaults.partitionKeys;
    	      this.properties = defaults.properties;
    	      this.retrySettings = defaults.retrySettings;
        }

        public Builder codeConfiguration(@Nullable CodeConfigurationResponse codeConfiguration) {
            this.codeConfiguration = codeConfiguration;
            return this;
        }
        public Builder compute(@Nullable ComputeConfigurationResponse compute) {
            this.compute = compute;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder environmentId(@Nullable String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public Builder environmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public Builder errorThreshold(@Nullable Integer errorThreshold) {
            this.errorThreshold = errorThreshold;
            return this;
        }
        public Builder loggingLevel(@Nullable String loggingLevel) {
            this.loggingLevel = loggingLevel;
            return this;
        }
        public Builder miniBatchSize(@Nullable Double miniBatchSize) {
            this.miniBatchSize = miniBatchSize;
            return this;
        }
        public Builder model(@Nullable Object model) {
            this.model = model;
            return this;
        }
        public Builder outputConfiguration(@Nullable BatchOutputConfigurationResponse outputConfiguration) {
            this.outputConfiguration = outputConfiguration;
            return this;
        }
        public Builder partitionKeys(@Nullable List<String> partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }
        public Builder partitionKeys(String... partitionKeys) {
            return partitionKeys(List.of(partitionKeys));
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }
        public Builder retrySettings(@Nullable BatchRetrySettingsResponse retrySettings) {
            this.retrySettings = retrySettings;
            return this;
        }        public BatchDeploymentResponse build() {
            return new BatchDeploymentResponse(codeConfiguration, compute, description, environmentId, environmentVariables, errorThreshold, loggingLevel, miniBatchSize, model, outputConfiguration, partitionKeys, properties, retrySettings);
        }
    }
}
