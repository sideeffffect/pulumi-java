// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.DatasetFolderArgs;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
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
 * MariaDB server dataset.
 * 
 */
public final class MariaDBTableDatasetArgs extends com.pulumi.resources.ResourceArgs {

    public static final MariaDBTableDatasetArgs Empty = new MariaDBTableDatasetArgs();

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
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName", required=true)
    private Output<LinkedServiceReferenceArgs> linkedServiceName;

    public Output<LinkedServiceReferenceArgs> linkedServiceName() {
        return this.linkedServiceName;
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
     * The table name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tableName")
    private @Nullable Output<Object> tableName;

    public Optional<Output<Object>> tableName() {
        return Optional.ofNullable(this.tableName);
    }

    /**
     * Type of dataset.
     * Expected value is &#39;MariaDBTable&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private MariaDBTableDatasetArgs() {}

    private MariaDBTableDatasetArgs(MariaDBTableDatasetArgs $) {
        this.annotations = $.annotations;
        this.description = $.description;
        this.folder = $.folder;
        this.linkedServiceName = $.linkedServiceName;
        this.parameters = $.parameters;
        this.schema = $.schema;
        this.structure = $.structure;
        this.tableName = $.tableName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MariaDBTableDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MariaDBTableDatasetArgs $;

        public Builder() {
            $ = new MariaDBTableDatasetArgs();
        }

        public Builder(MariaDBTableDatasetArgs defaults) {
            $ = new MariaDBTableDatasetArgs(Objects.requireNonNull(defaults));
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

        public Builder linkedServiceName(Output<LinkedServiceReferenceArgs> linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder linkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            return linkedServiceName(Output.of(linkedServiceName));
        }

        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(Map<String,ParameterSpecificationArgs> parameters) {
            return parameters(Output.of(parameters));
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

        public Builder tableName(@Nullable Output<Object> tableName) {
            $.tableName = tableName;
            return this;
        }

        public Builder tableName(Object tableName) {
            return tableName(Output.of(tableName));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public MariaDBTableDatasetArgs build() {
            $.linkedServiceName = Objects.requireNonNull($.linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
