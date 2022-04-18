// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.artifactregistry_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagArgs Empty = new TagArgs();

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the tag, for example: "projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/tags/tag1". If the package part contains slashes, the slashes are escaped. The tag part can only have characters in [a-zA-Z0-9\-._~:@], anything else must be URL encoded.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="packageId", required=true)
      private final Output<String> packageId;

    public Output<String> packageId() {
        return this.packageId;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="repositoryId", required=true)
      private final Output<String> repositoryId;

    public Output<String> repositoryId() {
        return this.repositoryId;
    }

    @Import(name="tagId")
      private final @Nullable Output<String> tagId;

    public Output<String> tagId() {
        return this.tagId == null ? Codegen.empty() : this.tagId;
    }

    /**
     * The name of the version the tag refers to, for example: "projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/sha256:5243811" If the package or version ID parts contain slashes, the slashes are escaped.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public TagArgs(
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        Output<String> packageId,
        @Nullable Output<String> project,
        Output<String> repositoryId,
        @Nullable Output<String> tagId,
        @Nullable Output<String> version) {
        this.location = location;
        this.name = name;
        this.packageId = Objects.requireNonNull(packageId, "expected parameter 'packageId' to be non-null");
        this.project = project;
        this.repositoryId = Objects.requireNonNull(repositoryId, "expected parameter 'repositoryId' to be non-null");
        this.tagId = tagId;
        this.version = version;
    }

    private TagArgs() {
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.packageId = Codegen.empty();
        this.project = Codegen.empty();
        this.repositoryId = Codegen.empty();
        this.tagId = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private Output<String> packageId;
        private @Nullable Output<String> project;
        private Output<String> repositoryId;
        private @Nullable Output<String> tagId;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(TagArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.packageId = defaults.packageId;
    	      this.project = defaults.project;
    	      this.repositoryId = defaults.repositoryId;
    	      this.tagId = defaults.tagId;
    	      this.version = defaults.version;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder packageId(Output<String> packageId) {
            this.packageId = Objects.requireNonNull(packageId);
            return this;
        }
        public Builder packageId(String packageId) {
            this.packageId = Output.of(Objects.requireNonNull(packageId));
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder repositoryId(Output<String> repositoryId) {
            this.repositoryId = Objects.requireNonNull(repositoryId);
            return this;
        }
        public Builder repositoryId(String repositoryId) {
            this.repositoryId = Output.of(Objects.requireNonNull(repositoryId));
            return this;
        }
        public Builder tagId(@Nullable Output<String> tagId) {
            this.tagId = tagId;
            return this;
        }
        public Builder tagId(@Nullable String tagId) {
            this.tagId = Codegen.ofNullable(tagId);
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public TagArgs build() {
            return new TagArgs(location, name, packageId, project, repositoryId, tagId, version);
        }
    }
}
