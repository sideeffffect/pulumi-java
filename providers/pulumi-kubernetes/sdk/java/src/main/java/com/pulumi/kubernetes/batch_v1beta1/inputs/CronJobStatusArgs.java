// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.batch_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core_v1.inputs.ObjectReferenceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * CronJobStatus represents the current state of a cron job.
 * 
 */
public final class CronJobStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final CronJobStatusArgs Empty = new CronJobStatusArgs();

    /**
     * A list of pointers to currently running jobs.
     * 
     */
    @Import(name="active")
    private @Nullable Output<List<ObjectReferenceArgs>> active;

    public Optional<Output<List<ObjectReferenceArgs>>> active() {
        return Optional.ofNullable(this.active);
    }

    /**
     * Information when was the last time the job was successfully scheduled.
     * 
     */
    @Import(name="lastScheduleTime")
    private @Nullable Output<String> lastScheduleTime;

    public Optional<Output<String>> lastScheduleTime() {
        return Optional.ofNullable(this.lastScheduleTime);
    }

    /**
     * Information when was the last time the job successfully completed.
     * 
     */
    @Import(name="lastSuccessfulTime")
    private @Nullable Output<String> lastSuccessfulTime;

    public Optional<Output<String>> lastSuccessfulTime() {
        return Optional.ofNullable(this.lastSuccessfulTime);
    }

    private CronJobStatusArgs() {}

    private CronJobStatusArgs(CronJobStatusArgs $) {
        this.active = $.active;
        this.lastScheduleTime = $.lastScheduleTime;
        this.lastSuccessfulTime = $.lastSuccessfulTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CronJobStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CronJobStatusArgs $;

        public Builder() {
            $ = new CronJobStatusArgs();
        }

        public Builder(CronJobStatusArgs defaults) {
            $ = new CronJobStatusArgs(Objects.requireNonNull(defaults));
        }

        public Builder active(@Nullable Output<List<ObjectReferenceArgs>> active) {
            $.active = active;
            return this;
        }

        public Builder active(List<ObjectReferenceArgs> active) {
            return active(Output.of(active));
        }

        public Builder active(ObjectReferenceArgs... active) {
            return active(List.of(active));
        }

        public Builder lastScheduleTime(@Nullable Output<String> lastScheduleTime) {
            $.lastScheduleTime = lastScheduleTime;
            return this;
        }

        public Builder lastScheduleTime(String lastScheduleTime) {
            return lastScheduleTime(Output.of(lastScheduleTime));
        }

        public Builder lastSuccessfulTime(@Nullable Output<String> lastSuccessfulTime) {
            $.lastSuccessfulTime = lastSuccessfulTime;
            return this;
        }

        public Builder lastSuccessfulTime(String lastSuccessfulTime) {
            return lastSuccessfulTime(Output.of(lastSuccessfulTime));
        }

        public CronJobStatusArgs build() {
            return $;
        }
    }

}
