// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterSnapshotState extends com.pulumi.resources.ResourceArgs {

    public static final ClusterSnapshotState Empty = new ClusterSnapshotState();

    /**
     * Specifies the allocated storage size in gigabytes (GB).
     * 
     */
    @Import(name="allocatedStorage")
    private @Nullable Output<Integer> allocatedStorage;

    public Optional<Output<Integer>> allocatedStorage() {
        return Optional.ofNullable(this.allocatedStorage);
    }

    /**
     * List of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
     * 
     */
    @Import(name="availabilityZones")
    private @Nullable Output<List<String>> availabilityZones;

    public Optional<Output<List<String>>> availabilityZones() {
        return Optional.ofNullable(this.availabilityZones);
    }

    /**
     * The DB Cluster Identifier from which to take the snapshot.
     * 
     */
    @Import(name="dbClusterIdentifier")
    private @Nullable Output<String> dbClusterIdentifier;

    public Optional<Output<String>> dbClusterIdentifier() {
        return Optional.ofNullable(this.dbClusterIdentifier);
    }

    /**
     * The Amazon Resource Name (ARN) for the DB Cluster Snapshot.
     * 
     */
    @Import(name="dbClusterSnapshotArn")
    private @Nullable Output<String> dbClusterSnapshotArn;

    public Optional<Output<String>> dbClusterSnapshotArn() {
        return Optional.ofNullable(this.dbClusterSnapshotArn);
    }

    /**
     * The Identifier for the snapshot.
     * 
     */
    @Import(name="dbClusterSnapshotIdentifier")
    private @Nullable Output<String> dbClusterSnapshotIdentifier;

    public Optional<Output<String>> dbClusterSnapshotIdentifier() {
        return Optional.ofNullable(this.dbClusterSnapshotIdentifier);
    }

    /**
     * Specifies the name of the database engine.
     * 
     */
    @Import(name="engine")
    private @Nullable Output<String> engine;

    public Optional<Output<String>> engine() {
        return Optional.ofNullable(this.engine);
    }

    /**
     * Version of the database engine for this DB cluster snapshot.
     * 
     */
    @Import(name="engineVersion")
    private @Nullable Output<String> engineVersion;

    public Optional<Output<String>> engineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }

    /**
     * If storage_encrypted is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * License model information for the restored DB cluster.
     * 
     */
    @Import(name="licenseModel")
    private @Nullable Output<String> licenseModel;

    public Optional<Output<String>> licenseModel() {
        return Optional.ofNullable(this.licenseModel);
    }

    /**
     * Port that the DB cluster was listening on at the time of the snapshot.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    @Import(name="snapshotType")
    private @Nullable Output<String> snapshotType;

    public Optional<Output<String>> snapshotType() {
        return Optional.ofNullable(this.snapshotType);
    }

    @Import(name="sourceDbClusterSnapshotArn")
    private @Nullable Output<String> sourceDbClusterSnapshotArn;

    public Optional<Output<String>> sourceDbClusterSnapshotArn() {
        return Optional.ofNullable(this.sourceDbClusterSnapshotArn);
    }

    /**
     * The status of this DB Cluster Snapshot.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Specifies whether the DB cluster snapshot is encrypted.
     * 
     */
    @Import(name="storageEncrypted")
    private @Nullable Output<Boolean> storageEncrypted;

    public Optional<Output<Boolean>> storageEncrypted() {
        return Optional.ofNullable(this.storageEncrypted);
    }

    /**
     * A map of tags to assign to the DB cluster. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The VPC ID associated with the DB cluster snapshot.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private ClusterSnapshotState() {}

    private ClusterSnapshotState(ClusterSnapshotState $) {
        this.allocatedStorage = $.allocatedStorage;
        this.availabilityZones = $.availabilityZones;
        this.dbClusterIdentifier = $.dbClusterIdentifier;
        this.dbClusterSnapshotArn = $.dbClusterSnapshotArn;
        this.dbClusterSnapshotIdentifier = $.dbClusterSnapshotIdentifier;
        this.engine = $.engine;
        this.engineVersion = $.engineVersion;
        this.kmsKeyId = $.kmsKeyId;
        this.licenseModel = $.licenseModel;
        this.port = $.port;
        this.snapshotType = $.snapshotType;
        this.sourceDbClusterSnapshotArn = $.sourceDbClusterSnapshotArn;
        this.status = $.status;
        this.storageEncrypted = $.storageEncrypted;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterSnapshotState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterSnapshotState $;

        public Builder() {
            $ = new ClusterSnapshotState();
        }

        public Builder(ClusterSnapshotState defaults) {
            $ = new ClusterSnapshotState(Objects.requireNonNull(defaults));
        }

        public Builder allocatedStorage(@Nullable Output<Integer> allocatedStorage) {
            $.allocatedStorage = allocatedStorage;
            return this;
        }

        public Builder allocatedStorage(Integer allocatedStorage) {
            return allocatedStorage(Output.of(allocatedStorage));
        }

        public Builder availabilityZones(@Nullable Output<List<String>> availabilityZones) {
            $.availabilityZones = availabilityZones;
            return this;
        }

        public Builder availabilityZones(List<String> availabilityZones) {
            return availabilityZones(Output.of(availabilityZones));
        }

        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }

        public Builder dbClusterIdentifier(@Nullable Output<String> dbClusterIdentifier) {
            $.dbClusterIdentifier = dbClusterIdentifier;
            return this;
        }

        public Builder dbClusterIdentifier(String dbClusterIdentifier) {
            return dbClusterIdentifier(Output.of(dbClusterIdentifier));
        }

        public Builder dbClusterSnapshotArn(@Nullable Output<String> dbClusterSnapshotArn) {
            $.dbClusterSnapshotArn = dbClusterSnapshotArn;
            return this;
        }

        public Builder dbClusterSnapshotArn(String dbClusterSnapshotArn) {
            return dbClusterSnapshotArn(Output.of(dbClusterSnapshotArn));
        }

        public Builder dbClusterSnapshotIdentifier(@Nullable Output<String> dbClusterSnapshotIdentifier) {
            $.dbClusterSnapshotIdentifier = dbClusterSnapshotIdentifier;
            return this;
        }

        public Builder dbClusterSnapshotIdentifier(String dbClusterSnapshotIdentifier) {
            return dbClusterSnapshotIdentifier(Output.of(dbClusterSnapshotIdentifier));
        }

        public Builder engine(@Nullable Output<String> engine) {
            $.engine = engine;
            return this;
        }

        public Builder engine(String engine) {
            return engine(Output.of(engine));
        }

        public Builder engineVersion(@Nullable Output<String> engineVersion) {
            $.engineVersion = engineVersion;
            return this;
        }

        public Builder engineVersion(String engineVersion) {
            return engineVersion(Output.of(engineVersion));
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        public Builder licenseModel(@Nullable Output<String> licenseModel) {
            $.licenseModel = licenseModel;
            return this;
        }

        public Builder licenseModel(String licenseModel) {
            return licenseModel(Output.of(licenseModel));
        }

        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder snapshotType(@Nullable Output<String> snapshotType) {
            $.snapshotType = snapshotType;
            return this;
        }

        public Builder snapshotType(String snapshotType) {
            return snapshotType(Output.of(snapshotType));
        }

        public Builder sourceDbClusterSnapshotArn(@Nullable Output<String> sourceDbClusterSnapshotArn) {
            $.sourceDbClusterSnapshotArn = sourceDbClusterSnapshotArn;
            return this;
        }

        public Builder sourceDbClusterSnapshotArn(String sourceDbClusterSnapshotArn) {
            return sourceDbClusterSnapshotArn(Output.of(sourceDbClusterSnapshotArn));
        }

        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public Builder storageEncrypted(@Nullable Output<Boolean> storageEncrypted) {
            $.storageEncrypted = storageEncrypted;
            return this;
        }

        public Builder storageEncrypted(Boolean storageEncrypted) {
            return storageEncrypted(Output.of(storageEncrypted));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public ClusterSnapshotState build() {
            return $;
        }
    }

}
