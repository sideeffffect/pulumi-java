// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.enums.DataSourceConfluenceBlogFieldName;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceConfluenceBlogToIndexFieldMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceConfluenceBlogToIndexFieldMappingArgs Empty = new DataSourceConfluenceBlogToIndexFieldMappingArgs();

    @InputImport(name="dataSourceFieldName", required=true)
      private final Input<DataSourceConfluenceBlogFieldName> dataSourceFieldName;

    public Input<DataSourceConfluenceBlogFieldName> getDataSourceFieldName() {
        return this.dataSourceFieldName;
    }

    @InputImport(name="dateFieldFormat")
      private final @Nullable Input<String> dateFieldFormat;

    public Input<String> getDateFieldFormat() {
        return this.dateFieldFormat == null ? Input.empty() : this.dateFieldFormat;
    }

    @InputImport(name="indexFieldName", required=true)
      private final Input<String> indexFieldName;

    public Input<String> getIndexFieldName() {
        return this.indexFieldName;
    }

    public DataSourceConfluenceBlogToIndexFieldMappingArgs(
        Input<DataSourceConfluenceBlogFieldName> dataSourceFieldName,
        @Nullable Input<String> dateFieldFormat,
        Input<String> indexFieldName) {
        this.dataSourceFieldName = Objects.requireNonNull(dataSourceFieldName, "expected parameter 'dataSourceFieldName' to be non-null");
        this.dateFieldFormat = dateFieldFormat;
        this.indexFieldName = Objects.requireNonNull(indexFieldName, "expected parameter 'indexFieldName' to be non-null");
    }

    private DataSourceConfluenceBlogToIndexFieldMappingArgs() {
        this.dataSourceFieldName = Input.empty();
        this.dateFieldFormat = Input.empty();
        this.indexFieldName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceConfluenceBlogToIndexFieldMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<DataSourceConfluenceBlogFieldName> dataSourceFieldName;
        private @Nullable Input<String> dateFieldFormat;
        private Input<String> indexFieldName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceConfluenceBlogToIndexFieldMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSourceFieldName = defaults.dataSourceFieldName;
    	      this.dateFieldFormat = defaults.dateFieldFormat;
    	      this.indexFieldName = defaults.indexFieldName;
        }

        public Builder dataSourceFieldName(Input<DataSourceConfluenceBlogFieldName> dataSourceFieldName) {
            this.dataSourceFieldName = Objects.requireNonNull(dataSourceFieldName);
            return this;
        }

        public Builder dataSourceFieldName(DataSourceConfluenceBlogFieldName dataSourceFieldName) {
            this.dataSourceFieldName = Input.of(Objects.requireNonNull(dataSourceFieldName));
            return this;
        }

        public Builder dateFieldFormat(@Nullable Input<String> dateFieldFormat) {
            this.dateFieldFormat = dateFieldFormat;
            return this;
        }

        public Builder dateFieldFormat(@Nullable String dateFieldFormat) {
            this.dateFieldFormat = Input.ofNullable(dateFieldFormat);
            return this;
        }

        public Builder indexFieldName(Input<String> indexFieldName) {
            this.indexFieldName = Objects.requireNonNull(indexFieldName);
            return this;
        }

        public Builder indexFieldName(String indexFieldName) {
            this.indexFieldName = Input.of(Objects.requireNonNull(indexFieldName));
            return this;
        }
        public DataSourceConfluenceBlogToIndexFieldMappingArgs build() {
            return new DataSourceConfluenceBlogToIndexFieldMappingArgs(dataSourceFieldName, dateFieldFormat, indexFieldName);
        }
    }
}
