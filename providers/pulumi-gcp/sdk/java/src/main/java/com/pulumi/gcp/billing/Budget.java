// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.billing;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.billing.BudgetArgs;
import com.pulumi.gcp.billing.inputs.BudgetState;
import com.pulumi.gcp.billing.outputs.BudgetAllUpdatesRule;
import com.pulumi.gcp.billing.outputs.BudgetAmount;
import com.pulumi.gcp.billing.outputs.BudgetBudgetFilter;
import com.pulumi.gcp.billing.outputs.BudgetThresholdRule;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Budget configuration for a billing account.
 * 
 * To get more information about Budget, see:
 * 
 * * [API documentation](https://cloud.google.com/billing/docs/reference/budget/rest/v1/billingAccounts.budgets)
 * * How-to Guides
 *     * [Creating a budget](https://cloud.google.com/billing/docs/how-to/budgets)
 * 
 * > **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
 * you must specify a `billing_project` and set `user_project_override` to true
 * in the provider configuration. Otherwise the Billing Budgets API will return a 403 error.
 * Your account must have the `serviceusage.services.use` permission on the
 * `billing_project` you defined.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Budget can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:billing/budget:Budget default billingAccounts/{{billing_account}}/budgets/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:billing/budget:Budget default {{billing_account}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:billing/budget:Budget default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:billing/budget:Budget")
public class Budget extends com.pulumi.resources.CustomResource {
    /**
     * Defines notifications that are sent on every update to the
     * billing account's spend, regardless of the thresholds defined
     * using threshold rules.
     * Structure is documented below.
     * 
     */
    @Export(name="allUpdatesRule", type=BudgetAllUpdatesRule.class, parameters={})
    private Output</* @Nullable */ BudgetAllUpdatesRule> allUpdatesRule;

    /**
     * @return Defines notifications that are sent on every update to the
     * billing account's spend, regardless of the thresholds defined
     * using threshold rules.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ BudgetAllUpdatesRule> allUpdatesRule() {
        return this.allUpdatesRule;
    }
    /**
     * The budgeted amount for each usage period.
     * Structure is documented below.
     * 
     */
    @Export(name="amount", type=BudgetAmount.class, parameters={})
    private Output<BudgetAmount> amount;

    /**
     * @return The budgeted amount for each usage period.
     * Structure is documented below.
     * 
     */
    public Output<BudgetAmount> amount() {
        return this.amount;
    }
    /**
     * ID of the billing account to set a budget on.
     * 
     */
    @Export(name="billingAccount", type=String.class, parameters={})
    private Output<String> billingAccount;

    /**
     * @return ID of the billing account to set a budget on.
     * 
     */
    public Output<String> billingAccount() {
        return this.billingAccount;
    }
    /**
     * Filters that define which resources are used to compute the actual
     * spend against the budget.
     * Structure is documented below.
     * 
     */
    @Export(name="budgetFilter", type=BudgetBudgetFilter.class, parameters={})
    private Output<BudgetBudgetFilter> budgetFilter;

    /**
     * @return Filters that define which resources are used to compute the actual
     * spend against the budget.
     * Structure is documented below.
     * 
     */
    public Output<BudgetBudgetFilter> budgetFilter() {
        return this.budgetFilter;
    }
    /**
     * User data for display name in UI. Must be <= 60 chars.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return User data for display name in UI. Must be <= 60 chars.
     * 
     */
    public Output</* @Nullable */ String> displayName() {
        return this.displayName;
    }
    /**
     * Resource name of the budget. The resource name implies the scope of a budget. Values are of the form
     * billingAccounts/{billingAccountId}/budgets/{budgetId}.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of the budget. The resource name implies the scope of a budget. Values are of the form
     * billingAccounts/{billingAccountId}/budgets/{budgetId}.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Rules that trigger alerts (notifications of thresholds being
     * crossed) when spend exceeds the specified percentages of the
     * budget.
     * Structure is documented below.
     * 
     */
    @Export(name="thresholdRules", type=List.class, parameters={BudgetThresholdRule.class})
    private Output<List<BudgetThresholdRule>> thresholdRules;

    /**
     * @return Rules that trigger alerts (notifications of thresholds being
     * crossed) when spend exceeds the specified percentages of the
     * budget.
     * Structure is documented below.
     * 
     */
    public Output<List<BudgetThresholdRule>> thresholdRules() {
        return this.thresholdRules;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Budget(String name) {
        this(name, BudgetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Budget(String name, BudgetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Budget(String name, BudgetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:billing/budget:Budget", name, args == null ? BudgetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Budget(String name, Output<String> id, @Nullable BudgetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:billing/budget:Budget", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Budget get(String name, Output<String> id, @Nullable BudgetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Budget(name, id, state, options);
    }
}
