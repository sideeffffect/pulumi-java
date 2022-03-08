// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.MigrateSqlServerSqlDbSyncDatabaseInputResponse;
import io.pulumi.azurenative.datamigration.outputs.SqlConnectionInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ValidateSyncMigrationInputSqlServerTaskInputResponse {
    /**
     * Databases to migrate
     * 
     */
    private final List<MigrateSqlServerSqlDbSyncDatabaseInputResponse> selectedDatabases;
    /**
     * Information for connecting to source SQL server
     * 
     */
    private final SqlConnectionInfoResponse sourceConnectionInfo;
    /**
     * Information for connecting to target
     * 
     */
    private final SqlConnectionInfoResponse targetConnectionInfo;

    @OutputCustomType.Constructor({"selectedDatabases","sourceConnectionInfo","targetConnectionInfo"})
    private ValidateSyncMigrationInputSqlServerTaskInputResponse(
        List<MigrateSqlServerSqlDbSyncDatabaseInputResponse> selectedDatabases,
        SqlConnectionInfoResponse sourceConnectionInfo,
        SqlConnectionInfoResponse targetConnectionInfo) {
        this.selectedDatabases = selectedDatabases;
        this.sourceConnectionInfo = sourceConnectionInfo;
        this.targetConnectionInfo = targetConnectionInfo;
    }

    /**
     * Databases to migrate
     * 
    */
    public List<MigrateSqlServerSqlDbSyncDatabaseInputResponse> getSelectedDatabases() {
        return this.selectedDatabases;
    }
    /**
     * Information for connecting to source SQL server
     * 
    */
    public SqlConnectionInfoResponse getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }
    /**
     * Information for connecting to target
     * 
    */
    public SqlConnectionInfoResponse getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidateSyncMigrationInputSqlServerTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MigrateSqlServerSqlDbSyncDatabaseInputResponse> selectedDatabases;
        private SqlConnectionInfoResponse sourceConnectionInfo;
        private SqlConnectionInfoResponse targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidateSyncMigrationInputSqlServerTaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selectedDatabases = defaults.selectedDatabases;
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder setSelectedDatabases(List<MigrateSqlServerSqlDbSyncDatabaseInputResponse> selectedDatabases) {
            this.selectedDatabases = Objects.requireNonNull(selectedDatabases);
            return this;
        }

        public Builder setSourceConnectionInfo(SqlConnectionInfoResponse sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }

        public Builder setTargetConnectionInfo(SqlConnectionInfoResponse targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }
        public ValidateSyncMigrationInputSqlServerTaskInputResponse build() {
            return new ValidateSyncMigrationInputSqlServerTaskInputResponse(selectedDatabases, sourceConnectionInfo, targetConnectionInfo);
        }
    }
}
