// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.docker.inputs.ServiceAuthArgs;
import com.pulumi.docker.inputs.ServiceConvergeConfigArgs;
import com.pulumi.docker.inputs.ServiceEndpointSpecArgs;
import com.pulumi.docker.inputs.ServiceLabelArgs;
import com.pulumi.docker.inputs.ServiceModeArgs;
import com.pulumi.docker.inputs.ServiceRollbackConfigArgs;
import com.pulumi.docker.inputs.ServiceTaskSpecArgs;
import com.pulumi.docker.inputs.ServiceUpdateConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    /**
     * Configuration for the authentication for pulling the images of the service
     * 
     */
    @Import(name="auth")
    private @Nullable Output<ServiceAuthArgs> auth;

    public Optional<Output<ServiceAuthArgs>> auth() {
        return Optional.ofNullable(this.auth);
    }

    /**
     * A configuration to ensure that a service converges aka reaches the desired that of all task up and running
     * 
     */
    @Import(name="convergeConfig")
    private @Nullable Output<ServiceConvergeConfigArgs> convergeConfig;

    public Optional<Output<ServiceConvergeConfigArgs>> convergeConfig() {
        return Optional.ofNullable(this.convergeConfig);
    }

    /**
     * Properties that can be configured to access and load balance a service
     * 
     */
    @Import(name="endpointSpec")
    private @Nullable Output<ServiceEndpointSpecArgs> endpointSpec;

    public Optional<Output<ServiceEndpointSpecArgs>> endpointSpec() {
        return Optional.ofNullable(this.endpointSpec);
    }

    /**
     * User-defined key/value metadata
     * 
     */
    @Import(name="labels")
    private @Nullable Output<List<ServiceLabelArgs>> labels;

    public Optional<Output<List<ServiceLabelArgs>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Scheduling mode for the service
     * 
     */
    @Import(name="mode")
    private @Nullable Output<ServiceModeArgs> mode;

    public Optional<Output<ServiceModeArgs>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * Name of the service
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specification for the rollback strategy of the service
     * 
     */
    @Import(name="rollbackConfig")
    private @Nullable Output<ServiceRollbackConfigArgs> rollbackConfig;

    public Optional<Output<ServiceRollbackConfigArgs>> rollbackConfig() {
        return Optional.ofNullable(this.rollbackConfig);
    }

    /**
     * User modifiable task configuration
     * 
     */
    @Import(name="taskSpec", required=true)
    private Output<ServiceTaskSpecArgs> taskSpec;

    public Output<ServiceTaskSpecArgs> taskSpec() {
        return this.taskSpec;
    }

    /**
     * Specification for the update strategy of the service
     * 
     */
    @Import(name="updateConfig")
    private @Nullable Output<ServiceUpdateConfigArgs> updateConfig;

    public Optional<Output<ServiceUpdateConfigArgs>> updateConfig() {
        return Optional.ofNullable(this.updateConfig);
    }

    private ServiceArgs() {}

    private ServiceArgs(ServiceArgs $) {
        this.auth = $.auth;
        this.convergeConfig = $.convergeConfig;
        this.endpointSpec = $.endpointSpec;
        this.labels = $.labels;
        this.mode = $.mode;
        this.name = $.name;
        this.rollbackConfig = $.rollbackConfig;
        this.taskSpec = $.taskSpec;
        this.updateConfig = $.updateConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceArgs $;

        public Builder() {
            $ = new ServiceArgs();
        }

        public Builder(ServiceArgs defaults) {
            $ = new ServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder auth(@Nullable Output<ServiceAuthArgs> auth) {
            $.auth = auth;
            return this;
        }

        public Builder auth(ServiceAuthArgs auth) {
            return auth(Output.of(auth));
        }

        public Builder convergeConfig(@Nullable Output<ServiceConvergeConfigArgs> convergeConfig) {
            $.convergeConfig = convergeConfig;
            return this;
        }

        public Builder convergeConfig(ServiceConvergeConfigArgs convergeConfig) {
            return convergeConfig(Output.of(convergeConfig));
        }

        public Builder endpointSpec(@Nullable Output<ServiceEndpointSpecArgs> endpointSpec) {
            $.endpointSpec = endpointSpec;
            return this;
        }

        public Builder endpointSpec(ServiceEndpointSpecArgs endpointSpec) {
            return endpointSpec(Output.of(endpointSpec));
        }

        public Builder labels(@Nullable Output<List<ServiceLabelArgs>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(List<ServiceLabelArgs> labels) {
            return labels(Output.of(labels));
        }

        public Builder labels(ServiceLabelArgs... labels) {
            return labels(List.of(labels));
        }

        public Builder mode(@Nullable Output<ServiceModeArgs> mode) {
            $.mode = mode;
            return this;
        }

        public Builder mode(ServiceModeArgs mode) {
            return mode(Output.of(mode));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder rollbackConfig(@Nullable Output<ServiceRollbackConfigArgs> rollbackConfig) {
            $.rollbackConfig = rollbackConfig;
            return this;
        }

        public Builder rollbackConfig(ServiceRollbackConfigArgs rollbackConfig) {
            return rollbackConfig(Output.of(rollbackConfig));
        }

        public Builder taskSpec(Output<ServiceTaskSpecArgs> taskSpec) {
            $.taskSpec = taskSpec;
            return this;
        }

        public Builder taskSpec(ServiceTaskSpecArgs taskSpec) {
            return taskSpec(Output.of(taskSpec));
        }

        public Builder updateConfig(@Nullable Output<ServiceUpdateConfigArgs> updateConfig) {
            $.updateConfig = updateConfig;
            return this;
        }

        public Builder updateConfig(ServiceUpdateConfigArgs updateConfig) {
            return updateConfig(Output.of(updateConfig));
        }

        public ServiceArgs build() {
            $.taskSpec = Objects.requireNonNull($.taskSpec, "expected parameter 'taskSpec' to be non-null");
            return $;
        }
    }

}
