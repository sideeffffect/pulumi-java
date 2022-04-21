// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a single followup intent in the chain.
 * 
 */
public final class GoogleCloudDialogflowV2IntentFollowupIntentInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2IntentFollowupIntentInfoResponse Empty = new GoogleCloudDialogflowV2IntentFollowupIntentInfoResponse();

    /**
     * The unique identifier of the followup intent. Format: `projects//agent/intents/`.
     * 
     */
    @Import(name="followupIntentName", required=true)
    private String followupIntentName;

    public String followupIntentName() {
        return this.followupIntentName;
    }

    /**
     * The unique identifier of the followup intent&#39;s parent. Format: `projects//agent/intents/`.
     * 
     */
    @Import(name="parentFollowupIntentName", required=true)
    private String parentFollowupIntentName;

    public String parentFollowupIntentName() {
        return this.parentFollowupIntentName;
    }

    private GoogleCloudDialogflowV2IntentFollowupIntentInfoResponse() {}

    private GoogleCloudDialogflowV2IntentFollowupIntentInfoResponse(GoogleCloudDialogflowV2IntentFollowupIntentInfoResponse $) {
        this.followupIntentName = $.followupIntentName;
        this.parentFollowupIntentName = $.parentFollowupIntentName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2IntentFollowupIntentInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2IntentFollowupIntentInfoResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2IntentFollowupIntentInfoResponse();
        }

        public Builder(GoogleCloudDialogflowV2IntentFollowupIntentInfoResponse defaults) {
            $ = new GoogleCloudDialogflowV2IntentFollowupIntentInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder followupIntentName(String followupIntentName) {
            $.followupIntentName = followupIntentName;
            return this;
        }

        public Builder parentFollowupIntentName(String parentFollowupIntentName) {
            $.parentFollowupIntentName = parentFollowupIntentName;
            return this;
        }

        public GoogleCloudDialogflowV2IntentFollowupIntentInfoResponse build() {
            $.followupIntentName = Objects.requireNonNull($.followupIntentName, "expected parameter 'followupIntentName' to be non-null");
            $.parentFollowupIntentName = Objects.requireNonNull($.parentFollowupIntentName, "expected parameter 'parentFollowupIntentName' to be non-null");
            return $;
        }
    }

}
