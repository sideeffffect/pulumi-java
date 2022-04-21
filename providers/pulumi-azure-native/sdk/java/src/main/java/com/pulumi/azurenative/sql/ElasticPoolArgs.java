// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.sql.enums.ElasticPoolLicenseType;
import com.pulumi.azurenative.sql.inputs.ElasticPoolPerDatabaseSettingsArgs;
import com.pulumi.azurenative.sql.inputs.SkuArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElasticPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElasticPoolArgs Empty = new ElasticPoolArgs();

    /**
     * The name of the elastic pool.
     * 
     */
    @Import(name="elasticPoolName")
    private @Nullable Output<String> elasticPoolName;

    public Optional<Output<String>> elasticPoolName() {
        return Optional.ofNullable(this.elasticPoolName);
    }

    /**
     * The license type to apply for this elastic pool.
     * 
     */
    @Import(name="licenseType")
    private @Nullable Output<Either<String,ElasticPoolLicenseType>> licenseType;

    public Optional<Output<Either<String,ElasticPoolLicenseType>>> licenseType() {
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
     * Maintenance configuration id assigned to the elastic pool. This configuration defines the period when the maintenance updates will will occur.
     * 
     */
    @Import(name="maintenanceConfigurationId")
    private @Nullable Output<String> maintenanceConfigurationId;

    public Optional<Output<String>> maintenanceConfigurationId() {
        return Optional.ofNullable(this.maintenanceConfigurationId);
    }

    /**
     * The storage limit for the database elastic pool in bytes.
     * 
     */
    @Import(name="maxSizeBytes")
    private @Nullable Output<Double> maxSizeBytes;

    public Optional<Output<Double>> maxSizeBytes() {
        return Optional.ofNullable(this.maxSizeBytes);
    }

    /**
     * The per database settings for the elastic pool.
     * 
     */
    @Import(name="perDatabaseSettings")
    private @Nullable Output<ElasticPoolPerDatabaseSettingsArgs> perDatabaseSettings;

    public Optional<Output<ElasticPoolPerDatabaseSettingsArgs>> perDatabaseSettings() {
        return Optional.ofNullable(this.perDatabaseSettings);
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
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
    private Output<String> serverName;

    public Output<String> serverName() {
        return this.serverName;
    }

    /**
     * The elastic pool SKU.
     * 
     * The list of SKUs may vary by region and support offer. To determine the SKUs (including the SKU name, tier/edition, family, and capacity) that are available to your subscription in an Azure region, use the `Capabilities_ListByLocation` REST API or the following command:
     * 
     */
    @Import(name="sku")
    private @Nullable Output<SkuArgs> sku;

    public Optional<Output<SkuArgs>> sku() {
        return Optional.ofNullable(this.sku);
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
     * Whether or not this elastic pool is zone redundant, which means the replicas of this elastic pool will be spread across multiple availability zones.
     * 
     */
    @Import(name="zoneRedundant")
    private @Nullable Output<Boolean> zoneRedundant;

    public Optional<Output<Boolean>> zoneRedundant() {
        return Optional.ofNullable(this.zoneRedundant);
    }

    private ElasticPoolArgs() {}

    private ElasticPoolArgs(ElasticPoolArgs $) {
        this.elasticPoolName = $.elasticPoolName;
        this.licenseType = $.licenseType;
        this.location = $.location;
        this.maintenanceConfigurationId = $.maintenanceConfigurationId;
        this.maxSizeBytes = $.maxSizeBytes;
        this.perDatabaseSettings = $.perDatabaseSettings;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
        this.sku = $.sku;
        this.tags = $.tags;
        this.zoneRedundant = $.zoneRedundant;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElasticPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElasticPoolArgs $;

        public Builder() {
            $ = new ElasticPoolArgs();
        }

        public Builder(ElasticPoolArgs defaults) {
            $ = new ElasticPoolArgs(Objects.requireNonNull(defaults));
        }

        public Builder elasticPoolName(@Nullable Output<String> elasticPoolName) {
            $.elasticPoolName = elasticPoolName;
            return this;
        }

        public Builder elasticPoolName(String elasticPoolName) {
            return elasticPoolName(Output.of(elasticPoolName));
        }

        public Builder licenseType(@Nullable Output<Either<String,ElasticPoolLicenseType>> licenseType) {
            $.licenseType = licenseType;
            return this;
        }

        public Builder licenseType(Either<String,ElasticPoolLicenseType> licenseType) {
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

        public Builder maxSizeBytes(@Nullable Output<Double> maxSizeBytes) {
            $.maxSizeBytes = maxSizeBytes;
            return this;
        }

        public Builder maxSizeBytes(Double maxSizeBytes) {
            return maxSizeBytes(Output.of(maxSizeBytes));
        }

        public Builder perDatabaseSettings(@Nullable Output<ElasticPoolPerDatabaseSettingsArgs> perDatabaseSettings) {
            $.perDatabaseSettings = perDatabaseSettings;
            return this;
        }

        public Builder perDatabaseSettings(ElasticPoolPerDatabaseSettingsArgs perDatabaseSettings) {
            return perDatabaseSettings(Output.of(perDatabaseSettings));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder serverName(Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        public Builder sku(@Nullable Output<SkuArgs> sku) {
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

        public Builder zoneRedundant(@Nullable Output<Boolean> zoneRedundant) {
            $.zoneRedundant = zoneRedundant;
            return this;
        }

        public Builder zoneRedundant(Boolean zoneRedundant) {
            return zoneRedundant(Output.of(zoneRedundant));
        }

        public ElasticPoolArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
