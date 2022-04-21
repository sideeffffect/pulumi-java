// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.notebooks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.notebooks.inputs.RuntimeAccessConfigGetArgs;
import com.pulumi.gcp.notebooks.inputs.RuntimeMetricGetArgs;
import com.pulumi.gcp.notebooks.inputs.RuntimeSoftwareConfigGetArgs;
import com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuntimeState extends com.pulumi.resources.ResourceArgs {

    public static final RuntimeState Empty = new RuntimeState();

    /**
     * The config settings for accessing runtime.
     * Structure is documented below.
     * 
     */
    @Import(name="accessConfig")
    private @Nullable Output<RuntimeAccessConfigGetArgs> accessConfig;

    public Optional<Output<RuntimeAccessConfigGetArgs>> accessConfig() {
        return Optional.ofNullable(this.accessConfig);
    }

    /**
     * The health state of this runtime. For a list of possible output values, see
     * &#39;https://cloud.google.com/vertex-ai/docs/workbench/ reference/rest/v1/projects.locations.runtimes#healthstate&#39;.
     * 
     */
    @Import(name="healthState")
    private @Nullable Output<String> healthState;

    public Optional<Output<String>> healthState() {
        return Optional.ofNullable(this.healthState);
    }

    /**
     * A reference to the zone where the machine resides.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Contains Runtime daemon metrics such as Service status and JupyterLab status
     * 
     */
    @Import(name="metrics")
    private @Nullable Output<List<RuntimeMetricGetArgs>> metrics;

    public Optional<Output<List<RuntimeMetricGetArgs>>> metrics() {
        return Optional.ofNullable(this.metrics);
    }

    /**
     * The name specified for the Notebook instance.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The config settings for software inside the runtime.
     * Structure is documented below.
     * 
     */
    @Import(name="softwareConfig")
    private @Nullable Output<RuntimeSoftwareConfigGetArgs> softwareConfig;

    public Optional<Output<RuntimeSoftwareConfigGetArgs>> softwareConfig() {
        return Optional.ofNullable(this.softwareConfig);
    }

    /**
     * The state of this runtime.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Use a Compute Engine VM image to start the managed notebook instance.
     * Structure is documented below.
     * 
     */
    @Import(name="virtualMachine")
    private @Nullable Output<RuntimeVirtualMachineGetArgs> virtualMachine;

    public Optional<Output<RuntimeVirtualMachineGetArgs>> virtualMachine() {
        return Optional.ofNullable(this.virtualMachine);
    }

    private RuntimeState() {}

    private RuntimeState(RuntimeState $) {
        this.accessConfig = $.accessConfig;
        this.healthState = $.healthState;
        this.location = $.location;
        this.metrics = $.metrics;
        this.name = $.name;
        this.project = $.project;
        this.softwareConfig = $.softwareConfig;
        this.state = $.state;
        this.virtualMachine = $.virtualMachine;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuntimeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuntimeState $;

        public Builder() {
            $ = new RuntimeState();
        }

        public Builder(RuntimeState defaults) {
            $ = new RuntimeState(Objects.requireNonNull(defaults));
        }

        public Builder accessConfig(@Nullable Output<RuntimeAccessConfigGetArgs> accessConfig) {
            $.accessConfig = accessConfig;
            return this;
        }

        public Builder accessConfig(RuntimeAccessConfigGetArgs accessConfig) {
            return accessConfig(Output.of(accessConfig));
        }

        public Builder healthState(@Nullable Output<String> healthState) {
            $.healthState = healthState;
            return this;
        }

        public Builder healthState(String healthState) {
            return healthState(Output.of(healthState));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder metrics(@Nullable Output<List<RuntimeMetricGetArgs>> metrics) {
            $.metrics = metrics;
            return this;
        }

        public Builder metrics(List<RuntimeMetricGetArgs> metrics) {
            return metrics(Output.of(metrics));
        }

        public Builder metrics(RuntimeMetricGetArgs... metrics) {
            return metrics(List.of(metrics));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder softwareConfig(@Nullable Output<RuntimeSoftwareConfigGetArgs> softwareConfig) {
            $.softwareConfig = softwareConfig;
            return this;
        }

        public Builder softwareConfig(RuntimeSoftwareConfigGetArgs softwareConfig) {
            return softwareConfig(Output.of(softwareConfig));
        }

        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        public Builder state(String state) {
            return state(Output.of(state));
        }

        public Builder virtualMachine(@Nullable Output<RuntimeVirtualMachineGetArgs> virtualMachine) {
            $.virtualMachine = virtualMachine;
            return this;
        }

        public Builder virtualMachine(RuntimeVirtualMachineGetArgs virtualMachine) {
            return virtualMachine(Output.of(virtualMachine));
        }

        public RuntimeState build() {
            return $;
        }
    }

}
