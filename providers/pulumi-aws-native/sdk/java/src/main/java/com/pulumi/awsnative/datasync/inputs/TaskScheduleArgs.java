// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies the schedule you want your task to use for repeated executions.
 * 
 */
public final class TaskScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskScheduleArgs Empty = new TaskScheduleArgs();

    /**
     * A cron expression that specifies when AWS DataSync initiates a scheduled transfer from a source to a destination location
     * 
     */
    @Import(name="scheduleExpression", required=true)
    private Output<String> scheduleExpression;

    public Output<String> scheduleExpression() {
        return this.scheduleExpression;
    }

    private TaskScheduleArgs() {}

    private TaskScheduleArgs(TaskScheduleArgs $) {
        this.scheduleExpression = $.scheduleExpression;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskScheduleArgs $;

        public Builder() {
            $ = new TaskScheduleArgs();
        }

        public Builder(TaskScheduleArgs defaults) {
            $ = new TaskScheduleArgs(Objects.requireNonNull(defaults));
        }

        public Builder scheduleExpression(Output<String> scheduleExpression) {
            $.scheduleExpression = scheduleExpression;
            return this;
        }

        public Builder scheduleExpression(String scheduleExpression) {
            return scheduleExpression(Output.of(scheduleExpression));
        }

        public TaskScheduleArgs build() {
            $.scheduleExpression = Objects.requireNonNull($.scheduleExpression, "expected parameter 'scheduleExpression' to be non-null");
            return $;
        }
    }

}
