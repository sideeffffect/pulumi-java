// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.sql.enums.ManagedInstanceLicenseType;
import com.pulumi.azurenative.sql.enums.ManagedInstanceProxyOverride;
import com.pulumi.azurenative.sql.enums.ManagedServerCreateMode;
import com.pulumi.azurenative.sql.enums.StorageAccountType;
import com.pulumi.azurenative.sql.inputs.ManagedInstanceExternalAdministratorArgs;
import com.pulumi.azurenative.sql.inputs.ResourceIdentityArgs;
import com.pulumi.azurenative.sql.inputs.SkuArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedInstanceArgs Empty = new ManagedInstanceArgs();

    /**
     * Administrator username for the managed instance. Can only be specified when the managed instance is being created (and is required for creation).
     * 
     */
    @Import(name="administratorLogin")
    private @Nullable Output<String> administratorLogin;

    public Optional<Output<String>> administratorLogin() {
        return Optional.ofNullable(this.administratorLogin);
    }

    /**
     * The administrator login password (required for managed instance creation).
     * 
     */
    @Import(name="administratorLoginPassword")
    private @Nullable Output<String> administratorLoginPassword;

    public Optional<Output<String>> administratorLoginPassword() {
        return Optional.ofNullable(this.administratorLoginPassword);
    }

    /**
     * The Azure Active Directory administrator of the server.
     * 
     */
    @Import(name="administrators")
    private @Nullable Output<ManagedInstanceExternalAdministratorArgs> administrators;

    public Optional<Output<ManagedInstanceExternalAdministratorArgs>> administrators() {
        return Optional.ofNullable(this.administrators);
    }

    /**
     * Collation of the managed instance.
     * 
     */
    @Import(name="collation")
    private @Nullable Output<String> collation;

    public Optional<Output<String>> collation() {
        return Optional.ofNullable(this.collation);
    }

    /**
     * The resource id of another managed instance whose DNS zone this managed instance will share after creation.
     * 
     */
    @Import(name="dnsZonePartner")
    private @Nullable Output<String> dnsZonePartner;

    public Optional<Output<String>> dnsZonePartner() {
        return Optional.ofNullable(this.dnsZonePartner);
    }

    /**
     * The Azure Active Directory identity of the managed instance.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<ResourceIdentityArgs> identity;

    public Optional<Output<ResourceIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The Id of the instance pool this managed server belongs to.
     * 
     */
    @Import(name="instancePoolId")
    private @Nullable Output<String> instancePoolId;

    public Optional<Output<String>> instancePoolId() {
        return Optional.ofNullable(this.instancePoolId);
    }

    /**
     * A CMK URI of the key to use for encryption.
     * 
     */
    @Import(name="keyId")
    private @Nullable Output<String> keyId;

    public Optional<Output<String>> keyId() {
        return Optional.ofNullable(this.keyId);
    }

    /**
     * The license type. Possible values are &#39;LicenseIncluded&#39; (regular price inclusive of a new SQL license) and &#39;BasePrice&#39; (discounted AHB price for bringing your own SQL licenses).
     * 
     */
    @Import(name="licenseType")
    private @Nullable Output<Either<String,ManagedInstanceLicenseType>> licenseType;

    public Optional<Output<Either<String,ManagedInstanceLicenseType>>> licenseType() {
        return Optional.ofNullable(this.licenseType);
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies maintenance configuration id to apply to this managed instance.
     * 
     */
    @Import(name="maintenanceConfigurationId")
    private @Nullable Output<String> maintenanceConfigurationId;

    public Optional<Output<String>> maintenanceConfigurationId() {
        return Optional.ofNullable(this.maintenanceConfigurationId);
    }

    /**
     * Specifies the mode of database creation.
     * 
     * Default: Regular instance creation.
     * 
     * Restore: Creates an instance by restoring a set of backups to specific point in time. RestorePointInTime and SourceManagedInstanceId must be specified.
     * 
     */
    @Import(name="managedInstanceCreateMode")
    private @Nullable Output<Either<String,ManagedServerCreateMode>> managedInstanceCreateMode;

    public Optional<Output<Either<String,ManagedServerCreateMode>>> managedInstanceCreateMode() {
        return Optional.ofNullable(this.managedInstanceCreateMode);
    }

    /**
     * The name of the managed instance.
     * 
     */
    @Import(name="managedInstanceName")
    private @Nullable Output<String> managedInstanceName;

    public Optional<Output<String>> managedInstanceName() {
        return Optional.ofNullable(this.managedInstanceName);
    }

    /**
     * Minimal TLS version. Allowed values: &#39;None&#39;, &#39;1.0&#39;, &#39;1.1&#39;, &#39;1.2&#39;
     * 
     */
    @Import(name="minimalTlsVersion")
    private @Nullable Output<String> minimalTlsVersion;

    public Optional<Output<String>> minimalTlsVersion() {
        return Optional.ofNullable(this.minimalTlsVersion);
    }

    /**
     * The resource id of a user assigned identity to be used by default.
     * 
     */
    @Import(name="primaryUserAssignedIdentityId")
    private @Nullable Output<String> primaryUserAssignedIdentityId;

    public Optional<Output<String>> primaryUserAssignedIdentityId() {
        return Optional.ofNullable(this.primaryUserAssignedIdentityId);
    }

    /**
     * Connection type used for connecting to the instance.
     * 
     */
    @Import(name="proxyOverride")
    private @Nullable Output<Either<String,ManagedInstanceProxyOverride>> proxyOverride;

    public Optional<Output<Either<String,ManagedInstanceProxyOverride>>> proxyOverride() {
        return Optional.ofNullable(this.proxyOverride);
    }

    /**
     * Whether or not the public data endpoint is enabled.
     * 
     */
    @Import(name="publicDataEndpointEnabled")
    private @Nullable Output<Boolean> publicDataEndpointEnabled;

    public Optional<Output<Boolean>> publicDataEndpointEnabled() {
        return Optional.ofNullable(this.publicDataEndpointEnabled);
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Specifies the point in time (ISO8601 format) of the source database that will be restored to create the new database.
     * 
     */
    @Import(name="restorePointInTime")
    private @Nullable Output<String> restorePointInTime;

    public Optional<Output<String>> restorePointInTime() {
        return Optional.ofNullable(this.restorePointInTime);
    }

    /**
     * Managed instance SKU. Allowed values for sku.name: GP_Gen4, GP_Gen5, BC_Gen4, BC_Gen5
     * 
     */
    @Import(name="sku")
    private @Nullable Output<SkuArgs> sku;

    public Optional<Output<SkuArgs>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * The resource identifier of the source managed instance associated with create operation of this instance.
     * 
     */
    @Import(name="sourceManagedInstanceId")
    private @Nullable Output<String> sourceManagedInstanceId;

    public Optional<Output<String>> sourceManagedInstanceId() {
        return Optional.ofNullable(this.sourceManagedInstanceId);
    }

    /**
     * The storage account type used to store backups for this instance. The options are LRS (LocallyRedundantStorage), ZRS (ZoneRedundantStorage) and GRS (GeoRedundantStorage)
     * 
     */
    @Import(name="storageAccountType")
    private @Nullable Output<Either<String,StorageAccountType>> storageAccountType;

    public Optional<Output<Either<String,StorageAccountType>>> storageAccountType() {
        return Optional.ofNullable(this.storageAccountType);
    }

    /**
     * Storage size in GB. Minimum value: 32. Maximum value: 8192. Increments of 32 GB allowed only.
     * 
     */
    @Import(name="storageSizeInGB")
    private @Nullable Output<Integer> storageSizeInGB;

    public Optional<Output<Integer>> storageSizeInGB() {
        return Optional.ofNullable(this.storageSizeInGB);
    }

    /**
     * Subnet resource ID for the managed instance.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
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
     * Id of the timezone. Allowed values are timezones supported by Windows.
     * Windows keeps details on supported timezones, including the id, in registry under
     * KEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows NT\CurrentVersion\Time Zones.
     * You can get those registry values via SQL Server by querying SELECT name AS timezone_id FROM sys.time_zone_info.
     * List of Ids can also be obtained by executing [System.TimeZoneInfo]::GetSystemTimeZones() in PowerShell.
     * An example of valid timezone id is &#34;Pacific Standard Time&#34; or &#34;W. Europe Standard Time&#34;.
     * 
     */
    @Import(name="timezoneId")
    private @Nullable Output<String> timezoneId;

    public Optional<Output<String>> timezoneId() {
        return Optional.ofNullable(this.timezoneId);
    }

    /**
     * The number of vCores. Allowed values: 8, 16, 24, 32, 40, 64, 80.
     * 
     */
    @Import(name="vCores")
    private @Nullable Output<Integer> vCores;

    public Optional<Output<Integer>> vCores() {
        return Optional.ofNullable(this.vCores);
    }

    /**
     * Whether or not the multi-az is enabled.
     * 
     */
    @Import(name="zoneRedundant")
    private @Nullable Output<Boolean> zoneRedundant;

    public Optional<Output<Boolean>> zoneRedundant() {
        return Optional.ofNullable(this.zoneRedundant);
    }

    private ManagedInstanceArgs() {}

    private ManagedInstanceArgs(ManagedInstanceArgs $) {
        this.administratorLogin = $.administratorLogin;
        this.administratorLoginPassword = $.administratorLoginPassword;
        this.administrators = $.administrators;
        this.collation = $.collation;
        this.dnsZonePartner = $.dnsZonePartner;
        this.identity = $.identity;
        this.instancePoolId = $.instancePoolId;
        this.keyId = $.keyId;
        this.licenseType = $.licenseType;
        this.location = $.location;
        this.maintenanceConfigurationId = $.maintenanceConfigurationId;
        this.managedInstanceCreateMode = $.managedInstanceCreateMode;
        this.managedInstanceName = $.managedInstanceName;
        this.minimalTlsVersion = $.minimalTlsVersion;
        this.primaryUserAssignedIdentityId = $.primaryUserAssignedIdentityId;
        this.proxyOverride = $.proxyOverride;
        this.publicDataEndpointEnabled = $.publicDataEndpointEnabled;
        this.resourceGroupName = $.resourceGroupName;
        this.restorePointInTime = $.restorePointInTime;
        this.sku = $.sku;
        this.sourceManagedInstanceId = $.sourceManagedInstanceId;
        this.storageAccountType = $.storageAccountType;
        this.storageSizeInGB = $.storageSizeInGB;
        this.subnetId = $.subnetId;
        this.tags = $.tags;
        this.timezoneId = $.timezoneId;
        this.vCores = $.vCores;
        this.zoneRedundant = $.zoneRedundant;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedInstanceArgs $;

        public Builder() {
            $ = new ManagedInstanceArgs();
        }

        public Builder(ManagedInstanceArgs defaults) {
            $ = new ManagedInstanceArgs(Objects.requireNonNull(defaults));
        }

        public Builder administratorLogin(@Nullable Output<String> administratorLogin) {
            $.administratorLogin = administratorLogin;
            return this;
        }

        public Builder administratorLogin(String administratorLogin) {
            return administratorLogin(Output.of(administratorLogin));
        }

        public Builder administratorLoginPassword(@Nullable Output<String> administratorLoginPassword) {
            $.administratorLoginPassword = administratorLoginPassword;
            return this;
        }

        public Builder administratorLoginPassword(String administratorLoginPassword) {
            return administratorLoginPassword(Output.of(administratorLoginPassword));
        }

        public Builder administrators(@Nullable Output<ManagedInstanceExternalAdministratorArgs> administrators) {
            $.administrators = administrators;
            return this;
        }

        public Builder administrators(ManagedInstanceExternalAdministratorArgs administrators) {
            return administrators(Output.of(administrators));
        }

        public Builder collation(@Nullable Output<String> collation) {
            $.collation = collation;
            return this;
        }

        public Builder collation(String collation) {
            return collation(Output.of(collation));
        }

        public Builder dnsZonePartner(@Nullable Output<String> dnsZonePartner) {
            $.dnsZonePartner = dnsZonePartner;
            return this;
        }

        public Builder dnsZonePartner(String dnsZonePartner) {
            return dnsZonePartner(Output.of(dnsZonePartner));
        }

        public Builder identity(@Nullable Output<ResourceIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        public Builder identity(ResourceIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        public Builder instancePoolId(@Nullable Output<String> instancePoolId) {
            $.instancePoolId = instancePoolId;
            return this;
        }

        public Builder instancePoolId(String instancePoolId) {
            return instancePoolId(Output.of(instancePoolId));
        }

        public Builder keyId(@Nullable Output<String> keyId) {
            $.keyId = keyId;
            return this;
        }

        public Builder keyId(String keyId) {
            return keyId(Output.of(keyId));
        }

        public Builder licenseType(@Nullable Output<Either<String,ManagedInstanceLicenseType>> licenseType) {
            $.licenseType = licenseType;
            return this;
        }

        public Builder licenseType(Either<String,ManagedInstanceLicenseType> licenseType) {
            return licenseType(Output.of(licenseType));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder maintenanceConfigurationId(@Nullable Output<String> maintenanceConfigurationId) {
            $.maintenanceConfigurationId = maintenanceConfigurationId;
            return this;
        }

        public Builder maintenanceConfigurationId(String maintenanceConfigurationId) {
            return maintenanceConfigurationId(Output.of(maintenanceConfigurationId));
        }

        public Builder managedInstanceCreateMode(@Nullable Output<Either<String,ManagedServerCreateMode>> managedInstanceCreateMode) {
            $.managedInstanceCreateMode = managedInstanceCreateMode;
            return this;
        }

        public Builder managedInstanceCreateMode(Either<String,ManagedServerCreateMode> managedInstanceCreateMode) {
            return managedInstanceCreateMode(Output.of(managedInstanceCreateMode));
        }

        public Builder managedInstanceName(@Nullable Output<String> managedInstanceName) {
            $.managedInstanceName = managedInstanceName;
            return this;
        }

        public Builder managedInstanceName(String managedInstanceName) {
            return managedInstanceName(Output.of(managedInstanceName));
        }

        public Builder minimalTlsVersion(@Nullable Output<String> minimalTlsVersion) {
            $.minimalTlsVersion = minimalTlsVersion;
            return this;
        }

        public Builder minimalTlsVersion(String minimalTlsVersion) {
            return minimalTlsVersion(Output.of(minimalTlsVersion));
        }

        public Builder primaryUserAssignedIdentityId(@Nullable Output<String> primaryUserAssignedIdentityId) {
            $.primaryUserAssignedIdentityId = primaryUserAssignedIdentityId;
            return this;
        }

        public Builder primaryUserAssignedIdentityId(String primaryUserAssignedIdentityId) {
            return primaryUserAssignedIdentityId(Output.of(primaryUserAssignedIdentityId));
        }

        public Builder proxyOverride(@Nullable Output<Either<String,ManagedInstanceProxyOverride>> proxyOverride) {
            $.proxyOverride = proxyOverride;
            return this;
        }

        public Builder proxyOverride(Either<String,ManagedInstanceProxyOverride> proxyOverride) {
            return proxyOverride(Output.of(proxyOverride));
        }

        public Builder publicDataEndpointEnabled(@Nullable Output<Boolean> publicDataEndpointEnabled) {
            $.publicDataEndpointEnabled = publicDataEndpointEnabled;
            return this;
        }

        public Builder publicDataEndpointEnabled(Boolean publicDataEndpointEnabled) {
            return publicDataEndpointEnabled(Output.of(publicDataEndpointEnabled));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder restorePointInTime(@Nullable Output<String> restorePointInTime) {
            $.restorePointInTime = restorePointInTime;
            return this;
        }

        public Builder restorePointInTime(String restorePointInTime) {
            return restorePointInTime(Output.of(restorePointInTime));
        }

        public Builder sku(@Nullable Output<SkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        public Builder sku(SkuArgs sku) {
            return sku(Output.of(sku));
        }

        public Builder sourceManagedInstanceId(@Nullable Output<String> sourceManagedInstanceId) {
            $.sourceManagedInstanceId = sourceManagedInstanceId;
            return this;
        }

        public Builder sourceManagedInstanceId(String sourceManagedInstanceId) {
            return sourceManagedInstanceId(Output.of(sourceManagedInstanceId));
        }

        public Builder storageAccountType(@Nullable Output<Either<String,StorageAccountType>> storageAccountType) {
            $.storageAccountType = storageAccountType;
            return this;
        }

        public Builder storageAccountType(Either<String,StorageAccountType> storageAccountType) {
            return storageAccountType(Output.of(storageAccountType));
        }

        public Builder storageSizeInGB(@Nullable Output<Integer> storageSizeInGB) {
            $.storageSizeInGB = storageSizeInGB;
            return this;
        }

        public Builder storageSizeInGB(Integer storageSizeInGB) {
            return storageSizeInGB(Output.of(storageSizeInGB));
        }

        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder timezoneId(@Nullable Output<String> timezoneId) {
            $.timezoneId = timezoneId;
            return this;
        }

        public Builder timezoneId(String timezoneId) {
            return timezoneId(Output.of(timezoneId));
        }

        public Builder vCores(@Nullable Output<Integer> vCores) {
            $.vCores = vCores;
            return this;
        }

        public Builder vCores(Integer vCores) {
            return vCores(Output.of(vCores));
        }

        public Builder zoneRedundant(@Nullable Output<Boolean> zoneRedundant) {
            $.zoneRedundant = zoneRedundant;
            return this;
        }

        public Builder zoneRedundant(Boolean zoneRedundant) {
            return zoneRedundant(Output.of(zoneRedundant));
        }

        public ManagedInstanceArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
