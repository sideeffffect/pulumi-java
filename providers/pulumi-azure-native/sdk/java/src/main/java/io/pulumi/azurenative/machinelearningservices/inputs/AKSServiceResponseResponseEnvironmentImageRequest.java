// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.EnvironmentImageResponseResponseEnvironment;
import io.pulumi.azurenative.machinelearningservices.inputs.EnvironmentImageResponseResponseEnvironmentReference;
import io.pulumi.azurenative.machinelearningservices.inputs.ImageAssetResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.ModelResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Environment, models and assets used for inferencing.
 * 
 */
public final class AKSServiceResponseResponseEnvironmentImageRequest extends io.pulumi.resources.InvokeArgs {

    public static final AKSServiceResponseResponseEnvironmentImageRequest Empty = new AKSServiceResponseResponseEnvironmentImageRequest();

    /**
     * The list of assets.
     * 
     */
    @InputImport(name="assets")
      private final @Nullable List<ImageAssetResponse> assets;

    public List<ImageAssetResponse> getAssets() {
        return this.assets == null ? List.of() : this.assets;
    }

    /**
     * The name of the driver file.
     * 
     */
    @InputImport(name="driverProgram")
      private final @Nullable String driverProgram;

    public Optional<String> getDriverProgram() {
        return this.driverProgram == null ? Optional.empty() : Optional.ofNullable(this.driverProgram);
    }

    /**
     * The details of the AZURE ML environment.
     * 
     */
    @InputImport(name="environment")
      private final @Nullable EnvironmentImageResponseResponseEnvironment environment;

    public Optional<EnvironmentImageResponseResponseEnvironment> getEnvironment() {
        return this.environment == null ? Optional.empty() : Optional.ofNullable(this.environment);
    }

    /**
     * The unique identifying details of the AZURE ML environment.
     * 
     */
    @InputImport(name="environmentReference")
      private final @Nullable EnvironmentImageResponseResponseEnvironmentReference environmentReference;

    public Optional<EnvironmentImageResponseResponseEnvironmentReference> getEnvironmentReference() {
        return this.environmentReference == null ? Optional.empty() : Optional.ofNullable(this.environmentReference);
    }

    /**
     * The list of model Ids.
     * 
     */
    @InputImport(name="modelIds")
      private final @Nullable List<String> modelIds;

    public List<String> getModelIds() {
        return this.modelIds == null ? List.of() : this.modelIds;
    }

    /**
     * The list of models.
     * 
     */
    @InputImport(name="models")
      private final @Nullable List<ModelResponse> models;

    public List<ModelResponse> getModels() {
        return this.models == null ? List.of() : this.models;
    }

    public AKSServiceResponseResponseEnvironmentImageRequest(
        @Nullable List<ImageAssetResponse> assets,
        @Nullable String driverProgram,
        @Nullable EnvironmentImageResponseResponseEnvironment environment,
        @Nullable EnvironmentImageResponseResponseEnvironmentReference environmentReference,
        @Nullable List<String> modelIds,
        @Nullable List<ModelResponse> models) {
        this.assets = assets;
        this.driverProgram = driverProgram;
        this.environment = environment;
        this.environmentReference = environmentReference;
        this.modelIds = modelIds;
        this.models = models;
    }

    private AKSServiceResponseResponseEnvironmentImageRequest() {
        this.assets = List.of();
        this.driverProgram = null;
        this.environment = null;
        this.environmentReference = null;
        this.modelIds = List.of();
        this.models = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AKSServiceResponseResponseEnvironmentImageRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ImageAssetResponse> assets;
        private @Nullable String driverProgram;
        private @Nullable EnvironmentImageResponseResponseEnvironment environment;
        private @Nullable EnvironmentImageResponseResponseEnvironmentReference environmentReference;
        private @Nullable List<String> modelIds;
        private @Nullable List<ModelResponse> models;

        public Builder() {
    	      // Empty
        }

        public Builder(AKSServiceResponseResponseEnvironmentImageRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assets = defaults.assets;
    	      this.driverProgram = defaults.driverProgram;
    	      this.environment = defaults.environment;
    	      this.environmentReference = defaults.environmentReference;
    	      this.modelIds = defaults.modelIds;
    	      this.models = defaults.models;
        }

        public Builder assets(@Nullable List<ImageAssetResponse> assets) {
            this.assets = assets;
            return this;
        }

        public Builder driverProgram(@Nullable String driverProgram) {
            this.driverProgram = driverProgram;
            return this;
        }

        public Builder environment(@Nullable EnvironmentImageResponseResponseEnvironment environment) {
            this.environment = environment;
            return this;
        }

        public Builder environmentReference(@Nullable EnvironmentImageResponseResponseEnvironmentReference environmentReference) {
            this.environmentReference = environmentReference;
            return this;
        }

        public Builder modelIds(@Nullable List<String> modelIds) {
            this.modelIds = modelIds;
            return this;
        }

        public Builder models(@Nullable List<ModelResponse> models) {
            this.models = models;
            return this;
        }
        public AKSServiceResponseResponseEnvironmentImageRequest build() {
            return new AKSServiceResponseResponseEnvironmentImageRequest(assets, driverProgram, environment, environmentReference, modelIds, models);
        }
    }
}
