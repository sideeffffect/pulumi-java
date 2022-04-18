// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.eventhub.NamespaceVirtualNetworkRuleArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Single item in a List or Get VirtualNetworkRules operation
 * API Version: 2018-01-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:eventhub:NamespaceVirtualNetworkRule sdk-VirtualNetworkRules-9191 /subscriptions/Subscription/resourceGroups/ResourceGroup/providers/Microsoft.EventHub/namespaces/sdk-Namespace-6019/virtualnetworkrules/sdk-VirtualNetworkRules-9191 
 * ```
 * 
 */
@ResourceType(type="azure-native:eventhub:NamespaceVirtualNetworkRule")
public class NamespaceVirtualNetworkRule extends com.pulumi.resources.CustomResource {
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
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * ARM ID of Virtual Network Subnet
     * 
     */
    @Export(name="virtualNetworkSubnetId", type=String.class, parameters={})
    private Output</* @Nullable */ String> virtualNetworkSubnetId;

    /**
     * @return ARM ID of Virtual Network Subnet
     * 
     */
    public Output</* @Nullable */ String> virtualNetworkSubnetId() {
        return this.virtualNetworkSubnetId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NamespaceVirtualNetworkRule(String name) {
        this(name, NamespaceVirtualNetworkRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NamespaceVirtualNetworkRule(String name, NamespaceVirtualNetworkRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NamespaceVirtualNetworkRule(String name, NamespaceVirtualNetworkRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventhub:NamespaceVirtualNetworkRule", name, args == null ? NamespaceVirtualNetworkRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NamespaceVirtualNetworkRule(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventhub:NamespaceVirtualNetworkRule", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:eventhub/v20180101preview:NamespaceVirtualNetworkRule").build())
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
    public static NamespaceVirtualNetworkRule get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NamespaceVirtualNetworkRule(name, id, options);
    }
}
