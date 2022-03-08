// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.cloudrun.outputs.GetServiceTemplateSpecContainerEnv;
import io.pulumi.gcp.cloudrun.outputs.GetServiceTemplateSpecContainerEnvFrom;
import io.pulumi.gcp.cloudrun.outputs.GetServiceTemplateSpecContainerPort;
import io.pulumi.gcp.cloudrun.outputs.GetServiceTemplateSpecContainerResource;
import io.pulumi.gcp.cloudrun.outputs.GetServiceTemplateSpecContainerVolumeMount;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetServiceTemplateSpecContainer {
    private final List<String> args;
    private final List<String> commands;
    private final List<GetServiceTemplateSpecContainerEnvFrom> envFroms;
    private final List<GetServiceTemplateSpecContainerEnv> envs;
    private final String image;
    private final List<GetServiceTemplateSpecContainerPort> ports;
    private final List<GetServiceTemplateSpecContainerResource> resources;
    private final List<GetServiceTemplateSpecContainerVolumeMount> volumeMounts;
    private final String workingDir;

    @OutputCustomType.Constructor({"args","commands","envFroms","envs","image","ports","resources","volumeMounts","workingDir"})
    private GetServiceTemplateSpecContainer(
        List<String> args,
        List<String> commands,
        List<GetServiceTemplateSpecContainerEnvFrom> envFroms,
        List<GetServiceTemplateSpecContainerEnv> envs,
        String image,
        List<GetServiceTemplateSpecContainerPort> ports,
        List<GetServiceTemplateSpecContainerResource> resources,
        List<GetServiceTemplateSpecContainerVolumeMount> volumeMounts,
        String workingDir) {
        this.args = args;
        this.commands = commands;
        this.envFroms = envFroms;
        this.envs = envs;
        this.image = image;
        this.ports = ports;
        this.resources = resources;
        this.volumeMounts = volumeMounts;
        this.workingDir = workingDir;
    }

    public List<String> getArgs() {
        return this.args;
    }
    public List<String> getCommands() {
        return this.commands;
    }
    public List<GetServiceTemplateSpecContainerEnvFrom> getEnvFroms() {
        return this.envFroms;
    }
    public List<GetServiceTemplateSpecContainerEnv> getEnvs() {
        return this.envs;
    }
    public String getImage() {
        return this.image;
    }
    public List<GetServiceTemplateSpecContainerPort> getPorts() {
        return this.ports;
    }
    public List<GetServiceTemplateSpecContainerResource> getResources() {
        return this.resources;
    }
    public List<GetServiceTemplateSpecContainerVolumeMount> getVolumeMounts() {
        return this.volumeMounts;
    }
    public String getWorkingDir() {
        return this.workingDir;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateSpecContainer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> args;
        private List<String> commands;
        private List<GetServiceTemplateSpecContainerEnvFrom> envFroms;
        private List<GetServiceTemplateSpecContainerEnv> envs;
        private String image;
        private List<GetServiceTemplateSpecContainerPort> ports;
        private List<GetServiceTemplateSpecContainerResource> resources;
        private List<GetServiceTemplateSpecContainerVolumeMount> volumeMounts;
        private String workingDir;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceTemplateSpecContainer defaults) {
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

        public Builder setArgs(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }

        public Builder setCommands(List<String> commands) {
            this.commands = Objects.requireNonNull(commands);
            return this;
        }

        public Builder setEnvFroms(List<GetServiceTemplateSpecContainerEnvFrom> envFroms) {
            this.envFroms = Objects.requireNonNull(envFroms);
            return this;
        }

        public Builder setEnvs(List<GetServiceTemplateSpecContainerEnv> envs) {
            this.envs = Objects.requireNonNull(envs);
            return this;
        }

        public Builder setImage(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setPorts(List<GetServiceTemplateSpecContainerPort> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }

        public Builder setResources(List<GetServiceTemplateSpecContainerResource> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }

        public Builder setVolumeMounts(List<GetServiceTemplateSpecContainerVolumeMount> volumeMounts) {
            this.volumeMounts = Objects.requireNonNull(volumeMounts);
            return this;
        }

        public Builder setWorkingDir(String workingDir) {
            this.workingDir = Objects.requireNonNull(workingDir);
            return this;
        }
        public GetServiceTemplateSpecContainer build() {
            return new GetServiceTemplateSpecContainer(args, commands, envFroms, envs, image, ports, resources, volumeMounts, workingDir);
        }
    }
}
