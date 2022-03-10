// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvArgs;
import io.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromArgs;
import io.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerPortArgs;
import io.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerResourcesArgs;
import io.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerVolumeMountArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTemplateSpecContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecContainerArgs Empty = new ServiceTemplateSpecContainerArgs();

    /**
     * Arguments to the entrypoint.
     * The docker image's CMD is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the container's
     * environment. If a variable cannot be resolved, the reference in the input
     * string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
     * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
     * regardless of whether the variable exists or not.
     * More info:
     * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @InputImport(name="args")
      private final @Nullable Input<List<String>> args;

    public Input<List<String>> getArgs() {
        return this.args == null ? Input.empty() : this.args;
    }

    /**
     * Entrypoint array. Not executed within a shell.
     * The docker image's ENTRYPOINT is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the container's
     * environment. If a variable cannot be resolved, the reference in the input
     * string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
     * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
     * regardless of whether the variable exists or not.
     * More info:
     * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @InputImport(name="commands")
      private final @Nullable Input<List<String>> commands;

    public Input<List<String>> getCommands() {
        return this.commands == null ? Input.empty() : this.commands;
    }

    /**
     * - 
     * (Optional, Deprecated)
     * List of sources to populate environment variables in the container.
     * All invalid keys will be reported as an event when the container is starting.
     * When a key exists in multiple sources, the value associated with the last source will
     * take precedence. Values defined by an Env with a duplicate key will take
     * precedence.
     * Structure is documented below.
     * 
     * @Deprecated
     * Not supported by Cloud Run fully managed
     * 
     */
    @Deprecated /* Not supported by Cloud Run fully managed */
    @InputImport(name="envFroms")
      private final @Nullable Input<List<ServiceTemplateSpecContainerEnvFromArgs>> envFroms;

    @Deprecated /* Not supported by Cloud Run fully managed */
    public Input<List<ServiceTemplateSpecContainerEnvFromArgs>> getEnvFroms() {
        return this.envFroms == null ? Input.empty() : this.envFroms;
    }

    /**
     * List of environment variables to set in the container.
     * Structure is documented below.
     * 
     */
    @InputImport(name="envs")
      private final @Nullable Input<List<ServiceTemplateSpecContainerEnvArgs>> envs;

    public Input<List<ServiceTemplateSpecContainerEnvArgs>> getEnvs() {
        return this.envs == null ? Input.empty() : this.envs;
    }

    /**
     * Docker image name. This is most often a reference to a container located
     * in the container registry, such as gcr.io/cloudrun/hello
     * More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    @InputImport(name="image", required=true)
      private final Input<String> image;

    public Input<String> getImage() {
        return this.image;
    }

    /**
     * List of open ports in the container.
     * More Info:
     * https://cloud.google.com/run/docs/reference/rest/v1/RevisionSpec#ContainerPort
     * Structure is documented below.
     * 
     */
    @InputImport(name="ports")
      private final @Nullable Input<List<ServiceTemplateSpecContainerPortArgs>> ports;

    public Input<List<ServiceTemplateSpecContainerPortArgs>> getPorts() {
        return this.ports == null ? Input.empty() : this.ports;
    }

    /**
     * Compute Resources required by this container. Used to set values such as max memory
     * More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#requests-and-limits
     * Structure is documented below.
     * 
     */
    @InputImport(name="resources")
      private final @Nullable Input<ServiceTemplateSpecContainerResourcesArgs> resources;

    public Input<ServiceTemplateSpecContainerResourcesArgs> getResources() {
        return this.resources == null ? Input.empty() : this.resources;
    }

    /**
     * Volume to mount into the container's filesystem.
     * Only supports SecretVolumeSources.
     * Structure is documented below.
     * 
     */
    @InputImport(name="volumeMounts")
      private final @Nullable Input<List<ServiceTemplateSpecContainerVolumeMountArgs>> volumeMounts;

    public Input<List<ServiceTemplateSpecContainerVolumeMountArgs>> getVolumeMounts() {
        return this.volumeMounts == null ? Input.empty() : this.volumeMounts;
    }

    /**
     * - 
     * (Optional, Deprecated)
     * Container's working directory.
     * If not specified, the container runtime's default will be used, which
     * might be configured in the container image.
     * 
     * @Deprecated
     * Not supported by Cloud Run fully managed
     * 
     */
    @Deprecated /* Not supported by Cloud Run fully managed */
    @InputImport(name="workingDir")
      private final @Nullable Input<String> workingDir;

    @Deprecated /* Not supported by Cloud Run fully managed */
    public Input<String> getWorkingDir() {
        return this.workingDir == null ? Input.empty() : this.workingDir;
    }

    public ServiceTemplateSpecContainerArgs(
        @Nullable Input<List<String>> args,
        @Nullable Input<List<String>> commands,
        @Nullable Input<List<ServiceTemplateSpecContainerEnvFromArgs>> envFroms,
        @Nullable Input<List<ServiceTemplateSpecContainerEnvArgs>> envs,
        Input<String> image,
        @Nullable Input<List<ServiceTemplateSpecContainerPortArgs>> ports,
        @Nullable Input<ServiceTemplateSpecContainerResourcesArgs> resources,
        @Nullable Input<List<ServiceTemplateSpecContainerVolumeMountArgs>> volumeMounts,
        @Nullable Input<String> workingDir) {
        this.args = args;
        this.commands = commands;
        this.envFroms = envFroms;
        this.envs = envs;
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.ports = ports;
        this.resources = resources;
        this.volumeMounts = volumeMounts;
        this.workingDir = workingDir;
    }

    private ServiceTemplateSpecContainerArgs() {
        this.args = Input.empty();
        this.commands = Input.empty();
        this.envFroms = Input.empty();
        this.envs = Input.empty();
        this.image = Input.empty();
        this.ports = Input.empty();
        this.resources = Input.empty();
        this.volumeMounts = Input.empty();
        this.workingDir = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> args;
        private @Nullable Input<List<String>> commands;
        private @Nullable Input<List<ServiceTemplateSpecContainerEnvFromArgs>> envFroms;
        private @Nullable Input<List<ServiceTemplateSpecContainerEnvArgs>> envs;
        private Input<String> image;
        private @Nullable Input<List<ServiceTemplateSpecContainerPortArgs>> ports;
        private @Nullable Input<ServiceTemplateSpecContainerResourcesArgs> resources;
        private @Nullable Input<List<ServiceTemplateSpecContainerVolumeMountArgs>> volumeMounts;
        private @Nullable Input<String> workingDir;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.commands = defaults.commands;
    	      this.envFroms = defaults.envFroms;
    	      this.envs = defaults.envs;
    	      this.image = defaults.image;
    	      this.ports = defaults.ports;
    	      this.resources = defaults.resources;
    	      this.volumeMounts = defaults.volumeMounts;
    	      this.workingDir = defaults.workingDir;
        }

        public Builder args(@Nullable Input<List<String>> args) {
            this.args = args;
            return this;
        }

        public Builder args(@Nullable List<String> args) {
            this.args = Input.ofNullable(args);
            return this;
        }

        public Builder commands(@Nullable Input<List<String>> commands) {
            this.commands = commands;
            return this;
        }

        public Builder commands(@Nullable List<String> commands) {
            this.commands = Input.ofNullable(commands);
            return this;
        }

        public Builder envFroms(@Nullable Input<List<ServiceTemplateSpecContainerEnvFromArgs>> envFroms) {
            this.envFroms = envFroms;
            return this;
        }

        public Builder envFroms(@Nullable List<ServiceTemplateSpecContainerEnvFromArgs> envFroms) {
            this.envFroms = Input.ofNullable(envFroms);
            return this;
        }

        public Builder envs(@Nullable Input<List<ServiceTemplateSpecContainerEnvArgs>> envs) {
            this.envs = envs;
            return this;
        }

        public Builder envs(@Nullable List<ServiceTemplateSpecContainerEnvArgs> envs) {
            this.envs = Input.ofNullable(envs);
            return this;
        }

        public Builder image(Input<String> image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder image(String image) {
            this.image = Input.of(Objects.requireNonNull(image));
            return this;
        }

        public Builder ports(@Nullable Input<List<ServiceTemplateSpecContainerPortArgs>> ports) {
            this.ports = ports;
            return this;
        }

        public Builder ports(@Nullable List<ServiceTemplateSpecContainerPortArgs> ports) {
            this.ports = Input.ofNullable(ports);
            return this;
        }

        public Builder resources(@Nullable Input<ServiceTemplateSpecContainerResourcesArgs> resources) {
            this.resources = resources;
            return this;
        }

        public Builder resources(@Nullable ServiceTemplateSpecContainerResourcesArgs resources) {
            this.resources = Input.ofNullable(resources);
            return this;
        }

        public Builder volumeMounts(@Nullable Input<List<ServiceTemplateSpecContainerVolumeMountArgs>> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }

        public Builder volumeMounts(@Nullable List<ServiceTemplateSpecContainerVolumeMountArgs> volumeMounts) {
            this.volumeMounts = Input.ofNullable(volumeMounts);
            return this;
        }

        public Builder workingDir(@Nullable Input<String> workingDir) {
            this.workingDir = workingDir;
            return this;
        }

        public Builder workingDir(@Nullable String workingDir) {
            this.workingDir = Input.ofNullable(workingDir);
            return this;
        }
        public ServiceTemplateSpecContainerArgs build() {
            return new ServiceTemplateSpecContainerArgs(args, commands, envFroms, envs, image, ports, resources, volumeMounts, workingDir);
        }
    }
}
