// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.datashare.BlobFolderDataSetArgs;
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
 * An Azure storage blob folder data set.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * ### DataSets_Create
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
 *         var blobFolderDataSet = new BlobFolderDataSet(&#34;blobFolderDataSet&#34;, BlobFolderDataSetArgs.builder()        
 *             .accountName(&#34;Account1&#34;)
 *             .dataSetName(&#34;Dataset1&#34;)
 *             .resourceGroupName(&#34;SampleResourceGroup&#34;)
 *             .shareName(&#34;Share1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### DataSets_KustoCluster_Create
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
 *         var blobFolderDataSet = new BlobFolderDataSet(&#34;blobFolderDataSet&#34;, BlobFolderDataSetArgs.builder()        
 *             .accountName(&#34;Account1&#34;)
 *             .dataSetName(&#34;Dataset1&#34;)
 *             .resourceGroupName(&#34;SampleResourceGroup&#34;)
 *             .shareName(&#34;Share1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### DataSets_KustoDatabase_Create
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
 *         var blobFolderDataSet = new BlobFolderDataSet(&#34;blobFolderDataSet&#34;, BlobFolderDataSetArgs.builder()        
 *             .accountName(&#34;Account1&#34;)
 *             .dataSetName(&#34;Dataset1&#34;)
 *             .resourceGroupName(&#34;SampleResourceGroup&#34;)
 *             .shareName(&#34;Share1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### DataSets_SqlDBTable_Create
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
 *         var blobFolderDataSet = new BlobFolderDataSet(&#34;blobFolderDataSet&#34;, BlobFolderDataSetArgs.builder()        
 *             .accountName(&#34;Account1&#34;)
 *             .dataSetName(&#34;Dataset1&#34;)
 *             .resourceGroupName(&#34;SampleResourceGroup&#34;)
 *             .shareName(&#34;Share1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### DataSets_SqlDWTable_Create
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
 *         var blobFolderDataSet = new BlobFolderDataSet(&#34;blobFolderDataSet&#34;, BlobFolderDataSetArgs.builder()        
 *             .accountName(&#34;Account1&#34;)
 *             .dataSetName(&#34;Dataset1&#34;)
 *             .resourceGroupName(&#34;SampleResourceGroup&#34;)
 *             .shareName(&#34;Share1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### DataSets_SynapseWorkspaceSqlPoolTable_Create
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
 *         var blobFolderDataSet = new BlobFolderDataSet(&#34;blobFolderDataSet&#34;, BlobFolderDataSetArgs.builder()        
 *             .accountName(&#34;sourceAccount&#34;)
 *             .dataSetName(&#34;dataset1&#34;)
 *             .resourceGroupName(&#34;SampleResourceGroup&#34;)
 *             .shareName(&#34;share1&#34;)
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
 * $ pulumi import azure-native:datashare:BlobFolderDataSet dataset1 /subscriptions/0f3dcfc3-18f8-4099-b381-8353e19d43a7/resourceGroups/SampleResourceGroup/providers/Microsoft.DataShare/accounts/sourceAccount/shares/share1/dataSets/dataset1 
 * ```
 * 
 */
@ResourceType(type="azure-native:datashare:BlobFolderDataSet")
public class BlobFolderDataSet extends com.pulumi.resources.CustomResource {
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
     * Unique id for identifying a data set resource
     * 
     */
    @Export(name="dataSetId", type=String.class, parameters={})
    private Output<String> dataSetId;

    /**
     * @return Unique id for identifying a data set resource
     * 
     */
    public Output<String> dataSetId() {
        return this.dataSetId;
    }
    /**
     * Kind of data set.
     * Expected value is &#39;BlobFolder&#39;.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of data set.
     * Expected value is &#39;BlobFolder&#39;.
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
     * Prefix for blob folder
     * 
     */
    @Export(name="prefix", type=String.class, parameters={})
    private Output<String> prefix;

    /**
     * @return Prefix for blob folder
     * 
     */
    public Output<String> prefix() {
        return this.prefix;
    }
    /**
     * Resource group of storage account
     * 
     */
    @Export(name="resourceGroup", type=String.class, parameters={})
    private Output<String> resourceGroup;

    /**
     * @return Resource group of storage account
     * 
     */
    public Output<String> resourceGroup() {
        return this.resourceGroup;
    }
    /**
     * Storage account name of the source data set
     * 
     */
    @Export(name="storageAccountName", type=String.class, parameters={})
    private Output<String> storageAccountName;

    /**
     * @return Storage account name of the source data set
     * 
     */
    public Output<String> storageAccountName() {
        return this.storageAccountName;
    }
    /**
     * Subscription id of storage account
     * 
     */
    @Export(name="subscriptionId", type=String.class, parameters={})
    private Output<String> subscriptionId;

    /**
     * @return Subscription id of storage account
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
    public BlobFolderDataSet(String name) {
        this(name, BlobFolderDataSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BlobFolderDataSet(String name, BlobFolderDataSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BlobFolderDataSet(String name, BlobFolderDataSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:BlobFolderDataSet", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private BlobFolderDataSet(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:BlobFolderDataSet", name, null, makeResourceOptions(options, id));
    }

    private static BlobFolderDataSetArgs makeArgs(BlobFolderDataSetArgs args) {
        var builder = args == null ? BlobFolderDataSetArgs.builder() : BlobFolderDataSetArgs.builder(args);
        return builder
            .kind("BlobFolder")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datashare/v20181101preview:BlobFolderDataSet").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20191101:BlobFolderDataSet").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20200901:BlobFolderDataSet").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20201001preview:BlobFolderDataSet").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20210801:BlobFolderDataSet").build())
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
    public static BlobFolderDataSet get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BlobFolderDataSet(name, id, options);
    }
}
