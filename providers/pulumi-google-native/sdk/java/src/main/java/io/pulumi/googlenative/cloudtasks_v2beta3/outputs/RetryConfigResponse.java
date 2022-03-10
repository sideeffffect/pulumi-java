// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RetryConfigResponse {
    /**
     * Number of attempts per task. Cloud Tasks will attempt the task `max_attempts` times (that is, if the first attempt fails, then there will be `max_attempts - 1` retries). Must be >= -1. If unspecified when the queue is created, Cloud Tasks will pick the default. -1 indicates unlimited attempts. This field has the same meaning as [task_retry_limit in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
     * 
     */
    private final Integer maxAttempts;
    /**
     * A task will be scheduled for retry between min_backoff and max_backoff duration after it fails, if the queue's RetryConfig specifies that the task should be retried. If unspecified when the queue is created, Cloud Tasks will pick the default. `max_backoff` will be truncated to the nearest second. This field has the same meaning as [max_backoff_seconds in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
     * 
     */
    private final String maxBackoff;
    /**
     * The time between retries will double `max_doublings` times. A task's retry interval starts at min_backoff, then doubles `max_doublings` times, then increases linearly, and finally retries at intervals of max_backoff up to max_attempts times. For example, if min_backoff is 10s, max_backoff is 300s, and `max_doublings` is 3, then the a task will first be retried in 10s. The retry interval will double three times, and then increase linearly by 2^3 * 10s. Finally, the task will retry at intervals of max_backoff until the task has been attempted max_attempts times. Thus, the requests will retry at 10s, 20s, 40s, 80s, 160s, 240s, 300s, 300s, .... If unspecified when the queue is created, Cloud Tasks will pick the default. This field has the same meaning as [max_doublings in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
     * 
     */
    private final Integer maxDoublings;
    /**
     * If positive, `max_retry_duration` specifies the time limit for retrying a failed task, measured from when the task was first attempted. Once `max_retry_duration` time has passed *and* the task has been attempted max_attempts times, no further attempts will be made and the task will be deleted. If zero, then the task age is unlimited. If unspecified when the queue is created, Cloud Tasks will pick the default. `max_retry_duration` will be truncated to the nearest second. This field has the same meaning as [task_age_limit in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
     * 
     */
    private final String maxRetryDuration;
    /**
     * A task will be scheduled for retry between min_backoff and max_backoff duration after it fails, if the queue's RetryConfig specifies that the task should be retried. If unspecified when the queue is created, Cloud Tasks will pick the default. `min_backoff` will be truncated to the nearest second. This field has the same meaning as [min_backoff_seconds in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
     * 
     */
    private final String minBackoff;

    @OutputCustomType.Constructor
    private RetryConfigResponse(
        @OutputCustomType.Parameter("maxAttempts") Integer maxAttempts,
        @OutputCustomType.Parameter("maxBackoff") String maxBackoff,
        @OutputCustomType.Parameter("maxDoublings") Integer maxDoublings,
        @OutputCustomType.Parameter("maxRetryDuration") String maxRetryDuration,
        @OutputCustomType.Parameter("minBackoff") String minBackoff) {
        this.maxAttempts = maxAttempts;
        this.maxBackoff = maxBackoff;
        this.maxDoublings = maxDoublings;
        this.maxRetryDuration = maxRetryDuration;
        this.minBackoff = minBackoff;
    }

    /**
     * Number of attempts per task. Cloud Tasks will attempt the task `max_attempts` times (that is, if the first attempt fails, then there will be `max_attempts - 1` retries). Must be >= -1. If unspecified when the queue is created, Cloud Tasks will pick the default. -1 indicates unlimited attempts. This field has the same meaning as [task_retry_limit in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
     * 
    */
    public Integer getMaxAttempts() {
        return this.maxAttempts;
    }
    /**
     * A task will be scheduled for retry between min_backoff and max_backoff duration after it fails, if the queue's RetryConfig specifies that the task should be retried. If unspecified when the queue is created, Cloud Tasks will pick the default. `max_backoff` will be truncated to the nearest second. This field has the same meaning as [max_backoff_seconds in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
     * 
    */
    public String getMaxBackoff() {
        return this.maxBackoff;
    }
    /**
     * The time between retries will double `max_doublings` times. A task's retry interval starts at min_backoff, then doubles `max_doublings` times, then increases linearly, and finally retries at intervals of max_backoff up to max_attempts times. For example, if min_backoff is 10s, max_backoff is 300s, and `max_doublings` is 3, then the a task will first be retried in 10s. The retry interval will double three times, and then increase linearly by 2^3 * 10s. Finally, the task will retry at intervals of max_backoff until the task has been attempted max_attempts times. Thus, the requests will retry at 10s, 20s, 40s, 80s, 160s, 240s, 300s, 300s, .... If unspecified when the queue is created, Cloud Tasks will pick the default. This field has the same meaning as [max_doublings in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
     * 
    */
    public Integer getMaxDoublings() {
        return this.maxDoublings;
    }
    /**
     * If positive, `max_retry_duration` specifies the time limit for retrying a failed task, measured from when the task was first attempted. Once `max_retry_duration` time has passed *and* the task has been attempted max_attempts times, no further attempts will be made and the task will be deleted. If zero, then the task age is unlimited. If unspecified when the queue is created, Cloud Tasks will pick the default. `max_retry_duration` will be truncated to the nearest second. This field has the same meaning as [task_age_limit in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
     * 
    */
    public String getMaxRetryDuration() {
        return this.maxRetryDuration;
    }
    /**
     * A task will be scheduled for retry between min_backoff and max_backoff duration after it fails, if the queue's RetryConfig specifies that the task should be retried. If unspecified when the queue is created, Cloud Tasks will pick the default. `min_backoff` will be truncated to the nearest second. This field has the same meaning as [min_backoff_seconds in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
     * 
    */
    public String getMinBackoff() {
        return this.minBackoff;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetryConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxAttempts;
        private String maxBackoff;
        private Integer maxDoublings;
        private String maxRetryDuration;
        private String minBackoff;

        public Builder() {
    	      // Empty
        }

        public Builder(RetryConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxAttempts = defaults.maxAttempts;
    	      this.maxBackoff = defaults.maxBackoff;
    	      this.maxDoublings = defaults.maxDoublings;
    	      this.maxRetryDuration = defaults.maxRetryDuration;
    	      this.minBackoff = defaults.minBackoff;
        }

        public Builder maxAttempts(Integer maxAttempts) {
            this.maxAttempts = Objects.requireNonNull(maxAttempts);
            return this;
        }

        public Builder maxBackoff(String maxBackoff) {
            this.maxBackoff = Objects.requireNonNull(maxBackoff);
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

        public Builder minBackoff(String minBackoff) {
            this.minBackoff = Objects.requireNonNull(minBackoff);
            return this;
        }
        public RetryConfigResponse build() {
            return new RetryConfigResponse(maxAttempts, maxBackoff, maxDoublings, maxRetryDuration, minBackoff);
        }
    }
}
