// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.notebooks_v1.inputs.RuntimeAccessConfigArgs;
import com.pulumi.googlenative.notebooks_v1.inputs.RuntimeSoftwareConfigArgs;
import com.pulumi.googlenative.notebooks_v1.inputs.VirtualMachineArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuntimeArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuntimeArgs Empty = new RuntimeArgs();

    /**
     * The config settings for accessing runtime.
     * 
     */
    @Import(name="accessConfig")
    private @Nullable Output<RuntimeAccessConfigArgs> accessConfig;

    public Optional<Output<RuntimeAccessConfigArgs>> accessConfig() {
        return Optional.ofNullable(this.accessConfig);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="runtimeId", required=true)
    private Output<String> runtimeId;

    public Output<String> runtimeId() {
        return this.runtimeId;
    }

    /**
     * The config settings for software inside the runtime.
     * 
     */
    @Import(name="softwareConfig")
    private @Nullable Output<RuntimeSoftwareConfigArgs> softwareConfig;

    public Optional<Output<RuntimeSoftwareConfigArgs>> softwareConfig() {
        return Optional.ofNullable(this.softwareConfig);
    }

    /**
     * Use a Compute Engine VM image to start the managed notebook instance.
     * 
     */
    @Import(name="virtualMachine")
    private @Nullable Output<VirtualMachineArgs> virtualMachine;

    public Optional<Output<VirtualMachineArgs>> virtualMachine() {
        return Optional.ofNullable(this.virtualMachine);
    }

    private RuntimeArgs() {}

    private RuntimeArgs(RuntimeArgs $) {
        this.accessConfig = $.accessConfig;
        this.location = $.location;
        this.project = $.project;
        this.runtimeId = $.runtimeId;
        this.softwareConfig = $.softwareConfig;
        this.virtualMachine = $.virtualMachine;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuntimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuntimeArgs $;

        public Builder() {
            $ = new RuntimeArgs();
        }

        public Builder(RuntimeArgs defaults) {
            $ = new RuntimeArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessConfig(@Nullable Output<RuntimeAccessConfigArgs> accessConfig) {
            $.accessConfig = accessConfig;
            return this;
        }

        public Builder accessConfig(RuntimeAccessConfigArgs accessConfig) {
            return accessConfig(Output.of(accessConfig));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder runtimeId(Output<String> runtimeId) {
            $.runtimeId = runtimeId;
            return this;
        }

        public Builder runtimeId(String runtimeId) {
            return runtimeId(Output.of(runtimeId));
        }

        public Builder softwareConfig(@Nullable Output<RuntimeSoftwareConfigArgs> softwareConfig) {
            $.softwareConfig = softwareConfig;
            return this;
        }

        public Builder softwareConfig(RuntimeSoftwareConfigArgs softwareConfig) {
            return softwareConfig(Output.of(softwareConfig));
        }

        public Builder virtualMachine(@Nullable Output<VirtualMachineArgs> virtualMachine) {
            $.virtualMachine = virtualMachine;
            return this;
        }

        public Builder virtualMachine(VirtualMachineArgs virtualMachine) {
            return virtualMachine(Output.of(virtualMachine));
        }

        public RuntimeArgs build() {
            $.runtimeId = Objects.requireNonNull($.runtimeId, "expected parameter 'runtimeId' to be non-null");
            return $;
        }
    }

}
