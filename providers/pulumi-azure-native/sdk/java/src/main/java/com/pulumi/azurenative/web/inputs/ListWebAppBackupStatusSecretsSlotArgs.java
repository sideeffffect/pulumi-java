// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.inputs.BackupSchedule;
import com.pulumi.azurenative.web.inputs.DatabaseBackupSetting;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListWebAppBackupStatusSecretsSlotArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListWebAppBackupStatusSecretsSlotArgs Empty = new ListWebAppBackupStatusSecretsSlotArgs();

    /**
     * ID of backup.
     * 
     */
    @Import(name="backupId", required=true)
    private String backupId;

    public String backupId() {
        return this.backupId;
    }

    /**
     * Name of the backup.
     * 
     */
    @Import(name="backupName")
    private @Nullable String backupName;

    public Optional<String> backupName() {
        return Optional.ofNullable(this.backupName);
    }

    /**
     * Schedule for the backup if it is executed periodically.
     * 
     */
    @Import(name="backupSchedule")
    private @Nullable BackupSchedule backupSchedule;

    public Optional<BackupSchedule> backupSchedule() {
        return Optional.ofNullable(this.backupSchedule);
    }

    /**
     * Databases included in the backup.
     * 
     */
    @Import(name="databases")
    private @Nullable List<DatabaseBackupSetting> databases;

    public Optional<List<DatabaseBackupSetting>> databases() {
        return Optional.ofNullable(this.databases);
    }

    /**
     * True if the backup schedule is enabled (must be included in that case), false if the backup schedule should be disabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
    private @Nullable String kind;

    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Name of web app.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of web app slot. If not specified then will default to production slot.
     * 
     */
    @Import(name="slot", required=true)
    private String slot;

    public String slot() {
        return this.slot;
    }

    /**
     * SAS URL to the container.
     * 
     */
    @Import(name="storageAccountUrl", required=true)
    private String storageAccountUrl;

    public String storageAccountUrl() {
        return this.storageAccountUrl;
    }

    private ListWebAppBackupStatusSecretsSlotArgs() {}

    private ListWebAppBackupStatusSecretsSlotArgs(ListWebAppBackupStatusSecretsSlotArgs $) {
        this.backupId = $.backupId;
        this.backupName = $.backupName;
        this.backupSchedule = $.backupSchedule;
        this.databases = $.databases;
        this.enabled = $.enabled;
        this.kind = $.kind;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.slot = $.slot;
        this.storageAccountUrl = $.storageAccountUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListWebAppBackupStatusSecretsSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListWebAppBackupStatusSecretsSlotArgs $;

        public Builder() {
            $ = new ListWebAppBackupStatusSecretsSlotArgs();
        }

        public Builder(ListWebAppBackupStatusSecretsSlotArgs defaults) {
            $ = new ListWebAppBackupStatusSecretsSlotArgs(Objects.requireNonNull(defaults));
        }

        public Builder backupId(String backupId) {
            $.backupId = backupId;
            return this;
        }

        public Builder backupName(@Nullable String backupName) {
            $.backupName = backupName;
            return this;
        }

        public Builder backupSchedule(@Nullable BackupSchedule backupSchedule) {
            $.backupSchedule = backupSchedule;
            return this;
        }

        public Builder databases(@Nullable List<DatabaseBackupSetting> databases) {
            $.databases = databases;
            return this;
        }

        public Builder databases(DatabaseBackupSetting... databases) {
            return databases(List.of(databases));
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            $.kind = kind;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder slot(String slot) {
            $.slot = slot;
            return this;
        }

        public Builder storageAccountUrl(String storageAccountUrl) {
            $.storageAccountUrl = storageAccountUrl;
            return this;
        }

        public ListWebAppBackupStatusSecretsSlotArgs build() {
            $.backupId = Objects.requireNonNull($.backupId, "expected parameter 'backupId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.slot = Objects.requireNonNull($.slot, "expected parameter 'slot' to be non-null");
            $.storageAccountUrl = Objects.requireNonNull($.storageAccountUrl, "expected parameter 'storageAccountUrl' to be non-null");
            return $;
        }
    }

}
