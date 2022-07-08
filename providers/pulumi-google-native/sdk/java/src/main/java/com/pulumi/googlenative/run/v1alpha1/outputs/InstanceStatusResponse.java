// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.run.v1alpha1.outputs.InstanceAttemptResultResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InstanceStatusResponse {
    /**
     * @return Optional. Represents time when the instance was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
     * 
     */
    private final String completionTime;
    /**
     * @return Optional. The number of times this instance exited with code &gt; 0; +optional
     * 
     */
    private final Integer failed;
    /**
     * @return Index of the instance, unique per Job, and beginning at 0.
     * 
     */
    private final Integer index;
    /**
     * @return Optional. Result of the last attempt of this instance. +optional
     * 
     */
    private final InstanceAttemptResultResponse lastAttemptResult;
    /**
     * @return Optional. Last exit code seen for this instance. +optional
     * 
     */
    private final Integer lastExitCode;
    /**
     * @return Optional. The number of times this instance was restarted. Instances are restarted according the restartPolicy configured in the Job template. +optional
     * 
     */
    private final Integer restarted;
    /**
     * @return Optional. Represents time when the instance was created by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
     * 
     */
    private final String startTime;
    /**
     * @return Optional. The number of times this instance exited with code == 0. +optional
     * 
     */
    private final Integer succeeded;

    @CustomType.Constructor
    private InstanceStatusResponse(
        @CustomType.Parameter("completionTime") String completionTime,
        @CustomType.Parameter("failed") Integer failed,
        @CustomType.Parameter("index") Integer index,
        @CustomType.Parameter("lastAttemptResult") InstanceAttemptResultResponse lastAttemptResult,
        @CustomType.Parameter("lastExitCode") Integer lastExitCode,
        @CustomType.Parameter("restarted") Integer restarted,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("succeeded") Integer succeeded) {
        this.completionTime = completionTime;
        this.failed = failed;
        this.index = index;
        this.lastAttemptResult = lastAttemptResult;
        this.lastExitCode = lastExitCode;
        this.restarted = restarted;
        this.startTime = startTime;
        this.succeeded = succeeded;
    }

    /**
     * @return Optional. Represents time when the instance was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
     * 
     */
    public String completionTime() {
        return this.completionTime;
    }
    /**
     * @return Optional. The number of times this instance exited with code &gt; 0; +optional
     * 
     */
    public Integer failed() {
        return this.failed;
    }
    /**
     * @return Index of the instance, unique per Job, and beginning at 0.
     * 
     */
    public Integer index() {
        return this.index;
    }
    /**
     * @return Optional. Result of the last attempt of this instance. +optional
     * 
     */
    public InstanceAttemptResultResponse lastAttemptResult() {
        return this.lastAttemptResult;
    }
    /**
     * @return Optional. Last exit code seen for this instance. +optional
     * 
     */
    public Integer lastExitCode() {
        return this.lastExitCode;
    }
    /**
     * @return Optional. The number of times this instance was restarted. Instances are restarted according the restartPolicy configured in the Job template. +optional
     * 
     */
    public Integer restarted() {
        return this.restarted;
    }
    /**
     * @return Optional. Represents time when the instance was created by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
     * 
     */
    public String startTime() {
        return this.startTime;
    }
    /**
     * @return Optional. The number of times this instance exited with code == 0. +optional
     * 
     */
    public Integer succeeded() {
        return this.succeeded;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String completionTime;
        private Integer failed;
        private Integer index;
        private InstanceAttemptResultResponse lastAttemptResult;
        private Integer lastExitCode;
        private Integer restarted;
        private String startTime;
        private Integer succeeded;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completionTime = defaults.completionTime;
    	      this.failed = defaults.failed;
    	      this.index = defaults.index;
    	      this.lastAttemptResult = defaults.lastAttemptResult;
    	      this.lastExitCode = defaults.lastExitCode;
    	      this.restarted = defaults.restarted;
    	      this.startTime = defaults.startTime;
    	      this.succeeded = defaults.succeeded;
        }

        public Builder completionTime(String completionTime) {
            this.completionTime = Objects.requireNonNull(completionTime);
            return this;
        }
        public Builder failed(Integer failed) {
            this.failed = Objects.requireNonNull(failed);
            return this;
        }
        public Builder index(Integer index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }
        public Builder lastAttemptResult(InstanceAttemptResultResponse lastAttemptResult) {
            this.lastAttemptResult = Objects.requireNonNull(lastAttemptResult);
            return this;
        }
        public Builder lastExitCode(Integer lastExitCode) {
            this.lastExitCode = Objects.requireNonNull(lastExitCode);
            return this;
        }
        public Builder restarted(Integer restarted) {
            this.restarted = Objects.requireNonNull(restarted);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder succeeded(Integer succeeded) {
            this.succeeded = Objects.requireNonNull(succeeded);
            return this;
        }        public InstanceStatusResponse build() {
            return new InstanceStatusResponse(completionTime, failed, index, lastAttemptResult, lastExitCode, restarted, startTime, succeeded);
        }
    }
}
