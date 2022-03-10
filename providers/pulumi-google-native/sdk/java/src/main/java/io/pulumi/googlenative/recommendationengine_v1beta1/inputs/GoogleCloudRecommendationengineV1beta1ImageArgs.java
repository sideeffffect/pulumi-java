// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recommendationengine_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Catalog item thumbnail/detail image.
 * 
 */
public final class GoogleCloudRecommendationengineV1beta1ImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRecommendationengineV1beta1ImageArgs Empty = new GoogleCloudRecommendationengineV1beta1ImageArgs();

    /**
     * Optional. Height of the image in number of pixels.
     * 
     */
    @InputImport(name="height")
      private final @Nullable Input<Integer> height;

    public Input<Integer> getHeight() {
        return this.height == null ? Input.empty() : this.height;
    }

    /**
     * URL of the image with a length limit of 5 KiB.
     * 
     */
    @InputImport(name="uri", required=true)
      private final Input<String> uri;

    public Input<String> getUri() {
        return this.uri;
    }

    /**
     * Optional. Width of the image in number of pixels.
     * 
     */
    @InputImport(name="width")
      private final @Nullable Input<Integer> width;

    public Input<Integer> getWidth() {
        return this.width == null ? Input.empty() : this.width;
    }

    public GoogleCloudRecommendationengineV1beta1ImageArgs(
        @Nullable Input<Integer> height,
        Input<String> uri,
        @Nullable Input<Integer> width) {
        this.height = height;
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
        this.width = width;
    }

    private GoogleCloudRecommendationengineV1beta1ImageArgs() {
        this.height = Input.empty();
        this.uri = Input.empty();
        this.width = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRecommendationengineV1beta1ImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> height;
        private Input<String> uri;
        private @Nullable Input<Integer> width;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRecommendationengineV1beta1ImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.height = defaults.height;
    	      this.uri = defaults.uri;
    	      this.width = defaults.width;
        }

        public Builder height(@Nullable Input<Integer> height) {
            this.height = height;
            return this;
        }

        public Builder height(@Nullable Integer height) {
            this.height = Input.ofNullable(height);
            return this;
        }

        public Builder uri(Input<String> uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder uri(String uri) {
            this.uri = Input.of(Objects.requireNonNull(uri));
            return this;
        }

        public Builder width(@Nullable Input<Integer> width) {
            this.width = width;
            return this;
        }

        public Builder width(@Nullable Integer width) {
            this.width = Input.ofNullable(width);
            return this;
        }
        public GoogleCloudRecommendationengineV1beta1ImageArgs build() {
            return new GoogleCloudRecommendationengineV1beta1ImageArgs(height, uri, width);
        }
    }
}
