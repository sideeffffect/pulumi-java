// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow;

import com.pulumi.awsnative.appflow.inputs.FlowDestinationFlowConfigArgs;
import com.pulumi.awsnative.appflow.inputs.FlowSourceFlowConfigArgs;
import com.pulumi.awsnative.appflow.inputs.FlowTagArgs;
import com.pulumi.awsnative.appflow.inputs.FlowTaskArgs;
import com.pulumi.awsnative.appflow.inputs.FlowTriggerConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowArgs Empty = new FlowArgs();

    /**
     * Description of the flow.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * List of Destination connectors of the flow.
     * 
     */
    @Import(name="destinationFlowConfigList", required=true)
    private Output<List<FlowDestinationFlowConfigArgs>> destinationFlowConfigList;

    public Output<List<FlowDestinationFlowConfigArgs>> destinationFlowConfigList() {
        return this.destinationFlowConfigList;
    }

    /**
     * Name of the flow.
     * 
     */
    @Import(name="flowName")
    private @Nullable Output<String> flowName;

    public Optional<Output<String>> flowName() {
        return Optional.ofNullable(this.flowName);
    }

    /**
     * The ARN of the AWS Key Management Service (AWS KMS) key that&#39;s used to encrypt your function&#39;s environment variables. If it&#39;s not provided, AWS Lambda uses a default service key.
     * 
     */
    @Import(name="kMSArn")
    private @Nullable Output<String> kMSArn;

    public Optional<Output<String>> kMSArn() {
        return Optional.ofNullable(this.kMSArn);
    }

    /**
     * Configurations of Source connector of the flow.
     * 
     */
    @Import(name="sourceFlowConfig", required=true)
    private Output<FlowSourceFlowConfigArgs> sourceFlowConfig;

    public Output<FlowSourceFlowConfigArgs> sourceFlowConfig() {
        return this.sourceFlowConfig;
    }

    /**
     * List of Tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<FlowTagArgs>> tags;

    public Optional<Output<List<FlowTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * List of tasks for the flow.
     * 
     */
    @Import(name="tasks", required=true)
    private Output<List<FlowTaskArgs>> tasks;

    public Output<List<FlowTaskArgs>> tasks() {
        return this.tasks;
    }

    /**
     * Trigger settings of the flow.
     * 
     */
    @Import(name="triggerConfig", required=true)
    private Output<FlowTriggerConfigArgs> triggerConfig;

    public Output<FlowTriggerConfigArgs> triggerConfig() {
        return this.triggerConfig;
    }

    private FlowArgs() {}

    private FlowArgs(FlowArgs $) {
        this.description = $.description;
        this.destinationFlowConfigList = $.destinationFlowConfigList;
        this.flowName = $.flowName;
        this.kMSArn = $.kMSArn;
        this.sourceFlowConfig = $.sourceFlowConfig;
        this.tags = $.tags;
        this.tasks = $.tasks;
        this.triggerConfig = $.triggerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowArgs $;

        public Builder() {
            $ = new FlowArgs();
        }

        public Builder(FlowArgs defaults) {
            $ = new FlowArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder destinationFlowConfigList(Output<List<FlowDestinationFlowConfigArgs>> destinationFlowConfigList) {
            $.destinationFlowConfigList = destinationFlowConfigList;
            return this;
        }

        public Builder destinationFlowConfigList(List<FlowDestinationFlowConfigArgs> destinationFlowConfigList) {
            return destinationFlowConfigList(Output.of(destinationFlowConfigList));
        }

        public Builder destinationFlowConfigList(FlowDestinationFlowConfigArgs... destinationFlowConfigList) {
            return destinationFlowConfigList(List.of(destinationFlowConfigList));
        }

        public Builder flowName(@Nullable Output<String> flowName) {
            $.flowName = flowName;
            return this;
        }

        public Builder flowName(String flowName) {
            return flowName(Output.of(flowName));
        }

        public Builder kMSArn(@Nullable Output<String> kMSArn) {
            $.kMSArn = kMSArn;
            return this;
        }

        public Builder kMSArn(String kMSArn) {
            return kMSArn(Output.of(kMSArn));
        }

        public Builder sourceFlowConfig(Output<FlowSourceFlowConfigArgs> sourceFlowConfig) {
            $.sourceFlowConfig = sourceFlowConfig;
            return this;
        }

        public Builder sourceFlowConfig(FlowSourceFlowConfigArgs sourceFlowConfig) {
            return sourceFlowConfig(Output.of(sourceFlowConfig));
        }

        public Builder tags(@Nullable Output<List<FlowTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<FlowTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(FlowTagArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder tasks(Output<List<FlowTaskArgs>> tasks) {
            $.tasks = tasks;
            return this;
        }

        public Builder tasks(List<FlowTaskArgs> tasks) {
            return tasks(Output.of(tasks));
        }

        public Builder tasks(FlowTaskArgs... tasks) {
            return tasks(List.of(tasks));
        }

        public Builder triggerConfig(Output<FlowTriggerConfigArgs> triggerConfig) {
            $.triggerConfig = triggerConfig;
            return this;
        }

        public Builder triggerConfig(FlowTriggerConfigArgs triggerConfig) {
            return triggerConfig(Output.of(triggerConfig));
        }

        public FlowArgs build() {
            $.destinationFlowConfigList = Objects.requireNonNull($.destinationFlowConfigList, "expected parameter 'destinationFlowConfigList' to be non-null");
            $.sourceFlowConfig = Objects.requireNonNull($.sourceFlowConfig, "expected parameter 'sourceFlowConfig' to be non-null");
            $.tasks = Objects.requireNonNull($.tasks, "expected parameter 'tasks' to be non-null");
            $.triggerConfig = Objects.requireNonNull($.triggerConfig, "expected parameter 'triggerConfig' to be non-null");
            return $;
        }
    }

}
