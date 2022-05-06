// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.timeseriesinsights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.timeseriesinsights.PrivateEndpointConnectionArgs;
import com.pulumi.azurenative.timeseriesinsights.outputs.PrivateEndpointResponse;
import com.pulumi.azurenative.timeseriesinsights.outputs.PrivateLinkServiceConnectionStateResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The Private Endpoint Connection resource.
 * API Version: 2021-03-31-preview.
 * 
 * ## Example Usage
 * ### PrivateEndpointConnectionUpdate
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
 *         var privateEndpointConnection = new PrivateEndpointConnection(&#34;privateEndpointConnection&#34;, PrivateEndpointConnectionArgs.builder()        
 *             .environmentName(&#34;myEnvironment&#34;)
 *             .privateEndpointConnectionName(&#34;myPrivateEndpointConnectionName&#34;)
 *             .privateLinkServiceConnectionState(Map.ofEntries(
 *                 Map.entry(&#34;description&#34;, &#34;Rejected for some reason&#34;),
 *                 Map.entry(&#34;status&#34;, &#34;Rejected&#34;)
 *             ))
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
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
 * $ pulumi import azure-native:timeseriesinsights:PrivateEndpointConnection myPrivateEndpointConnectionName /subscriptions/mySubscriptionId/resourceGroups/myResourceGroup/providers/Microsoft.TimeSeriesInsights/Environments/myEnvironment/privateEndpointConnections/myPrivateEndpointConnectionName 
 * ```
 * 
 */
@ResourceType(type="azure-native:timeseriesinsights:PrivateEndpointConnection")
public class PrivateEndpointConnection extends com.pulumi.resources.CustomResource {
    /**
     * The provisioning state of the private endpoint connection resource.
     * 
     */
    @Export(name="groupIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> groupIds;

    /**
     * @return The provisioning state of the private endpoint connection resource.
     * 
     */
    public Output<Optional<List<String>>> groupIds() {
        return Codegen.optional(this.groupIds);
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
     * The resource of private end point.
     * 
     */
    @Export(name="privateEndpoint", type=PrivateEndpointResponse.class, parameters={})
    private Output</* @Nullable */ PrivateEndpointResponse> privateEndpoint;

    /**
     * @return The resource of private end point.
     * 
     */
    public Output<Optional<PrivateEndpointResponse>> privateEndpoint() {
        return Codegen.optional(this.privateEndpoint);
    }
    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    @Export(name="privateLinkServiceConnectionState", type=PrivateLinkServiceConnectionStateResponse.class, parameters={})
    private Output<PrivateLinkServiceConnectionStateResponse> privateLinkServiceConnectionState;

    /**
     * @return A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    public Output<PrivateLinkServiceConnectionStateResponse> privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }
    /**
     * Provisioning state of the private endpoint connection.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the private endpoint connection.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
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
    public PrivateEndpointConnection(String name) {
        this(name, PrivateEndpointConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateEndpointConnection(String name, PrivateEndpointConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateEndpointConnection(String name, PrivateEndpointConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:timeseriesinsights:PrivateEndpointConnection", name, args == null ? PrivateEndpointConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivateEndpointConnection(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:timeseriesinsights:PrivateEndpointConnection", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:timeseriesinsights/v20210331preview:PrivateEndpointConnection").build())
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
    public static PrivateEndpointConnection get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrivateEndpointConnection(name, id, options);
    }
}
