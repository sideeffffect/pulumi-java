// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsearch_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Default options to interpret user query.
 * 
 */
public final class QueryInterpretationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final QueryInterpretationConfigArgs Empty = new QueryInterpretationConfigArgs();

    /**
     * Set this flag to disable supplemental results retrieval, setting a flag here will not retrieve supplemental results for queries associated with a given search application. If this flag is set to True, it will take precedence over the option set at Query level. For the default value of False, query level flag will set the correct interpretation for supplemental results.
     * 
     */
    @Import(name="forceDisableSupplementalResults")
    private @Nullable Output<Boolean> forceDisableSupplementalResults;

    public Optional<Output<Boolean>> forceDisableSupplementalResults() {
        return Optional.ofNullable(this.forceDisableSupplementalResults);
    }

    /**
     * Enable this flag to turn off all internal optimizations like natural language (NL) interpretation of queries, supplemental results retrieval, and usage of synonyms including custom ones. If this flag is set to True, it will take precedence over the option set at Query level. For the default value of False, query level flag will set the correct interpretation for verbatim mode.
     * 
     */
    @Import(name="forceVerbatimMode")
    private @Nullable Output<Boolean> forceVerbatimMode;

    public Optional<Output<Boolean>> forceVerbatimMode() {
        return Optional.ofNullable(this.forceVerbatimMode);
    }

    private QueryInterpretationConfigArgs() {}

    private QueryInterpretationConfigArgs(QueryInterpretationConfigArgs $) {
        this.forceDisableSupplementalResults = $.forceDisableSupplementalResults;
        this.forceVerbatimMode = $.forceVerbatimMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QueryInterpretationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueryInterpretationConfigArgs $;

        public Builder() {
            $ = new QueryInterpretationConfigArgs();
        }

        public Builder(QueryInterpretationConfigArgs defaults) {
            $ = new QueryInterpretationConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder forceDisableSupplementalResults(@Nullable Output<Boolean> forceDisableSupplementalResults) {
            $.forceDisableSupplementalResults = forceDisableSupplementalResults;
            return this;
        }

        public Builder forceDisableSupplementalResults(Boolean forceDisableSupplementalResults) {
            return forceDisableSupplementalResults(Output.of(forceDisableSupplementalResults));
        }

        public Builder forceVerbatimMode(@Nullable Output<Boolean> forceVerbatimMode) {
            $.forceVerbatimMode = forceVerbatimMode;
            return this;
        }

        public Builder forceVerbatimMode(Boolean forceVerbatimMode) {
            return forceVerbatimMode(Output.of(forceVerbatimMode));
        }

        public QueryInterpretationConfigArgs build() {
            return $;
        }
    }

}
