// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.sql.enums.CatalogCollationType;
import com.pulumi.azurenative.sql.enums.CreateMode;
import com.pulumi.azurenative.sql.enums.DatabaseLicenseType;
import com.pulumi.azurenative.sql.enums.DatabaseReadScale;
import com.pulumi.azurenative.sql.enums.RequestedBackupStorageRedundancy;
import com.pulumi.azurenative.sql.enums.SampleName;
import com.pulumi.azurenative.sql.enums.SecondaryType;
import com.pulumi.azurenative.sql.inputs.SkuArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseArgs Empty = new DatabaseArgs();

    /**
     * Time in minutes after which database is automatically paused. A value of -1 means that automatic pause is disabled
     * 
     */
    @Import(name="autoPauseDelay")
    private @Nullable Output<Integer> autoPauseDelay;

    public Optional<Output<Integer>> autoPauseDelay() {
        return Optional.ofNullable(this.autoPauseDelay);
    }

    /**
     * Collation of the metadata catalog.
     * 
     */
    @Import(name="catalogCollation")
    private @Nullable Output<Either<String,CatalogCollationType>> catalogCollation;

    public Optional<Output<Either<String,CatalogCollationType>>> catalogCollation() {
        return Optional.ofNullable(this.catalogCollation);
    }

    /**
     * The collation of the database.
     * 
     */
    @Import(name="collation")
    private @Nullable Output<String> collation;

    public Optional<Output<String>> collation() {
        return Optional.ofNullable(this.collation);
    }

    /**
     * Specifies the mode of database creation.
     * 
     * Default: regular database creation.
     * 
     * Copy: creates a database as a copy of an existing database. sourceDatabaseId must be specified as the resource ID of the source database.
     * 
     * Secondary: creates a database as a secondary replica of an existing database. sourceDatabaseId must be specified as the resource ID of the existing primary database.
     * 
     * PointInTimeRestore: Creates a database by restoring a point in time backup of an existing database. sourceDatabaseId must be specified as the resource ID of the existing database, and restorePointInTime must be specified.
     * 
     * Recovery: Creates a database by restoring a geo-replicated backup. sourceDatabaseId must be specified as the recoverable database resource ID to restore.
     * 
     * Restore: Creates a database by restoring a backup of a deleted database. sourceDatabaseId must be specified. If sourceDatabaseId is the database&#39;s original resource ID, then sourceDatabaseDeletionDate must be specified. Otherwise sourceDatabaseId must be the restorable dropped database resource ID and sourceDatabaseDeletionDate is ignored. restorePointInTime may also be specified to restore from an earlier point in time.
     * 
     * RestoreLongTermRetentionBackup: Creates a database by restoring from a long term retention vault. recoveryServicesRecoveryPointResourceId must be specified as the recovery point resource ID.
     * 
     * Copy, Secondary, and RestoreLongTermRetentionBackup are not supported for DataWarehouse edition.
     * 
     */
    @Import(name="createMode")
    private @Nullable Output<Either<String,CreateMode>> createMode;

    public Optional<Output<Either<String,CreateMode>>> createMode() {
        return Optional.ofNullable(this.createMode);
    }

    /**
     * The name of the database.
     * 
     */
    @Import(name="databaseName")
    private @Nullable Output<String> databaseName;

    public Optional<Output<String>> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }

    /**
     * The resource identifier of the elastic pool containing this database.
     * 
     */
    @Import(name="elasticPoolId")
    private @Nullable Output<String> elasticPoolId;

    public Optional<Output<String>> elasticPoolId() {
        return Optional.ofNullable(this.elasticPoolId);
    }

    /**
     * The number of secondary replicas associated with the database that are used to provide high availability.
     * 
     */
    @Import(name="highAvailabilityReplicaCount")
    private @Nullable Output<Integer> highAvailabilityReplicaCount;

    public Optional<Output<Integer>> highAvailabilityReplicaCount() {
        return Optional.ofNullable(this.highAvailabilityReplicaCount);
    }

    /**
     * The license type to apply for this database. `LicenseIncluded` if you need a license, or `BasePrice` if you have a license and are eligible for the Azure Hybrid Benefit.
     * 
     */
    @Import(name="licenseType")
    private @Nullable Output<Either<String,DatabaseLicenseType>> licenseType;

    public Optional<Output<Either<String,DatabaseLicenseType>>> licenseType() {
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
     * The resource identifier of the long term retention backup associated with create operation of this database.
     * 
     */
    @Import(name="longTermRetentionBackupResourceId")
    private @Nullable Output<String> longTermRetentionBackupResourceId;

    public Optional<Output<String>> longTermRetentionBackupResourceId() {
        return Optional.ofNullable(this.longTermRetentionBackupResourceId);
    }

    /**
     * Maintenance configuration id assigned to the database. This configuration defines the period when the maintenance updates will occur.
     * 
     */
    @Import(name="maintenanceConfigurationId")
    private @Nullable Output<String> maintenanceConfigurationId;

    public Optional<Output<String>> maintenanceConfigurationId() {
        return Optional.ofNullable(this.maintenanceConfigurationId);
    }

    /**
     * The max size of the database expressed in bytes.
     * 
     */
    @Import(name="maxSizeBytes")
    private @Nullable Output<Double> maxSizeBytes;

    public Optional<Output<Double>> maxSizeBytes() {
        return Optional.ofNullable(this.maxSizeBytes);
    }

    /**
     * Minimal capacity that database will always have allocated, if not paused
     * 
     */
    @Import(name="minCapacity")
    private @Nullable Output<Double> minCapacity;

    public Optional<Output<Double>> minCapacity() {
        return Optional.ofNullable(this.minCapacity);
    }

    /**
     * The state of read-only routing. If enabled, connections that have application intent set to readonly in their connection string may be routed to a readonly secondary replica in the same region.
     * 
     */
    @Import(name="readScale")
    private @Nullable Output<Either<String,DatabaseReadScale>> readScale;

    public Optional<Output<Either<String,DatabaseReadScale>>> readScale() {
        return Optional.ofNullable(this.readScale);
    }

    /**
     * The resource identifier of the recoverable database associated with create operation of this database.
     * 
     */
    @Import(name="recoverableDatabaseId")
    private @Nullable Output<String> recoverableDatabaseId;

    public Optional<Output<String>> recoverableDatabaseId() {
        return Optional.ofNullable(this.recoverableDatabaseId);
    }

    /**
     * The resource identifier of the recovery point associated with create operation of this database.
     * 
     */
    @Import(name="recoveryServicesRecoveryPointId")
    private @Nullable Output<String> recoveryServicesRecoveryPointId;

    public Optional<Output<String>> recoveryServicesRecoveryPointId() {
        return Optional.ofNullable(this.recoveryServicesRecoveryPointId);
    }

    /**
     * The storage account type to be used to store backups for this database.
     * 
     */
    @Import(name="requestedBackupStorageRedundancy")
    private @Nullable Output<Either<String,RequestedBackupStorageRedundancy>> requestedBackupStorageRedundancy;

    public Optional<Output<Either<String,RequestedBackupStorageRedundancy>>> requestedBackupStorageRedundancy() {
        return Optional.ofNullable(this.requestedBackupStorageRedundancy);
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
     * The resource identifier of the restorable dropped database associated with create operation of this database.
     * 
     */
    @Import(name="restorableDroppedDatabaseId")
    private @Nullable Output<String> restorableDroppedDatabaseId;

    public Optional<Output<String>> restorableDroppedDatabaseId() {
        return Optional.ofNullable(this.restorableDroppedDatabaseId);
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
     * The name of the sample schema to apply when creating this database.
     * 
     */
    @Import(name="sampleName")
    private @Nullable Output<Either<String,SampleName>> sampleName;

    public Optional<Output<Either<String,SampleName>>> sampleName() {
        return Optional.ofNullable(this.sampleName);
    }

    /**
     * The secondary type of the database if it is a secondary.  Valid values are Geo and Named.
     * 
     */
    @Import(name="secondaryType")
    private @Nullable Output<Either<String,SecondaryType>> secondaryType;

    public Optional<Output<Either<String,SecondaryType>>> secondaryType() {
        return Optional.ofNullable(this.secondaryType);
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
     * The database SKU.
     * 
     * The list of SKUs may vary by region and support offer. To determine the SKUs (including the SKU name, tier/edition, family, and capacity) that are available to your subscription in an Azure region, use the `Capabilities_ListByLocation` REST API or one of the following commands:
     * 
     */
    @Import(name="sku")
    private @Nullable Output<SkuArgs> sku;

    public Optional<Output<SkuArgs>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * Specifies the time that the database was deleted.
     * 
     */
    @Import(name="sourceDatabaseDeletionDate")
    private @Nullable Output<String> sourceDatabaseDeletionDate;

    public Optional<Output<String>> sourceDatabaseDeletionDate() {
        return Optional.ofNullable(this.sourceDatabaseDeletionDate);
    }

    /**
     * The resource identifier of the source database associated with create operation of this database.
     * 
     */
    @Import(name="sourceDatabaseId")
    private @Nullable Output<String> sourceDatabaseId;

    public Optional<Output<String>> sourceDatabaseId() {
        return Optional.ofNullable(this.sourceDatabaseId);
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
     * Whether or not this database is zone redundant, which means the replicas of this database will be spread across multiple availability zones.
     * 
     */
    @Import(name="zoneRedundant")
    private @Nullable Output<Boolean> zoneRedundant;

    public Optional<Output<Boolean>> zoneRedundant() {
        return Optional.ofNullable(this.zoneRedundant);
    }

    private DatabaseArgs() {}

    private DatabaseArgs(DatabaseArgs $) {
        this.autoPauseDelay = $.autoPauseDelay;
        this.catalogCollation = $.catalogCollation;
        this.collation = $.collation;
        this.createMode = $.createMode;
        this.databaseName = $.databaseName;
        this.elasticPoolId = $.elasticPoolId;
        this.highAvailabilityReplicaCount = $.highAvailabilityReplicaCount;
        this.licenseType = $.licenseType;
        this.location = $.location;
        this.longTermRetentionBackupResourceId = $.longTermRetentionBackupResourceId;
        this.maintenanceConfigurationId = $.maintenanceConfigurationId;
        this.maxSizeBytes = $.maxSizeBytes;
        this.minCapacity = $.minCapacity;
        this.readScale = $.readScale;
        this.recoverableDatabaseId = $.recoverableDatabaseId;
        this.recoveryServicesRecoveryPointId = $.recoveryServicesRecoveryPointId;
        this.requestedBackupStorageRedundancy = $.requestedBackupStorageRedundancy;
        this.resourceGroupName = $.resourceGroupName;
        this.restorableDroppedDatabaseId = $.restorableDroppedDatabaseId;
        this.restorePointInTime = $.restorePointInTime;
        this.sampleName = $.sampleName;
        this.secondaryType = $.secondaryType;
        this.serverName = $.serverName;
        this.sku = $.sku;
        this.sourceDatabaseDeletionDate = $.sourceDatabaseDeletionDate;
        this.sourceDatabaseId = $.sourceDatabaseId;
        this.tags = $.tags;
        this.zoneRedundant = $.zoneRedundant;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseArgs $;

        public Builder() {
            $ = new DatabaseArgs();
        }

        public Builder(DatabaseArgs defaults) {
            $ = new DatabaseArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoPauseDelay(@Nullable Output<Integer> autoPauseDelay) {
            $.autoPauseDelay = autoPauseDelay;
            return this;
        }

        public Builder autoPauseDelay(Integer autoPauseDelay) {
            return autoPauseDelay(Output.of(autoPauseDelay));
        }

        public Builder catalogCollation(@Nullable Output<Either<String,CatalogCollationType>> catalogCollation) {
            $.catalogCollation = catalogCollation;
            return this;
        }

        public Builder catalogCollation(Either<String,CatalogCollationType> catalogCollation) {
            return catalogCollation(Output.of(catalogCollation));
        }

        public Builder collation(@Nullable Output<String> collation) {
            $.collation = collation;
            return this;
        }

        public Builder collation(String collation) {
            return collation(Output.of(collation));
        }

        public Builder createMode(@Nullable Output<Either<String,CreateMode>> createMode) {
            $.createMode = createMode;
            return this;
        }

        public Builder createMode(Either<String,CreateMode> createMode) {
            return createMode(Output.of(createMode));
        }

        public Builder databaseName(@Nullable Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        public Builder elasticPoolId(@Nullable Output<String> elasticPoolId) {
            $.elasticPoolId = elasticPoolId;
            return this;
        }

        public Builder elasticPoolId(String elasticPoolId) {
            return elasticPoolId(Output.of(elasticPoolId));
        }

        public Builder highAvailabilityReplicaCount(@Nullable Output<Integer> highAvailabilityReplicaCount) {
            $.highAvailabilityReplicaCount = highAvailabilityReplicaCount;
            return this;
        }

        public Builder highAvailabilityReplicaCount(Integer highAvailabilityReplicaCount) {
            return highAvailabilityReplicaCount(Output.of(highAvailabilityReplicaCount));
        }

        public Builder licenseType(@Nullable Output<Either<String,DatabaseLicenseType>> licenseType) {
            $.licenseType = licenseType;
            return this;
        }

        public Builder licenseType(Either<String,DatabaseLicenseType> licenseType) {
            return licenseType(Output.of(licenseType));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder longTermRetentionBackupResourceId(@Nullable Output<String> longTermRetentionBackupResourceId) {
            $.longTermRetentionBackupResourceId = longTermRetentionBackupResourceId;
            return this;
        }

        public Builder longTermRetentionBackupResourceId(String longTermRetentionBackupResourceId) {
            return longTermRetentionBackupResourceId(Output.of(longTermRetentionBackupResourceId));
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

        public Builder minCapacity(@Nullable Output<Double> minCapacity) {
            $.minCapacity = minCapacity;
            return this;
        }

        public Builder minCapacity(Double minCapacity) {
            return minCapacity(Output.of(minCapacity));
        }

        public Builder readScale(@Nullable Output<Either<String,DatabaseReadScale>> readScale) {
            $.readScale = readScale;
            return this;
        }

        public Builder readScale(Either<String,DatabaseReadScale> readScale) {
            return readScale(Output.of(readScale));
        }

        public Builder recoverableDatabaseId(@Nullable Output<String> recoverableDatabaseId) {
            $.recoverableDatabaseId = recoverableDatabaseId;
            return this;
        }

        public Builder recoverableDatabaseId(String recoverableDatabaseId) {
            return recoverableDatabaseId(Output.of(recoverableDatabaseId));
        }

        public Builder recoveryServicesRecoveryPointId(@Nullable Output<String> recoveryServicesRecoveryPointId) {
            $.recoveryServicesRecoveryPointId = recoveryServicesRecoveryPointId;
            return this;
        }

        public Builder recoveryServicesRecoveryPointId(String recoveryServicesRecoveryPointId) {
            return recoveryServicesRecoveryPointId(Output.of(recoveryServicesRecoveryPointId));
        }

        public Builder requestedBackupStorageRedundancy(@Nullable Output<Either<String,RequestedBackupStorageRedundancy>> requestedBackupStorageRedundancy) {
            $.requestedBackupStorageRedundancy = requestedBackupStorageRedundancy;
            return this;
        }

        public Builder requestedBackupStorageRedundancy(Either<String,RequestedBackupStorageRedundancy> requestedBackupStorageRedundancy) {
            return requestedBackupStorageRedundancy(Output.of(requestedBackupStorageRedundancy));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder restorableDroppedDatabaseId(@Nullable Output<String> restorableDroppedDatabaseId) {
            $.restorableDroppedDatabaseId = restorableDroppedDatabaseId;
            return this;
        }

        public Builder restorableDroppedDatabaseId(String restorableDroppedDatabaseId) {
            return restorableDroppedDatabaseId(Output.of(restorableDroppedDatabaseId));
        }

        public Builder restorePointInTime(@Nullable Output<String> restorePointInTime) {
            $.restorePointInTime = restorePointInTime;
            return this;
        }

        public Builder restorePointInTime(String restorePointInTime) {
            return restorePointInTime(Output.of(restorePointInTime));
        }

        public Builder sampleName(@Nullable Output<Either<String,SampleName>> sampleName) {
            $.sampleName = sampleName;
            return this;
        }

        public Builder sampleName(Either<String,SampleName> sampleName) {
            return sampleName(Output.of(sampleName));
        }

        public Builder secondaryType(@Nullable Output<Either<String,SecondaryType>> secondaryType) {
            $.secondaryType = secondaryType;
            return this;
        }

        public Builder secondaryType(Either<String,SecondaryType> secondaryType) {
            return secondaryType(Output.of(secondaryType));
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

        public Builder sourceDatabaseDeletionDate(@Nullable Output<String> sourceDatabaseDeletionDate) {
            $.sourceDatabaseDeletionDate = sourceDatabaseDeletionDate;
            return this;
        }

        public Builder sourceDatabaseDeletionDate(String sourceDatabaseDeletionDate) {
            return sourceDatabaseDeletionDate(Output.of(sourceDatabaseDeletionDate));
        }

        public Builder sourceDatabaseId(@Nullable Output<String> sourceDatabaseId) {
            $.sourceDatabaseId = sourceDatabaseId;
            return this;
        }

        public Builder sourceDatabaseId(String sourceDatabaseId) {
            return sourceDatabaseId(Output.of(sourceDatabaseId));
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

        public DatabaseArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
