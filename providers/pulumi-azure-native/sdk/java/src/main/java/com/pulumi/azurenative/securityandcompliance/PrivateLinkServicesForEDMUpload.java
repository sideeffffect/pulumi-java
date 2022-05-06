// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityandcompliance;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.securityandcompliance.PrivateLinkServicesForEDMUploadArgs;
import com.pulumi.azurenative.securityandcompliance.outputs.ServicesPropertiesResponse;
import com.pulumi.azurenative.securityandcompliance.outputs.ServicesResourceResponseIdentity;
import com.pulumi.azurenative.securityandcompliance.outputs.SystemDataResponse;
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
 * The description of the service.
 * API Version: 2021-03-08.
 * 
 * ## Example Usage
 * ### Create or Update a service with all parameters
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
 *         var privateLinkServicesForEDMUpload = new PrivateLinkServicesForEDMUpload(&#34;privateLinkServicesForEDMUpload&#34;, PrivateLinkServicesForEDMUploadArgs.builder()        
 *             .identity(Map.of(&#34;type&#34;, &#34;SystemAssigned&#34;))
 *             .kind(&#34;fhir-R4&#34;)
 *             .location(&#34;westus2&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;accessPolicies&#34;,                 
 *                     Map.of(&#34;objectId&#34;, &#34;c487e7d1-3210-41a3-8ccc-e9372b78da47&#34;),
 *                     Map.of(&#34;objectId&#34;, &#34;5b307da8-43d4-492b-8b66-b0294ade872f&#34;)),
 *                 Map.entry(&#34;authenticationConfiguration&#34;, Map.ofEntries(
 *                     Map.entry(&#34;audience&#34;, &#34;https://azurehealthcareapis.com&#34;),
 *                     Map.entry(&#34;authority&#34;, &#34;https://login.microsoftonline.com/abfde7b2-df0f-47e6-aabf-2462b07508dc&#34;),
 *                     Map.entry(&#34;smartProxyEnabled&#34;, true)
 *                 )),
 *                 Map.entry(&#34;corsConfiguration&#34;, Map.ofEntries(
 *                     Map.entry(&#34;allowCredentials&#34;, false),
 *                     Map.entry(&#34;headers&#34;, &#34;*&#34;),
 *                     Map.entry(&#34;maxAge&#34;, 1440),
 *                     Map.entry(&#34;methods&#34;,                     
 *                         &#34;DELETE&#34;,
 *                         &#34;GET&#34;,
 *                         &#34;OPTIONS&#34;,
 *                         &#34;PATCH&#34;,
 *                         &#34;POST&#34;,
 *                         &#34;PUT&#34;),
 *                     Map.entry(&#34;origins&#34;, &#34;*&#34;)
 *                 )),
 *                 Map.entry(&#34;cosmosDbConfiguration&#34;, Map.ofEntries(
 *                     Map.entry(&#34;keyVaultKeyUri&#34;, &#34;https://my-vault.vault.azure.net/keys/my-key&#34;),
 *                     Map.entry(&#34;offerThroughput&#34;, 1000)
 *                 )),
 *                 Map.entry(&#34;exportConfiguration&#34;, Map.of(&#34;storageAccountName&#34;, &#34;existingStorageAccount&#34;)),
 *                 Map.entry(&#34;privateEndpointConnections&#34;, ),
 *                 Map.entry(&#34;publicNetworkAccess&#34;, &#34;Disabled&#34;)
 *             ))
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .resourceName(&#34;service1&#34;)
 *             .tags()
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create or Update a service with minimum parameters
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
 *         var privateLinkServicesForEDMUpload = new PrivateLinkServicesForEDMUpload(&#34;privateLinkServicesForEDMUpload&#34;, PrivateLinkServicesForEDMUploadArgs.builder()        
 *             .kind(&#34;fhir-R4&#34;)
 *             .location(&#34;westus2&#34;)
 *             .properties(Map.of(&#34;accessPolicies&#34;, Map.of(&#34;objectId&#34;, &#34;c487e7d1-3210-41a3-8ccc-e9372b78da47&#34;)))
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .resourceName(&#34;service2&#34;)
 *             .tags()
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
 * $ pulumi import azure-native:securityandcompliance:privateLinkServicesForEDMUpload service2 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.SecurityAndCompliance/privateLinkServicesForEDMUpload/service2 
 * ```
 * 
 */
@ResourceType(type="azure-native:securityandcompliance:privateLinkServicesForEDMUpload")
public class PrivateLinkServicesForEDMUpload extends com.pulumi.resources.CustomResource {
    /**
     * An etag associated with the resource, used for optimistic concurrency when editing it.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return An etag associated with the resource, used for optimistic concurrency when editing it.
     * 
     */
    public Output<Optional<String>> etag() {
        return Codegen.optional(this.etag);
    }
    /**
     * Setting indicating whether the service has a managed identity associated with it.
     * 
     */
    @Export(name="identity", type=ServicesResourceResponseIdentity.class, parameters={})
    private Output</* @Nullable */ ServicesResourceResponseIdentity> identity;

    /**
     * @return Setting indicating whether the service has a managed identity associated with it.
     * 
     */
    public Output<Optional<ServicesResourceResponseIdentity>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The kind of the service.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of the service.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The resource location.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The common properties of a service.
     * 
     */
    @Export(name="properties", type=ServicesPropertiesResponse.class, parameters={})
    private Output<ServicesPropertiesResponse> properties;

    /**
     * @return The common properties of a service.
     * 
     */
    public Output<ServicesPropertiesResponse> properties() {
        return this.properties;
    }
    /**
     * Required property for system data
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Required property for system data
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * The resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateLinkServicesForEDMUpload(String name) {
        this(name, PrivateLinkServicesForEDMUploadArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateLinkServicesForEDMUpload(String name, PrivateLinkServicesForEDMUploadArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateLinkServicesForEDMUpload(String name, PrivateLinkServicesForEDMUploadArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityandcompliance:privateLinkServicesForEDMUpload", name, args == null ? PrivateLinkServicesForEDMUploadArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivateLinkServicesForEDMUpload(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityandcompliance:privateLinkServicesForEDMUpload", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:securityandcompliance/v20210111:privateLinkServicesForEDMUpload").build()),
                Output.of(Alias.builder().type("azure-native:securityandcompliance/v20210308:privateLinkServicesForEDMUpload").build())
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
    public static PrivateLinkServicesForEDMUpload get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrivateLinkServicesForEDMUpload(name, id, options);
    }
}
