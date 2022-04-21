// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.enums.CloudServiceUpgradeMode;
import com.pulumi.azurenative.compute.inputs.CloudServiceExtensionProfileArgs;
import com.pulumi.azurenative.compute.inputs.CloudServiceNetworkProfileArgs;
import com.pulumi.azurenative.compute.inputs.CloudServiceOsProfileArgs;
import com.pulumi.azurenative.compute.inputs.CloudServiceRoleProfileArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cloud service properties
 * 
 */
public final class CloudServicePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudServicePropertiesArgs Empty = new CloudServicePropertiesArgs();

    /**
     * (Optional) Indicates whether the role sku properties (roleProfile.roles.sku) specified in the model/template should override the role instance count and vm size specified in the .cscfg and .csdef respectively.
     * The default value is `false`.
     * 
     */
    @Import(name="allowModelOverride")
    private @Nullable Output<Boolean> allowModelOverride;

    public Optional<Output<Boolean>> allowModelOverride() {
        return Optional.ofNullable(this.allowModelOverride);
    }

    /**
     * Specifies the XML service configuration (.cscfg) for the cloud service.
     * 
     */
    @Import(name="configuration")
    private @Nullable Output<String> configuration;

    public Optional<Output<String>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    /**
     * Specifies a URL that refers to the location of the service configuration in the Blob service. The service package URL  can be Shared Access Signature (SAS) URI from any storage account.
     * This is a write-only property and is not returned in GET calls.
     * 
     */
    @Import(name="configurationUrl")
    private @Nullable Output<String> configurationUrl;

    public Optional<Output<String>> configurationUrl() {
        return Optional.ofNullable(this.configurationUrl);
    }

    /**
     * Describes a cloud service extension profile.
     * 
     */
    @Import(name="extensionProfile")
    private @Nullable Output<CloudServiceExtensionProfileArgs> extensionProfile;

    public Optional<Output<CloudServiceExtensionProfileArgs>> extensionProfile() {
        return Optional.ofNullable(this.extensionProfile);
    }

    /**
     * Network Profile for the cloud service.
     * 
     */
    @Import(name="networkProfile")
    private @Nullable Output<CloudServiceNetworkProfileArgs> networkProfile;

    public Optional<Output<CloudServiceNetworkProfileArgs>> networkProfile() {
        return Optional.ofNullable(this.networkProfile);
    }

    /**
     * Describes the OS profile for the cloud service.
     * 
     */
    @Import(name="osProfile")
    private @Nullable Output<CloudServiceOsProfileArgs> osProfile;

    public Optional<Output<CloudServiceOsProfileArgs>> osProfile() {
        return Optional.ofNullable(this.osProfile);
    }

    /**
     * Specifies a URL that refers to the location of the service package in the Blob service. The service package URL can be Shared Access Signature (SAS) URI from any storage account.
     * This is a write-only property and is not returned in GET calls.
     * 
     */
    @Import(name="packageUrl")
    private @Nullable Output<String> packageUrl;

    public Optional<Output<String>> packageUrl() {
        return Optional.ofNullable(this.packageUrl);
    }

    /**
     * Describes the role profile for the cloud service.
     * 
     */
    @Import(name="roleProfile")
    private @Nullable Output<CloudServiceRoleProfileArgs> roleProfile;

    public Optional<Output<CloudServiceRoleProfileArgs>> roleProfile() {
        return Optional.ofNullable(this.roleProfile);
    }

    /**
     * (Optional) Indicates whether to start the cloud service immediately after it is created. The default value is `true`.
     * If false, the service model is still deployed, but the code is not run immediately. Instead, the service is PoweredOff until you call Start, at which time the service will be started. A deployed service still incurs charges, even if it is poweredoff.
     * 
     */
    @Import(name="startCloudService")
    private @Nullable Output<Boolean> startCloudService;

    public Optional<Output<Boolean>> startCloudService() {
        return Optional.ofNullable(this.startCloudService);
    }

    /**
     * Update mode for the cloud service. Role instances are allocated to update domains when the service is deployed. Updates can be initiated manually in each update domain or initiated automatically in all update domains.
     * Possible Values are &lt;br /&gt;&lt;br /&gt;**Auto**&lt;br /&gt;&lt;br /&gt;**Manual** &lt;br /&gt;&lt;br /&gt;**Simultaneous**&lt;br /&gt;&lt;br /&gt;
     * If not specified, the default value is Auto. If set to Manual, PUT UpdateDomain must be called to apply the update. If set to Auto, the update is automatically applied to each update domain in sequence.
     * 
     */
    @Import(name="upgradeMode")
    private @Nullable Output<Either<String,CloudServiceUpgradeMode>> upgradeMode;

    public Optional<Output<Either<String,CloudServiceUpgradeMode>>> upgradeMode() {
        return Optional.ofNullable(this.upgradeMode);
    }

    private CloudServicePropertiesArgs() {}

    private CloudServicePropertiesArgs(CloudServicePropertiesArgs $) {
        this.allowModelOverride = $.allowModelOverride;
        this.configuration = $.configuration;
        this.configurationUrl = $.configurationUrl;
        this.extensionProfile = $.extensionProfile;
        this.networkProfile = $.networkProfile;
        this.osProfile = $.osProfile;
        this.packageUrl = $.packageUrl;
        this.roleProfile = $.roleProfile;
        this.startCloudService = $.startCloudService;
        this.upgradeMode = $.upgradeMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudServicePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudServicePropertiesArgs $;

        public Builder() {
            $ = new CloudServicePropertiesArgs();
        }

        public Builder(CloudServicePropertiesArgs defaults) {
            $ = new CloudServicePropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowModelOverride(@Nullable Output<Boolean> allowModelOverride) {
            $.allowModelOverride = allowModelOverride;
            return this;
        }

        public Builder allowModelOverride(Boolean allowModelOverride) {
            return allowModelOverride(Output.of(allowModelOverride));
        }

        public Builder configuration(@Nullable Output<String> configuration) {
            $.configuration = configuration;
            return this;
        }

        public Builder configuration(String configuration) {
            return configuration(Output.of(configuration));
        }

        public Builder configurationUrl(@Nullable Output<String> configurationUrl) {
            $.configurationUrl = configurationUrl;
            return this;
        }

        public Builder configurationUrl(String configurationUrl) {
            return configurationUrl(Output.of(configurationUrl));
        }

        public Builder extensionProfile(@Nullable Output<CloudServiceExtensionProfileArgs> extensionProfile) {
            $.extensionProfile = extensionProfile;
            return this;
        }

        public Builder extensionProfile(CloudServiceExtensionProfileArgs extensionProfile) {
            return extensionProfile(Output.of(extensionProfile));
        }

        public Builder networkProfile(@Nullable Output<CloudServiceNetworkProfileArgs> networkProfile) {
            $.networkProfile = networkProfile;
            return this;
        }

        public Builder networkProfile(CloudServiceNetworkProfileArgs networkProfile) {
            return networkProfile(Output.of(networkProfile));
        }

        public Builder osProfile(@Nullable Output<CloudServiceOsProfileArgs> osProfile) {
            $.osProfile = osProfile;
            return this;
        }

        public Builder osProfile(CloudServiceOsProfileArgs osProfile) {
            return osProfile(Output.of(osProfile));
        }

        public Builder packageUrl(@Nullable Output<String> packageUrl) {
            $.packageUrl = packageUrl;
            return this;
        }

        public Builder packageUrl(String packageUrl) {
            return packageUrl(Output.of(packageUrl));
        }

        public Builder roleProfile(@Nullable Output<CloudServiceRoleProfileArgs> roleProfile) {
            $.roleProfile = roleProfile;
            return this;
        }

        public Builder roleProfile(CloudServiceRoleProfileArgs roleProfile) {
            return roleProfile(Output.of(roleProfile));
        }

        public Builder startCloudService(@Nullable Output<Boolean> startCloudService) {
            $.startCloudService = startCloudService;
            return this;
        }

        public Builder startCloudService(Boolean startCloudService) {
            return startCloudService(Output.of(startCloudService));
        }

        public Builder upgradeMode(@Nullable Output<Either<String,CloudServiceUpgradeMode>> upgradeMode) {
            $.upgradeMode = upgradeMode;
            return this;
        }

        public Builder upgradeMode(Either<String,CloudServiceUpgradeMode> upgradeMode) {
            return upgradeMode(Output.of(upgradeMode));
        }

        public CloudServicePropertiesArgs build() {
            return $;
        }
    }

}
