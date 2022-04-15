// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.sql.outputs.DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettings;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatabaseInstanceSettingsBackupConfiguration {
    /**
     * Backup retention settings. The configuration is detailed below.
     * 
     */
    private final @Nullable DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettings backupRetentionSettings;
    /**
     * True if binary logging is enabled.
     * Cannot be used with Postgres.
     * 
     */
    private final @Nullable Boolean binaryLogEnabled;
    /**
     * True if backup configuration is enabled.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * The region where the backup will be stored
     * 
     */
    private final @Nullable String location;
    /**
     * True if Point-in-time recovery is enabled. Will restart database if enabled after instance creation. Valid only for PostgreSQL instances.
     * 
     */
    private final @Nullable Boolean pointInTimeRecoveryEnabled;
    /**
     * `HH:MM` format time indicating when backup
     * configuration starts.
     * 
     */
    private final @Nullable String startTime;
    /**
     * The number of days of transaction logs we retain for point in time restore, from 1-7.
     * 
     */
    private final @Nullable Integer transactionLogRetentionDays;

    @CustomType.Constructor
    private DatabaseInstanceSettingsBackupConfiguration(
        @CustomType.Parameter("backupRetentionSettings") @Nullable DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettings backupRetentionSettings,
        @CustomType.Parameter("binaryLogEnabled") @Nullable Boolean binaryLogEnabled,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("pointInTimeRecoveryEnabled") @Nullable Boolean pointInTimeRecoveryEnabled,
        @CustomType.Parameter("startTime") @Nullable String startTime,
        @CustomType.Parameter("transactionLogRetentionDays") @Nullable Integer transactionLogRetentionDays) {
        this.backupRetentionSettings = backupRetentionSettings;
        this.binaryLogEnabled = binaryLogEnabled;
        this.enabled = enabled;
        this.location = location;
        this.pointInTimeRecoveryEnabled = pointInTimeRecoveryEnabled;
        this.startTime = startTime;
        this.transactionLogRetentionDays = transactionLogRetentionDays;
    }

    /**
     * Backup retention settings. The configuration is detailed below.
     * 
    */
    public Optional<DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettings> backupRetentionSettings() {
        return Optional.ofNullable(this.backupRetentionSettings);
    }
    /**
     * True if binary logging is enabled.
     * Cannot be used with Postgres.
     * 
    */
    public Optional<Boolean> binaryLogEnabled() {
        return Optional.ofNullable(this.binaryLogEnabled);
    }
    /**
     * True if backup configuration is enabled.
     * 
    */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * The region where the backup will be stored
     * 
    */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * True if Point-in-time recovery is enabled. Will restart database if enabled after instance creation. Valid only for PostgreSQL instances.
     * 
    */
    public Optional<Boolean> pointInTimeRecoveryEnabled() {
        return Optional.ofNullable(this.pointInTimeRecoveryEnabled);
    }
    /**
     * `HH:MM` format time indicating when backup
     * configuration starts.
     * 
    */
    public Optional<String> startTime() {
        return Optional.ofNullable(this.startTime);
    }
    /**
     * The number of days of transaction logs we retain for point in time restore, from 1-7.
     * 
    */
    public Optional<Integer> transactionLogRetentionDays() {
        return Optional.ofNullable(this.transactionLogRetentionDays);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceSettingsBackupConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettings backupRetentionSettings;
        private @Nullable Boolean binaryLogEnabled;
        private @Nullable Boolean enabled;
        private @Nullable String location;
        private @Nullable Boolean pointInTimeRecoveryEnabled;
        private @Nullable String startTime;
        private @Nullable Integer transactionLogRetentionDays;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceSettingsBackupConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupRetentionSettings = defaults.backupRetentionSettings;
    	      this.binaryLogEnabled = defaults.binaryLogEnabled;
    	      this.enabled = defaults.enabled;
    	      this.location = defaults.location;
    	      this.pointInTimeRecoveryEnabled = defaults.pointInTimeRecoveryEnabled;
    	      this.startTime = defaults.startTime;
    	      this.transactionLogRetentionDays = defaults.transactionLogRetentionDays;
        }

        public Builder backupRetentionSettings(@Nullable DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettings backupRetentionSettings) {
            this.backupRetentionSettings = backupRetentionSettings;
            return this;
        }
        public Builder binaryLogEnabled(@Nullable Boolean binaryLogEnabled) {
            this.binaryLogEnabled = binaryLogEnabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder pointInTimeRecoveryEnabled(@Nullable Boolean pointInTimeRecoveryEnabled) {
            this.pointInTimeRecoveryEnabled = pointInTimeRecoveryEnabled;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder transactionLogRetentionDays(@Nullable Integer transactionLogRetentionDays) {
            this.transactionLogRetentionDays = transactionLogRetentionDays;
            return this;
        }        public DatabaseInstanceSettingsBackupConfiguration build() {
            return new DatabaseInstanceSettingsBackupConfiguration(backupRetentionSettings, binaryLogEnabled, enabled, location, pointInTimeRecoveryEnabled, startTime, transactionLogRetentionDays);
        }
    }
}
