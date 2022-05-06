// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.datashare.SqlDWTableDataSetArgs;
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
 * A SQL DW table data set.
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
 *         var sqlDWTableDataSet = new SqlDWTableDataSet(&#34;sqlDWTableDataSet&#34;, SqlDWTableDataSetArgs.builder()        
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
 *         var sqlDWTableDataSet = new SqlDWTableDataSet(&#34;sqlDWTableDataSet&#34;, SqlDWTableDataSetArgs.builder()        
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
 *         var sqlDWTableDataSet = new SqlDWTableDataSet(&#34;sqlDWTableDataSet&#34;, SqlDWTableDataSetArgs.builder()        
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
 *         var sqlDWTableDataSet = new SqlDWTableDataSet(&#34;sqlDWTableDataSet&#34;, SqlDWTableDataSetArgs.builder()        
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
 *         var sqlDWTableDataSet = new SqlDWTableDataSet(&#34;sqlDWTableDataSet&#34;, SqlDWTableDataSetArgs.builder()        
 *             .accountName(&#34;Account1&#34;)
 *             .dataSetName(&#34;Dataset1&#34;)
 *             .dataWarehouseName(&#34;DataWarehouse1&#34;)
 *             .kind(&#34;SqlDWTable&#34;)
 *             .resourceGroupName(&#34;SampleResourceGroup&#34;)
 *             .schemaName(&#34;dbo&#34;)
 *             .shareName(&#34;Share1&#34;)
 *             .sqlServerResourceId(&#34;/subscriptions/433a8dfd-e5d5-4e77-ad86-90acdc75eb1a/resourceGroups/SampleResourceGroup/providers/Microsoft.Sql/servers/Server1&#34;)
 *             .tableName(&#34;Table1&#34;)
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
 *         var sqlDWTableDataSet = new SqlDWTableDataSet(&#34;sqlDWTableDataSet&#34;, SqlDWTableDataSetArgs.builder()        
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
 * $ pulumi import azure-native:datashare:SqlDWTableDataSet dataset1 /subscriptions/0f3dcfc3-18f8-4099-b381-8353e19d43a7/resourceGroups/SampleResourceGroup/providers/Microsoft.DataShare/accounts/sourceAccount/shares/share1/dataSets/dataset1 
 * ```
 * 
 */
@ResourceType(type="azure-native:datashare:SqlDWTableDataSet")
public class SqlDWTableDataSet extends com.pulumi.resources.CustomResource {
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
     * DataWarehouse name of the source data set
     * 
     */
    @Export(name="dataWarehouseName", type=String.class, parameters={})
    private Output<String> dataWarehouseName;

    /**
     * @return DataWarehouse name of the source data set
     * 
     */
    public Output<String> dataWarehouseName() {
        return this.dataWarehouseName;
    }
    /**
     * Kind of data set.
     * Expected value is &#39;SqlDWTable&#39;.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of data set.
     * Expected value is &#39;SqlDWTable&#39;.
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
     * Schema of the table. Default value is dbo.
     * 
     */
    @Export(name="schemaName", type=String.class, parameters={})
    private Output<String> schemaName;

    /**
     * @return Schema of the table. Default value is dbo.
     * 
     */
    public Output<String> schemaName() {
        return this.schemaName;
    }
    /**
     * Resource id of SQL server
     * 
     */
    @Export(name="sqlServerResourceId", type=String.class, parameters={})
    private Output<String> sqlServerResourceId;

    /**
     * @return Resource id of SQL server
     * 
     */
    public Output<String> sqlServerResourceId() {
        return this.sqlServerResourceId;
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
     * SQL DW table name.
     * 
     */
    @Export(name="tableName", type=String.class, parameters={})
    private Output<String> tableName;

    /**
     * @return SQL DW table name.
     * 
     */
    public Output<String> tableName() {
        return this.tableName;
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
    public SqlDWTableDataSet(String name) {
        this(name, SqlDWTableDataSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlDWTableDataSet(String name, SqlDWTableDataSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlDWTableDataSet(String name, SqlDWTableDataSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:SqlDWTableDataSet", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private SqlDWTableDataSet(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:SqlDWTableDataSet", name, null, makeResourceOptions(options, id));
    }

    private static SqlDWTableDataSetArgs makeArgs(SqlDWTableDataSetArgs args) {
        var builder = args == null ? SqlDWTableDataSetArgs.builder() : SqlDWTableDataSetArgs.builder(args);
        return builder
            .kind("SqlDWTable")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datashare/v20181101preview:SqlDWTableDataSet").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20191101:SqlDWTableDataSet").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20200901:SqlDWTableDataSet").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20201001preview:SqlDWTableDataSet").build()),
                Output.of(Alias.builder().type("azure-native:datashare/v20210801:SqlDWTableDataSet").build())
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
    public static SqlDWTableDataSet get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SqlDWTableDataSet(name, id, options);
    }
}
