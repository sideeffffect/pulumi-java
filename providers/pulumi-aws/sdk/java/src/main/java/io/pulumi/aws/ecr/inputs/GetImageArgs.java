// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImageArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetImageArgs Empty = new GetImageArgs();

    /**
     * The sha256 digest of the image manifest. At least one of `image_digest` or `image_tag` must be specified.
     * 
     */
    @InputImport(name="imageDigest")
      private final @Nullable String imageDigest;

    public Optional<String> getImageDigest() {
        return this.imageDigest == null ? Optional.empty() : Optional.ofNullable(this.imageDigest);
    }

    /**
     * The tag associated with this image. At least one of `image_digest` or `image_tag` must be specified.
     * 
     */
    @InputImport(name="imageTag")
      private final @Nullable String imageTag;

    public Optional<String> getImageTag() {
        return this.imageTag == null ? Optional.empty() : Optional.ofNullable(this.imageTag);
    }

    /**
     * The ID of the Registry where the repository resides.
     * 
     */
    @InputImport(name="registryId")
      private final @Nullable String registryId;

    public Optional<String> getRegistryId() {
        return this.registryId == null ? Optional.empty() : Optional.ofNullable(this.registryId);
    }

    /**
     * The name of the ECR Repository.
     * 
     */
    @InputImport(name="repositoryName", required=true)
      private final String repositoryName;

    public String getRepositoryName() {
        return this.repositoryName;
    }

    public GetImageArgs(
        @Nullable String imageDigest,
        @Nullable String imageTag,
        @Nullable String registryId,
        String repositoryName) {
        this.imageDigest = imageDigest;
        this.imageTag = imageTag;
        this.registryId = registryId;
        this.repositoryName = Objects.requireNonNull(repositoryName, "expected parameter 'repositoryName' to be non-null");
    }

    private GetImageArgs() {
        this.imageDigest = null;
        this.imageTag = null;
        this.registryId = null;
        this.repositoryName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String imageDigest;
        private @Nullable String imageTag;
        private @Nullable String registryId;
        private String repositoryName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageDigest = defaults.imageDigest;
    	      this.imageTag = defaults.imageTag;
    	      this.registryId = defaults.registryId;
    	      this.repositoryName = defaults.repositoryName;
        }

        public Builder imageDigest(@Nullable String imageDigest) {
            this.imageDigest = imageDigest;
            return this;
        }

        public Builder imageTag(@Nullable String imageTag) {
            this.imageTag = imageTag;
            return this;
        }

        public Builder registryId(@Nullable String registryId) {
            this.registryId = registryId;
            return this;
        }

        public Builder repositoryName(String repositoryName) {
            this.repositoryName = Objects.requireNonNull(repositoryName);
            return this;
        }
        public GetImageArgs build() {
            return new GetImageArgs(imageDigest, imageTag, registryId, repositoryName);
        }
    }
}
