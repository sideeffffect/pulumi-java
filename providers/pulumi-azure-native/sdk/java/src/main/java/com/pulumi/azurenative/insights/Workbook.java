// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.insights.WorkbookArgs;
import com.pulumi.azurenative.insights.outputs.WorkbookManagedIdentityResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An Application Insights workbook definition.
 * API Version: 2020-10-20.
 * 
 * ## Example Usage
 * ### WorkbookAdd
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var workbook = new Workbook(&#34;workbook&#34;, WorkbookArgs.builder()        
 *             .category(&#34;workbook&#34;)
 *             .displayName(&#34;tttt&#34;)
 *             .id(&#34;c0deea5e-3344-40f2-96f8-6f8e1c3b5722&#34;)
 *             .kind(&#34;shared&#34;)
 *             .location(&#34;west us&#34;)
 *             .name(&#34;Blah Blah Blah&#34;)
 *             .resourceGroupName(&#34;my-resource-group&#34;)
 *             .resourceName(&#34;deadb33f-8bee-4d3b-a059-9be8dac93960&#34;)
 *             .serializedData(&#34;{\&#34;version\&#34;:\&#34;Notebook/1.0\&#34;,\&#34;items\&#34;:[{\&#34;type\&#34;:1,\&#34;content\&#34;:\&#34;{\&#34;json\&#34;:\&#34;## New workbook\\r\\n---\\r\\n\\r\\nWelcome to your new workbook.  This area will display text formatted as markdown.\\r\\n\\r\\n\\r\\nWe&#39;ve included a basic analytics query to get you started. Use the `Edit` button below each section to configure it or add more sections.\&#34;}\&#34;,\&#34;halfWidth\&#34;:null,\&#34;conditionalVisibility\&#34;:null},{\&#34;type\&#34;:3,\&#34;content\&#34;:\&#34;{\&#34;version\&#34;:\&#34;KqlItem/1.0\&#34;,\&#34;query\&#34;:\&#34;union withsource=TableName *\\n| summarize Count=count() by TableName\\n| render barchart\&#34;,\&#34;showQuery\&#34;:false,\&#34;size\&#34;:1,\&#34;aggregation\&#34;:0,\&#34;showAnnotations\&#34;:false}\&#34;,\&#34;halfWidth\&#34;:null,\&#34;conditionalVisibility\&#34;:null}],\&#34;isLocked\&#34;:false}&#34;)
 *             .sourceId(&#34;/subscriptions/00000000-0000-0000-0000-00000000/resourcegroups/MyGroup&#34;)
 *             .tags(            
 *                 &#34;TagSample01&#34;,
 *                 &#34;TagSample02&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### WorkbookManagedAdd
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var workbook = new Workbook(&#34;workbook&#34;, WorkbookArgs.builder()        
 *             .category(&#34;workbook&#34;)
 *             .displayName(&#34;tttt&#34;)
 *             .id(&#34;/subscriptions/00000000-0000-0000-0000-00000000/resourcegroups/MyGroup/providers/Microsoft.Insights/workbooks/e378d137-1243-4256-b5c4-ad2a937cae79&#34;)
 *             .identity(Map.of(&#34;type&#34;, &#34;UserAssigned&#34;))
 *             .kind(&#34;shared&#34;)
 *             .location(&#34;westus&#34;)
 *             .name(&#34;e378d137-1243-4256-b5c4-ad2a937cae79&#34;)
 *             .resourceGroupName(&#34;my-resource-group&#34;)
 *             .resourceName(&#34;deadb33f-5e0d-4064-8ebb-1a4ed0313eb2&#34;)
 *             .serializedData(&#34;{\&#34;version\&#34;:\&#34;Notebook/1.0\&#34;,\&#34;items\&#34;:[{\&#34;type\&#34;:1,\&#34;content\&#34;:{\&#34;json\&#34;:\&#34;test\&#34;},\&#34;name\&#34;:\&#34;text - 0\&#34;}],\&#34;isLocked\&#34;:false,\&#34;fallbackResourceIds\&#34;:[\&#34;/subscriptions/00000000-0000-0000-0000-00000000/resourceGroups/MyGroup\&#34;]}&#34;)
 *             .sourceId(&#34;/subscriptions/00000000-0000-0000-0000-00000000/resourcegroups/MyGroup&#34;)
 *             .storageUri(&#34;/subscriptions/00000000-0000-0000-0000-00000000/resourceGroups/MyGroup/providers/Microsoft.Storage/storageAccounts/testStorage/blobServices/default/containers/testContainer&#34;)
 *             .tags(Map.of(&#34;hidden-title&#34;, &#34;tttt&#34;))
 *             .version(&#34;Notebook/1.0&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:insights:Workbook e378d137-1243-4256-b5c4-ad2a937cae79 /subscriptions/00000000-0000-0000-0000-00000000/resourcegroups/MyGroup/providers/Microsoft.Insights/workbooks/72377f0c-b7e7-4044-a882-471bcbd9696e 
 * ```
 * 
 */
@ResourceType(type="azure-native:insights:Workbook")
public class Workbook extends com.pulumi.resources.CustomResource {
    /**
     * Workbook category, as defined by the user at creation time.
     * 
     */
    @Export(name="category", type=String.class, parameters={})
    private Output<String> category;

    /**
     * @return Workbook category, as defined by the user at creation time.
     * 
     */
    public Output<String> category() {
        return this.category;
    }
    /**
     * The user-defined name (display name) of the workbook.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The user-defined name (display name) of the workbook.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Resource etag
     * 
     */
    @Export(name="etag", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> etag;

    /**
     * @return Resource etag
     * 
     */
    public Output<Optional<Map<String,String>>> etag() {
        return Codegen.optional(this.etag);
    }
    /**
     * Identity used for BYOS
     * 
     */
    @Export(name="identity", type=WorkbookManagedIdentityResponse.class, parameters={})
    private Output</* @Nullable */ WorkbookManagedIdentityResponse> identity;

    /**
     * @return Identity used for BYOS
     * 
     */
    public Output<Optional<WorkbookManagedIdentityResponse>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The kind of workbook. Choices are user and shared.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return The kind of workbook. Choices are user and shared.
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Azure resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    /**
     * Configuration of this particular workbook. Configuration data is a string containing valid JSON
     * 
     */
    @Export(name="serializedData", type=String.class, parameters={})
    private Output<String> serializedData;

    /**
     * @return Configuration of this particular workbook. Configuration data is a string containing valid JSON
     * 
     */
    public Output<String> serializedData() {
        return this.serializedData;
    }
    /**
     * ResourceId for a source resource.
     * 
     */
    @Export(name="sourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceId;

    /**
     * @return ResourceId for a source resource.
     * 
     */
    public Output<Optional<String>> sourceId() {
        return Codegen.optional(this.sourceId);
    }
    /**
     * BYOS Storage Account URI
     * 
     */
    @Export(name="storageUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageUri;

    /**
     * @return BYOS Storage Account URI
     * 
     */
    public Output<Optional<String>> storageUri() {
        return Codegen.optional(this.storageUri);
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Date and time in UTC of the last modification that was made to this workbook definition.
     * 
     */
    @Export(name="timeModified", type=String.class, parameters={})
    private Output<String> timeModified;

    /**
     * @return Date and time in UTC of the last modification that was made to this workbook definition.
     * 
     */
    public Output<String> timeModified() {
        return this.timeModified;
    }
    /**
     * Azure resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    /**
     * Unique user id of the specific user that owns this workbook.
     * 
     */
    @Export(name="userId", type=String.class, parameters={})
    private Output<String> userId;

    /**
     * @return Unique user id of the specific user that owns this workbook.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }
    /**
     * Workbook version
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    /**
     * @return Workbook version
     * 
     */
    public Output<Optional<String>> version() {
        return Codegen.optional(this.version);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Workbook(String name) {
        this(name, WorkbookArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Workbook(String name, WorkbookArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Workbook(String name, WorkbookArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:Workbook", name, args == null ? WorkbookArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Workbook(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:Workbook", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:insights/v20150501:Workbook").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20180617preview:Workbook").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20201020:Workbook").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20210308:Workbook").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20210801:Workbook").build())
            ))
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
    public static Workbook get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Workbook(name, id, options);
    }
}
