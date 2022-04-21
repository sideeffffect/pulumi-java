// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datalakeanalytics;

import com.pulumi.azurenative.datalakeanalytics.enums.FirewallAllowAzureIpsState;
import com.pulumi.azurenative.datalakeanalytics.enums.FirewallState;
import com.pulumi.azurenative.datalakeanalytics.enums.TierType;
import com.pulumi.azurenative.datalakeanalytics.inputs.AddDataLakeStoreWithAccountParametersArgs;
import com.pulumi.azurenative.datalakeanalytics.inputs.AddStorageAccountWithAccountParametersArgs;
import com.pulumi.azurenative.datalakeanalytics.inputs.CreateComputePolicyWithAccountParametersArgs;
import com.pulumi.azurenative.datalakeanalytics.inputs.CreateFirewallRuleWithAccountParametersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountArgs Empty = new AccountArgs();

    /**
     * The name of the Data Lake Analytics account.
     * 
     */
    @Import(name="accountName")
    private @Nullable Output<String> accountName;

    public Optional<Output<String>> accountName() {
        return Optional.ofNullable(this.accountName);
    }

    /**
     * The list of compute policies associated with this account.
     * 
     */
    @Import(name="computePolicies")
    private @Nullable Output<List<CreateComputePolicyWithAccountParametersArgs>> computePolicies;

    public Optional<Output<List<CreateComputePolicyWithAccountParametersArgs>>> computePolicies() {
        return Optional.ofNullable(this.computePolicies);
    }

    /**
     * The list of Data Lake Store accounts associated with this account.
     * 
     */
    @Import(name="dataLakeStoreAccounts", required=true)
    private Output<List<AddDataLakeStoreWithAccountParametersArgs>> dataLakeStoreAccounts;

    public Output<List<AddDataLakeStoreWithAccountParametersArgs>> dataLakeStoreAccounts() {
        return this.dataLakeStoreAccounts;
    }

    /**
     * The default Data Lake Store account associated with this account.
     * 
     */
    @Import(name="defaultDataLakeStoreAccount", required=true)
    private Output<String> defaultDataLakeStoreAccount;

    public Output<String> defaultDataLakeStoreAccount() {
        return this.defaultDataLakeStoreAccount;
    }

    /**
     * The current state of allowing or disallowing IPs originating within Azure through the firewall. If the firewall is disabled, this is not enforced.
     * 
     */
    @Import(name="firewallAllowAzureIps")
    private @Nullable Output<FirewallAllowAzureIpsState> firewallAllowAzureIps;

    public Optional<Output<FirewallAllowAzureIpsState>> firewallAllowAzureIps() {
        return Optional.ofNullable(this.firewallAllowAzureIps);
    }

    /**
     * The list of firewall rules associated with this account.
     * 
     */
    @Import(name="firewallRules")
    private @Nullable Output<List<CreateFirewallRuleWithAccountParametersArgs>> firewallRules;

    public Optional<Output<List<CreateFirewallRuleWithAccountParametersArgs>>> firewallRules() {
        return Optional.ofNullable(this.firewallRules);
    }

    /**
     * The current state of the IP address firewall for this account.
     * 
     */
    @Import(name="firewallState")
    private @Nullable Output<FirewallState> firewallState;

    public Optional<Output<FirewallState>> firewallState() {
        return Optional.ofNullable(this.firewallState);
    }

    /**
     * The resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The maximum supported degree of parallelism for this account.
     * 
     */
    @Import(name="maxDegreeOfParallelism")
    private @Nullable Output<Integer> maxDegreeOfParallelism;

    public Optional<Output<Integer>> maxDegreeOfParallelism() {
        return Optional.ofNullable(this.maxDegreeOfParallelism);
    }

    /**
     * The maximum supported degree of parallelism per job for this account.
     * 
     */
    @Import(name="maxDegreeOfParallelismPerJob")
    private @Nullable Output<Integer> maxDegreeOfParallelismPerJob;

    public Optional<Output<Integer>> maxDegreeOfParallelismPerJob() {
        return Optional.ofNullable(this.maxDegreeOfParallelismPerJob);
    }

    /**
     * The maximum supported jobs running under the account at the same time.
     * 
     */
    @Import(name="maxJobCount")
    private @Nullable Output<Integer> maxJobCount;

    public Optional<Output<Integer>> maxJobCount() {
        return Optional.ofNullable(this.maxJobCount);
    }

    /**
     * The minimum supported priority per job for this account.
     * 
     */
    @Import(name="minPriorityPerJob")
    private @Nullable Output<Integer> minPriorityPerJob;

    public Optional<Output<Integer>> minPriorityPerJob() {
        return Optional.ofNullable(this.minPriorityPerJob);
    }

    /**
     * The commitment tier for the next month.
     * 
     */
    @Import(name="newTier")
    private @Nullable Output<TierType> newTier;

    public Optional<Output<TierType>> newTier() {
        return Optional.ofNullable(this.newTier);
    }

    /**
     * The number of days that job metadata is retained.
     * 
     */
    @Import(name="queryStoreRetention")
    private @Nullable Output<Integer> queryStoreRetention;

    public Optional<Output<Integer>> queryStoreRetention() {
        return Optional.ofNullable(this.queryStoreRetention);
    }

    /**
     * The name of the Azure resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The list of Azure Blob Storage accounts associated with this account.
     * 
     */
    @Import(name="storageAccounts")
    private @Nullable Output<List<AddStorageAccountWithAccountParametersArgs>> storageAccounts;

    public Optional<Output<List<AddStorageAccountWithAccountParametersArgs>>> storageAccounts() {
        return Optional.ofNullable(this.storageAccounts);
    }

    /**
     * The resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private AccountArgs() {}

    private AccountArgs(AccountArgs $) {
        this.accountName = $.accountName;
        this.computePolicies = $.computePolicies;
        this.dataLakeStoreAccounts = $.dataLakeStoreAccounts;
        this.defaultDataLakeStoreAccount = $.defaultDataLakeStoreAccount;
        this.firewallAllowAzureIps = $.firewallAllowAzureIps;
        this.firewallRules = $.firewallRules;
        this.firewallState = $.firewallState;
        this.location = $.location;
        this.maxDegreeOfParallelism = $.maxDegreeOfParallelism;
        this.maxDegreeOfParallelismPerJob = $.maxDegreeOfParallelismPerJob;
        this.maxJobCount = $.maxJobCount;
        this.minPriorityPerJob = $.minPriorityPerJob;
        this.newTier = $.newTier;
        this.queryStoreRetention = $.queryStoreRetention;
        this.resourceGroupName = $.resourceGroupName;
        this.storageAccounts = $.storageAccounts;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountArgs $;

        public Builder() {
            $ = new AccountArgs();
        }

        public Builder(AccountArgs defaults) {
            $ = new AccountArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountName(@Nullable Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        public Builder computePolicies(@Nullable Output<List<CreateComputePolicyWithAccountParametersArgs>> computePolicies) {
            $.computePolicies = computePolicies;
            return this;
        }

        public Builder computePolicies(List<CreateComputePolicyWithAccountParametersArgs> computePolicies) {
            return computePolicies(Output.of(computePolicies));
        }

        public Builder computePolicies(CreateComputePolicyWithAccountParametersArgs... computePolicies) {
            return computePolicies(List.of(computePolicies));
        }

        public Builder dataLakeStoreAccounts(Output<List<AddDataLakeStoreWithAccountParametersArgs>> dataLakeStoreAccounts) {
            $.dataLakeStoreAccounts = dataLakeStoreAccounts;
            return this;
        }

        public Builder dataLakeStoreAccounts(List<AddDataLakeStoreWithAccountParametersArgs> dataLakeStoreAccounts) {
            return dataLakeStoreAccounts(Output.of(dataLakeStoreAccounts));
        }

        public Builder dataLakeStoreAccounts(AddDataLakeStoreWithAccountParametersArgs... dataLakeStoreAccounts) {
            return dataLakeStoreAccounts(List.of(dataLakeStoreAccounts));
        }

        public Builder defaultDataLakeStoreAccount(Output<String> defaultDataLakeStoreAccount) {
            $.defaultDataLakeStoreAccount = defaultDataLakeStoreAccount;
            return this;
        }

        public Builder defaultDataLakeStoreAccount(String defaultDataLakeStoreAccount) {
            return defaultDataLakeStoreAccount(Output.of(defaultDataLakeStoreAccount));
        }

        public Builder firewallAllowAzureIps(@Nullable Output<FirewallAllowAzureIpsState> firewallAllowAzureIps) {
            $.firewallAllowAzureIps = firewallAllowAzureIps;
            return this;
        }

        public Builder firewallAllowAzureIps(FirewallAllowAzureIpsState firewallAllowAzureIps) {
            return firewallAllowAzureIps(Output.of(firewallAllowAzureIps));
        }

        public Builder firewallRules(@Nullable Output<List<CreateFirewallRuleWithAccountParametersArgs>> firewallRules) {
            $.firewallRules = firewallRules;
            return this;
        }

        public Builder firewallRules(List<CreateFirewallRuleWithAccountParametersArgs> firewallRules) {
            return firewallRules(Output.of(firewallRules));
        }

        public Builder firewallRules(CreateFirewallRuleWithAccountParametersArgs... firewallRules) {
            return firewallRules(List.of(firewallRules));
        }

        public Builder firewallState(@Nullable Output<FirewallState> firewallState) {
            $.firewallState = firewallState;
            return this;
        }

        public Builder firewallState(FirewallState firewallState) {
            return firewallState(Output.of(firewallState));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder maxDegreeOfParallelism(@Nullable Output<Integer> maxDegreeOfParallelism) {
            $.maxDegreeOfParallelism = maxDegreeOfParallelism;
            return this;
        }

        public Builder maxDegreeOfParallelism(Integer maxDegreeOfParallelism) {
            return maxDegreeOfParallelism(Output.of(maxDegreeOfParallelism));
        }

        public Builder maxDegreeOfParallelismPerJob(@Nullable Output<Integer> maxDegreeOfParallelismPerJob) {
            $.maxDegreeOfParallelismPerJob = maxDegreeOfParallelismPerJob;
            return this;
        }

        public Builder maxDegreeOfParallelismPerJob(Integer maxDegreeOfParallelismPerJob) {
            return maxDegreeOfParallelismPerJob(Output.of(maxDegreeOfParallelismPerJob));
        }

        public Builder maxJobCount(@Nullable Output<Integer> maxJobCount) {
            $.maxJobCount = maxJobCount;
            return this;
        }

        public Builder maxJobCount(Integer maxJobCount) {
            return maxJobCount(Output.of(maxJobCount));
        }

        public Builder minPriorityPerJob(@Nullable Output<Integer> minPriorityPerJob) {
            $.minPriorityPerJob = minPriorityPerJob;
            return this;
        }

        public Builder minPriorityPerJob(Integer minPriorityPerJob) {
            return minPriorityPerJob(Output.of(minPriorityPerJob));
        }

        public Builder newTier(@Nullable Output<TierType> newTier) {
            $.newTier = newTier;
            return this;
        }

        public Builder newTier(TierType newTier) {
            return newTier(Output.of(newTier));
        }

        public Builder queryStoreRetention(@Nullable Output<Integer> queryStoreRetention) {
            $.queryStoreRetention = queryStoreRetention;
            return this;
        }

        public Builder queryStoreRetention(Integer queryStoreRetention) {
            return queryStoreRetention(Output.of(queryStoreRetention));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder storageAccounts(@Nullable Output<List<AddStorageAccountWithAccountParametersArgs>> storageAccounts) {
            $.storageAccounts = storageAccounts;
            return this;
        }

        public Builder storageAccounts(List<AddStorageAccountWithAccountParametersArgs> storageAccounts) {
            return storageAccounts(Output.of(storageAccounts));
        }

        public Builder storageAccounts(AddStorageAccountWithAccountParametersArgs... storageAccounts) {
            return storageAccounts(List.of(storageAccounts));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public AccountArgs build() {
            $.dataLakeStoreAccounts = Objects.requireNonNull($.dataLakeStoreAccounts, "expected parameter 'dataLakeStoreAccounts' to be non-null");
            $.defaultDataLakeStoreAccount = Objects.requireNonNull($.defaultDataLakeStoreAccount, "expected parameter 'defaultDataLakeStoreAccount' to be non-null");
            $.firewallAllowAzureIps = Codegen.objectProp("firewallAllowAzureIps", FirewallAllowAzureIpsState.class).output().arg($.firewallAllowAzureIps).def(FirewallAllowAzureIpsState.Disabled).getNullable();
            $.firewallState = Codegen.objectProp("firewallState", FirewallState.class).output().arg($.firewallState).def(FirewallState.Disabled).getNullable();
            $.maxDegreeOfParallelism = Codegen.integerProp("maxDegreeOfParallelism").output().arg($.maxDegreeOfParallelism).def(30).getNullable();
            $.maxDegreeOfParallelismPerJob = Codegen.integerProp("maxDegreeOfParallelismPerJob").output().arg($.maxDegreeOfParallelismPerJob).def(32).getNullable();
            $.maxJobCount = Codegen.integerProp("maxJobCount").output().arg($.maxJobCount).def(3).getNullable();
            $.newTier = Codegen.objectProp("newTier", TierType.class).output().arg($.newTier).def(TierType.Consumption).getNullable();
            $.queryStoreRetention = Codegen.integerProp("queryStoreRetention").output().arg($.queryStoreRetention).def(30).getNullable();
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
