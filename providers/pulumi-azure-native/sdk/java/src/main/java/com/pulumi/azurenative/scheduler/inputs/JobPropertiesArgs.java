// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.inputs;

import com.pulumi.azurenative.scheduler.enums.JobState;
import com.pulumi.azurenative.scheduler.inputs.JobActionArgs;
import com.pulumi.azurenative.scheduler.inputs.JobRecurrenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobPropertiesArgs Empty = new JobPropertiesArgs();

    /**
     * Gets or sets the job action.
     * 
     */
    @Import(name="action")
    private @Nullable Output<JobActionArgs> action;

    /**
     * @return Gets or sets the job action.
     * 
     */
    public Optional<Output<JobActionArgs>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * Gets or sets the job recurrence.
     * 
     */
    @Import(name="recurrence")
    private @Nullable Output<JobRecurrenceArgs> recurrence;

    /**
     * @return Gets or sets the job recurrence.
     * 
     */
    public Optional<Output<JobRecurrenceArgs>> recurrence() {
        return Optional.ofNullable(this.recurrence);
    }

    /**
     * Gets or sets the job start time.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return Gets or sets the job start time.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * Gets or set the job state.
     * 
     */
    @Import(name="state")
    private @Nullable Output<JobState> state;

    /**
     * @return Gets or set the job state.
     * 
     */
    public Optional<Output<JobState>> state() {
        return Optional.ofNullable(this.state);
    }

    private JobPropertiesArgs() {}

    private JobPropertiesArgs(JobPropertiesArgs $) {
        this.action = $.action;
        this.recurrence = $.recurrence;
        this.startTime = $.startTime;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobPropertiesArgs $;

        public Builder() {
            $ = new JobPropertiesArgs();
        }

        public Builder(JobPropertiesArgs defaults) {
            $ = new JobPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Gets or sets the job action.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<JobActionArgs> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Gets or sets the job action.
         * 
         * @return builder
         * 
         */
        public Builder action(JobActionArgs action) {
            return action(Output.of(action));
        }

        /**
         * @param recurrence Gets or sets the job recurrence.
         * 
         * @return builder
         * 
         */
        public Builder recurrence(@Nullable Output<JobRecurrenceArgs> recurrence) {
            $.recurrence = recurrence;
            return this;
        }

        /**
         * @param recurrence Gets or sets the job recurrence.
         * 
         * @return builder
         * 
         */
        public Builder recurrence(JobRecurrenceArgs recurrence) {
            return recurrence(Output.of(recurrence));
        }

        /**
         * @param startTime Gets or sets the job start time.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime Gets or sets the job start time.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        /**
         * @param state Gets or set the job state.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<JobState> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Gets or set the job state.
         * 
         * @return builder
         * 
         */
        public Builder state(JobState state) {
            return state(Output.of(state));
        }

        public JobPropertiesArgs build() {
            return $;
        }
    }

}
