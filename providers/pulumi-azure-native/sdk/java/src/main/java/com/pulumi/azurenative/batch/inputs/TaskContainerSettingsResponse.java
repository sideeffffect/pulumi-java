// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.azurenative.batch.inputs.ContainerRegistryResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskContainerSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final TaskContainerSettingsResponse Empty = new TaskContainerSettingsResponse();

    /**
     * These additional options are supplied as arguments to the &#34;docker create&#34; command, in addition to those controlled by the Batch Service.
     * 
     */
    @Import(name="containerRunOptions")
    private @Nullable String containerRunOptions;

    public Optional<String> containerRunOptions() {
        return Optional.ofNullable(this.containerRunOptions);
    }

    /**
     * This is the full image reference, as would be specified to &#34;docker pull&#34;. If no tag is provided as part of the image name, the tag &#34;:latest&#34; is used as a default.
     * 
     */
    @Import(name="imageName", required=true)
    private String imageName;

    public String imageName() {
        return this.imageName;
    }

    /**
     * This setting can be omitted if was already provided at pool creation.
     * 
     */
    @Import(name="registry")
    private @Nullable ContainerRegistryResponse registry;

    public Optional<ContainerRegistryResponse> registry() {
        return Optional.ofNullable(this.registry);
    }

    @Import(name="workingDirectory")
    private @Nullable String workingDirectory;

    public Optional<String> workingDirectory() {
        return Optional.ofNullable(this.workingDirectory);
    }

    private TaskContainerSettingsResponse() {}

    private TaskContainerSettingsResponse(TaskContainerSettingsResponse $) {
        this.containerRunOptions = $.containerRunOptions;
        this.imageName = $.imageName;
        this.registry = $.registry;
        this.workingDirectory = $.workingDirectory;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskContainerSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskContainerSettingsResponse $;

        public Builder() {
            $ = new TaskContainerSettingsResponse();
        }

        public Builder(TaskContainerSettingsResponse defaults) {
            $ = new TaskContainerSettingsResponse(Objects.requireNonNull(defaults));
        }

        public Builder containerRunOptions(@Nullable String containerRunOptions) {
            $.containerRunOptions = containerRunOptions;
            return this;
        }

        public Builder imageName(String imageName) {
            $.imageName = imageName;
            return this;
        }

        public Builder registry(@Nullable ContainerRegistryResponse registry) {
            $.registry = registry;
            return this;
        }

        public Builder workingDirectory(@Nullable String workingDirectory) {
            $.workingDirectory = workingDirectory;
            return this;
        }

        public TaskContainerSettingsResponse build() {
            $.imageName = Objects.requireNonNull($.imageName, "expected parameter 'imageName' to be non-null");
            return $;
        }
    }

}
