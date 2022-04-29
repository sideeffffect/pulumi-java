// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.inputs.UserProfileJupyterServerAppSettingsArgs;
import com.pulumi.awsnative.sagemaker.inputs.UserProfileKernelGatewayAppSettingsArgs;
import com.pulumi.awsnative.sagemaker.inputs.UserProfileSharingSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A collection of settings that apply to users of Amazon SageMaker Studio. These settings are specified when the CreateUserProfile API is called, and as DefaultUserSettings when the CreateDomain API is called.
 * 
 */
public final class UserProfileUserSettingsArgs extends ResourceArgs {

    public static final UserProfileUserSettingsArgs Empty = new UserProfileUserSettingsArgs();

    /**
     * The user profile Amazon Resource Name (ARN).
     * 
     */
    @Import(name="executionRole")
    private @Nullable Output<String> executionRole;

    /**
     * @return The user profile Amazon Resource Name (ARN).
     * 
     */
    public Optional<Output<String>> executionRole() {
        return Optional.ofNullable(this.executionRole);
    }

    /**
     * The Jupyter server&#39;s app settings.
     * 
     */
    @Import(name="jupyterServerAppSettings")
    private @Nullable Output<UserProfileJupyterServerAppSettingsArgs> jupyterServerAppSettings;

    /**
     * @return The Jupyter server&#39;s app settings.
     * 
     */
    public Optional<Output<UserProfileJupyterServerAppSettingsArgs>> jupyterServerAppSettings() {
        return Optional.ofNullable(this.jupyterServerAppSettings);
    }

    /**
     * The kernel gateway app settings.
     * 
     */
    @Import(name="kernelGatewayAppSettings")
    private @Nullable Output<UserProfileKernelGatewayAppSettingsArgs> kernelGatewayAppSettings;

    /**
     * @return The kernel gateway app settings.
     * 
     */
    public Optional<Output<UserProfileKernelGatewayAppSettingsArgs>> kernelGatewayAppSettings() {
        return Optional.ofNullable(this.kernelGatewayAppSettings);
    }

    /**
     * The security groups for the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    @Import(name="securityGroups")
    private @Nullable Output<List<String>> securityGroups;

    /**
     * @return The security groups for the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    public Optional<Output<List<String>>> securityGroups() {
        return Optional.ofNullable(this.securityGroups);
    }

    /**
     * The sharing settings.
     * 
     */
    @Import(name="sharingSettings")
    private @Nullable Output<UserProfileSharingSettingsArgs> sharingSettings;

    /**
     * @return The sharing settings.
     * 
     */
    public Optional<Output<UserProfileSharingSettingsArgs>> sharingSettings() {
        return Optional.ofNullable(this.sharingSettings);
    }

    private UserProfileUserSettingsArgs() {}

    private UserProfileUserSettingsArgs(UserProfileUserSettingsArgs $) {
        this.executionRole = $.executionRole;
        this.jupyterServerAppSettings = $.jupyterServerAppSettings;
        this.kernelGatewayAppSettings = $.kernelGatewayAppSettings;
        this.securityGroups = $.securityGroups;
        this.sharingSettings = $.sharingSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserProfileUserSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserProfileUserSettingsArgs $;

        public Builder() {
            $ = new UserProfileUserSettingsArgs();
        }

        public Builder(UserProfileUserSettingsArgs defaults) {
            $ = new UserProfileUserSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param executionRole The user profile Amazon Resource Name (ARN).
         * 
         * @return builder
         * 
         */
        public Builder executionRole(@Nullable Output<String> executionRole) {
            $.executionRole = executionRole;
            return this;
        }

        /**
         * @param executionRole The user profile Amazon Resource Name (ARN).
         * 
         * @return builder
         * 
         */
        public Builder executionRole(String executionRole) {
            return executionRole(Output.of(executionRole));
        }

        /**
         * @param jupyterServerAppSettings The Jupyter server&#39;s app settings.
         * 
         * @return builder
         * 
         */
        public Builder jupyterServerAppSettings(@Nullable Output<UserProfileJupyterServerAppSettingsArgs> jupyterServerAppSettings) {
            $.jupyterServerAppSettings = jupyterServerAppSettings;
            return this;
        }

        /**
         * @param jupyterServerAppSettings The Jupyter server&#39;s app settings.
         * 
         * @return builder
         * 
         */
        public Builder jupyterServerAppSettings(UserProfileJupyterServerAppSettingsArgs jupyterServerAppSettings) {
            return jupyterServerAppSettings(Output.of(jupyterServerAppSettings));
        }

        /**
         * @param kernelGatewayAppSettings The kernel gateway app settings.
         * 
         * @return builder
         * 
         */
        public Builder kernelGatewayAppSettings(@Nullable Output<UserProfileKernelGatewayAppSettingsArgs> kernelGatewayAppSettings) {
            $.kernelGatewayAppSettings = kernelGatewayAppSettings;
            return this;
        }

        /**
         * @param kernelGatewayAppSettings The kernel gateway app settings.
         * 
         * @return builder
         * 
         */
        public Builder kernelGatewayAppSettings(UserProfileKernelGatewayAppSettingsArgs kernelGatewayAppSettings) {
            return kernelGatewayAppSettings(Output.of(kernelGatewayAppSettings));
        }

        /**
         * @param securityGroups The security groups for the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            $.securityGroups = securityGroups;
            return this;
        }

        /**
         * @param securityGroups The security groups for the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(List<String> securityGroups) {
            return securityGroups(Output.of(securityGroups));
        }

        /**
         * @param securityGroups The security groups for the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }

        /**
         * @param sharingSettings The sharing settings.
         * 
         * @return builder
         * 
         */
        public Builder sharingSettings(@Nullable Output<UserProfileSharingSettingsArgs> sharingSettings) {
            $.sharingSettings = sharingSettings;
            return this;
        }

        /**
         * @param sharingSettings The sharing settings.
         * 
         * @return builder
         * 
         */
        public Builder sharingSettings(UserProfileSharingSettingsArgs sharingSettings) {
            return sharingSettings(Output.of(sharingSettings));
        }

        public UserProfileUserSettingsArgs build() {
            return $;
        }
    }

}
