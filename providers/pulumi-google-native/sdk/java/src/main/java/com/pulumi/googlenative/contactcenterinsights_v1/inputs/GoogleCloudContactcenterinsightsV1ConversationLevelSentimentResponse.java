// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1SentimentDataResponse;
import java.lang.Integer;
import java.util.Objects;


/**
 * One channel of conversation-level sentiment data.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse Empty = new GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse();

    /**
     * The channel of the audio that the data applies to.
     * 
     */
    @Import(name="channelTag", required=true)
      private final Integer channelTag;

    public Integer channelTag() {
        return this.channelTag;
    }

    /**
     * Data specifying sentiment.
     * 
     */
    @Import(name="sentimentData", required=true)
      private final GoogleCloudContactcenterinsightsV1SentimentDataResponse sentimentData;

    public GoogleCloudContactcenterinsightsV1SentimentDataResponse sentimentData() {
        return this.sentimentData;
    }

    public GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse(
        Integer channelTag,
        GoogleCloudContactcenterinsightsV1SentimentDataResponse sentimentData) {
        this.channelTag = Objects.requireNonNull(channelTag, "expected parameter 'channelTag' to be non-null");
        this.sentimentData = Objects.requireNonNull(sentimentData, "expected parameter 'sentimentData' to be non-null");
    }

    private GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse() {
        this.channelTag = null;
        this.sentimentData = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer channelTag;
        private GoogleCloudContactcenterinsightsV1SentimentDataResponse sentimentData;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelTag = defaults.channelTag;
    	      this.sentimentData = defaults.sentimentData;
        }

        public Builder channelTag(Integer channelTag) {
            this.channelTag = Objects.requireNonNull(channelTag);
            return this;
        }
        public Builder sentimentData(GoogleCloudContactcenterinsightsV1SentimentDataResponse sentimentData) {
            this.sentimentData = Objects.requireNonNull(sentimentData);
            return this;
        }        public GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse build() {
            return new GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse(channelTag, sentimentData);
        }
    }
}
