// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.extendedlocation;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.extendedlocation.ResourceSyncRuleArgs;
import com.pulumi.azurenative.extendedlocation.outputs.ResourceSyncRulePropertiesResponseSelector;
import com.pulumi.azurenative.extendedlocation.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Sync Rules definition.
 * API Version: 2021-08-31-preview.
 * 
 * ## Example Usage
 * ### Create/Update Resource Sync Rule
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
 *         var resourceSyncRule = new ResourceSyncRule(&#34;resourceSyncRule&#34;, ResourceSyncRuleArgs.builder()        
 *             .childResourceName(&#34;resourceSyncRule01&#34;)
 *             .location(&#34;West US&#34;)
 *             .priority(999)
 *             .resourceGroupName(&#34;testresourcegroup&#34;)
 *             .resourceName(&#34;customLocation01&#34;)
 *             .selector(Map.of(&#34;matchLabels&#34;, Map.of(&#34;key1&#34;, &#34;value1&#34;)))
 *             .targetResourceGroup(&#34;/subscriptions/11111111-2222-3333-4444-555555555555/resourceGroups/testresourcegroup&#34;)
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
 * $ pulumi import azure-native:extendedlocation:ResourceSyncRule resourceSyncRule01 /subscriptions/11111111-2222-3333-4444-555555555555/resourceGroups/testresourcegroup/providers/Microsoft.ExtendedLocation/customLocations/customLocation01/resourcesyncrules/resourceSyncRule01 
 * ```
 * 
 */
@ResourceType(type="azure-native:extendedlocation:ResourceSyncRule")
public class ResourceSyncRule extends com.pulumi.resources.CustomResource {
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Priority represents a priority of the Resource Sync Rule
     * 
     */
    @Export(name="priority", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> priority;

    /**
     * @return Priority represents a priority of the Resource Sync Rule
     * 
     */
    public Output<Optional<Integer>> priority() {
        return Codegen.optional(this.priority);
    }
    /**
     * Provisioning State for the Resource Sync Rule.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning State for the Resource Sync Rule.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * A label selector is composed of two parts, matchLabels and matchExpressions. The first part, matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is &#39;key&#39;, the operator is &#39;In&#39;, and the values array contains only &#39;value&#39;. The second part, matchExpressions is a list of resource selector requirements. Valid operators include In, NotIn, Exists, and DoesNotExist. The values set must be non-empty in the case of In and NotIn. The values set must be empty in the case of Exists and DoesNotExist. All of the requirements, from both matchLabels and matchExpressions must all be satisfied in order to match.
     * 
     */
    @Export(name="selector", type=ResourceSyncRulePropertiesResponseSelector.class, parameters={})
    private Output</* @Nullable */ ResourceSyncRulePropertiesResponseSelector> selector;

    /**
     * @return A label selector is composed of two parts, matchLabels and matchExpressions. The first part, matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is &#39;key&#39;, the operator is &#39;In&#39;, and the values array contains only &#39;value&#39;. The second part, matchExpressions is a list of resource selector requirements. Valid operators include In, NotIn, Exists, and DoesNotExist. The values set must be non-empty in the case of In and NotIn. The values set must be empty in the case of Exists and DoesNotExist. All of the requirements, from both matchLabels and matchExpressions must all be satisfied in order to match.
     * 
     */
    public Output<Optional<ResourceSyncRulePropertiesResponseSelector>> selector() {
        return Codegen.optional(this.selector);
    }
    /**
     * Metadata pertaining to creation and last modification of the resource
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * For an unmapped custom resource, its labels will be used to find matching resource sync rules. If this resource sync rule is one of the matching rules with highest priority, then the unmapped custom resource will be projected to the target resource group associated with this resource sync rule. The user creating this resource sync rule should have write permissions on the target resource group and this write permission will be validated when creating the resource sync rule.
     * 
     */
    @Export(name="targetResourceGroup", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetResourceGroup;

    /**
     * @return For an unmapped custom resource, its labels will be used to find matching resource sync rules. If this resource sync rule is one of the matching rules with highest priority, then the unmapped custom resource will be projected to the target resource group associated with this resource sync rule. The user creating this resource sync rule should have write permissions on the target resource group and this write permission will be validated when creating the resource sync rule.
     * 
     */
    public Output<Optional<String>> targetResourceGroup() {
        return Codegen.optional(this.targetResourceGroup);
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourceSyncRule(String name) {
        this(name, ResourceSyncRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceSyncRule(String name, ResourceSyncRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceSyncRule(String name, ResourceSyncRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:extendedlocation:ResourceSyncRule", name, args == null ? ResourceSyncRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResourceSyncRule(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:extendedlocation:ResourceSyncRule", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:extendedlocation/v20210831preview:ResourceSyncRule").build())
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
    public static ResourceSyncRule get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResourceSyncRule(name, id, options);
    }
}
