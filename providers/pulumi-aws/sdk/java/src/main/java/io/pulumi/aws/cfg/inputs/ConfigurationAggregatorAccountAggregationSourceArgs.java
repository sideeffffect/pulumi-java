// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationAggregatorAccountAggregationSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationAggregatorAccountAggregationSourceArgs Empty = new ConfigurationAggregatorAccountAggregationSourceArgs();

    /**
     * List of 12-digit account IDs of the account(s) being aggregated.
     * 
     */
    @InputImport(name="accountIds", required=true)
      private final Input<List<String>> accountIds;

    public Input<List<String>> getAccountIds() {
        return this.accountIds;
    }

    /**
     * If true, aggregate existing AWS Config regions and future regions.
     * 
     */
    @InputImport(name="allRegions")
      private final @Nullable Input<Boolean> allRegions;

    public Input<Boolean> getAllRegions() {
        return this.allRegions == null ? Input.empty() : this.allRegions;
    }

    /**
     * List of source regions being aggregated.
     * 
     */
    @InputImport(name="regions")
      private final @Nullable Input<List<String>> regions;

    public Input<List<String>> getRegions() {
        return this.regions == null ? Input.empty() : this.regions;
    }

    public ConfigurationAggregatorAccountAggregationSourceArgs(
        Input<List<String>> accountIds,
        @Nullable Input<Boolean> allRegions,
        @Nullable Input<List<String>> regions) {
        this.accountIds = Objects.requireNonNull(accountIds, "expected parameter 'accountIds' to be non-null");
        this.allRegions = allRegions;
        this.regions = regions;
    }

    private ConfigurationAggregatorAccountAggregationSourceArgs() {
        this.accountIds = Input.empty();
        this.allRegions = Input.empty();
        this.regions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationAggregatorAccountAggregationSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> accountIds;
        private @Nullable Input<Boolean> allRegions;
        private @Nullable Input<List<String>> regions;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationAggregatorAccountAggregationSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountIds = defaults.accountIds;
    	      this.allRegions = defaults.allRegions;
    	      this.regions = defaults.regions;
        }

        public Builder accountIds(Input<List<String>> accountIds) {
            this.accountIds = Objects.requireNonNull(accountIds);
            return this;
        }

        public Builder accountIds(List<String> accountIds) {
            this.accountIds = Input.of(Objects.requireNonNull(accountIds));
            return this;
        }

        public Builder allRegions(@Nullable Input<Boolean> allRegions) {
            this.allRegions = allRegions;
            return this;
        }

        public Builder allRegions(@Nullable Boolean allRegions) {
            this.allRegions = Input.ofNullable(allRegions);
            return this;
        }

        public Builder regions(@Nullable Input<List<String>> regions) {
            this.regions = regions;
            return this;
        }

        public Builder regions(@Nullable List<String> regions) {
            this.regions = Input.ofNullable(regions);
            return this;
        }
        public ConfigurationAggregatorAccountAggregationSourceArgs build() {
            return new ConfigurationAggregatorAccountAggregationSourceArgs(accountIds, allRegions, regions);
        }
    }
}
