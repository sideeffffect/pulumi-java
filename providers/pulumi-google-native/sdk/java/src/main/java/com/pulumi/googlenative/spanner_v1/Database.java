// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.spanner_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.spanner_v1.DatabaseArgs;
import com.pulumi.googlenative.spanner_v1.outputs.EncryptionConfigResponse;
import com.pulumi.googlenative.spanner_v1.outputs.EncryptionInfoResponse;
import com.pulumi.googlenative.spanner_v1.outputs.RestoreInfoResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new Cloud Spanner database and starts to prepare it for serving. The returned long-running operation will have a name of the format `/operations/` and can be used to track preparation of the database. The metadata field type is CreateDatabaseMetadata. The response field type is Database, if successful.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:spanner/v1:Database")
public class Database extends com.pulumi.resources.CustomResource {
    /**
     * If exists, the time at which the database creation started.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return If exists, the time at which the database creation started.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The dialect of the Cloud Spanner Database.
     * 
     */
    @Export(name="databaseDialect", type=String.class, parameters={})
    private Output<String> databaseDialect;

    /**
     * @return The dialect of the Cloud Spanner Database.
     * 
     */
    public Output<String> databaseDialect() {
        return this.databaseDialect;
    }
    /**
     * The read-write region which contains the database's leader replicas. This is the same as the value of default_leader database option set using DatabaseAdmin.CreateDatabase or DatabaseAdmin.UpdateDatabaseDdl. If not explicitly set, this is empty.
     * 
     */
    @Export(name="defaultLeader", type=String.class, parameters={})
    private Output<String> defaultLeader;

    /**
     * @return The read-write region which contains the database's leader replicas. This is the same as the value of default_leader database option set using DatabaseAdmin.CreateDatabase or DatabaseAdmin.UpdateDatabaseDdl. If not explicitly set, this is empty.
     * 
     */
    public Output<String> defaultLeader() {
        return this.defaultLeader;
    }
    /**
     * Earliest timestamp at which older versions of the data can be read. This value is continuously updated by Cloud Spanner and becomes stale the moment it is queried. If you are using this value to recover data, make sure to account for the time from the moment when the value is queried to the moment when you initiate the recovery.
     * 
     */
    @Export(name="earliestVersionTime", type=String.class, parameters={})
    private Output<String> earliestVersionTime;

    /**
     * @return Earliest timestamp at which older versions of the data can be read. This value is continuously updated by Cloud Spanner and becomes stale the moment it is queried. If you are using this value to recover data, make sure to account for the time from the moment when the value is queried to the moment when you initiate the recovery.
     * 
     */
    public Output<String> earliestVersionTime() {
        return this.earliestVersionTime;
    }
    /**
     * For databases that are using customer managed encryption, this field contains the encryption configuration for the database. For databases that are using Google default or other types of encryption, this field is empty.
     * 
     */
    @Export(name="encryptionConfig", type=EncryptionConfigResponse.class, parameters={})
    private Output<EncryptionConfigResponse> encryptionConfig;

    /**
     * @return For databases that are using customer managed encryption, this field contains the encryption configuration for the database. For databases that are using Google default or other types of encryption, this field is empty.
     * 
     */
    public Output<EncryptionConfigResponse> encryptionConfig() {
        return this.encryptionConfig;
    }
    /**
     * For databases that are using customer managed encryption, this field contains the encryption information for the database, such as encryption state and the Cloud KMS key versions that are in use. For databases that are using Google default or other types of encryption, this field is empty. This field is propagated lazily from the backend. There might be a delay from when a key version is being used and when it appears in this field.
     * 
     */
    @Export(name="encryptionInfo", type=List.class, parameters={EncryptionInfoResponse.class})
    private Output<List<EncryptionInfoResponse>> encryptionInfo;

    /**
     * @return For databases that are using customer managed encryption, this field contains the encryption information for the database, such as encryption state and the Cloud KMS key versions that are in use. For databases that are using Google default or other types of encryption, this field is empty. This field is propagated lazily from the backend. There might be a delay from when a key version is being used and when it appears in this field.
     * 
     */
    public Output<List<EncryptionInfoResponse>> encryptionInfo() {
        return this.encryptionInfo;
    }
    /**
     * The name of the database. Values are of the form `projects//instances//databases/`, where `` is as specified in the `CREATE DATABASE` statement. This name can be passed to other API methods to identify the database.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the database. Values are of the form `projects//instances//databases/`, where `` is as specified in the `CREATE DATABASE` statement. This name can be passed to other API methods to identify the database.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Applicable only for restored databases. Contains information about the restore source.
     * 
     */
    @Export(name="restoreInfo", type=RestoreInfoResponse.class, parameters={})
    private Output<RestoreInfoResponse> restoreInfo;

    /**
     * @return Applicable only for restored databases. Contains information about the restore source.
     * 
     */
    public Output<RestoreInfoResponse> restoreInfo() {
        return this.restoreInfo;
    }
    /**
     * The current database state.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current database state.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The period in which Cloud Spanner retains all versions of data for the database. This is the same as the value of version_retention_period database option set using UpdateDatabaseDdl. Defaults to 1 hour, if not set.
     * 
     */
    @Export(name="versionRetentionPeriod", type=String.class, parameters={})
    private Output<String> versionRetentionPeriod;

    /**
     * @return The period in which Cloud Spanner retains all versions of data for the database. This is the same as the value of version_retention_period database option set using UpdateDatabaseDdl. Defaults to 1 hour, if not set.
     * 
     */
    public Output<String> versionRetentionPeriod() {
        return this.versionRetentionPeriod;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Database(String name) {
        this(name, DatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Database(String name, DatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Database(String name, DatabaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:spanner/v1:Database", name, args == null ? DatabaseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Database(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:spanner/v1:Database", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Database get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Database(name, id, options);
    }
}
