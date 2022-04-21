// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagecache;

import com.pulumi.azurenative.storagecache.enums.ProvisioningStateType;
import com.pulumi.azurenative.storagecache.inputs.CacheDirectorySettingsArgs;
import com.pulumi.azurenative.storagecache.inputs.CacheEncryptionSettingsArgs;
import com.pulumi.azurenative.storagecache.inputs.CacheIdentityArgs;
import com.pulumi.azurenative.storagecache.inputs.CacheNetworkSettingsArgs;
import com.pulumi.azurenative.storagecache.inputs.CacheSecuritySettingsArgs;
import com.pulumi.azurenative.storagecache.inputs.CacheSkuArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CacheArgs extends com.pulumi.resources.ResourceArgs {

    public static final CacheArgs Empty = new CacheArgs();

    /**
     * Name of Cache. Length of name must not be greater than 80 and chars must be from the [-0-9a-zA-Z_] char class.
     * 
     */
    @Import(name="cacheName")
    private @Nullable Output<String> cacheName;

    public Optional<Output<String>> cacheName() {
        return Optional.ofNullable(this.cacheName);
    }

    /**
     * The size of this Cache, in GB.
     * 
     */
    @Import(name="cacheSizeGB")
    private @Nullable Output<Integer> cacheSizeGB;

    public Optional<Output<Integer>> cacheSizeGB() {
        return Optional.ofNullable(this.cacheSizeGB);
    }

    /**
     * Specifies Directory Services settings of the cache.
     * 
     */
    @Import(name="directoryServicesSettings")
    private @Nullable Output<CacheDirectorySettingsArgs> directoryServicesSettings;

    public Optional<Output<CacheDirectorySettingsArgs>> directoryServicesSettings() {
        return Optional.ofNullable(this.directoryServicesSettings);
    }

    /**
     * Specifies encryption settings of the cache.
     * 
     */
    @Import(name="encryptionSettings")
    private @Nullable Output<CacheEncryptionSettingsArgs> encryptionSettings;

    public Optional<Output<CacheEncryptionSettingsArgs>> encryptionSettings() {
        return Optional.ofNullable(this.encryptionSettings);
    }

    /**
     * The identity of the cache, if configured.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<CacheIdentityArgs> identity;

    public Optional<Output<CacheIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Region name string.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies network settings of the cache.
     * 
     */
    @Import(name="networkSettings")
    private @Nullable Output<CacheNetworkSettingsArgs> networkSettings;

    public Optional<Output<CacheNetworkSettingsArgs>> networkSettings() {
        return Optional.ofNullable(this.networkSettings);
    }

    /**
     * ARM provisioning state, see https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/Addendum.md#provisioningstate-property
     * 
     */
    @Import(name="provisioningState")
    private @Nullable Output<Either<String,ProvisioningStateType>> provisioningState;

    public Optional<Output<Either<String,ProvisioningStateType>>> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    /**
     * Target resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Specifies security settings of the cache.
     * 
     */
    @Import(name="securitySettings")
    private @Nullable Output<CacheSecuritySettingsArgs> securitySettings;

    public Optional<Output<CacheSecuritySettingsArgs>> securitySettings() {
        return Optional.ofNullable(this.securitySettings);
    }

    /**
     * SKU for the Cache.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<CacheSkuArgs> sku;

    public Optional<Output<CacheSkuArgs>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * Subnet used for the Cache.
     * 
     */
    @Import(name="subnet")
    private @Nullable Output<String> subnet;

    public Optional<Output<String>> subnet() {
        return Optional.ofNullable(this.subnet);
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

    private CacheArgs() {}

    private CacheArgs(CacheArgs $) {
        this.cacheName = $.cacheName;
        this.cacheSizeGB = $.cacheSizeGB;
        this.directoryServicesSettings = $.directoryServicesSettings;
        this.encryptionSettings = $.encryptionSettings;
        this.identity = $.identity;
        this.location = $.location;
        this.networkSettings = $.networkSettings;
        this.provisioningState = $.provisioningState;
        this.resourceGroupName = $.resourceGroupName;
        this.securitySettings = $.securitySettings;
        this.sku = $.sku;
        this.subnet = $.subnet;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CacheArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CacheArgs $;

        public Builder() {
            $ = new CacheArgs();
        }

        public Builder(CacheArgs defaults) {
            $ = new CacheArgs(Objects.requireNonNull(defaults));
        }

        public Builder cacheName(@Nullable Output<String> cacheName) {
            $.cacheName = cacheName;
            return this;
        }

        public Builder cacheName(String cacheName) {
            return cacheName(Output.of(cacheName));
        }

        public Builder cacheSizeGB(@Nullable Output<Integer> cacheSizeGB) {
            $.cacheSizeGB = cacheSizeGB;
            return this;
        }

        public Builder cacheSizeGB(Integer cacheSizeGB) {
            return cacheSizeGB(Output.of(cacheSizeGB));
        }

        public Builder directoryServicesSettings(@Nullable Output<CacheDirectorySettingsArgs> directoryServicesSettings) {
            $.directoryServicesSettings = directoryServicesSettings;
            return this;
        }

        public Builder directoryServicesSettings(CacheDirectorySettingsArgs directoryServicesSettings) {
            return directoryServicesSettings(Output.of(directoryServicesSettings));
        }

        public Builder encryptionSettings(@Nullable Output<CacheEncryptionSettingsArgs> encryptionSettings) {
            $.encryptionSettings = encryptionSettings;
            return this;
        }

        public Builder encryptionSettings(CacheEncryptionSettingsArgs encryptionSettings) {
            return encryptionSettings(Output.of(encryptionSettings));
        }

        public Builder identity(@Nullable Output<CacheIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        public Builder identity(CacheIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder networkSettings(@Nullable Output<CacheNetworkSettingsArgs> networkSettings) {
            $.networkSettings = networkSettings;
            return this;
        }

        public Builder networkSettings(CacheNetworkSettingsArgs networkSettings) {
            return networkSettings(Output.of(networkSettings));
        }

        public Builder provisioningState(@Nullable Output<Either<String,ProvisioningStateType>> provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder provisioningState(Either<String,ProvisioningStateType> provisioningState) {
            return provisioningState(Output.of(provisioningState));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder securitySettings(@Nullable Output<CacheSecuritySettingsArgs> securitySettings) {
            $.securitySettings = securitySettings;
            return this;
        }

        public Builder securitySettings(CacheSecuritySettingsArgs securitySettings) {
            return securitySettings(Output.of(securitySettings));
        }

        public Builder sku(@Nullable Output<CacheSkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        public Builder sku(CacheSkuArgs sku) {
            return sku(Output.of(sku));
        }

        public Builder subnet(@Nullable Output<String> subnet) {
            $.subnet = subnet;
            return this;
        }

        public Builder subnet(String subnet) {
            return subnet(Output.of(subnet));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public CacheArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
