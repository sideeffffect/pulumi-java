// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.authorization.PolicyDefinitionAtManagementGroupArgs;
import com.pulumi.azurenative.authorization.outputs.ParameterDefinitionsValueResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The policy definition.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * ### Create or update a policy definition at management group level
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
 *         var policyDefinitionAtManagementGroup = new PolicyDefinitionAtManagementGroup(&#34;policyDefinitionAtManagementGroup&#34;, PolicyDefinitionAtManagementGroupArgs.builder()        
 *             .description(&#34;Force resource names to begin with given &#39;prefix&#39; and/or end with given &#39;suffix&#39;&#34;)
 *             .displayName(&#34;Enforce resource naming convention&#34;)
 *             .managementGroupId(&#34;MyManagementGroup&#34;)
 *             .metadata(Map.of(&#34;category&#34;, &#34;Naming&#34;))
 *             .mode(&#34;All&#34;)
 *             .parameters(Map.ofEntries(
 *                 Map.entry(&#34;prefix&#34;, Map.ofEntries(
 *                     Map.entry(&#34;metadata&#34;, Map.ofEntries(
 *                         Map.entry(&#34;description&#34;, &#34;Resource name prefix&#34;),
 *                         Map.entry(&#34;displayName&#34;, &#34;Prefix&#34;)
 *                     )),
 *                     Map.entry(&#34;type&#34;, &#34;String&#34;)
 *                 )),
 *                 Map.entry(&#34;suffix&#34;, Map.ofEntries(
 *                     Map.entry(&#34;metadata&#34;, Map.ofEntries(
 *                         Map.entry(&#34;description&#34;, &#34;Resource name suffix&#34;),
 *                         Map.entry(&#34;displayName&#34;, &#34;Suffix&#34;)
 *                     )),
 *                     Map.entry(&#34;type&#34;, &#34;String&#34;)
 *                 ))
 *             ))
 *             .policyDefinitionName(&#34;ResourceNaming&#34;)
 *             .policyRule(Map.ofEntries(
 *                 Map.entry(&#34;if&#34;, Map.of(&#34;not&#34;, Map.ofEntries(
 *                     Map.entry(&#34;field&#34;, &#34;name&#34;),
 *                     Map.entry(&#34;like&#34;, &#34;[concat(parameters(&#39;prefix&#39;), &#39;*&#39;, parameters(&#39;suffix&#39;))]&#34;)
 *                 ))),
 *                 Map.entry(&#34;then&#34;, Map.of(&#34;effect&#34;, &#34;deny&#34;))
 *             ))
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
 * $ pulumi import azure-native:authorization:PolicyDefinitionAtManagementGroup ResourceNaming /providers/Microsoft.Management/managementgroups/MyManagementGroup/providers/Microsoft.Authorization/policyDefinitions/ResourceNaming 
 * ```
 * 
 */
@ResourceType(type="azure-native:authorization:PolicyDefinitionAtManagementGroup")
public class PolicyDefinitionAtManagementGroup extends com.pulumi.resources.CustomResource {
    /**
     * The policy definition description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The policy definition description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The display name of the policy definition.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The display name of the policy definition.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * The policy definition metadata.  Metadata is an open ended object and is typically a collection of key value pairs.
     * 
     */
    @Export(name="metadata", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> metadata;

    /**
     * @return The policy definition metadata.  Metadata is an open ended object and is typically a collection of key value pairs.
     * 
     */
    public Output<Optional<Object>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * The policy definition mode. Some examples are All, Indexed, Microsoft.KeyVault.Data.
     * 
     */
    @Export(name="mode", type=String.class, parameters={})
    private Output</* @Nullable */ String> mode;

    /**
     * @return The policy definition mode. Some examples are All, Indexed, Microsoft.KeyVault.Data.
     * 
     */
    public Output<Optional<String>> mode() {
        return Codegen.optional(this.mode);
    }
    /**
     * The name of the policy definition.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the policy definition.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The parameter definitions for parameters used in the policy rule. The keys are the parameter names.
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, ParameterDefinitionsValueResponse.class})
    private Output</* @Nullable */ Map<String,ParameterDefinitionsValueResponse>> parameters;

    /**
     * @return The parameter definitions for parameters used in the policy rule. The keys are the parameter names.
     * 
     */
    public Output<Optional<Map<String,ParameterDefinitionsValueResponse>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * The policy rule.
     * 
     */
    @Export(name="policyRule", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> policyRule;

    /**
     * @return The policy rule.
     * 
     */
    public Output<Optional<Object>> policyRule() {
        return Codegen.optional(this.policyRule);
    }
    /**
     * The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
     * 
     */
    @Export(name="policyType", type=String.class, parameters={})
    private Output</* @Nullable */ String> policyType;

    /**
     * @return The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
     * 
     */
    public Output<Optional<String>> policyType() {
        return Codegen.optional(this.policyType);
    }
    /**
     * The type of the resource (Microsoft.Authorization/policyDefinitions).
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource (Microsoft.Authorization/policyDefinitions).
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PolicyDefinitionAtManagementGroup(String name) {
        this(name, PolicyDefinitionAtManagementGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PolicyDefinitionAtManagementGroup(String name, PolicyDefinitionAtManagementGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PolicyDefinitionAtManagementGroup(String name, PolicyDefinitionAtManagementGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:PolicyDefinitionAtManagementGroup", name, args == null ? PolicyDefinitionAtManagementGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PolicyDefinitionAtManagementGroup(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:PolicyDefinitionAtManagementGroup", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:authorization/v20161201:PolicyDefinitionAtManagementGroup").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20180301:PolicyDefinitionAtManagementGroup").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20180501:PolicyDefinitionAtManagementGroup").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20190101:PolicyDefinitionAtManagementGroup").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20190601:PolicyDefinitionAtManagementGroup").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20190901:PolicyDefinitionAtManagementGroup").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20200301:PolicyDefinitionAtManagementGroup").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20200901:PolicyDefinitionAtManagementGroup").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20210601:PolicyDefinitionAtManagementGroup").build())
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
    public static PolicyDefinitionAtManagementGroup get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PolicyDefinitionAtManagementGroup(name, id, options);
    }
}
