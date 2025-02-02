// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPrebuiltEcrImageResult {
    private final @Nullable String dnsSuffix;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String imageTag;
    private final @Nullable String region;
    /**
     * @return The account ID containing the image. For example, `469771592824`.
     * 
     */
    private final String registryId;
    /**
     * @return The Docker image URL. For example, `341280168497.dkr.ecr.ca-central-1.amazonaws.com/sagemaker-sparkml-serving:2.4`.
     * 
     */
    private final String registryPath;
    private final String repositoryName;

    @CustomType.Constructor
    private GetPrebuiltEcrImageResult(
        @CustomType.Parameter("dnsSuffix") @Nullable String dnsSuffix,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("imageTag") @Nullable String imageTag,
        @CustomType.Parameter("region") @Nullable String region,
        @CustomType.Parameter("registryId") String registryId,
        @CustomType.Parameter("registryPath") String registryPath,
        @CustomType.Parameter("repositoryName") String repositoryName) {
        this.dnsSuffix = dnsSuffix;
        this.id = id;
        this.imageTag = imageTag;
        this.region = region;
        this.registryId = registryId;
        this.registryPath = registryPath;
        this.repositoryName = repositoryName;
    }

    public Optional<String> dnsSuffix() {
        return Optional.ofNullable(this.dnsSuffix);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> imageTag() {
        return Optional.ofNullable(this.imageTag);
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return The account ID containing the image. For example, `469771592824`.
     * 
     */
    public String registryId() {
        return this.registryId;
    }
    /**
     * @return The Docker image URL. For example, `341280168497.dkr.ecr.ca-central-1.amazonaws.com/sagemaker-sparkml-serving:2.4`.
     * 
     */
    public String registryPath() {
        return this.registryPath;
    }
    public String repositoryName() {
        return this.repositoryName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrebuiltEcrImageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dnsSuffix;
        private String id;
        private @Nullable String imageTag;
        private @Nullable String region;
        private String registryId;
        private String registryPath;
        private String repositoryName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrebuiltEcrImageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsSuffix = defaults.dnsSuffix;
    	      this.id = defaults.id;
    	      this.imageTag = defaults.imageTag;
    	      this.region = defaults.region;
    	      this.registryId = defaults.registryId;
    	      this.registryPath = defaults.registryPath;
    	      this.repositoryName = defaults.repositoryName;
        }

        public Builder dnsSuffix(@Nullable String dnsSuffix) {
            this.dnsSuffix = dnsSuffix;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder imageTag(@Nullable String imageTag) {
            this.imageTag = imageTag;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public Builder registryId(String registryId) {
            this.registryId = Objects.requireNonNull(registryId);
            return this;
        }
        public Builder registryPath(String registryPath) {
            this.registryPath = Objects.requireNonNull(registryPath);
            return this;
        }
        public Builder repositoryName(String repositoryName) {
            this.repositoryName = Objects.requireNonNull(repositoryName);
            return this;
        }        public GetPrebuiltEcrImageResult build() {
            return new GetPrebuiltEcrImageResult(dnsSuffix, id, imageTag, region, registryId, registryPath, repositoryName);
        }
    }
}
