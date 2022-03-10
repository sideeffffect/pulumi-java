// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DirectoryWorkspaceCreationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DirectoryWorkspaceCreationPropertiesArgs Empty = new DirectoryWorkspaceCreationPropertiesArgs();

    /**
     * The identifier of your custom security group. Should relate to the same VPC, where workspaces reside in.
     * 
     */
    @InputImport(name="customSecurityGroupId")
      private final @Nullable Input<String> customSecurityGroupId;

    public Input<String> getCustomSecurityGroupId() {
        return this.customSecurityGroupId == null ? Input.empty() : this.customSecurityGroupId;
    }

    /**
     * The default organizational unit (OU) for your WorkSpace directories. Should conform `"OU=<value>,DC=<value>,...,DC=<value>"` pattern.
     * 
     */
    @InputImport(name="defaultOu")
      private final @Nullable Input<String> defaultOu;

    public Input<String> getDefaultOu() {
        return this.defaultOu == null ? Input.empty() : this.defaultOu;
    }

    /**
     * Indicates whether internet access is enabled for your WorkSpaces.
     * 
     */
    @InputImport(name="enableInternetAccess")
      private final @Nullable Input<Boolean> enableInternetAccess;

    public Input<Boolean> getEnableInternetAccess() {
        return this.enableInternetAccess == null ? Input.empty() : this.enableInternetAccess;
    }

    /**
     * Indicates whether maintenance mode is enabled for your WorkSpaces. For more information, see [WorkSpace Maintenance](https://docs.aws.amazon.com/workspaces/latest/adminguide/workspace-maintenance.html)..
     * 
     */
    @InputImport(name="enableMaintenanceMode")
      private final @Nullable Input<Boolean> enableMaintenanceMode;

    public Input<Boolean> getEnableMaintenanceMode() {
        return this.enableMaintenanceMode == null ? Input.empty() : this.enableMaintenanceMode;
    }

    /**
     * Indicates whether users are local administrators of their WorkSpaces.
     * 
     */
    @InputImport(name="userEnabledAsLocalAdministrator")
      private final @Nullable Input<Boolean> userEnabledAsLocalAdministrator;

    public Input<Boolean> getUserEnabledAsLocalAdministrator() {
        return this.userEnabledAsLocalAdministrator == null ? Input.empty() : this.userEnabledAsLocalAdministrator;
    }

    public DirectoryWorkspaceCreationPropertiesArgs(
        @Nullable Input<String> customSecurityGroupId,
        @Nullable Input<String> defaultOu,
        @Nullable Input<Boolean> enableInternetAccess,
        @Nullable Input<Boolean> enableMaintenanceMode,
        @Nullable Input<Boolean> userEnabledAsLocalAdministrator) {
        this.customSecurityGroupId = customSecurityGroupId;
        this.defaultOu = defaultOu;
        this.enableInternetAccess = enableInternetAccess;
        this.enableMaintenanceMode = enableMaintenanceMode;
        this.userEnabledAsLocalAdministrator = userEnabledAsLocalAdministrator;
    }

    private DirectoryWorkspaceCreationPropertiesArgs() {
        this.customSecurityGroupId = Input.empty();
        this.defaultOu = Input.empty();
        this.enableInternetAccess = Input.empty();
        this.enableMaintenanceMode = Input.empty();
        this.userEnabledAsLocalAdministrator = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectoryWorkspaceCreationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> customSecurityGroupId;
        private @Nullable Input<String> defaultOu;
        private @Nullable Input<Boolean> enableInternetAccess;
        private @Nullable Input<Boolean> enableMaintenanceMode;
        private @Nullable Input<Boolean> userEnabledAsLocalAdministrator;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectoryWorkspaceCreationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customSecurityGroupId = defaults.customSecurityGroupId;
    	      this.defaultOu = defaults.defaultOu;
    	      this.enableInternetAccess = defaults.enableInternetAccess;
    	      this.enableMaintenanceMode = defaults.enableMaintenanceMode;
    	      this.userEnabledAsLocalAdministrator = defaults.userEnabledAsLocalAdministrator;
        }

        public Builder customSecurityGroupId(@Nullable Input<String> customSecurityGroupId) {
            this.customSecurityGroupId = customSecurityGroupId;
            return this;
        }

        public Builder customSecurityGroupId(@Nullable String customSecurityGroupId) {
            this.customSecurityGroupId = Input.ofNullable(customSecurityGroupId);
            return this;
        }

        public Builder defaultOu(@Nullable Input<String> defaultOu) {
            this.defaultOu = defaultOu;
            return this;
        }

        public Builder defaultOu(@Nullable String defaultOu) {
            this.defaultOu = Input.ofNullable(defaultOu);
            return this;
        }

        public Builder enableInternetAccess(@Nullable Input<Boolean> enableInternetAccess) {
            this.enableInternetAccess = enableInternetAccess;
            return this;
        }

        public Builder enableInternetAccess(@Nullable Boolean enableInternetAccess) {
            this.enableInternetAccess = Input.ofNullable(enableInternetAccess);
            return this;
        }

        public Builder enableMaintenanceMode(@Nullable Input<Boolean> enableMaintenanceMode) {
            this.enableMaintenanceMode = enableMaintenanceMode;
            return this;
        }

        public Builder enableMaintenanceMode(@Nullable Boolean enableMaintenanceMode) {
            this.enableMaintenanceMode = Input.ofNullable(enableMaintenanceMode);
            return this;
        }

        public Builder userEnabledAsLocalAdministrator(@Nullable Input<Boolean> userEnabledAsLocalAdministrator) {
            this.userEnabledAsLocalAdministrator = userEnabledAsLocalAdministrator;
            return this;
        }

        public Builder userEnabledAsLocalAdministrator(@Nullable Boolean userEnabledAsLocalAdministrator) {
            this.userEnabledAsLocalAdministrator = Input.ofNullable(userEnabledAsLocalAdministrator);
            return this;
        }
        public DirectoryWorkspaceCreationPropertiesArgs build() {
            return new DirectoryWorkspaceCreationPropertiesArgs(customSecurityGroupId, defaultOu, enableInternetAccess, enableMaintenanceMode, userEnabledAsLocalAdministrator);
        }
    }
}
