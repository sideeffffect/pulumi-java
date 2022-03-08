// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudRetailV2alphaRuleDoNotAssociateActionResponse {
    /**
     * Cannot contain duplicates or the query term. Can specify up to 100 terms.
     * 
     */
    private final List<String> doNotAssociateTerms;
    /**
     * Terms from the search query. Will not consider do_not_associate_terms for search if in search query. Can specify up to 100 terms.
     * 
     */
    private final List<String> queryTerms;
    /**
     * Will be [deprecated = true] post migration;
     * 
     */
    private final List<String> terms;

    @OutputCustomType.Constructor({"doNotAssociateTerms","queryTerms","terms"})
    private GoogleCloudRetailV2alphaRuleDoNotAssociateActionResponse(
        List<String> doNotAssociateTerms,
        List<String> queryTerms,
        List<String> terms) {
        this.doNotAssociateTerms = doNotAssociateTerms;
        this.queryTerms = queryTerms;
        this.terms = terms;
    }

    /**
     * Cannot contain duplicates or the query term. Can specify up to 100 terms.
     * 
    */
    public List<String> getDoNotAssociateTerms() {
        return this.doNotAssociateTerms;
    }
    /**
     * Terms from the search query. Will not consider do_not_associate_terms for search if in search query. Can specify up to 100 terms.
     * 
    */
    public List<String> getQueryTerms() {
        return this.queryTerms;
    }
    /**
     * Will be [deprecated = true] post migration;
     * 
    */
    public List<String> getTerms() {
        return this.terms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaRuleDoNotAssociateActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> doNotAssociateTerms;
        private List<String> queryTerms;
        private List<String> terms;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaRuleDoNotAssociateActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.doNotAssociateTerms = defaults.doNotAssociateTerms;
    	      this.queryTerms = defaults.queryTerms;
    	      this.terms = defaults.terms;
        }

        public Builder setDoNotAssociateTerms(List<String> doNotAssociateTerms) {
            this.doNotAssociateTerms = Objects.requireNonNull(doNotAssociateTerms);
            return this;
        }

        public Builder setQueryTerms(List<String> queryTerms) {
            this.queryTerms = Objects.requireNonNull(queryTerms);
            return this;
        }

        public Builder setTerms(List<String> terms) {
            this.terms = Objects.requireNonNull(terms);
            return this;
        }
        public GoogleCloudRetailV2alphaRuleDoNotAssociateActionResponse build() {
            return new GoogleCloudRetailV2alphaRuleDoNotAssociateActionResponse(doNotAssociateTerms, queryTerms, terms);
        }
    }
}
