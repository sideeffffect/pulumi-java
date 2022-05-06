// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.mobilenetwork;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.mobilenetwork.SliceArgs;
import com.pulumi.azurenative.mobilenetwork.outputs.SnssaiResponse;
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
 * Network slice resource.
 * API Version: 2022-01-01-preview.
 * 
 * ## Example Usage
 * ### Create mobile network slice
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
 *         var slice = new Slice(&#34;slice&#34;, SliceArgs.builder()        
 *             .description(&#34;myFavouriteSlice&#34;)
 *             .location(&#34;eastus&#34;)
 *             .mobileNetworkName(&#34;testMobileNetwork&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .sliceName(&#34;testSlice&#34;)
 *             .snssai(Map.ofEntries(
 *                 Map.entry(&#34;sd&#34;, &#34;1abcde&#34;),
 *                 Map.entry(&#34;sst&#34;, 1)
 *             ))
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
 * $ pulumi import azure-native:mobilenetwork:Slice testSlice /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.MobileNetwork/mobileNetworks/testMobileNetwork/slices/testSlice 
 * ```
 * 
 */
@ResourceType(type="azure-native:mobilenetwork:Slice")
public class Slice extends com.pulumi.resources.CustomResource {
    /**
     * The timestamp of resource creation (UTC).
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output</* @Nullable */ String> createdAt;

    /**
     * @return The timestamp of resource creation (UTC).
     * 
     */
    public Output<Optional<String>> createdAt() {
        return Codegen.optional(this.createdAt);
    }
    /**
     * The identity that created the resource.
     * 
     */
    @Export(name="createdBy", type=String.class, parameters={})
    private Output</* @Nullable */ String> createdBy;

    /**
     * @return The identity that created the resource.
     * 
     */
    public Output<Optional<String>> createdBy() {
        return Codegen.optional(this.createdBy);
    }
    /**
     * The type of identity that created the resource.
     * 
     */
    @Export(name="createdByType", type=String.class, parameters={})
    private Output</* @Nullable */ String> createdByType;

    /**
     * @return The type of identity that created the resource.
     * 
     */
    public Output<Optional<String>> createdByType() {
        return Codegen.optional(this.createdByType);
    }
    /**
     * An optional description for this network slice.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description for this network slice.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The timestamp of resource last modification (UTC)
     * 
     */
    @Export(name="lastModifiedAt", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedAt;

    /**
     * @return The timestamp of resource last modification (UTC)
     * 
     */
    public Output<Optional<String>> lastModifiedAt() {
        return Codegen.optional(this.lastModifiedAt);
    }
    /**
     * The identity that last modified the resource.
     * 
     */
    @Export(name="lastModifiedBy", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedBy;

    /**
     * @return The identity that last modified the resource.
     * 
     */
    public Output<Optional<String>> lastModifiedBy() {
        return Codegen.optional(this.lastModifiedBy);
    }
    /**
     * The type of identity that last modified the resource.
     * 
     */
    @Export(name="lastModifiedByType", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedByType;

    /**
     * @return The type of identity that last modified the resource.
     * 
     */
    public Output<Optional<String>> lastModifiedByType() {
        return Codegen.optional(this.lastModifiedByType);
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The provisioning state of the network slice resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the network slice resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The S-NSSAI (single network slice selection assistance information). Unique at the scope of a MobileNetwork.
     * 
     */
    @Export(name="snssai", type=SnssaiResponse.class, parameters={})
    private Output<SnssaiResponse> snssai;

    /**
     * @return The S-NSSAI (single network slice selection assistance information). Unique at the scope of a MobileNetwork.
     * 
     */
    public Output<SnssaiResponse> snssai() {
        return this.snssai;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Slice(String name) {
        this(name, SliceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Slice(String name, SliceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Slice(String name, SliceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:mobilenetwork:Slice", name, args == null ? SliceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Slice(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:mobilenetwork:Slice", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:mobilenetwork/v20220101preview:Slice").build()),
                Output.of(Alias.builder().type("azure-native:mobilenetwork/v20220301preview:Slice").build())
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
    public static Slice get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Slice(name, id, options);
    }
}
