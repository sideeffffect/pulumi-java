// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntentFollowupIntentInfoGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntentFollowupIntentInfoGetArgs Empty = new IntentFollowupIntentInfoGetArgs();

    @Import(name="followupIntentName")
    private @Nullable Output<String> followupIntentName;

    public Optional<Output<String>> followupIntentName() {
        return Optional.ofNullable(this.followupIntentName);
    }

    /**
     * The unique identifier of the parent intent in the chain of followup intents.
     * Format: projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;.
     * 
     */
    @Import(name="parentFollowupIntentName")
    private @Nullable Output<String> parentFollowupIntentName;

    public Optional<Output<String>> parentFollowupIntentName() {
        return Optional.ofNullable(this.parentFollowupIntentName);
    }

    private IntentFollowupIntentInfoGetArgs() {}

    private IntentFollowupIntentInfoGetArgs(IntentFollowupIntentInfoGetArgs $) {
        this.followupIntentName = $.followupIntentName;
        this.parentFollowupIntentName = $.parentFollowupIntentName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntentFollowupIntentInfoGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntentFollowupIntentInfoGetArgs $;

        public Builder() {
            $ = new IntentFollowupIntentInfoGetArgs();
        }

        public Builder(IntentFollowupIntentInfoGetArgs defaults) {
            $ = new IntentFollowupIntentInfoGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder followupIntentName(@Nullable Output<String> followupIntentName) {
            $.followupIntentName = followupIntentName;
            return this;
        }

        public Builder followupIntentName(String followupIntentName) {
            return followupIntentName(Output.of(followupIntentName));
        }

        public Builder parentFollowupIntentName(@Nullable Output<String> parentFollowupIntentName) {
            $.parentFollowupIntentName = parentFollowupIntentName;
            return this;
        }

        public Builder parentFollowupIntentName(String parentFollowupIntentName) {
            return parentFollowupIntentName(Output.of(parentFollowupIntentName));
        }

        public IntentFollowupIntentInfoGetArgs build() {
            return $;
        }
    }

}
