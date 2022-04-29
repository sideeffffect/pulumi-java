// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.devicefarm;

import com.pulumi.awsnative.devicefarm.inputs.ProjectTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectArgs extends ResourceArgs {

    public static final ProjectArgs Empty = new ProjectArgs();

    @Import(name="defaultJobTimeoutMinutes")
    private @Nullable Output<Integer> defaultJobTimeoutMinutes;

    public Optional<Output<Integer>> defaultJobTimeoutMinutes() {
        return Optional.ofNullable(this.defaultJobTimeoutMinutes);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="tags")
    private @Nullable Output<List<ProjectTagArgs>> tags;

    public Optional<Output<List<ProjectTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ProjectArgs() {}

    private ProjectArgs(ProjectArgs $) {
        this.defaultJobTimeoutMinutes = $.defaultJobTimeoutMinutes;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectArgs $;

        public Builder() {
            $ = new ProjectArgs();
        }

        public Builder(ProjectArgs defaults) {
            $ = new ProjectArgs(Objects.requireNonNull(defaults));
        }

        public Builder defaultJobTimeoutMinutes(@Nullable Output<Integer> defaultJobTimeoutMinutes) {
            $.defaultJobTimeoutMinutes = defaultJobTimeoutMinutes;
            return this;
        }

        public Builder defaultJobTimeoutMinutes(Integer defaultJobTimeoutMinutes) {
            return defaultJobTimeoutMinutes(Output.of(defaultJobTimeoutMinutes));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder tags(@Nullable Output<List<ProjectTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<ProjectTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(ProjectTagArgs... tags) {
            return tags(List.of(tags));
        }

        public ProjectArgs build() {
            return $;
        }
    }

}
