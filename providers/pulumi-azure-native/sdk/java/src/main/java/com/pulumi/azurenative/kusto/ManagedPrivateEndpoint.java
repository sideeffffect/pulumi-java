// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.kusto.ManagedPrivateEndpointArgs;
import com.pulumi.azurenative.kusto.outputs.SystemDataResponse;
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
 * Class representing a managed private endpoint.
 * API Version: 2021-08-27.
 * 
 * ## Example Usage
 * ### KustoManagedPrivateEndpointsCreateOrUpdate
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
 *         var managedPrivateEndpoint = new ManagedPrivateEndpoint(&#34;managedPrivateEndpoint&#34;, ManagedPrivateEndpointArgs.builder()        
 *             .clusterName(&#34;kustoclusterrptest4&#34;)
 *             .groupId(&#34;blob&#34;)
 *             .managedPrivateEndpointName(&#34;kustoManagedPrivateEndpoint1&#34;)
 *             .privateLinkResourceId(&#34;/subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.Storage/storageAccounts/storageAccountTest&#34;)
 *             .requestMessage(&#34;Please Approve.&#34;)
 *             .resourceGroupName(&#34;kustorptest&#34;)
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
 * $ pulumi import azure-native:kusto:ManagedPrivateEndpoint KustoClusterRPTest4/KustoDatabase8/kustomanagedPrivateEndpoint1 /subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.Kusto/Clusters/KustoClusterRPTest4/ManagedPrivateEndpoints/kustoManagedPrivateEndpoint1 
 * ```
 * 
 */
@ResourceType(type="azure-native:kusto:ManagedPrivateEndpoint")
public class ManagedPrivateEndpoint extends com.pulumi.resources.CustomResource {
    /**
     * The groupId in which the managed private endpoint is created.
     * 
     */
    @Export(name="groupId", type=String.class, parameters={})
    private Output<String> groupId;

    /**
     * @return The groupId in which the managed private endpoint is created.
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
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
     * The ARM resource ID of the resource for which the managed private endpoint is created.
     * 
     */
    @Export(name="privateLinkResourceId", type=String.class, parameters={})
    private Output<String> privateLinkResourceId;

    /**
     * @return The ARM resource ID of the resource for which the managed private endpoint is created.
     * 
     */
    public Output<String> privateLinkResourceId() {
        return this.privateLinkResourceId;
    }
    /**
     * The region of the resource to which the managed private endpoint is created.
     * 
     */
    @Export(name="privateLinkResourceRegion", type=String.class, parameters={})
    private Output</* @Nullable */ String> privateLinkResourceRegion;

    /**
     * @return The region of the resource to which the managed private endpoint is created.
     * 
     */
    public Output<Optional<String>> privateLinkResourceRegion() {
        return Codegen.optional(this.privateLinkResourceRegion);
    }
    /**
     * The provisioned state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioned state of the resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The user request message.
     * 
     */
    @Export(name="requestMessage", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestMessage;

    /**
     * @return The user request message.
     * 
     */
    public Output<Optional<String>> requestMessage() {
        return Codegen.optional(this.requestMessage);
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
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
    public ManagedPrivateEndpoint(String name) {
        this(name, ManagedPrivateEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedPrivateEndpoint(String name, ManagedPrivateEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedPrivateEndpoint(String name, ManagedPrivateEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kusto:ManagedPrivateEndpoint", name, args == null ? ManagedPrivateEndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ManagedPrivateEndpoint(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kusto:ManagedPrivateEndpoint", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:kusto/v20210827:ManagedPrivateEndpoint").build()),
                Output.of(Alias.builder().type("azure-native:kusto/v20220201:ManagedPrivateEndpoint").build())
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
    public static ManagedPrivateEndpoint get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagedPrivateEndpoint(name, id, options);
    }
}
