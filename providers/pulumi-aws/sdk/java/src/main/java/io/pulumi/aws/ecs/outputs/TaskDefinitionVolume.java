// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.outputs;

import io.pulumi.aws.ecs.outputs.TaskDefinitionVolumeDockerVolumeConfiguration;
import io.pulumi.aws.ecs.outputs.TaskDefinitionVolumeEfsVolumeConfiguration;
import io.pulumi.aws.ecs.outputs.TaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TaskDefinitionVolume {
    /**
     * Configuration block to configure a docker volume. Detailed below.
     * 
     */
    private final @Nullable TaskDefinitionVolumeDockerVolumeConfiguration dockerVolumeConfiguration;
    /**
     * Configuration block for an EFS volume. Detailed below.
     * 
     */
    private final @Nullable TaskDefinitionVolumeEfsVolumeConfiguration efsVolumeConfiguration;
    /**
     * Configuration block for an FSX Windows File Server volume. Detailed below.
     * 
     */
    private final @Nullable TaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration fsxWindowsFileServerVolumeConfiguration;
    /**
     * Path on the host container instance that is presented to the container. If not set, ECS will create a nonpersistent data volume that starts empty and is deleted after the task has finished.
     * 
     */
    private final @Nullable String hostPath;
    /**
     * Name of the volume. This name is referenced in the `sourceVolume`
     * parameter of container definition in the `mountPoints` section.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"dockerVolumeConfiguration","efsVolumeConfiguration","fsxWindowsFileServerVolumeConfiguration","hostPath","name"})
    private TaskDefinitionVolume(
        @Nullable TaskDefinitionVolumeDockerVolumeConfiguration dockerVolumeConfiguration,
        @Nullable TaskDefinitionVolumeEfsVolumeConfiguration efsVolumeConfiguration,
        @Nullable TaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration fsxWindowsFileServerVolumeConfiguration,
        @Nullable String hostPath,
        String name) {
        this.dockerVolumeConfiguration = dockerVolumeConfiguration;
        this.efsVolumeConfiguration = efsVolumeConfiguration;
        this.fsxWindowsFileServerVolumeConfiguration = fsxWindowsFileServerVolumeConfiguration;
        this.hostPath = hostPath;
        this.name = name;
    }

    /**
     * Configuration block to configure a docker volume. Detailed below.
     * 
    */
    public Optional<TaskDefinitionVolumeDockerVolumeConfiguration> getDockerVolumeConfiguration() {
        return Optional.ofNullable(this.dockerVolumeConfiguration);
    }
    /**
     * Configuration block for an EFS volume. Detailed below.
     * 
    */
    public Optional<TaskDefinitionVolumeEfsVolumeConfiguration> getEfsVolumeConfiguration() {
        return Optional.ofNullable(this.efsVolumeConfiguration);
    }
    /**
     * Configuration block for an FSX Windows File Server volume. Detailed below.
     * 
    */
    public Optional<TaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration> getFsxWindowsFileServerVolumeConfiguration() {
        return Optional.ofNullable(this.fsxWindowsFileServerVolumeConfiguration);
    }
    /**
     * Path on the host container instance that is presented to the container. If not set, ECS will create a nonpersistent data volume that starts empty and is deleted after the task has finished.
     * 
    */
    public Optional<String> getHostPath() {
        return Optional.ofNullable(this.hostPath);
    }
    /**
     * Name of the volume. This name is referenced in the `sourceVolume`
     * parameter of container definition in the `mountPoints` section.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionVolume defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TaskDefinitionVolumeDockerVolumeConfiguration dockerVolumeConfiguration;
        private @Nullable TaskDefinitionVolumeEfsVolumeConfiguration efsVolumeConfiguration;
        private @Nullable TaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration fsxWindowsFileServerVolumeConfiguration;
        private @Nullable String hostPath;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dockerVolumeConfiguration = defaults.dockerVolumeConfiguration;
    	      this.efsVolumeConfiguration = defaults.efsVolumeConfiguration;
    	      this.fsxWindowsFileServerVolumeConfiguration = defaults.fsxWindowsFileServerVolumeConfiguration;
    	      this.hostPath = defaults.hostPath;
    	      this.name = defaults.name;
        }

        public Builder setDockerVolumeConfiguration(@Nullable TaskDefinitionVolumeDockerVolumeConfiguration dockerVolumeConfiguration) {
            this.dockerVolumeConfiguration = dockerVolumeConfiguration;
            return this;
        }

        public Builder setEfsVolumeConfiguration(@Nullable TaskDefinitionVolumeEfsVolumeConfiguration efsVolumeConfiguration) {
            this.efsVolumeConfiguration = efsVolumeConfiguration;
            return this;
        }

        public Builder setFsxWindowsFileServerVolumeConfiguration(@Nullable TaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration fsxWindowsFileServerVolumeConfiguration) {
            this.fsxWindowsFileServerVolumeConfiguration = fsxWindowsFileServerVolumeConfiguration;
            return this;
        }

        public Builder setHostPath(@Nullable String hostPath) {
            this.hostPath = hostPath;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public TaskDefinitionVolume build() {
            return new TaskDefinitionVolume(dockerVolumeConfiguration, efsVolumeConfiguration, fsxWindowsFileServerVolumeConfiguration, hostPath, name);
        }
    }
}
