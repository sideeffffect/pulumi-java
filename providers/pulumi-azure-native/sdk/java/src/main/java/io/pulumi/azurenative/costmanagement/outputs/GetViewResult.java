// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.azurenative.costmanagement.outputs.KpiPropertiesResponse;
import io.pulumi.azurenative.costmanagement.outputs.PivotPropertiesResponse;
import io.pulumi.azurenative.costmanagement.outputs.ReportConfigDatasetResponse;
import io.pulumi.azurenative.costmanagement.outputs.ReportConfigTimePeriodResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetViewResult {
    /**
     * Show costs accumulated over time.
     * 
     */
    private final @Nullable String accumulated;
    /**
     * Chart type of the main view in Cost Analysis. Required.
     * 
     */
    private final @Nullable String chart;
    /**
     * Date the user created this view.
     * 
     */
    private final String createdOn;
    /**
     * Selected currency.
     * 
     */
    private final String currency;
    /**
     * Has definition for data in this report config.
     * 
     */
    private final @Nullable ReportConfigDatasetResponse dataSet;
    /**
     * Selected date range for viewing cost in.
     * 
     */
    private final String dateRange;
    /**
     * User input name of the view. Required.
     * 
     */
    private final @Nullable String displayName;
    /**
     * eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     * 
     */
    private final @Nullable String eTag;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Include monetary commitment
     * 
     */
    private final Boolean includeMonetaryCommitment;
    /**
     * List of KPIs to show in Cost Analysis UI.
     * 
     */
    private final @Nullable List<KpiPropertiesResponse> kpis;
    /**
     * Metric to use when displaying costs.
     * 
     */
    private final @Nullable String metric;
    /**
     * Date when the user last modified this view.
     * 
     */
    private final String modifiedOn;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Configuration of 3 sub-views in the Cost Analysis UI.
     * 
     */
    private final @Nullable List<PivotPropertiesResponse> pivots;
    /**
     * Cost Management scope to save the view on. This includes 'subscriptions/{subscriptionId}' for subscription scope, 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}' for EnrollmentAccount scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for BillingProfile scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for InvoiceSection scope, 'providers/Microsoft.Management/managementGroups/{managementGroupId}' for Management Group scope, '/providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}' for ExternalBillingAccount scope, and '/providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}' for ExternalSubscription scope.
     * 
     */
    private final @Nullable String scope;
    /**
     * Has time period for pulling data for the report.
     * 
     */
    private final @Nullable ReportConfigTimePeriodResponse timePeriod;
    /**
     * The time frame for pulling data for the report. If custom, then a specific time period must be provided.
     * 
     */
    private final String timeframe;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetViewResult(
        @OutputCustomType.Parameter("accumulated") @Nullable String accumulated,
        @OutputCustomType.Parameter("chart") @Nullable String chart,
        @OutputCustomType.Parameter("createdOn") String createdOn,
        @OutputCustomType.Parameter("currency") String currency,
        @OutputCustomType.Parameter("dataSet") @Nullable ReportConfigDatasetResponse dataSet,
        @OutputCustomType.Parameter("dateRange") String dateRange,
        @OutputCustomType.Parameter("displayName") @Nullable String displayName,
        @OutputCustomType.Parameter("eTag") @Nullable String eTag,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("includeMonetaryCommitment") Boolean includeMonetaryCommitment,
        @OutputCustomType.Parameter("kpis") @Nullable List<KpiPropertiesResponse> kpis,
        @OutputCustomType.Parameter("metric") @Nullable String metric,
        @OutputCustomType.Parameter("modifiedOn") String modifiedOn,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("pivots") @Nullable List<PivotPropertiesResponse> pivots,
        @OutputCustomType.Parameter("scope") @Nullable String scope,
        @OutputCustomType.Parameter("timePeriod") @Nullable ReportConfigTimePeriodResponse timePeriod,
        @OutputCustomType.Parameter("timeframe") String timeframe,
        @OutputCustomType.Parameter("type") String type) {
        this.accumulated = accumulated;
        this.chart = chart;
        this.createdOn = createdOn;
        this.currency = currency;
        this.dataSet = dataSet;
        this.dateRange = dateRange;
        this.displayName = displayName;
        this.eTag = eTag;
        this.id = id;
        this.includeMonetaryCommitment = includeMonetaryCommitment;
        this.kpis = kpis;
        this.metric = metric;
        this.modifiedOn = modifiedOn;
        this.name = name;
        this.pivots = pivots;
        this.scope = scope;
        this.timePeriod = timePeriod;
        this.timeframe = timeframe;
        this.type = type;
    }

    /**
     * Show costs accumulated over time.
     * 
    */
    public Optional<String> getAccumulated() {
        return Optional.ofNullable(this.accumulated);
    }
    /**
     * Chart type of the main view in Cost Analysis. Required.
     * 
    */
    public Optional<String> getChart() {
        return Optional.ofNullable(this.chart);
    }
    /**
     * Date the user created this view.
     * 
    */
    public String getCreatedOn() {
        return this.createdOn;
    }
    /**
     * Selected currency.
     * 
    */
    public String getCurrency() {
        return this.currency;
    }
    /**
     * Has definition for data in this report config.
     * 
    */
    public Optional<ReportConfigDatasetResponse> getDataSet() {
        return Optional.ofNullable(this.dataSet);
    }
    /**
     * Selected date range for viewing cost in.
     * 
    */
    public String getDateRange() {
        return this.dateRange;
    }
    /**
     * User input name of the view. Required.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     * 
    */
    public Optional<String> getETag() {
        return Optional.ofNullable(this.eTag);
    }
    /**
     * Resource Id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Include monetary commitment
     * 
    */
    public Boolean getIncludeMonetaryCommitment() {
        return this.includeMonetaryCommitment;
    }
    /**
     * List of KPIs to show in Cost Analysis UI.
     * 
    */
    public List<KpiPropertiesResponse> getKpis() {
        return this.kpis == null ? List.of() : this.kpis;
    }
    /**
     * Metric to use when displaying costs.
     * 
    */
    public Optional<String> getMetric() {
        return Optional.ofNullable(this.metric);
    }
    /**
     * Date when the user last modified this view.
     * 
    */
    public String getModifiedOn() {
        return this.modifiedOn;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Configuration of 3 sub-views in the Cost Analysis UI.
     * 
    */
    public List<PivotPropertiesResponse> getPivots() {
        return this.pivots == null ? List.of() : this.pivots;
    }
    /**
     * Cost Management scope to save the view on. This includes 'subscriptions/{subscriptionId}' for subscription scope, 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}' for EnrollmentAccount scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for BillingProfile scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for InvoiceSection scope, 'providers/Microsoft.Management/managementGroups/{managementGroupId}' for Management Group scope, '/providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}' for ExternalBillingAccount scope, and '/providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}' for ExternalSubscription scope.
     * 
    */
    public Optional<String> getScope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * Has time period for pulling data for the report.
     * 
    */
    public Optional<ReportConfigTimePeriodResponse> getTimePeriod() {
        return Optional.ofNullable(this.timePeriod);
    }
    /**
     * The time frame for pulling data for the report. If custom, then a specific time period must be provided.
     * 
    */
    public String getTimeframe() {
        return this.timeframe;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetViewResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accumulated;
        private @Nullable String chart;
        private String createdOn;
        private String currency;
        private @Nullable ReportConfigDatasetResponse dataSet;
        private String dateRange;
        private @Nullable String displayName;
        private @Nullable String eTag;
        private String id;
        private Boolean includeMonetaryCommitment;
        private @Nullable List<KpiPropertiesResponse> kpis;
        private @Nullable String metric;
        private String modifiedOn;
        private String name;
        private @Nullable List<PivotPropertiesResponse> pivots;
        private @Nullable String scope;
        private @Nullable ReportConfigTimePeriodResponse timePeriod;
        private String timeframe;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetViewResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accumulated = defaults.accumulated;
    	      this.chart = defaults.chart;
    	      this.createdOn = defaults.createdOn;
    	      this.currency = defaults.currency;
    	      this.dataSet = defaults.dataSet;
    	      this.dateRange = defaults.dateRange;
    	      this.displayName = defaults.displayName;
    	      this.eTag = defaults.eTag;
    	      this.id = defaults.id;
    	      this.includeMonetaryCommitment = defaults.includeMonetaryCommitment;
    	      this.kpis = defaults.kpis;
    	      this.metric = defaults.metric;
    	      this.modifiedOn = defaults.modifiedOn;
    	      this.name = defaults.name;
    	      this.pivots = defaults.pivots;
    	      this.scope = defaults.scope;
    	      this.timePeriod = defaults.timePeriod;
    	      this.timeframe = defaults.timeframe;
    	      this.type = defaults.type;
        }

        public Builder accumulated(@Nullable String accumulated) {
            this.accumulated = accumulated;
            return this;
        }

        public Builder chart(@Nullable String chart) {
            this.chart = chart;
            return this;
        }

        public Builder createdOn(String createdOn) {
            this.createdOn = Objects.requireNonNull(createdOn);
            return this;
        }

        public Builder currency(String currency) {
            this.currency = Objects.requireNonNull(currency);
            return this;
        }

        public Builder dataSet(@Nullable ReportConfigDatasetResponse dataSet) {
            this.dataSet = dataSet;
            return this;
        }

        public Builder dateRange(String dateRange) {
            this.dateRange = Objects.requireNonNull(dateRange);
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder eTag(@Nullable String eTag) {
            this.eTag = eTag;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder includeMonetaryCommitment(Boolean includeMonetaryCommitment) {
            this.includeMonetaryCommitment = Objects.requireNonNull(includeMonetaryCommitment);
            return this;
        }

        public Builder kpis(@Nullable List<KpiPropertiesResponse> kpis) {
            this.kpis = kpis;
            return this;
        }

        public Builder metric(@Nullable String metric) {
            this.metric = metric;
            return this;
        }

        public Builder modifiedOn(String modifiedOn) {
            this.modifiedOn = Objects.requireNonNull(modifiedOn);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder pivots(@Nullable List<PivotPropertiesResponse> pivots) {
            this.pivots = pivots;
            return this;
        }

        public Builder scope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }

        public Builder timePeriod(@Nullable ReportConfigTimePeriodResponse timePeriod) {
            this.timePeriod = timePeriod;
            return this;
        }

        public Builder timeframe(String timeframe) {
            this.timeframe = Objects.requireNonNull(timeframe);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetViewResult build() {
            return new GetViewResult(accumulated, chart, createdOn, currency, dataSet, dateRange, displayName, eTag, id, includeMonetaryCommitment, kpis, metric, modifiedOn, name, pivots, scope, timePeriod, timeframe, type);
        }
    }
}
