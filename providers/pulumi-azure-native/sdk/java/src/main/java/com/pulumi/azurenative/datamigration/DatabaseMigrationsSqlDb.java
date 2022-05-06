// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.datamigration.DatabaseMigrationsSqlDbArgs;
import com.pulumi.azurenative.datamigration.outputs.DatabaseMigrationPropertiesSqlDbResponse;
import com.pulumi.azurenative.datamigration.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Database Migration Resource for SQL Database.
 * API Version: 2022-03-30-preview.
 * 
 * ## Example Usage
 * ### Create or Update Database Migration resource with Maximum parameters.
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
 *         var databaseMigrationsSqlDb = new DatabaseMigrationsSqlDb(&#34;databaseMigrationsSqlDb&#34;, DatabaseMigrationsSqlDbArgs.builder()        
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;kind&#34;, &#34;SqlDb&#34;),
 *                 Map.entry(&#34;migrationService&#34;, &#34;/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/testrg/providers/Microsoft.DataMigration/sqlMigrationServices/testagent&#34;),
 *                 Map.entry(&#34;scope&#34;, &#34;/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/testrg/providers/Microsoft.Sql/servers/sqldbinstance&#34;),
 *                 Map.entry(&#34;sourceDatabaseName&#34;, &#34;aaa&#34;),
 *                 Map.entry(&#34;sourceSqlConnection&#34;, Map.ofEntries(
 *                     Map.entry(&#34;authentication&#34;, &#34;WindowsAuthentication&#34;),
 *                     Map.entry(&#34;dataSource&#34;, &#34;aaa&#34;),
 *                     Map.entry(&#34;encryptConnection&#34;, true),
 *                     Map.entry(&#34;password&#34;, &#34;placeholder&#34;),
 *                     Map.entry(&#34;trustServerCertificate&#34;, true),
 *                     Map.entry(&#34;userName&#34;, &#34;bbb&#34;)
 *                 )),
 *                 Map.entry(&#34;tableList&#34;,                 
 *                     &#34;[Schema1].[TableName1]&#34;,
 *                     &#34;[Schema2].[TableName2]&#34;),
 *                 Map.entry(&#34;targetSqlConnection&#34;, Map.ofEntries(
 *                     Map.entry(&#34;authentication&#34;, &#34;SqlAuthentication&#34;),
 *                     Map.entry(&#34;dataSource&#34;, &#34;sqldbinstance&#34;),
 *                     Map.entry(&#34;encryptConnection&#34;, true),
 *                     Map.entry(&#34;password&#34;, &#34;placeholder&#34;),
 *                     Map.entry(&#34;trustServerCertificate&#34;, true),
 *                     Map.entry(&#34;userName&#34;, &#34;bbb&#34;)
 *                 ))
 *             ))
 *             .resourceGroupName(&#34;testrg&#34;)
 *             .sqlDbInstanceName(&#34;sqldbinstance&#34;)
 *             .targetDbName(&#34;db1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create or Update Database Migration resource with Minimum parameters.
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
 *         var databaseMigrationsSqlDb = new DatabaseMigrationsSqlDb(&#34;databaseMigrationsSqlDb&#34;, DatabaseMigrationsSqlDbArgs.builder()        
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;kind&#34;, &#34;SqlDb&#34;),
 *                 Map.entry(&#34;migrationService&#34;, &#34;/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/testrg/providers/Microsoft.DataMigration/sqlMigrationServices/testagent&#34;),
 *                 Map.entry(&#34;scope&#34;, &#34;/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/testrg/providers/Microsoft.Sql/servers/sqldbinstance&#34;),
 *                 Map.entry(&#34;sourceDatabaseName&#34;, &#34;aaa&#34;),
 *                 Map.entry(&#34;sourceSqlConnection&#34;, Map.ofEntries(
 *                     Map.entry(&#34;authentication&#34;, &#34;WindowsAuthentication&#34;),
 *                     Map.entry(&#34;dataSource&#34;, &#34;aaa&#34;),
 *                     Map.entry(&#34;encryptConnection&#34;, true),
 *                     Map.entry(&#34;password&#34;, &#34;placeholder&#34;),
 *                     Map.entry(&#34;trustServerCertificate&#34;, true),
 *                     Map.entry(&#34;userName&#34;, &#34;bbb&#34;)
 *                 )),
 *                 Map.entry(&#34;targetSqlConnection&#34;, Map.ofEntries(
 *                     Map.entry(&#34;authentication&#34;, &#34;SqlAuthentication&#34;),
 *                     Map.entry(&#34;dataSource&#34;, &#34;sqldbinstance&#34;),
 *                     Map.entry(&#34;encryptConnection&#34;, true),
 *                     Map.entry(&#34;password&#34;, &#34;placeholder&#34;),
 *                     Map.entry(&#34;trustServerCertificate&#34;, true),
 *                     Map.entry(&#34;userName&#34;, &#34;bbb&#34;)
 *                 ))
 *             ))
 *             .resourceGroupName(&#34;testrg&#34;)
 *             .sqlDbInstanceName(&#34;sqldbinstance&#34;)
 *             .targetDbName(&#34;db1&#34;)
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
 * $ pulumi import azure-native:datamigration:DatabaseMigrationsSqlDb db1 /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/testrg/providers/Microsoft.Sql/servers/sqldbinstance/providers/Microsoft.DataMigration/databaseMigrations/db1 
 * ```
 * 
 */
@ResourceType(type="azure-native:datamigration:DatabaseMigrationsSqlDb")
public class DatabaseMigrationsSqlDb extends com.pulumi.resources.CustomResource {
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    /**
     * Database Migration Resource properties for SQL database.
     * 
     */
    @Export(name="properties", type=DatabaseMigrationPropertiesSqlDbResponse.class, parameters={})
    private Output<DatabaseMigrationPropertiesSqlDbResponse> properties;

    /**
     * @return Database Migration Resource properties for SQL database.
     * 
     */
    public Output<DatabaseMigrationPropertiesSqlDbResponse> properties() {
        return this.properties;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabaseMigrationsSqlDb(String name) {
        this(name, DatabaseMigrationsSqlDbArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseMigrationsSqlDb(String name, DatabaseMigrationsSqlDbArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseMigrationsSqlDb(String name, DatabaseMigrationsSqlDbArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datamigration:DatabaseMigrationsSqlDb", name, args == null ? DatabaseMigrationsSqlDbArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatabaseMigrationsSqlDb(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datamigration:DatabaseMigrationsSqlDb", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datamigration/v20220330preview:DatabaseMigrationsSqlDb").build())
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
    public static DatabaseMigrationsSqlDb get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseMigrationsSqlDb(name, id, options);
    }
}
