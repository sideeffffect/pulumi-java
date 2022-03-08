// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.retail_v2beta.outputs.GoogleCloudRetailV2betaConditionQueryTermResponse;
import io.pulumi.googlenative.retail_v2beta.outputs.GoogleCloudRetailV2betaConditionTimeRangeResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudRetailV2betaConditionResponse {
    /**
     * Range of time(s) specifying when Condition is active. Condition true if any time range matches.
     * 
     */
    private final List<GoogleCloudRetailV2betaConditionTimeRangeResponse> activeTimeRange;
    /**
     * A list (up to 10 entries) of terms to match the query on. If not specified, match all queries. If many query terms are specified, the condition is matched if any of the terms is a match (i.e. using the OR operator).
     * 
     */
    private final List<GoogleCloudRetailV2betaConditionQueryTermResponse> queryTerms;

    @OutputCustomType.Constructor({"activeTimeRange","queryTerms"})
    private GoogleCloudRetailV2betaConditionResponse(
        List<GoogleCloudRetailV2betaConditionTimeRangeResponse> activeTimeRange,
        List<GoogleCloudRetailV2betaConditionQueryTermResponse> queryTerms) {
        this.activeTimeRange = activeTimeRange;
        this.queryTerms = queryTerms;
    }

    /**
     * Range of time(s) specifying when Condition is active. Condition true if any time range matches.
     * 
    */
    public List<GoogleCloudRetailV2betaConditionTimeRangeResponse> getActiveTimeRange() {
        return this.activeTimeRange;
    }
    /**
     * A list (up to 10 entries) of terms to match the query on. If not specified, match all queries. If many query terms are specified, the condition is matched if any of the terms is a match (i.e. using the OR operator).
     * 
    */
    public List<GoogleCloudRetailV2betaConditionQueryTermResponse> getQueryTerms() {
        return this.queryTerms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudRetailV2betaConditionTimeRangeResponse> activeTimeRange;
        private List<GoogleCloudRetailV2betaConditionQueryTermResponse> queryTerms;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeTimeRange = defaults.activeTimeRange;
    	      this.queryTerms = defaults.queryTerms;
        }

        public Builder setActiveTimeRange(List<GoogleCloudRetailV2betaConditionTimeRangeResponse> activeTimeRange) {
            this.activeTimeRange = Objects.requireNonNull(activeTimeRange);
            return this;
        }

        public Builder setQueryTerms(List<GoogleCloudRetailV2betaConditionQueryTermResponse> queryTerms) {
            this.queryTerms = Objects.requireNonNull(queryTerms);
            return this;
        }
        public GoogleCloudRetailV2betaConditionResponse build() {
            return new GoogleCloudRetailV2betaConditionResponse(activeTimeRange, queryTerms);
        }
    }
}
