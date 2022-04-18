// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.batch_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.batch_v1.inputs.JobTemplateSpecArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CronJobSpec describes how the job execution will look like and when it will actually run.
 * 
 */
public final class CronJobSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final CronJobSpecArgs Empty = new CronJobSpecArgs();

    /**
     * Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
     * 
     * Possible enum values:
     *  - `"Allow"` allows CronJobs to run concurrently.
     *  - `"Forbid"` forbids concurrent runs, skipping next run if previous hasn't finished yet.
     *  - `"Replace"` cancels currently running job and replaces it with a new one.
     * 
     */
    @Import(name="concurrencyPolicy")
      private final @Nullable Output<String> concurrencyPolicy;

    public Output<String> concurrencyPolicy() {
        return this.concurrencyPolicy == null ? Codegen.empty() : this.concurrencyPolicy;
    }

    /**
     * The number of failed finished jobs to retain. Value must be non-negative integer. Defaults to 1.
     * 
     */
    @Import(name="failedJobsHistoryLimit")
      private final @Nullable Output<Integer> failedJobsHistoryLimit;

    public Output<Integer> failedJobsHistoryLimit() {
        return this.failedJobsHistoryLimit == null ? Codegen.empty() : this.failedJobsHistoryLimit;
    }

    /**
     * Specifies the job that will be created when executing a CronJob.
     * 
     */
    @Import(name="jobTemplate", required=true)
      private final Output<JobTemplateSpecArgs> jobTemplate;

    public Output<JobTemplateSpecArgs> jobTemplate() {
        return this.jobTemplate;
    }

    /**
     * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
     * 
     */
    @Import(name="schedule", required=true)
      private final Output<String> schedule;

    public Output<String> schedule() {
        return this.schedule;
    }

    /**
     * Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
     * 
     */
    @Import(name="startingDeadlineSeconds")
      private final @Nullable Output<Integer> startingDeadlineSeconds;

    public Output<Integer> startingDeadlineSeconds() {
        return this.startingDeadlineSeconds == null ? Codegen.empty() : this.startingDeadlineSeconds;
    }

    /**
     * The number of successful finished jobs to retain. Value must be non-negative integer. Defaults to 3.
     * 
     */
    @Import(name="successfulJobsHistoryLimit")
      private final @Nullable Output<Integer> successfulJobsHistoryLimit;

    public Output<Integer> successfulJobsHistoryLimit() {
        return this.successfulJobsHistoryLimit == null ? Codegen.empty() : this.successfulJobsHistoryLimit;
    }

    /**
     * This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
     * 
     */
    @Import(name="suspend")
      private final @Nullable Output<Boolean> suspend;

    public Output<Boolean> suspend() {
        return this.suspend == null ? Codegen.empty() : this.suspend;
    }

    public CronJobSpecArgs(
        @Nullable Output<String> concurrencyPolicy,
        @Nullable Output<Integer> failedJobsHistoryLimit,
        Output<JobTemplateSpecArgs> jobTemplate,
        Output<String> schedule,
        @Nullable Output<Integer> startingDeadlineSeconds,
        @Nullable Output<Integer> successfulJobsHistoryLimit,
        @Nullable Output<Boolean> suspend) {
        this.concurrencyPolicy = concurrencyPolicy;
        this.failedJobsHistoryLimit = failedJobsHistoryLimit;
        this.jobTemplate = Objects.requireNonNull(jobTemplate, "expected parameter 'jobTemplate' to be non-null");
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
        this.startingDeadlineSeconds = startingDeadlineSeconds;
        this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
        this.suspend = suspend;
    }

    private CronJobSpecArgs() {
        this.concurrencyPolicy = Codegen.empty();
        this.failedJobsHistoryLimit = Codegen.empty();
        this.jobTemplate = Codegen.empty();
        this.schedule = Codegen.empty();
        this.startingDeadlineSeconds = Codegen.empty();
        this.successfulJobsHistoryLimit = Codegen.empty();
        this.suspend = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CronJobSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> concurrencyPolicy;
        private @Nullable Output<Integer> failedJobsHistoryLimit;
        private Output<JobTemplateSpecArgs> jobTemplate;
        private Output<String> schedule;
        private @Nullable Output<Integer> startingDeadlineSeconds;
        private @Nullable Output<Integer> successfulJobsHistoryLimit;
        private @Nullable Output<Boolean> suspend;

        public Builder() {
    	      // Empty
        }

        public Builder(CronJobSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.concurrencyPolicy = defaults.concurrencyPolicy;
    	      this.failedJobsHistoryLimit = defaults.failedJobsHistoryLimit;
    	      this.jobTemplate = defaults.jobTemplate;
    	      this.schedule = defaults.schedule;
    	      this.startingDeadlineSeconds = defaults.startingDeadlineSeconds;
    	      this.successfulJobsHistoryLimit = defaults.successfulJobsHistoryLimit;
    	      this.suspend = defaults.suspend;
        }

        public Builder concurrencyPolicy(@Nullable Output<String> concurrencyPolicy) {
            this.concurrencyPolicy = concurrencyPolicy;
            return this;
        }
        public Builder concurrencyPolicy(@Nullable String concurrencyPolicy) {
            this.concurrencyPolicy = Codegen.ofNullable(concurrencyPolicy);
            return this;
        }
        public Builder failedJobsHistoryLimit(@Nullable Output<Integer> failedJobsHistoryLimit) {
            this.failedJobsHistoryLimit = failedJobsHistoryLimit;
            return this;
        }
        public Builder failedJobsHistoryLimit(@Nullable Integer failedJobsHistoryLimit) {
            this.failedJobsHistoryLimit = Codegen.ofNullable(failedJobsHistoryLimit);
            return this;
        }
        public Builder jobTemplate(Output<JobTemplateSpecArgs> jobTemplate) {
            this.jobTemplate = Objects.requireNonNull(jobTemplate);
            return this;
        }
        public Builder jobTemplate(JobTemplateSpecArgs jobTemplate) {
            this.jobTemplate = Output.of(Objects.requireNonNull(jobTemplate));
            return this;
        }
        public Builder schedule(Output<String> schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        public Builder schedule(String schedule) {
            this.schedule = Output.of(Objects.requireNonNull(schedule));
            return this;
        }
        public Builder startingDeadlineSeconds(@Nullable Output<Integer> startingDeadlineSeconds) {
            this.startingDeadlineSeconds = startingDeadlineSeconds;
            return this;
        }
        public Builder startingDeadlineSeconds(@Nullable Integer startingDeadlineSeconds) {
            this.startingDeadlineSeconds = Codegen.ofNullable(startingDeadlineSeconds);
            return this;
        }
        public Builder successfulJobsHistoryLimit(@Nullable Output<Integer> successfulJobsHistoryLimit) {
            this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
            return this;
        }
        public Builder successfulJobsHistoryLimit(@Nullable Integer successfulJobsHistoryLimit) {
            this.successfulJobsHistoryLimit = Codegen.ofNullable(successfulJobsHistoryLimit);
            return this;
        }
        public Builder suspend(@Nullable Output<Boolean> suspend) {
            this.suspend = suspend;
            return this;
        }
        public Builder suspend(@Nullable Boolean suspend) {
            this.suspend = Codegen.ofNullable(suspend);
            return this;
        }        public CronJobSpecArgs build() {
            return new CronJobSpecArgs(concurrencyPolicy, failedJobsHistoryLimit, jobTemplate, schedule, startingDeadlineSeconds, successfulJobsHistoryLimit, suspend);
        }
    }
}
