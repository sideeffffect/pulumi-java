// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.datafactory.DataFlowArgs;
import com.pulumi.azurenative.datafactory.outputs.FlowletResponse;
import com.pulumi.azurenative.datafactory.outputs.MappingDataFlowResponse;
import com.pulumi.azurenative.datafactory.outputs.WranglingDataFlowResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Data flow resource type.
 * API Version: 2018-06-01.
 * 
 * ## Example Usage
 * ### DataFlows_Create
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
 *         var dataFlow = new DataFlow(&#34;dataFlow&#34;, DataFlowArgs.builder()        
 *             .dataFlowName(&#34;exampleDataFlow&#34;)
 *             .factoryName(&#34;exampleFactoryName&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;description&#34;, &#34;Sample demo data flow to convert currencies showing usage of union, derive and conditional split transformation.&#34;),
 *                 Map.entry(&#34;script&#34;, &#34;&#34;&#34;
 * source(output(PreviousConversionRate as double,Country as string,DateTime1 as string,CurrentConversionRate as double),allowSchemaDrift: false,validateSchema: false) ~&gt; USDCurrency
 * source(output(PreviousConversionRate as double,Country as string,DateTime1 as string,CurrentConversionRate as double),allowSchemaDrift: true,validateSchema: false) ~&gt; CADSource
 * USDCurrency, CADSource union(byName: true)~&gt; Union
 * Union derive(NewCurrencyRate = round(CurrentConversionRate*1.25)) ~&gt; NewCurrencyColumn
 * NewCurrencyColumn split(Country == &#39;USD&#39;,Country == &#39;CAD&#39;,disjoint: false) ~&gt; ConditionalSplit1{@literal @}(USD, CAD)
 * ConditionalSplit1@USD sink(saveMode:&#39;overwrite&#39; ) ~&gt; USDSink
 * ConditionalSplit1@CAD sink(saveMode:&#39;overwrite&#39; ) ~&gt; CADSink                &#34;&#34;&#34;),
 *                 Map.entry(&#34;sinks&#34;,                 
 *                     Map.ofEntries(
 *                         Map.entry(&#34;dataset&#34;, Map.ofEntries(
 *                             Map.entry(&#34;referenceName&#34;, &#34;USDOutput&#34;),
 *                             Map.entry(&#34;type&#34;, &#34;DatasetReference&#34;)
 *                         )),
 *                         Map.entry(&#34;name&#34;, &#34;USDSink&#34;)
 *                     ),
 *                     Map.ofEntries(
 *                         Map.entry(&#34;dataset&#34;, Map.ofEntries(
 *                             Map.entry(&#34;referenceName&#34;, &#34;CADOutput&#34;),
 *                             Map.entry(&#34;type&#34;, &#34;DatasetReference&#34;)
 *                         )),
 *                         Map.entry(&#34;name&#34;, &#34;CADSink&#34;)
 *                     )),
 *                 Map.entry(&#34;sources&#34;,                 
 *                     Map.ofEntries(
 *                         Map.entry(&#34;dataset&#34;, Map.ofEntries(
 *                             Map.entry(&#34;referenceName&#34;, &#34;CurrencyDatasetUSD&#34;),
 *                             Map.entry(&#34;type&#34;, &#34;DatasetReference&#34;)
 *                         )),
 *                         Map.entry(&#34;name&#34;, &#34;USDCurrency&#34;)
 *                     ),
 *                     Map.ofEntries(
 *                         Map.entry(&#34;dataset&#34;, Map.ofEntries(
 *                             Map.entry(&#34;referenceName&#34;, &#34;CurrencyDatasetCAD&#34;),
 *                             Map.entry(&#34;type&#34;, &#34;DatasetReference&#34;)
 *                         )),
 *                         Map.entry(&#34;name&#34;, &#34;CADSource&#34;)
 *                     )),
 *                 Map.entry(&#34;type&#34;, &#34;MappingDataFlow&#34;)
 *             ))
 *             .resourceGroupName(&#34;exampleResourceGroup&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### DataFlows_Update
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
 *         var dataFlow = new DataFlow(&#34;dataFlow&#34;, DataFlowArgs.builder()        
 *             .dataFlowName(&#34;exampleDataFlow&#34;)
 *             .factoryName(&#34;exampleFactoryName&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;description&#34;, &#34;Sample demo data flow to convert currencies showing usage of union, derive and conditional split transformation.&#34;),
 *                 Map.entry(&#34;script&#34;, &#34;&#34;&#34;
 * source(output(PreviousConversionRate as double,Country as string,DateTime1 as string,CurrentConversionRate as double),allowSchemaDrift: false,validateSchema: false) ~&gt; USDCurrency
 * source(output(PreviousConversionRate as double,Country as string,DateTime1 as string,CurrentConversionRate as double),allowSchemaDrift: true,validateSchema: false) ~&gt; CADSource
 * USDCurrency, CADSource union(byName: true)~&gt; Union
 * Union derive(NewCurrencyRate = round(CurrentConversionRate*1.25)) ~&gt; NewCurrencyColumn
 * NewCurrencyColumn split(Country == &#39;USD&#39;,Country == &#39;CAD&#39;,disjoint: false) ~&gt; ConditionalSplit1{@literal @}(USD, CAD)
 * ConditionalSplit1@USD sink(saveMode:&#39;overwrite&#39; ) ~&gt; USDSink
 * ConditionalSplit1@CAD sink(saveMode:&#39;overwrite&#39; ) ~&gt; CADSink                &#34;&#34;&#34;),
 *                 Map.entry(&#34;sinks&#34;,                 
 *                     Map.ofEntries(
 *                         Map.entry(&#34;dataset&#34;, Map.ofEntries(
 *                             Map.entry(&#34;referenceName&#34;, &#34;USDOutput&#34;),
 *                             Map.entry(&#34;type&#34;, &#34;DatasetReference&#34;)
 *                         )),
 *                         Map.entry(&#34;name&#34;, &#34;USDSink&#34;)
 *                     ),
 *                     Map.ofEntries(
 *                         Map.entry(&#34;dataset&#34;, Map.ofEntries(
 *                             Map.entry(&#34;referenceName&#34;, &#34;CADOutput&#34;),
 *                             Map.entry(&#34;type&#34;, &#34;DatasetReference&#34;)
 *                         )),
 *                         Map.entry(&#34;name&#34;, &#34;CADSink&#34;)
 *                     )),
 *                 Map.entry(&#34;sources&#34;,                 
 *                     Map.ofEntries(
 *                         Map.entry(&#34;dataset&#34;, Map.ofEntries(
 *                             Map.entry(&#34;referenceName&#34;, &#34;CurrencyDatasetUSD&#34;),
 *                             Map.entry(&#34;type&#34;, &#34;DatasetReference&#34;)
 *                         )),
 *                         Map.entry(&#34;name&#34;, &#34;USDCurrency&#34;)
 *                     ),
 *                     Map.ofEntries(
 *                         Map.entry(&#34;dataset&#34;, Map.ofEntries(
 *                             Map.entry(&#34;referenceName&#34;, &#34;CurrencyDatasetCAD&#34;),
 *                             Map.entry(&#34;type&#34;, &#34;DatasetReference&#34;)
 *                         )),
 *                         Map.entry(&#34;name&#34;, &#34;CADSource&#34;)
 *                     )),
 *                 Map.entry(&#34;type&#34;, &#34;MappingDataFlow&#34;)
 *             ))
 *             .resourceGroupName(&#34;exampleResourceGroup&#34;)
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
 * $ pulumi import azure-native:datafactory:DataFlow exampleDataFlow /subscriptions/12345678-1234-1234-1234-12345678abc/resourceGroups/exampleResourceGroup/providers/Microsoft.DataFactory/factories/exampleFactoryName/datasets/exampleDataset 
 * ```
 * 
 */
@ResourceType(type="azure-native:datafactory:DataFlow")
public class DataFlow extends com.pulumi.resources.CustomResource {
    /**
     * Etag identifies change in the resource.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Etag identifies change in the resource.
     * 
     */
    public Output<String> etag() {
        return this.etag;
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
     * Data flow properties.
     * 
     */
    @Export(name="properties", type=Object.class, parameters={})
    private Output<Object> properties;

    /**
     * @return Data flow properties.
     * 
     */
    public Output<Object> properties() {
        return this.properties;
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
    public DataFlow(String name) {
        this(name, DataFlowArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataFlow(String name, DataFlowArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataFlow(String name, DataFlowArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datafactory:DataFlow", name, args == null ? DataFlowArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataFlow(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datafactory:DataFlow", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datafactory/v20180601:DataFlow").build())
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
    public static DataFlow get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataFlow(name, id, options);
    }
}
