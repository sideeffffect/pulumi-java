// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Job scheduling options.
 * 
 */
public final class JobSchedulingArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobSchedulingArgs Empty = new JobSchedulingArgs();

    /**
     * Optional. Maximum number of times per hour a driver may be restarted as a result of driver exiting with non-zero code before job is reported failed.A job may be reported as thrashing if driver exits with non-zero code 4 times within 10 minute window.Maximum value is 10.Note: Currently, this restartable job option is not supported in Dataproc workflow template (https://cloud.google.com/dataproc/docs/concepts/workflows/using-workflows#adding_jobs_to_a_template) jobs.
     * 
     */
    @Import(name="maxFailuresPerHour")
    private @Nullable Output<Integer> maxFailuresPerHour;

    public Optional<Output<Integer>> maxFailuresPerHour() {
        return Optional.ofNullable(this.maxFailuresPerHour);
    }

    /**
     * Optional. Maximum number of times in total a driver may be restarted as a result of driver exiting with non-zero code before job is reported failed. Maximum value is 240.Note: Currently, this restartable job option is not supported in Dataproc workflow template (https://cloud.google.com/dataproc/docs/concepts/workflows/using-workflows#adding_jobs_to_a_template) jobs.
     * 
     */
    @Import(name="maxFailuresTotal")
    private @Nullable Output<Integer> maxFailuresTotal;

    public Optional<Output<Integer>> maxFailuresTotal() {
        return Optional.ofNullable(this.maxFailuresTotal);
    }

    private JobSchedulingArgs() {}

    private JobSchedulingArgs(JobSchedulingArgs $) {
        this.maxFailuresPerHour = $.maxFailuresPerHour;
        this.maxFailuresTotal = $.maxFailuresTotal;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobSchedulingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobSchedulingArgs $;

        public Builder() {
            $ = new JobSchedulingArgs();
        }

        public Builder(JobSchedulingArgs defaults) {
            $ = new JobSchedulingArgs(Objects.requireNonNull(defaults));
        }

        public Builder maxFailuresPerHour(@Nullable Output<Integer> maxFailuresPerHour) {
            $.maxFailuresPerHour = maxFailuresPerHour;
            return this;
        }

        public Builder maxFailuresPerHour(Integer maxFailuresPerHour) {
            return maxFailuresPerHour(Output.of(maxFailuresPerHour));
        }

        public Builder maxFailuresTotal(@Nullable Output<Integer> maxFailuresTotal) {
            $.maxFailuresTotal = maxFailuresTotal;
            return this;
        }

        public Builder maxFailuresTotal(Integer maxFailuresTotal) {
            return maxFailuresTotal(Output.of(maxFailuresTotal));
        }

        public JobSchedulingArgs build() {
            return $;
        }
    }

}
