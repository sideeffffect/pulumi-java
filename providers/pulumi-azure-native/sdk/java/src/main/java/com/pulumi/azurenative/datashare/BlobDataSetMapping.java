// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.datashare.BlobDataSetMappingArgs;
import com.pulumi.azurenative.datashare.outputs.SystemDataResponse;
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
 * A Blob data set mapping.
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
 *         var blobDataSetMapping = new BlobDataSetMapping(&#34;blobDataSetMapping&#34;, BlobDataSetMappingArgs.builder()        
 *             .accountName(&#34;Account1&#34;)
 *             .containerName(&#34;C1&#34;)
 *             .dataSetId(&#34;a08f184b-0567-4b11-ba22-a1199336d226&#34;)
 *             .dataSetMappingName(&#34;DatasetMapping1&#34;)
 *             .filePath(&#34;file21&#34;)
 *             .kind(&#34;Blob&#34;)
 *             .resourceGroup(&#34;SampleResourceGroup&#34;)
 *             .resourceGroupName(&#34;SampleResourceGroup&#34;)
 *             .shareSubscriptionName(&#34;ShareSubscription1&#34;)
 *             .storageAccountName(&#34;storage2&#34;)
 *             .subscriptionId(&#34;433a8dfd-e5d5-4e77-ad86-90acdc75eb1a&#34;)
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
 *         var blobDataSetMapping = new BlobDataSetMapping(&#34;blobDataSetMapping&#34;, BlobDataSetMappingArgs.builder()        
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
 *         var blobDataSetMapping = new BlobDataSetMapping(&#34;blobDataSetMapping&#34;, BlobDataSetMappingArgs.builder()        
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
 *         var blobDataSetMapping = new BlobDataSetMapping(&#34;blobDataSetMapping&#34;, BlobDataSetMappingArgs.builder()        
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
 *         var blobDataSetMapping = new BlobDataSetMapping(&#34;blobDataSetMapping&#34;, BlobDataSetMappingArgs.builder()        
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
 * $ pulumi import azure-native:datashare:BlobDataSetMapping datasetMappingName1 /subscriptions/0f3dcfc3-18f8-4099-b381-8353e19d43a7/resourceGroups/SampleResourceGroup/providers/Microsoft.DataShare/accounts/consumerAccount/shareSubscriptions/ShareSubscription1/dataSetMappings/datasetMappingName1 
 * ```
 * 
 */
@ResourceType(type="azure-native:datashare:BlobDataSetMapping")
public class BlobDataSetMapping extends com.pulumi.resources.CustomResource {
    /**
     * Container that has the file path.
     * 
     */
    @Export(name="containerName", type=String.class, parameters={})
    private Output<String> containerName;

    /**
     * @return Container that has the file path.
     * 
     */
    public Output<String> containerName() {
        return this.containerName;
    }
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
     * File path within the source data set
     * 
     */
    @Export(name="filePath", type=String.class, parameters={})
    private Output<String> filePath;

    /**
     * @return File path within the source data set
     * 
     */
    public Output<String> filePath() {
        return this.filePath;
    }
    /**
     * Kind of data set mapping.
     * Expected value is &#39;Blob&#39;.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of data set mapping.
     * Expected value is &#39;Blob&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
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
     * File output type
     * 
     */
    @Export(name="outputType", type=String.class, parameters={})
    private Output</* @Nullable */ String> outputType;

    /**
     * @return File output type
     * 
     */
    public Output<Optional<String>> outputType() {
        return Codegen.optional(this.outputType);
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
     * Resource group of storage account.
     * 
     */
    @Export(name="resourceGroup", type=String.class, parameters={})
    private Output<String> resourceGroup;

    /**
     * @return Resource group of storage account.
     * 
     */
    public Output<String> resourceGroup() {
        return this.resourceGroup;
    }
    /**
     * Storage account name of the source data set.
     * 
     */
    @Export(name="storageAccountName", type=String.class, parameters={})
    private Output<String> storageAccountName;

    /**
     * @return Storage account name of the source data set.
     * 
     */
    public Output<String> storageAccountName() {
        return this.storageAccountName;
    }
    /**
     * Subscription id of storage account.
     * 
     */
    @Export(name="subscriptionId", type=String.class, parameters={})
    private Output<String> subscriptionId;

    /**
     * @return Subscription id of storage account.
     * 
     */
    public Output<String> subscriptionId() {
        return this.subscriptionId;
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
    public BlobDataSetMapping(String name) {
        this(name, BlobDataSetMappingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BlobDataSetMapping(String name, BlobDataSetMappingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BlobDataSetMapping(String name, BlobDataSetMappingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:BlobDataSetMapping", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private BlobDataSetMapping(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:BlobDataSetMapping", name, null, makeResourceOptions(options, id));
    }

    private static BlobDataSetMappingArgs makeArgs(BlobDataSetMappingArgs args) {
        var builder = args == null ? BlobDataSetMappingArgs.builder() : BlobDataSetMappingArgs.builder(args);
        return builder
            .kind("Blob")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datashare/v20181101preview:BlobDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20191101:BlobDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20200901:BlobDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20201001preview:BlobDataSetMapping").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20210801:BlobDataSetMapping").build())
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
    public static BlobDataSetMapping get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BlobDataSetMapping(name, id, options);
    }
}
