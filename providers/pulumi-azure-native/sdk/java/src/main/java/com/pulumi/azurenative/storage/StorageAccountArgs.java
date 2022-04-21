// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage;

import com.pulumi.azurenative.storage.enums.AccessTier;
import com.pulumi.azurenative.storage.enums.Kind;
import com.pulumi.azurenative.storage.enums.LargeFileSharesState;
import com.pulumi.azurenative.storage.enums.MinimumTlsVersion;
import com.pulumi.azurenative.storage.inputs.AzureFilesIdentityBasedAuthenticationArgs;
import com.pulumi.azurenative.storage.inputs.CustomDomainArgs;
import com.pulumi.azurenative.storage.inputs.EncryptionArgs;
import com.pulumi.azurenative.storage.inputs.ExtendedLocationArgs;
import com.pulumi.azurenative.storage.inputs.IdentityArgs;
import com.pulumi.azurenative.storage.inputs.KeyPolicyArgs;
import com.pulumi.azurenative.storage.inputs.NetworkRuleSetArgs;
import com.pulumi.azurenative.storage.inputs.RoutingPreferenceArgs;
import com.pulumi.azurenative.storage.inputs.SasPolicyArgs;
import com.pulumi.azurenative.storage.inputs.SkuArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StorageAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageAccountArgs Empty = new StorageAccountArgs();

    /**
     * Required for storage accounts where kind = BlobStorage. The access tier used for billing.
     * 
     */
    @Import(name="accessTier")
    private @Nullable Output<AccessTier> accessTier;

    public Optional<Output<AccessTier>> accessTier() {
        return Optional.ofNullable(this.accessTier);
    }

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @Import(name="accountName")
    private @Nullable Output<String> accountName;

    public Optional<Output<String>> accountName() {
        return Optional.ofNullable(this.accountName);
    }

    /**
     * Allow or disallow public access to all blobs or containers in the storage account. The default interpretation is true for this property.
     * 
     */
    @Import(name="allowBlobPublicAccess")
    private @Nullable Output<Boolean> allowBlobPublicAccess;

    public Optional<Output<Boolean>> allowBlobPublicAccess() {
        return Optional.ofNullable(this.allowBlobPublicAccess);
    }

    /**
     * Indicates whether the storage account permits requests to be authorized with the account access key via Shared Key. If false, then all requests, including shared access signatures, must be authorized with Azure Active Directory (Azure AD). The default value is null, which is equivalent to true.
     * 
     */
    @Import(name="allowSharedKeyAccess")
    private @Nullable Output<Boolean> allowSharedKeyAccess;

    public Optional<Output<Boolean>> allowSharedKeyAccess() {
        return Optional.ofNullable(this.allowSharedKeyAccess);
    }

    /**
     * Provides the identity based authentication settings for Azure Files.
     * 
     */
    @Import(name="azureFilesIdentityBasedAuthentication")
    private @Nullable Output<AzureFilesIdentityBasedAuthenticationArgs> azureFilesIdentityBasedAuthentication;

    public Optional<Output<AzureFilesIdentityBasedAuthenticationArgs>> azureFilesIdentityBasedAuthentication() {
        return Optional.ofNullable(this.azureFilesIdentityBasedAuthentication);
    }

    /**
     * User domain assigned to the storage account. Name is the CNAME source. Only one custom domain is supported per storage account at this time. To clear the existing custom domain, use an empty string for the custom domain name property.
     * 
     */
    @Import(name="customDomain")
    private @Nullable Output<CustomDomainArgs> customDomain;

    public Optional<Output<CustomDomainArgs>> customDomain() {
        return Optional.ofNullable(this.customDomain);
    }

    /**
     * Allows https traffic only to storage service if sets to true. The default value is true since API version 2019-04-01.
     * 
     */
    @Import(name="enableHttpsTrafficOnly")
    private @Nullable Output<Boolean> enableHttpsTrafficOnly;

    public Optional<Output<Boolean>> enableHttpsTrafficOnly() {
        return Optional.ofNullable(this.enableHttpsTrafficOnly);
    }

    /**
     * NFS 3.0 protocol support enabled if set to true.
     * 
     */
    @Import(name="enableNfsV3")
    private @Nullable Output<Boolean> enableNfsV3;

    public Optional<Output<Boolean>> enableNfsV3() {
        return Optional.ofNullable(this.enableNfsV3);
    }

    /**
     * Not applicable. Azure Storage encryption is enabled for all storage accounts and cannot be disabled.
     * 
     */
    @Import(name="encryption")
    private @Nullable Output<EncryptionArgs> encryption;

    public Optional<Output<EncryptionArgs>> encryption() {
        return Optional.ofNullable(this.encryption);
    }

    /**
     * Optional. Set the extended location of the resource. If not set, the storage account will be created in Azure main region. Otherwise it will be created in the specified extended location
     * 
     */
    @Import(name="extendedLocation")
    private @Nullable Output<ExtendedLocationArgs> extendedLocation;

    public Optional<Output<ExtendedLocationArgs>> extendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }

    /**
     * The identity of the resource.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<IdentityArgs> identity;

    public Optional<Output<IdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Account HierarchicalNamespace enabled if sets to true.
     * 
     */
    @Import(name="isHnsEnabled")
    private @Nullable Output<Boolean> isHnsEnabled;

    public Optional<Output<Boolean>> isHnsEnabled() {
        return Optional.ofNullable(this.isHnsEnabled);
    }

    /**
     * KeyPolicy assigned to the storage account.
     * 
     */
    @Import(name="keyPolicy")
    private @Nullable Output<KeyPolicyArgs> keyPolicy;

    public Optional<Output<KeyPolicyArgs>> keyPolicy() {
        return Optional.ofNullable(this.keyPolicy);
    }

    /**
     * Required. Indicates the type of storage account.
     * 
     */
    @Import(name="kind", required=true)
    private Output<Either<String,Kind>> kind;

    public Output<Either<String,Kind>> kind() {
        return this.kind;
    }

    /**
     * Allow large file shares if sets to Enabled. It cannot be disabled once it is enabled.
     * 
     */
    @Import(name="largeFileSharesState")
    private @Nullable Output<Either<String,LargeFileSharesState>> largeFileSharesState;

    public Optional<Output<Either<String,LargeFileSharesState>>> largeFileSharesState() {
        return Optional.ofNullable(this.largeFileSharesState);
    }

    /**
     * Required. Gets or sets the location of the resource. This will be one of the supported and registered Azure Geo Regions (e.g. West US, East US, Southeast Asia, etc.). The geo region of a resource cannot be changed once it is created, but if an identical geo region is specified on update, the request will succeed.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Set the minimum TLS version to be permitted on requests to storage. The default interpretation is TLS 1.0 for this property.
     * 
     */
    @Import(name="minimumTlsVersion")
    private @Nullable Output<Either<String,MinimumTlsVersion>> minimumTlsVersion;

    public Optional<Output<Either<String,MinimumTlsVersion>>> minimumTlsVersion() {
        return Optional.ofNullable(this.minimumTlsVersion);
    }

    /**
     * Network rule set
     * 
     */
    @Import(name="networkRuleSet")
    private @Nullable Output<NetworkRuleSetArgs> networkRuleSet;

    public Optional<Output<NetworkRuleSetArgs>> networkRuleSet() {
        return Optional.ofNullable(this.networkRuleSet);
    }

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Maintains information about the network routing choice opted by the user for data transfer
     * 
     */
    @Import(name="routingPreference")
    private @Nullable Output<RoutingPreferenceArgs> routingPreference;

    public Optional<Output<RoutingPreferenceArgs>> routingPreference() {
        return Optional.ofNullable(this.routingPreference);
    }

    /**
     * SasPolicy assigned to the storage account.
     * 
     */
    @Import(name="sasPolicy")
    private @Nullable Output<SasPolicyArgs> sasPolicy;

    public Optional<Output<SasPolicyArgs>> sasPolicy() {
        return Optional.ofNullable(this.sasPolicy);
    }

    /**
     * Required. Gets or sets the SKU name.
     * 
     */
    @Import(name="sku", required=true)
    private Output<SkuArgs> sku;

    public Output<SkuArgs> sku() {
        return this.sku;
    }

    /**
     * Gets or sets a list of key value pairs that describe the resource. These tags can be used for viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key with a length no greater than 128 characters and a value with a length no greater than 256 characters.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private StorageAccountArgs() {}

    private StorageAccountArgs(StorageAccountArgs $) {
        this.accessTier = $.accessTier;
        this.accountName = $.accountName;
        this.allowBlobPublicAccess = $.allowBlobPublicAccess;
        this.allowSharedKeyAccess = $.allowSharedKeyAccess;
        this.azureFilesIdentityBasedAuthentication = $.azureFilesIdentityBasedAuthentication;
        this.customDomain = $.customDomain;
        this.enableHttpsTrafficOnly = $.enableHttpsTrafficOnly;
        this.enableNfsV3 = $.enableNfsV3;
        this.encryption = $.encryption;
        this.extendedLocation = $.extendedLocation;
        this.identity = $.identity;
        this.isHnsEnabled = $.isHnsEnabled;
        this.keyPolicy = $.keyPolicy;
        this.kind = $.kind;
        this.largeFileSharesState = $.largeFileSharesState;
        this.location = $.location;
        this.minimumTlsVersion = $.minimumTlsVersion;
        this.networkRuleSet = $.networkRuleSet;
        this.resourceGroupName = $.resourceGroupName;
        this.routingPreference = $.routingPreference;
        this.sasPolicy = $.sasPolicy;
        this.sku = $.sku;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageAccountArgs $;

        public Builder() {
            $ = new StorageAccountArgs();
        }

        public Builder(StorageAccountArgs defaults) {
            $ = new StorageAccountArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessTier(@Nullable Output<AccessTier> accessTier) {
            $.accessTier = accessTier;
            return this;
        }

        public Builder accessTier(AccessTier accessTier) {
            return accessTier(Output.of(accessTier));
        }

        public Builder accountName(@Nullable Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        public Builder allowBlobPublicAccess(@Nullable Output<Boolean> allowBlobPublicAccess) {
            $.allowBlobPublicAccess = allowBlobPublicAccess;
            return this;
        }

        public Builder allowBlobPublicAccess(Boolean allowBlobPublicAccess) {
            return allowBlobPublicAccess(Output.of(allowBlobPublicAccess));
        }

        public Builder allowSharedKeyAccess(@Nullable Output<Boolean> allowSharedKeyAccess) {
            $.allowSharedKeyAccess = allowSharedKeyAccess;
            return this;
        }

        public Builder allowSharedKeyAccess(Boolean allowSharedKeyAccess) {
            return allowSharedKeyAccess(Output.of(allowSharedKeyAccess));
        }

        public Builder azureFilesIdentityBasedAuthentication(@Nullable Output<AzureFilesIdentityBasedAuthenticationArgs> azureFilesIdentityBasedAuthentication) {
            $.azureFilesIdentityBasedAuthentication = azureFilesIdentityBasedAuthentication;
            return this;
        }

        public Builder azureFilesIdentityBasedAuthentication(AzureFilesIdentityBasedAuthenticationArgs azureFilesIdentityBasedAuthentication) {
            return azureFilesIdentityBasedAuthentication(Output.of(azureFilesIdentityBasedAuthentication));
        }

        public Builder customDomain(@Nullable Output<CustomDomainArgs> customDomain) {
            $.customDomain = customDomain;
            return this;
        }

        public Builder customDomain(CustomDomainArgs customDomain) {
            return customDomain(Output.of(customDomain));
        }

        public Builder enableHttpsTrafficOnly(@Nullable Output<Boolean> enableHttpsTrafficOnly) {
            $.enableHttpsTrafficOnly = enableHttpsTrafficOnly;
            return this;
        }

        public Builder enableHttpsTrafficOnly(Boolean enableHttpsTrafficOnly) {
            return enableHttpsTrafficOnly(Output.of(enableHttpsTrafficOnly));
        }

        public Builder enableNfsV3(@Nullable Output<Boolean> enableNfsV3) {
            $.enableNfsV3 = enableNfsV3;
            return this;
        }

        public Builder enableNfsV3(Boolean enableNfsV3) {
            return enableNfsV3(Output.of(enableNfsV3));
        }

        public Builder encryption(@Nullable Output<EncryptionArgs> encryption) {
            $.encryption = encryption;
            return this;
        }

        public Builder encryption(EncryptionArgs encryption) {
            return encryption(Output.of(encryption));
        }

        public Builder extendedLocation(@Nullable Output<ExtendedLocationArgs> extendedLocation) {
            $.extendedLocation = extendedLocation;
            return this;
        }

        public Builder extendedLocation(ExtendedLocationArgs extendedLocation) {
            return extendedLocation(Output.of(extendedLocation));
        }

        public Builder identity(@Nullable Output<IdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        public Builder identity(IdentityArgs identity) {
            return identity(Output.of(identity));
        }

        public Builder isHnsEnabled(@Nullable Output<Boolean> isHnsEnabled) {
            $.isHnsEnabled = isHnsEnabled;
            return this;
        }

        public Builder isHnsEnabled(Boolean isHnsEnabled) {
            return isHnsEnabled(Output.of(isHnsEnabled));
        }

        public Builder keyPolicy(@Nullable Output<KeyPolicyArgs> keyPolicy) {
            $.keyPolicy = keyPolicy;
            return this;
        }

        public Builder keyPolicy(KeyPolicyArgs keyPolicy) {
            return keyPolicy(Output.of(keyPolicy));
        }

        public Builder kind(Output<Either<String,Kind>> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(Either<String,Kind> kind) {
            return kind(Output.of(kind));
        }

        public Builder largeFileSharesState(@Nullable Output<Either<String,LargeFileSharesState>> largeFileSharesState) {
            $.largeFileSharesState = largeFileSharesState;
            return this;
        }

        public Builder largeFileSharesState(Either<String,LargeFileSharesState> largeFileSharesState) {
            return largeFileSharesState(Output.of(largeFileSharesState));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder minimumTlsVersion(@Nullable Output<Either<String,MinimumTlsVersion>> minimumTlsVersion) {
            $.minimumTlsVersion = minimumTlsVersion;
            return this;
        }

        public Builder minimumTlsVersion(Either<String,MinimumTlsVersion> minimumTlsVersion) {
            return minimumTlsVersion(Output.of(minimumTlsVersion));
        }

        public Builder networkRuleSet(@Nullable Output<NetworkRuleSetArgs> networkRuleSet) {
            $.networkRuleSet = networkRuleSet;
            return this;
        }

        public Builder networkRuleSet(NetworkRuleSetArgs networkRuleSet) {
            return networkRuleSet(Output.of(networkRuleSet));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder routingPreference(@Nullable Output<RoutingPreferenceArgs> routingPreference) {
            $.routingPreference = routingPreference;
            return this;
        }

        public Builder routingPreference(RoutingPreferenceArgs routingPreference) {
            return routingPreference(Output.of(routingPreference));
        }

        public Builder sasPolicy(@Nullable Output<SasPolicyArgs> sasPolicy) {
            $.sasPolicy = sasPolicy;
            return this;
        }

        public Builder sasPolicy(SasPolicyArgs sasPolicy) {
            return sasPolicy(Output.of(sasPolicy));
        }

        public Builder sku(Output<SkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        public Builder sku(SkuArgs sku) {
            return sku(Output.of(sku));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public StorageAccountArgs build() {
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sku = Objects.requireNonNull($.sku, "expected parameter 'sku' to be non-null");
            return $;
        }
    }

}
