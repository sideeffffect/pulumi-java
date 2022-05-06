// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.documentdb.CassandraClusterArgs;
import com.pulumi.azurenative.documentdb.outputs.ClusterResourceResponseProperties;
import com.pulumi.azurenative.documentdb.outputs.ManagedServiceIdentityResponse;
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
 * Representation of a managed Cassandra cluster.
 * API Version: 2021-03-01-preview.
 * 
 * ## Example Usage
 * ### CosmosDBManagedCassandraClusterCreate
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
 *         var cassandraCluster = new CassandraCluster(&#34;cassandraCluster&#34;, CassandraClusterArgs.builder()        
 *             .clusterName(&#34;cassandra-prod&#34;)
 *             .location(&#34;West US&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;authenticationMethod&#34;, &#34;Cassandra&#34;),
 *                 Map.entry(&#34;cassandraVersion&#34;, &#34;3.11&#34;),
 *                 Map.entry(&#34;clientCertificates&#34;, Map.of(&#34;pem&#34;, &#34;&#34;&#34;
 * -----BEGIN CERTIFICATE-----
 * ...Base64 encoded certificate...
 * -----END CERTIFICATE-----                &#34;&#34;&#34;)),
 *                 Map.entry(&#34;clusterNameOverride&#34;, &#34;ClusterNameIllegalForAzureResource&#34;),
 *                 Map.entry(&#34;delegatedManagementSubnetId&#34;, &#34;/subscriptions/536e130b-d7d6-4ac7-98a5-de20d69588d2/resourceGroups/customer-vnet-rg/providers/Microsoft.Network/virtualNetworks/customer-vnet/subnets/management&#34;),
 *                 Map.entry(&#34;externalGossipCertificates&#34;, Map.of(&#34;pem&#34;, &#34;&#34;&#34;
 * -----BEGIN CERTIFICATE-----
 * ...Base64 encoded certificate...
 * -----END CERTIFICATE-----                &#34;&#34;&#34;)),
 *                 Map.entry(&#34;externalSeedNodes&#34;,                 
 *                     Map.of(&#34;ipAddress&#34;, &#34;10.52.221.2&#34;),
 *                     Map.of(&#34;ipAddress&#34;, &#34;10.52.221.3&#34;),
 *                     Map.of(&#34;ipAddress&#34;, &#34;10.52.221.4&#34;)),
 *                 Map.entry(&#34;hoursBetweenBackups&#34;, 24),
 *                 Map.entry(&#34;initialCassandraAdminPassword&#34;, &#34;mypassword&#34;)
 *             ))
 *             .resourceGroupName(&#34;cassandra-prod-rg&#34;)
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
 * $ pulumi import azure-native:documentdb:CassandraCluster cassandra-prod /subscriptions/subid/resourceGroups/cassandra-prod-rg/providers/Microsoft.DocumentDB/cassandraClusters/cassandra-prod 
 * ```
 * 
 */
@ResourceType(type="azure-native:documentdb:CassandraCluster")
public class CassandraCluster extends com.pulumi.resources.CustomResource {
    /**
     * Identity for the resource.
     * 
     */
    @Export(name="identity", type=ManagedServiceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ManagedServiceIdentityResponse> identity;

    /**
     * @return Identity for the resource.
     * 
     */
    public Output<Optional<ManagedServiceIdentityResponse>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The location of the resource group to which the resource belongs.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the resource group to which the resource belongs.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The name of the ARM resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the ARM resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Properties of a managed Cassandra cluster.
     * 
     */
    @Export(name="properties", type=ClusterResourceResponseProperties.class, parameters={})
    private Output<ClusterResourceResponseProperties> properties;

    /**
     * @return Properties of a managed Cassandra cluster.
     * 
     */
    public Output<ClusterResourceResponseProperties> properties() {
        return this.properties;
    }
    /**
     * Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with &#34;defaultExperience&#34;: &#34;Cassandra&#34;. Current &#34;defaultExperience&#34; values also include &#34;Table&#34;, &#34;Graph&#34;, &#34;DocumentDB&#34;, and &#34;MongoDB&#34;.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with &#34;defaultExperience&#34;: &#34;Cassandra&#34;. Current &#34;defaultExperience&#34; values also include &#34;Table&#34;, &#34;Graph&#34;, &#34;DocumentDB&#34;, and &#34;MongoDB&#34;.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The type of Azure resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of Azure resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CassandraCluster(String name) {
        this(name, CassandraClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CassandraCluster(String name, CassandraClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CassandraCluster(String name, CassandraClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:CassandraCluster", name, args == null ? CassandraClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CassandraCluster(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:CassandraCluster", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:documentdb/v20210301preview:CassandraCluster").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210401preview:CassandraCluster").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210701preview:CassandraCluster").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211015:CassandraCluster").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211015preview:CassandraCluster").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211115preview:CassandraCluster").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20220215preview:CassandraCluster").build())
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
    public static CassandraCluster get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CassandraCluster(name, id, options);
    }
}
