// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.azurenative.datamigration.outputs.DatabaseFileInfoResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ConnectToSourceSqlServerTaskOutputDatabaseLevelResponse {
    /**
     * SQL Server compatibility level of database
     * 
     */
    private final String compatibilityLevel;
    /**
     * The list of database files
     * 
     */
    private final List<DatabaseFileInfoResponse> databaseFiles;
    /**
     * State of the database
     * 
     */
    private final String databaseState;
    /**
     * Result identifier
     * 
     */
    private final String id;
    /**
     * Database name
     * 
     */
    private final String name;
    /**
     * Type of result - database level or task level
     * Expected value is 'DatabaseLevelOutput'.
     * 
     */
    private final String resultType;
    /**
     * Size of the file in megabytes
     * 
     */
    private final Double sizeMB;

    @CustomType.Constructor
    private ConnectToSourceSqlServerTaskOutputDatabaseLevelResponse(
        @CustomType.Parameter("compatibilityLevel") String compatibilityLevel,
        @CustomType.Parameter("databaseFiles") List<DatabaseFileInfoResponse> databaseFiles,
        @CustomType.Parameter("databaseState") String databaseState,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resultType") String resultType,
        @CustomType.Parameter("sizeMB") Double sizeMB) {
        this.compatibilityLevel = compatibilityLevel;
        this.databaseFiles = databaseFiles;
        this.databaseState = databaseState;
        this.id = id;
        this.name = name;
        this.resultType = resultType;
        this.sizeMB = sizeMB;
    }

    /**
     * SQL Server compatibility level of database
     * 
    */
    public String compatibilityLevel() {
        return this.compatibilityLevel;
    }
    /**
     * The list of database files
     * 
    */
    public List<DatabaseFileInfoResponse> databaseFiles() {
        return this.databaseFiles;
    }
    /**
     * State of the database
     * 
    */
    public String databaseState() {
        return this.databaseState;
    }
    /**
     * Result identifier
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Database name
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Type of result - database level or task level
     * Expected value is 'DatabaseLevelOutput'.
     * 
    */
    public String resultType() {
        return this.resultType;
    }
    /**
     * Size of the file in megabytes
     * 
    */
    public Double sizeMB() {
        return this.sizeMB;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToSourceSqlServerTaskOutputDatabaseLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compatibilityLevel;
        private List<DatabaseFileInfoResponse> databaseFiles;
        private String databaseState;
        private String id;
        private String name;
        private String resultType;
        private Double sizeMB;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToSourceSqlServerTaskOutputDatabaseLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compatibilityLevel = defaults.compatibilityLevel;
    	      this.databaseFiles = defaults.databaseFiles;
    	      this.databaseState = defaults.databaseState;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resultType = defaults.resultType;
    	      this.sizeMB = defaults.sizeMB;
        }

        public Builder compatibilityLevel(String compatibilityLevel) {
            this.compatibilityLevel = Objects.requireNonNull(compatibilityLevel);
            return this;
        }
        public Builder databaseFiles(List<DatabaseFileInfoResponse> databaseFiles) {
            this.databaseFiles = Objects.requireNonNull(databaseFiles);
            return this;
        }
        public Builder databaseFiles(DatabaseFileInfoResponse... databaseFiles) {
            return databaseFiles(List.of(databaseFiles));
        }
        public Builder databaseState(String databaseState) {
            this.databaseState = Objects.requireNonNull(databaseState);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }
        public Builder sizeMB(Double sizeMB) {
            this.sizeMB = Objects.requireNonNull(sizeMB);
            return this;
        }        public ConnectToSourceSqlServerTaskOutputDatabaseLevelResponse build() {
            return new ConnectToSourceSqlServerTaskOutputDatabaseLevelResponse(compatibilityLevel, databaseFiles, databaseState, id, name, resultType, sizeMB);
        }
    }
}
