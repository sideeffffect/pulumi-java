// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicebus;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.servicebus.NamespaceNetworkRuleSetArgs;
import com.pulumi.azure.servicebus.inputs.NamespaceNetworkRuleSetState;
import com.pulumi.azure.servicebus.outputs.NamespaceNetworkRuleSetNetworkRule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a ServiceBus Namespace Network Rule Set Set.
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleNamespace = new Namespace(&#34;exampleNamespace&#34;, NamespaceArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .sku(&#34;Premium&#34;)
 *             .capacity(1)
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .addressSpaces(&#34;172.17.0.0/16&#34;)
 *             .dnsServers(            
 *                 &#34;10.0.0.4&#34;,
 *                 &#34;10.0.0.5&#34;)
 *             .build());
 * 
 *         var exampleSubnet = new Subnet(&#34;exampleSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .virtualNetworkName(exampleVirtualNetwork.getName())
 *             .addressPrefixes(&#34;172.17.0.0/24&#34;)
 *             .serviceEndpoints(&#34;Microsoft.ServiceBus&#34;)
 *             .build());
 * 
 *         var exampleNamespaceNetworkRuleSet = new NamespaceNetworkRuleSet(&#34;exampleNamespaceNetworkRuleSet&#34;, NamespaceNetworkRuleSetArgs.builder()        
 *             .namespaceId(exampleNamespace.getId())
 *             .defaultAction(&#34;Deny&#34;)
 *             .publicNetworkAccessEnabled(true)
 *             .networkRules(NamespaceNetworkRuleSetNetworkRule.builder()
 *                 .subnetId(exampleSubnet.getId())
 *                 .ignoreMissingVnetServiceEndpoint(false)
 *                 .build())
 *             .ipRules(&#34;1.1.1.1&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Service Bus Namespace can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:servicebus/namespaceNetworkRuleSet:NamespaceNetworkRuleSet example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Servicebus/namespaces/sbns1/networkrulesets/default
 * ```
 * 
 */
@ResourceType(type="azure:servicebus/namespaceNetworkRuleSet:NamespaceNetworkRuleSet")
public class NamespaceNetworkRuleSet extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the default action for the ServiceBus Namespace Network Rule Set. Possible values are `Allow` and `Deny`. Defaults to `Deny`.
     * 
     */
    @Export(name="defaultAction", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultAction;

    /**
     * @return Specifies the default action for the ServiceBus Namespace Network Rule Set. Possible values are `Allow` and `Deny`. Defaults to `Deny`.
     * 
     */
    public Output<Optional<String>> defaultAction() {
        return Codegen.optional(this.defaultAction);
    }
    /**
     * One or more IP Addresses, or CIDR Blocks which should be able to access the ServiceBus Namespace.
     * 
     */
    @Export(name="ipRules", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> ipRules;

    /**
     * @return One or more IP Addresses, or CIDR Blocks which should be able to access the ServiceBus Namespace.
     * 
     */
    public Output<Optional<List<String>>> ipRules() {
        return Codegen.optional(this.ipRules);
    }
    /**
     * Specifies the ServiceBus Namespace ID to which to attach the ServiceBus Namespace Network Rule Set. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="namespaceId", type=String.class, parameters={})
    private Output<String> namespaceId;

    /**
     * @return Specifies the ServiceBus Namespace ID to which to attach the ServiceBus Namespace Network Rule Set. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> namespaceId() {
        return this.namespaceId;
    }
    /**
     * One or more `network_rules` blocks as defined below.
     * 
     */
    @Export(name="networkRules", type=List.class, parameters={NamespaceNetworkRuleSetNetworkRule.class})
    private Output</* @Nullable */ List<NamespaceNetworkRuleSetNetworkRule>> networkRules;

    /**
     * @return One or more `network_rules` blocks as defined below.
     * 
     */
    public Output<Optional<List<NamespaceNetworkRuleSetNetworkRule>>> networkRules() {
        return Codegen.optional(this.networkRules);
    }
    /**
     * Whether to allow traffic over public network. Possible values are `true` and `false`. Defaults to `true`.
     * 
     */
    @Export(name="publicNetworkAccessEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> publicNetworkAccessEnabled;

    /**
     * @return Whether to allow traffic over public network. Possible values are `true` and `false`. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> publicNetworkAccessEnabled() {
        return Codegen.optional(this.publicNetworkAccessEnabled);
    }
    /**
     * If True, then Azure Services that are known and trusted for this resource type are allowed to bypass firewall configuration. See [Trusted Microsoft Services](https://github.com/MicrosoftDocs/azure-docs/blob/master/articles/service-bus-messaging/includes/service-bus-trusted-services.md)
     * 
     */
    @Export(name="trustedServicesAllowed", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> trustedServicesAllowed;

    /**
     * @return If True, then Azure Services that are known and trusted for this resource type are allowed to bypass firewall configuration. See [Trusted Microsoft Services](https://github.com/MicrosoftDocs/azure-docs/blob/master/articles/service-bus-messaging/includes/service-bus-trusted-services.md)
     * 
     */
    public Output<Optional<Boolean>> trustedServicesAllowed() {
        return Codegen.optional(this.trustedServicesAllowed);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NamespaceNetworkRuleSet(String name) {
        this(name, NamespaceNetworkRuleSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NamespaceNetworkRuleSet(String name, NamespaceNetworkRuleSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NamespaceNetworkRuleSet(String name, NamespaceNetworkRuleSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:servicebus/namespaceNetworkRuleSet:NamespaceNetworkRuleSet", name, args == null ? NamespaceNetworkRuleSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NamespaceNetworkRuleSet(String name, Output<String> id, @Nullable NamespaceNetworkRuleSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:servicebus/namespaceNetworkRuleSet:NamespaceNetworkRuleSet", name, state, makeResourceOptions(options, id));
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
    public static NamespaceNetworkRuleSet get(String name, Output<String> id, @Nullable NamespaceNetworkRuleSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NamespaceNetworkRuleSet(name, id, state, options);
    }
}
