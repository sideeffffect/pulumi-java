// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.contactcenterinsights.v1.outputs.GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse;
import com.pulumi.googlenative.contactcenterinsights.v1.outputs.GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIssueModelResult {
    /**
     * @return The time at which this issue model was created.
     * 
     */
    private final String createTime;
    /**
     * @return The representative name for the issue model.
     * 
     */
    private final String displayName;
    /**
     * @return Configs for the input data that used to create the issue model.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse inputDataConfig;
    /**
     * @return Immutable. The resource name of the issue model. Format: projects/{project}/locations/{location}/issueModels/{issue_model}
     * 
     */
    private final String name;
    /**
     * @return State of the model.
     * 
     */
    private final String state;
    /**
     * @return Immutable. The issue model&#39;s label statistics on its training data.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse trainingStats;
    /**
     * @return The most recent time at which the issue model was updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetIssueModelResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("inputDataConfig") GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse inputDataConfig,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("trainingStats") GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse trainingStats,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.displayName = displayName;
        this.inputDataConfig = inputDataConfig;
        this.name = name;
        this.state = state;
        this.trainingStats = trainingStats;
        this.updateTime = updateTime;
    }

    /**
     * @return The time at which this issue model was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The representative name for the issue model.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Configs for the input data that used to create the issue model.
     * 
     */
    public GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse inputDataConfig() {
        return this.inputDataConfig;
    }
    /**
     * @return Immutable. The resource name of the issue model. Format: projects/{project}/locations/{location}/issueModels/{issue_model}
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return State of the model.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Immutable. The issue model&#39;s label statistics on its training data.
     * 
     */
    public GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse trainingStats() {
        return this.trainingStats;
    }
    /**
     * @return The most recent time at which the issue model was updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIssueModelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String displayName;
        private GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse inputDataConfig;
        private String name;
        private String state;
        private GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse trainingStats;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIssueModelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.displayName = defaults.displayName;
    	      this.inputDataConfig = defaults.inputDataConfig;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.trainingStats = defaults.trainingStats;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder inputDataConfig(GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse inputDataConfig) {
            this.inputDataConfig = Objects.requireNonNull(inputDataConfig);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder trainingStats(GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse trainingStats) {
            this.trainingStats = Objects.requireNonNull(trainingStats);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetIssueModelResult build() {
            return new GetIssueModelResult(createTime, displayName, inputDataConfig, name, state, trainingStats, updateTime);
        }
    }
}
