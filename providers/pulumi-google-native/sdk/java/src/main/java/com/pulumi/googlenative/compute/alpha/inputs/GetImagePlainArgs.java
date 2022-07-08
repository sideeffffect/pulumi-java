// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImagePlainArgs Empty = new GetImagePlainArgs();

    @Import(name="image", required=true)
    private String image;

    public String image() {
        return this.image;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetImagePlainArgs() {}

    private GetImagePlainArgs(GetImagePlainArgs $) {
        this.image = $.image;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagePlainArgs $;

        public Builder() {
            $ = new GetImagePlainArgs();
        }

        public Builder(GetImagePlainArgs defaults) {
            $ = new GetImagePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder image(String image) {
            $.image = image;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetImagePlainArgs build() {
            $.image = Objects.requireNonNull($.image, "expected parameter 'image' to be non-null");
            return $;
        }
    }

}
