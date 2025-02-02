// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CurrentJobDetailsResponse {
    /**
     * @return The ARM Id of the job being executed.
     * 
     */
    private final @Nullable String jobId;
    /**
     * @return The job name.
     * 
     */
    private final @Nullable String jobName;
    /**
     * @return The start time of the job.
     * 
     */
    private final @Nullable String startTime;

    @CustomType.Constructor
    private CurrentJobDetailsResponse(
        @CustomType.Parameter("jobId") @Nullable String jobId,
        @CustomType.Parameter("jobName") @Nullable String jobName,
        @CustomType.Parameter("startTime") @Nullable String startTime) {
        this.jobId = jobId;
        this.jobName = jobName;
        this.startTime = startTime;
    }

    /**
     * @return The ARM Id of the job being executed.
     * 
     */
    public Optional<String> jobId() {
        return Optional.ofNullable(this.jobId);
    }
    /**
     * @return The job name.
     * 
     */
    public Optional<String> jobName() {
        return Optional.ofNullable(this.jobName);
    }
    /**
     * @return The start time of the job.
     * 
     */
    public Optional<String> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CurrentJobDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String jobId;
        private @Nullable String jobName;
        private @Nullable String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(CurrentJobDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobId = defaults.jobId;
    	      this.jobName = defaults.jobName;
    	      this.startTime = defaults.startTime;
        }

        public Builder jobId(@Nullable String jobId) {
            this.jobId = jobId;
            return this;
        }
        public Builder jobName(@Nullable String jobName) {
            this.jobName = jobName;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }        public CurrentJobDetailsResponse build() {
            return new CurrentJobDetailsResponse(jobId, jobName, startTime);
        }
    }
}
