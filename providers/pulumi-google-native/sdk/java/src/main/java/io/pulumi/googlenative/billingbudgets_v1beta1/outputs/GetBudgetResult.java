// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.billingbudgets_v1beta1.outputs.GoogleCloudBillingBudgetsV1beta1AllUpdatesRuleResponse;
import io.pulumi.googlenative.billingbudgets_v1beta1.outputs.GoogleCloudBillingBudgetsV1beta1BudgetAmountResponse;
import io.pulumi.googlenative.billingbudgets_v1beta1.outputs.GoogleCloudBillingBudgetsV1beta1FilterResponse;
import io.pulumi.googlenative.billingbudgets_v1beta1.outputs.GoogleCloudBillingBudgetsV1beta1ThresholdRuleResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetBudgetResult {
    /**
     * Optional. Rules to apply to notifications sent based on budget spend and thresholds.
     * 
     */
    private final GoogleCloudBillingBudgetsV1beta1AllUpdatesRuleResponse allUpdatesRule;
    /**
     * Budgeted amount.
     * 
     */
    private final GoogleCloudBillingBudgetsV1beta1BudgetAmountResponse amount;
    /**
     * Optional. Filters that define which resources are used to compute the actual spend against the budget amount, such as projects, services, and the budget's time period, as well as other filters.
     * 
     */
    private final GoogleCloudBillingBudgetsV1beta1FilterResponse budgetFilter;
    /**
     * User data for display name in UI. Validation: <= 60 chars.
     * 
     */
    private final String displayName;
    /**
     * Optional. Etag to validate that the object is unchanged for a read-modify-write operation. An empty etag will cause an update to overwrite other changes.
     * 
     */
    private final String etag;
    /**
     * Resource name of the budget. The resource name implies the scope of a budget. Values are of the form `billingAccounts/{billingAccountId}/budgets/{budgetId}`.
     * 
     */
    private final String name;
    /**
     * Optional. Rules that trigger alerts (notifications of thresholds being crossed) when spend exceeds the specified percentages of the budget. Optional for `pubsubTopic` notifications. Required if using email notifications.
     * 
     */
    private final List<GoogleCloudBillingBudgetsV1beta1ThresholdRuleResponse> thresholdRules;

    @OutputCustomType.Constructor
    private GetBudgetResult(
        @OutputCustomType.Parameter("allUpdatesRule") GoogleCloudBillingBudgetsV1beta1AllUpdatesRuleResponse allUpdatesRule,
        @OutputCustomType.Parameter("amount") GoogleCloudBillingBudgetsV1beta1BudgetAmountResponse amount,
        @OutputCustomType.Parameter("budgetFilter") GoogleCloudBillingBudgetsV1beta1FilterResponse budgetFilter,
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("thresholdRules") List<GoogleCloudBillingBudgetsV1beta1ThresholdRuleResponse> thresholdRules) {
        this.allUpdatesRule = allUpdatesRule;
        this.amount = amount;
        this.budgetFilter = budgetFilter;
        this.displayName = displayName;
        this.etag = etag;
        this.name = name;
        this.thresholdRules = thresholdRules;
    }

    /**
     * Optional. Rules to apply to notifications sent based on budget spend and thresholds.
     * 
    */
    public GoogleCloudBillingBudgetsV1beta1AllUpdatesRuleResponse getAllUpdatesRule() {
        return this.allUpdatesRule;
    }
    /**
     * Budgeted amount.
     * 
    */
    public GoogleCloudBillingBudgetsV1beta1BudgetAmountResponse getAmount() {
        return this.amount;
    }
    /**
     * Optional. Filters that define which resources are used to compute the actual spend against the budget amount, such as projects, services, and the budget's time period, as well as other filters.
     * 
    */
    public GoogleCloudBillingBudgetsV1beta1FilterResponse getBudgetFilter() {
        return this.budgetFilter;
    }
    /**
     * User data for display name in UI. Validation: <= 60 chars.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Optional. Etag to validate that the object is unchanged for a read-modify-write operation. An empty etag will cause an update to overwrite other changes.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource name of the budget. The resource name implies the scope of a budget. Values are of the form `billingAccounts/{billingAccountId}/budgets/{budgetId}`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Optional. Rules that trigger alerts (notifications of thresholds being crossed) when spend exceeds the specified percentages of the budget. Optional for `pubsubTopic` notifications. Required if using email notifications.
     * 
    */
    public List<GoogleCloudBillingBudgetsV1beta1ThresholdRuleResponse> getThresholdRules() {
        return this.thresholdRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBudgetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudBillingBudgetsV1beta1AllUpdatesRuleResponse allUpdatesRule;
        private GoogleCloudBillingBudgetsV1beta1BudgetAmountResponse amount;
        private GoogleCloudBillingBudgetsV1beta1FilterResponse budgetFilter;
        private String displayName;
        private String etag;
        private String name;
        private List<GoogleCloudBillingBudgetsV1beta1ThresholdRuleResponse> thresholdRules;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBudgetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allUpdatesRule = defaults.allUpdatesRule;
    	      this.amount = defaults.amount;
    	      this.budgetFilter = defaults.budgetFilter;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.name = defaults.name;
    	      this.thresholdRules = defaults.thresholdRules;
        }

        public Builder allUpdatesRule(GoogleCloudBillingBudgetsV1beta1AllUpdatesRuleResponse allUpdatesRule) {
            this.allUpdatesRule = Objects.requireNonNull(allUpdatesRule);
            return this;
        }

        public Builder amount(GoogleCloudBillingBudgetsV1beta1BudgetAmountResponse amount) {
            this.amount = Objects.requireNonNull(amount);
            return this;
        }

        public Builder budgetFilter(GoogleCloudBillingBudgetsV1beta1FilterResponse budgetFilter) {
            this.budgetFilter = Objects.requireNonNull(budgetFilter);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder thresholdRules(List<GoogleCloudBillingBudgetsV1beta1ThresholdRuleResponse> thresholdRules) {
            this.thresholdRules = Objects.requireNonNull(thresholdRules);
            return this;
        }
        public GetBudgetResult build() {
            return new GetBudgetResult(allUpdatesRule, amount, budgetFilter, displayName, etag, name, thresholdRules);
        }
    }
}
