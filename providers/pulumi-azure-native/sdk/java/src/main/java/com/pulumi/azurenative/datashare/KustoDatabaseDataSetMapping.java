// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.datashare.KustoDatabaseDataSetMappingArgs;
import com.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A Kusto database data set mapping
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * ### DataSetMappings_Create
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
 *         var kustoDatabaseDataSetMapping = new KustoDatabaseDataSetMapping(&#34;kustoDatabaseDataSetMapping&#34;, KustoDatabaseDataSetMappingArgs.builder()        
 *             .accountName(&#34;Account1&#34;)
 *             .dataSetMappingName(&#34;DatasetMapping1&#34;)
 *             .resourceGroupName(&#34;SampleResourceGroup&#34;)
 *             .shareSubscriptionName(&#34;ShareSubscription1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### DataSetMappings_SqlDB_Create
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
 *         var kustoDatabaseDataSetMapping = new KustoDatabaseDataSetMapping(&#34;kustoDatabaseDataSetMapping&#34;, KustoDatabaseDataSetMappingArgs.builder()        
 *             .accountName(&#34;Account1&#34;)
 *             .dataSetMappingName(&#34;DatasetMapping1&#34;)
 *             .resourceGroupName(&#34;SampleResourceGroup&#34;)
 *             .shareSubscriptionName(&#34;ShareSubscription1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### DataSetMappings_SqlDWDataSetToAdlsGen2File_Create
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
 *         var kustoDatabaseDataSetMapping = new KustoDatabaseDataSetMapping(&#34;kustoDatabaseDataSetMapping&#34;, KustoDatabaseDataSetMappingArgs.builder()        
 *             .accountName(&#34;Account1&#34;)
 *             .dataSetMappingName(&#34;DatasetMapping1&#34;)
 *             .resourceGroupName(&#34;SampleResourceGroup&#34;)
 *             .shareSubscriptionName(&#34;ShareSubscription1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### DataSetMappings_SqlDW_Create
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
 *         var kustoDatabaseDataSetMapping = new KustoDatabaseDataSetMapping(&#34;kustoDatabaseDataSetMapping&#34;, KustoDatabaseDataSetMappingArgs.builder()        
 *             .accountName(&#34;Account1&#34;)
 *             .dataSetMappingName(&#34;DatasetMapping1&#34;)
 *             .resourceGroupName(&#34;SampleResourceGroup&#34;)
 *             .shareSubscriptionName(&#34;ShareSubscription1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### DataSetMappings_SynapseWorkspaceSqlPoolTable_Create
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
 *         var kustoDatabaseDataSetMapping = new KustoDatabaseDataSetMapping(&#34;kustoDatabaseDataSetMapping&#34;, KustoDatabaseDataSetMappingArgs.builder()        
 *             .accountName(&#34;consumerAccount&#34;)
 *             .dataSetMappingName(&#34;datasetMappingName1&#34;)
 *             .resourceGroupName(&#34;SampleResourceGroup&#34;)
 *             .shareSubscriptionName(&#34;ShareSubscription1&#34;)
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
 * $ pulumi import azure-native:datashare:KustoDatabaseDataSetMapping datasetMappingName1 /subscriptions/0f3dcfc3-18f8-4099-b381-8353e19d43a7/resourceGroups/SampleResourceGroup/providers/Microsoft.DataShare/accounts/consumerAccount/shareSubscriptions/ShareSubscription1/dataSetMappings/datasetMappingName1 
 * ```
 * 
 */
@ResourceType(type="azure-native:datashare:KustoDatabaseDataSetMapping")
public class KustoDatabaseDataSetMapping extends com.pulumi.resources.CustomResource {
    /**
     * The id of the source data set.
     * 
     */
    @Export(name="dataSetId", type=String.class, parameters={})
    private Output<String> dataSetId;

    /**
     * @return The id of the source data set.
     * 
     */
    public Output<String> dataSetId() {
        return this.dataSetId;
    }
    /**
     * Gets the status of the data set mapping.
     * 
     */
    @Export(name="dataSetMappingStatus", type=String.class, parameters={})
    private Output<String> dataSetMappingStatus;

    /**
     * @return Gets the status of the data set mapping.
     * 
     */
    public Output<String> dataSetMappingStatus() {
        return this.dataSetMappingStatus;
    }
    /**
     * Kind of data set mapping.
     * Expected value is &#39;KustoDatabase&#39;.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of data set mapping.
     * Expected value is &#39;KustoDatabase&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Resource id of the sink kusto cluster.
     * 
     */
    @Export(name="kustoClusterResourceId", type=String.class, parameters={})
    private Output<String> kustoClusterResourceId;

    /**
     * @return Resource id of the sink kusto cluster.
     * 
     */
    public Output<String> kustoClusterResourceId() {
        return this.kustoClusterResourceId;
    }
    /**
     * Location of the sink kusto cluster.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Location of the sink kusto cluster.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Name of the azure resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the azure resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Provisioning state of the data set mapping.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the data set mapping.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * System Data of the Azure resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return System Data of the Azure resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Type of the azure resource
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the azure resource
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KustoDatabaseDataSetMapping(String name) {
        this(name, KustoDatabaseDataSetMappingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KustoDatabaseDataSetMapping(String name, KustoDatabaseDataSetMappingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KustoDatabaseDataSetMapping(String name, KustoDatabaseDataSetMappingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:KustoDatabaseDataSetMapping", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private KustoDatabaseDataSetMapping(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:KustoDatabaseDataSetMapping", name, null, makeResourceOptions(options, id));
    }

    private static KustoDatabaseDataSetMappingArgs makeArgs(KustoDatabaseDataSetMappingArgs args) {
        var builder = args == null ? KustoDatabaseDataSetMappingArgs.builder() : KustoDatabaseDataSetMappingArgs.builder(args);
        return builder
            .kind("KustoDatabase")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datashare/v20181101preview:KustoDatabaseDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20191101:KustoDatabaseDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20200901:KustoDatabaseDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20201001preview:KustoDatabaseDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20210801:KustoDatabaseDataSetMapping").build())
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
    public static KustoDatabaseDataSetMapping get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KustoDatabaseDataSetMapping(name, id, options);
    }
}
