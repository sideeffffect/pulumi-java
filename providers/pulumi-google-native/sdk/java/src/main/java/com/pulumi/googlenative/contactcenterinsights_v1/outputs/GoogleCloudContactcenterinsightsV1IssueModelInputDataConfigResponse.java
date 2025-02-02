// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse {
    /**
     * @return A filter to reduce the conversations used for training the model to a specific subset.
     * 
     */
    private final String filter;
    /**
     * @return Medium of conversations used in training data. This field is being deprecated. To specify the medium to be used in training a new issue model, set the `medium` field on `filter`.
     * 
     */
    private final String medium;
    /**
     * @return Number of conversations used in training. Output only.
     * 
     */
    private final String trainingConversationsCount;

    @CustomType.Constructor
    private GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse(
        @CustomType.Parameter("filter") String filter,
        @CustomType.Parameter("medium") String medium,
        @CustomType.Parameter("trainingConversationsCount") String trainingConversationsCount) {
        this.filter = filter;
        this.medium = medium;
        this.trainingConversationsCount = trainingConversationsCount;
    }

    /**
     * @return A filter to reduce the conversations used for training the model to a specific subset.
     * 
     */
    public String filter() {
        return this.filter;
    }
    /**
     * @return Medium of conversations used in training data. This field is being deprecated. To specify the medium to be used in training a new issue model, set the `medium` field on `filter`.
     * 
     */
    public String medium() {
        return this.medium;
    }
    /**
     * @return Number of conversations used in training. Output only.
     * 
     */
    public String trainingConversationsCount() {
        return this.trainingConversationsCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String filter;
        private String medium;
        private String trainingConversationsCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.medium = defaults.medium;
    	      this.trainingConversationsCount = defaults.trainingConversationsCount;
        }

        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public Builder medium(String medium) {
            this.medium = Objects.requireNonNull(medium);
            return this;
        }
        public Builder trainingConversationsCount(String trainingConversationsCount) {
            this.trainingConversationsCount = Objects.requireNonNull(trainingConversationsCount);
            return this;
        }        public GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse build() {
            return new GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse(filter, medium, trainingConversationsCount);
        }
    }
}
