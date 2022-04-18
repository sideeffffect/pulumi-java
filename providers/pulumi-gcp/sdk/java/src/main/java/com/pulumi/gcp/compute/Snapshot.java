// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.SnapshotArgs;
import com.pulumi.gcp.compute.inputs.SnapshotState;
import com.pulumi.gcp.compute.outputs.SnapshotSnapshotEncryptionKey;
import com.pulumi.gcp.compute.outputs.SnapshotSourceDiskEncryptionKey;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Represents a Persistent Disk Snapshot resource.
 * 
 * Use snapshots to back up data from your persistent disks. Snapshots are
 * different from public images and custom images, which are used primarily
 * to create instances or configure instance templates. Snapshots are useful
 * for periodic backup of the data on your persistent disks. You can create
 * snapshots from persistent disks even while they are attached to running
 * instances.
 * 
 * Snapshots are incremental, so you can create regular snapshots on a
 * persistent disk faster and at a much lower cost than if you regularly
 * created a full image of the disk.
 * 
 * To get more information about Snapshot, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/snapshots)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/compute/docs/disks/create-snapshots)
 * 
 * > **Warning:** All arguments including `snapshot_encryption_key.raw_key` and `source_disk_encryption_key.raw_key` will be stored in the raw
 * state as plain-text. [Read more about secrets in state](https://www.pulumi.com/docs/intro/concepts/programming-model/#secrets).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Snapshot can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/snapshot:Snapshot default projects/{{project}}/global/snapshots/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/snapshot:Snapshot default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/snapshot:Snapshot default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/snapshot:Snapshot")
public class Snapshot extends com.pulumi.resources.CustomResource {
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
     * An optional description of this resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * Size of the snapshot, specified in GB.
     * 
     */
    @Export(name="diskSizeGb", type=Integer.class, parameters={})
    private Output<Integer> diskSizeGb;

    /**
     * @return Size of the snapshot, specified in GB.
     * 
     */
    public Output<Integer> diskSizeGb() {
        return this.diskSizeGb;
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
     * Labels to apply to this Snapshot.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Labels to apply to this Snapshot.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * A list of public visible licenses that apply to this snapshot. This can be because the original image had licenses
     * attached (such as a Windows image). snapshotEncryptionKey nested object Encrypts the snapshot using a customer-supplied
     * encryption key.
     * 
     */
    @Export(name="licenses", type=List.class, parameters={String.class})
    private Output<List<String>> licenses;

    /**
     * @return A list of public visible licenses that apply to this snapshot. This can be because the original image had licenses
     * attached (such as a Windows image). snapshotEncryptionKey nested object Encrypts the snapshot using a customer-supplied
     * encryption key.
     * 
     */
    public Output<List<String>> licenses() {
        return this.licenses;
    }
    /**
     * Name of the resource; provided by the client when the resource is
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
     * @return Name of the resource; provided by the client when the resource is
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
     * The customer-supplied encryption key of the snapshot. Required if the
     * source snapshot is protected by a customer-supplied encryption key.
     * Structure is documented below.
     * 
     */
    @Export(name="snapshotEncryptionKey", type=SnapshotSnapshotEncryptionKey.class, parameters={})
    private Output</* @Nullable */ SnapshotSnapshotEncryptionKey> snapshotEncryptionKey;

    /**
     * @return The customer-supplied encryption key of the snapshot. Required if the
     * source snapshot is protected by a customer-supplied encryption key.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ SnapshotSnapshotEncryptionKey> snapshotEncryptionKey() {
        return this.snapshotEncryptionKey;
    }
    /**
     * The unique identifier for the resource.
     * 
     */
    @Export(name="snapshotId", type=Integer.class, parameters={})
    private Output<Integer> snapshotId;

    /**
     * @return The unique identifier for the resource.
     * 
     */
    public Output<Integer> snapshotId() {
        return this.snapshotId;
    }
    /**
     * A reference to the disk used to create this snapshot.
     * 
     */
    @Export(name="sourceDisk", type=String.class, parameters={})
    private Output<String> sourceDisk;

    /**
     * @return A reference to the disk used to create this snapshot.
     * 
     */
    public Output<String> sourceDisk() {
        return this.sourceDisk;
    }
    /**
     * The customer-supplied encryption key of the source snapshot. Required
     * if the source snapshot is protected by a customer-supplied encryption
     * key.
     * Structure is documented below.
     * 
     */
    @Export(name="sourceDiskEncryptionKey", type=SnapshotSourceDiskEncryptionKey.class, parameters={})
    private Output</* @Nullable */ SnapshotSourceDiskEncryptionKey> sourceDiskEncryptionKey;

    /**
     * @return The customer-supplied encryption key of the source snapshot. Required
     * if the source snapshot is protected by a customer-supplied encryption
     * key.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ SnapshotSourceDiskEncryptionKey> sourceDiskEncryptionKey() {
        return this.sourceDiskEncryptionKey;
    }
    /**
     * A size of the storage used by the snapshot. As snapshots share storage, this number is expected to change with snapshot
     * creation/deletion.
     * 
     */
    @Export(name="storageBytes", type=Integer.class, parameters={})
    private Output<Integer> storageBytes;

    /**
     * @return A size of the storage used by the snapshot. As snapshots share storage, this number is expected to change with snapshot
     * creation/deletion.
     * 
     */
    public Output<Integer> storageBytes() {
        return this.storageBytes;
    }
    /**
     * Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
     * 
     */
    @Export(name="storageLocations", type=List.class, parameters={String.class})
    private Output<List<String>> storageLocations;

    /**
     * @return Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
     * 
     */
    public Output<List<String>> storageLocations() {
        return this.storageLocations;
    }
    /**
     * A reference to the zone where the disk is hosted.
     * 
     */
    @Export(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return A reference to the zone where the disk is hosted.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Snapshot(String name) {
        this(name, SnapshotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Snapshot(String name, SnapshotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Snapshot(String name, SnapshotArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/snapshot:Snapshot", name, args == null ? SnapshotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Snapshot(String name, Output<String> id, @Nullable SnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/snapshot:Snapshot", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Snapshot get(String name, Output<String> id, @Nullable SnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Snapshot(name, id, state, options);
    }
}
