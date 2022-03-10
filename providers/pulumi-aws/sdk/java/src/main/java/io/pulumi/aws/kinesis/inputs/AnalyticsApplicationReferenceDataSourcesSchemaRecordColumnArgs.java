// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs Empty = new AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs();

    /**
     * The Mapping reference to the data element.
     * 
     */
    @InputImport(name="mapping")
      private final @Nullable Input<String> mapping;

    public Input<String> getMapping() {
        return this.mapping == null ? Input.empty() : this.mapping;
    }

    /**
     * Name of the column.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The SQL Type of the column.
     * 
     */
    @InputImport(name="sqlType", required=true)
      private final Input<String> sqlType;

    public Input<String> getSqlType() {
        return this.sqlType;
    }

    public AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs(
        @Nullable Input<String> mapping,
        Input<String> name,
        Input<String> sqlType) {
        this.mapping = mapping;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.sqlType = Objects.requireNonNull(sqlType, "expected parameter 'sqlType' to be non-null");
    }

    private AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs() {
        this.mapping = Input.empty();
        this.name = Input.empty();
        this.sqlType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> mapping;
        private Input<String> name;
        private Input<String> sqlType;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mapping = defaults.mapping;
    	      this.name = defaults.name;
    	      this.sqlType = defaults.sqlType;
        }

        public Builder mapping(@Nullable Input<String> mapping) {
            this.mapping = mapping;
            return this;
        }

        public Builder mapping(@Nullable String mapping) {
            this.mapping = Input.ofNullable(mapping);
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder sqlType(Input<String> sqlType) {
            this.sqlType = Objects.requireNonNull(sqlType);
            return this;
        }

        public Builder sqlType(String sqlType) {
            this.sqlType = Input.of(Objects.requireNonNull(sqlType));
            return this;
        }
        public AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs build() {
            return new AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnArgs(mapping, name, sqlType);
        }
    }
}
