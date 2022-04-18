// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.cdn.RuleArgs;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleCacheExpirationActionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleCacheKeyQueryStringActionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleCookiesConditionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleHttpVersionConditionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleIsDeviceConditionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRulePostArgsConditionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleQueryStringConditionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleRemoteAddressConditionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleRequestBodyConditionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleRequestHeaderActionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleRequestHeaderConditionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleRequestMethodConditionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleRequestSchemeConditionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleRequestUriConditionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleResponseHeaderActionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleUrlFileExtensionConditionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleUrlFileNameConditionResponse;
import com.pulumi.azurenative.cdn.outputs.DeliveryRuleUrlPathConditionResponse;
import com.pulumi.azurenative.cdn.outputs.OriginGroupOverrideActionResponse;
import com.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import com.pulumi.azurenative.cdn.outputs.UrlRedirectActionResponse;
import com.pulumi.azurenative.cdn.outputs.UrlRewriteActionResponse;
import com.pulumi.azurenative.cdn.outputs.UrlSigningActionResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Friendly Rules name mapping to the any Rules or secret related information.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:cdn:Rule rule1 /subscriptions/subid/resourcegroups/RG/providers/Microsoft.Cdn/profiles/profile1/ruleSets/ruleSet1/rules/rule1 
 * ```
 * 
 */
@ResourceType(type="azure-native:cdn:Rule")
public class Rule extends com.pulumi.resources.CustomResource {
    /**
     * A list of actions that are executed when all the conditions of a rule are satisfied.
     * 
     */
    @Export(name="actions", type=List.class, parameters={Object.class})
    private Output<List<Object>> actions;

    /**
     * @return A list of actions that are executed when all the conditions of a rule are satisfied.
     * 
     */
    public Output<List<Object>> actions() {
        return this.actions;
    }
    /**
     * A list of conditions that must be matched for the actions to be executed
     * 
     */
    @Export(name="conditions", type=List.class, parameters={Object.class})
    private Output</* @Nullable */ List<Object>> conditions;

    /**
     * @return A list of conditions that must be matched for the actions to be executed
     * 
     */
    public Output</* @Nullable */ List<Object>> conditions() {
        return this.conditions;
    }
    @Export(name="deploymentStatus", type=String.class, parameters={})
    private Output<String> deploymentStatus;

    public Output<String> deploymentStatus() {
        return this.deploymentStatus;
    }
    /**
     * If this rule is a match should the rules engine continue running the remaining rules or stop. If not present, defaults to Continue.
     * 
     */
    @Export(name="matchProcessingBehavior", type=String.class, parameters={})
    private Output</* @Nullable */ String> matchProcessingBehavior;

    /**
     * @return If this rule is a match should the rules engine continue running the remaining rules or stop. If not present, defaults to Continue.
     * 
     */
    public Output</* @Nullable */ String> matchProcessingBehavior() {
        return this.matchProcessingBehavior;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The order in which the rules are applied for the endpoint. Possible values {0,1,2,3,………}. A rule with a lesser order will be applied before a rule with a greater order. Rule with order 0 is a special rule. It does not require any condition and actions listed in it will always be applied.
     * 
     */
    @Export(name="order", type=Integer.class, parameters={})
    private Output<Integer> order;

    /**
     * @return The order in which the rules are applied for the endpoint. Possible values {0,1,2,3,………}. A rule with a lesser order will be applied before a rule with a greater order. Rule with order 0 is a special rule. It does not require any condition and actions listed in it will always be applied.
     * 
     */
    public Output<Integer> order() {
        return this.order;
    }
    /**
     * Provisioning status
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning status
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Read only system data
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Read only system data
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Rule(String name) {
        this(name, RuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Rule(String name, RuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Rule(String name, RuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:Rule", name, args == null ? RuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Rule(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:Rule", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:cdn/v20200901:Rule").build()),
                Output.of(Alias.builder().type("azure-native:cdn/v20210601:Rule").build())
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
    public static Rule get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Rule(name, id, options);
    }
}
