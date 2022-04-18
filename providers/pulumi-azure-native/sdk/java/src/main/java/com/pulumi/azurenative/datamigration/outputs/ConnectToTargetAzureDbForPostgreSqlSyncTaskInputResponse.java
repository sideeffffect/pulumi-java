// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.azurenative.datamigration.outputs.PostgreSqlConnectionInfoResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class ConnectToTargetAzureDbForPostgreSqlSyncTaskInputResponse {
    /**
     * Connection information for source PostgreSQL server
     * 
     */
    private final PostgreSqlConnectionInfoResponse sourceConnectionInfo;
    /**
     * Connection information for target Azure Database for PostgreSQL server
     * 
     */
    private final PostgreSqlConnectionInfoResponse targetConnectionInfo;

    @CustomType.Constructor
    private ConnectToTargetAzureDbForPostgreSqlSyncTaskInputResponse(
        @CustomType.Parameter("sourceConnectionInfo") PostgreSqlConnectionInfoResponse sourceConnectionInfo,
        @CustomType.Parameter("targetConnectionInfo") PostgreSqlConnectionInfoResponse targetConnectionInfo) {
        this.sourceConnectionInfo = sourceConnectionInfo;
        this.targetConnectionInfo = targetConnectionInfo;
    }

    /**
     * Connection information for source PostgreSQL server
     * 
    */
    public PostgreSqlConnectionInfoResponse sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }
    /**
     * Connection information for target Azure Database for PostgreSQL server
     * 
    */
    public PostgreSqlConnectionInfoResponse targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetAzureDbForPostgreSqlSyncTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PostgreSqlConnectionInfoResponse sourceConnectionInfo;
        private PostgreSqlConnectionInfoResponse targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetAzureDbForPostgreSqlSyncTaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder sourceConnectionInfo(PostgreSqlConnectionInfoResponse sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }
        public Builder targetConnectionInfo(PostgreSqlConnectionInfoResponse targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }        public ConnectToTargetAzureDbForPostgreSqlSyncTaskInputResponse build() {
            return new ConnectToTargetAzureDbForPostgreSqlSyncTaskInputResponse(sourceConnectionInfo, targetConnectionInfo);
        }
    }
}
