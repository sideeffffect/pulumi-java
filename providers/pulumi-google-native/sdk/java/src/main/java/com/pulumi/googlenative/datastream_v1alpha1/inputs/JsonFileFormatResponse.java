// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * JSON file format configuration.
 * 
 */
public final class JsonFileFormatResponse extends com.pulumi.resources.InvokeArgs {

    public static final JsonFileFormatResponse Empty = new JsonFileFormatResponse();

    /**
     * Compression of the loaded JSON file.
     * 
     */
    @Import(name="compression", required=true)
    private String compression;

    public String compression() {
        return this.compression;
    }

    /**
     * The schema file format along JSON data files.
     * 
     */
    @Import(name="schemaFileFormat", required=true)
    private String schemaFileFormat;

    public String schemaFileFormat() {
        return this.schemaFileFormat;
    }

    private JsonFileFormatResponse() {}

    private JsonFileFormatResponse(JsonFileFormatResponse $) {
        this.compression = $.compression;
        this.schemaFileFormat = $.schemaFileFormat;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JsonFileFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JsonFileFormatResponse $;

        public Builder() {
            $ = new JsonFileFormatResponse();
        }

        public Builder(JsonFileFormatResponse defaults) {
            $ = new JsonFileFormatResponse(Objects.requireNonNull(defaults));
        }

        public Builder compression(String compression) {
            $.compression = compression;
            return this;
        }

        public Builder schemaFileFormat(String schemaFileFormat) {
            $.schemaFileFormat = schemaFileFormat;
            return this;
        }

        public JsonFileFormatResponse build() {
            $.compression = Objects.requireNonNull($.compression, "expected parameter 'compression' to be non-null");
            $.schemaFileFormat = Objects.requireNonNull($.schemaFileFormat, "expected parameter 'schemaFileFormat' to be non-null");
            return $;
        }
    }

}
