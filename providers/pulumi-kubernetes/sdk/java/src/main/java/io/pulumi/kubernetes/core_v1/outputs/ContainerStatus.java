// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.ContainerState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContainerStatus {
    /**
     * Container's ID in the format 'docker://<container_id>'.
     * 
     */
    private final @Nullable String containerID;
    /**
     * The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images.
     * 
     */
    private final String image;
    /**
     * ImageID of the container's image.
     * 
     */
    private final String imageID;
    /**
     * Details about the container's last termination condition.
     * 
     */
    private final @Nullable ContainerState lastState;
    /**
     * This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.
     * 
     */
    private final String name;
    /**
     * Specifies whether the container has passed its readiness probe.
     * 
     */
    private final Boolean ready;
    /**
     * The number of times the container has been restarted.
     * 
     */
    private final Integer restartCount;
    /**
     * Specifies whether the container has passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is defined.
     * 
     */
    private final @Nullable Boolean started;
    /**
     * Details about the container's current condition.
     * 
     */
    private final @Nullable ContainerState state;

    @OutputCustomType.Constructor({"containerID","image","imageID","lastState","name","ready","restartCount","started","state"})
    private ContainerStatus(
        @Nullable String containerID,
        String image,
        String imageID,
        @Nullable ContainerState lastState,
        String name,
        Boolean ready,
        Integer restartCount,
        @Nullable Boolean started,
        @Nullable ContainerState state) {
        this.containerID = containerID;
        this.image = image;
        this.imageID = imageID;
        this.lastState = lastState;
        this.name = name;
        this.ready = ready;
        this.restartCount = restartCount;
        this.started = started;
        this.state = state;
    }

    /**
     * Container's ID in the format 'docker://<container_id>'.
     * 
    */
    public Optional<String> getContainerID() {
        return Optional.ofNullable(this.containerID);
    }
    /**
     * The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images.
     * 
    */
    public String getImage() {
        return this.image;
    }
    /**
     * ImageID of the container's image.
     * 
    */
    public String getImageID() {
        return this.imageID;
    }
    /**
     * Details about the container's last termination condition.
     * 
    */
    public Optional<ContainerState> getLastState() {
        return Optional.ofNullable(this.lastState);
    }
    /**
     * This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Specifies whether the container has passed its readiness probe.
     * 
    */
    public Boolean getReady() {
        return this.ready;
    }
    /**
     * The number of times the container has been restarted.
     * 
    */
    public Integer getRestartCount() {
        return this.restartCount;
    }
    /**
     * Specifies whether the container has passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is defined.
     * 
    */
    public Optional<Boolean> getStarted() {
        return Optional.ofNullable(this.started);
    }
    /**
     * Details about the container's current condition.
     * 
    */
    public Optional<ContainerState> getState() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String containerID;
        private String image;
        private String imageID;
        private @Nullable ContainerState lastState;
        private String name;
        private Boolean ready;
        private Integer restartCount;
        private @Nullable Boolean started;
        private @Nullable ContainerState state;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerID = defaults.containerID;
    	      this.image = defaults.image;
    	      this.imageID = defaults.imageID;
    	      this.lastState = defaults.lastState;
    	      this.name = defaults.name;
    	      this.ready = defaults.ready;
    	      this.restartCount = defaults.restartCount;
    	      this.started = defaults.started;
    	      this.state = defaults.state;
        }

        public Builder setContainerID(@Nullable String containerID) {
            this.containerID = containerID;
            return this;
        }

        public Builder setImage(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setImageID(String imageID) {
            this.imageID = Objects.requireNonNull(imageID);
            return this;
        }

        public Builder setLastState(@Nullable ContainerState lastState) {
            this.lastState = lastState;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setReady(Boolean ready) {
            this.ready = Objects.requireNonNull(ready);
            return this;
        }

        public Builder setRestartCount(Integer restartCount) {
            this.restartCount = Objects.requireNonNull(restartCount);
            return this;
        }

        public Builder setStarted(@Nullable Boolean started) {
            this.started = started;
            return this;
        }

        public Builder setState(@Nullable ContainerState state) {
            this.state = state;
            return this;
        }
        public ContainerStatus build() {
            return new ContainerStatus(containerID, image, imageID, lastState, name, ready, restartCount, started, state);
        }
    }
}
