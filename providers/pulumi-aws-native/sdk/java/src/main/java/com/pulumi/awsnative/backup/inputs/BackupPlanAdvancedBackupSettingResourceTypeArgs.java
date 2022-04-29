// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.backup.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


public final class BackupPlanAdvancedBackupSettingResourceTypeArgs extends ResourceArgs {

    public static final BackupPlanAdvancedBackupSettingResourceTypeArgs Empty = new BackupPlanAdvancedBackupSettingResourceTypeArgs();

    @Import(name="backupOptions", required=true)
    private Output<Object> backupOptions;

    public Output<Object> backupOptions() {
        return this.backupOptions;
    }

    @Import(name="resourceType", required=true)
    private Output<String> resourceType;

    public Output<String> resourceType() {
        return this.resourceType;
    }

    private BackupPlanAdvancedBackupSettingResourceTypeArgs() {}

    private BackupPlanAdvancedBackupSettingResourceTypeArgs(BackupPlanAdvancedBackupSettingResourceTypeArgs $) {
        this.backupOptions = $.backupOptions;
        this.resourceType = $.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupPlanAdvancedBackupSettingResourceTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupPlanAdvancedBackupSettingResourceTypeArgs $;

        public Builder() {
            $ = new BackupPlanAdvancedBackupSettingResourceTypeArgs();
        }

        public Builder(BackupPlanAdvancedBackupSettingResourceTypeArgs defaults) {
            $ = new BackupPlanAdvancedBackupSettingResourceTypeArgs(Objects.requireNonNull(defaults));
        }

        public Builder backupOptions(Output<Object> backupOptions) {
            $.backupOptions = backupOptions;
            return this;
        }

        public Builder backupOptions(Object backupOptions) {
            return backupOptions(Output.of(backupOptions));
        }

        public Builder resourceType(Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public BackupPlanAdvancedBackupSettingResourceTypeArgs build() {
            $.backupOptions = Objects.requireNonNull($.backupOptions, "expected parameter 'backupOptions' to be non-null");
            $.resourceType = Objects.requireNonNull($.resourceType, "expected parameter 'resourceType' to be non-null");
            return $;
        }
    }

}
