// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.datacatalog_v1beta1.EntryGroupArgs;
import com.pulumi.googlenative.datacatalog_v1beta1.outputs.GoogleCloudDatacatalogV1beta1SystemTimestampsResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A maximum of 10,000 entry groups may be created per organization across all locations. Users should enable the Data Catalog API in the project identified by the `parent` parameter (see [Data Catalog Resource Project] (https://cloud.google.com/data-catalog/docs/concepts/resource-project) for more information).
 * 
 */
@ResourceType(type="google-native:datacatalog/v1beta1:EntryGroup")
public class EntryGroup extends com.pulumi.resources.CustomResource {
    /**
     * Timestamps about this EntryGroup. Default value is empty timestamps.
     * 
     */
    @Export(name="dataCatalogTimestamps", type=GoogleCloudDatacatalogV1beta1SystemTimestampsResponse.class, parameters={})
    private Output<GoogleCloudDatacatalogV1beta1SystemTimestampsResponse> dataCatalogTimestamps;

    /**
     * @return Timestamps about this EntryGroup. Default value is empty timestamps.
     * 
     */
    public Output<GoogleCloudDatacatalogV1beta1SystemTimestampsResponse> dataCatalogTimestamps() {
        return this.dataCatalogTimestamps;
    }
    /**
     * Entry group description, which can consist of several sentences or paragraphs that describe entry group contents. Default value is an empty string.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Entry group description, which can consist of several sentences or paragraphs that describe entry group contents. Default value is an empty string.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * A short name to identify the entry group, for example, "analytics data - jan 2011". Default value is an empty string.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return A short name to identify the entry group, for example, "analytics data - jan 2011". Default value is an empty string.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The resource name of the entry group in URL format. Example: * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id} Note that this EntryGroup and its child resources may not actually be stored in the location in this name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the entry group in URL format. Example: * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id} Note that this EntryGroup and its child resources may not actually be stored in the location in this name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EntryGroup(String name) {
        this(name, EntryGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EntryGroup(String name, EntryGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EntryGroup(String name, EntryGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datacatalog/v1beta1:EntryGroup", name, args == null ? EntryGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EntryGroup(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datacatalog/v1beta1:EntryGroup", name, null, makeResourceOptions(options, id));
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
    public static EntryGroup get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EntryGroup(name, id, options);
    }
}
