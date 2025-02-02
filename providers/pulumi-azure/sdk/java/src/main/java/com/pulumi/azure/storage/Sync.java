// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.storage.SyncArgs;
import com.pulumi.azure.storage.inputs.SyncState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Storage Sync.
 * 
 * ## Example Usage
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
 *         var example = new ResourceGroup(&#34;example&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var test = new Sync(&#34;test&#34;, SyncArgs.builder()        
 *             .resourceGroupName(azurerm_resource_group.getTest().getName())
 *             .location(azurerm_resource_group.getTest().getLocation())
 *             .tags(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Storage Syncs can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:storage/sync:Sync example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.StorageSync/storageSyncServices/sync1
 * ```
 * 
 */
@ResourceType(type="azure:storage/sync:Sync")
public class Sync extends com.pulumi.resources.CustomResource {
    /**
     * Incoming traffic policy. Possible values are `AllowAllTraffic` and `AllowVirtualNetworksOnly`.
     * 
     */
    @Export(name="incomingTrafficPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> incomingTrafficPolicy;

    /**
     * @return Incoming traffic policy. Possible values are `AllowAllTraffic` and `AllowVirtualNetworksOnly`.
     * 
     */
    public Output<Optional<String>> incomingTrafficPolicy() {
        return Codegen.optional(this.incomingTrafficPolicy);
    }
    /**
     * The Azure Region where the Storage Sync should exist. Changing this forces a new Storage Sync to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region where the Storage Sync should exist. Changing this forces a new Storage Sync to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name which should be used for this Storage Sync. Changing this forces a new Storage Sync to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Storage Sync. Changing this forces a new Storage Sync to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group where the Storage Sync should exist. Changing this forces a new Storage Sync to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Storage Sync should exist. Changing this forces a new Storage Sync to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A mapping of tags which should be assigned to the Storage Sync.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Storage Sync.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Sync(String name) {
        this(name, SyncArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Sync(String name, SyncArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Sync(String name, SyncArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:storage/sync:Sync", name, args == null ? SyncArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Sync(String name, Output<String> id, @Nullable SyncState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:storage/sync:Sync", name, state, makeResourceOptions(options, id));
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
    public static Sync get(String name, Output<String> id, @Nullable SyncState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Sync(name, id, state, options);
    }
}
