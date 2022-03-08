// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.AudioTrackDescriptorResponse;
import io.pulumi.azurenative.media.outputs.SelectAudioTrackByAttributeResponse;
import io.pulumi.azurenative.media.outputs.SelectAudioTrackByIdResponse;
import io.pulumi.azurenative.media.outputs.SelectVideoTrackByAttributeResponse;
import io.pulumi.azurenative.media.outputs.SelectVideoTrackByIdResponse;
import io.pulumi.azurenative.media.outputs.VideoTrackDescriptorResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InputFileResponse {
    /**
     * Name of the file that this input definition applies to.
     * 
     */
    private final @Nullable String filename;
    /**
     * The list of TrackDescriptors which define the metadata and selection of tracks in the input.
     * 
     */
    private final @Nullable List<Object> includedTracks;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.InputFile'.
     * 
     */
    private final String odataType;

    @OutputCustomType.Constructor({"filename","includedTracks","odataType"})
    private InputFileResponse(
        @Nullable String filename,
        @Nullable List<Object> includedTracks,
        String odataType) {
        this.filename = filename;
        this.includedTracks = includedTracks;
        this.odataType = odataType;
    }

    /**
     * Name of the file that this input definition applies to.
     * 
    */
    public Optional<String> getFilename() {
        return Optional.ofNullable(this.filename);
    }
    /**
     * The list of TrackDescriptors which define the metadata and selection of tracks in the input.
     * 
    */
    public List<Object> getIncludedTracks() {
        return this.includedTracks == null ? List.of() : this.includedTracks;
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.InputFile'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InputFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String filename;
        private @Nullable List<Object> includedTracks;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(InputFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filename = defaults.filename;
    	      this.includedTracks = defaults.includedTracks;
    	      this.odataType = defaults.odataType;
        }

        public Builder setFilename(@Nullable String filename) {
            this.filename = filename;
            return this;
        }

        public Builder setIncludedTracks(@Nullable List<Object> includedTracks) {
            this.includedTracks = includedTracks;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public InputFileResponse build() {
            return new InputFileResponse(filename, includedTracks, odataType);
        }
    }
}
