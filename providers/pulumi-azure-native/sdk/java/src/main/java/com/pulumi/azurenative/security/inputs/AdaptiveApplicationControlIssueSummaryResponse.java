// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a summary of the alerts of the machine group
 * 
 */
public final class AdaptiveApplicationControlIssueSummaryResponse extends com.pulumi.resources.InvokeArgs {

    public static final AdaptiveApplicationControlIssueSummaryResponse Empty = new AdaptiveApplicationControlIssueSummaryResponse();

    /**
     * An alert that machines within a group can have
     * 
     */
    @Import(name="issue")
    private @Nullable String issue;

    public Optional<String> issue() {
        return Optional.ofNullable(this.issue);
    }

    /**
     * The number of machines in the group that have this alert
     * 
     */
    @Import(name="numberOfVms")
    private @Nullable Double numberOfVms;

    public Optional<Double> numberOfVms() {
        return Optional.ofNullable(this.numberOfVms);
    }

    private AdaptiveApplicationControlIssueSummaryResponse() {}

    private AdaptiveApplicationControlIssueSummaryResponse(AdaptiveApplicationControlIssueSummaryResponse $) {
        this.issue = $.issue;
        this.numberOfVms = $.numberOfVms;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdaptiveApplicationControlIssueSummaryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdaptiveApplicationControlIssueSummaryResponse $;

        public Builder() {
            $ = new AdaptiveApplicationControlIssueSummaryResponse();
        }

        public Builder(AdaptiveApplicationControlIssueSummaryResponse defaults) {
            $ = new AdaptiveApplicationControlIssueSummaryResponse(Objects.requireNonNull(defaults));
        }

        public Builder issue(@Nullable String issue) {
            $.issue = issue;
            return this;
        }

        public Builder numberOfVms(@Nullable Double numberOfVms) {
            $.numberOfVms = numberOfVms;
            return this;
        }

        public AdaptiveApplicationControlIssueSummaryResponse build() {
            return $;
        }
    }

}
