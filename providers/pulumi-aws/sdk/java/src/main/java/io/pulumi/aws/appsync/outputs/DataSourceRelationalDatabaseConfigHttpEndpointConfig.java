// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceRelationalDatabaseConfigHttpEndpointConfig {
    /**
     * AWS secret store ARN for database credentials.
     * 
     */
    private final String awsSecretStoreArn;
    /**
     * Logical database name.
     * 
     */
    private final @Nullable String databaseName;
    /**
     * Amazon RDS cluster identifier.
     * 
     */
    private final String dbClusterIdentifier;
    /**
     * AWS Region for RDS HTTP endpoint. Defaults to current region.
     * 
     */
    private final @Nullable String region;
    /**
     * Logical schema name.
     * 
     */
    private final @Nullable String schema;

    @OutputCustomType.Constructor
    private DataSourceRelationalDatabaseConfigHttpEndpointConfig(
        @OutputCustomType.Parameter("awsSecretStoreArn") String awsSecretStoreArn,
        @OutputCustomType.Parameter("databaseName") @Nullable String databaseName,
        @OutputCustomType.Parameter("dbClusterIdentifier") String dbClusterIdentifier,
        @OutputCustomType.Parameter("region") @Nullable String region,
        @OutputCustomType.Parameter("schema") @Nullable String schema) {
        this.awsSecretStoreArn = awsSecretStoreArn;
        this.databaseName = databaseName;
        this.dbClusterIdentifier = dbClusterIdentifier;
        this.region = region;
        this.schema = schema;
    }

    /**
     * AWS secret store ARN for database credentials.
     * 
    */
    public String getAwsSecretStoreArn() {
        return this.awsSecretStoreArn;
    }
    /**
     * Logical database name.
     * 
    */
    public Optional<String> getDatabaseName() {
        return Optional.ofNullable(this.databaseName);
    }
    /**
     * Amazon RDS cluster identifier.
     * 
    */
    public String getDbClusterIdentifier() {
        return this.dbClusterIdentifier;
    }
    /**
     * AWS Region for RDS HTTP endpoint. Defaults to current region.
     * 
    */
    public Optional<String> getRegion() {
        return Optional.ofNullable(this.region);
    }
    /**
     * Logical schema name.
     * 
    */
    public Optional<String> getSchema() {
        return Optional.ofNullable(this.schema);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceRelationalDatabaseConfigHttpEndpointConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String awsSecretStoreArn;
        private @Nullable String databaseName;
        private String dbClusterIdentifier;
        private @Nullable String region;
        private @Nullable String schema;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceRelationalDatabaseConfigHttpEndpointConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsSecretStoreArn = defaults.awsSecretStoreArn;
    	      this.databaseName = defaults.databaseName;
    	      this.dbClusterIdentifier = defaults.dbClusterIdentifier;
    	      this.region = defaults.region;
    	      this.schema = defaults.schema;
        }

        public Builder awsSecretStoreArn(String awsSecretStoreArn) {
            this.awsSecretStoreArn = Objects.requireNonNull(awsSecretStoreArn);
            return this;
        }

        public Builder databaseName(@Nullable String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        public Builder dbClusterIdentifier(String dbClusterIdentifier) {
            this.dbClusterIdentifier = Objects.requireNonNull(dbClusterIdentifier);
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }

        public Builder schema(@Nullable String schema) {
            this.schema = schema;
            return this;
        }
        public DataSourceRelationalDatabaseConfigHttpEndpointConfig build() {
            return new DataSourceRelationalDatabaseConfigHttpEndpointConfig(awsSecretStoreArn, databaseName, dbClusterIdentifier, region, schema);
        }
    }
}
