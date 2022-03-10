// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.inputs;

import io.pulumi.azurenative.sqlvirtualmachine.inputs.SQLStorageSettingsResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Storage Configurations for SQL Data, Log and TempDb.
 * 
 */
public final class StorageConfigurationSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final StorageConfigurationSettingsResponse Empty = new StorageConfigurationSettingsResponse();

    /**
     * Disk configuration to apply to SQL Server.
     * 
     */
    @InputImport(name="diskConfigurationType")
      private final @Nullable String diskConfigurationType;

    public Optional<String> getDiskConfigurationType() {
        return this.diskConfigurationType == null ? Optional.empty() : Optional.ofNullable(this.diskConfigurationType);
    }

    /**
     * SQL Server Data Storage Settings.
     * 
     */
    @InputImport(name="sqlDataSettings")
      private final @Nullable SQLStorageSettingsResponse sqlDataSettings;

    public Optional<SQLStorageSettingsResponse> getSqlDataSettings() {
        return this.sqlDataSettings == null ? Optional.empty() : Optional.ofNullable(this.sqlDataSettings);
    }

    /**
     * SQL Server Log Storage Settings.
     * 
     */
    @InputImport(name="sqlLogSettings")
      private final @Nullable SQLStorageSettingsResponse sqlLogSettings;

    public Optional<SQLStorageSettingsResponse> getSqlLogSettings() {
        return this.sqlLogSettings == null ? Optional.empty() : Optional.ofNullable(this.sqlLogSettings);
    }

    /**
     * SQL Server TempDb Storage Settings.
     * 
     */
    @InputImport(name="sqlTempDbSettings")
      private final @Nullable SQLStorageSettingsResponse sqlTempDbSettings;

    public Optional<SQLStorageSettingsResponse> getSqlTempDbSettings() {
        return this.sqlTempDbSettings == null ? Optional.empty() : Optional.ofNullable(this.sqlTempDbSettings);
    }

    /**
     * Storage workload type.
     * 
     */
    @InputImport(name="storageWorkloadType")
      private final @Nullable String storageWorkloadType;

    public Optional<String> getStorageWorkloadType() {
        return this.storageWorkloadType == null ? Optional.empty() : Optional.ofNullable(this.storageWorkloadType);
    }

    public StorageConfigurationSettingsResponse(
        @Nullable String diskConfigurationType,
        @Nullable SQLStorageSettingsResponse sqlDataSettings,
        @Nullable SQLStorageSettingsResponse sqlLogSettings,
        @Nullable SQLStorageSettingsResponse sqlTempDbSettings,
        @Nullable String storageWorkloadType) {
        this.diskConfigurationType = diskConfigurationType;
        this.sqlDataSettings = sqlDataSettings;
        this.sqlLogSettings = sqlLogSettings;
        this.sqlTempDbSettings = sqlTempDbSettings;
        this.storageWorkloadType = storageWorkloadType;
    }

    private StorageConfigurationSettingsResponse() {
        this.diskConfigurationType = null;
        this.sqlDataSettings = null;
        this.sqlLogSettings = null;
        this.sqlTempDbSettings = null;
        this.storageWorkloadType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageConfigurationSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String diskConfigurationType;
        private @Nullable SQLStorageSettingsResponse sqlDataSettings;
        private @Nullable SQLStorageSettingsResponse sqlLogSettings;
        private @Nullable SQLStorageSettingsResponse sqlTempDbSettings;
        private @Nullable String storageWorkloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageConfigurationSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskConfigurationType = defaults.diskConfigurationType;
    	      this.sqlDataSettings = defaults.sqlDataSettings;
    	      this.sqlLogSettings = defaults.sqlLogSettings;
    	      this.sqlTempDbSettings = defaults.sqlTempDbSettings;
    	      this.storageWorkloadType = defaults.storageWorkloadType;
        }

        public Builder diskConfigurationType(@Nullable String diskConfigurationType) {
            this.diskConfigurationType = diskConfigurationType;
            return this;
        }

        public Builder sqlDataSettings(@Nullable SQLStorageSettingsResponse sqlDataSettings) {
            this.sqlDataSettings = sqlDataSettings;
            return this;
        }

        public Builder sqlLogSettings(@Nullable SQLStorageSettingsResponse sqlLogSettings) {
            this.sqlLogSettings = sqlLogSettings;
            return this;
        }

        public Builder sqlTempDbSettings(@Nullable SQLStorageSettingsResponse sqlTempDbSettings) {
            this.sqlTempDbSettings = sqlTempDbSettings;
            return this;
        }

        public Builder storageWorkloadType(@Nullable String storageWorkloadType) {
            this.storageWorkloadType = storageWorkloadType;
            return this;
        }
        public StorageConfigurationSettingsResponse build() {
            return new StorageConfigurationSettingsResponse(diskConfigurationType, sqlDataSettings, sqlLogSettings, sqlTempDbSettings, storageWorkloadType);
        }
    }
}
