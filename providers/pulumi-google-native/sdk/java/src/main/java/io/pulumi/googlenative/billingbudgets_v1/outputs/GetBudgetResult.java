// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.billingbudgets_v1.outputs.GoogleCloudBillingBudgetsV1BudgetAmountResponse;
import io.pulumi.googlenative.billingbudgets_v1.outputs.GoogleCloudBillingBudgetsV1FilterResponse;
import io.pulumi.googlenative.billingbudgets_v1.outputs.GoogleCloudBillingBudgetsV1NotificationsRuleResponse;
import io.pulumi.googlenative.billingbudgets_v1.outputs.GoogleCloudBillingBudgetsV1ThresholdRuleResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetBudgetResult {
    /**
     * Budgeted amount.
     * 
     */
    private final GoogleCloudBillingBudgetsV1BudgetAmountResponse amount;
    /**
     * Optional. Filters that define which resources are used to compute the actual spend against the budget amount, such as projects, services, and the budget's time period, as well as other filters.
     * 
     */
    private final GoogleCloudBillingBudgetsV1FilterResponse budgetFilter;
    /**
     * User data for display name in UI. The name must be less than or equal to 60 characters.
     * 
     */
    private final String displayName;
    /**
     * Optional. Etag to validate that the object is unchanged for a read-modify-write operation. An empty etag causes an update to overwrite other changes.
     * 
     */
    private final String etag;
    /**
     * Resource name of the budget. The resource name implies the scope of a budget. Values are of the form `billingAccounts/{billingAccountId}/budgets/{budgetId}`.
     * 
     */
    private final String name;
    /**
     * Optional. Rules to apply to notifications sent based on budget spend and thresholds.
     * 
     */
    private final GoogleCloudBillingBudgetsV1NotificationsRuleResponse notificationsRule;
    /**
     * Optional. Rules that trigger alerts (notifications of thresholds being crossed) when spend exceeds the specified percentages of the budget. Optional for `pubsubTopic` notifications. Required if using email notifications.
     * 
     */
    private final List<GoogleCloudBillingBudgetsV1ThresholdRuleResponse> thresholdRules;

    @OutputCustomType.Constructor
    private GetBudgetResult(
        @OutputCustomType.Parameter("amount") GoogleCloudBillingBudgetsV1BudgetAmountResponse amount,
        @OutputCustomType.Parameter("budgetFilter") GoogleCloudBillingBudgetsV1FilterResponse budgetFilter,
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("notificationsRule") GoogleCloudBillingBudgetsV1NotificationsRuleResponse notificationsRule,
        @OutputCustomType.Parameter("thresholdRules") List<GoogleCloudBillingBudgetsV1ThresholdRuleResponse> thresholdRules) {
        this.amount = amount;
        this.budgetFilter = budgetFilter;
        this.displayName = displayName;
        this.etag = etag;
        this.name = name;
        this.notificationsRule = notificationsRule;
        this.thresholdRules = thresholdRules;
    }

    /**
     * Budgeted amount.
     * 
    */
    public GoogleCloudBillingBudgetsV1BudgetAmountResponse getAmount() {
        return this.amount;
    }
    /**
     * Optional. Filters that define which resources are used to compute the actual spend against the budget amount, such as projects, services, and the budget's time period, as well as other filters.
     * 
    */
    public GoogleCloudBillingBudgetsV1FilterResponse getBudgetFilter() {
        return this.budgetFilter;
    }
    /**
     * User data for display name in UI. The name must be less than or equal to 60 characters.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Optional. Etag to validate that the object is unchanged for a read-modify-write operation. An empty etag causes an update to overwrite other changes.
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
     * Optional. Rules to apply to notifications sent based on budget spend and thresholds.
     * 
    */
    public GoogleCloudBillingBudgetsV1NotificationsRuleResponse getNotificationsRule() {
        return this.notificationsRule;
    }
    /**
     * Optional. Rules that trigger alerts (notifications of thresholds being crossed) when spend exceeds the specified percentages of the budget. Optional for `pubsubTopic` notifications. Required if using email notifications.
     * 
    */
    public List<GoogleCloudBillingBudgetsV1ThresholdRuleResponse> getThresholdRules() {
        return this.thresholdRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBudgetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudBillingBudgetsV1BudgetAmountResponse amount;
        private GoogleCloudBillingBudgetsV1FilterResponse budgetFilter;
        private String displayName;
        private String etag;
        private String name;
        private GoogleCloudBillingBudgetsV1NotificationsRuleResponse notificationsRule;
        private List<GoogleCloudBillingBudgetsV1ThresholdRuleResponse> thresholdRules;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBudgetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amount = defaults.amount;
    	      this.budgetFilter = defaults.budgetFilter;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.name = defaults.name;
    	      this.notificationsRule = defaults.notificationsRule;
    	      this.thresholdRules = defaults.thresholdRules;
        }

        public Builder amount(GoogleCloudBillingBudgetsV1BudgetAmountResponse amount) {
            this.amount = Objects.requireNonNull(amount);
            return this;
        }

        public Builder budgetFilter(GoogleCloudBillingBudgetsV1FilterResponse budgetFilter) {
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

        public Builder notificationsRule(GoogleCloudBillingBudgetsV1NotificationsRuleResponse notificationsRule) {
            this.notificationsRule = Objects.requireNonNull(notificationsRule);
            return this;
        }

        public Builder thresholdRules(List<GoogleCloudBillingBudgetsV1ThresholdRuleResponse> thresholdRules) {
            this.thresholdRules = Objects.requireNonNull(thresholdRules);
            return this;
        }
        public GetBudgetResult build() {
            return new GetBudgetResult(amount, budgetFilter, displayName, etag, name, notificationsRule, thresholdRules);
        }
    }
}
