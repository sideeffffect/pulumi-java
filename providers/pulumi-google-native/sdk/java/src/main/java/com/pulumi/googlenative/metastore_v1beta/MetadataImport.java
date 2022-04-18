// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore_v1beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.metastore_v1beta.MetadataImportArgs;
import com.pulumi.googlenative.metastore_v1beta.outputs.DatabaseDumpResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new MetadataImport in a given project and location.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:metastore/v1beta:MetadataImport")
public class MetadataImport extends com.pulumi.resources.CustomResource {
    /**
     * The time when the metadata import was started.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time when the metadata import was started.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Immutable. A database dump from a pre-existing metastore's database.
     * 
     */
    @Export(name="databaseDump", type=DatabaseDumpResponse.class, parameters={})
    private Output<DatabaseDumpResponse> databaseDump;

    /**
     * @return Immutable. A database dump from a pre-existing metastore's database.
     * 
     */
    public Output<DatabaseDumpResponse> databaseDump() {
        return this.databaseDump;
    }
    /**
     * The description of the metadata import.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of the metadata import.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The time when the metadata import finished.
     * 
     */
    @Export(name="endTime", type=String.class, parameters={})
    private Output<String> endTime;

    /**
     * @return The time when the metadata import finished.
     * 
     */
    public Output<String> endTime() {
        return this.endTime;
    }
    /**
     * Immutable. The relative resource name of the metadata import, of the form:projects/{project_number}/locations/{location_id}/services/{service_id}/metadataImports/{metadata_import_id}.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Immutable. The relative resource name of the metadata import, of the form:projects/{project_number}/locations/{location_id}/services/{service_id}/metadataImports/{metadata_import_id}.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The current state of the metadata import.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the metadata import.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The time when the metadata import was last updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time when the metadata import was last updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MetadataImport(String name) {
        this(name, MetadataImportArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MetadataImport(String name, MetadataImportArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MetadataImport(String name, MetadataImportArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:metastore/v1beta:MetadataImport", name, args == null ? MetadataImportArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MetadataImport(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:metastore/v1beta:MetadataImport", name, null, makeResourceOptions(options, id));
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
    public static MetadataImport get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MetadataImport(name, id, options);
    }
}
