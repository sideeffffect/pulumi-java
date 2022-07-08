// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datastream.v1alpha1.enums.GcsDestinationConfigGcsFileFormat;
import com.pulumi.googlenative.datastream.v1alpha1.inputs.AvroFileFormatArgs;
import com.pulumi.googlenative.datastream.v1alpha1.inputs.JsonFileFormatArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Google Cloud Storage destination configuration
 * 
 */
public final class GcsDestinationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GcsDestinationConfigArgs Empty = new GcsDestinationConfigArgs();

    /**
     * AVRO file format configuration.
     * 
     */
    @Import(name="avroFileFormat")
    private @Nullable Output<AvroFileFormatArgs> avroFileFormat;

    /**
     * @return AVRO file format configuration.
     * 
     */
    public Optional<Output<AvroFileFormatArgs>> avroFileFormat() {
        return Optional.ofNullable(this.avroFileFormat);
    }

    /**
     * The maximum duration for which new events are added before a file is closed and a new file is created.
     * 
     */
    @Import(name="fileRotationInterval")
    private @Nullable Output<String> fileRotationInterval;

    /**
     * @return The maximum duration for which new events are added before a file is closed and a new file is created.
     * 
     */
    public Optional<Output<String>> fileRotationInterval() {
        return Optional.ofNullable(this.fileRotationInterval);
    }

    /**
     * The maximum file size to be saved in the bucket.
     * 
     */
    @Import(name="fileRotationMb")
    private @Nullable Output<Integer> fileRotationMb;

    /**
     * @return The maximum file size to be saved in the bucket.
     * 
     */
    public Optional<Output<Integer>> fileRotationMb() {
        return Optional.ofNullable(this.fileRotationMb);
    }

    /**
     * File format that data should be written in. Deprecated field (b/169501737) - use file_format instead.
     * 
     * @deprecated
     * File format that data should be written in. Deprecated field (b/169501737) - use file_format instead.
     * 
     */
    @Deprecated /* File format that data should be written in. Deprecated field (b/169501737) - use file_format instead. */
    @Import(name="gcsFileFormat")
    private @Nullable Output<GcsDestinationConfigGcsFileFormat> gcsFileFormat;

    /**
     * @return File format that data should be written in. Deprecated field (b/169501737) - use file_format instead.
     * 
     * @deprecated
     * File format that data should be written in. Deprecated field (b/169501737) - use file_format instead.
     * 
     */
    @Deprecated /* File format that data should be written in. Deprecated field (b/169501737) - use file_format instead. */
    public Optional<Output<GcsDestinationConfigGcsFileFormat>> gcsFileFormat() {
        return Optional.ofNullable(this.gcsFileFormat);
    }

    /**
     * JSON file format configuration.
     * 
     */
    @Import(name="jsonFileFormat")
    private @Nullable Output<JsonFileFormatArgs> jsonFileFormat;

    /**
     * @return JSON file format configuration.
     * 
     */
    public Optional<Output<JsonFileFormatArgs>> jsonFileFormat() {
        return Optional.ofNullable(this.jsonFileFormat);
    }

    /**
     * Path inside the Cloud Storage bucket to write data to.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return Path inside the Cloud Storage bucket to write data to.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    private GcsDestinationConfigArgs() {}

    private GcsDestinationConfigArgs(GcsDestinationConfigArgs $) {
        this.avroFileFormat = $.avroFileFormat;
        this.fileRotationInterval = $.fileRotationInterval;
        this.fileRotationMb = $.fileRotationMb;
        this.gcsFileFormat = $.gcsFileFormat;
        this.jsonFileFormat = $.jsonFileFormat;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GcsDestinationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GcsDestinationConfigArgs $;

        public Builder() {
            $ = new GcsDestinationConfigArgs();
        }

        public Builder(GcsDestinationConfigArgs defaults) {
            $ = new GcsDestinationConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param avroFileFormat AVRO file format configuration.
         * 
         * @return builder
         * 
         */
        public Builder avroFileFormat(@Nullable Output<AvroFileFormatArgs> avroFileFormat) {
            $.avroFileFormat = avroFileFormat;
            return this;
        }

        /**
         * @param avroFileFormat AVRO file format configuration.
         * 
         * @return builder
         * 
         */
        public Builder avroFileFormat(AvroFileFormatArgs avroFileFormat) {
            return avroFileFormat(Output.of(avroFileFormat));
        }

        /**
         * @param fileRotationInterval The maximum duration for which new events are added before a file is closed and a new file is created.
         * 
         * @return builder
         * 
         */
        public Builder fileRotationInterval(@Nullable Output<String> fileRotationInterval) {
            $.fileRotationInterval = fileRotationInterval;
            return this;
        }

        /**
         * @param fileRotationInterval The maximum duration for which new events are added before a file is closed and a new file is created.
         * 
         * @return builder
         * 
         */
        public Builder fileRotationInterval(String fileRotationInterval) {
            return fileRotationInterval(Output.of(fileRotationInterval));
        }

        /**
         * @param fileRotationMb The maximum file size to be saved in the bucket.
         * 
         * @return builder
         * 
         */
        public Builder fileRotationMb(@Nullable Output<Integer> fileRotationMb) {
            $.fileRotationMb = fileRotationMb;
            return this;
        }

        /**
         * @param fileRotationMb The maximum file size to be saved in the bucket.
         * 
         * @return builder
         * 
         */
        public Builder fileRotationMb(Integer fileRotationMb) {
            return fileRotationMb(Output.of(fileRotationMb));
        }

        /**
         * @param gcsFileFormat File format that data should be written in. Deprecated field (b/169501737) - use file_format instead.
         * 
         * @return builder
         * 
         * @deprecated
         * File format that data should be written in. Deprecated field (b/169501737) - use file_format instead.
         * 
         */
        @Deprecated /* File format that data should be written in. Deprecated field (b/169501737) - use file_format instead. */
        public Builder gcsFileFormat(@Nullable Output<GcsDestinationConfigGcsFileFormat> gcsFileFormat) {
            $.gcsFileFormat = gcsFileFormat;
            return this;
        }

        /**
         * @param gcsFileFormat File format that data should be written in. Deprecated field (b/169501737) - use file_format instead.
         * 
         * @return builder
         * 
         * @deprecated
         * File format that data should be written in. Deprecated field (b/169501737) - use file_format instead.
         * 
         */
        @Deprecated /* File format that data should be written in. Deprecated field (b/169501737) - use file_format instead. */
        public Builder gcsFileFormat(GcsDestinationConfigGcsFileFormat gcsFileFormat) {
            return gcsFileFormat(Output.of(gcsFileFormat));
        }

        /**
         * @param jsonFileFormat JSON file format configuration.
         * 
         * @return builder
         * 
         */
        public Builder jsonFileFormat(@Nullable Output<JsonFileFormatArgs> jsonFileFormat) {
            $.jsonFileFormat = jsonFileFormat;
            return this;
        }

        /**
         * @param jsonFileFormat JSON file format configuration.
         * 
         * @return builder
         * 
         */
        public Builder jsonFileFormat(JsonFileFormatArgs jsonFileFormat) {
            return jsonFileFormat(Output.of(jsonFileFormat));
        }

        /**
         * @param path Path inside the Cloud Storage bucket to write data to.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Path inside the Cloud Storage bucket to write data to.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public GcsDestinationConfigArgs build() {
            return $;
        }
    }

}
