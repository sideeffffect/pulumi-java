// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTagTemplateIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTagTemplateIamPolicyArgs Empty = new GetTagTemplateIamPolicyArgs();

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="tagTemplateId", required=true)
    private Output<String> tagTemplateId;

    public Output<String> tagTemplateId() {
        return this.tagTemplateId;
    }

    private GetTagTemplateIamPolicyArgs() {}

    private GetTagTemplateIamPolicyArgs(GetTagTemplateIamPolicyArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.tagTemplateId = $.tagTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTagTemplateIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTagTemplateIamPolicyArgs $;

        public Builder() {
            $ = new GetTagTemplateIamPolicyArgs();
        }

        public Builder(GetTagTemplateIamPolicyArgs defaults) {
            $ = new GetTagTemplateIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder tagTemplateId(Output<String> tagTemplateId) {
            $.tagTemplateId = tagTemplateId;
            return this;
        }

        public Builder tagTemplateId(String tagTemplateId) {
            return tagTemplateId(Output.of(tagTemplateId));
        }

        public GetTagTemplateIamPolicyArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.tagTemplateId = Objects.requireNonNull($.tagTemplateId, "expected parameter 'tagTemplateId' to be non-null");
            return $;
        }
    }

}
