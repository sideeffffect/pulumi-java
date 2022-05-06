// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.vmwarecloudsimple;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.vmwarecloudsimple.DedicatedCloudServiceArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Dedicated cloud service model
 * API Version: 2019-04-01.
 * 
 * ## Example Usage
 * ### CreateDedicatedCloudService
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
 *         var dedicatedCloudService = new DedicatedCloudService(&#34;dedicatedCloudService&#34;, DedicatedCloudServiceArgs.builder()        
 *             .dedicatedCloudServiceName(&#34;myService&#34;)
 *             .gatewaySubnet(&#34;10.0.0.0&#34;)
 *             .location(&#34;westus&#34;)
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
 * $ pulumi import azure-native:vmwarecloudsimple:DedicatedCloudService myService /subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.VMwareCloudSimple/dedicatedCloudServices/myService 
 * ```
 * 
 */
@ResourceType(type="azure-native:vmwarecloudsimple:DedicatedCloudService")
public class DedicatedCloudService extends com.pulumi.resources.CustomResource {
    /**
     * gateway Subnet for the account. It will collect the subnet address and always treat it as /28
     * 
     */
    @Export(name="gatewaySubnet", type=String.class, parameters={})
    private Output<String> gatewaySubnet;

    /**
     * @return gateway Subnet for the account. It will collect the subnet address and always treat it as /28
     * 
     */
    public Output<String> gatewaySubnet() {
        return this.gatewaySubnet;
    }
    /**
     * indicates whether account onboarded or not in a given region
     * 
     */
    @Export(name="isAccountOnboarded", type=String.class, parameters={})
    private Output<String> isAccountOnboarded;

    /**
     * @return indicates whether account onboarded or not in a given region
     * 
     */
    public Output<String> isAccountOnboarded() {
        return this.isAccountOnboarded;
    }
    /**
     * Azure region
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Azure region
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * {dedicatedCloudServiceName}
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return {dedicatedCloudServiceName}
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * total nodes purchased
     * 
     */
    @Export(name="nodes", type=Integer.class, parameters={})
    private Output<Integer> nodes;

    /**
     * @return total nodes purchased
     * 
     */
    public Output<Integer> nodes() {
        return this.nodes;
    }
    /**
     * link to a service management web portal
     * 
     */
    @Export(name="serviceURL", type=String.class, parameters={})
    private Output<String> serviceURL;

    /**
     * @return link to a service management web portal
     * 
     */
    public Output<String> serviceURL() {
        return this.serviceURL;
    }
    /**
     * The list of tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The list of tags
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * {resourceProviderNamespace}/{resourceType}
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return {resourceProviderNamespace}/{resourceType}
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DedicatedCloudService(String name) {
        this(name, DedicatedCloudServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DedicatedCloudService(String name, DedicatedCloudServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DedicatedCloudService(String name, DedicatedCloudServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:vmwarecloudsimple:DedicatedCloudService", name, args == null ? DedicatedCloudServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DedicatedCloudService(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:vmwarecloudsimple:DedicatedCloudService", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:vmwarecloudsimple/v20190401:DedicatedCloudService").build())
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
    public static DedicatedCloudService get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DedicatedCloudService(name, id, options);
    }
}
