// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Artifact describes a build product.
 * 
 */
public final class ArtifactArgs extends com.pulumi.resources.ResourceArgs {

    public static final ArtifactArgs Empty = new ArtifactArgs();

    /**
     * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a container.
     * 
     */
    @Import(name="checksum")
      private final @Nullable Output<String> checksum;

    public Output<String> checksum() {
        return this.checksum == null ? Codegen.empty() : this.checksum;
    }

    /**
     * Artifact ID, if any; for container images, this will be a URL by digest like `gcr.io/projectID/imagename@sha256:123456`.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * Related artifact names. This may be the path to a binary or jar file, or in the case of a container build, the name used to push the container image to Google Container Registry, as presented to `docker push`. Note that a single Artifact ID can have multiple names, for example if two tags are applied to one image.
     * 
     */
    @Import(name="names")
      private final @Nullable Output<List<String>> names;

    public Output<List<String>> names() {
        return this.names == null ? Codegen.empty() : this.names;
    }

    public ArtifactArgs(
        @Nullable Output<String> checksum,
        @Nullable Output<String> id,
        @Nullable Output<List<String>> names) {
        this.checksum = checksum;
        this.id = id;
        this.names = names;
    }

    private ArtifactArgs() {
        this.checksum = Codegen.empty();
        this.id = Codegen.empty();
        this.names = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArtifactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> checksum;
        private @Nullable Output<String> id;
        private @Nullable Output<List<String>> names;

        public Builder() {
    	      // Empty
        }

        public Builder(ArtifactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checksum = defaults.checksum;
    	      this.id = defaults.id;
    	      this.names = defaults.names;
        }

        public Builder checksum(@Nullable Output<String> checksum) {
            this.checksum = checksum;
            return this;
        }
        public Builder checksum(@Nullable String checksum) {
            this.checksum = Codegen.ofNullable(checksum);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder names(@Nullable Output<List<String>> names) {
            this.names = names;
            return this;
        }
        public Builder names(@Nullable List<String> names) {
            this.names = Codegen.ofNullable(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }        public ArtifactArgs build() {
            return new ArtifactArgs(checksum, id, names);
        }
    }
}
