// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.inputs.DomainJupyterServerAppSettingsArgs;
import com.pulumi.awsnative.sagemaker.inputs.DomainKernelGatewayAppSettingsArgs;
import com.pulumi.awsnative.sagemaker.inputs.DomainSharingSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A collection of settings that apply to users of Amazon SageMaker Studio. These settings are specified when the CreateUserProfile API is called, and as DefaultUserSettings when the CreateDomain API is called.
 * 
 */
public final class DomainUserSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainUserSettingsArgs Empty = new DomainUserSettingsArgs();

    /**
     * The user profile Amazon Resource Name (ARN).
     * 
     */
    @Import(name="executionRole")
    private @Nullable Output<String> executionRole;

    public Optional<Output<String>> executionRole() {
        return Optional.ofNullable(this.executionRole);
    }

    /**
     * The Jupyter server&#39;s app settings.
     * 
     */
    @Import(name="jupyterServerAppSettings")
    private @Nullable Output<DomainJupyterServerAppSettingsArgs> jupyterServerAppSettings;

    public Optional<Output<DomainJupyterServerAppSettingsArgs>> jupyterServerAppSettings() {
        return Optional.ofNullable(this.jupyterServerAppSettings);
    }

    /**
     * The kernel gateway app settings.
     * 
     */
    @Import(name="kernelGatewayAppSettings")
    private @Nullable Output<DomainKernelGatewayAppSettingsArgs> kernelGatewayAppSettings;

    public Optional<Output<DomainKernelGatewayAppSettingsArgs>> kernelGatewayAppSettings() {
        return Optional.ofNullable(this.kernelGatewayAppSettings);
    }

    /**
     * The security groups for the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    @Import(name="securityGroups")
    private @Nullable Output<List<String>> securityGroups;

    public Optional<Output<List<String>>> securityGroups() {
        return Optional.ofNullable(this.securityGroups);
    }

    /**
     * The sharing settings.
     * 
     */
    @Import(name="sharingSettings")
    private @Nullable Output<DomainSharingSettingsArgs> sharingSettings;

    public Optional<Output<DomainSharingSettingsArgs>> sharingSettings() {
        return Optional.ofNullable(this.sharingSettings);
    }

    private DomainUserSettingsArgs() {}

    private DomainUserSettingsArgs(DomainUserSettingsArgs $) {
        this.executionRole = $.executionRole;
        this.jupyterServerAppSettings = $.jupyterServerAppSettings;
        this.kernelGatewayAppSettings = $.kernelGatewayAppSettings;
        this.securityGroups = $.securityGroups;
        this.sharingSettings = $.sharingSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainUserSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainUserSettingsArgs $;

        public Builder() {
            $ = new DomainUserSettingsArgs();
        }

        public Builder(DomainUserSettingsArgs defaults) {
            $ = new DomainUserSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder executionRole(@Nullable Output<String> executionRole) {
            $.executionRole = executionRole;
            return this;
        }

        public Builder executionRole(String executionRole) {
            return executionRole(Output.of(executionRole));
        }

        public Builder jupyterServerAppSettings(@Nullable Output<DomainJupyterServerAppSettingsArgs> jupyterServerAppSettings) {
            $.jupyterServerAppSettings = jupyterServerAppSettings;
            return this;
        }

        public Builder jupyterServerAppSettings(DomainJupyterServerAppSettingsArgs jupyterServerAppSettings) {
            return jupyterServerAppSettings(Output.of(jupyterServerAppSettings));
        }

        public Builder kernelGatewayAppSettings(@Nullable Output<DomainKernelGatewayAppSettingsArgs> kernelGatewayAppSettings) {
            $.kernelGatewayAppSettings = kernelGatewayAppSettings;
            return this;
        }

        public Builder kernelGatewayAppSettings(DomainKernelGatewayAppSettingsArgs kernelGatewayAppSettings) {
            return kernelGatewayAppSettings(Output.of(kernelGatewayAppSettings));
        }

        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            $.securityGroups = securityGroups;
            return this;
        }

        public Builder securityGroups(List<String> securityGroups) {
            return securityGroups(Output.of(securityGroups));
        }

        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }

        public Builder sharingSettings(@Nullable Output<DomainSharingSettingsArgs> sharingSettings) {
            $.sharingSettings = sharingSettings;
            return this;
        }

        public Builder sharingSettings(DomainSharingSettingsArgs sharingSettings) {
            return sharingSettings(Output.of(sharingSettings));
        }

        public DomainUserSettingsArgs build() {
            return $;
        }
    }

}
