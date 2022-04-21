// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.AudioOverlayResponse;
import com.pulumi.azurenative.media.inputs.DeinterlaceResponse;
import com.pulumi.azurenative.media.inputs.RectangleResponse;
import com.pulumi.azurenative.media.inputs.VideoOverlayResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes all the filtering operations, such as de-interlacing, rotation etc. that are to be applied to the input media before encoding.
 * 
 */
public final class FiltersResponse extends com.pulumi.resources.InvokeArgs {

    public static final FiltersResponse Empty = new FiltersResponse();

    /**
     * The parameters for the rectangular window with which to crop the input video.
     * 
     */
    @Import(name="crop")
    private @Nullable RectangleResponse crop;

    public Optional<RectangleResponse> crop() {
        return Optional.ofNullable(this.crop);
    }

    /**
     * The de-interlacing settings.
     * 
     */
    @Import(name="deinterlace")
    private @Nullable DeinterlaceResponse deinterlace;

    public Optional<DeinterlaceResponse> deinterlace() {
        return Optional.ofNullable(this.deinterlace);
    }

    /**
     * The properties of overlays to be applied to the input video. These could be audio, image or video overlays.
     * 
     */
    @Import(name="overlays")
    private @Nullable List<Either<AudioOverlayResponse,VideoOverlayResponse>> overlays;

    public Optional<List<Either<AudioOverlayResponse,VideoOverlayResponse>>> overlays() {
        return Optional.ofNullable(this.overlays);
    }

    /**
     * The rotation, if any, to be applied to the input video, before it is encoded. Default is Auto
     * 
     */
    @Import(name="rotation")
    private @Nullable String rotation;

    public Optional<String> rotation() {
        return Optional.ofNullable(this.rotation);
    }

    private FiltersResponse() {}

    private FiltersResponse(FiltersResponse $) {
        this.crop = $.crop;
        this.deinterlace = $.deinterlace;
        this.overlays = $.overlays;
        this.rotation = $.rotation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FiltersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FiltersResponse $;

        public Builder() {
            $ = new FiltersResponse();
        }

        public Builder(FiltersResponse defaults) {
            $ = new FiltersResponse(Objects.requireNonNull(defaults));
        }

        public Builder crop(@Nullable RectangleResponse crop) {
            $.crop = crop;
            return this;
        }

        public Builder deinterlace(@Nullable DeinterlaceResponse deinterlace) {
            $.deinterlace = deinterlace;
            return this;
        }

        public Builder overlays(@Nullable List<Either<AudioOverlayResponse,VideoOverlayResponse>> overlays) {
            $.overlays = overlays;
            return this;
        }

        public Builder overlays(Either<AudioOverlayResponse,VideoOverlayResponse>... overlays) {
            return overlays(List.of(overlays));
        }

        public Builder rotation(@Nullable String rotation) {
            $.rotation = rotation;
            return this;
        }

        public FiltersResponse build() {
            return $;
        }
    }

}
