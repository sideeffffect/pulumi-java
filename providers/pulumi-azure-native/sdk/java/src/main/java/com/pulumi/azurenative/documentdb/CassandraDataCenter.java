// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.documentdb.CassandraDataCenterArgs;
import com.pulumi.azurenative.documentdb.outputs.DataCenterResourceResponseProperties;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A managed Cassandra data center.
 * API Version: 2021-03-01-preview.
 * 
 * ## Example Usage
 * ### CosmosDBManagedCassandraDataCenterCreate
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
 *         var cassandraDataCenter = new CassandraDataCenter(&#34;cassandraDataCenter&#34;, CassandraDataCenterArgs.builder()        
 *             .clusterName(&#34;cassandra-prod&#34;)
 *             .dataCenterName(&#34;dc1&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;base64EncodedCassandraYamlFragment&#34;, &#34;Y29tcGFjdGlvbl90aHJvdWdocHV0X21iX3Blcl9zZWM6IDMyCmNvbXBhY3Rpb25fbGFyZ2VfcGFydGl0aW9uX3dhcm5pbmdfdGhyZXNob2xkX21iOiAxMDA=&#34;),
 *                 Map.entry(&#34;dataCenterLocation&#34;, &#34;West US 2&#34;),
 *                 Map.entry(&#34;delegatedSubnetId&#34;, &#34;/subscriptions/536e130b-d7d6-4ac7-98a5-de20d69588d2/resourceGroups/customer-vnet-rg/providers/Microsoft.Network/virtualNetworks/customer-vnet/subnets/dc1-subnet&#34;),
 *                 Map.entry(&#34;nodeCount&#34;, 9)
 *             ))
 *             .resourceGroupName(&#34;cassandra-prod-rg&#34;)
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
 * $ pulumi import azure-native:documentdb:CassandraDataCenter dc1 /subscriptions/subid/resourceGroups/cassandra-prod-rg/providers/Microsoft.DocumentDB/cassandraClusters/cassandra-prod/dataCenters/dc1 
 * ```
 * 
 */
@ResourceType(type="azure-native:documentdb:CassandraDataCenter")
public class CassandraDataCenter extends com.pulumi.resources.CustomResource {
    /**
     * The name of the database account.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the database account.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Properties of a managed Cassandra data center.
     * 
     */
    @Export(name="properties", type=DataCenterResourceResponseProperties.class, parameters={})
    private Output<DataCenterResourceResponseProperties> properties;

    /**
     * @return Properties of a managed Cassandra data center.
     * 
     */
    public Output<DataCenterResourceResponseProperties> properties() {
        return this.properties;
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
    public CassandraDataCenter(String name) {
        this(name, CassandraDataCenterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CassandraDataCenter(String name, CassandraDataCenterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CassandraDataCenter(String name, CassandraDataCenterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:CassandraDataCenter", name, args == null ? CassandraDataCenterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CassandraDataCenter(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:CassandraDataCenter", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:documentdb/v20210301preview:CassandraDataCenter").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210401preview:CassandraDataCenter").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210701preview:CassandraDataCenter").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211015:CassandraDataCenter").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211015preview:CassandraDataCenter").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211115preview:CassandraDataCenter").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20220215preview:CassandraDataCenter").build())
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
    public static CassandraDataCenter get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CassandraDataCenter(name, id, options);
    }
}
