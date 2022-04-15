// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.glue.PartitionIndexArgs;
import io.pulumi.aws.glue.inputs.PartitionIndexState;
import io.pulumi.aws.glue.outputs.PartitionIndexPartitionIndex;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ## Import
 * 
 * Glue Partition Indexes can be imported with their catalog ID (usually AWS account ID), database name, table name, and index name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:glue/partitionIndex:PartitionIndex example 123456789012:MyDatabase:MyTable:index-name
 * ```
 * 
 */
@ResourceType(type="aws:glue/partitionIndex:PartitionIndex")
public class PartitionIndex extends io.pulumi.resources.CustomResource {
    /**
     * The catalog ID where the table resides.
     * 
     */
    @Export(name="catalogId", type=String.class, parameters={})
    private Output<String> catalogId;

    /**
     * @return The catalog ID where the table resides.
     * 
     */
    public Output<String> catalogId() {
        return this.catalogId;
    }
    /**
     * Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
     * 
     */
    @Export(name="databaseName", type=String.class, parameters={})
    private Output<String> databaseName;

    /**
     * @return Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }
    /**
     * Configuration block for a partition index. See `partition_index` below.
     * 
     */
    @Export(name="partitionIndex", type=PartitionIndexPartitionIndex.class, parameters={})
    private Output<PartitionIndexPartitionIndex> partitionIndex;

    /**
     * @return Configuration block for a partition index. See `partition_index` below.
     * 
     */
    public Output<PartitionIndexPartitionIndex> partitionIndex() {
        return this.partitionIndex;
    }
    /**
     * Name of the table. For Hive compatibility, this must be entirely lowercase.
     * 
     */
    @Export(name="tableName", type=String.class, parameters={})
    private Output<String> tableName;

    /**
     * @return Name of the table. For Hive compatibility, this must be entirely lowercase.
     * 
     */
    public Output<String> tableName() {
        return this.tableName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PartitionIndex(String name) {
        this(name, PartitionIndexArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PartitionIndex(String name, PartitionIndexArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PartitionIndex(String name, PartitionIndexArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/partitionIndex:PartitionIndex", name, args == null ? PartitionIndexArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PartitionIndex(String name, Output<String> id, @Nullable PartitionIndexState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/partitionIndex:PartitionIndex", name, state, makeResourceOptions(options, id));
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
    public static PartitionIndex get(String name, Output<String> id, @Nullable PartitionIndexState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PartitionIndex(name, id, state, options);
    }
}
