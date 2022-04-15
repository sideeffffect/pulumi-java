// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.RegionDiskArgs;
import io.pulumi.gcp.compute.inputs.RegionDiskState;
import io.pulumi.gcp.compute.outputs.RegionDiskDiskEncryptionKey;
import io.pulumi.gcp.compute.outputs.RegionDiskSourceSnapshotEncryptionKey;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Persistent disks are durable storage devices that function similarly to
 * the physical disks in a desktop or a server. Compute Engine manages the
 * hardware behind these devices to ensure data redundancy and optimize
 * performance for you. Persistent disks are available as either standard
 * hard disk drives (HDD) or solid-state drives (SSD).
 * 
 * Persistent disks are located independently from your virtual machine
 * instances, so you can detach or move persistent disks to keep your data
 * even after you delete your instances. Persistent disk performance scales
 * automatically with size, so you can resize your existing persistent disks
 * or add more persistent disks to an instance to meet your performance and
 * storage space requirements.
 * 
 * Add a persistent disk to your instance when you need reliable and
 * affordable storage with consistent performance characteristics.
 * 
 * To get more information about RegionDisk, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/regionDisks)
 * * How-to Guides
 *     * [Adding or Resizing Regional Persistent Disks](https://cloud.google.com/compute/docs/disks/regional-persistent-disk)
 * 
 * > **Warning:** All arguments including `disk_encryption_key.raw_key` will be stored in the raw
 * state as plain-text. [Read more about secrets in state](https://www.pulumi.com/docs/intro/concepts/programming-model/#secrets).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * RegionDisk can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionDisk:RegionDisk default projects/{{project}}/regions/{{region}}/disks/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionDisk:RegionDisk default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionDisk:RegionDisk default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionDisk:RegionDisk default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/regionDisk:RegionDisk")
public class RegionDisk extends io.pulumi.resources.CustomResource {
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * Encrypts the disk using a customer-supplied encryption key.
     * After you encrypt a disk with a customer-supplied key, you must
     * provide the same key if you use the disk later (e.g. to create a disk
     * snapshot or an image, or to attach the disk to a virtual machine).
     * Customer-supplied encryption keys do not protect access to metadata of
     * the disk.
     * If you do not provide an encryption key when creating the disk, then
     * the disk will be encrypted using an automatically generated key and
     * you do not need to provide a key to use the disk later.
     * Structure is documented below.
     * 
     */
    @Export(name="diskEncryptionKey", type=RegionDiskDiskEncryptionKey.class, parameters={})
    private Output</* @Nullable */ RegionDiskDiskEncryptionKey> diskEncryptionKey;

    /**
     * @return Encrypts the disk using a customer-supplied encryption key.
     * After you encrypt a disk with a customer-supplied key, you must
     * provide the same key if you use the disk later (e.g. to create a disk
     * snapshot or an image, or to attach the disk to a virtual machine).
     * Customer-supplied encryption keys do not protect access to metadata of
     * the disk.
     * If you do not provide an encryption key when creating the disk, then
     * the disk will be encrypted using an automatically generated key and
     * you do not need to provide a key to use the disk later.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ RegionDiskDiskEncryptionKey> diskEncryptionKey() {
        return this.diskEncryptionKey;
    }
    /**
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI.
     * 
     * @Deprecated
     * This field is no longer in use, disk interfaces will be automatically determined on attachment. To resolve this issue, remove this field from your config.
     * 
     */
    @Deprecated /* This field is no longer in use, disk interfaces will be automatically determined on attachment. To resolve this issue, remove this field from your config. */
    @Export(name="interface", type=String.class, parameters={})
    private Output</* @Nullable */ String> interface_;

    /**
     * @return Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI.
     * 
     */
    public Output</* @Nullable */ String> interface_() {
        return this.interface_;
    }
    /**
     * The fingerprint used for optimistic locking of this resource. Used internally during updates.
     * 
     */
    @Export(name="labelFingerprint", type=String.class, parameters={})
    private Output<String> labelFingerprint;

    /**
     * @return The fingerprint used for optimistic locking of this resource. Used internally during updates.
     * 
     */
    public Output<String> labelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * Labels to apply to this disk.  A list of key->value pairs.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Labels to apply to this disk.  A list of key->value pairs.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Last attach timestamp in RFC3339 text format.
     * 
     */
    @Export(name="lastAttachTimestamp", type=String.class, parameters={})
    private Output<String> lastAttachTimestamp;

    /**
     * @return Last attach timestamp in RFC3339 text format.
     * 
     */
    public Output<String> lastAttachTimestamp() {
        return this.lastAttachTimestamp;
    }
    /**
     * Last detach timestamp in RFC3339 text format.
     * 
     */
    @Export(name="lastDetachTimestamp", type=String.class, parameters={})
    private Output<String> lastDetachTimestamp;

    /**
     * @return Last detach timestamp in RFC3339 text format.
     * 
     */
    public Output<String> lastDetachTimestamp() {
        return this.lastDetachTimestamp;
    }
    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Physical block size of the persistent disk, in bytes. If not present
     * in a request, a default value is used. Currently supported sizes
     * are 4096 and 16384, other sizes may be added in the future.
     * If an unsupported value is requested, the error message will list
     * the supported values for the caller's project.
     * 
     */
    @Export(name="physicalBlockSizeBytes", type=Integer.class, parameters={})
    private Output<Integer> physicalBlockSizeBytes;

    /**
     * @return Physical block size of the persistent disk, in bytes. If not present
     * in a request, a default value is used. Currently supported sizes
     * are 4096 and 16384, other sizes may be added in the future.
     * If an unsupported value is requested, the error message will list
     * the supported values for the caller's project.
     * 
     */
    public Output<Integer> physicalBlockSizeBytes() {
        return this.physicalBlockSizeBytes;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * A reference to the region where the disk resides.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return A reference to the region where the disk resides.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * URLs of the zones where the disk should be replicated to.
     * 
     */
    @Export(name="replicaZones", type=List.class, parameters={String.class})
    private Output<List<String>> replicaZones;

    /**
     * @return URLs of the zones where the disk should be replicated to.
     * 
     */
    public Output<List<String>> replicaZones() {
        return this.replicaZones;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * Size of the persistent disk, specified in GB. You can specify this
     * field when creating a persistent disk using the sourceImage or
     * sourceSnapshot parameter, or specify it alone to create an empty
     * persistent disk.
     * If you specify this field along with sourceImage or sourceSnapshot,
     * the value of sizeGb must not be less than the size of the sourceImage
     * or the size of the snapshot.
     * 
     */
    @Export(name="size", type=Integer.class, parameters={})
    private Output<Integer> size;

    /**
     * @return Size of the persistent disk, specified in GB. You can specify this
     * field when creating a persistent disk using the sourceImage or
     * sourceSnapshot parameter, or specify it alone to create an empty
     * persistent disk.
     * If you specify this field along with sourceImage or sourceSnapshot,
     * the value of sizeGb must not be less than the size of the sourceImage
     * or the size of the snapshot.
     * 
     */
    public Output<Integer> size() {
        return this.size;
    }
    /**
     * The source snapshot used to create this disk. You can provide this as
     * a partial or full URL to the resource. For example, the following are
     * valid values:
     * * `https://www.googleapis.com/compute/v1/projects/project/global/snapshots/snapshot`
     * * `projects/project/global/snapshots/snapshot`
     * * `global/snapshots/snapshot`
     * * `snapshot`
     * 
     */
    @Export(name="snapshot", type=String.class, parameters={})
    private Output</* @Nullable */ String> snapshot;

    /**
     * @return The source snapshot used to create this disk. You can provide this as
     * a partial or full URL to the resource. For example, the following are
     * valid values:
     * * `https://www.googleapis.com/compute/v1/projects/project/global/snapshots/snapshot`
     * * `projects/project/global/snapshots/snapshot`
     * * `global/snapshots/snapshot`
     * * `snapshot`
     * 
     */
    public Output</* @Nullable */ String> snapshot() {
        return this.snapshot;
    }
    /**
     * The customer-supplied encryption key of the source snapshot. Required
     * if the source snapshot is protected by a customer-supplied encryption
     * key.
     * Structure is documented below.
     * 
     */
    @Export(name="sourceSnapshotEncryptionKey", type=RegionDiskSourceSnapshotEncryptionKey.class, parameters={})
    private Output</* @Nullable */ RegionDiskSourceSnapshotEncryptionKey> sourceSnapshotEncryptionKey;

    /**
     * @return The customer-supplied encryption key of the source snapshot. Required
     * if the source snapshot is protected by a customer-supplied encryption
     * key.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ RegionDiskSourceSnapshotEncryptionKey> sourceSnapshotEncryptionKey() {
        return this.sourceSnapshotEncryptionKey;
    }
    /**
     * The unique ID of the snapshot used to create this disk. This value identifies the exact snapshot that was used to create
     * this persistent disk. For example, if you created the persistent disk from a snapshot that was later deleted and
     * recreated under the same name, the source snapshot ID would identify the exact version of the snapshot that was used.
     * 
     */
    @Export(name="sourceSnapshotId", type=String.class, parameters={})
    private Output<String> sourceSnapshotId;

    /**
     * @return The unique ID of the snapshot used to create this disk. This value identifies the exact snapshot that was used to create
     * this persistent disk. For example, if you created the persistent disk from a snapshot that was later deleted and
     * recreated under the same name, the source snapshot ID would identify the exact version of the snapshot that was used.
     * 
     */
    public Output<String> sourceSnapshotId() {
        return this.sourceSnapshotId;
    }
    /**
     * URL of the disk type resource describing which disk type to use to
     * create the disk. Provide this when creating the disk.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return URL of the disk type resource describing which disk type to use to
     * create the disk. Provide this when creating the disk.
     * 
     */
    public Output</* @Nullable */ String> type() {
        return this.type;
    }
    /**
     * Links to the users of the disk (attached instances) in form: project/zones/zone/instances/instance
     * 
     */
    @Export(name="users", type=List.class, parameters={String.class})
    private Output<List<String>> users;

    /**
     * @return Links to the users of the disk (attached instances) in form: project/zones/zone/instances/instance
     * 
     */
    public Output<List<String>> users() {
        return this.users;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionDisk(String name) {
        this(name, RegionDiskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionDisk(String name, RegionDiskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionDisk(String name, RegionDiskArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionDisk:RegionDisk", name, args == null ? RegionDiskArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegionDisk(String name, Output<String> id, @Nullable RegionDiskState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionDisk:RegionDisk", name, state, makeResourceOptions(options, id));
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
    public static RegionDisk get(String name, Output<String> id, @Nullable RegionDiskState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegionDisk(name, id, state, options);
    }
}
