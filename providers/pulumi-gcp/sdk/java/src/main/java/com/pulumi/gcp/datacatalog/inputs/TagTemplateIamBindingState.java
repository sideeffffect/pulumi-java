// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.datacatalog.inputs.TagTemplateIamBindingConditionArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TagTemplateIamBindingState extends ResourceArgs {

    public static final TagTemplateIamBindingState Empty = new TagTemplateIamBindingState();

    @Import(name="condition")
    private @Nullable Output<TagTemplateIamBindingConditionArgs> condition;

    public Optional<Output<TagTemplateIamBindingConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    @Import(name="etag")
    private @Nullable Output<String> etag;

    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    @Import(name="members")
    private @Nullable Output<List<String>> members;

    public Optional<Output<List<String>>> members() {
        return Optional.ofNullable(this.members);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    @Import(name="role")
    private @Nullable Output<String> role;

    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    @Import(name="tagTemplate")
    private @Nullable Output<String> tagTemplate;

    public Optional<Output<String>> tagTemplate() {
        return Optional.ofNullable(this.tagTemplate);
    }

    private TagTemplateIamBindingState() {}

    private TagTemplateIamBindingState(TagTemplateIamBindingState $) {
        this.condition = $.condition;
        this.etag = $.etag;
        this.members = $.members;
        this.project = $.project;
        this.region = $.region;
        this.role = $.role;
        this.tagTemplate = $.tagTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagTemplateIamBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagTemplateIamBindingState $;

        public Builder() {
            $ = new TagTemplateIamBindingState();
        }

        public Builder(TagTemplateIamBindingState defaults) {
            $ = new TagTemplateIamBindingState(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<TagTemplateIamBindingConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(TagTemplateIamBindingConditionArgs condition) {
            return condition(Output.of(condition));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder members(@Nullable Output<List<String>> members) {
            $.members = members;
            return this;
        }

        public Builder members(List<String> members) {
            return members(Output.of(members));
        }

        public Builder members(String... members) {
            return members(List.of(members));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        public Builder tagTemplate(@Nullable Output<String> tagTemplate) {
            $.tagTemplate = tagTemplate;
            return this;
        }

        public Builder tagTemplate(String tagTemplate) {
            return tagTemplate(Output.of(tagTemplate));
        }

        public TagTemplateIamBindingState build() {
            return $;
        }
    }

}
