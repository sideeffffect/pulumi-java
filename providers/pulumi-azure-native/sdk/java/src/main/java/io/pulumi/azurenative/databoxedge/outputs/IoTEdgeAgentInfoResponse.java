// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.ImageRepositoryCredentialResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IoTEdgeAgentInfoResponse {
    /**
     * Name of the IoT edge agent image.
     * 
     */
    private final String imageName;
    /**
     * Image repository details.
     * 
     */
    private final @Nullable ImageRepositoryCredentialResponse imageRepository;
    /**
     * Image Tag.
     * 
     */
    private final String tag;

    @OutputCustomType.Constructor({"imageName","imageRepository","tag"})
    private IoTEdgeAgentInfoResponse(
        String imageName,
        @Nullable ImageRepositoryCredentialResponse imageRepository,
        String tag) {
        this.imageName = imageName;
        this.imageRepository = imageRepository;
        this.tag = tag;
    }

    /**
     * Name of the IoT edge agent image.
     * 
    */
    public String getImageName() {
        return this.imageName;
    }
    /**
     * Image repository details.
     * 
    */
    public Optional<ImageRepositoryCredentialResponse> getImageRepository() {
        return Optional.ofNullable(this.imageRepository);
    }
    /**
     * Image Tag.
     * 
    */
    public String getTag() {
        return this.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IoTEdgeAgentInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String imageName;
        private @Nullable ImageRepositoryCredentialResponse imageRepository;
        private String tag;

        public Builder() {
    	      // Empty
        }

        public Builder(IoTEdgeAgentInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageName = defaults.imageName;
    	      this.imageRepository = defaults.imageRepository;
    	      this.tag = defaults.tag;
        }

        public Builder setImageName(String imageName) {
            this.imageName = Objects.requireNonNull(imageName);
            return this;
        }

        public Builder setImageRepository(@Nullable ImageRepositoryCredentialResponse imageRepository) {
            this.imageRepository = imageRepository;
            return this;
        }

        public Builder setTag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }
        public IoTEdgeAgentInfoResponse build() {
            return new IoTEdgeAgentInfoResponse(imageName, imageRepository, tag);
        }
    }
}
