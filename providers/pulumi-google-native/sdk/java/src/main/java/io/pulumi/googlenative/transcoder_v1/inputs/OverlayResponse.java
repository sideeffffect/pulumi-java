// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.transcoder_v1.inputs.AnimationResponse;
import io.pulumi.googlenative.transcoder_v1.inputs.ImageResponse;
import java.util.List;
import java.util.Objects;


/**
 * Overlay configuration.
 * 
 */
public final class OverlayResponse extends io.pulumi.resources.InvokeArgs {

    public static final OverlayResponse Empty = new OverlayResponse();

    /**
     * List of Animations. The list should be chronological, without any time overlap.
     * 
     */
    @InputImport(name="animations", required=true)
      private final List<AnimationResponse> animations;

    public List<AnimationResponse> getAnimations() {
        return this.animations;
    }

    /**
     * Image overlay.
     * 
     */
    @InputImport(name="image", required=true)
      private final ImageResponse image;

    public ImageResponse getImage() {
        return this.image;
    }

    public OverlayResponse(
        List<AnimationResponse> animations,
        ImageResponse image) {
        this.animations = Objects.requireNonNull(animations, "expected parameter 'animations' to be non-null");
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
    }

    private OverlayResponse() {
        this.animations = List.of();
        this.image = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OverlayResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AnimationResponse> animations;
        private ImageResponse image;

        public Builder() {
    	      // Empty
        }

        public Builder(OverlayResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.animations = defaults.animations;
    	      this.image = defaults.image;
        }

        public Builder animations(List<AnimationResponse> animations) {
            this.animations = Objects.requireNonNull(animations);
            return this;
        }

        public Builder image(ImageResponse image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public OverlayResponse build() {
            return new OverlayResponse(animations, image);
        }
    }
}
