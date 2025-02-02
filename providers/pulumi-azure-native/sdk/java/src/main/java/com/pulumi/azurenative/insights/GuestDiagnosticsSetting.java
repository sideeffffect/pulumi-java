// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.insights.GuestDiagnosticsSettingArgs;
import com.pulumi.azurenative.insights.outputs.DataSourceResponse;
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
 * Virtual machine guest diagnostics settings resource.
 * API Version: 2018-06-01-preview.
 * 
 * ## Example Usage
 * ### Create or update a guest diagnostic settings
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
 *         var guestDiagnosticsSetting = new GuestDiagnosticsSetting(&#34;guestDiagnosticsSetting&#34;, GuestDiagnosticsSettingArgs.builder()        
 *             .dataSources(            
 *                 Map.ofEntries(
 *                     Map.entry(&#34;configuration&#34;, Map.of(&#34;perfCounters&#34;,                     
 *                         Map.ofEntries(
 *                             Map.entry(&#34;name&#34;, &#34;\\Process(_Total)\\%Processor Time&#34;),
 *                             Map.entry(&#34;samplingPeriod&#34;, &#34;PT1M&#34;)
 *                         ),
 *                         Map.ofEntries(
 *                             Map.entry(&#34;name&#34;, &#34;\\Process(_Total)\\Working Set&#34;),
 *                             Map.entry(&#34;samplingPeriod&#34;, &#34;PT1M&#34;)
 *                         ))),
 *                     Map.entry(&#34;kind&#34;, &#34;PerformanceCounter&#34;),
 *                     Map.entry(&#34;sinks&#34;, Map.of(&#34;kind&#34;, &#34;LogAnalytics&#34;))
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;configuration&#34;, Map.of(&#34;providers&#34;,                     
 *                         Map.of(&#34;id&#34;, &#34;1&#34;),
 *                         Map.of(&#34;id&#34;, &#34;2&#34;))),
 *                     Map.entry(&#34;kind&#34;, &#34;ETWProviders&#34;),
 *                     Map.entry(&#34;sinks&#34;, Map.of(&#34;kind&#34;, &#34;LogAnalytics&#34;))
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;configuration&#34;, Map.of(&#34;eventLogs&#34;,                     
 *                         Map.ofEntries(
 *                             Map.entry(&#34;filter&#34;, &#34;SourceName == Xyz AND EventId = \&#34;100\&#34; AND  $Xpath/Column=\&#34;DCName\&#34; = \&#34;CatWoman\&#34;&#34;),
 *                             Map.entry(&#34;logName&#34;, &#34;Application&#34;)
 *                         ),
 *                         Map.ofEntries(
 *                             Map.entry(&#34;filter&#34;, &#34;SourceName == Xyz AND EventId = \&#34;100\&#34; AND  $Xpath/Column=\&#34;DCName\&#34; = \&#34;BatMan\&#34;&#34;),
 *                             Map.entry(&#34;logName&#34;, &#34;Application&#34;)
 *                         ))),
 *                     Map.entry(&#34;kind&#34;, &#34;WindowsEventLogs&#34;),
 *                     Map.entry(&#34;sinks&#34;, Map.of(&#34;kind&#34;, &#34;LogAnalytics&#34;))
 *                 ))
 *             .diagnosticSettingsName(&#34;SampleDiagSetting&#34;)
 *             .location(&#34;Global&#34;)
 *             .osType(&#34;Windows&#34;)
 *             .resourceGroupName(&#34;Default-ResourceGroup&#34;)
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
 * $ pulumi import azure-native:insights:guestDiagnosticsSetting productionMachineSetting /subscriptions/187f412d-1758-44d9-b052-169e2564721d/resourceGroups/Default-ResourceGroup/providers/microsoft.insights/guestDiagnosticSettings/SampleDiagSetting 
 * ```
 * 
 */
@ResourceType(type="azure-native:insights:guestDiagnosticsSetting")
public class GuestDiagnosticsSetting extends com.pulumi.resources.CustomResource {
    /**
     * the array of data source object which are configured to collect and send data
     * 
     */
    @Export(name="dataSources", type=List.class, parameters={DataSourceResponse.class})
    private Output</* @Nullable */ List<DataSourceResponse>> dataSources;

    /**
     * @return the array of data source object which are configured to collect and send data
     * 
     */
    public Output<Optional<List<DataSourceResponse>>> dataSources() {
        return Codegen.optional(this.dataSources);
    }
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Azure resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Operating system type for the configuration
     * 
     */
    @Export(name="osType", type=String.class, parameters={})
    private Output</* @Nullable */ String> osType;

    /**
     * @return Operating system type for the configuration
     * 
     */
    public Output<Optional<String>> osType() {
        return Codegen.optional(this.osType);
    }
    @Export(name="proxySetting", type=String.class, parameters={})
    private Output</* @Nullable */ String> proxySetting;

    public Output<Optional<String>> proxySetting() {
        return Codegen.optional(this.proxySetting);
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Azure resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GuestDiagnosticsSetting(String name) {
        this(name, GuestDiagnosticsSettingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GuestDiagnosticsSetting(String name, GuestDiagnosticsSettingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GuestDiagnosticsSetting(String name, GuestDiagnosticsSettingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:guestDiagnosticsSetting", name, args == null ? GuestDiagnosticsSettingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GuestDiagnosticsSetting(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:guestDiagnosticsSetting", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:insights/v20180601preview:guestDiagnosticsSetting").build())
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
    public static GuestDiagnosticsSetting get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GuestDiagnosticsSetting(name, id, options);
    }
}
