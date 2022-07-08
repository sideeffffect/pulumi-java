// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepResponse {
    /**
     * @return The name of the rollout step;
     * 
     */
    private final String displayName;
    /**
     * @return The minimum time that this step should last. Should be longer than 1 hour. If not set, the default minimum duration for each step will be 1 hour.
     * 
     */
    private final String minDuration;
    /**
     * @return The percentage of traffic allocated to the flow version of this rollout step. (0%, 100%].
     * 
     */
    private final Integer trafficPercent;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepResponse(
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("minDuration") String minDuration,
        @CustomType.Parameter("trafficPercent") Integer trafficPercent) {
        this.displayName = displayName;
        this.minDuration = minDuration;
        this.trafficPercent = trafficPercent;
    }

    /**
     * @return The name of the rollout step;
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The minimum time that this step should last. Should be longer than 1 hour. If not set, the default minimum duration for each step will be 1 hour.
     * 
     */
    public String minDuration() {
        return this.minDuration;
    }
    /**
     * @return The percentage of traffic allocated to the flow version of this rollout step. (0%, 100%].
     * 
     */
    public Integer trafficPercent() {
        return this.trafficPercent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String minDuration;
        private Integer trafficPercent;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.minDuration = defaults.minDuration;
    	      this.trafficPercent = defaults.trafficPercent;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder minDuration(String minDuration) {
            this.minDuration = Objects.requireNonNull(minDuration);
            return this;
        }
        public Builder trafficPercent(Integer trafficPercent) {
            this.trafficPercent = Objects.requireNonNull(trafficPercent);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepResponse build() {
            return new GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepResponse(displayName, minDuration, trafficPercent);
        }
    }
}
