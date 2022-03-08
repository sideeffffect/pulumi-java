// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.aws.kinesis.outputs.AnalyticsApplicationReferenceDataSourcesS3;
import io.pulumi.aws.kinesis.outputs.AnalyticsApplicationReferenceDataSourcesSchema;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AnalyticsApplicationReferenceDataSources {
    /**
     * The ARN of the Kinesis Analytics Application.
     * 
     */
    private final @Nullable String id;
    /**
     * The S3 configuration for the reference data source. See S3 Reference below for more details.
     * 
     */
    private final AnalyticsApplicationReferenceDataSourcesS3 s3;
    /**
     * The Schema format of the data in the streaming source. See Source Schema below for more details.
     * 
     */
    private final AnalyticsApplicationReferenceDataSourcesSchema schema;
    /**
     * The in-application Table Name.
     * 
     */
    private final String tableName;

    @OutputCustomType.Constructor({"id","s3","schema","tableName"})
    private AnalyticsApplicationReferenceDataSources(
        @Nullable String id,
        AnalyticsApplicationReferenceDataSourcesS3 s3,
        AnalyticsApplicationReferenceDataSourcesSchema schema,
        String tableName) {
        this.id = id;
        this.s3 = s3;
        this.schema = schema;
        this.tableName = tableName;
    }

    /**
     * The ARN of the Kinesis Analytics Application.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The S3 configuration for the reference data source. See S3 Reference below for more details.
     * 
    */
    public AnalyticsApplicationReferenceDataSourcesS3 getS3() {
        return this.s3;
    }
    /**
     * The Schema format of the data in the streaming source. See Source Schema below for more details.
     * 
    */
    public AnalyticsApplicationReferenceDataSourcesSchema getSchema() {
        return this.schema;
    }
    /**
     * The in-application Table Name.
     * 
    */
    public String getTableName() {
        return this.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationReferenceDataSources defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private AnalyticsApplicationReferenceDataSourcesS3 s3;
        private AnalyticsApplicationReferenceDataSourcesSchema schema;
        private String tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationReferenceDataSources defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.s3 = defaults.s3;
    	      this.schema = defaults.schema;
    	      this.tableName = defaults.tableName;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setS3(AnalyticsApplicationReferenceDataSourcesS3 s3) {
            this.s3 = Objects.requireNonNull(s3);
            return this;
        }

        public Builder setSchema(AnalyticsApplicationReferenceDataSourcesSchema schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }

        public Builder setTableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public AnalyticsApplicationReferenceDataSources build() {
            return new AnalyticsApplicationReferenceDataSources(id, s3, schema, tableName);
        }
    }
}
