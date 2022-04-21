// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Aggregated statistics about an issue model.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse Empty = new GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse();

    /**
     * Number of conversations the issue model has analyzed at this point in time.
     * 
     */
    @Import(name="analyzedConversationsCount", required=true)
    private String analyzedConversationsCount;

    public String analyzedConversationsCount() {
        return this.analyzedConversationsCount;
    }

    /**
     * Statistics on each issue. Key is the issue&#39;s resource name.
     * 
     */
    @Import(name="issueStats", required=true)
    private Map<String,String> issueStats;

    public Map<String,String> issueStats() {
        return this.issueStats;
    }

    /**
     * Number of analyzed conversations for which no issue was applicable at this point in time.
     * 
     */
    @Import(name="unclassifiedConversationsCount", required=true)
    private String unclassifiedConversationsCount;

    public String unclassifiedConversationsCount() {
        return this.unclassifiedConversationsCount;
    }

    private GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse() {}

    private GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse(GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse $) {
        this.analyzedConversationsCount = $.analyzedConversationsCount;
        this.issueStats = $.issueStats;
        this.unclassifiedConversationsCount = $.unclassifiedConversationsCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse $;

        public Builder() {
            $ = new GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse();
        }

        public Builder(GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse defaults) {
            $ = new GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse(Objects.requireNonNull(defaults));
        }

        public Builder analyzedConversationsCount(String analyzedConversationsCount) {
            $.analyzedConversationsCount = analyzedConversationsCount;
            return this;
        }

        public Builder issueStats(Map<String,String> issueStats) {
            $.issueStats = issueStats;
            return this;
        }

        public Builder unclassifiedConversationsCount(String unclassifiedConversationsCount) {
            $.unclassifiedConversationsCount = unclassifiedConversationsCount;
            return this;
        }

        public GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse build() {
            $.analyzedConversationsCount = Objects.requireNonNull($.analyzedConversationsCount, "expected parameter 'analyzedConversationsCount' to be non-null");
            $.issueStats = Objects.requireNonNull($.issueStats, "expected parameter 'issueStats' to be non-null");
            $.unclassifiedConversationsCount = Objects.requireNonNull($.unclassifiedConversationsCount, "expected parameter 'unclassifiedConversationsCount' to be non-null");
            return $;
        }
    }

}
