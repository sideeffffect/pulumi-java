// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.AppServiceLogsHttpLogsAzureBlobStorage;
import com.pulumi.azure.appservice.outputs.AppServiceLogsHttpLogsFileSystem;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppServiceLogsHttpLogs {
    /**
     * @return An `azure_blob_storage` block as defined below.
     * 
     */
    private final @Nullable AppServiceLogsHttpLogsAzureBlobStorage azureBlobStorage;
    /**
     * @return A `file_system` block as defined below.
     * 
     */
    private final @Nullable AppServiceLogsHttpLogsFileSystem fileSystem;

    @CustomType.Constructor
    private AppServiceLogsHttpLogs(
        @CustomType.Parameter("azureBlobStorage") @Nullable AppServiceLogsHttpLogsAzureBlobStorage azureBlobStorage,
        @CustomType.Parameter("fileSystem") @Nullable AppServiceLogsHttpLogsFileSystem fileSystem) {
        this.azureBlobStorage = azureBlobStorage;
        this.fileSystem = fileSystem;
    }

    /**
     * @return An `azure_blob_storage` block as defined below.
     * 
     */
    public Optional<AppServiceLogsHttpLogsAzureBlobStorage> azureBlobStorage() {
        return Optional.ofNullable(this.azureBlobStorage);
    }
    /**
     * @return A `file_system` block as defined below.
     * 
     */
    public Optional<AppServiceLogsHttpLogsFileSystem> fileSystem() {
        return Optional.ofNullable(this.fileSystem);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppServiceLogsHttpLogs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AppServiceLogsHttpLogsAzureBlobStorage azureBlobStorage;
        private @Nullable AppServiceLogsHttpLogsFileSystem fileSystem;

        public Builder() {
    	      // Empty
        }

        public Builder(AppServiceLogsHttpLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureBlobStorage = defaults.azureBlobStorage;
    	      this.fileSystem = defaults.fileSystem;
        }

        public Builder azureBlobStorage(@Nullable AppServiceLogsHttpLogsAzureBlobStorage azureBlobStorage) {
            this.azureBlobStorage = azureBlobStorage;
            return this;
        }
        public Builder fileSystem(@Nullable AppServiceLogsHttpLogsFileSystem fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }        public AppServiceLogsHttpLogs build() {
            return new AppServiceLogsHttpLogs(azureBlobStorage, fileSystem);
        }
    }
}
