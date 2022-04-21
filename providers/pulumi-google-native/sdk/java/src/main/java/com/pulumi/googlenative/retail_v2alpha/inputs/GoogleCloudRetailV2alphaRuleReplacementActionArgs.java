// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Replaces a term in the query. Multiple replacement candidates can be specified. All `query_terms` will be replaced with the replacement term. Example: Replace &#34;gShoe&#34; with &#34;google shoe&#34;.
 * 
 */
public final class GoogleCloudRetailV2alphaRuleReplacementActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2alphaRuleReplacementActionArgs Empty = new GoogleCloudRetailV2alphaRuleReplacementActionArgs();

    /**
     * Terms from the search query. Will be replaced by replacement term. Can specify up to 100 terms.
     * 
     */
    @Import(name="queryTerms")
    private @Nullable Output<List<String>> queryTerms;

    public Optional<Output<List<String>>> queryTerms() {
        return Optional.ofNullable(this.queryTerms);
    }

    /**
     * Term that will be used for replacement.
     * 
     */
    @Import(name="replacementTerm")
    private @Nullable Output<String> replacementTerm;

    public Optional<Output<String>> replacementTerm() {
        return Optional.ofNullable(this.replacementTerm);
    }

    /**
     * Will be [deprecated = true] post migration;
     * 
     */
    @Import(name="term")
    private @Nullable Output<String> term;

    public Optional<Output<String>> term() {
        return Optional.ofNullable(this.term);
    }

    private GoogleCloudRetailV2alphaRuleReplacementActionArgs() {}

    private GoogleCloudRetailV2alphaRuleReplacementActionArgs(GoogleCloudRetailV2alphaRuleReplacementActionArgs $) {
        this.queryTerms = $.queryTerms;
        this.replacementTerm = $.replacementTerm;
        this.term = $.term;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRetailV2alphaRuleReplacementActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2alphaRuleReplacementActionArgs $;

        public Builder() {
            $ = new GoogleCloudRetailV2alphaRuleReplacementActionArgs();
        }

        public Builder(GoogleCloudRetailV2alphaRuleReplacementActionArgs defaults) {
            $ = new GoogleCloudRetailV2alphaRuleReplacementActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder queryTerms(@Nullable Output<List<String>> queryTerms) {
            $.queryTerms = queryTerms;
            return this;
        }

        public Builder queryTerms(List<String> queryTerms) {
            return queryTerms(Output.of(queryTerms));
        }

        public Builder queryTerms(String... queryTerms) {
            return queryTerms(List.of(queryTerms));
        }

        public Builder replacementTerm(@Nullable Output<String> replacementTerm) {
            $.replacementTerm = replacementTerm;
            return this;
        }

        public Builder replacementTerm(String replacementTerm) {
            return replacementTerm(Output.of(replacementTerm));
        }

        public Builder term(@Nullable Output<String> term) {
            $.term = term;
            return this;
        }

        public Builder term(String term) {
            return term(Output.of(term));
        }

        public GoogleCloudRetailV2alphaRuleReplacementActionArgs build() {
            return $;
        }
    }

}
