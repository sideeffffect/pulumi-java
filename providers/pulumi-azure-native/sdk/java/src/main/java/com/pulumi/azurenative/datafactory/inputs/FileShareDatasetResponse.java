// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AvroFormatResponse;
import com.pulumi.azurenative.datafactory.inputs.DatasetCompressionResponse;
import com.pulumi.azurenative.datafactory.inputs.DatasetResponseFolder;
import com.pulumi.azurenative.datafactory.inputs.JsonFormatResponse;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.OrcFormatResponse;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import com.pulumi.azurenative.datafactory.inputs.ParquetFormatResponse;
import com.pulumi.azurenative.datafactory.inputs.TextFormatResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An on-premises file system dataset.
 * 
 */
public final class FileShareDatasetResponse extends com.pulumi.resources.InvokeArgs {

    public static final FileShareDatasetResponse Empty = new FileShareDatasetResponse();

    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    @Import(name="annotations")
    private @Nullable List<Object> annotations;

    public Optional<List<Object>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The data compression method used for the file system.
     * 
     */
    @Import(name="compression")
    private @Nullable DatasetCompressionResponse compression;

    public Optional<DatasetCompressionResponse> compression() {
        return Optional.ofNullable(this.compression);
    }

    /**
     * Dataset description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specify a filter to be used to select a subset of files in the folderPath rather than all files. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileFilter")
    private @Nullable Object fileFilter;

    public Optional<Object> fileFilter() {
        return Optional.ofNullable(this.fileFilter);
    }

    /**
     * The name of the on-premises file system. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileName")
    private @Nullable Object fileName;

    public Optional<Object> fileName() {
        return Optional.ofNullable(this.fileName);
    }

    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    @Import(name="folder")
    private @Nullable DatasetResponseFolder folder;

    public Optional<DatasetResponseFolder> folder() {
        return Optional.ofNullable(this.folder);
    }

    /**
     * The path of the on-premises file system. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="folderPath")
    private @Nullable Object folderPath;

    public Optional<Object> folderPath() {
        return Optional.ofNullable(this.folderPath);
    }

    /**
     * The format of the files.
     * 
     */
    @Import(name="format")
    private @Nullable Object format;

    public Optional<Object> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName", required=true)
    private LinkedServiceReferenceResponse linkedServiceName;

    public LinkedServiceReferenceResponse linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * The end of file&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="modifiedDatetimeEnd")
    private @Nullable Object modifiedDatetimeEnd;

    public Optional<Object> modifiedDatetimeEnd() {
        return Optional.ofNullable(this.modifiedDatetimeEnd);
    }

    /**
     * The start of file&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="modifiedDatetimeStart")
    private @Nullable Object modifiedDatetimeStart;

    public Optional<Object> modifiedDatetimeStart() {
        return Optional.ofNullable(this.modifiedDatetimeStart);
    }

    /**
     * Parameters for dataset.
     * 
     */
    @Import(name="parameters")
    private @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Optional<Map<String,ParameterSpecificationResponse>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    @Import(name="schema")
    private @Nullable Object schema;

    public Optional<Object> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    @Import(name="structure")
    private @Nullable Object structure;

    public Optional<Object> structure() {
        return Optional.ofNullable(this.structure);
    }

    /**
     * Type of dataset.
     * Expected value is &#39;FileShare&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private FileShareDatasetResponse() {}

    private FileShareDatasetResponse(FileShareDatasetResponse $) {
        this.annotations = $.annotations;
        this.compression = $.compression;
        this.description = $.description;
        this.fileFilter = $.fileFilter;
        this.fileName = $.fileName;
        this.folder = $.folder;
        this.folderPath = $.folderPath;
        this.format = $.format;
        this.linkedServiceName = $.linkedServiceName;
        this.modifiedDatetimeEnd = $.modifiedDatetimeEnd;
        this.modifiedDatetimeStart = $.modifiedDatetimeStart;
        this.parameters = $.parameters;
        this.schema = $.schema;
        this.structure = $.structure;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileShareDatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileShareDatasetResponse $;

        public Builder() {
            $ = new FileShareDatasetResponse();
        }

        public Builder(FileShareDatasetResponse defaults) {
            $ = new FileShareDatasetResponse(Objects.requireNonNull(defaults));
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        public Builder compression(@Nullable DatasetCompressionResponse compression) {
            $.compression = compression;
            return this;
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder fileFilter(@Nullable Object fileFilter) {
            $.fileFilter = fileFilter;
            return this;
        }

        public Builder fileName(@Nullable Object fileName) {
            $.fileName = fileName;
            return this;
        }

        public Builder folder(@Nullable DatasetResponseFolder folder) {
            $.folder = folder;
            return this;
        }

        public Builder folderPath(@Nullable Object folderPath) {
            $.folderPath = folderPath;
            return this;
        }

        public Builder format(@Nullable Object format) {
            $.format = format;
            return this;
        }

        public Builder linkedServiceName(LinkedServiceReferenceResponse linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder modifiedDatetimeEnd(@Nullable Object modifiedDatetimeEnd) {
            $.modifiedDatetimeEnd = modifiedDatetimeEnd;
            return this;
        }

        public Builder modifiedDatetimeStart(@Nullable Object modifiedDatetimeStart) {
            $.modifiedDatetimeStart = modifiedDatetimeStart;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder schema(@Nullable Object schema) {
            $.schema = schema;
            return this;
        }

        public Builder structure(@Nullable Object structure) {
            $.structure = structure;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public FileShareDatasetResponse build() {
            $.linkedServiceName = Objects.requireNonNull($.linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
