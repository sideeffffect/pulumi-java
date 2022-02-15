// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.myedgeorder.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.myedgeorder.inputs.ConfigurationFilters;
import io.pulumi.myedgeorder.inputs.CustomerSubscriptionDetails;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListConfigurationsArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListConfigurationsArgs Empty = new ListConfigurationsArgs();

    /**
     * Holds details about product hierarchy information and filterable property.
     * 
     */
    @InputImport(name="configurationFilters", required=true)
    private final List<ConfigurationFilters> configurationFilters;

    public List<ConfigurationFilters> getConfigurationFilters() {
        return this.configurationFilters;
    }

    /**
     * Customer subscription properties. Clients can display available products to unregistered customers by explicitly passing subscription details
     * 
     */
    @InputImport(name="customerSubscriptionDetails")
    private final @Nullable CustomerSubscriptionDetails customerSubscriptionDetails;

    public Optional<CustomerSubscriptionDetails> getCustomerSubscriptionDetails() {
        return this.customerSubscriptionDetails == null ? Optional.empty() : Optional.ofNullable(this.customerSubscriptionDetails);
    }

    /**
     * $skipToken is supported on list of configurations, which provides the next page in the list of configurations.
     * 
     */
    @InputImport(name="skipToken")
    private final @Nullable String skipToken;

    public Optional<String> getSkipToken() {
        return this.skipToken == null ? Optional.empty() : Optional.ofNullable(this.skipToken);
    }

    public ListConfigurationsArgs(
        List<ConfigurationFilters> configurationFilters,
        @Nullable CustomerSubscriptionDetails customerSubscriptionDetails,
        @Nullable String skipToken) {
        this.configurationFilters = Objects.requireNonNull(configurationFilters, "expected parameter 'configurationFilters' to be non-null");
        this.customerSubscriptionDetails = customerSubscriptionDetails;
        this.skipToken = skipToken;
    }

    private ListConfigurationsArgs() {
        this.configurationFilters = List.of();
        this.customerSubscriptionDetails = null;
        this.skipToken = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListConfigurationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ConfigurationFilters> configurationFilters;
        private @Nullable CustomerSubscriptionDetails customerSubscriptionDetails;
        private @Nullable String skipToken;

        public Builder() {
    	      // Empty
        }

        public Builder(ListConfigurationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationFilters = defaults.configurationFilters;
    	      this.customerSubscriptionDetails = defaults.customerSubscriptionDetails;
    	      this.skipToken = defaults.skipToken;
        }

        public Builder setConfigurationFilters(List<ConfigurationFilters> configurationFilters) {
            this.configurationFilters = Objects.requireNonNull(configurationFilters);
            return this;
        }

        public Builder setCustomerSubscriptionDetails(@Nullable CustomerSubscriptionDetails customerSubscriptionDetails) {
            this.customerSubscriptionDetails = customerSubscriptionDetails;
            return this;
        }

        public Builder setSkipToken(@Nullable String skipToken) {
            this.skipToken = skipToken;
            return this;
        }

        public ListConfigurationsArgs build() {
            return new ListConfigurationsArgs(configurationFilters, customerSubscriptionDetails, skipToken);
        }
    }
}
