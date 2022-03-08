// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datastream_v1.outputs.AvroFileFormatResponse;
import io.pulumi.googlenative.datastream_v1.outputs.JsonFileFormatResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GcsDestinationConfigResponse {
    /**
     * AVRO file format configuration.
     * 
     */
    private final AvroFileFormatResponse avroFileFormat;
    /**
     * The maximum duration for which new events are added before a file is closed and a new file is created.
     * 
     */
    private final String fileRotationInterval;
    /**
     * The maximum file size to be saved in the bucket.
     * 
     */
    private final Integer fileRotationMb;
    /**
     * JSON file format configuration.
     * 
     */
    private final JsonFileFormatResponse jsonFileFormat;
    /**
     * Path inside the Cloud Storage bucket to write data to.
     * 
     */
    private final String path;

    @OutputCustomType.Constructor({"avroFileFormat","fileRotationInterval","fileRotationMb","jsonFileFormat","path"})
    private GcsDestinationConfigResponse(
        AvroFileFormatResponse avroFileFormat,
        String fileRotationInterval,
        Integer fileRotationMb,
        JsonFileFormatResponse jsonFileFormat,
        String path) {
        this.avroFileFormat = avroFileFormat;
        this.fileRotationInterval = fileRotationInterval;
        this.fileRotationMb = fileRotationMb;
        this.jsonFileFormat = jsonFileFormat;
        this.path = path;
    }

    /**
     * AVRO file format configuration.
     * 
    */
    public AvroFileFormatResponse getAvroFileFormat() {
        return this.avroFileFormat;
    }
    /**
     * The maximum duration for which new events are added before a file is closed and a new file is created.
     * 
    */
    public String getFileRotationInterval() {
        return this.fileRotationInterval;
    }
    /**
     * The maximum file size to be saved in the bucket.
     * 
    */
    public Integer getFileRotationMb() {
        return this.fileRotationMb;
    }
    /**
     * JSON file format configuration.
     * 
    */
    public JsonFileFormatResponse getJsonFileFormat() {
        return this.jsonFileFormat;
    }
    /**
     * Path inside the Cloud Storage bucket to write data to.
     * 
    */
    public String getPath() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcsDestinationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AvroFileFormatResponse avroFileFormat;
        private String fileRotationInterval;
        private Integer fileRotationMb;
        private JsonFileFormatResponse jsonFileFormat;
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(GcsDestinationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.avroFileFormat = defaults.avroFileFormat;
    	      this.fileRotationInterval = defaults.fileRotationInterval;
    	      this.fileRotationMb = defaults.fileRotationMb;
    	      this.jsonFileFormat = defaults.jsonFileFormat;
    	      this.path = defaults.path;
        }

        public Builder setAvroFileFormat(AvroFileFormatResponse avroFileFormat) {
            this.avroFileFormat = Objects.requireNonNull(avroFileFormat);
            return this;
        }

        public Builder setFileRotationInterval(String fileRotationInterval) {
            this.fileRotationInterval = Objects.requireNonNull(fileRotationInterval);
            return this;
        }

        public Builder setFileRotationMb(Integer fileRotationMb) {
            this.fileRotationMb = Objects.requireNonNull(fileRotationMb);
            return this;
        }

        public Builder setJsonFileFormat(JsonFileFormatResponse jsonFileFormat) {
            this.jsonFileFormat = Objects.requireNonNull(jsonFileFormat);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public GcsDestinationConfigResponse build() {
            return new GcsDestinationConfigResponse(avroFileFormat, fileRotationInterval, fileRotationMb, jsonFileFormat, path);
        }
    }
}
