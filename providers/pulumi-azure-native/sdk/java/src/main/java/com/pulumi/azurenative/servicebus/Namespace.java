// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicebus;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.servicebus.NamespaceArgs;
import com.pulumi.azurenative.servicebus.outputs.SBSkuResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Description of a namespace resource.
 * API Version: 2017-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:servicebus:Namespace sdk-Namespace-2924 /subscriptions/5f750a97-50d9-4e36-8081-c9ee4c0210d4/resourceGroups/ArunMonocle/providers/Microsoft.ServiceBus/namespaces/sdk-Namespace-2924 
 * ```
 * 
 */
@ResourceType(type="azure-native:servicebus:Namespace")
public class Namespace extends com.pulumi.resources.CustomResource {
    /**
     * The time the namespace was created.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The time the namespace was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The Geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Geo-location where the resource lives
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Identifier for Azure Insights metrics
     * 
     */
    @Export(name="metricId", type=String.class, parameters={})
    private Output<String> metricId;

    /**
     * @return Identifier for Azure Insights metrics
     * 
     */
    public Output<String> metricId() {
        return this.metricId;
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Provisioning state of the namespace.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the namespace.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Endpoint you can use to perform Service Bus operations.
     * 
     */
    @Export(name="serviceBusEndpoint", type=String.class, parameters={})
    private Output<String> serviceBusEndpoint;

    /**
     * @return Endpoint you can use to perform Service Bus operations.
     * 
     */
    public Output<String> serviceBusEndpoint() {
        return this.serviceBusEndpoint;
    }
    /**
     * Properties of Sku
     * 
     */
    @Export(name="sku", type=SBSkuResponse.class, parameters={})
    private Output</* @Nullable */ SBSkuResponse> sku;

    /**
     * @return Properties of Sku
     * 
     */
    public Output</* @Nullable */ SBSkuResponse> sku() {
        return this.sku;
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
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The time the namespace was updated.
     * 
     */
    @Export(name="updatedAt", type=String.class, parameters={})
    private Output<String> updatedAt;

    /**
     * @return The time the namespace was updated.
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Namespace(String name) {
        this(name, NamespaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Namespace(String name, NamespaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Namespace(String name, NamespaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicebus:Namespace", name, args == null ? NamespaceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Namespace(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicebus:Namespace", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:servicebus/v20140901:Namespace").build()),
                Output.of(Alias.builder().type("azure-native:servicebus/v20150801:Namespace").build()),
                Output.of(Alias.builder().type("azure-native:servicebus/v20170401:Namespace").build()),
                Output.of(Alias.builder().type("azure-native:servicebus/v20180101preview:Namespace").build()),
                Output.of(Alias.builder().type("azure-native:servicebus/v20210101preview:Namespace").build()),
                Output.of(Alias.builder().type("azure-native:servicebus/v20210601preview:Namespace").build()),
                Output.of(Alias.builder().type("azure-native:servicebus/v20211101:Namespace").build())
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
    public static Namespace get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Namespace(name, id, options);
    }
}
