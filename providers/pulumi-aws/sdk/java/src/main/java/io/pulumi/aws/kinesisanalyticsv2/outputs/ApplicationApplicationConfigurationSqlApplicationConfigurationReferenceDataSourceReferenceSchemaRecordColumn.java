// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumn {
    /**
     * A reference to the data element in the streaming input or the reference data source.
     * 
     */
    private final @Nullable String mapping;
    /**
     * The name of the column that is created in the in-application input stream or reference table.
     * 
     */
    private final String name;
    /**
     * The type of column created in the in-application input stream or reference table.
     * 
     */
    private final String sqlType;

    @CustomType.Constructor
    private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumn(
        @CustomType.Parameter("mapping") @Nullable String mapping,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("sqlType") String sqlType) {
        this.mapping = mapping;
        this.name = name;
        this.sqlType = sqlType;
    }

    /**
     * A reference to the data element in the streaming input or the reference data source.
     * 
    */
    public Optional<String> mapping() {
        return Optional.ofNullable(this.mapping);
    }
    /**
     * The name of the column that is created in the in-application input stream or reference table.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The type of column created in the in-application input stream or reference table.
     * 
    */
    public String sqlType() {
        return this.sqlType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumn defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String mapping;
        private String name;
        private String sqlType;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mapping = defaults.mapping;
    	      this.name = defaults.name;
    	      this.sqlType = defaults.sqlType;
        }

        public Builder mapping(@Nullable String mapping) {
            this.mapping = mapping;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder sqlType(String sqlType) {
            this.sqlType = Objects.requireNonNull(sqlType);
            return this;
        }        public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumn build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumn(mapping, name, sqlType);
        }
    }
}
