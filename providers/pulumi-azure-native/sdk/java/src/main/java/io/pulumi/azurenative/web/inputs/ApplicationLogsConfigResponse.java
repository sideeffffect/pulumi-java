// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.AzureBlobStorageApplicationLogsConfigResponse;
import io.pulumi.azurenative.web.inputs.AzureTableStorageApplicationLogsConfigResponse;
import io.pulumi.azurenative.web.inputs.FileSystemApplicationLogsConfigResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Application logs configuration.
 * 
 */
public final class ApplicationLogsConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationLogsConfigResponse Empty = new ApplicationLogsConfigResponse();

    /**
     * Application logs to blob storage configuration.
     * 
     */
    @InputImport(name="azureBlobStorage")
      private final @Nullable AzureBlobStorageApplicationLogsConfigResponse azureBlobStorage;

    public Optional<AzureBlobStorageApplicationLogsConfigResponse> getAzureBlobStorage() {
        return this.azureBlobStorage == null ? Optional.empty() : Optional.ofNullable(this.azureBlobStorage);
    }

    /**
     * Application logs to azure table storage configuration.
     * 
     */
    @InputImport(name="azureTableStorage")
      private final @Nullable AzureTableStorageApplicationLogsConfigResponse azureTableStorage;

    public Optional<AzureTableStorageApplicationLogsConfigResponse> getAzureTableStorage() {
        return this.azureTableStorage == null ? Optional.empty() : Optional.ofNullable(this.azureTableStorage);
    }

    /**
     * Application logs to file system configuration.
     * 
     */
    @InputImport(name="fileSystem")
      private final @Nullable FileSystemApplicationLogsConfigResponse fileSystem;

    public Optional<FileSystemApplicationLogsConfigResponse> getFileSystem() {
        return this.fileSystem == null ? Optional.empty() : Optional.ofNullable(this.fileSystem);
    }

    public ApplicationLogsConfigResponse(
        @Nullable AzureBlobStorageApplicationLogsConfigResponse azureBlobStorage,
        @Nullable AzureTableStorageApplicationLogsConfigResponse azureTableStorage,
        @Nullable FileSystemApplicationLogsConfigResponse fileSystem) {
        this.azureBlobStorage = azureBlobStorage;
        this.azureTableStorage = azureTableStorage;
        this.fileSystem = fileSystem;
    }

    private ApplicationLogsConfigResponse() {
        this.azureBlobStorage = null;
        this.azureTableStorage = null;
        this.fileSystem = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationLogsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureBlobStorageApplicationLogsConfigResponse azureBlobStorage;
        private @Nullable AzureTableStorageApplicationLogsConfigResponse azureTableStorage;
        private @Nullable FileSystemApplicationLogsConfigResponse fileSystem;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationLogsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureBlobStorage = defaults.azureBlobStorage;
    	      this.azureTableStorage = defaults.azureTableStorage;
    	      this.fileSystem = defaults.fileSystem;
        }

        public Builder azureBlobStorage(@Nullable AzureBlobStorageApplicationLogsConfigResponse azureBlobStorage) {
            this.azureBlobStorage = azureBlobStorage;
            return this;
        }

        public Builder azureTableStorage(@Nullable AzureTableStorageApplicationLogsConfigResponse azureTableStorage) {
            this.azureTableStorage = azureTableStorage;
            return this;
        }

        public Builder fileSystem(@Nullable FileSystemApplicationLogsConfigResponse fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }
        public ApplicationLogsConfigResponse build() {
            return new ApplicationLogsConfigResponse(azureBlobStorage, azureTableStorage, fileSystem);
        }
    }
}
