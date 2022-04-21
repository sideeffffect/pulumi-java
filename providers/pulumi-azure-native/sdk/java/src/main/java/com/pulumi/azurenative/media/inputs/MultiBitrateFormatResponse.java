// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.OutputFileResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the properties for producing a collection of GOP aligned multi-bitrate files. The default behavior is to produce one output file for each video layer which is muxed together with all the audios. The exact output files produced can be controlled by specifying the outputFiles collection.
 * 
 */
public final class MultiBitrateFormatResponse extends com.pulumi.resources.InvokeArgs {

    public static final MultiBitrateFormatResponse Empty = new MultiBitrateFormatResponse();

    /**
     * The pattern of the file names for the generated output files. The following macros are supported in the file name: {Basename} - An expansion macro that will use the name of the input video file. If the base name(the file suffix is not included) of the input video file is less than 32 characters long, the base name of input video files will be used. If the length of base name of the input video file exceeds 32 characters, the base name is truncated to the first 32 characters in total length. {Extension} - The appropriate extension for this format. {Label} - The label assigned to the codec/layer. {Index} - A unique index for thumbnails. Only applicable to thumbnails. {Bitrate} - The audio/video bitrate. Not applicable to thumbnails. {Codec} - The type of the audio/video codec. {Resolution} - The video resolution. Any unsubstituted macros will be collapsed and removed from the filename.
     * 
     */
    @Import(name="filenamePattern", required=true)
    private String filenamePattern;

    public String filenamePattern() {
        return this.filenamePattern;
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.MultiBitrateFormat&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private String odataType;

    public String odataType() {
        return this.odataType;
    }

    /**
     * The list of output files to produce.  Each entry in the list is a set of audio and video layer labels to be muxed together .
     * 
     */
    @Import(name="outputFiles")
    private @Nullable List<OutputFileResponse> outputFiles;

    public Optional<List<OutputFileResponse>> outputFiles() {
        return Optional.ofNullable(this.outputFiles);
    }

    private MultiBitrateFormatResponse() {}

    private MultiBitrateFormatResponse(MultiBitrateFormatResponse $) {
        this.filenamePattern = $.filenamePattern;
        this.odataType = $.odataType;
        this.outputFiles = $.outputFiles;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MultiBitrateFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MultiBitrateFormatResponse $;

        public Builder() {
            $ = new MultiBitrateFormatResponse();
        }

        public Builder(MultiBitrateFormatResponse defaults) {
            $ = new MultiBitrateFormatResponse(Objects.requireNonNull(defaults));
        }

        public Builder filenamePattern(String filenamePattern) {
            $.filenamePattern = filenamePattern;
            return this;
        }

        public Builder odataType(String odataType) {
            $.odataType = odataType;
            return this;
        }

        public Builder outputFiles(@Nullable List<OutputFileResponse> outputFiles) {
            $.outputFiles = outputFiles;
            return this;
        }

        public Builder outputFiles(OutputFileResponse... outputFiles) {
            return outputFiles(List.of(outputFiles));
        }

        public MultiBitrateFormatResponse build() {
            $.filenamePattern = Objects.requireNonNull($.filenamePattern, "expected parameter 'filenamePattern' to be non-null");
            $.odataType = Codegen.stringProp("odataType").arg($.odataType).require();
            return $;
        }
    }

}
