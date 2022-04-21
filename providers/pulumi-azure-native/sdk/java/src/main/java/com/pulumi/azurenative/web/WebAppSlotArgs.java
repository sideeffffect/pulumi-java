// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.web.enums.ClientCertMode;
import com.pulumi.azurenative.web.enums.RedundancyMode;
import com.pulumi.azurenative.web.inputs.CloningInfoArgs;
import com.pulumi.azurenative.web.inputs.HostNameSslStateArgs;
import com.pulumi.azurenative.web.inputs.HostingEnvironmentProfileArgs;
import com.pulumi.azurenative.web.inputs.ManagedServiceIdentityArgs;
import com.pulumi.azurenative.web.inputs.SiteConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAppSlotArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAppSlotArgs Empty = new WebAppSlotArgs();

    /**
     * &lt;code&gt;true&lt;/code&gt; to enable client affinity; &lt;code&gt;false&lt;/code&gt; to stop sending session affinity cookies, which route client requests in the same session to the same instance. Default is &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    @Import(name="clientAffinityEnabled")
    private @Nullable Output<Boolean> clientAffinityEnabled;

    public Optional<Output<Boolean>> clientAffinityEnabled() {
        return Optional.ofNullable(this.clientAffinityEnabled);
    }

    /**
     * &lt;code&gt;true&lt;/code&gt; to enable client certificate authentication (TLS mutual authentication); otherwise, &lt;code&gt;false&lt;/code&gt;. Default is &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    @Import(name="clientCertEnabled")
    private @Nullable Output<Boolean> clientCertEnabled;

    public Optional<Output<Boolean>> clientCertEnabled() {
        return Optional.ofNullable(this.clientCertEnabled);
    }

    /**
     * client certificate authentication comma-separated exclusion paths
     * 
     */
    @Import(name="clientCertExclusionPaths")
    private @Nullable Output<String> clientCertExclusionPaths;

    public Optional<Output<String>> clientCertExclusionPaths() {
        return Optional.ofNullable(this.clientCertExclusionPaths);
    }

    /**
     * This composes with ClientCertEnabled setting.
     * - ClientCertEnabled: false means ClientCert is ignored.
     * - ClientCertEnabled: true and ClientCertMode: Required means ClientCert is required.
     * - ClientCertEnabled: true and ClientCertMode: Optional means ClientCert is optional or accepted.
     * 
     */
    @Import(name="clientCertMode")
    private @Nullable Output<ClientCertMode> clientCertMode;

    public Optional<Output<ClientCertMode>> clientCertMode() {
        return Optional.ofNullable(this.clientCertMode);
    }

    /**
     * If specified during app creation, the app is cloned from a source app.
     * 
     */
    @Import(name="cloningInfo")
    private @Nullable Output<CloningInfoArgs> cloningInfo;

    public Optional<Output<CloningInfoArgs>> cloningInfo() {
        return Optional.ofNullable(this.cloningInfo);
    }

    /**
     * Size of the function container.
     * 
     */
    @Import(name="containerSize")
    private @Nullable Output<Integer> containerSize;

    public Optional<Output<Integer>> containerSize() {
        return Optional.ofNullable(this.containerSize);
    }

    /**
     * Unique identifier that verifies the custom domains assigned to the app. Customer will add this id to a txt record for verification.
     * 
     */
    @Import(name="customDomainVerificationId")
    private @Nullable Output<String> customDomainVerificationId;

    public Optional<Output<String>> customDomainVerificationId() {
        return Optional.ofNullable(this.customDomainVerificationId);
    }

    /**
     * Maximum allowed daily memory-time quota (applicable on dynamic apps only).
     * 
     */
    @Import(name="dailyMemoryTimeQuota")
    private @Nullable Output<Integer> dailyMemoryTimeQuota;

    public Optional<Output<Integer>> dailyMemoryTimeQuota() {
        return Optional.ofNullable(this.dailyMemoryTimeQuota);
    }

    /**
     * &lt;code&gt;true&lt;/code&gt; if the app is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;. Setting this value to false disables the app (takes the app offline).
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Hostname SSL states are used to manage the SSL bindings for app&#39;s hostnames.
     * 
     */
    @Import(name="hostNameSslStates")
    private @Nullable Output<List<HostNameSslStateArgs>> hostNameSslStates;

    public Optional<Output<List<HostNameSslStateArgs>>> hostNameSslStates() {
        return Optional.ofNullable(this.hostNameSslStates);
    }

    /**
     * &lt;code&gt;true&lt;/code&gt; to disable the public hostnames of the app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *  If &lt;code&gt;true&lt;/code&gt;, the app is only accessible via API management process.
     * 
     */
    @Import(name="hostNamesDisabled")
    private @Nullable Output<Boolean> hostNamesDisabled;

    public Optional<Output<Boolean>> hostNamesDisabled() {
        return Optional.ofNullable(this.hostNamesDisabled);
    }

    /**
     * App Service Environment to use for the app.
     * 
     */
    @Import(name="hostingEnvironmentProfile")
    private @Nullable Output<HostingEnvironmentProfileArgs> hostingEnvironmentProfile;

    public Optional<Output<HostingEnvironmentProfileArgs>> hostingEnvironmentProfile() {
        return Optional.ofNullable(this.hostingEnvironmentProfile);
    }

    /**
     * HttpsOnly: configures a web site to accept only https requests. Issues redirect for
     * http requests
     * 
     */
    @Import(name="httpsOnly")
    private @Nullable Output<Boolean> httpsOnly;

    public Optional<Output<Boolean>> httpsOnly() {
        return Optional.ofNullable(this.httpsOnly);
    }

    /**
     * Hyper-V sandbox.
     * 
     */
    @Import(name="hyperV")
    private @Nullable Output<Boolean> hyperV;

    public Optional<Output<Boolean>> hyperV() {
        return Optional.ofNullable(this.hyperV);
    }

    /**
     * Managed service identity.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<ManagedServiceIdentityArgs> identity;

    public Optional<Output<ManagedServiceIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Obsolete: Hyper-V sandbox.
     * 
     */
    @Import(name="isXenon")
    private @Nullable Output<Boolean> isXenon;

    public Optional<Output<Boolean>> isXenon() {
        return Optional.ofNullable(this.isXenon);
    }

    /**
     * Identity to use for Key Vault Reference authentication.
     * 
     */
    @Import(name="keyVaultReferenceIdentity")
    private @Nullable Output<String> keyVaultReferenceIdentity;

    public Optional<Output<String>> keyVaultReferenceIdentity() {
        return Optional.ofNullable(this.keyVaultReferenceIdentity);
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Resource Location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Unique name of the app to create or update. To create or update a deployment slot, use the {slot} parameter.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Site redundancy mode
     * 
     */
    @Import(name="redundancyMode")
    private @Nullable Output<RedundancyMode> redundancyMode;

    public Optional<Output<RedundancyMode>> redundancyMode() {
        return Optional.ofNullable(this.redundancyMode);
    }

    /**
     * &lt;code&gt;true&lt;/code&gt; if reserved; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    @Import(name="reserved")
    private @Nullable Output<Boolean> reserved;

    public Optional<Output<Boolean>> reserved() {
        return Optional.ofNullable(this.reserved);
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * &lt;code&gt;true&lt;/code&gt; to stop SCM (KUDU) site when the app is stopped; otherwise, &lt;code&gt;false&lt;/code&gt;. The default is &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    @Import(name="scmSiteAlsoStopped")
    private @Nullable Output<Boolean> scmSiteAlsoStopped;

    public Optional<Output<Boolean>> scmSiteAlsoStopped() {
        return Optional.ofNullable(this.scmSiteAlsoStopped);
    }

    /**
     * Resource ID of the associated App Service plan, formatted as: &#34;/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}&#34;.
     * 
     */
    @Import(name="serverFarmId")
    private @Nullable Output<String> serverFarmId;

    public Optional<Output<String>> serverFarmId() {
        return Optional.ofNullable(this.serverFarmId);
    }

    /**
     * Configuration of the app.
     * 
     */
    @Import(name="siteConfig")
    private @Nullable Output<SiteConfigArgs> siteConfig;

    public Optional<Output<SiteConfigArgs>> siteConfig() {
        return Optional.ofNullable(this.siteConfig);
    }

    /**
     * Name of the deployment slot to create or update. The name &#39;production&#39; is reserved.
     * 
     */
    @Import(name="slot")
    private @Nullable Output<String> slot;

    public Optional<Output<String>> slot() {
        return Optional.ofNullable(this.slot);
    }

    /**
     * Checks if Customer provided storage account is required
     * 
     */
    @Import(name="storageAccountRequired")
    private @Nullable Output<Boolean> storageAccountRequired;

    public Optional<Output<Boolean>> storageAccountRequired() {
        return Optional.ofNullable(this.storageAccountRequired);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Azure Resource Manager ID of the Virtual network and subnet to be joined by Regional VNET Integration.
     * This must be of the form /subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}
     * 
     */
    @Import(name="virtualNetworkSubnetId")
    private @Nullable Output<String> virtualNetworkSubnetId;

    public Optional<Output<String>> virtualNetworkSubnetId() {
        return Optional.ofNullable(this.virtualNetworkSubnetId);
    }

    private WebAppSlotArgs() {}

    private WebAppSlotArgs(WebAppSlotArgs $) {
        this.clientAffinityEnabled = $.clientAffinityEnabled;
        this.clientCertEnabled = $.clientCertEnabled;
        this.clientCertExclusionPaths = $.clientCertExclusionPaths;
        this.clientCertMode = $.clientCertMode;
        this.cloningInfo = $.cloningInfo;
        this.containerSize = $.containerSize;
        this.customDomainVerificationId = $.customDomainVerificationId;
        this.dailyMemoryTimeQuota = $.dailyMemoryTimeQuota;
        this.enabled = $.enabled;
        this.hostNameSslStates = $.hostNameSslStates;
        this.hostNamesDisabled = $.hostNamesDisabled;
        this.hostingEnvironmentProfile = $.hostingEnvironmentProfile;
        this.httpsOnly = $.httpsOnly;
        this.hyperV = $.hyperV;
        this.identity = $.identity;
        this.isXenon = $.isXenon;
        this.keyVaultReferenceIdentity = $.keyVaultReferenceIdentity;
        this.kind = $.kind;
        this.location = $.location;
        this.name = $.name;
        this.redundancyMode = $.redundancyMode;
        this.reserved = $.reserved;
        this.resourceGroupName = $.resourceGroupName;
        this.scmSiteAlsoStopped = $.scmSiteAlsoStopped;
        this.serverFarmId = $.serverFarmId;
        this.siteConfig = $.siteConfig;
        this.slot = $.slot;
        this.storageAccountRequired = $.storageAccountRequired;
        this.tags = $.tags;
        this.virtualNetworkSubnetId = $.virtualNetworkSubnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppSlotArgs $;

        public Builder() {
            $ = new WebAppSlotArgs();
        }

        public Builder(WebAppSlotArgs defaults) {
            $ = new WebAppSlotArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientAffinityEnabled(@Nullable Output<Boolean> clientAffinityEnabled) {
            $.clientAffinityEnabled = clientAffinityEnabled;
            return this;
        }

        public Builder clientAffinityEnabled(Boolean clientAffinityEnabled) {
            return clientAffinityEnabled(Output.of(clientAffinityEnabled));
        }

        public Builder clientCertEnabled(@Nullable Output<Boolean> clientCertEnabled) {
            $.clientCertEnabled = clientCertEnabled;
            return this;
        }

        public Builder clientCertEnabled(Boolean clientCertEnabled) {
            return clientCertEnabled(Output.of(clientCertEnabled));
        }

        public Builder clientCertExclusionPaths(@Nullable Output<String> clientCertExclusionPaths) {
            $.clientCertExclusionPaths = clientCertExclusionPaths;
            return this;
        }

        public Builder clientCertExclusionPaths(String clientCertExclusionPaths) {
            return clientCertExclusionPaths(Output.of(clientCertExclusionPaths));
        }

        public Builder clientCertMode(@Nullable Output<ClientCertMode> clientCertMode) {
            $.clientCertMode = clientCertMode;
            return this;
        }

        public Builder clientCertMode(ClientCertMode clientCertMode) {
            return clientCertMode(Output.of(clientCertMode));
        }

        public Builder cloningInfo(@Nullable Output<CloningInfoArgs> cloningInfo) {
            $.cloningInfo = cloningInfo;
            return this;
        }

        public Builder cloningInfo(CloningInfoArgs cloningInfo) {
            return cloningInfo(Output.of(cloningInfo));
        }

        public Builder containerSize(@Nullable Output<Integer> containerSize) {
            $.containerSize = containerSize;
            return this;
        }

        public Builder containerSize(Integer containerSize) {
            return containerSize(Output.of(containerSize));
        }

        public Builder customDomainVerificationId(@Nullable Output<String> customDomainVerificationId) {
            $.customDomainVerificationId = customDomainVerificationId;
            return this;
        }

        public Builder customDomainVerificationId(String customDomainVerificationId) {
            return customDomainVerificationId(Output.of(customDomainVerificationId));
        }

        public Builder dailyMemoryTimeQuota(@Nullable Output<Integer> dailyMemoryTimeQuota) {
            $.dailyMemoryTimeQuota = dailyMemoryTimeQuota;
            return this;
        }

        public Builder dailyMemoryTimeQuota(Integer dailyMemoryTimeQuota) {
            return dailyMemoryTimeQuota(Output.of(dailyMemoryTimeQuota));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder hostNameSslStates(@Nullable Output<List<HostNameSslStateArgs>> hostNameSslStates) {
            $.hostNameSslStates = hostNameSslStates;
            return this;
        }

        public Builder hostNameSslStates(List<HostNameSslStateArgs> hostNameSslStates) {
            return hostNameSslStates(Output.of(hostNameSslStates));
        }

        public Builder hostNameSslStates(HostNameSslStateArgs... hostNameSslStates) {
            return hostNameSslStates(List.of(hostNameSslStates));
        }

        public Builder hostNamesDisabled(@Nullable Output<Boolean> hostNamesDisabled) {
            $.hostNamesDisabled = hostNamesDisabled;
            return this;
        }

        public Builder hostNamesDisabled(Boolean hostNamesDisabled) {
            return hostNamesDisabled(Output.of(hostNamesDisabled));
        }

        public Builder hostingEnvironmentProfile(@Nullable Output<HostingEnvironmentProfileArgs> hostingEnvironmentProfile) {
            $.hostingEnvironmentProfile = hostingEnvironmentProfile;
            return this;
        }

        public Builder hostingEnvironmentProfile(HostingEnvironmentProfileArgs hostingEnvironmentProfile) {
            return hostingEnvironmentProfile(Output.of(hostingEnvironmentProfile));
        }

        public Builder httpsOnly(@Nullable Output<Boolean> httpsOnly) {
            $.httpsOnly = httpsOnly;
            return this;
        }

        public Builder httpsOnly(Boolean httpsOnly) {
            return httpsOnly(Output.of(httpsOnly));
        }

        public Builder hyperV(@Nullable Output<Boolean> hyperV) {
            $.hyperV = hyperV;
            return this;
        }

        public Builder hyperV(Boolean hyperV) {
            return hyperV(Output.of(hyperV));
        }

        public Builder identity(@Nullable Output<ManagedServiceIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        public Builder identity(ManagedServiceIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        public Builder isXenon(@Nullable Output<Boolean> isXenon) {
            $.isXenon = isXenon;
            return this;
        }

        public Builder isXenon(Boolean isXenon) {
            return isXenon(Output.of(isXenon));
        }

        public Builder keyVaultReferenceIdentity(@Nullable Output<String> keyVaultReferenceIdentity) {
            $.keyVaultReferenceIdentity = keyVaultReferenceIdentity;
            return this;
        }

        public Builder keyVaultReferenceIdentity(String keyVaultReferenceIdentity) {
            return keyVaultReferenceIdentity(Output.of(keyVaultReferenceIdentity));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder redundancyMode(@Nullable Output<RedundancyMode> redundancyMode) {
            $.redundancyMode = redundancyMode;
            return this;
        }

        public Builder redundancyMode(RedundancyMode redundancyMode) {
            return redundancyMode(Output.of(redundancyMode));
        }

        public Builder reserved(@Nullable Output<Boolean> reserved) {
            $.reserved = reserved;
            return this;
        }

        public Builder reserved(Boolean reserved) {
            return reserved(Output.of(reserved));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder scmSiteAlsoStopped(@Nullable Output<Boolean> scmSiteAlsoStopped) {
            $.scmSiteAlsoStopped = scmSiteAlsoStopped;
            return this;
        }

        public Builder scmSiteAlsoStopped(Boolean scmSiteAlsoStopped) {
            return scmSiteAlsoStopped(Output.of(scmSiteAlsoStopped));
        }

        public Builder serverFarmId(@Nullable Output<String> serverFarmId) {
            $.serverFarmId = serverFarmId;
            return this;
        }

        public Builder serverFarmId(String serverFarmId) {
            return serverFarmId(Output.of(serverFarmId));
        }

        public Builder siteConfig(@Nullable Output<SiteConfigArgs> siteConfig) {
            $.siteConfig = siteConfig;
            return this;
        }

        public Builder siteConfig(SiteConfigArgs siteConfig) {
            return siteConfig(Output.of(siteConfig));
        }

        public Builder slot(@Nullable Output<String> slot) {
            $.slot = slot;
            return this;
        }

        public Builder slot(String slot) {
            return slot(Output.of(slot));
        }

        public Builder storageAccountRequired(@Nullable Output<Boolean> storageAccountRequired) {
            $.storageAccountRequired = storageAccountRequired;
            return this;
        }

        public Builder storageAccountRequired(Boolean storageAccountRequired) {
            return storageAccountRequired(Output.of(storageAccountRequired));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder virtualNetworkSubnetId(@Nullable Output<String> virtualNetworkSubnetId) {
            $.virtualNetworkSubnetId = virtualNetworkSubnetId;
            return this;
        }

        public Builder virtualNetworkSubnetId(String virtualNetworkSubnetId) {
            return virtualNetworkSubnetId(Output.of(virtualNetworkSubnetId));
        }

        public WebAppSlotArgs build() {
            $.hyperV = Codegen.booleanProp("hyperV").output().arg($.hyperV).def(false).getNullable();
            $.isXenon = Codegen.booleanProp("isXenon").output().arg($.isXenon).def(false).getNullable();
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.reserved = Codegen.booleanProp("reserved").output().arg($.reserved).def(false).getNullable();
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.scmSiteAlsoStopped = Codegen.booleanProp("scmSiteAlsoStopped").output().arg($.scmSiteAlsoStopped).def(false).getNullable();
            return $;
        }
    }

}
