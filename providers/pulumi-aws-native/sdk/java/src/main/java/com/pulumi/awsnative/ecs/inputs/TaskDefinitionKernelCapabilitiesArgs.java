// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskDefinitionKernelCapabilitiesArgs extends ResourceArgs {

    public static final TaskDefinitionKernelCapabilitiesArgs Empty = new TaskDefinitionKernelCapabilitiesArgs();

    @Import(name="add")
    private @Nullable Output<List<String>> add;

    public Optional<Output<List<String>>> add() {
        return Optional.ofNullable(this.add);
    }

    @Import(name="drop")
    private @Nullable Output<List<String>> drop;

    public Optional<Output<List<String>>> drop() {
        return Optional.ofNullable(this.drop);
    }

    private TaskDefinitionKernelCapabilitiesArgs() {}

    private TaskDefinitionKernelCapabilitiesArgs(TaskDefinitionKernelCapabilitiesArgs $) {
        this.add = $.add;
        this.drop = $.drop;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskDefinitionKernelCapabilitiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskDefinitionKernelCapabilitiesArgs $;

        public Builder() {
            $ = new TaskDefinitionKernelCapabilitiesArgs();
        }

        public Builder(TaskDefinitionKernelCapabilitiesArgs defaults) {
            $ = new TaskDefinitionKernelCapabilitiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder add(@Nullable Output<List<String>> add) {
            $.add = add;
            return this;
        }

        public Builder add(List<String> add) {
            return add(Output.of(add));
        }

        public Builder add(String... add) {
            return add(List.of(add));
        }

        public Builder drop(@Nullable Output<List<String>> drop) {
            $.drop = drop;
            return this;
        }

        public Builder drop(List<String> drop) {
            return drop(Output.of(drop));
        }

        public Builder drop(String... drop) {
            return drop(List.of(drop));
        }

        public TaskDefinitionKernelCapabilitiesArgs build() {
            return $;
        }
    }

}
