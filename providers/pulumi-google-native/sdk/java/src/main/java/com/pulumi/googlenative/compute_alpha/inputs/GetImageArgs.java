// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImageArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImageArgs Empty = new GetImageArgs();

    @Import(name="image", required=true)
      private final String image;

    public String image() {
        return this.image;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetImageArgs(
        String image,
        @Nullable String project) {
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.project = project;
    }

    private GetImageArgs() {
        this.image = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String image;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.image = defaults.image;
    	      this.project = defaults.project;
        }

        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetImageArgs build() {
            return new GetImageArgs(image, project);
        }
    }
}
