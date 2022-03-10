// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaConditionQueryTermArgs;
import io.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaConditionTimeRangeArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Metadata that is used to define a condition that triggers an action. A valid condition must specify at least one of 'query_terms' or 'products_filter'. If multiple fields are specified, the condition is met if all the fields are satisfied e.g. if a set of query terms and product_filter are set, then only items matching the product_filter for requests with a query matching the query terms wil get boosted.
 * 
 */
public final class GoogleCloudRetailV2alphaConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2alphaConditionArgs Empty = new GoogleCloudRetailV2alphaConditionArgs();

    /**
     * Range of time(s) specifying when Condition is active. Condition true if any time range matches.
     * 
     */
    @InputImport(name="activeTimeRange")
      private final @Nullable Input<List<GoogleCloudRetailV2alphaConditionTimeRangeArgs>> activeTimeRange;

    public Input<List<GoogleCloudRetailV2alphaConditionTimeRangeArgs>> getActiveTimeRange() {
        return this.activeTimeRange == null ? Input.empty() : this.activeTimeRange;
    }

    /**
     * A list (up to 10 entries) of terms to match the query on. If not specified, match all queries. If many query terms are specified, the condition is matched if any of the terms is a match (i.e. using the OR operator).
     * 
     */
    @InputImport(name="queryTerms")
      private final @Nullable Input<List<GoogleCloudRetailV2alphaConditionQueryTermArgs>> queryTerms;

    public Input<List<GoogleCloudRetailV2alphaConditionQueryTermArgs>> getQueryTerms() {
        return this.queryTerms == null ? Input.empty() : this.queryTerms;
    }

    public GoogleCloudRetailV2alphaConditionArgs(
        @Nullable Input<List<GoogleCloudRetailV2alphaConditionTimeRangeArgs>> activeTimeRange,
        @Nullable Input<List<GoogleCloudRetailV2alphaConditionQueryTermArgs>> queryTerms) {
        this.activeTimeRange = activeTimeRange;
        this.queryTerms = queryTerms;
    }

    private GoogleCloudRetailV2alphaConditionArgs() {
        this.activeTimeRange = Input.empty();
        this.queryTerms = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<GoogleCloudRetailV2alphaConditionTimeRangeArgs>> activeTimeRange;
        private @Nullable Input<List<GoogleCloudRetailV2alphaConditionQueryTermArgs>> queryTerms;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeTimeRange = defaults.activeTimeRange;
    	      this.queryTerms = defaults.queryTerms;
        }

        public Builder activeTimeRange(@Nullable Input<List<GoogleCloudRetailV2alphaConditionTimeRangeArgs>> activeTimeRange) {
            this.activeTimeRange = activeTimeRange;
            return this;
        }

        public Builder activeTimeRange(@Nullable List<GoogleCloudRetailV2alphaConditionTimeRangeArgs> activeTimeRange) {
            this.activeTimeRange = Input.ofNullable(activeTimeRange);
            return this;
        }

        public Builder queryTerms(@Nullable Input<List<GoogleCloudRetailV2alphaConditionQueryTermArgs>> queryTerms) {
            this.queryTerms = queryTerms;
            return this;
        }

        public Builder queryTerms(@Nullable List<GoogleCloudRetailV2alphaConditionQueryTermArgs> queryTerms) {
            this.queryTerms = Input.ofNullable(queryTerms);
            return this;
        }
        public GoogleCloudRetailV2alphaConditionArgs build() {
            return new GoogleCloudRetailV2alphaConditionArgs(activeTimeRange, queryTerms);
        }
    }
}
