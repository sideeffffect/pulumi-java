// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.neptune;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterInstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterInstanceArgs Empty = new ClusterInstanceArgs();

    /**
     * Specifies whether any instance modifications
     * are applied immediately, or during the next maintenance window. Default is`false`.
     * 
     */
    @InputImport(name="applyImmediately")
      private final @Nullable Input<Boolean> applyImmediately;

    public Input<Boolean> getApplyImmediately() {
        return this.applyImmediately == null ? Input.empty() : this.applyImmediately;
    }

    /**
     * Indicates that minor engine upgrades will be applied automatically to the instance during the maintenance window. Default is `true`.
     * 
     */
    @InputImport(name="autoMinorVersionUpgrade")
      private final @Nullable Input<Boolean> autoMinorVersionUpgrade;

    public Input<Boolean> getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade == null ? Input.empty() : this.autoMinorVersionUpgrade;
    }

    /**
     * The EC2 Availability Zone that the neptune instance is created in.
     * 
     */
    @InputImport(name="availabilityZone")
      private final @Nullable Input<String> availabilityZone;

    public Input<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Input.empty() : this.availabilityZone;
    }

    /**
     * The identifier of the `aws.neptune.Cluster` in which to launch this instance.
     * 
     */
    @InputImport(name="clusterIdentifier", required=true)
      private final Input<String> clusterIdentifier;

    public Input<String> getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * The name of the database engine to be used for the neptune instance. Defaults to `neptune`. Valid Values: `neptune`.
     * 
     */
    @InputImport(name="engine")
      private final @Nullable Input<String> engine;

    public Input<String> getEngine() {
        return this.engine == null ? Input.empty() : this.engine;
    }

    /**
     * The neptune engine version.
     * 
     */
    @InputImport(name="engineVersion")
      private final @Nullable Input<String> engineVersion;

    public Input<String> getEngineVersion() {
        return this.engineVersion == null ? Input.empty() : this.engineVersion;
    }

    /**
     * The identifier for the neptune instance, if omitted, this provider will assign a random, unique identifier.
     * 
     */
    @InputImport(name="identifier")
      private final @Nullable Input<String> identifier;

    public Input<String> getIdentifier() {
        return this.identifier == null ? Input.empty() : this.identifier;
    }

    /**
     * Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
     * 
     */
    @InputImport(name="identifierPrefix")
      private final @Nullable Input<String> identifierPrefix;

    public Input<String> getIdentifierPrefix() {
        return this.identifierPrefix == null ? Input.empty() : this.identifierPrefix;
    }

    /**
     * The instance class to use.
     * 
     */
    @InputImport(name="instanceClass", required=true)
      private final Input<String> instanceClass;

    public Input<String> getInstanceClass() {
        return this.instanceClass;
    }

    /**
     * The name of the neptune parameter group to associate with this instance.
     * 
     */
    @InputImport(name="neptuneParameterGroupName")
      private final @Nullable Input<String> neptuneParameterGroupName;

    public Input<String> getNeptuneParameterGroupName() {
        return this.neptuneParameterGroupName == null ? Input.empty() : this.neptuneParameterGroupName;
    }

    /**
     * A subnet group to associate with this neptune instance. **NOTE:** This must match the `neptune_subnet_group_name` of the attached `aws.neptune.Cluster`.
     * 
     */
    @InputImport(name="neptuneSubnetGroupName")
      private final @Nullable Input<String> neptuneSubnetGroupName;

    public Input<String> getNeptuneSubnetGroupName() {
        return this.neptuneSubnetGroupName == null ? Input.empty() : this.neptuneSubnetGroupName;
    }

    /**
     * The port on which the DB accepts connections. Defaults to `8182`.
     * 
     */
    @InputImport(name="port")
      private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * The daily time range during which automated backups are created if automated backups are enabled. Eg: "04:00-09:00"
     * 
     */
    @InputImport(name="preferredBackupWindow")
      private final @Nullable Input<String> preferredBackupWindow;

    public Input<String> getPreferredBackupWindow() {
        return this.preferredBackupWindow == null ? Input.empty() : this.preferredBackupWindow;
    }

    /**
     * The window to perform maintenance in.
     * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
     * 
     */
    @InputImport(name="preferredMaintenanceWindow")
      private final @Nullable Input<String> preferredMaintenanceWindow;

    public Input<String> getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow == null ? Input.empty() : this.preferredMaintenanceWindow;
    }

    /**
     * Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
     * 
     */
    @InputImport(name="promotionTier")
      private final @Nullable Input<Integer> promotionTier;

    public Input<Integer> getPromotionTier() {
        return this.promotionTier == null ? Input.empty() : this.promotionTier;
    }

    /**
     * Bool to control if instance is publicly accessible. Default is `false`.
     * 
     */
    @InputImport(name="publiclyAccessible")
      private final @Nullable Input<Boolean> publiclyAccessible;

    public Input<Boolean> getPubliclyAccessible() {
        return this.publiclyAccessible == null ? Input.empty() : this.publiclyAccessible;
    }

    /**
     * A map of tags to assign to the instance. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ClusterInstanceArgs(
        @Nullable Input<Boolean> applyImmediately,
        @Nullable Input<Boolean> autoMinorVersionUpgrade,
        @Nullable Input<String> availabilityZone,
        Input<String> clusterIdentifier,
        @Nullable Input<String> engine,
        @Nullable Input<String> engineVersion,
        @Nullable Input<String> identifier,
        @Nullable Input<String> identifierPrefix,
        Input<String> instanceClass,
        @Nullable Input<String> neptuneParameterGroupName,
        @Nullable Input<String> neptuneSubnetGroupName,
        @Nullable Input<Integer> port,
        @Nullable Input<String> preferredBackupWindow,
        @Nullable Input<String> preferredMaintenanceWindow,
        @Nullable Input<Integer> promotionTier,
        @Nullable Input<Boolean> publiclyAccessible,
        @Nullable Input<Map<String,String>> tags) {
        this.applyImmediately = applyImmediately;
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        this.availabilityZone = availabilityZone;
        this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
        this.engine = engine;
        this.engineVersion = engineVersion;
        this.identifier = identifier;
        this.identifierPrefix = identifierPrefix;
        this.instanceClass = Objects.requireNonNull(instanceClass, "expected parameter 'instanceClass' to be non-null");
        this.neptuneParameterGroupName = neptuneParameterGroupName;
        this.neptuneSubnetGroupName = neptuneSubnetGroupName;
        this.port = port;
        this.preferredBackupWindow = preferredBackupWindow;
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        this.promotionTier = promotionTier;
        this.publiclyAccessible = publiclyAccessible;
        this.tags = tags;
    }

    private ClusterInstanceArgs() {
        this.applyImmediately = Input.empty();
        this.autoMinorVersionUpgrade = Input.empty();
        this.availabilityZone = Input.empty();
        this.clusterIdentifier = Input.empty();
        this.engine = Input.empty();
        this.engineVersion = Input.empty();
        this.identifier = Input.empty();
        this.identifierPrefix = Input.empty();
        this.instanceClass = Input.empty();
        this.neptuneParameterGroupName = Input.empty();
        this.neptuneSubnetGroupName = Input.empty();
        this.port = Input.empty();
        this.preferredBackupWindow = Input.empty();
        this.preferredMaintenanceWindow = Input.empty();
        this.promotionTier = Input.empty();
        this.publiclyAccessible = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> applyImmediately;
        private @Nullable Input<Boolean> autoMinorVersionUpgrade;
        private @Nullable Input<String> availabilityZone;
        private Input<String> clusterIdentifier;
        private @Nullable Input<String> engine;
        private @Nullable Input<String> engineVersion;
        private @Nullable Input<String> identifier;
        private @Nullable Input<String> identifierPrefix;
        private Input<String> instanceClass;
        private @Nullable Input<String> neptuneParameterGroupName;
        private @Nullable Input<String> neptuneSubnetGroupName;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> preferredBackupWindow;
        private @Nullable Input<String> preferredMaintenanceWindow;
        private @Nullable Input<Integer> promotionTier;
        private @Nullable Input<Boolean> publiclyAccessible;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applyImmediately = defaults.applyImmediately;
    	      this.autoMinorVersionUpgrade = defaults.autoMinorVersionUpgrade;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.identifier = defaults.identifier;
    	      this.identifierPrefix = defaults.identifierPrefix;
    	      this.instanceClass = defaults.instanceClass;
    	      this.neptuneParameterGroupName = defaults.neptuneParameterGroupName;
    	      this.neptuneSubnetGroupName = defaults.neptuneSubnetGroupName;
    	      this.port = defaults.port;
    	      this.preferredBackupWindow = defaults.preferredBackupWindow;
    	      this.preferredMaintenanceWindow = defaults.preferredMaintenanceWindow;
    	      this.promotionTier = defaults.promotionTier;
    	      this.publiclyAccessible = defaults.publiclyAccessible;
    	      this.tags = defaults.tags;
        }

        public Builder applyImmediately(@Nullable Input<Boolean> applyImmediately) {
            this.applyImmediately = applyImmediately;
            return this;
        }

        public Builder applyImmediately(@Nullable Boolean applyImmediately) {
            this.applyImmediately = Input.ofNullable(applyImmediately);
            return this;
        }

        public Builder autoMinorVersionUpgrade(@Nullable Input<Boolean> autoMinorVersionUpgrade) {
            this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
            return this;
        }

        public Builder autoMinorVersionUpgrade(@Nullable Boolean autoMinorVersionUpgrade) {
            this.autoMinorVersionUpgrade = Input.ofNullable(autoMinorVersionUpgrade);
            return this;
        }

        public Builder availabilityZone(@Nullable Input<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Input.ofNullable(availabilityZone);
            return this;
        }

        public Builder clusterIdentifier(Input<String> clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }

        public Builder clusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Input.of(Objects.requireNonNull(clusterIdentifier));
            return this;
        }

        public Builder engine(@Nullable Input<String> engine) {
            this.engine = engine;
            return this;
        }

        public Builder engine(@Nullable String engine) {
            this.engine = Input.ofNullable(engine);
            return this;
        }

        public Builder engineVersion(@Nullable Input<String> engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        public Builder engineVersion(@Nullable String engineVersion) {
            this.engineVersion = Input.ofNullable(engineVersion);
            return this;
        }

        public Builder identifier(@Nullable Input<String> identifier) {
            this.identifier = identifier;
            return this;
        }

        public Builder identifier(@Nullable String identifier) {
            this.identifier = Input.ofNullable(identifier);
            return this;
        }

        public Builder identifierPrefix(@Nullable Input<String> identifierPrefix) {
            this.identifierPrefix = identifierPrefix;
            return this;
        }

        public Builder identifierPrefix(@Nullable String identifierPrefix) {
            this.identifierPrefix = Input.ofNullable(identifierPrefix);
            return this;
        }

        public Builder instanceClass(Input<String> instanceClass) {
            this.instanceClass = Objects.requireNonNull(instanceClass);
            return this;
        }

        public Builder instanceClass(String instanceClass) {
            this.instanceClass = Input.of(Objects.requireNonNull(instanceClass));
            return this;
        }

        public Builder neptuneParameterGroupName(@Nullable Input<String> neptuneParameterGroupName) {
            this.neptuneParameterGroupName = neptuneParameterGroupName;
            return this;
        }

        public Builder neptuneParameterGroupName(@Nullable String neptuneParameterGroupName) {
            this.neptuneParameterGroupName = Input.ofNullable(neptuneParameterGroupName);
            return this;
        }

        public Builder neptuneSubnetGroupName(@Nullable Input<String> neptuneSubnetGroupName) {
            this.neptuneSubnetGroupName = neptuneSubnetGroupName;
            return this;
        }

        public Builder neptuneSubnetGroupName(@Nullable String neptuneSubnetGroupName) {
            this.neptuneSubnetGroupName = Input.ofNullable(neptuneSubnetGroupName);
            return this;
        }

        public Builder port(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder port(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder preferredBackupWindow(@Nullable Input<String> preferredBackupWindow) {
            this.preferredBackupWindow = preferredBackupWindow;
            return this;
        }

        public Builder preferredBackupWindow(@Nullable String preferredBackupWindow) {
            this.preferredBackupWindow = Input.ofNullable(preferredBackupWindow);
            return this;
        }

        public Builder preferredMaintenanceWindow(@Nullable Input<String> preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = preferredMaintenanceWindow;
            return this;
        }

        public Builder preferredMaintenanceWindow(@Nullable String preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = Input.ofNullable(preferredMaintenanceWindow);
            return this;
        }

        public Builder promotionTier(@Nullable Input<Integer> promotionTier) {
            this.promotionTier = promotionTier;
            return this;
        }

        public Builder promotionTier(@Nullable Integer promotionTier) {
            this.promotionTier = Input.ofNullable(promotionTier);
            return this;
        }

        public Builder publiclyAccessible(@Nullable Input<Boolean> publiclyAccessible) {
            this.publiclyAccessible = publiclyAccessible;
            return this;
        }

        public Builder publiclyAccessible(@Nullable Boolean publiclyAccessible) {
            this.publiclyAccessible = Input.ofNullable(publiclyAccessible);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ClusterInstanceArgs build() {
            return new ClusterInstanceArgs(applyImmediately, autoMinorVersionUpgrade, availabilityZone, clusterIdentifier, engine, engineVersion, identifier, identifierPrefix, instanceClass, neptuneParameterGroupName, neptuneSubnetGroupName, port, preferredBackupWindow, preferredMaintenanceWindow, promotionTier, publiclyAccessible, tags);
        }
    }
}
