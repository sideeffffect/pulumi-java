// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta3.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudtasks_v2beta3.inputs.StatusResponse;
import java.lang.String;
import java.util.Objects;


/**
 * The status of a task attempt.
 * 
 */
public final class AttemptResponse extends io.pulumi.resources.InvokeArgs {

    public static final AttemptResponse Empty = new AttemptResponse();

    /**
     * The time that this attempt was dispatched. `dispatch_time` will be truncated to the nearest microsecond.
     * 
     */
    @InputImport(name="dispatchTime", required=true)
      private final String dispatchTime;

    public String getDispatchTime() {
        return this.dispatchTime;
    }

    /**
     * The response from the worker for this attempt. If `response_time` is unset, then the task has not been attempted or is currently running and the `response_status` field is meaningless.
     * 
     */
    @InputImport(name="responseStatus", required=true)
      private final StatusResponse responseStatus;

    public StatusResponse getResponseStatus() {
        return this.responseStatus;
    }

    /**
     * The time that this attempt response was received. `response_time` will be truncated to the nearest microsecond.
     * 
     */
    @InputImport(name="responseTime", required=true)
      private final String responseTime;

    public String getResponseTime() {
        return this.responseTime;
    }

    /**
     * The time that this attempt was scheduled. `schedule_time` will be truncated to the nearest microsecond.
     * 
     */
    @InputImport(name="scheduleTime", required=true)
      private final String scheduleTime;

    public String getScheduleTime() {
        return this.scheduleTime;
    }

    public AttemptResponse(
        String dispatchTime,
        StatusResponse responseStatus,
        String responseTime,
        String scheduleTime) {
        this.dispatchTime = Objects.requireNonNull(dispatchTime, "expected parameter 'dispatchTime' to be non-null");
        this.responseStatus = Objects.requireNonNull(responseStatus, "expected parameter 'responseStatus' to be non-null");
        this.responseTime = Objects.requireNonNull(responseTime, "expected parameter 'responseTime' to be non-null");
        this.scheduleTime = Objects.requireNonNull(scheduleTime, "expected parameter 'scheduleTime' to be non-null");
    }

    private AttemptResponse() {
        this.dispatchTime = null;
        this.responseStatus = null;
        this.responseTime = null;
        this.scheduleTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttemptResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dispatchTime;
        private StatusResponse responseStatus;
        private String responseTime;
        private String scheduleTime;

        public Builder() {
    	      // Empty
        }

        public Builder(AttemptResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dispatchTime = defaults.dispatchTime;
    	      this.responseStatus = defaults.responseStatus;
    	      this.responseTime = defaults.responseTime;
    	      this.scheduleTime = defaults.scheduleTime;
        }

        public Builder dispatchTime(String dispatchTime) {
            this.dispatchTime = Objects.requireNonNull(dispatchTime);
            return this;
        }

        public Builder responseStatus(StatusResponse responseStatus) {
            this.responseStatus = Objects.requireNonNull(responseStatus);
            return this;
        }

        public Builder responseTime(String responseTime) {
            this.responseTime = Objects.requireNonNull(responseTime);
            return this;
        }

        public Builder scheduleTime(String scheduleTime) {
            this.scheduleTime = Objects.requireNonNull(scheduleTime);
            return this;
        }
        public AttemptResponse build() {
            return new AttemptResponse(dispatchTime, responseStatus, responseTime, scheduleTime);
        }
    }
}
