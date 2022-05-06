// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.NetworkExperimentProfileArgs;
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
 * Defines an Network Experiment Profile and lists of Experiments
 * API Version: 2019-11-01.
 * 
 * ## Example Usage
 * ### Creates an NetworkExperiment Profile in a Resource Group
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
 *         var networkExperimentProfile = new NetworkExperimentProfile(&#34;networkExperimentProfile&#34;, NetworkExperimentProfileArgs.builder()        
 *             .enabledState(&#34;Enabled&#34;)
 *             .location(&#34;WestUs&#34;)
 *             .profileName(&#34;MyProfile&#34;)
 *             .resourceGroupName(&#34;MyResourceGroup&#34;)
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
 * $ pulumi import azure-native:network:NetworkExperimentProfile MyProfile /subscriptions/subid/resourceGroups/MyResourceGroup/providers/Microsoft.Network/NetworkExperimentProfiles/MyProfile 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:NetworkExperimentProfile")
public class NetworkExperimentProfile extends com.pulumi.resources.CustomResource {
    /**
     * The state of the Experiment
     * 
     */
    @Export(name="enabledState", type=String.class, parameters={})
    private Output</* @Nullable */ String> enabledState;

    /**
     * @return The state of the Experiment
     * 
     */
    public Output<Optional<String>> enabledState() {
        return Codegen.optional(this.enabledState);
    }
    /**
     * Gets a unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Gets a unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<Optional<String>> etag() {
        return Codegen.optional(this.etag);
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Resource status.
     * 
     */
    @Export(name="resourceState", type=String.class, parameters={})
    private Output<String> resourceState;

    /**
     * @return Resource status.
     * 
     */
    public Output<String> resourceState() {
        return this.resourceState;
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
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkExperimentProfile(String name) {
        this(name, NetworkExperimentProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkExperimentProfile(String name, NetworkExperimentProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkExperimentProfile(String name, NetworkExperimentProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:NetworkExperimentProfile", name, args == null ? NetworkExperimentProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkExperimentProfile(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:NetworkExperimentProfile", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20191101:NetworkExperimentProfile").build())
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
    public static NetworkExperimentProfile get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkExperimentProfile(name, id, options);
    }
}
