// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.rekognition;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectArgs extends ResourceArgs {

    public static final ProjectArgs Empty = new ProjectArgs();

    @Import(name="projectName")
    private @Nullable Output<String> projectName;

    public Optional<Output<String>> projectName() {
        return Optional.ofNullable(this.projectName);
    }

    private ProjectArgs() {}

    private ProjectArgs(ProjectArgs $) {
        this.projectName = $.projectName;
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

        public Builder projectName(@Nullable Output<String> projectName) {
            $.projectName = projectName;
            return this;
        }

        public Builder projectName(String projectName) {
            return projectName(Output.of(projectName));
        }

        public ProjectArgs build() {
            return $;
        }
    }

}
