// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn {
    /**
     * The Mapping reference to the data element.
     * 
     */
    private final @Nullable String mapping;
    /**
     * Name of the column.
     * 
     */
    private final String name;
    /**
     * The SQL Type of the column.
     * 
     */
    private final String sqlType;

    @OutputCustomType.Constructor
    private AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn(
        @OutputCustomType.Parameter("mapping") @Nullable String mapping,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("sqlType") String sqlType) {
        this.mapping = mapping;
        this.name = name;
        this.sqlType = sqlType;
    }

    /**
     * The Mapping reference to the data element.
     * 
    */
    public Optional<String> getMapping() {
        return Optional.ofNullable(this.mapping);
    }
    /**
     * Name of the column.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The SQL Type of the column.
     * 
    */
    public String getSqlType() {
        return this.sqlType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String mapping;
        private String name;
        private String sqlType;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn defaults) {
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
        }
        public AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn build() {
            return new AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn(mapping, name, sqlType);
        }
    }
}
