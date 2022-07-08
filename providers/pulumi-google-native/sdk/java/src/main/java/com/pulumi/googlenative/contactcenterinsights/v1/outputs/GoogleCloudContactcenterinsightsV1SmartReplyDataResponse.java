// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GoogleCloudContactcenterinsightsV1SmartReplyDataResponse {
    /**
     * @return The system&#39;s confidence score that this reply is a good match for this conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
     * 
     */
    private final Double confidenceScore;
    /**
     * @return Map that contains metadata about the Smart Reply and the document from which it originates.
     * 
     */
    private final Map<String,String> metadata;
    /**
     * @return The name of the answer record. Format: projects/{project}/locations/{location}/answerRecords/{answer_record}
     * 
     */
    private final String queryRecord;
    /**
     * @return The content of the reply.
     * 
     */
    private final String reply;

    @CustomType.Constructor
    private GoogleCloudContactcenterinsightsV1SmartReplyDataResponse(
        @CustomType.Parameter("confidenceScore") Double confidenceScore,
        @CustomType.Parameter("metadata") Map<String,String> metadata,
        @CustomType.Parameter("queryRecord") String queryRecord,
        @CustomType.Parameter("reply") String reply) {
        this.confidenceScore = confidenceScore;
        this.metadata = metadata;
        this.queryRecord = queryRecord;
        this.reply = reply;
    }

    /**
     * @return The system&#39;s confidence score that this reply is a good match for this conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
     * 
     */
    public Double confidenceScore() {
        return this.confidenceScore;
    }
    /**
     * @return Map that contains metadata about the Smart Reply and the document from which it originates.
     * 
     */
    public Map<String,String> metadata() {
        return this.metadata;
    }
    /**
     * @return The name of the answer record. Format: projects/{project}/locations/{location}/answerRecords/{answer_record}
     * 
     */
    public String queryRecord() {
        return this.queryRecord;
    }
    /**
     * @return The content of the reply.
     * 
     */
    public String reply() {
        return this.reply;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1SmartReplyDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double confidenceScore;
        private Map<String,String> metadata;
        private String queryRecord;
        private String reply;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1SmartReplyDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confidenceScore = defaults.confidenceScore;
    	      this.metadata = defaults.metadata;
    	      this.queryRecord = defaults.queryRecord;
    	      this.reply = defaults.reply;
        }

        public Builder confidenceScore(Double confidenceScore) {
            this.confidenceScore = Objects.requireNonNull(confidenceScore);
            return this;
        }
        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder queryRecord(String queryRecord) {
            this.queryRecord = Objects.requireNonNull(queryRecord);
            return this;
        }
        public Builder reply(String reply) {
            this.reply = Objects.requireNonNull(reply);
            return this;
        }        public GoogleCloudContactcenterinsightsV1SmartReplyDataResponse build() {
            return new GoogleCloudContactcenterinsightsV1SmartReplyDataResponse(confidenceScore, metadata, queryRecord, reply);
        }
    }
}
