// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datasync.inputs;

import com.pulumi.aws.datasync.inputs.TaskExcludesGetArgs;
import com.pulumi.aws.datasync.inputs.TaskOptionsGetArgs;
import com.pulumi.aws.datasync.inputs.TaskScheduleGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskState extends com.pulumi.resources.ResourceArgs {

    public static final TaskState Empty = new TaskState();

    /**
     * Amazon Resource Name (ARN) of the DataSync Task.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Amazon Resource Name (ARN) of the CloudWatch Log Group that is used to monitor and log events in the sync task.
     * 
     */
    @Import(name="cloudwatchLogGroupArn")
    private @Nullable Output<String> cloudwatchLogGroupArn;

    public Optional<Output<String>> cloudwatchLogGroupArn() {
        return Optional.ofNullable(this.cloudwatchLogGroupArn);
    }

    /**
     * Amazon Resource Name (ARN) of destination DataSync Location.
     * 
     */
    @Import(name="destinationLocationArn")
    private @Nullable Output<String> destinationLocationArn;

    public Optional<Output<String>> destinationLocationArn() {
        return Optional.ofNullable(this.destinationLocationArn);
    }

    /**
     * Filter rules that determines which files to exclude from a task.
     * 
     */
    @Import(name="excludes")
    private @Nullable Output<TaskExcludesGetArgs> excludes;

    public Optional<Output<TaskExcludesGetArgs>> excludes() {
        return Optional.ofNullable(this.excludes);
    }

    /**
     * Name of the DataSync Task.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Configuration block containing option that controls the default behavior when you start an execution of this DataSync Task. For each individual task execution, you can override these options by specifying an overriding configuration in those executions.
     * 
     */
    @Import(name="options")
    private @Nullable Output<TaskOptionsGetArgs> options;

    public Optional<Output<TaskOptionsGetArgs>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * Specifies a schedule used to periodically transfer files from a source to a destination location.
     * 
     */
    @Import(name="schedule")
    private @Nullable Output<TaskScheduleGetArgs> schedule;

    public Optional<Output<TaskScheduleGetArgs>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    /**
     * Amazon Resource Name (ARN) of source DataSync Location.
     * 
     */
    @Import(name="sourceLocationArn")
    private @Nullable Output<String> sourceLocationArn;

    public Optional<Output<String>> sourceLocationArn() {
        return Optional.ofNullable(this.sourceLocationArn);
    }

    /**
     * Key-value pairs of resource tags to assign to the DataSync Task. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private TaskState() {}

    private TaskState(TaskState $) {
        this.arn = $.arn;
        this.cloudwatchLogGroupArn = $.cloudwatchLogGroupArn;
        this.destinationLocationArn = $.destinationLocationArn;
        this.excludes = $.excludes;
        this.name = $.name;
        this.options = $.options;
        this.schedule = $.schedule;
        this.sourceLocationArn = $.sourceLocationArn;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskState $;

        public Builder() {
            $ = new TaskState();
        }

        public Builder(TaskState defaults) {
            $ = new TaskState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder cloudwatchLogGroupArn(@Nullable Output<String> cloudwatchLogGroupArn) {
            $.cloudwatchLogGroupArn = cloudwatchLogGroupArn;
            return this;
        }

        public Builder cloudwatchLogGroupArn(String cloudwatchLogGroupArn) {
            return cloudwatchLogGroupArn(Output.of(cloudwatchLogGroupArn));
        }

        public Builder destinationLocationArn(@Nullable Output<String> destinationLocationArn) {
            $.destinationLocationArn = destinationLocationArn;
            return this;
        }

        public Builder destinationLocationArn(String destinationLocationArn) {
            return destinationLocationArn(Output.of(destinationLocationArn));
        }

        public Builder excludes(@Nullable Output<TaskExcludesGetArgs> excludes) {
            $.excludes = excludes;
            return this;
        }

        public Builder excludes(TaskExcludesGetArgs excludes) {
            return excludes(Output.of(excludes));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder options(@Nullable Output<TaskOptionsGetArgs> options) {
            $.options = options;
            return this;
        }

        public Builder options(TaskOptionsGetArgs options) {
            return options(Output.of(options));
        }

        public Builder schedule(@Nullable Output<TaskScheduleGetArgs> schedule) {
            $.schedule = schedule;
            return this;
        }

        public Builder schedule(TaskScheduleGetArgs schedule) {
            return schedule(Output.of(schedule));
        }

        public Builder sourceLocationArn(@Nullable Output<String> sourceLocationArn) {
            $.sourceLocationArn = sourceLocationArn;
            return this;
        }

        public Builder sourceLocationArn(String sourceLocationArn) {
            return sourceLocationArn(Output.of(sourceLocationArn));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public TaskState build() {
            return $;
        }
    }

}
