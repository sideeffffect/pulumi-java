// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurearcdata;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.azurearcdata.PostgresInstanceArgs;
import com.pulumi.azurenative.azurearcdata.outputs.ExtendedLocationResponse;
import com.pulumi.azurenative.azurearcdata.outputs.PostgresInstancePropertiesResponse;
import com.pulumi.azurenative.azurearcdata.outputs.PostgresInstanceSkuResponse;
import com.pulumi.azurenative.azurearcdata.outputs.SystemDataResponse;
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
 * A Postgres Instance.
 * API Version: 2021-06-01-preview.
 * 
 * ## Example Usage
 * ### Create or update a Postgres Instance.
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
 *         var postgresInstance = new PostgresInstance(&#34;postgresInstance&#34;, PostgresInstanceArgs.builder()        
 *             .extendedLocation(Map.ofEntries(
 *                 Map.entry(&#34;name&#34;, &#34;/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/testrg/providers/Microsoft.ExtendedLocation/customLocations/arclocation&#34;),
 *                 Map.entry(&#34;type&#34;, &#34;CustomLocation&#34;)
 *             ))
 *             .location(&#34;eastus&#34;)
 *             .postgresInstanceName(&#34;testpostgresInstance&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;admin&#34;, &#34;admin&#34;),
 *                 Map.entry(&#34;basicLoginInformation&#34;, Map.ofEntries(
 *                     Map.entry(&#34;password&#34;, &#34;********&#34;),
 *                     Map.entry(&#34;username&#34;, &#34;username&#34;)
 *                 )),
 *                 Map.entry(&#34;dataControllerId&#34;, &#34;dataControllerId&#34;),
 *                 Map.entry(&#34;k8sRaw&#34;, Map.ofEntries(
 *                     Map.entry(&#34;apiVersion&#34;, &#34;apiVersion&#34;),
 *                     Map.entry(&#34;kind&#34;, &#34;postgresql-12&#34;),
 *                     Map.entry(&#34;metadata&#34;, PostgresInstanceProperties.builder()
 *                         .creationTimestamp(&#34;2020-08-25T14:55:10Z&#34;)
 *                         .generation(1)
 *                         .name(&#34;pg1&#34;)
 *                         .namespace(&#34;test&#34;)
 *                         .resourceVersion(&#34;527780&#34;)
 *                         .selfLink(&#34;/apis/arcdata.microsoft.com/v1alpha1/namespaces/test/postgresql-12s/pg1&#34;)
 *                         .uid(&#34;1111aaaa-ffff-ffff-ffff-99999aaaaaaa&#34;)
 *                         .build()),
 *                     Map.entry(&#34;spec&#34;, PostgresInstanceProperties.builder()
 *                         .backups(Map.ofEntries(
 *                             Map.entry(&#34;deltaMinutes&#34;, 3),
 *                             Map.entry(&#34;fullMinutes&#34;, 10),
 *                             Map.entry(&#34;tiers&#34;, Map.ofEntries(
 *                                 Map.entry(&#34;retention&#34;, Map.ofEntries(
 *                                     Map.entry(&#34;maximums&#34;,                                     
 *                                         &#34;6&#34;,
 *                                         &#34;512MB&#34;),
 *                                     Map.entry(&#34;minimums&#34;, &#34;3&#34;)
 *                                 )),
 *                                 Map.entry(&#34;storage&#34;, Map.of(&#34;volumeSize&#34;, &#34;1Gi&#34;))
 *                             ))
 *                         ))
 *                         .engine(Map.of(&#34;extensions&#34;, Map.of(&#34;name&#34;, &#34;citus&#34;)))
 *                         .scale(Map.of(&#34;shards&#34;, 3))
 *                         .scheduling(Map.of(&#34;default&#34;, Map.of(&#34;resources&#34;, Map.of(&#34;requests&#34;, Map.of(&#34;memory&#34;, &#34;256Mi&#34;)))))
 *                         .service(Map.of(&#34;type&#34;, &#34;NodePort&#34;))
 *                         .storage(Map.ofEntries(
 *                             Map.entry(&#34;data&#34;, Map.ofEntries(
 *                                 Map.entry(&#34;className&#34;, &#34;local-storage&#34;),
 *                                 Map.entry(&#34;size&#34;, &#34;5Gi&#34;)
 *                             )),
 *                             Map.entry(&#34;logs&#34;, Map.ofEntries(
 *                                 Map.entry(&#34;className&#34;, &#34;local-storage&#34;),
 *                                 Map.entry(&#34;size&#34;, &#34;5Gi&#34;)
 *                             ))
 *                         ))
 *                         .build()),
 *                     Map.entry(&#34;status&#34;, PostgresInstanceProperties.builder()
 *                         .externalEndpoint(null)
 *                         .readyPods(&#34;4/4&#34;)
 *                         .state(&#34;Ready&#34;)
 *                         .build())
 *                 ))
 *             ))
 *             .resourceGroupName(&#34;testrg&#34;)
 *             .sku(Map.ofEntries(
 *                 Map.entry(&#34;dev&#34;, true),
 *                 Map.entry(&#34;name&#34;, &#34;default&#34;),
 *                 Map.entry(&#34;tier&#34;, &#34;Hyperscale&#34;)
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
 * $ pulumi import azure-native:azurearcdata:PostgresInstance testsqlregistration /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/testrg/providers/Microsoft.AzureArcData/PostgresInstance/testpostgresInstance 
 * ```
 * 
 */
@ResourceType(type="azure-native:azurearcdata:PostgresInstance")
public class PostgresInstance extends com.pulumi.resources.CustomResource {
    /**
     * The extendedLocation of the resource.
     * 
     */
    @Export(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return The extendedLocation of the resource.
     * 
     */
    public Output<Optional<ExtendedLocationResponse>> extendedLocation() {
        return Codegen.optional(this.extendedLocation);
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
     * null
     * 
     */
    @Export(name="properties", type=PostgresInstancePropertiesResponse.class, parameters={})
    private Output<PostgresInstancePropertiesResponse> properties;

    /**
     * @return null
     * 
     */
    public Output<PostgresInstancePropertiesResponse> properties() {
        return this.properties;
    }
    /**
     * Resource sku.
     * 
     */
    @Export(name="sku", type=PostgresInstanceSkuResponse.class, parameters={})
    private Output</* @Nullable */ PostgresInstanceSkuResponse> sku;

    /**
     * @return Resource sku.
     * 
     */
    public Output<Optional<PostgresInstanceSkuResponse>> sku() {
        return Codegen.optional(this.sku);
    }
    /**
     * Read only system data
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Read only system data
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
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
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PostgresInstance(String name) {
        this(name, PostgresInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PostgresInstance(String name, PostgresInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PostgresInstance(String name, PostgresInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:azurearcdata:PostgresInstance", name, args == null ? PostgresInstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PostgresInstance(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:azurearcdata:PostgresInstance", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:azurearcdata/v20210601preview:PostgresInstance").build()),
                Output.of(Alias.builder().type("azure-native:azurearcdata/v20210701preview:PostgresInstance").build()),
                Output.of(Alias.builder().type("azure-native:azurearcdata/v20220301preview:PostgresInstance").build())
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
    public static PostgresInstance get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PostgresInstance(name, id, options);
    }
}
