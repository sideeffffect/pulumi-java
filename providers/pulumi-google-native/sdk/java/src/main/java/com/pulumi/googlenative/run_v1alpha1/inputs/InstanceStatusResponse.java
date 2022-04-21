// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run_v1alpha1.inputs.InstanceAttemptResultResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Instance represents the status of an instance of a Job.
 * 
 */
public final class InstanceStatusResponse extends com.pulumi.resources.InvokeArgs {

    public static final InstanceStatusResponse Empty = new InstanceStatusResponse();

    /**
     * Optional. Represents time when the instance was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
     * 
     */
    @Import(name="completionTime", required=true)
    private String completionTime;

    public String completionTime() {
        return this.completionTime;
    }

    /**
     * Optional. The number of times this instance exited with code &gt; 0; +optional
     * 
     */
    @Import(name="failed", required=true)
    private Integer failed;

    public Integer failed() {
        return this.failed;
    }

    /**
     * Index of the instance, unique per Job, and beginning at 0.
     * 
     */
    @Import(name="index", required=true)
    private Integer index;

    public Integer index() {
        return this.index;
    }

    /**
     * Optional. Result of the last attempt of this instance. +optional
     * 
     */
    @Import(name="lastAttemptResult", required=true)
    private InstanceAttemptResultResponse lastAttemptResult;

    public InstanceAttemptResultResponse lastAttemptResult() {
        return this.lastAttemptResult;
    }

    /**
     * Optional. Last exit code seen for this instance. +optional
     * 
     */
    @Import(name="lastExitCode", required=true)
    private Integer lastExitCode;

    public Integer lastExitCode() {
        return this.lastExitCode;
    }

    /**
     * Optional. The number of times this instance was restarted. Instances are restarted according the restartPolicy configured in the Job template. +optional
     * 
     */
    @Import(name="restarted", required=true)
    private Integer restarted;

    public Integer restarted() {
        return this.restarted;
    }

    /**
     * Optional. Represents time when the instance was created by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
     * 
     */
    @Import(name="startTime", required=true)
    private String startTime;

    public String startTime() {
        return this.startTime;
    }

    /**
     * Optional. The number of times this instance exited with code == 0. +optional
     * 
     */
    @Import(name="succeeded", required=true)
    private Integer succeeded;

    public Integer succeeded() {
        return this.succeeded;
    }

    private InstanceStatusResponse() {}

    private InstanceStatusResponse(InstanceStatusResponse $) {
        this.completionTime = $.completionTime;
        this.failed = $.failed;
        this.index = $.index;
        this.lastAttemptResult = $.lastAttemptResult;
        this.lastExitCode = $.lastExitCode;
        this.restarted = $.restarted;
        this.startTime = $.startTime;
        this.succeeded = $.succeeded;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceStatusResponse $;

        public Builder() {
            $ = new InstanceStatusResponse();
        }

        public Builder(InstanceStatusResponse defaults) {
            $ = new InstanceStatusResponse(Objects.requireNonNull(defaults));
        }

        public Builder completionTime(String completionTime) {
            $.completionTime = completionTime;
            return this;
        }

        public Builder failed(Integer failed) {
            $.failed = failed;
            return this;
        }

        public Builder index(Integer index) {
            $.index = index;
            return this;
        }

        public Builder lastAttemptResult(InstanceAttemptResultResponse lastAttemptResult) {
            $.lastAttemptResult = lastAttemptResult;
            return this;
        }

        public Builder lastExitCode(Integer lastExitCode) {
            $.lastExitCode = lastExitCode;
            return this;
        }

        public Builder restarted(Integer restarted) {
            $.restarted = restarted;
            return this;
        }

        public Builder startTime(String startTime) {
            $.startTime = startTime;
            return this;
        }

        public Builder succeeded(Integer succeeded) {
            $.succeeded = succeeded;
            return this;
        }

        public InstanceStatusResponse build() {
            $.completionTime = Objects.requireNonNull($.completionTime, "expected parameter 'completionTime' to be non-null");
            $.failed = Objects.requireNonNull($.failed, "expected parameter 'failed' to be non-null");
            $.index = Objects.requireNonNull($.index, "expected parameter 'index' to be non-null");
            $.lastAttemptResult = Objects.requireNonNull($.lastAttemptResult, "expected parameter 'lastAttemptResult' to be non-null");
            $.lastExitCode = Objects.requireNonNull($.lastExitCode, "expected parameter 'lastExitCode' to be non-null");
            $.restarted = Objects.requireNonNull($.restarted, "expected parameter 'restarted' to be non-null");
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            $.succeeded = Objects.requireNonNull($.succeeded, "expected parameter 'succeeded' to be non-null");
            return $;
        }
    }

}
