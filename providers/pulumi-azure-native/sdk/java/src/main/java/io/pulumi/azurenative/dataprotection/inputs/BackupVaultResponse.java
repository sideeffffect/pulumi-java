// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.inputs.StorageSettingResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Backup Vault
 * 
 */
public final class BackupVaultResponse extends io.pulumi.resources.InvokeArgs {

    public static final BackupVaultResponse Empty = new BackupVaultResponse();

    /**
     * Provisioning state of the BackupVault resource
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Storage Settings
     * 
     */
    @InputImport(name="storageSettings", required=true)
      private final List<StorageSettingResponse> storageSettings;

    public List<StorageSettingResponse> getStorageSettings() {
        return this.storageSettings;
    }

    public BackupVaultResponse(
        String provisioningState,
        List<StorageSettingResponse> storageSettings) {
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.storageSettings = Objects.requireNonNull(storageSettings, "expected parameter 'storageSettings' to be non-null");
    }

    private BackupVaultResponse() {
        this.provisioningState = null;
        this.storageSettings = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupVaultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String provisioningState;
        private List<StorageSettingResponse> storageSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupVaultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provisioningState = defaults.provisioningState;
    	      this.storageSettings = defaults.storageSettings;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder storageSettings(List<StorageSettingResponse> storageSettings) {
            this.storageSettings = Objects.requireNonNull(storageSettings);
            return this;
        }
        public BackupVaultResponse build() {
            return new BackupVaultResponse(provisioningState, storageSettings);
        }
    }
}
