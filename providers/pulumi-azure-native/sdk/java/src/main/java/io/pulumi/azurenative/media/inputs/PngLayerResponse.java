// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the settings to produce a PNG image from the input video.
 * 
 */
public final class PngLayerResponse extends io.pulumi.resources.InvokeArgs {

    public static final PngLayerResponse Empty = new PngLayerResponse();

    /**
     * The height of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example 50% means the output video has half as many pixels in height as the input.
     * 
     */
    @InputImport(name="height")
      private final @Nullable String height;

    public Optional<String> getHeight() {
        return this.height == null ? Optional.empty() : Optional.ofNullable(this.height);
    }

    /**
     * The alphanumeric label for this layer, which can be used in multiplexing different video and audio layers, or in naming the output file.
     * 
     */
    @InputImport(name="label")
      private final @Nullable String label;

    public Optional<String> getLabel() {
        return this.label == null ? Optional.empty() : Optional.ofNullable(this.label);
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.PngLayer'.
     * 
     */
    @InputImport(name="odataType", required=true)
      private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    /**
     * The width of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example 50% means the output video has half as many pixels in width as the input.
     * 
     */
    @InputImport(name="width")
      private final @Nullable String width;

    public Optional<String> getWidth() {
        return this.width == null ? Optional.empty() : Optional.ofNullable(this.width);
    }

    public PngLayerResponse(
        @Nullable String height,
        @Nullable String label,
        String odataType,
        @Nullable String width) {
        this.height = height;
        this.label = label;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.width = width;
    }

    private PngLayerResponse() {
        this.height = null;
        this.label = null;
        this.odataType = null;
        this.width = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PngLayerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String height;
        private @Nullable String label;
        private String odataType;
        private @Nullable String width;

        public Builder() {
    	      // Empty
        }

        public Builder(PngLayerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.height = defaults.height;
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
    	      this.width = defaults.width;
        }

        public Builder height(@Nullable String height) {
            this.height = height;
            return this;
        }

        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder width(@Nullable String width) {
            this.width = width;
            return this;
        }
        public PngLayerResponse build() {
            return new PngLayerResponse(height, label, odataType, width);
        }
    }
}
