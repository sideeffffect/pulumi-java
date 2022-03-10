// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.sqladmin_v1beta4.enums.InstanceBackendType;
import io.pulumi.googlenative.sqladmin_v1beta4.enums.InstanceDatabaseVersion;
import io.pulumi.googlenative.sqladmin_v1beta4.enums.InstanceInstanceType;
import io.pulumi.googlenative.sqladmin_v1beta4.enums.InstanceState;
import io.pulumi.googlenative.sqladmin_v1beta4.enums.InstanceSuspensionReasonItem;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.DiskEncryptionConfigurationArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.DiskEncryptionStatusArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.InstanceFailoverReplicaArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.IpMappingArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.OnPremisesConfigurationArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.ReplicaConfigurationArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.SettingsArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.SqlOutOfDiskReportArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.SqlScheduledMaintenanceArgs;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.SslCertArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * The backend type. `SECOND_GEN`: Cloud SQL database instance. `EXTERNAL`: A database server that is not managed by Google. This property is read-only; use the `tier` property in the `settings` object to determine the database type.
     * 
     */
    @InputImport(name="backendType")
      private final @Nullable Input<InstanceBackendType> backendType;

    public Input<InstanceBackendType> getBackendType() {
        return this.backendType == null ? Input.empty() : this.backendType;
    }

    /**
     * Connection name of the Cloud SQL instance used in connection strings.
     * 
     */
    @InputImport(name="connectionName")
      private final @Nullable Input<String> connectionName;

    public Input<String> getConnectionName() {
        return this.connectionName == null ? Input.empty() : this.connectionName;
    }

    /**
     * The current disk usage of the instance in bytes. This property has been deprecated. Use the "cloudsql.googleapis.com/database/disk/bytes_used" metric in Cloud Monitoring API instead. Please see [this announcement](https://groups.google.com/d/msg/google-cloud-sql-announce/I_7-F9EBhT0/BtvFtdFeAgAJ) for details.
     * 
     */
    @InputImport(name="currentDiskSize")
      private final @Nullable Input<String> currentDiskSize;

    public Input<String> getCurrentDiskSize() {
        return this.currentDiskSize == null ? Input.empty() : this.currentDiskSize;
    }

    /**
     * The database engine type and version. The `databaseVersion` field cannot be changed after instance creation.
     * 
     */
    @InputImport(name="databaseVersion")
      private final @Nullable Input<InstanceDatabaseVersion> databaseVersion;

    public Input<InstanceDatabaseVersion> getDatabaseVersion() {
        return this.databaseVersion == null ? Input.empty() : this.databaseVersion;
    }

    /**
     * Disk encryption configuration specific to an instance.
     * 
     */
    @InputImport(name="diskEncryptionConfiguration")
      private final @Nullable Input<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration;

    public Input<DiskEncryptionConfigurationArgs> getDiskEncryptionConfiguration() {
        return this.diskEncryptionConfiguration == null ? Input.empty() : this.diskEncryptionConfiguration;
    }

    /**
     * Disk encryption status specific to an instance.
     * 
     */
    @InputImport(name="diskEncryptionStatus")
      private final @Nullable Input<DiskEncryptionStatusArgs> diskEncryptionStatus;

    public Input<DiskEncryptionStatusArgs> getDiskEncryptionStatus() {
        return this.diskEncryptionStatus == null ? Input.empty() : this.diskEncryptionStatus;
    }

    /**
     * The name and status of the failover replica.
     * 
     */
    @InputImport(name="failoverReplica")
      private final @Nullable Input<InstanceFailoverReplicaArgs> failoverReplica;

    public Input<InstanceFailoverReplicaArgs> getFailoverReplica() {
        return this.failoverReplica == null ? Input.empty() : this.failoverReplica;
    }

    /**
     * The Compute Engine zone that the instance is currently serving from. This value could be different from the zone that was specified when the instance was created if the instance has failed over to its secondary zone. WARNING: Changing this might restart the instance.
     * 
     */
    @InputImport(name="gceZone")
      private final @Nullable Input<String> gceZone;

    public Input<String> getGceZone() {
        return this.gceZone == null ? Input.empty() : this.gceZone;
    }

    /**
     * The instance type.
     * 
     */
    @InputImport(name="instanceType")
      private final @Nullable Input<InstanceInstanceType> instanceType;

    public Input<InstanceInstanceType> getInstanceType() {
        return this.instanceType == null ? Input.empty() : this.instanceType;
    }

    /**
     * The assigned IP addresses for the instance.
     * 
     */
    @InputImport(name="ipAddresses")
      private final @Nullable Input<List<IpMappingArgs>> ipAddresses;

    public Input<List<IpMappingArgs>> getIpAddresses() {
        return this.ipAddresses == null ? Input.empty() : this.ipAddresses;
    }

    /**
     * This is always `sql#instance`.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * The name of the instance which will act as primary in the replication setup.
     * 
     */
    @InputImport(name="masterInstanceName")
      private final @Nullable Input<String> masterInstanceName;

    public Input<String> getMasterInstanceName() {
        return this.masterInstanceName == null ? Input.empty() : this.masterInstanceName;
    }

    /**
     * The maximum disk size of the instance in bytes.
     * 
     */
    @InputImport(name="maxDiskSize")
      private final @Nullable Input<String> maxDiskSize;

    public Input<String> getMaxDiskSize() {
        return this.maxDiskSize == null ? Input.empty() : this.maxDiskSize;
    }

    /**
     * Name of the Cloud SQL instance. This does not include the project ID.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Configuration specific to on-premises instances.
     * 
     */
    @InputImport(name="onPremisesConfiguration")
      private final @Nullable Input<OnPremisesConfigurationArgs> onPremisesConfiguration;

    public Input<OnPremisesConfigurationArgs> getOnPremisesConfiguration() {
        return this.onPremisesConfiguration == null ? Input.empty() : this.onPremisesConfiguration;
    }

    /**
     * This field represents the report generated by the proactive database wellness job for OutOfDisk issues. * Writers: * the proactive database wellness job for OOD. * Readers: * the proactive database wellness job
     * 
     */
    @InputImport(name="outOfDiskReport")
      private final @Nullable Input<SqlOutOfDiskReportArgs> outOfDiskReport;

    public Input<SqlOutOfDiskReportArgs> getOutOfDiskReport() {
        return this.outOfDiskReport == null ? Input.empty() : this.outOfDiskReport;
    }

    /**
     * The project ID of the project containing the Cloud SQL instance. The Google apps domain is prefixed if applicable.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The geographical region. Can be: * `us-central` (`FIRST_GEN` instances only) * `us-central1` (`SECOND_GEN` instances only) * `asia-east1` or `europe-west1`. Defaults to `us-central` or `us-central1` depending on the instance type. The region cannot be changed after instance creation.
     * 
     */
    @InputImport(name="region")
      private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * Configuration specific to failover replicas and read replicas.
     * 
     */
    @InputImport(name="replicaConfiguration")
      private final @Nullable Input<ReplicaConfigurationArgs> replicaConfiguration;

    public Input<ReplicaConfigurationArgs> getReplicaConfiguration() {
        return this.replicaConfiguration == null ? Input.empty() : this.replicaConfiguration;
    }

    /**
     * The replicas of the instance.
     * 
     */
    @InputImport(name="replicaNames")
      private final @Nullable Input<List<String>> replicaNames;

    public Input<List<String>> getReplicaNames() {
        return this.replicaNames == null ? Input.empty() : this.replicaNames;
    }

    /**
     * Initial root password. Use only on creation.
     * 
     */
    @InputImport(name="rootPassword")
      private final @Nullable Input<String> rootPassword;

    public Input<String> getRootPassword() {
        return this.rootPassword == null ? Input.empty() : this.rootPassword;
    }

    /**
     * The status indicating if instance satisfiesPzs. Reserved for future use.
     * 
     */
    @InputImport(name="satisfiesPzs")
      private final @Nullable Input<Boolean> satisfiesPzs;

    public Input<Boolean> getSatisfiesPzs() {
        return this.satisfiesPzs == null ? Input.empty() : this.satisfiesPzs;
    }

    /**
     * The start time of any upcoming scheduled maintenance for this instance.
     * 
     */
    @InputImport(name="scheduledMaintenance")
      private final @Nullable Input<SqlScheduledMaintenanceArgs> scheduledMaintenance;

    public Input<SqlScheduledMaintenanceArgs> getScheduledMaintenance() {
        return this.scheduledMaintenance == null ? Input.empty() : this.scheduledMaintenance;
    }

    /**
     * The Compute Engine zone that the failover instance is currently serving from for a regional instance. This value could be different from the zone that was specified when the instance was created if the instance has failed over to its secondary/failover zone. Reserved for future use.
     * 
     */
    @InputImport(name="secondaryGceZone")
      private final @Nullable Input<String> secondaryGceZone;

    public Input<String> getSecondaryGceZone() {
        return this.secondaryGceZone == null ? Input.empty() : this.secondaryGceZone;
    }

    /**
     * The URI of this resource.
     * 
     */
    @InputImport(name="selfLink")
      private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    /**
     * SSL configuration.
     * 
     */
    @InputImport(name="serverCaCert")
      private final @Nullable Input<SslCertArgs> serverCaCert;

    public Input<SslCertArgs> getServerCaCert() {
        return this.serverCaCert == null ? Input.empty() : this.serverCaCert;
    }

    /**
     * The service account email address assigned to the instance. \This property is read-only.
     * 
     */
    @InputImport(name="serviceAccountEmailAddress")
      private final @Nullable Input<String> serviceAccountEmailAddress;

    public Input<String> getServiceAccountEmailAddress() {
        return this.serviceAccountEmailAddress == null ? Input.empty() : this.serviceAccountEmailAddress;
    }

    /**
     * The user settings.
     * 
     */
    @InputImport(name="settings")
      private final @Nullable Input<SettingsArgs> settings;

    public Input<SettingsArgs> getSettings() {
        return this.settings == null ? Input.empty() : this.settings;
    }

    /**
     * The current serving state of the Cloud SQL instance.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<InstanceState> state;

    public Input<InstanceState> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * If the instance state is SUSPENDED, the reason for the suspension.
     * 
     */
    @InputImport(name="suspensionReason")
      private final @Nullable Input<List<InstanceSuspensionReasonItem>> suspensionReason;

    public Input<List<InstanceSuspensionReasonItem>> getSuspensionReason() {
        return this.suspensionReason == null ? Input.empty() : this.suspensionReason;
    }

    public InstanceArgs(
        @Nullable Input<InstanceBackendType> backendType,
        @Nullable Input<String> connectionName,
        @Nullable Input<String> currentDiskSize,
        @Nullable Input<InstanceDatabaseVersion> databaseVersion,
        @Nullable Input<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration,
        @Nullable Input<DiskEncryptionStatusArgs> diskEncryptionStatus,
        @Nullable Input<InstanceFailoverReplicaArgs> failoverReplica,
        @Nullable Input<String> gceZone,
        @Nullable Input<InstanceInstanceType> instanceType,
        @Nullable Input<List<IpMappingArgs>> ipAddresses,
        @Nullable Input<String> kind,
        @Nullable Input<String> masterInstanceName,
        @Nullable Input<String> maxDiskSize,
        @Nullable Input<String> name,
        @Nullable Input<OnPremisesConfigurationArgs> onPremisesConfiguration,
        @Nullable Input<SqlOutOfDiskReportArgs> outOfDiskReport,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<ReplicaConfigurationArgs> replicaConfiguration,
        @Nullable Input<List<String>> replicaNames,
        @Nullable Input<String> rootPassword,
        @Nullable Input<Boolean> satisfiesPzs,
        @Nullable Input<SqlScheduledMaintenanceArgs> scheduledMaintenance,
        @Nullable Input<String> secondaryGceZone,
        @Nullable Input<String> selfLink,
        @Nullable Input<SslCertArgs> serverCaCert,
        @Nullable Input<String> serviceAccountEmailAddress,
        @Nullable Input<SettingsArgs> settings,
        @Nullable Input<InstanceState> state,
        @Nullable Input<List<InstanceSuspensionReasonItem>> suspensionReason) {
        this.backendType = backendType;
        this.connectionName = connectionName;
        this.currentDiskSize = currentDiskSize;
        this.databaseVersion = databaseVersion;
        this.diskEncryptionConfiguration = diskEncryptionConfiguration;
        this.diskEncryptionStatus = diskEncryptionStatus;
        this.failoverReplica = failoverReplica;
        this.gceZone = gceZone;
        this.instanceType = instanceType;
        this.ipAddresses = ipAddresses;
        this.kind = kind;
        this.masterInstanceName = masterInstanceName;
        this.maxDiskSize = maxDiskSize;
        this.name = name;
        this.onPremisesConfiguration = onPremisesConfiguration;
        this.outOfDiskReport = outOfDiskReport;
        this.project = project;
        this.region = region;
        this.replicaConfiguration = replicaConfiguration;
        this.replicaNames = replicaNames;
        this.rootPassword = rootPassword;
        this.satisfiesPzs = satisfiesPzs;
        this.scheduledMaintenance = scheduledMaintenance;
        this.secondaryGceZone = secondaryGceZone;
        this.selfLink = selfLink;
        this.serverCaCert = serverCaCert;
        this.serviceAccountEmailAddress = serviceAccountEmailAddress;
        this.settings = settings;
        this.state = state;
        this.suspensionReason = suspensionReason;
    }

    private InstanceArgs() {
        this.backendType = Input.empty();
        this.connectionName = Input.empty();
        this.currentDiskSize = Input.empty();
        this.databaseVersion = Input.empty();
        this.diskEncryptionConfiguration = Input.empty();
        this.diskEncryptionStatus = Input.empty();
        this.failoverReplica = Input.empty();
        this.gceZone = Input.empty();
        this.instanceType = Input.empty();
        this.ipAddresses = Input.empty();
        this.kind = Input.empty();
        this.masterInstanceName = Input.empty();
        this.maxDiskSize = Input.empty();
        this.name = Input.empty();
        this.onPremisesConfiguration = Input.empty();
        this.outOfDiskReport = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.replicaConfiguration = Input.empty();
        this.replicaNames = Input.empty();
        this.rootPassword = Input.empty();
        this.satisfiesPzs = Input.empty();
        this.scheduledMaintenance = Input.empty();
        this.secondaryGceZone = Input.empty();
        this.selfLink = Input.empty();
        this.serverCaCert = Input.empty();
        this.serviceAccountEmailAddress = Input.empty();
        this.settings = Input.empty();
        this.state = Input.empty();
        this.suspensionReason = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<InstanceBackendType> backendType;
        private @Nullable Input<String> connectionName;
        private @Nullable Input<String> currentDiskSize;
        private @Nullable Input<InstanceDatabaseVersion> databaseVersion;
        private @Nullable Input<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration;
        private @Nullable Input<DiskEncryptionStatusArgs> diskEncryptionStatus;
        private @Nullable Input<InstanceFailoverReplicaArgs> failoverReplica;
        private @Nullable Input<String> gceZone;
        private @Nullable Input<InstanceInstanceType> instanceType;
        private @Nullable Input<List<IpMappingArgs>> ipAddresses;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> masterInstanceName;
        private @Nullable Input<String> maxDiskSize;
        private @Nullable Input<String> name;
        private @Nullable Input<OnPremisesConfigurationArgs> onPremisesConfiguration;
        private @Nullable Input<SqlOutOfDiskReportArgs> outOfDiskReport;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<ReplicaConfigurationArgs> replicaConfiguration;
        private @Nullable Input<List<String>> replicaNames;
        private @Nullable Input<String> rootPassword;
        private @Nullable Input<Boolean> satisfiesPzs;
        private @Nullable Input<SqlScheduledMaintenanceArgs> scheduledMaintenance;
        private @Nullable Input<String> secondaryGceZone;
        private @Nullable Input<String> selfLink;
        private @Nullable Input<SslCertArgs> serverCaCert;
        private @Nullable Input<String> serviceAccountEmailAddress;
        private @Nullable Input<SettingsArgs> settings;
        private @Nullable Input<InstanceState> state;
        private @Nullable Input<List<InstanceSuspensionReasonItem>> suspensionReason;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendType = defaults.backendType;
    	      this.connectionName = defaults.connectionName;
    	      this.currentDiskSize = defaults.currentDiskSize;
    	      this.databaseVersion = defaults.databaseVersion;
    	      this.diskEncryptionConfiguration = defaults.diskEncryptionConfiguration;
    	      this.diskEncryptionStatus = defaults.diskEncryptionStatus;
    	      this.failoverReplica = defaults.failoverReplica;
    	      this.gceZone = defaults.gceZone;
    	      this.instanceType = defaults.instanceType;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.kind = defaults.kind;
    	      this.masterInstanceName = defaults.masterInstanceName;
    	      this.maxDiskSize = defaults.maxDiskSize;
    	      this.name = defaults.name;
    	      this.onPremisesConfiguration = defaults.onPremisesConfiguration;
    	      this.outOfDiskReport = defaults.outOfDiskReport;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.replicaConfiguration = defaults.replicaConfiguration;
    	      this.replicaNames = defaults.replicaNames;
    	      this.rootPassword = defaults.rootPassword;
    	      this.satisfiesPzs = defaults.satisfiesPzs;
    	      this.scheduledMaintenance = defaults.scheduledMaintenance;
    	      this.secondaryGceZone = defaults.secondaryGceZone;
    	      this.selfLink = defaults.selfLink;
    	      this.serverCaCert = defaults.serverCaCert;
    	      this.serviceAccountEmailAddress = defaults.serviceAccountEmailAddress;
    	      this.settings = defaults.settings;
    	      this.state = defaults.state;
    	      this.suspensionReason = defaults.suspensionReason;
        }

        public Builder backendType(@Nullable Input<InstanceBackendType> backendType) {
            this.backendType = backendType;
            return this;
        }

        public Builder backendType(@Nullable InstanceBackendType backendType) {
            this.backendType = Input.ofNullable(backendType);
            return this;
        }

        public Builder connectionName(@Nullable Input<String> connectionName) {
            this.connectionName = connectionName;
            return this;
        }

        public Builder connectionName(@Nullable String connectionName) {
            this.connectionName = Input.ofNullable(connectionName);
            return this;
        }

        public Builder currentDiskSize(@Nullable Input<String> currentDiskSize) {
            this.currentDiskSize = currentDiskSize;
            return this;
        }

        public Builder currentDiskSize(@Nullable String currentDiskSize) {
            this.currentDiskSize = Input.ofNullable(currentDiskSize);
            return this;
        }

        public Builder databaseVersion(@Nullable Input<InstanceDatabaseVersion> databaseVersion) {
            this.databaseVersion = databaseVersion;
            return this;
        }

        public Builder databaseVersion(@Nullable InstanceDatabaseVersion databaseVersion) {
            this.databaseVersion = Input.ofNullable(databaseVersion);
            return this;
        }

        public Builder diskEncryptionConfiguration(@Nullable Input<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration) {
            this.diskEncryptionConfiguration = diskEncryptionConfiguration;
            return this;
        }

        public Builder diskEncryptionConfiguration(@Nullable DiskEncryptionConfigurationArgs diskEncryptionConfiguration) {
            this.diskEncryptionConfiguration = Input.ofNullable(diskEncryptionConfiguration);
            return this;
        }

        public Builder diskEncryptionStatus(@Nullable Input<DiskEncryptionStatusArgs> diskEncryptionStatus) {
            this.diskEncryptionStatus = diskEncryptionStatus;
            return this;
        }

        public Builder diskEncryptionStatus(@Nullable DiskEncryptionStatusArgs diskEncryptionStatus) {
            this.diskEncryptionStatus = Input.ofNullable(diskEncryptionStatus);
            return this;
        }

        public Builder failoverReplica(@Nullable Input<InstanceFailoverReplicaArgs> failoverReplica) {
            this.failoverReplica = failoverReplica;
            return this;
        }

        public Builder failoverReplica(@Nullable InstanceFailoverReplicaArgs failoverReplica) {
            this.failoverReplica = Input.ofNullable(failoverReplica);
            return this;
        }

        public Builder gceZone(@Nullable Input<String> gceZone) {
            this.gceZone = gceZone;
            return this;
        }

        public Builder gceZone(@Nullable String gceZone) {
            this.gceZone = Input.ofNullable(gceZone);
            return this;
        }

        public Builder instanceType(@Nullable Input<InstanceInstanceType> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(@Nullable InstanceInstanceType instanceType) {
            this.instanceType = Input.ofNullable(instanceType);
            return this;
        }

        public Builder ipAddresses(@Nullable Input<List<IpMappingArgs>> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }

        public Builder ipAddresses(@Nullable List<IpMappingArgs> ipAddresses) {
            this.ipAddresses = Input.ofNullable(ipAddresses);
            return this;
        }

        public Builder kind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder masterInstanceName(@Nullable Input<String> masterInstanceName) {
            this.masterInstanceName = masterInstanceName;
            return this;
        }

        public Builder masterInstanceName(@Nullable String masterInstanceName) {
            this.masterInstanceName = Input.ofNullable(masterInstanceName);
            return this;
        }

        public Builder maxDiskSize(@Nullable Input<String> maxDiskSize) {
            this.maxDiskSize = maxDiskSize;
            return this;
        }

        public Builder maxDiskSize(@Nullable String maxDiskSize) {
            this.maxDiskSize = Input.ofNullable(maxDiskSize);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder onPremisesConfiguration(@Nullable Input<OnPremisesConfigurationArgs> onPremisesConfiguration) {
            this.onPremisesConfiguration = onPremisesConfiguration;
            return this;
        }

        public Builder onPremisesConfiguration(@Nullable OnPremisesConfigurationArgs onPremisesConfiguration) {
            this.onPremisesConfiguration = Input.ofNullable(onPremisesConfiguration);
            return this;
        }

        public Builder outOfDiskReport(@Nullable Input<SqlOutOfDiskReportArgs> outOfDiskReport) {
            this.outOfDiskReport = outOfDiskReport;
            return this;
        }

        public Builder outOfDiskReport(@Nullable SqlOutOfDiskReportArgs outOfDiskReport) {
            this.outOfDiskReport = Input.ofNullable(outOfDiskReport);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder region(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder replicaConfiguration(@Nullable Input<ReplicaConfigurationArgs> replicaConfiguration) {
            this.replicaConfiguration = replicaConfiguration;
            return this;
        }

        public Builder replicaConfiguration(@Nullable ReplicaConfigurationArgs replicaConfiguration) {
            this.replicaConfiguration = Input.ofNullable(replicaConfiguration);
            return this;
        }

        public Builder replicaNames(@Nullable Input<List<String>> replicaNames) {
            this.replicaNames = replicaNames;
            return this;
        }

        public Builder replicaNames(@Nullable List<String> replicaNames) {
            this.replicaNames = Input.ofNullable(replicaNames);
            return this;
        }

        public Builder rootPassword(@Nullable Input<String> rootPassword) {
            this.rootPassword = rootPassword;
            return this;
        }

        public Builder rootPassword(@Nullable String rootPassword) {
            this.rootPassword = Input.ofNullable(rootPassword);
            return this;
        }

        public Builder satisfiesPzs(@Nullable Input<Boolean> satisfiesPzs) {
            this.satisfiesPzs = satisfiesPzs;
            return this;
        }

        public Builder satisfiesPzs(@Nullable Boolean satisfiesPzs) {
            this.satisfiesPzs = Input.ofNullable(satisfiesPzs);
            return this;
        }

        public Builder scheduledMaintenance(@Nullable Input<SqlScheduledMaintenanceArgs> scheduledMaintenance) {
            this.scheduledMaintenance = scheduledMaintenance;
            return this;
        }

        public Builder scheduledMaintenance(@Nullable SqlScheduledMaintenanceArgs scheduledMaintenance) {
            this.scheduledMaintenance = Input.ofNullable(scheduledMaintenance);
            return this;
        }

        public Builder secondaryGceZone(@Nullable Input<String> secondaryGceZone) {
            this.secondaryGceZone = secondaryGceZone;
            return this;
        }

        public Builder secondaryGceZone(@Nullable String secondaryGceZone) {
            this.secondaryGceZone = Input.ofNullable(secondaryGceZone);
            return this;
        }

        public Builder selfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }

        public Builder serverCaCert(@Nullable Input<SslCertArgs> serverCaCert) {
            this.serverCaCert = serverCaCert;
            return this;
        }

        public Builder serverCaCert(@Nullable SslCertArgs serverCaCert) {
            this.serverCaCert = Input.ofNullable(serverCaCert);
            return this;
        }

        public Builder serviceAccountEmailAddress(@Nullable Input<String> serviceAccountEmailAddress) {
            this.serviceAccountEmailAddress = serviceAccountEmailAddress;
            return this;
        }

        public Builder serviceAccountEmailAddress(@Nullable String serviceAccountEmailAddress) {
            this.serviceAccountEmailAddress = Input.ofNullable(serviceAccountEmailAddress);
            return this;
        }

        public Builder settings(@Nullable Input<SettingsArgs> settings) {
            this.settings = settings;
            return this;
        }

        public Builder settings(@Nullable SettingsArgs settings) {
            this.settings = Input.ofNullable(settings);
            return this;
        }

        public Builder state(@Nullable Input<InstanceState> state) {
            this.state = state;
            return this;
        }

        public Builder state(@Nullable InstanceState state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder suspensionReason(@Nullable Input<List<InstanceSuspensionReasonItem>> suspensionReason) {
            this.suspensionReason = suspensionReason;
            return this;
        }

        public Builder suspensionReason(@Nullable List<InstanceSuspensionReasonItem> suspensionReason) {
            this.suspensionReason = Input.ofNullable(suspensionReason);
            return this;
        }
        public InstanceArgs build() {
            return new InstanceArgs(backendType, connectionName, currentDiskSize, databaseVersion, diskEncryptionConfiguration, diskEncryptionStatus, failoverReplica, gceZone, instanceType, ipAddresses, kind, masterInstanceName, maxDiskSize, name, onPremisesConfiguration, outOfDiskReport, project, region, replicaConfiguration, replicaNames, rootPassword, satisfiesPzs, scheduledMaintenance, secondaryGceZone, selfLink, serverCaCert, serviceAccountEmailAddress, settings, state, suspensionReason);
        }
    }
}
