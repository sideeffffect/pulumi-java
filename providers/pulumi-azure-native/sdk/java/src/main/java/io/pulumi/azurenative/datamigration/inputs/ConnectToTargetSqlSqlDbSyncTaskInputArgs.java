// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * Input for the task that validates connection to Azure SQL DB and target server requirements
 * 
 */
public final class ConnectToTargetSqlSqlDbSyncTaskInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectToTargetSqlSqlDbSyncTaskInputArgs Empty = new ConnectToTargetSqlSqlDbSyncTaskInputArgs();

    /**
     * Connection information for source SQL Server
     * 
     */
    @InputImport(name="sourceConnectionInfo", required=true)
      private final Input<SqlConnectionInfoArgs> sourceConnectionInfo;

    public Input<SqlConnectionInfoArgs> getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Connection information for target SQL DB
     * 
     */
    @InputImport(name="targetConnectionInfo", required=true)
      private final Input<SqlConnectionInfoArgs> targetConnectionInfo;

    public Input<SqlConnectionInfoArgs> getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public ConnectToTargetSqlSqlDbSyncTaskInputArgs(
        Input<SqlConnectionInfoArgs> sourceConnectionInfo,
        Input<SqlConnectionInfoArgs> targetConnectionInfo) {
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
    }

    private ConnectToTargetSqlSqlDbSyncTaskInputArgs() {
        this.sourceConnectionInfo = Input.empty();
        this.targetConnectionInfo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetSqlSqlDbSyncTaskInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<SqlConnectionInfoArgs> sourceConnectionInfo;
        private Input<SqlConnectionInfoArgs> targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetSqlSqlDbSyncTaskInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder sourceConnectionInfo(Input<SqlConnectionInfoArgs> sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }

        public Builder sourceConnectionInfo(SqlConnectionInfoArgs sourceConnectionInfo) {
            this.sourceConnectionInfo = Input.of(Objects.requireNonNull(sourceConnectionInfo));
            return this;
        }

        public Builder targetConnectionInfo(Input<SqlConnectionInfoArgs> targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }

        public Builder targetConnectionInfo(SqlConnectionInfoArgs targetConnectionInfo) {
            this.targetConnectionInfo = Input.of(Objects.requireNonNull(targetConnectionInfo));
            return this;
        }
        public ConnectToTargetSqlSqlDbSyncTaskInputArgs build() {
            return new ConnectToTargetSqlSqlDbSyncTaskInputArgs(sourceConnectionInfo, targetConnectionInfo);
        }
    }
}
