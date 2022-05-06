// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.costmanagement.ViewByScopeArgs;
import com.pulumi.azurenative.costmanagement.outputs.KpiPropertiesResponse;
import com.pulumi.azurenative.costmanagement.outputs.PivotPropertiesResponse;
import com.pulumi.azurenative.costmanagement.outputs.ReportConfigDatasetResponse;
import com.pulumi.azurenative.costmanagement.outputs.ReportConfigTimePeriodResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * States and configurations of Cost Analysis.
 * API Version: 2019-11-01.
 * 
 * ## Example Usage
 * ### ResourceGroupCreateOrUpdateView
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
 *         var viewByScope = new ViewByScope(&#34;viewByScope&#34;, ViewByScopeArgs.builder()        
 *             .accumulated(&#34;true&#34;)
 *             .chart(&#34;Table&#34;)
 *             .dataSet(Map.ofEntries(
 *                 Map.entry(&#34;aggregation&#34;, Map.of(&#34;totalCost&#34;, Map.ofEntries(
 *                     Map.entry(&#34;function&#34;, &#34;Sum&#34;),
 *                     Map.entry(&#34;name&#34;, &#34;PreTaxCost&#34;)
 *                 ))),
 *                 Map.entry(&#34;granularity&#34;, &#34;Daily&#34;),
 *                 Map.entry(&#34;grouping&#34;, ),
 *                 Map.entry(&#34;sorting&#34;, Map.ofEntries(
 *                     Map.entry(&#34;direction&#34;, &#34;Ascending&#34;),
 *                     Map.entry(&#34;name&#34;, &#34;UsageDate&#34;)
 *                 ))
 *             ))
 *             .displayName(&#34;swagger Example&#34;)
 *             .eTag(&#34;\&#34;1d4ff9fe66f1d10\&#34;&#34;)
 *             .kpis(            
 *                 Map.ofEntries(
 *                     Map.entry(&#34;enabled&#34;, true),
 *                     Map.entry(&#34;type&#34;, &#34;Forecast&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;enabled&#34;, true),
 *                     Map.entry(&#34;id&#34;, &#34;/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/MYDEVTESTRG/providers/Microsoft.Consumption/budgets/swaggerDemo&#34;),
 *                     Map.entry(&#34;type&#34;, &#34;Budget&#34;)
 *                 ))
 *             .metric(&#34;ActualCost&#34;)
 *             .pivots(            
 *                 Map.ofEntries(
 *                     Map.entry(&#34;name&#34;, &#34;ServiceName&#34;),
 *                     Map.entry(&#34;type&#34;, &#34;Dimension&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;name&#34;, &#34;MeterCategory&#34;),
 *                     Map.entry(&#34;type&#34;, &#34;Dimension&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;name&#34;, &#34;swaggerTagKey&#34;),
 *                     Map.entry(&#34;type&#34;, &#34;TagKey&#34;)
 *                 ))
 *             .scope(&#34;subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/MYDEVTESTRG&#34;)
 *             .timeframe(&#34;MonthToDate&#34;)
 *             .type(&#34;Usage&#34;)
 *             .viewName(&#34;swaggerExample&#34;)
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
 * $ pulumi import azure-native:costmanagement:ViewByScope swaggerExample /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/MYDEVTESTRG/providers/Microsoft.CostManagement/views/swaggerExample 
 * ```
 * 
 */
@ResourceType(type="azure-native:costmanagement:ViewByScope")
public class ViewByScope extends com.pulumi.resources.CustomResource {
    /**
     * Show costs accumulated over time.
     * 
     */
    @Export(name="accumulated", type=String.class, parameters={})
    private Output</* @Nullable */ String> accumulated;

    /**
     * @return Show costs accumulated over time.
     * 
     */
    public Output<Optional<String>> accumulated() {
        return Codegen.optional(this.accumulated);
    }
    /**
     * Chart type of the main view in Cost Analysis. Required.
     * 
     */
    @Export(name="chart", type=String.class, parameters={})
    private Output</* @Nullable */ String> chart;

    /**
     * @return Chart type of the main view in Cost Analysis. Required.
     * 
     */
    public Output<Optional<String>> chart() {
        return Codegen.optional(this.chart);
    }
    /**
     * Date the user created this view.
     * 
     */
    @Export(name="createdOn", type=String.class, parameters={})
    private Output<String> createdOn;

    /**
     * @return Date the user created this view.
     * 
     */
    public Output<String> createdOn() {
        return this.createdOn;
    }
    /**
     * Selected currency.
     * 
     */
    @Export(name="currency", type=String.class, parameters={})
    private Output<String> currency;

    /**
     * @return Selected currency.
     * 
     */
    public Output<String> currency() {
        return this.currency;
    }
    /**
     * Has definition for data in this report config.
     * 
     */
    @Export(name="dataSet", type=ReportConfigDatasetResponse.class, parameters={})
    private Output</* @Nullable */ ReportConfigDatasetResponse> dataSet;

    /**
     * @return Has definition for data in this report config.
     * 
     */
    public Output<Optional<ReportConfigDatasetResponse>> dataSet() {
        return Codegen.optional(this.dataSet);
    }
    /**
     * Selected date range for viewing cost in.
     * 
     */
    @Export(name="dateRange", type=String.class, parameters={})
    private Output<String> dateRange;

    /**
     * @return Selected date range for viewing cost in.
     * 
     */
    public Output<String> dateRange() {
        return this.dateRange;
    }
    /**
     * User input name of the view. Required.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return User input name of the view. Required.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     * 
     */
    @Export(name="eTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> eTag;

    /**
     * @return eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     * 
     */
    public Output<Optional<String>> eTag() {
        return Codegen.optional(this.eTag);
    }
    /**
     * Include monetary commitment
     * 
     */
    @Export(name="includeMonetaryCommitment", type=Boolean.class, parameters={})
    private Output<Boolean> includeMonetaryCommitment;

    /**
     * @return Include monetary commitment
     * 
     */
    public Output<Boolean> includeMonetaryCommitment() {
        return this.includeMonetaryCommitment;
    }
    /**
     * List of KPIs to show in Cost Analysis UI.
     * 
     */
    @Export(name="kpis", type=List.class, parameters={KpiPropertiesResponse.class})
    private Output</* @Nullable */ List<KpiPropertiesResponse>> kpis;

    /**
     * @return List of KPIs to show in Cost Analysis UI.
     * 
     */
    public Output<Optional<List<KpiPropertiesResponse>>> kpis() {
        return Codegen.optional(this.kpis);
    }
    /**
     * Metric to use when displaying costs.
     * 
     */
    @Export(name="metric", type=String.class, parameters={})
    private Output</* @Nullable */ String> metric;

    /**
     * @return Metric to use when displaying costs.
     * 
     */
    public Output<Optional<String>> metric() {
        return Codegen.optional(this.metric);
    }
    /**
     * Date when the user last modified this view.
     * 
     */
    @Export(name="modifiedOn", type=String.class, parameters={})
    private Output<String> modifiedOn;

    /**
     * @return Date when the user last modified this view.
     * 
     */
    public Output<String> modifiedOn() {
        return this.modifiedOn;
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
     * Configuration of 3 sub-views in the Cost Analysis UI.
     * 
     */
    @Export(name="pivots", type=List.class, parameters={PivotPropertiesResponse.class})
    private Output</* @Nullable */ List<PivotPropertiesResponse>> pivots;

    /**
     * @return Configuration of 3 sub-views in the Cost Analysis UI.
     * 
     */
    public Output<Optional<List<PivotPropertiesResponse>>> pivots() {
        return Codegen.optional(this.pivots);
    }
    /**
     * Cost Management scope to save the view on. This includes &#39;subscriptions/{subscriptionId}&#39; for subscription scope, &#39;subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}&#39; for resourceGroup scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}&#39; for Billing Account scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}&#39; for Department scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}&#39; for EnrollmentAccount scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}&#39; for BillingProfile scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}&#39; for InvoiceSection scope, &#39;providers/Microsoft.Management/managementGroups/{managementGroupId}&#39; for Management Group scope, &#39;/providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}&#39; for ExternalBillingAccount scope, and &#39;/providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}&#39; for ExternalSubscription scope.
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output</* @Nullable */ String> scope;

    /**
     * @return Cost Management scope to save the view on. This includes &#39;subscriptions/{subscriptionId}&#39; for subscription scope, &#39;subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}&#39; for resourceGroup scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}&#39; for Billing Account scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}&#39; for Department scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}&#39; for EnrollmentAccount scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}&#39; for BillingProfile scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}&#39; for InvoiceSection scope, &#39;providers/Microsoft.Management/managementGroups/{managementGroupId}&#39; for Management Group scope, &#39;/providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}&#39; for ExternalBillingAccount scope, and &#39;/providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}&#39; for ExternalSubscription scope.
     * 
     */
    public Output<Optional<String>> scope() {
        return Codegen.optional(this.scope);
    }
    /**
     * Has time period for pulling data for the report.
     * 
     */
    @Export(name="timePeriod", type=ReportConfigTimePeriodResponse.class, parameters={})
    private Output</* @Nullable */ ReportConfigTimePeriodResponse> timePeriod;

    /**
     * @return Has time period for pulling data for the report.
     * 
     */
    public Output<Optional<ReportConfigTimePeriodResponse>> timePeriod() {
        return Codegen.optional(this.timePeriod);
    }
    /**
     * The time frame for pulling data for the report. If custom, then a specific time period must be provided.
     * 
     */
    @Export(name="timeframe", type=String.class, parameters={})
    private Output<String> timeframe;

    /**
     * @return The time frame for pulling data for the report. If custom, then a specific time period must be provided.
     * 
     */
    public Output<String> timeframe() {
        return this.timeframe;
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
    public ViewByScope(String name) {
        this(name, ViewByScopeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ViewByScope(String name, ViewByScopeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ViewByScope(String name, ViewByScopeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:costmanagement:ViewByScope", name, args == null ? ViewByScopeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ViewByScope(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:costmanagement:ViewByScope", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:costmanagement/v20190401preview:ViewByScope").build()),
                Output.of(Alias.builder().type("azure-native:costmanagement/v20191101:ViewByScope").build()),
                Output.of(Alias.builder().type("azure-native:costmanagement/v20200601:ViewByScope").build()),
                Output.of(Alias.builder().type("azure-native:costmanagement/v20211001:ViewByScope").build())
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
    public static ViewByScope get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ViewByScope(name, id, options);
    }
}
