// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.batch_v2alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.ObjectReferenceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CronJobStatus represents the current state of a cron job.
 * 
 */
public final class CronJobStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final CronJobStatusArgs Empty = new CronJobStatusArgs();

    /**
     * A list of pointers to currently running jobs.
     * 
     */
    @InputImport(name="active")
      private final @Nullable Input<List<ObjectReferenceArgs>> active;

    public Input<List<ObjectReferenceArgs>> getActive() {
        return this.active == null ? Input.empty() : this.active;
    }

    /**
     * Information when was the last time the job was successfully scheduled.
     * 
     */
    @InputImport(name="lastScheduleTime")
      private final @Nullable Input<String> lastScheduleTime;

    public Input<String> getLastScheduleTime() {
        return this.lastScheduleTime == null ? Input.empty() : this.lastScheduleTime;
    }

    public CronJobStatusArgs(
        @Nullable Input<List<ObjectReferenceArgs>> active,
        @Nullable Input<String> lastScheduleTime) {
        this.active = active;
        this.lastScheduleTime = lastScheduleTime;
    }

    private CronJobStatusArgs() {
        this.active = Input.empty();
        this.lastScheduleTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CronJobStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ObjectReferenceArgs>> active;
        private @Nullable Input<String> lastScheduleTime;

        public Builder() {
    	      // Empty
        }

        public Builder(CronJobStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.lastScheduleTime = defaults.lastScheduleTime;
        }

        public Builder active(@Nullable Input<List<ObjectReferenceArgs>> active) {
            this.active = active;
            return this;
        }

        public Builder active(@Nullable List<ObjectReferenceArgs> active) {
            this.active = Input.ofNullable(active);
            return this;
        }

        public Builder lastScheduleTime(@Nullable Input<String> lastScheduleTime) {
            this.lastScheduleTime = lastScheduleTime;
            return this;
        }

        public Builder lastScheduleTime(@Nullable String lastScheduleTime) {
            this.lastScheduleTime = Input.ofNullable(lastScheduleTime);
            return this;
        }
        public CronJobStatusArgs build() {
            return new CronJobStatusArgs(active, lastScheduleTime);
        }
    }
}
