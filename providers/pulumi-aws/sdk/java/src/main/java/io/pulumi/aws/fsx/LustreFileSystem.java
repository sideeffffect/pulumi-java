// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.fsx.LustreFileSystemArgs;
import io.pulumi.aws.fsx.inputs.LustreFileSystemState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages a FSx Lustre File System. See the [FSx Lustre Guide](https://docs.aws.amazon.com/fsx/latest/LustreGuide/what-is.html) for more information.
 * 
 * > **NOTE:** `auto_import_policy`, `export_path`, `import_path` and `imported_file_chunk_size` are not supported with the `PERSISTENT_2` deployment type. Use `aws.fsx.DataRepositoryAssociation` instead.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * FSx File Systems can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:fsx/lustreFileSystem:LustreFileSystem example fs-543ab12b1ca672f33
 * ```
 * 
 *  Certain resource arguments, like `security_group_ids`, do not have a FSx API method for reading the information after creation. If the argument is set in the provider configuration on an imported resource, this provider will always show a difference. To workaround this behavior, either omit the argument from the provider configuration or use [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) to hide the difference, e.g. terraform resource "aws_fsx_lustre_file_system" "example" {
 * 
 * # ... other configuration ...
 * 
 *  security_group_ids = [aws_security_group.example.id]
 * 
 * # There is no FSx API for reading security_group_ids
 * 
 *  lifecycle {
 * 
 *  ignore_changes = [security_group_ids]
 * 
 *  } }
 * 
 */
@ResourceType(type="aws:fsx/lustreFileSystem:LustreFileSystem")
public class LustreFileSystem extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name of the file system.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name of the file system.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * How Amazon FSx keeps your file and directory listings up to date as you add or modify objects in your linked S3 bucket. see [Auto Import Data Repo](https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html) for more details. Only supported on `PERSISTENT_1` deployment types.
     * 
     */
    @Export(name="autoImportPolicy", type=String.class, parameters={})
    private Output<String> autoImportPolicy;

    /**
     * @return How Amazon FSx keeps your file and directory listings up to date as you add or modify objects in your linked S3 bucket. see [Auto Import Data Repo](https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html) for more details. Only supported on `PERSISTENT_1` deployment types.
     * 
     */
    public Output<String> autoImportPolicy() {
        return this.autoImportPolicy;
    }
    /**
     * The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days. only valid for `PERSISTENT_1` and `PERSISTENT_2` deployment_type.
     * 
     */
    @Export(name="automaticBackupRetentionDays", type=Integer.class, parameters={})
    private Output<Integer> automaticBackupRetentionDays;

    /**
     * @return The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days. only valid for `PERSISTENT_1` and `PERSISTENT_2` deployment_type.
     * 
     */
    public Output<Integer> automaticBackupRetentionDays() {
        return this.automaticBackupRetentionDays;
    }
    /**
     * The ID of the source backup to create the filesystem from.
     * 
     */
    @Export(name="backupId", type=String.class, parameters={})
    private Output</* @Nullable */ String> backupId;

    /**
     * @return The ID of the source backup to create the filesystem from.
     * 
     */
    public Output</* @Nullable */ String> backupId() {
        return this.backupId;
    }
    /**
     * A boolean flag indicating whether tags for the file system should be copied to backups. Applicable for `PERSISTENT_1` and `PERSISTENT_2` deployment_type. The default value is false.
     * 
     */
    @Export(name="copyTagsToBackups", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> copyTagsToBackups;

    /**
     * @return A boolean flag indicating whether tags for the file system should be copied to backups. Applicable for `PERSISTENT_1` and `PERSISTENT_2` deployment_type. The default value is false.
     * 
     */
    public Output</* @Nullable */ Boolean> copyTagsToBackups() {
        return this.copyTagsToBackups;
    }
    /**
     * A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. only valid for `PERSISTENT_1` and `PERSISTENT_2` deployment_type. Requires `automatic_backup_retention_days` to be set.
     * 
     */
    @Export(name="dailyAutomaticBackupStartTime", type=String.class, parameters={})
    private Output<String> dailyAutomaticBackupStartTime;

    /**
     * @return A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. only valid for `PERSISTENT_1` and `PERSISTENT_2` deployment_type. Requires `automatic_backup_retention_days` to be set.
     * 
     */
    public Output<String> dailyAutomaticBackupStartTime() {
        return this.dailyAutomaticBackupStartTime;
    }
    /**
     * Sets the data compression configuration for the file system. Valid values are `LZ4` and `NONE`. Default value is `NONE`. Unsetting this value reverts the compression type back to `NONE`.
     * 
     */
    @Export(name="dataCompressionType", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataCompressionType;

    /**
     * @return Sets the data compression configuration for the file system. Valid values are `LZ4` and `NONE`. Default value is `NONE`. Unsetting this value reverts the compression type back to `NONE`.
     * 
     */
    public Output</* @Nullable */ String> dataCompressionType() {
        return this.dataCompressionType;
    }
    /**
     * - The filesystem deployment type. One of: `SCRATCH_1`, `SCRATCH_2`, `PERSISTENT_1`, `PERSISTENT_2`.
     * 
     */
    @Export(name="deploymentType", type=String.class, parameters={})
    private Output</* @Nullable */ String> deploymentType;

    /**
     * @return - The filesystem deployment type. One of: `SCRATCH_1`, `SCRATCH_2`, `PERSISTENT_1`, `PERSISTENT_2`.
     * 
     */
    public Output</* @Nullable */ String> deploymentType() {
        return this.deploymentType;
    }
    /**
     * DNS name for the file system, e.g., `fs-12345678.fsx.us-west-2.amazonaws.com`
     * 
     */
    @Export(name="dnsName", type=String.class, parameters={})
    private Output<String> dnsName;

    /**
     * @return DNS name for the file system, e.g., `fs-12345678.fsx.us-west-2.amazonaws.com`
     * 
     */
    public Output<String> dnsName() {
        return this.dnsName;
    }
    /**
     * - The type of drive cache used by `PERSISTENT_1` filesystems that are provisioned with `HDD` storage_type. Required for `HDD` storage_type, set to either `READ` or `NONE`.
     * 
     */
    @Export(name="driveCacheType", type=String.class, parameters={})
    private Output</* @Nullable */ String> driveCacheType;

    /**
     * @return - The type of drive cache used by `PERSISTENT_1` filesystems that are provisioned with `HDD` storage_type. Required for `HDD` storage_type, set to either `READ` or `NONE`.
     * 
     */
    public Output</* @Nullable */ String> driveCacheType() {
        return this.driveCacheType;
    }
    /**
     * S3 URI (with optional prefix) where the root of your Amazon FSx file system is exported. Can only be specified with `import_path` argument and the path must use the same Amazon S3 bucket as specified in `import_path`. Set equal to `import_path` to overwrite files on export. Defaults to `s3://{IMPORT BUCKET}/FSxLustre{CREATION TIMESTAMP}`. Only supported on `PERSISTENT_1` deployment types.
     * 
     */
    @Export(name="exportPath", type=String.class, parameters={})
    private Output<String> exportPath;

    /**
     * @return S3 URI (with optional prefix) where the root of your Amazon FSx file system is exported. Can only be specified with `import_path` argument and the path must use the same Amazon S3 bucket as specified in `import_path`. Set equal to `import_path` to overwrite files on export. Defaults to `s3://{IMPORT BUCKET}/FSxLustre{CREATION TIMESTAMP}`. Only supported on `PERSISTENT_1` deployment types.
     * 
     */
    public Output<String> exportPath() {
        return this.exportPath;
    }
    /**
     * Sets the Lustre version for the file system that you're creating. Valid values are 2.10 for `SCRATCH_1`, `SCRATCH_2` and `PERSISTENT_1` deployment types. Valid values for 2.12 include all deployment types.
     * 
     */
    @Export(name="fileSystemTypeVersion", type=String.class, parameters={})
    private Output<String> fileSystemTypeVersion;

    /**
     * @return Sets the Lustre version for the file system that you're creating. Valid values are 2.10 for `SCRATCH_1`, `SCRATCH_2` and `PERSISTENT_1` deployment types. Valid values for 2.12 include all deployment types.
     * 
     */
    public Output<String> fileSystemTypeVersion() {
        return this.fileSystemTypeVersion;
    }
    /**
     * S3 URI (with optional prefix) that you're using as the data repository for your FSx for Lustre file system. For example, `s3://example-bucket/optional-prefix/`. Only supported on `PERSISTENT_1` deployment types.
     * 
     */
    @Export(name="importPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> importPath;

    /**
     * @return S3 URI (with optional prefix) that you're using as the data repository for your FSx for Lustre file system. For example, `s3://example-bucket/optional-prefix/`. Only supported on `PERSISTENT_1` deployment types.
     * 
     */
    public Output</* @Nullable */ String> importPath() {
        return this.importPath;
    }
    /**
     * For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. Can only be specified with `import_path` argument. Defaults to `1024`. Minimum of `1` and maximum of `512000`. Only supported on `PERSISTENT_1` deployment types.
     * 
     */
    @Export(name="importedFileChunkSize", type=Integer.class, parameters={})
    private Output<Integer> importedFileChunkSize;

    /**
     * @return For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. Can only be specified with `import_path` argument. Defaults to `1024`. Minimum of `1` and maximum of `512000`. Only supported on `PERSISTENT_1` deployment types.
     * 
     */
    public Output<Integer> importedFileChunkSize() {
        return this.importedFileChunkSize;
    }
    /**
     * ARN for the KMS Key to encrypt the file system at rest, applicable for `PERSISTENT_1` and `PERSISTENT_2` deployment_type. Defaults to an AWS managed KMS Key.
     * 
     */
    @Export(name="kmsKeyId", type=String.class, parameters={})
    private Output<String> kmsKeyId;

    /**
     * @return ARN for the KMS Key to encrypt the file system at rest, applicable for `PERSISTENT_1` and `PERSISTENT_2` deployment_type. Defaults to an AWS managed KMS Key.
     * 
     */
    public Output<String> kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * The value to be used when mounting the filesystem.
     * 
     */
    @Export(name="mountName", type=String.class, parameters={})
    private Output<String> mountName;

    /**
     * @return The value to be used when mounting the filesystem.
     * 
     */
    public Output<String> mountName() {
        return this.mountName;
    }
    /**
     * Set of Elastic Network Interface identifiers from which the file system is accessible. As explained in the [documentation](https://docs.aws.amazon.com/fsx/latest/LustreGuide/mounting-on-premises.html), the first network interface returned is the primary network interface.
     * 
     */
    @Export(name="networkInterfaceIds", type=List.class, parameters={String.class})
    private Output<List<String>> networkInterfaceIds;

    /**
     * @return Set of Elastic Network Interface identifiers from which the file system is accessible. As explained in the [documentation](https://docs.aws.amazon.com/fsx/latest/LustreGuide/mounting-on-premises.html), the first network interface returned is the primary network interface.
     * 
     */
    public Output<List<String>> networkInterfaceIds() {
        return this.networkInterfaceIds;
    }
    /**
     * AWS account identifier that created the file system.
     * 
     */
    @Export(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return AWS account identifier that created the file system.
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * - Describes the amount of read and write throughput for each 1 tebibyte of storage, in MB/s/TiB, required for the `PERSISTENT_1` and `PERSISTENT_2` deployment_type. Valid values for `PERSISTENT_1` deployment_type and `SSD` storage_type are 50, 100, 200. Valid values for `PERSISTENT_1` deployment_type and `HDD` storage_type are 12, 40. Valid values for `PERSISTENT_2` deployment_type and `  SSD ` storage_type are 125, 250, 500, 1000.
     * 
     */
    @Export(name="perUnitStorageThroughput", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> perUnitStorageThroughput;

    /**
     * @return - Describes the amount of read and write throughput for each 1 tebibyte of storage, in MB/s/TiB, required for the `PERSISTENT_1` and `PERSISTENT_2` deployment_type. Valid values for `PERSISTENT_1` deployment_type and `SSD` storage_type are 50, 100, 200. Valid values for `PERSISTENT_1` deployment_type and `HDD` storage_type are 12, 40. Valid values for `PERSISTENT_2` deployment_type and `  SSD ` storage_type are 125, 250, 500, 1000.
     * 
     */
    public Output</* @Nullable */ Integer> perUnitStorageThroughput() {
        return this.perUnitStorageThroughput;
    }
    /**
     * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
     * 
     */
    @Export(name="securityGroupIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> securityGroupIds;

    /**
     * @return A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
     * 
     */
    public Output</* @Nullable */ List<String>> securityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * The storage capacity (GiB) of the file system. Minimum of `1200`. See more details at [Allowed values for Fsx storage capacity](https://docs.aws.amazon.com/fsx/latest/APIReference/API_CreateFileSystem.html#FSx-CreateFileSystem-request-StorageCapacity). Update is allowed only for `SCRATCH_2`, `PERSISTENT_1` and `PERSISTENT_2` deployment types, See more details at [Fsx Storage Capacity Update](https://docs.aws.amazon.com/fsx/latest/APIReference/API_UpdateFileSystem.html#FSx-UpdateFileSystem-request-StorageCapacity). Required when not creating filesystem for a backup.
     * 
     */
    @Export(name="storageCapacity", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> storageCapacity;

    /**
     * @return The storage capacity (GiB) of the file system. Minimum of `1200`. See more details at [Allowed values for Fsx storage capacity](https://docs.aws.amazon.com/fsx/latest/APIReference/API_CreateFileSystem.html#FSx-CreateFileSystem-request-StorageCapacity). Update is allowed only for `SCRATCH_2`, `PERSISTENT_1` and `PERSISTENT_2` deployment types, See more details at [Fsx Storage Capacity Update](https://docs.aws.amazon.com/fsx/latest/APIReference/API_UpdateFileSystem.html#FSx-UpdateFileSystem-request-StorageCapacity). Required when not creating filesystem for a backup.
     * 
     */
    public Output</* @Nullable */ Integer> storageCapacity() {
        return this.storageCapacity;
    }
    /**
     * - The filesystem storage type. Either `SSD` or `HDD`, defaults to `SSD`. `HDD` is only supported on `PERSISTENT_1` deployment types.
     * 
     */
    @Export(name="storageType", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageType;

    /**
     * @return - The filesystem storage type. Either `SSD` or `HDD`, defaults to `SSD`. `HDD` is only supported on `PERSISTENT_1` deployment types.
     * 
     */
    public Output</* @Nullable */ String> storageType() {
        return this.storageType;
    }
    /**
     * A list of IDs for the subnets that the file system will be accessible from. File systems currently support only one subnet. The file server is also launched in that subnet's Availability Zone.
     * 
     */
    @Export(name="subnetIds", type=String.class, parameters={})
    private Output<String> subnetIds;

    /**
     * @return A list of IDs for the subnets that the file system will be accessible from. File systems currently support only one subnet. The file server is also launched in that subnet's Availability Zone.
     * 
     */
    public Output<String> subnetIds() {
        return this.subnetIds;
    }
    /**
     * A map of tags to assign to the file system. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the file system. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Identifier of the Virtual Private Cloud for the file system.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return Identifier of the Virtual Private Cloud for the file system.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }
    /**
     * The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
     * 
     */
    @Export(name="weeklyMaintenanceStartTime", type=String.class, parameters={})
    private Output<String> weeklyMaintenanceStartTime;

    /**
     * @return The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
     * 
     */
    public Output<String> weeklyMaintenanceStartTime() {
        return this.weeklyMaintenanceStartTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LustreFileSystem(String name) {
        this(name, LustreFileSystemArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LustreFileSystem(String name, LustreFileSystemArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LustreFileSystem(String name, LustreFileSystemArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:fsx/lustreFileSystem:LustreFileSystem", name, args == null ? LustreFileSystemArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LustreFileSystem(String name, Output<String> id, @Nullable LustreFileSystemState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:fsx/lustreFileSystem:LustreFileSystem", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LustreFileSystem get(String name, Output<String> id, @Nullable LustreFileSystemState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LustreFileSystem(name, id, state, options);
    }
}
