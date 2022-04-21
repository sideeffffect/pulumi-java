// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh;

import com.pulumi.azurenative.servicefabricmesh.enums.VolumeProvider;
import com.pulumi.azurenative.servicefabricmesh.inputs.VolumeProviderParametersAzureFileArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VolumeArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumeArgs Empty = new VolumeArgs();

    /**
     * This type describes a volume provided by an Azure Files file share.
     * 
     */
    @Import(name="azureFileParameters")
    private @Nullable Output<VolumeProviderParametersAzureFileArgs> azureFileParameters;

    public Optional<Output<VolumeProviderParametersAzureFileArgs>> azureFileParameters() {
        return Optional.ofNullable(this.azureFileParameters);
    }

    /**
     * User readable description of the volume.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Provider of the volume.
     * 
     */
    @Import(name="provider", required=true)
    private Output<Either<String,VolumeProvider>> provider;

    public Output<Either<String,VolumeProvider>> provider() {
        return this.provider;
    }

    /**
     * Azure resource group name
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The identity of the volume.
     * 
     */
    @Import(name="volumeResourceName")
    private @Nullable Output<String> volumeResourceName;

    public Optional<Output<String>> volumeResourceName() {
        return Optional.ofNullable(this.volumeResourceName);
    }

    private VolumeArgs() {}

    private VolumeArgs(VolumeArgs $) {
        this.azureFileParameters = $.azureFileParameters;
        this.description = $.description;
        this.location = $.location;
        this.provider = $.provider;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.volumeResourceName = $.volumeResourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeArgs $;

        public Builder() {
            $ = new VolumeArgs();
        }

        public Builder(VolumeArgs defaults) {
            $ = new VolumeArgs(Objects.requireNonNull(defaults));
        }

        public Builder azureFileParameters(@Nullable Output<VolumeProviderParametersAzureFileArgs> azureFileParameters) {
            $.azureFileParameters = azureFileParameters;
            return this;
        }

        public Builder azureFileParameters(VolumeProviderParametersAzureFileArgs azureFileParameters) {
            return azureFileParameters(Output.of(azureFileParameters));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder provider(Output<Either<String,VolumeProvider>> provider) {
            $.provider = provider;
            return this;
        }

        public Builder provider(Either<String,VolumeProvider> provider) {
            return provider(Output.of(provider));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder volumeResourceName(@Nullable Output<String> volumeResourceName) {
            $.volumeResourceName = volumeResourceName;
            return this;
        }

        public Builder volumeResourceName(String volumeResourceName) {
            return volumeResourceName(Output.of(volumeResourceName));
        }

        public VolumeArgs build() {
            $.provider = Objects.requireNonNull($.provider, "expected parameter 'provider' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
