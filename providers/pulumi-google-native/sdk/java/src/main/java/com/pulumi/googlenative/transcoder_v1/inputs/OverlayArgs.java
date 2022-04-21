// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.transcoder_v1.inputs.AnimationArgs;
import com.pulumi.googlenative.transcoder_v1.inputs.ImageArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Overlay configuration.
 * 
 */
public final class OverlayArgs extends com.pulumi.resources.ResourceArgs {

    public static final OverlayArgs Empty = new OverlayArgs();

    /**
     * List of Animations. The list should be chronological, without any time overlap.
     * 
     */
    @Import(name="animations")
    private @Nullable Output<List<AnimationArgs>> animations;

    public Optional<Output<List<AnimationArgs>>> animations() {
        return Optional.ofNullable(this.animations);
    }

    /**
     * Image overlay.
     * 
     */
    @Import(name="image")
    private @Nullable Output<ImageArgs> image;

    public Optional<Output<ImageArgs>> image() {
        return Optional.ofNullable(this.image);
    }

    private OverlayArgs() {}

    private OverlayArgs(OverlayArgs $) {
        this.animations = $.animations;
        this.image = $.image;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OverlayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OverlayArgs $;

        public Builder() {
            $ = new OverlayArgs();
        }

        public Builder(OverlayArgs defaults) {
            $ = new OverlayArgs(Objects.requireNonNull(defaults));
        }

        public Builder animations(@Nullable Output<List<AnimationArgs>> animations) {
            $.animations = animations;
            return this;
        }

        public Builder animations(List<AnimationArgs> animations) {
            return animations(Output.of(animations));
        }

        public Builder animations(AnimationArgs... animations) {
            return animations(List.of(animations));
        }

        public Builder image(@Nullable Output<ImageArgs> image) {
            $.image = image;
            return this;
        }

        public Builder image(ImageArgs image) {
            return image(Output.of(image));
        }

        public OverlayArgs build() {
            return $;
        }
    }

}
