// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskDefinitionDockerVolumeConfigurationArgs extends ResourceArgs {

    public static final TaskDefinitionDockerVolumeConfigurationArgs Empty = new TaskDefinitionDockerVolumeConfigurationArgs();

    @Import(name="autoprovision")
    private @Nullable Output<Boolean> autoprovision;

    public Optional<Output<Boolean>> autoprovision() {
        return Optional.ofNullable(this.autoprovision);
    }

    @Import(name="driver")
    private @Nullable Output<String> driver;

    public Optional<Output<String>> driver() {
        return Optional.ofNullable(this.driver);
    }

    @Import(name="driverOpts")
    private @Nullable Output<Object> driverOpts;

    public Optional<Output<Object>> driverOpts() {
        return Optional.ofNullable(this.driverOpts);
    }

    @Import(name="labels")
    private @Nullable Output<Object> labels;

    public Optional<Output<Object>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="scope")
    private @Nullable Output<String> scope;

    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private TaskDefinitionDockerVolumeConfigurationArgs() {}

    private TaskDefinitionDockerVolumeConfigurationArgs(TaskDefinitionDockerVolumeConfigurationArgs $) {
        this.autoprovision = $.autoprovision;
        this.driver = $.driver;
        this.driverOpts = $.driverOpts;
        this.labels = $.labels;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskDefinitionDockerVolumeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskDefinitionDockerVolumeConfigurationArgs $;

        public Builder() {
            $ = new TaskDefinitionDockerVolumeConfigurationArgs();
        }

        public Builder(TaskDefinitionDockerVolumeConfigurationArgs defaults) {
            $ = new TaskDefinitionDockerVolumeConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoprovision(@Nullable Output<Boolean> autoprovision) {
            $.autoprovision = autoprovision;
            return this;
        }

        public Builder autoprovision(Boolean autoprovision) {
            return autoprovision(Output.of(autoprovision));
        }

        public Builder driver(@Nullable Output<String> driver) {
            $.driver = driver;
            return this;
        }

        public Builder driver(String driver) {
            return driver(Output.of(driver));
        }

        public Builder driverOpts(@Nullable Output<Object> driverOpts) {
            $.driverOpts = driverOpts;
            return this;
        }

        public Builder driverOpts(Object driverOpts) {
            return driverOpts(Output.of(driverOpts));
        }

        public Builder labels(@Nullable Output<Object> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Object labels) {
            return labels(Output.of(labels));
        }

        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public TaskDefinitionDockerVolumeConfigurationArgs build() {
            return $;
        }
    }

}
