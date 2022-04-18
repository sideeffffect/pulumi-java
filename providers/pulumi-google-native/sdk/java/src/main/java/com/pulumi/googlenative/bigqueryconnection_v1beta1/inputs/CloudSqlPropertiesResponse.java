// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigqueryconnection_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.bigqueryconnection_v1beta1.inputs.CloudSqlCredentialResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Connection properties specific to the Cloud SQL.
 * 
 */
public final class CloudSqlPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final CloudSqlPropertiesResponse Empty = new CloudSqlPropertiesResponse();

    /**
     * Input only. Cloud SQL credential.
     * 
     */
    @Import(name="credential", required=true)
      private final CloudSqlCredentialResponse credential;

    public CloudSqlCredentialResponse credential() {
        return this.credential;
    }

    /**
     * Database name.
     * 
     */
    @Import(name="database", required=true)
      private final String database;

    public String database() {
        return this.database;
    }

    /**
     * Cloud SQL instance ID in the form `project:location:instance`.
     * 
     */
    @Import(name="instanceId", required=true)
      private final String instanceId;

    public String instanceId() {
        return this.instanceId;
    }

    /**
     * Type of the Cloud SQL database.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public CloudSqlPropertiesResponse(
        CloudSqlCredentialResponse credential,
        String database,
        String instanceId,
        String type) {
        this.credential = Objects.requireNonNull(credential, "expected parameter 'credential' to be non-null");
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private CloudSqlPropertiesResponse() {
        this.credential = null;
        this.database = null;
        this.instanceId = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudSqlPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudSqlCredentialResponse credential;
        private String database;
        private String instanceId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudSqlPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credential = defaults.credential;
    	      this.database = defaults.database;
    	      this.instanceId = defaults.instanceId;
    	      this.type = defaults.type;
        }

        public Builder credential(CloudSqlCredentialResponse credential) {
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
        }        public CloudSqlPropertiesResponse build() {
            return new CloudSqlPropertiesResponse(credential, database, instanceId, type);
        }
    }
}
