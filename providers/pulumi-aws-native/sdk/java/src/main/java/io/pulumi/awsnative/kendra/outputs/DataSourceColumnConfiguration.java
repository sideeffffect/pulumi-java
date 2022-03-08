// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.awsnative.kendra.outputs.DataSourceToIndexFieldMapping;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceColumnConfiguration {
    private final List<String> changeDetectingColumns;
    private final String documentDataColumnName;
    private final String documentIdColumnName;
    private final @Nullable String documentTitleColumnName;
    private final @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;

    @OutputCustomType.Constructor({"changeDetectingColumns","documentDataColumnName","documentIdColumnName","documentTitleColumnName","fieldMappings"})
    private DataSourceColumnConfiguration(
        List<String> changeDetectingColumns,
        String documentDataColumnName,
        String documentIdColumnName,
        @Nullable String documentTitleColumnName,
        @Nullable List<DataSourceToIndexFieldMapping> fieldMappings) {
        this.changeDetectingColumns = changeDetectingColumns;
        this.documentDataColumnName = documentDataColumnName;
        this.documentIdColumnName = documentIdColumnName;
        this.documentTitleColumnName = documentTitleColumnName;
        this.fieldMappings = fieldMappings;
    }

    public List<String> getChangeDetectingColumns() {
        return this.changeDetectingColumns;
    }
    public String getDocumentDataColumnName() {
        return this.documentDataColumnName;
    }
    public String getDocumentIdColumnName() {
        return this.documentIdColumnName;
    }
    public Optional<String> getDocumentTitleColumnName() {
        return Optional.ofNullable(this.documentTitleColumnName);
    }
    public List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return this.fieldMappings == null ? List.of() : this.fieldMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceColumnConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> changeDetectingColumns;
        private String documentDataColumnName;
        private String documentIdColumnName;
        private @Nullable String documentTitleColumnName;
        private @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceColumnConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeDetectingColumns = defaults.changeDetectingColumns;
    	      this.documentDataColumnName = defaults.documentDataColumnName;
    	      this.documentIdColumnName = defaults.documentIdColumnName;
    	      this.documentTitleColumnName = defaults.documentTitleColumnName;
    	      this.fieldMappings = defaults.fieldMappings;
        }

        public Builder setChangeDetectingColumns(List<String> changeDetectingColumns) {
            this.changeDetectingColumns = Objects.requireNonNull(changeDetectingColumns);
            return this;
        }

        public Builder setDocumentDataColumnName(String documentDataColumnName) {
            this.documentDataColumnName = Objects.requireNonNull(documentDataColumnName);
            return this;
        }

        public Builder setDocumentIdColumnName(String documentIdColumnName) {
            this.documentIdColumnName = Objects.requireNonNull(documentIdColumnName);
            return this;
        }

        public Builder setDocumentTitleColumnName(@Nullable String documentTitleColumnName) {
            this.documentTitleColumnName = documentTitleColumnName;
            return this;
        }

        public Builder setFieldMappings(@Nullable List<DataSourceToIndexFieldMapping> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }
        public DataSourceColumnConfiguration build() {
            return new DataSourceColumnConfiguration(changeDetectingColumns, documentDataColumnName, documentIdColumnName, documentTitleColumnName, fieldMappings);
        }
    }
}
