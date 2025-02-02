// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudrun.outputs.GetServiceTemplateSpecContainerEnv;
import com.pulumi.gcp.cloudrun.outputs.GetServiceTemplateSpecContainerEnvFrom;
import com.pulumi.gcp.cloudrun.outputs.GetServiceTemplateSpecContainerPort;
import com.pulumi.gcp.cloudrun.outputs.GetServiceTemplateSpecContainerResource;
import com.pulumi.gcp.cloudrun.outputs.GetServiceTemplateSpecContainerVolumeMount;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
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

    @CustomType.Constructor
    private GetServiceTemplateSpecContainer(
        @CustomType.Parameter("args") List<String> args,
        @CustomType.Parameter("commands") List<String> commands,
        @CustomType.Parameter("envFroms") List<GetServiceTemplateSpecContainerEnvFrom> envFroms,
        @CustomType.Parameter("envs") List<GetServiceTemplateSpecContainerEnv> envs,
        @CustomType.Parameter("image") String image,
        @CustomType.Parameter("ports") List<GetServiceTemplateSpecContainerPort> ports,
        @CustomType.Parameter("resources") List<GetServiceTemplateSpecContainerResource> resources,
        @CustomType.Parameter("volumeMounts") List<GetServiceTemplateSpecContainerVolumeMount> volumeMounts,
        @CustomType.Parameter("workingDir") String workingDir) {
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

    public List<String> args() {
        return this.args;
    }
    public List<String> commands() {
        return this.commands;
    }
    public List<GetServiceTemplateSpecContainerEnvFrom> envFroms() {
        return this.envFroms;
    }
    public List<GetServiceTemplateSpecContainerEnv> envs() {
        return this.envs;
    }
    public String image() {
        return this.image;
    }
    public List<GetServiceTemplateSpecContainerPort> ports() {
        return this.ports;
    }
    public List<GetServiceTemplateSpecContainerResource> resources() {
        return this.resources;
    }
    public List<GetServiceTemplateSpecContainerVolumeMount> volumeMounts() {
        return this.volumeMounts;
    }
    public String workingDir() {
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

        public Builder args(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        public Builder commands(List<String> commands) {
            this.commands = Objects.requireNonNull(commands);
            return this;
        }
        public Builder commands(String... commands) {
            return commands(List.of(commands));
        }
        public Builder envFroms(List<GetServiceTemplateSpecContainerEnvFrom> envFroms) {
            this.envFroms = Objects.requireNonNull(envFroms);
            return this;
        }
        public Builder envFroms(GetServiceTemplateSpecContainerEnvFrom... envFroms) {
            return envFroms(List.of(envFroms));
        }
        public Builder envs(List<GetServiceTemplateSpecContainerEnv> envs) {
            this.envs = Objects.requireNonNull(envs);
            return this;
        }
        public Builder envs(GetServiceTemplateSpecContainerEnv... envs) {
            return envs(List.of(envs));
        }
        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public Builder ports(List<GetServiceTemplateSpecContainerPort> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }
        public Builder ports(GetServiceTemplateSpecContainerPort... ports) {
            return ports(List.of(ports));
        }
        public Builder resources(List<GetServiceTemplateSpecContainerResource> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }
        public Builder resources(GetServiceTemplateSpecContainerResource... resources) {
            return resources(List.of(resources));
        }
        public Builder volumeMounts(List<GetServiceTemplateSpecContainerVolumeMount> volumeMounts) {
            this.volumeMounts = Objects.requireNonNull(volumeMounts);
            return this;
        }
        public Builder volumeMounts(GetServiceTemplateSpecContainerVolumeMount... volumeMounts) {
            return volumeMounts(List.of(volumeMounts));
        }
        public Builder workingDir(String workingDir) {
            this.workingDir = Objects.requireNonNull(workingDir);
            return this;
        }        public GetServiceTemplateSpecContainer build() {
            return new GetServiceTemplateSpecContainer(args, commands, envFroms, envs, image, ports, resources, volumeMounts, workingDir);
        }
    }
}
