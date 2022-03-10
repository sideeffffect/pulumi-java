// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.bigquery.outputs.ConnectionCloudSqlCredential;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConnectionCloudSql {
    /**
     * Cloud SQL properties.
     * Structure is documented below.
     * 
     */
    private final ConnectionCloudSqlCredential credential;
    /**
     * Database name.
     * 
     */
    private final String database;
    /**
     * Cloud SQL instance ID in the form project:location:instance.
     * 
     */
    private final String instanceId;
    /**
     * Type of the Cloud SQL database.
     * Possible values are `DATABASE_TYPE_UNSPECIFIED`, `POSTGRES`, and `MYSQL`.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private ConnectionCloudSql(
        @OutputCustomType.Parameter("credential") ConnectionCloudSqlCredential credential,
        @OutputCustomType.Parameter("database") String database,
        @OutputCustomType.Parameter("instanceId") String instanceId,
        @OutputCustomType.Parameter("type") String type) {
        this.credential = credential;
        this.database = database;
        this.instanceId = instanceId;
        this.type = type;
    }

    /**
     * Cloud SQL properties.
     * Structure is documented below.
     * 
    */
    public ConnectionCloudSqlCredential getCredential() {
        return this.credential;
    }
    /**
     * Database name.
     * 
    */
    public String getDatabase() {
        return this.database;
    }
    /**
     * Cloud SQL instance ID in the form project:location:instance.
     * 
    */
    public String getInstanceId() {
        return this.instanceId;
    }
    /**
     * Type of the Cloud SQL database.
     * Possible values are `DATABASE_TYPE_UNSPECIFIED`, `POSTGRES`, and `MYSQL`.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionCloudSql defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionCloudSqlCredential credential;
        private String database;
        private String instanceId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionCloudSql defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credential = defaults.credential;
    	      this.database = defaults.database;
    	      this.instanceId = defaults.instanceId;
    	      this.type = defaults.type;
        }

        public Builder credential(ConnectionCloudSqlCredential credential) {
            this.credential = Objects.requireNonNull(credential);
            return this;
        }

        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ConnectionCloudSql build() {
            return new ConnectionCloudSql(credential, database, instanceId, type);
        }
    }
}
