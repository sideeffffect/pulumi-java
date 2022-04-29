// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.awsnative.kendra.inputs.DataSourceToIndexFieldMappingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceColumnConfigurationArgs extends ResourceArgs {

    public static final DataSourceColumnConfigurationArgs Empty = new DataSourceColumnConfigurationArgs();

    @Import(name="changeDetectingColumns", required=true)
    private Output<List<String>> changeDetectingColumns;

    public Output<List<String>> changeDetectingColumns() {
        return this.changeDetectingColumns;
    }

    @Import(name="documentDataColumnName", required=true)
    private Output<String> documentDataColumnName;

    public Output<String> documentDataColumnName() {
        return this.documentDataColumnName;
    }

    @Import(name="documentIdColumnName", required=true)
    private Output<String> documentIdColumnName;

    public Output<String> documentIdColumnName() {
        return this.documentIdColumnName;
    }

    @Import(name="documentTitleColumnName")
    private @Nullable Output<String> documentTitleColumnName;

    public Optional<Output<String>> documentTitleColumnName() {
        return Optional.ofNullable(this.documentTitleColumnName);
    }

    @Import(name="fieldMappings")
    private @Nullable Output<List<DataSourceToIndexFieldMappingArgs>> fieldMappings;

    public Optional<Output<List<DataSourceToIndexFieldMappingArgs>>> fieldMappings() {
        return Optional.ofNullable(this.fieldMappings);
    }

    private DataSourceColumnConfigurationArgs() {}

    private DataSourceColumnConfigurationArgs(DataSourceColumnConfigurationArgs $) {
        this.changeDetectingColumns = $.changeDetectingColumns;
        this.documentDataColumnName = $.documentDataColumnName;
        this.documentIdColumnName = $.documentIdColumnName;
        this.documentTitleColumnName = $.documentTitleColumnName;
        this.fieldMappings = $.fieldMappings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceColumnConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceColumnConfigurationArgs $;

        public Builder() {
            $ = new DataSourceColumnConfigurationArgs();
        }

        public Builder(DataSourceColumnConfigurationArgs defaults) {
            $ = new DataSourceColumnConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder changeDetectingColumns(Output<List<String>> changeDetectingColumns) {
            $.changeDetectingColumns = changeDetectingColumns;
            return this;
        }

        public Builder changeDetectingColumns(List<String> changeDetectingColumns) {
            return changeDetectingColumns(Output.of(changeDetectingColumns));
        }

        public Builder changeDetectingColumns(String... changeDetectingColumns) {
            return changeDetectingColumns(List.of(changeDetectingColumns));
        }

        public Builder documentDataColumnName(Output<String> documentDataColumnName) {
            $.documentDataColumnName = documentDataColumnName;
            return this;
        }

        public Builder documentDataColumnName(String documentDataColumnName) {
            return documentDataColumnName(Output.of(documentDataColumnName));
        }

        public Builder documentIdColumnName(Output<String> documentIdColumnName) {
            $.documentIdColumnName = documentIdColumnName;
            return this;
        }

        public Builder documentIdColumnName(String documentIdColumnName) {
            return documentIdColumnName(Output.of(documentIdColumnName));
        }

        public Builder documentTitleColumnName(@Nullable Output<String> documentTitleColumnName) {
            $.documentTitleColumnName = documentTitleColumnName;
            return this;
        }

        public Builder documentTitleColumnName(String documentTitleColumnName) {
            return documentTitleColumnName(Output.of(documentTitleColumnName));
        }

        public Builder fieldMappings(@Nullable Output<List<DataSourceToIndexFieldMappingArgs>> fieldMappings) {
            $.fieldMappings = fieldMappings;
            return this;
        }

        public Builder fieldMappings(List<DataSourceToIndexFieldMappingArgs> fieldMappings) {
            return fieldMappings(Output.of(fieldMappings));
        }

        public Builder fieldMappings(DataSourceToIndexFieldMappingArgs... fieldMappings) {
            return fieldMappings(List.of(fieldMappings));
        }

        public DataSourceColumnConfigurationArgs build() {
            $.changeDetectingColumns = Objects.requireNonNull($.changeDetectingColumns, "expected parameter 'changeDetectingColumns' to be non-null");
            $.documentDataColumnName = Objects.requireNonNull($.documentDataColumnName, "expected parameter 'documentDataColumnName' to be non-null");
            $.documentIdColumnName = Objects.requireNonNull($.documentIdColumnName, "expected parameter 'documentIdColumnName' to be non-null");
            return $;
        }
    }

}
