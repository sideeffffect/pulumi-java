// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.evidently.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExperimentRunningStatusObject {
    /**
     * @return Provide the analysis Completion time for an experiment
     * 
     */
    private final @Nullable String analysisCompleteTime;
    /**
     * @return Provide CANCELLED or COMPLETED desired state when stopping an experiment
     * 
     */
    private final @Nullable String desiredState;
    /**
     * @return Reason is a required input for stopping the experiment
     * 
     */
    private final @Nullable String reason;
    /**
     * @return Provide START or STOP action to apply on an experiment
     * 
     */
    private final @Nullable String status;

    @CustomType.Constructor
    private ExperimentRunningStatusObject(
        @CustomType.Parameter("analysisCompleteTime") @Nullable String analysisCompleteTime,
        @CustomType.Parameter("desiredState") @Nullable String desiredState,
        @CustomType.Parameter("reason") @Nullable String reason,
        @CustomType.Parameter("status") @Nullable String status) {
        this.analysisCompleteTime = analysisCompleteTime;
        this.desiredState = desiredState;
        this.reason = reason;
        this.status = status;
    }

    /**
     * @return Provide the analysis Completion time for an experiment
     * 
     */
    public Optional<String> analysisCompleteTime() {
        return Optional.ofNullable(this.analysisCompleteTime);
    }
    /**
     * @return Provide CANCELLED or COMPLETED desired state when stopping an experiment
     * 
     */
    public Optional<String> desiredState() {
        return Optional.ofNullable(this.desiredState);
    }
    /**
     * @return Reason is a required input for stopping the experiment
     * 
     */
    public Optional<String> reason() {
        return Optional.ofNullable(this.reason);
    }
    /**
     * @return Provide START or STOP action to apply on an experiment
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExperimentRunningStatusObject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String analysisCompleteTime;
        private @Nullable String desiredState;
        private @Nullable String reason;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ExperimentRunningStatusObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analysisCompleteTime = defaults.analysisCompleteTime;
    	      this.desiredState = defaults.desiredState;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
        }

        public Builder analysisCompleteTime(@Nullable String analysisCompleteTime) {
            this.analysisCompleteTime = analysisCompleteTime;
            return this;
        }
        public Builder desiredState(@Nullable String desiredState) {
            this.desiredState = desiredState;
            return this;
        }
        public Builder reason(@Nullable String reason) {
            this.reason = reason;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public ExperimentRunningStatusObject build() {
            return new ExperimentRunningStatusObject(analysisCompleteTime, desiredState, reason, status);
        }
    }
}
