// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.insights.AutoscaleSettingArgs;
import com.pulumi.azurenative.insights.outputs.AutoscaleNotificationResponse;
import com.pulumi.azurenative.insights.outputs.AutoscaleProfileResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The autoscale setting resource.
 * API Version: 2015-04-01.
 * 
 * ## Example Usage
 * ### Create or update an autoscale setting
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
 *         var autoscaleSetting = new AutoscaleSetting(&#34;autoscaleSetting&#34;, AutoscaleSettingArgs.builder()        
 *             .autoscaleSettingName(&#34;MySetting&#34;)
 *             .enabled(true)
 *             .location(&#34;West US&#34;)
 *             .notifications(Map.ofEntries(
 *                 Map.entry(&#34;email&#34;, Map.ofEntries(
 *                     Map.entry(&#34;customEmails&#34;,                     
 *                         &#34;gu@ms.com&#34;,
 *                         &#34;ge@ns.net&#34;),
 *                     Map.entry(&#34;sendToSubscriptionAdministrator&#34;, true),
 *                     Map.entry(&#34;sendToSubscriptionCoAdministrators&#34;, true)
 *                 )),
 *                 Map.entry(&#34;operation&#34;, &#34;Scale&#34;),
 *                 Map.entry(&#34;webhooks&#34;, Map.ofEntries(
 *                     Map.entry(&#34;properties&#34;, ),
 *                     Map.entry(&#34;serviceUri&#34;, &#34;http://myservice.com&#34;)
 *                 ))
 *             ))
 *             .profiles(            
 *                 Map.ofEntries(
 *                     Map.entry(&#34;capacity&#34;, Map.ofEntries(
 *                         Map.entry(&#34;default&#34;, &#34;1&#34;),
 *                         Map.entry(&#34;maximum&#34;, &#34;10&#34;),
 *                         Map.entry(&#34;minimum&#34;, &#34;1&#34;)
 *                     )),
 *                     Map.entry(&#34;fixedDate&#34;, Map.ofEntries(
 *                         Map.entry(&#34;end&#34;, &#34;2015-03-05T14:30:00Z&#34;),
 *                         Map.entry(&#34;start&#34;, &#34;2015-03-05T14:00:00Z&#34;),
 *                         Map.entry(&#34;timeZone&#34;, &#34;UTC&#34;)
 *                     )),
 *                     Map.entry(&#34;name&#34;, &#34;adios&#34;),
 *                     Map.entry(&#34;rules&#34;,                     
 *                         Map.ofEntries(
 *                             Map.entry(&#34;metricTrigger&#34;, Map.ofEntries(
 *                                 Map.entry(&#34;dividePerInstance&#34;, false),
 *                                 Map.entry(&#34;metricName&#34;, &#34;Percentage CPU&#34;),
 *                                 Map.entry(&#34;metricResourceUri&#34;, &#34;/subscriptions/b67f7fec-69fc-4974-9099-a26bd6ffeda3/resourceGroups/TestingMetricsScaleSet/providers/Microsoft.Compute/virtualMachineScaleSets/testingsc&#34;),
 *                                 Map.entry(&#34;operator&#34;, &#34;GreaterThan&#34;),
 *                                 Map.entry(&#34;statistic&#34;, &#34;Average&#34;),
 *                                 Map.entry(&#34;threshold&#34;, 10),
 *                                 Map.entry(&#34;timeAggregation&#34;, &#34;Average&#34;),
 *                                 Map.entry(&#34;timeGrain&#34;, &#34;PT1M&#34;),
 *                                 Map.entry(&#34;timeWindow&#34;, &#34;PT5M&#34;)
 *                             )),
 *                             Map.entry(&#34;scaleAction&#34;, Map.ofEntries(
 *                                 Map.entry(&#34;cooldown&#34;, &#34;PT5M&#34;),
 *                                 Map.entry(&#34;direction&#34;, &#34;Increase&#34;),
 *                                 Map.entry(&#34;type&#34;, &#34;ChangeCount&#34;),
 *                                 Map.entry(&#34;value&#34;, &#34;1&#34;)
 *                             ))
 *                         ),
 *                         Map.ofEntries(
 *                             Map.entry(&#34;metricTrigger&#34;, Map.ofEntries(
 *                                 Map.entry(&#34;dividePerInstance&#34;, false),
 *                                 Map.entry(&#34;metricName&#34;, &#34;Percentage CPU&#34;),
 *                                 Map.entry(&#34;metricResourceUri&#34;, &#34;/subscriptions/b67f7fec-69fc-4974-9099-a26bd6ffeda3/resourceGroups/TestingMetricsScaleSet/providers/Microsoft.Compute/virtualMachineScaleSets/testingsc&#34;),
 *                                 Map.entry(&#34;operator&#34;, &#34;GreaterThan&#34;),
 *                                 Map.entry(&#34;statistic&#34;, &#34;Average&#34;),
 *                                 Map.entry(&#34;threshold&#34;, 15),
 *                                 Map.entry(&#34;timeAggregation&#34;, &#34;Average&#34;),
 *                                 Map.entry(&#34;timeGrain&#34;, &#34;PT2M&#34;),
 *                                 Map.entry(&#34;timeWindow&#34;, &#34;PT5M&#34;)
 *                             )),
 *                             Map.entry(&#34;scaleAction&#34;, Map.ofEntries(
 *                                 Map.entry(&#34;cooldown&#34;, &#34;PT6M&#34;),
 *                                 Map.entry(&#34;direction&#34;, &#34;Decrease&#34;),
 *                                 Map.entry(&#34;type&#34;, &#34;ChangeCount&#34;),
 *                                 Map.entry(&#34;value&#34;, &#34;2&#34;)
 *                             ))
 *                         ))
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;capacity&#34;, Map.ofEntries(
 *                         Map.entry(&#34;default&#34;, &#34;1&#34;),
 *                         Map.entry(&#34;maximum&#34;, &#34;10&#34;),
 *                         Map.entry(&#34;minimum&#34;, &#34;1&#34;)
 *                     )),
 *                     Map.entry(&#34;name&#34;, &#34;saludos&#34;),
 *                     Map.entry(&#34;recurrence&#34;, Map.ofEntries(
 *                         Map.entry(&#34;frequency&#34;, &#34;Week&#34;),
 *                         Map.entry(&#34;schedule&#34;, Map.ofEntries(
 *                             Map.entry(&#34;days&#34;, &#34;1&#34;),
 *                             Map.entry(&#34;hours&#34;, 5),
 *                             Map.entry(&#34;minutes&#34;, 15),
 *                             Map.entry(&#34;timeZone&#34;, &#34;UTC&#34;)
 *                         ))
 *                     )),
 *                     Map.entry(&#34;rules&#34;,                     
 *                         Map.ofEntries(
 *                             Map.entry(&#34;metricTrigger&#34;, Map.ofEntries(
 *                                 Map.entry(&#34;dividePerInstance&#34;, false),
 *                                 Map.entry(&#34;metricName&#34;, &#34;Percentage CPU&#34;),
 *                                 Map.entry(&#34;metricResourceUri&#34;, &#34;/subscriptions/b67f7fec-69fc-4974-9099-a26bd6ffeda3/resourceGroups/TestingMetricsScaleSet/providers/Microsoft.Compute/virtualMachineScaleSets/testingsc&#34;),
 *                                 Map.entry(&#34;operator&#34;, &#34;GreaterThan&#34;),
 *                                 Map.entry(&#34;statistic&#34;, &#34;Average&#34;),
 *                                 Map.entry(&#34;threshold&#34;, 10),
 *                                 Map.entry(&#34;timeAggregation&#34;, &#34;Average&#34;),
 *                                 Map.entry(&#34;timeGrain&#34;, &#34;PT1M&#34;),
 *                                 Map.entry(&#34;timeWindow&#34;, &#34;PT5M&#34;)
 *                             )),
 *                             Map.entry(&#34;scaleAction&#34;, Map.ofEntries(
 *                                 Map.entry(&#34;cooldown&#34;, &#34;PT5M&#34;),
 *                                 Map.entry(&#34;direction&#34;, &#34;Increase&#34;),
 *                                 Map.entry(&#34;type&#34;, &#34;ChangeCount&#34;),
 *                                 Map.entry(&#34;value&#34;, &#34;1&#34;)
 *                             ))
 *                         ),
 *                         Map.ofEntries(
 *                             Map.entry(&#34;metricTrigger&#34;, Map.ofEntries(
 *                                 Map.entry(&#34;dividePerInstance&#34;, false),
 *                                 Map.entry(&#34;metricName&#34;, &#34;Percentage CPU&#34;),
 *                                 Map.entry(&#34;metricResourceUri&#34;, &#34;/subscriptions/b67f7fec-69fc-4974-9099-a26bd6ffeda3/resourceGroups/TestingMetricsScaleSet/providers/Microsoft.Compute/virtualMachineScaleSets/testingsc&#34;),
 *                                 Map.entry(&#34;operator&#34;, &#34;GreaterThan&#34;),
 *                                 Map.entry(&#34;statistic&#34;, &#34;Average&#34;),
 *                                 Map.entry(&#34;threshold&#34;, 15),
 *                                 Map.entry(&#34;timeAggregation&#34;, &#34;Average&#34;),
 *                                 Map.entry(&#34;timeGrain&#34;, &#34;PT2M&#34;),
 *                                 Map.entry(&#34;timeWindow&#34;, &#34;PT5M&#34;)
 *                             )),
 *                             Map.entry(&#34;scaleAction&#34;, Map.ofEntries(
 *                                 Map.entry(&#34;cooldown&#34;, &#34;PT6M&#34;),
 *                                 Map.entry(&#34;direction&#34;, &#34;Decrease&#34;),
 *                                 Map.entry(&#34;type&#34;, &#34;ChangeCount&#34;),
 *                                 Map.entry(&#34;value&#34;, &#34;2&#34;)
 *                             ))
 *                         ))
 *                 ))
 *             .resourceGroupName(&#34;TestingMetricsScaleSet&#34;)
 *             .tags()
 *             .targetResourceUri(&#34;/subscriptions/b67f7fec-69fc-4974-9099-a26bd6ffeda3/resourceGroups/TestingMetricsScaleSet/providers/Microsoft.Compute/virtualMachineScaleSets/testingsc&#34;)
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
 * $ pulumi import azure-native:insights:AutoscaleSetting MySetting /subscriptions/b67f7fec-69fc-4974-9099-a26bd6ffeda3/resourceGroups/TestingMetricsScaleSet/providers/microsoft.insights/autoscalesettings/MySetting 
 * ```
 * 
 */
@ResourceType(type="azure-native:insights:AutoscaleSetting")
public class AutoscaleSetting extends com.pulumi.resources.CustomResource {
    /**
     * the enabled flag. Specifies whether automatic scaling is enabled for the resource. The default value is &#39;true&#39;.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return the enabled flag. Specifies whether automatic scaling is enabled for the resource. The default value is &#39;true&#39;.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
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
     * the collection of notifications.
     * 
     */
    @Export(name="notifications", type=List.class, parameters={AutoscaleNotificationResponse.class})
    private Output</* @Nullable */ List<AutoscaleNotificationResponse>> notifications;

    /**
     * @return the collection of notifications.
     * 
     */
    public Output<Optional<List<AutoscaleNotificationResponse>>> notifications() {
        return Codegen.optional(this.notifications);
    }
    /**
     * the collection of automatic scaling profiles that specify different scaling parameters for different time periods. A maximum of 20 profiles can be specified.
     * 
     */
    @Export(name="profiles", type=List.class, parameters={AutoscaleProfileResponse.class})
    private Output<List<AutoscaleProfileResponse>> profiles;

    /**
     * @return the collection of automatic scaling profiles that specify different scaling parameters for different time periods. A maximum of 20 profiles can be specified.
     * 
     */
    public Output<List<AutoscaleProfileResponse>> profiles() {
        return this.profiles;
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
     * the location of the resource that the autoscale setting should be added to.
     * 
     */
    @Export(name="targetResourceLocation", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetResourceLocation;

    /**
     * @return the location of the resource that the autoscale setting should be added to.
     * 
     */
    public Output<Optional<String>> targetResourceLocation() {
        return Codegen.optional(this.targetResourceLocation);
    }
    /**
     * the resource identifier of the resource that the autoscale setting should be added to.
     * 
     */
    @Export(name="targetResourceUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetResourceUri;

    /**
     * @return the resource identifier of the resource that the autoscale setting should be added to.
     * 
     */
    public Output<Optional<String>> targetResourceUri() {
        return Codegen.optional(this.targetResourceUri);
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
    public AutoscaleSetting(String name) {
        this(name, AutoscaleSettingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AutoscaleSetting(String name, AutoscaleSettingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AutoscaleSetting(String name, AutoscaleSettingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:AutoscaleSetting", name, args == null ? AutoscaleSettingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AutoscaleSetting(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:AutoscaleSetting", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:insights/v20140401:AutoscaleSetting").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20150401:AutoscaleSetting").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20210501preview:AutoscaleSetting").build())
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
    public static AutoscaleSetting get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AutoscaleSetting(name, id, options);
    }
}
