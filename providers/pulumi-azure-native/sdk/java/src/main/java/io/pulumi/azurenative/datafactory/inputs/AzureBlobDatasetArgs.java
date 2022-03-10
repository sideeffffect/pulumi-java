// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AvroFormatArgs;
import io.pulumi.azurenative.datafactory.inputs.DatasetCompressionArgs;
import io.pulumi.azurenative.datafactory.inputs.DatasetFolderArgs;
import io.pulumi.azurenative.datafactory.inputs.JsonFormatArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.OrcFormatArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.azurenative.datafactory.inputs.ParquetFormatArgs;
import io.pulumi.azurenative.datafactory.inputs.TextFormatArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The Azure Blob storage.
 * 
 */
public final class AzureBlobDatasetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureBlobDatasetArgs Empty = new AzureBlobDatasetArgs();

    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    @InputImport(name="annotations")
      private final @Nullable Input<List<Object>> annotations;

    public Input<List<Object>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    /**
     * The data compression method used for the blob storage.
     * 
     */
    @InputImport(name="compression")
      private final @Nullable Input<DatasetCompressionArgs> compression;

    public Input<DatasetCompressionArgs> getCompression() {
        return this.compression == null ? Input.empty() : this.compression;
    }

    /**
     * Dataset description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the Azure Blob. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="fileName")
      private final @Nullable Input<Object> fileName;

    public Input<Object> getFileName() {
        return this.fileName == null ? Input.empty() : this.fileName;
    }

    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    @InputImport(name="folder")
      private final @Nullable Input<DatasetFolderArgs> folder;

    public Input<DatasetFolderArgs> getFolder() {
        return this.folder == null ? Input.empty() : this.folder;
    }

    /**
     * The path of the Azure Blob storage. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="folderPath")
      private final @Nullable Input<Object> folderPath;

    public Input<Object> getFolderPath() {
        return this.folderPath == null ? Input.empty() : this.folderPath;
    }

    /**
     * The format of the Azure Blob storage.
     * 
     */
    @InputImport(name="format")
      private final @Nullable Input<Object> format;

    public Input<Object> getFormat() {
        return this.format == null ? Input.empty() : this.format;
    }

    /**
     * Linked service reference.
     * 
     */
    @InputImport(name="linkedServiceName", required=true)
      private final Input<LinkedServiceReferenceArgs> linkedServiceName;

    public Input<LinkedServiceReferenceArgs> getLinkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * The end of Azure Blob's modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="modifiedDatetimeEnd")
      private final @Nullable Input<Object> modifiedDatetimeEnd;

    public Input<Object> getModifiedDatetimeEnd() {
        return this.modifiedDatetimeEnd == null ? Input.empty() : this.modifiedDatetimeEnd;
    }

    /**
     * The start of Azure Blob's modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="modifiedDatetimeStart")
      private final @Nullable Input<Object> modifiedDatetimeStart;

    public Input<Object> getModifiedDatetimeStart() {
        return this.modifiedDatetimeStart == null ? Input.empty() : this.modifiedDatetimeStart;
    }

    /**
     * Parameters for dataset.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;

    public Input<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    @InputImport(name="schema")
      private final @Nullable Input<Object> schema;

    public Input<Object> getSchema() {
        return this.schema == null ? Input.empty() : this.schema;
    }

    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    @InputImport(name="structure")
      private final @Nullable Input<Object> structure;

    public Input<Object> getStructure() {
        return this.structure == null ? Input.empty() : this.structure;
    }

    /**
     * The root of blob path. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="tableRootLocation")
      private final @Nullable Input<Object> tableRootLocation;

    public Input<Object> getTableRootLocation() {
        return this.tableRootLocation == null ? Input.empty() : this.tableRootLocation;
    }

    /**
     * Type of dataset.
     * Expected value is 'AzureBlob'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public AzureBlobDatasetArgs(
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<DatasetCompressionArgs> compression,
        @Nullable Input<String> description,
        @Nullable Input<Object> fileName,
        @Nullable Input<DatasetFolderArgs> folder,
        @Nullable Input<Object> folderPath,
        @Nullable Input<Object> format,
        Input<LinkedServiceReferenceArgs> linkedServiceName,
        @Nullable Input<Object> modifiedDatetimeEnd,
        @Nullable Input<Object> modifiedDatetimeStart,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Input<Object> schema,
        @Nullable Input<Object> structure,
        @Nullable Input<Object> tableRootLocation,
        Input<String> type) {
        this.annotations = annotations;
        this.compression = compression;
        this.description = description;
        this.fileName = fileName;
        this.folder = folder;
        this.folderPath = folderPath;
        this.format = format;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        this.parameters = parameters;
        this.schema = schema;
        this.structure = structure;
        this.tableRootLocation = tableRootLocation;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureBlobDatasetArgs() {
        this.annotations = Input.empty();
        this.compression = Input.empty();
        this.description = Input.empty();
        this.fileName = Input.empty();
        this.folder = Input.empty();
        this.folderPath = Input.empty();
        this.format = Input.empty();
        this.linkedServiceName = Input.empty();
        this.modifiedDatetimeEnd = Input.empty();
        this.modifiedDatetimeStart = Input.empty();
        this.parameters = Input.empty();
        this.schema = Input.empty();
        this.structure = Input.empty();
        this.tableRootLocation = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBlobDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<DatasetCompressionArgs> compression;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> fileName;
        private @Nullable Input<DatasetFolderArgs> folder;
        private @Nullable Input<Object> folderPath;
        private @Nullable Input<Object> format;
        private Input<LinkedServiceReferenceArgs> linkedServiceName;
        private @Nullable Input<Object> modifiedDatetimeEnd;
        private @Nullable Input<Object> modifiedDatetimeStart;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Input<Object> schema;
        private @Nullable Input<Object> structure;
        private @Nullable Input<Object> tableRootLocation;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBlobDatasetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.compression = defaults.compression;
    	      this.description = defaults.description;
    	      this.fileName = defaults.fileName;
    	      this.folder = defaults.folder;
    	      this.folderPath = defaults.folderPath;
    	      this.format = defaults.format;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.modifiedDatetimeEnd = defaults.modifiedDatetimeEnd;
    	      this.modifiedDatetimeStart = defaults.modifiedDatetimeStart;
    	      this.parameters = defaults.parameters;
    	      this.schema = defaults.schema;
    	      this.structure = defaults.structure;
    	      this.tableRootLocation = defaults.tableRootLocation;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable Input<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder compression(@Nullable Input<DatasetCompressionArgs> compression) {
            this.compression = compression;
            return this;
        }

        public Builder compression(@Nullable DatasetCompressionArgs compression) {
            this.compression = Input.ofNullable(compression);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder fileName(@Nullable Input<Object> fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder fileName(@Nullable Object fileName) {
            this.fileName = Input.ofNullable(fileName);
            return this;
        }

        public Builder folder(@Nullable Input<DatasetFolderArgs> folder) {
            this.folder = folder;
            return this;
        }

        public Builder folder(@Nullable DatasetFolderArgs folder) {
            this.folder = Input.ofNullable(folder);
            return this;
        }

        public Builder folderPath(@Nullable Input<Object> folderPath) {
            this.folderPath = folderPath;
            return this;
        }

        public Builder folderPath(@Nullable Object folderPath) {
            this.folderPath = Input.ofNullable(folderPath);
            return this;
        }

        public Builder format(@Nullable Input<Object> format) {
            this.format = format;
            return this;
        }

        public Builder format(@Nullable Object format) {
            this.format = Input.ofNullable(format);
            return this;
        }

        public Builder linkedServiceName(Input<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }

        public Builder linkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Input.of(Objects.requireNonNull(linkedServiceName));
            return this;
        }

        public Builder modifiedDatetimeEnd(@Nullable Input<Object> modifiedDatetimeEnd) {
            this.modifiedDatetimeEnd = modifiedDatetimeEnd;
            return this;
        }

        public Builder modifiedDatetimeEnd(@Nullable Object modifiedDatetimeEnd) {
            this.modifiedDatetimeEnd = Input.ofNullable(modifiedDatetimeEnd);
            return this;
        }

        public Builder modifiedDatetimeStart(@Nullable Input<Object> modifiedDatetimeStart) {
            this.modifiedDatetimeStart = modifiedDatetimeStart;
            return this;
        }

        public Builder modifiedDatetimeStart(@Nullable Object modifiedDatetimeStart) {
            this.modifiedDatetimeStart = Input.ofNullable(modifiedDatetimeStart);
            return this;
        }

        public Builder parameters(@Nullable Input<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder schema(@Nullable Input<Object> schema) {
            this.schema = schema;
            return this;
        }

        public Builder schema(@Nullable Object schema) {
            this.schema = Input.ofNullable(schema);
            return this;
        }

        public Builder structure(@Nullable Input<Object> structure) {
            this.structure = structure;
            return this;
        }

        public Builder structure(@Nullable Object structure) {
            this.structure = Input.ofNullable(structure);
            return this;
        }

        public Builder tableRootLocation(@Nullable Input<Object> tableRootLocation) {
            this.tableRootLocation = tableRootLocation;
            return this;
        }

        public Builder tableRootLocation(@Nullable Object tableRootLocation) {
            this.tableRootLocation = Input.ofNullable(tableRootLocation);
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public AzureBlobDatasetArgs build() {
            return new AzureBlobDatasetArgs(annotations, compression, description, fileName, folder, folderPath, format, linkedServiceName, modifiedDatetimeEnd, modifiedDatetimeStart, parameters, schema, structure, tableRootLocation, type);
        }
    }
}
