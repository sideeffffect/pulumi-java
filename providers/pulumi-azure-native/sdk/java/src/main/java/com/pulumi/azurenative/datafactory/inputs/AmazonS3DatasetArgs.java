// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AvroFormatArgs;
import com.pulumi.azurenative.datafactory.inputs.DatasetCompressionArgs;
import com.pulumi.azurenative.datafactory.inputs.DatasetFolderArgs;
import com.pulumi.azurenative.datafactory.inputs.JsonFormatArgs;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.OrcFormatArgs;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import com.pulumi.azurenative.datafactory.inputs.ParquetFormatArgs;
import com.pulumi.azurenative.datafactory.inputs.TextFormatArgs;
import com.pulumi.core.Output;
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
 * A single Amazon Simple Storage Service (S3) object or a set of S3 objects.
 * 
 */
public final class AmazonS3DatasetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AmazonS3DatasetArgs Empty = new AmazonS3DatasetArgs();

    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<Object>> annotations;

    public Optional<Output<List<Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The name of the Amazon S3 bucket. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="bucketName", required=true)
    private Output<Object> bucketName;

    public Output<Object> bucketName() {
        return this.bucketName;
    }

    /**
     * The data compression method used for the Amazon S3 object.
     * 
     */
    @Import(name="compression")
    private @Nullable Output<DatasetCompressionArgs> compression;

    public Optional<Output<DatasetCompressionArgs>> compression() {
        return Optional.ofNullable(this.compression);
    }

    /**
     * Dataset description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    @Import(name="folder")
    private @Nullable Output<DatasetFolderArgs> folder;

    public Optional<Output<DatasetFolderArgs>> folder() {
        return Optional.ofNullable(this.folder);
    }

    /**
     * The format of files.
     * 
     */
    @Import(name="format")
    private @Nullable Output<Object> format;

    public Optional<Output<Object>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * The key of the Amazon S3 object. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="key")
    private @Nullable Output<Object> key;

    public Optional<Output<Object>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName", required=true)
    private Output<LinkedServiceReferenceArgs> linkedServiceName;

    public Output<LinkedServiceReferenceArgs> linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * The end of S3 object&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="modifiedDatetimeEnd")
    private @Nullable Output<Object> modifiedDatetimeEnd;

    public Optional<Output<Object>> modifiedDatetimeEnd() {
        return Optional.ofNullable(this.modifiedDatetimeEnd);
    }

    /**
     * The start of S3 object&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="modifiedDatetimeStart")
    private @Nullable Output<Object> modifiedDatetimeStart;

    public Optional<Output<Object>> modifiedDatetimeStart() {
        return Optional.ofNullable(this.modifiedDatetimeStart);
    }

    /**
     * Parameters for dataset.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Optional<Output<Map<String,ParameterSpecificationArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The prefix filter for the S3 object name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<Object> prefix;

    public Optional<Output<Object>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<Object> schema;

    public Optional<Output<Object>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    @Import(name="structure")
    private @Nullable Output<Object> structure;

    public Optional<Output<Object>> structure() {
        return Optional.ofNullable(this.structure);
    }

    /**
     * Type of dataset.
     * Expected value is &#39;AmazonS3Object&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * The version for the S3 object. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="version")
    private @Nullable Output<Object> version;

    public Optional<Output<Object>> version() {
        return Optional.ofNullable(this.version);
    }

    private AmazonS3DatasetArgs() {}

    private AmazonS3DatasetArgs(AmazonS3DatasetArgs $) {
        this.annotations = $.annotations;
        this.bucketName = $.bucketName;
        this.compression = $.compression;
        this.description = $.description;
        this.folder = $.folder;
        this.format = $.format;
        this.key = $.key;
        this.linkedServiceName = $.linkedServiceName;
        this.modifiedDatetimeEnd = $.modifiedDatetimeEnd;
        this.modifiedDatetimeStart = $.modifiedDatetimeStart;
        this.parameters = $.parameters;
        this.prefix = $.prefix;
        this.schema = $.schema;
        this.structure = $.structure;
        this.type = $.type;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AmazonS3DatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AmazonS3DatasetArgs $;

        public Builder() {
            $ = new AmazonS3DatasetArgs();
        }

        public Builder(AmazonS3DatasetArgs defaults) {
            $ = new AmazonS3DatasetArgs(Objects.requireNonNull(defaults));
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(List<Object> annotations) {
            return annotations(Output.of(annotations));
        }

        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        public Builder bucketName(Output<Object> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(Object bucketName) {
            return bucketName(Output.of(bucketName));
        }

        public Builder compression(@Nullable Output<DatasetCompressionArgs> compression) {
            $.compression = compression;
            return this;
        }

        public Builder compression(DatasetCompressionArgs compression) {
            return compression(Output.of(compression));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder folder(@Nullable Output<DatasetFolderArgs> folder) {
            $.folder = folder;
            return this;
        }

        public Builder folder(DatasetFolderArgs folder) {
            return folder(Output.of(folder));
        }

        public Builder format(@Nullable Output<Object> format) {
            $.format = format;
            return this;
        }

        public Builder format(Object format) {
            return format(Output.of(format));
        }

        public Builder key(@Nullable Output<Object> key) {
            $.key = key;
            return this;
        }

        public Builder key(Object key) {
            return key(Output.of(key));
        }

        public Builder linkedServiceName(Output<LinkedServiceReferenceArgs> linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder linkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            return linkedServiceName(Output.of(linkedServiceName));
        }

        public Builder modifiedDatetimeEnd(@Nullable Output<Object> modifiedDatetimeEnd) {
            $.modifiedDatetimeEnd = modifiedDatetimeEnd;
            return this;
        }

        public Builder modifiedDatetimeEnd(Object modifiedDatetimeEnd) {
            return modifiedDatetimeEnd(Output.of(modifiedDatetimeEnd));
        }

        public Builder modifiedDatetimeStart(@Nullable Output<Object> modifiedDatetimeStart) {
            $.modifiedDatetimeStart = modifiedDatetimeStart;
            return this;
        }

        public Builder modifiedDatetimeStart(Object modifiedDatetimeStart) {
            return modifiedDatetimeStart(Output.of(modifiedDatetimeStart));
        }

        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(Map<String,ParameterSpecificationArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder prefix(@Nullable Output<Object> prefix) {
            $.prefix = prefix;
            return this;
        }

        public Builder prefix(Object prefix) {
            return prefix(Output.of(prefix));
        }

        public Builder schema(@Nullable Output<Object> schema) {
            $.schema = schema;
            return this;
        }

        public Builder schema(Object schema) {
            return schema(Output.of(schema));
        }

        public Builder structure(@Nullable Output<Object> structure) {
            $.structure = structure;
            return this;
        }

        public Builder structure(Object structure) {
            return structure(Output.of(structure));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder version(@Nullable Output<Object> version) {
            $.version = version;
            return this;
        }

        public Builder version(Object version) {
            return version(Output.of(version));
        }

        public AmazonS3DatasetArgs build() {
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            $.linkedServiceName = Objects.requireNonNull($.linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
