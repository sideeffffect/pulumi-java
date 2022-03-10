// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseInstanceSettingsBackupConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceSettingsBackupConfigurationGetArgs Empty = new DatabaseInstanceSettingsBackupConfigurationGetArgs();

    /**
     * Backup retention settings. The configuration is detailed below.
     * 
     */
    @InputImport(name="backupRetentionSettings")
      private final @Nullable Input<DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsGetArgs> backupRetentionSettings;

    public Input<DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsGetArgs> getBackupRetentionSettings() {
        return this.backupRetentionSettings == null ? Input.empty() : this.backupRetentionSettings;
    }

    /**
     * True if binary logging is enabled.
     * Cannot be used with Postgres.
     * 
     */
    @InputImport(name="binaryLogEnabled")
      private final @Nullable Input<Boolean> binaryLogEnabled;

    public Input<Boolean> getBinaryLogEnabled() {
        return this.binaryLogEnabled == null ? Input.empty() : this.binaryLogEnabled;
    }

    /**
     * True if backup configuration is enabled.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The region where the backup will be stored
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * True if Point-in-time recovery is enabled. Will restart database if enabled after instance creation. Valid only for PostgreSQL instances.
     * 
     */
    @InputImport(name="pointInTimeRecoveryEnabled")
      private final @Nullable Input<Boolean> pointInTimeRecoveryEnabled;

    public Input<Boolean> getPointInTimeRecoveryEnabled() {
        return this.pointInTimeRecoveryEnabled == null ? Input.empty() : this.pointInTimeRecoveryEnabled;
    }

    /**
     * `HH:MM` format time indicating when backup
     * configuration starts.
     * 
     */
    @InputImport(name="startTime")
      private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    /**
     * The number of days of transaction logs we retain for point in time restore, from 1-7.
     * 
     */
    @InputImport(name="transactionLogRetentionDays")
      private final @Nullable Input<Integer> transactionLogRetentionDays;

    public Input<Integer> getTransactionLogRetentionDays() {
        return this.transactionLogRetentionDays == null ? Input.empty() : this.transactionLogRetentionDays;
    }

    public DatabaseInstanceSettingsBackupConfigurationGetArgs(
        @Nullable Input<DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsGetArgs> backupRetentionSettings,
        @Nullable Input<Boolean> binaryLogEnabled,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> location,
        @Nullable Input<Boolean> pointInTimeRecoveryEnabled,
        @Nullable Input<String> startTime,
        @Nullable Input<Integer> transactionLogRetentionDays) {
        this.backupRetentionSettings = backupRetentionSettings;
        this.binaryLogEnabled = binaryLogEnabled;
        this.enabled = enabled;
        this.location = location;
        this.pointInTimeRecoveryEnabled = pointInTimeRecoveryEnabled;
        this.startTime = startTime;
        this.transactionLogRetentionDays = transactionLogRetentionDays;
    }

    private DatabaseInstanceSettingsBackupConfigurationGetArgs() {
        this.backupRetentionSettings = Input.empty();
        this.binaryLogEnabled = Input.empty();
        this.enabled = Input.empty();
        this.location = Input.empty();
        this.pointInTimeRecoveryEnabled = Input.empty();
        this.startTime = Input.empty();
        this.transactionLogRetentionDays = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceSettingsBackupConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsGetArgs> backupRetentionSettings;
        private @Nullable Input<Boolean> binaryLogEnabled;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> location;
        private @Nullable Input<Boolean> pointInTimeRecoveryEnabled;
        private @Nullable Input<String> startTime;
        private @Nullable Input<Integer> transactionLogRetentionDays;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceSettingsBackupConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupRetentionSettings = defaults.backupRetentionSettings;
    	      this.binaryLogEnabled = defaults.binaryLogEnabled;
    	      this.enabled = defaults.enabled;
    	      this.location = defaults.location;
    	      this.pointInTimeRecoveryEnabled = defaults.pointInTimeRecoveryEnabled;
    	      this.startTime = defaults.startTime;
    	      this.transactionLogRetentionDays = defaults.transactionLogRetentionDays;
        }

        public Builder backupRetentionSettings(@Nullable Input<DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsGetArgs> backupRetentionSettings) {
            this.backupRetentionSettings = backupRetentionSettings;
            return this;
        }

        public Builder backupRetentionSettings(@Nullable DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettingsGetArgs backupRetentionSettings) {
            this.backupRetentionSettings = Input.ofNullable(backupRetentionSettings);
            return this;
        }

        public Builder binaryLogEnabled(@Nullable Input<Boolean> binaryLogEnabled) {
            this.binaryLogEnabled = binaryLogEnabled;
            return this;
        }

        public Builder binaryLogEnabled(@Nullable Boolean binaryLogEnabled) {
            this.binaryLogEnabled = Input.ofNullable(binaryLogEnabled);
            return this;
        }

        public Builder enabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
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

        public Builder pointInTimeRecoveryEnabled(@Nullable Input<Boolean> pointInTimeRecoveryEnabled) {
            this.pointInTimeRecoveryEnabled = pointInTimeRecoveryEnabled;
            return this;
        }

        public Builder pointInTimeRecoveryEnabled(@Nullable Boolean pointInTimeRecoveryEnabled) {
            this.pointInTimeRecoveryEnabled = Input.ofNullable(pointInTimeRecoveryEnabled);
            return this;
        }

        public Builder startTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder startTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public Builder transactionLogRetentionDays(@Nullable Input<Integer> transactionLogRetentionDays) {
            this.transactionLogRetentionDays = transactionLogRetentionDays;
            return this;
        }

        public Builder transactionLogRetentionDays(@Nullable Integer transactionLogRetentionDays) {
            this.transactionLogRetentionDays = Input.ofNullable(transactionLogRetentionDays);
            return this;
        }
        public DatabaseInstanceSettingsBackupConfigurationGetArgs build() {
            return new DatabaseInstanceSettingsBackupConfigurationGetArgs(backupRetentionSettings, binaryLogEnabled, enabled, location, pointInTimeRecoveryEnabled, startTime, transactionLogRetentionDays);
        }
    }
}
