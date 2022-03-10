// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudscheduler_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RetryConfigResponse {
    /**
     * The maximum amount of time to wait before retrying a job after it fails. The default value of this field is 1 hour.
     * 
     */
    private final String maxBackoffDuration;
    /**
     * The time between retries will double `max_doublings` times. A job's retry interval starts at min_backoff_duration, then doubles `max_doublings` times, then increases linearly, and finally retries at intervals of max_backoff_duration up to retry_count times. For example, if min_backoff_duration is 10s, max_backoff_duration is 300s, and `max_doublings` is 3, then the a job will first be retried in 10s. The retry interval will double three times, and then increase linearly by 2^3 * 10s. Finally, the job will retry at intervals of max_backoff_duration until the job has been attempted retry_count times. Thus, the requests will retry at 10s, 20s, 40s, 80s, 160s, 240s, 300s, 300s, .... The default value of this field is 5.
     * 
     */
    private final Integer maxDoublings;
    /**
     * The time limit for retrying a failed job, measured from time when an execution was first attempted. If specified with retry_count, the job will be retried until both limits are reached. The default value for max_retry_duration is zero, which means retry duration is unlimited.
     * 
     */
    private final String maxRetryDuration;
    /**
     * The minimum amount of time to wait before retrying a job after it fails. The default value of this field is 5 seconds.
     * 
     */
    private final String minBackoffDuration;
    /**
     * The number of attempts that the system will make to run a job using the exponential backoff procedure described by max_doublings. The default value of retry_count is zero. If retry_count is zero, a job attempt will *not* be retried if it fails. Instead the Cloud Scheduler system will wait for the next scheduled execution time. If retry_count is set to a non-zero number then Cloud Scheduler will retry failed attempts, using exponential backoff, retry_count times, or until the next scheduled execution time, whichever comes first. Values greater than 5 and negative values are not allowed.
     * 
     */
    private final Integer retryCount;

    @OutputCustomType.Constructor
    private RetryConfigResponse(
        @OutputCustomType.Parameter("maxBackoffDuration") String maxBackoffDuration,
        @OutputCustomType.Parameter("maxDoublings") Integer maxDoublings,
        @OutputCustomType.Parameter("maxRetryDuration") String maxRetryDuration,
        @OutputCustomType.Parameter("minBackoffDuration") String minBackoffDuration,
        @OutputCustomType.Parameter("retryCount") Integer retryCount) {
        this.maxBackoffDuration = maxBackoffDuration;
        this.maxDoublings = maxDoublings;
        this.maxRetryDuration = maxRetryDuration;
        this.minBackoffDuration = minBackoffDuration;
        this.retryCount = retryCount;
    }

    /**
     * The maximum amount of time to wait before retrying a job after it fails. The default value of this field is 1 hour.
     * 
    */
    public String getMaxBackoffDuration() {
        return this.maxBackoffDuration;
    }
    /**
     * The time between retries will double `max_doublings` times. A job's retry interval starts at min_backoff_duration, then doubles `max_doublings` times, then increases linearly, and finally retries at intervals of max_backoff_duration up to retry_count times. For example, if min_backoff_duration is 10s, max_backoff_duration is 300s, and `max_doublings` is 3, then the a job will first be retried in 10s. The retry interval will double three times, and then increase linearly by 2^3 * 10s. Finally, the job will retry at intervals of max_backoff_duration until the job has been attempted retry_count times. Thus, the requests will retry at 10s, 20s, 40s, 80s, 160s, 240s, 300s, 300s, .... The default value of this field is 5.
     * 
    */
    public Integer getMaxDoublings() {
        return this.maxDoublings;
    }
    /**
     * The time limit for retrying a failed job, measured from time when an execution was first attempted. If specified with retry_count, the job will be retried until both limits are reached. The default value for max_retry_duration is zero, which means retry duration is unlimited.
     * 
    */
    public String getMaxRetryDuration() {
        return this.maxRetryDuration;
    }
    /**
     * The minimum amount of time to wait before retrying a job after it fails. The default value of this field is 5 seconds.
     * 
    */
    public String getMinBackoffDuration() {
        return this.minBackoffDuration;
    }
    /**
     * The number of attempts that the system will make to run a job using the exponential backoff procedure described by max_doublings. The default value of retry_count is zero. If retry_count is zero, a job attempt will *not* be retried if it fails. Instead the Cloud Scheduler system will wait for the next scheduled execution time. If retry_count is set to a non-zero number then Cloud Scheduler will retry failed attempts, using exponential backoff, retry_count times, or until the next scheduled execution time, whichever comes first. Values greater than 5 and negative values are not allowed.
     * 
    */
    public Integer getRetryCount() {
        return this.retryCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetryConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String maxBackoffDuration;
        private Integer maxDoublings;
        private String maxRetryDuration;
        private String minBackoffDuration;
        private Integer retryCount;

        public Builder() {
    	      // Empty
        }

        public Builder(RetryConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxBackoffDuration = defaults.maxBackoffDuration;
    	      this.maxDoublings = defaults.maxDoublings;
    	      this.maxRetryDuration = defaults.maxRetryDuration;
    	      this.minBackoffDuration = defaults.minBackoffDuration;
    	      this.retryCount = defaults.retryCount;
        }

        public Builder maxBackoffDuration(String maxBackoffDuration) {
            this.maxBackoffDuration = Objects.requireNonNull(maxBackoffDuration);
            return this;
        }

        public Builder maxDoublings(Integer maxDoublings) {
            this.maxDoublings = Objects.requireNonNull(maxDoublings);
            return this;
        }

        public Builder maxRetryDuration(String maxRetryDuration) {
            this.maxRetryDuration = Objects.requireNonNull(maxRetryDuration);
            return this;
        }

        public Builder minBackoffDuration(String minBackoffDuration) {
            this.minBackoffDuration = Objects.requireNonNull(minBackoffDuration);
            return this;
        }

        public Builder retryCount(Integer retryCount) {
            this.retryCount = Objects.requireNonNull(retryCount);
            return this;
        }
        public RetryConfigResponse build() {
            return new RetryConfigResponse(maxBackoffDuration, maxDoublings, maxRetryDuration, minBackoffDuration, retryCount);
        }
    }
}
