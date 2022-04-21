// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectMetadataItemState extends com.pulumi.resources.ResourceArgs {

    public static final ProjectMetadataItemState Empty = new ProjectMetadataItemState();

    /**
     * The metadata key to set.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The value to set for the given metadata key.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ProjectMetadataItemState() {}

    private ProjectMetadataItemState(ProjectMetadataItemState $) {
        this.key = $.key;
        this.project = $.project;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectMetadataItemState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectMetadataItemState $;

        public Builder() {
            $ = new ProjectMetadataItemState();
        }

        public Builder(ProjectMetadataItemState defaults) {
            $ = new ProjectMetadataItemState(Objects.requireNonNull(defaults));
        }

        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ProjectMetadataItemState build() {
            return $;
        }
    }

}
