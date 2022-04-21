// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement;

import com.pulumi.azurenative.costmanagement.enums.AccumulatedType;
import com.pulumi.azurenative.costmanagement.enums.ChartType;
import com.pulumi.azurenative.costmanagement.enums.MetricType;
import com.pulumi.azurenative.costmanagement.enums.ReportTimeframeType;
import com.pulumi.azurenative.costmanagement.enums.ReportType;
import com.pulumi.azurenative.costmanagement.inputs.KpiPropertiesArgs;
import com.pulumi.azurenative.costmanagement.inputs.PivotPropertiesArgs;
import com.pulumi.azurenative.costmanagement.inputs.ReportConfigDatasetArgs;
import com.pulumi.azurenative.costmanagement.inputs.ReportConfigTimePeriodArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ViewByScopeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ViewByScopeArgs Empty = new ViewByScopeArgs();

    /**
     * Show costs accumulated over time.
     * 
     */
    @Import(name="accumulated")
    private @Nullable Output<Either<String,AccumulatedType>> accumulated;

    public Optional<Output<Either<String,AccumulatedType>>> accumulated() {
        return Optional.ofNullable(this.accumulated);
    }

    /**
     * Chart type of the main view in Cost Analysis. Required.
     * 
     */
    @Import(name="chart")
    private @Nullable Output<Either<String,ChartType>> chart;

    public Optional<Output<Either<String,ChartType>>> chart() {
        return Optional.ofNullable(this.chart);
    }

    /**
     * Has definition for data in this report config.
     * 
     */
    @Import(name="dataSet")
    private @Nullable Output<ReportConfigDatasetArgs> dataSet;

    public Optional<Output<ReportConfigDatasetArgs>> dataSet() {
        return Optional.ofNullable(this.dataSet);
    }

    /**
     * User input name of the view. Required.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     * 
     */
    @Import(name="eTag")
    private @Nullable Output<String> eTag;

    public Optional<Output<String>> eTag() {
        return Optional.ofNullable(this.eTag);
    }

    /**
     * List of KPIs to show in Cost Analysis UI.
     * 
     */
    @Import(name="kpis")
    private @Nullable Output<List<KpiPropertiesArgs>> kpis;

    public Optional<Output<List<KpiPropertiesArgs>>> kpis() {
        return Optional.ofNullable(this.kpis);
    }

    /**
     * Metric to use when displaying costs.
     * 
     */
    @Import(name="metric")
    private @Nullable Output<Either<String,MetricType>> metric;

    public Optional<Output<Either<String,MetricType>>> metric() {
        return Optional.ofNullable(this.metric);
    }

    /**
     * Configuration of 3 sub-views in the Cost Analysis UI.
     * 
     */
    @Import(name="pivots")
    private @Nullable Output<List<PivotPropertiesArgs>> pivots;

    public Optional<Output<List<PivotPropertiesArgs>>> pivots() {
        return Optional.ofNullable(this.pivots);
    }

    /**
     * Cost Management scope to save the view on. This includes &#39;subscriptions/{subscriptionId}&#39; for subscription scope, &#39;subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}&#39; for resourceGroup scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}&#39; for Billing Account scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}&#39; for Department scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}&#39; for EnrollmentAccount scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}&#39; for BillingProfile scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}&#39; for InvoiceSection scope, &#39;providers/Microsoft.Management/managementGroups/{managementGroupId}&#39; for Management Group scope, &#39;/providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}&#39; for ExternalBillingAccount scope, and &#39;/providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}&#39; for ExternalSubscription scope.
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    public Output<String> scope() {
        return this.scope;
    }

    /**
     * Has time period for pulling data for the report.
     * 
     */
    @Import(name="timePeriod")
    private @Nullable Output<ReportConfigTimePeriodArgs> timePeriod;

    public Optional<Output<ReportConfigTimePeriodArgs>> timePeriod() {
        return Optional.ofNullable(this.timePeriod);
    }

    /**
     * The time frame for pulling data for the report. If custom, then a specific time period must be provided.
     * 
     */
    @Import(name="timeframe", required=true)
    private Output<Either<String,ReportTimeframeType>> timeframe;

    public Output<Either<String,ReportTimeframeType>> timeframe() {
        return this.timeframe;
    }

    /**
     * The type of the report. Usage represents actual usage, forecast represents forecasted data and UsageAndForecast represents both usage and forecasted data. Actual usage and forecasted data can be differentiated based on dates.
     * 
     */
    @Import(name="type", required=true)
    private Output<Either<String,ReportType>> type;

    public Output<Either<String,ReportType>> type() {
        return this.type;
    }

    /**
     * View name
     * 
     */
    @Import(name="viewName")
    private @Nullable Output<String> viewName;

    public Optional<Output<String>> viewName() {
        return Optional.ofNullable(this.viewName);
    }

    private ViewByScopeArgs() {}

    private ViewByScopeArgs(ViewByScopeArgs $) {
        this.accumulated = $.accumulated;
        this.chart = $.chart;
        this.dataSet = $.dataSet;
        this.displayName = $.displayName;
        this.eTag = $.eTag;
        this.kpis = $.kpis;
        this.metric = $.metric;
        this.pivots = $.pivots;
        this.scope = $.scope;
        this.timePeriod = $.timePeriod;
        this.timeframe = $.timeframe;
        this.type = $.type;
        this.viewName = $.viewName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ViewByScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ViewByScopeArgs $;

        public Builder() {
            $ = new ViewByScopeArgs();
        }

        public Builder(ViewByScopeArgs defaults) {
            $ = new ViewByScopeArgs(Objects.requireNonNull(defaults));
        }

        public Builder accumulated(@Nullable Output<Either<String,AccumulatedType>> accumulated) {
            $.accumulated = accumulated;
            return this;
        }

        public Builder accumulated(Either<String,AccumulatedType> accumulated) {
            return accumulated(Output.of(accumulated));
        }

        public Builder chart(@Nullable Output<Either<String,ChartType>> chart) {
            $.chart = chart;
            return this;
        }

        public Builder chart(Either<String,ChartType> chart) {
            return chart(Output.of(chart));
        }

        public Builder dataSet(@Nullable Output<ReportConfigDatasetArgs> dataSet) {
            $.dataSet = dataSet;
            return this;
        }

        public Builder dataSet(ReportConfigDatasetArgs dataSet) {
            return dataSet(Output.of(dataSet));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder eTag(@Nullable Output<String> eTag) {
            $.eTag = eTag;
            return this;
        }

        public Builder eTag(String eTag) {
            return eTag(Output.of(eTag));
        }

        public Builder kpis(@Nullable Output<List<KpiPropertiesArgs>> kpis) {
            $.kpis = kpis;
            return this;
        }

        public Builder kpis(List<KpiPropertiesArgs> kpis) {
            return kpis(Output.of(kpis));
        }

        public Builder kpis(KpiPropertiesArgs... kpis) {
            return kpis(List.of(kpis));
        }

        public Builder metric(@Nullable Output<Either<String,MetricType>> metric) {
            $.metric = metric;
            return this;
        }

        public Builder metric(Either<String,MetricType> metric) {
            return metric(Output.of(metric));
        }

        public Builder pivots(@Nullable Output<List<PivotPropertiesArgs>> pivots) {
            $.pivots = pivots;
            return this;
        }

        public Builder pivots(List<PivotPropertiesArgs> pivots) {
            return pivots(Output.of(pivots));
        }

        public Builder pivots(PivotPropertiesArgs... pivots) {
            return pivots(List.of(pivots));
        }

        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public Builder timePeriod(@Nullable Output<ReportConfigTimePeriodArgs> timePeriod) {
            $.timePeriod = timePeriod;
            return this;
        }

        public Builder timePeriod(ReportConfigTimePeriodArgs timePeriod) {
            return timePeriod(Output.of(timePeriod));
        }

        public Builder timeframe(Output<Either<String,ReportTimeframeType>> timeframe) {
            $.timeframe = timeframe;
            return this;
        }

        public Builder timeframe(Either<String,ReportTimeframeType> timeframe) {
            return timeframe(Output.of(timeframe));
        }

        public Builder type(Output<Either<String,ReportType>> type) {
            $.type = type;
            return this;
        }

        public Builder type(Either<String,ReportType> type) {
            return type(Output.of(type));
        }

        public Builder viewName(@Nullable Output<String> viewName) {
            $.viewName = viewName;
            return this;
        }

        public Builder viewName(String viewName) {
            return viewName(Output.of(viewName));
        }

        public ViewByScopeArgs build() {
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            $.timeframe = Objects.requireNonNull($.timeframe, "expected parameter 'timeframe' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
