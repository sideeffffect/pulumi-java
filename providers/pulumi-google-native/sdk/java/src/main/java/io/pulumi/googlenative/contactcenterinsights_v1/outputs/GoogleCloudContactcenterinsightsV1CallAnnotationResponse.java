// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1EntityMentionDataResponse;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1HoldDataResponse;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1IntentMatchDataResponse;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1InterruptionDataResponse;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1SentimentDataResponse;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1SilenceDataResponse;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudContactcenterinsightsV1CallAnnotationResponse {
    /**
     * The boundary in the conversation where the annotation ends, inclusive.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse annotationEndBoundary;
    /**
     * The boundary in the conversation where the annotation starts, inclusive.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse annotationStartBoundary;
    /**
     * The channel of the audio where the annotation occurs. For single-channel audio, this field is not populated.
     * 
     */
    private final Integer channelTag;
    /**
     * Data specifying an entity mention.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1EntityMentionDataResponse entityMentionData;
    /**
     * Data specifying a hold.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1HoldDataResponse holdData;
    /**
     * Data specifying an intent match.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1IntentMatchDataResponse intentMatchData;
    /**
     * Data specifying an interruption.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1InterruptionDataResponse interruptionData;
    /**
     * Data specifying a phrase match.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse phraseMatchData;
    /**
     * Data specifying sentiment.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1SentimentDataResponse sentimentData;
    /**
     * Data specifying silence.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1SilenceDataResponse silenceData;

    @OutputCustomType.Constructor({"annotationEndBoundary","annotationStartBoundary","channelTag","entityMentionData","holdData","intentMatchData","interruptionData","phraseMatchData","sentimentData","silenceData"})
    private GoogleCloudContactcenterinsightsV1CallAnnotationResponse(
        GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse annotationEndBoundary,
        GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse annotationStartBoundary,
        Integer channelTag,
        GoogleCloudContactcenterinsightsV1EntityMentionDataResponse entityMentionData,
        GoogleCloudContactcenterinsightsV1HoldDataResponse holdData,
        GoogleCloudContactcenterinsightsV1IntentMatchDataResponse intentMatchData,
        GoogleCloudContactcenterinsightsV1InterruptionDataResponse interruptionData,
        GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse phraseMatchData,
        GoogleCloudContactcenterinsightsV1SentimentDataResponse sentimentData,
        GoogleCloudContactcenterinsightsV1SilenceDataResponse silenceData) {
        this.annotationEndBoundary = annotationEndBoundary;
        this.annotationStartBoundary = annotationStartBoundary;
        this.channelTag = channelTag;
        this.entityMentionData = entityMentionData;
        this.holdData = holdData;
        this.intentMatchData = intentMatchData;
        this.interruptionData = interruptionData;
        this.phraseMatchData = phraseMatchData;
        this.sentimentData = sentimentData;
        this.silenceData = silenceData;
    }

    /**
     * The boundary in the conversation where the annotation ends, inclusive.
     * 
    */
    public GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse getAnnotationEndBoundary() {
        return this.annotationEndBoundary;
    }
    /**
     * The boundary in the conversation where the annotation starts, inclusive.
     * 
    */
    public GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse getAnnotationStartBoundary() {
        return this.annotationStartBoundary;
    }
    /**
     * The channel of the audio where the annotation occurs. For single-channel audio, this field is not populated.
     * 
    */
    public Integer getChannelTag() {
        return this.channelTag;
    }
    /**
     * Data specifying an entity mention.
     * 
    */
    public GoogleCloudContactcenterinsightsV1EntityMentionDataResponse getEntityMentionData() {
        return this.entityMentionData;
    }
    /**
     * Data specifying a hold.
     * 
    */
    public GoogleCloudContactcenterinsightsV1HoldDataResponse getHoldData() {
        return this.holdData;
    }
    /**
     * Data specifying an intent match.
     * 
    */
    public GoogleCloudContactcenterinsightsV1IntentMatchDataResponse getIntentMatchData() {
        return this.intentMatchData;
    }
    /**
     * Data specifying an interruption.
     * 
    */
    public GoogleCloudContactcenterinsightsV1InterruptionDataResponse getInterruptionData() {
        return this.interruptionData;
    }
    /**
     * Data specifying a phrase match.
     * 
    */
    public GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse getPhraseMatchData() {
        return this.phraseMatchData;
    }
    /**
     * Data specifying sentiment.
     * 
    */
    public GoogleCloudContactcenterinsightsV1SentimentDataResponse getSentimentData() {
        return this.sentimentData;
    }
    /**
     * Data specifying silence.
     * 
    */
    public GoogleCloudContactcenterinsightsV1SilenceDataResponse getSilenceData() {
        return this.silenceData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1CallAnnotationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse annotationEndBoundary;
        private GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse annotationStartBoundary;
        private Integer channelTag;
        private GoogleCloudContactcenterinsightsV1EntityMentionDataResponse entityMentionData;
        private GoogleCloudContactcenterinsightsV1HoldDataResponse holdData;
        private GoogleCloudContactcenterinsightsV1IntentMatchDataResponse intentMatchData;
        private GoogleCloudContactcenterinsightsV1InterruptionDataResponse interruptionData;
        private GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse phraseMatchData;
        private GoogleCloudContactcenterinsightsV1SentimentDataResponse sentimentData;
        private GoogleCloudContactcenterinsightsV1SilenceDataResponse silenceData;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1CallAnnotationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotationEndBoundary = defaults.annotationEndBoundary;
    	      this.annotationStartBoundary = defaults.annotationStartBoundary;
    	      this.channelTag = defaults.channelTag;
    	      this.entityMentionData = defaults.entityMentionData;
    	      this.holdData = defaults.holdData;
    	      this.intentMatchData = defaults.intentMatchData;
    	      this.interruptionData = defaults.interruptionData;
    	      this.phraseMatchData = defaults.phraseMatchData;
    	      this.sentimentData = defaults.sentimentData;
    	      this.silenceData = defaults.silenceData;
        }

        public Builder setAnnotationEndBoundary(GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse annotationEndBoundary) {
            this.annotationEndBoundary = Objects.requireNonNull(annotationEndBoundary);
            return this;
        }

        public Builder setAnnotationStartBoundary(GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse annotationStartBoundary) {
            this.annotationStartBoundary = Objects.requireNonNull(annotationStartBoundary);
            return this;
        }

        public Builder setChannelTag(Integer channelTag) {
            this.channelTag = Objects.requireNonNull(channelTag);
            return this;
        }

        public Builder setEntityMentionData(GoogleCloudContactcenterinsightsV1EntityMentionDataResponse entityMentionData) {
            this.entityMentionData = Objects.requireNonNull(entityMentionData);
            return this;
        }

        public Builder setHoldData(GoogleCloudContactcenterinsightsV1HoldDataResponse holdData) {
            this.holdData = Objects.requireNonNull(holdData);
            return this;
        }

        public Builder setIntentMatchData(GoogleCloudContactcenterinsightsV1IntentMatchDataResponse intentMatchData) {
            this.intentMatchData = Objects.requireNonNull(intentMatchData);
            return this;
        }

        public Builder setInterruptionData(GoogleCloudContactcenterinsightsV1InterruptionDataResponse interruptionData) {
            this.interruptionData = Objects.requireNonNull(interruptionData);
            return this;
        }

        public Builder setPhraseMatchData(GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse phraseMatchData) {
            this.phraseMatchData = Objects.requireNonNull(phraseMatchData);
            return this;
        }

        public Builder setSentimentData(GoogleCloudContactcenterinsightsV1SentimentDataResponse sentimentData) {
            this.sentimentData = Objects.requireNonNull(sentimentData);
            return this;
        }

        public Builder setSilenceData(GoogleCloudContactcenterinsightsV1SilenceDataResponse silenceData) {
            this.silenceData = Objects.requireNonNull(silenceData);
            return this;
        }
        public GoogleCloudContactcenterinsightsV1CallAnnotationResponse build() {
            return new GoogleCloudContactcenterinsightsV1CallAnnotationResponse(annotationEndBoundary, annotationStartBoundary, channelTag, entityMentionData, holdData, intentMatchData, interruptionData, phraseMatchData, sentimentData, silenceData);
        }
    }
}
