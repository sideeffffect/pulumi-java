// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh;

import io.pulumi.azurenative.servicefabricmesh.enums.VolumeProvider;
import io.pulumi.azurenative.servicefabricmesh.inputs.VolumeProviderParametersAzureFileArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VolumeArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeArgs Empty = new VolumeArgs();

    /**
     * This type describes a volume provided by an Azure Files file share.
     * 
     */
    @InputImport(name="azureFileParameters")
      private final @Nullable Input<VolumeProviderParametersAzureFileArgs> azureFileParameters;

    public Input<VolumeProviderParametersAzureFileArgs> getAzureFileParameters() {
        return this.azureFileParameters == null ? Input.empty() : this.azureFileParameters;
    }

    /**
     * User readable description of the volume.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Provider of the volume.
     * 
     */
    @InputImport(name="provider", required=true)
      private final Input<Either<String,VolumeProvider>> provider;

    public Input<Either<String,VolumeProvider>> getProvider() {
        return this.provider;
    }

    /**
     * Azure resource group name
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The identity of the volume.
     * 
     */
    @InputImport(name="volumeResourceName")
      private final @Nullable Input<String> volumeResourceName;

    public Input<String> getVolumeResourceName() {
        return this.volumeResourceName == null ? Input.empty() : this.volumeResourceName;
    }

    public VolumeArgs(
        @Nullable Input<VolumeProviderParametersAzureFileArgs> azureFileParameters,
        @Nullable Input<String> description,
        @Nullable Input<String> location,
        Input<Either<String,VolumeProvider>> provider,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> volumeResourceName) {
        this.azureFileParameters = azureFileParameters;
        this.description = description;
        this.location = location;
        this.provider = Objects.requireNonNull(provider, "expected parameter 'provider' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.volumeResourceName = volumeResourceName;
    }

    private VolumeArgs() {
        this.azureFileParameters = Input.empty();
        this.description = Input.empty();
        this.location = Input.empty();
        this.provider = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.volumeResourceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VolumeProviderParametersAzureFileArgs> azureFileParameters;
        private @Nullable Input<String> description;
        private @Nullable Input<String> location;
        private Input<Either<String,VolumeProvider>> provider;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> volumeResourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureFileParameters = defaults.azureFileParameters;
    	      this.description = defaults.description;
    	      this.location = defaults.location;
    	      this.provider = defaults.provider;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.volumeResourceName = defaults.volumeResourceName;
        }

        public Builder azureFileParameters(@Nullable Input<VolumeProviderParametersAzureFileArgs> azureFileParameters) {
            this.azureFileParameters = azureFileParameters;
            return this;
        }

        public Builder azureFileParameters(@Nullable VolumeProviderParametersAzureFileArgs azureFileParameters) {
            this.azureFileParameters = Input.ofNullable(azureFileParameters);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder provider(Input<Either<String,VolumeProvider>> provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }

        public Builder provider(Either<String,VolumeProvider> provider) {
            this.provider = Input.of(Objects.requireNonNull(provider));
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder volumeResourceName(@Nullable Input<String> volumeResourceName) {
            this.volumeResourceName = volumeResourceName;
            return this;
        }

        public Builder volumeResourceName(@Nullable String volumeResourceName) {
            this.volumeResourceName = Input.ofNullable(volumeResourceName);
            return this;
        }
        public VolumeArgs build() {
            return new VolumeArgs(azureFileParameters, description, location, provider, resourceGroupName, tags, volumeResourceName);
        }
    }
}
