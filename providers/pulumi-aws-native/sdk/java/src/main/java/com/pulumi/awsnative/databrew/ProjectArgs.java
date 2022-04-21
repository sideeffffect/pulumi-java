// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew;

import com.pulumi.awsnative.databrew.inputs.ProjectSampleArgs;
import com.pulumi.awsnative.databrew.inputs.ProjectTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectArgs Empty = new ProjectArgs();

    /**
     * Dataset name
     * 
     */
    @Import(name="datasetName", required=true)
    private Output<String> datasetName;

    public Output<String> datasetName() {
        return this.datasetName;
    }

    /**
     * Project name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Recipe name
     * 
     */
    @Import(name="recipeName", required=true)
    private Output<String> recipeName;

    public Output<String> recipeName() {
        return this.recipeName;
    }

    /**
     * Role arn
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * Sample
     * 
     */
    @Import(name="sample")
    private @Nullable Output<ProjectSampleArgs> sample;

    public Optional<Output<ProjectSampleArgs>> sample() {
        return Optional.ofNullable(this.sample);
    }

    @Import(name="tags")
    private @Nullable Output<List<ProjectTagArgs>> tags;

    public Optional<Output<List<ProjectTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ProjectArgs() {}

    private ProjectArgs(ProjectArgs $) {
        this.datasetName = $.datasetName;
        this.name = $.name;
        this.recipeName = $.recipeName;
        this.roleArn = $.roleArn;
        this.sample = $.sample;
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

        public Builder datasetName(Output<String> datasetName) {
            $.datasetName = datasetName;
            return this;
        }

        public Builder datasetName(String datasetName) {
            return datasetName(Output.of(datasetName));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder recipeName(Output<String> recipeName) {
            $.recipeName = recipeName;
            return this;
        }

        public Builder recipeName(String recipeName) {
            return recipeName(Output.of(recipeName));
        }

        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public Builder sample(@Nullable Output<ProjectSampleArgs> sample) {
            $.sample = sample;
            return this;
        }

        public Builder sample(ProjectSampleArgs sample) {
            return sample(Output.of(sample));
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
            $.datasetName = Objects.requireNonNull($.datasetName, "expected parameter 'datasetName' to be non-null");
            $.recipeName = Objects.requireNonNull($.recipeName, "expected parameter 'recipeName' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}
