// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse {
    /**
     * The system's confidence score that this suggestion is a good match for this conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
     * 
     */
    private final Double confidenceScore;
    /**
     * Map that contains metadata about the Smart Compose suggestion and the document from which it originates.
     * 
     */
    private final Map<String,String> metadata;
    /**
     * Name of the query record. Format: projects/{project}/locations/{location}/queryRecords/{query_record}
     * 
     */
    private final String queryRecord;
    /**
     * The content of the suggestion.
     * 
     */
    private final String suggestion;

    @OutputCustomType.Constructor
    private GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse(
        @OutputCustomType.Parameter("confidenceScore") Double confidenceScore,
        @OutputCustomType.Parameter("metadata") Map<String,String> metadata,
        @OutputCustomType.Parameter("queryRecord") String queryRecord,
        @OutputCustomType.Parameter("suggestion") String suggestion) {
        this.confidenceScore = confidenceScore;
        this.metadata = metadata;
        this.queryRecord = queryRecord;
        this.suggestion = suggestion;
    }

    /**
     * The system's confidence score that this suggestion is a good match for this conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
     * 
    */
    public Double getConfidenceScore() {
        return this.confidenceScore;
    }
    /**
     * Map that contains metadata about the Smart Compose suggestion and the document from which it originates.
     * 
    */
    public Map<String,String> getMetadata() {
        return this.metadata;
    }
    /**
     * Name of the query record. Format: projects/{project}/locations/{location}/queryRecords/{query_record}
     * 
    */
    public String getQueryRecord() {
        return this.queryRecord;
    }
    /**
     * The content of the suggestion.
     * 
    */
    public String getSuggestion() {
        return this.suggestion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double confidenceScore;
        private Map<String,String> metadata;
        private String queryRecord;
        private String suggestion;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confidenceScore = defaults.confidenceScore;
    	      this.metadata = defaults.metadata;
    	      this.queryRecord = defaults.queryRecord;
    	      this.suggestion = defaults.suggestion;
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

        public Builder suggestion(String suggestion) {
            this.suggestion = Objects.requireNonNull(suggestion);
            return this;
        }
        public GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse build() {
            return new GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse(confidenceScore, metadata, queryRecord, suggestion);
        }
    }
}
