// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings to use an existing storage account. Valid storage account kinds are: Storage, StorageV2 and FileStorage
 * 
 */
public final class StorageAccountConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final StorageAccountConfigurationResponse Empty = new StorageAccountConfigurationResponse();

    /**
     * The storage account access key.
     * 
     */
    @InputImport(name="storageAccountKey")
      private final @Nullable String storageAccountKey;

    public Optional<String> getStorageAccountKey() {
        return this.storageAccountKey == null ? Optional.empty() : Optional.ofNullable(this.storageAccountKey);
    }

    /**
     * The storage account name.
     * 
     */
    @InputImport(name="storageAccountName")
      private final @Nullable String storageAccountName;

    public Optional<String> getStorageAccountName() {
        return this.storageAccountName == null ? Optional.empty() : Optional.ofNullable(this.storageAccountName);
    }

    public StorageAccountConfigurationResponse(
        @Nullable String storageAccountKey,
        @Nullable String storageAccountName) {
        this.storageAccountKey = storageAccountKey;
        this.storageAccountName = storageAccountName;
    }

    private StorageAccountConfigurationResponse() {
        this.storageAccountKey = null;
        this.storageAccountName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String storageAccountKey;
        private @Nullable String storageAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.storageAccountKey = defaults.storageAccountKey;
    	      this.storageAccountName = defaults.storageAccountName;
        }

        public Builder storageAccountKey(@Nullable String storageAccountKey) {
            this.storageAccountKey = storageAccountKey;
            return this;
        }

        public Builder storageAccountName(@Nullable String storageAccountName) {
            this.storageAccountName = storageAccountName;
            return this;
        }
        public StorageAccountConfigurationResponse build() {
            return new StorageAccountConfigurationResponse(storageAccountKey, storageAccountName);
        }
    }
}
