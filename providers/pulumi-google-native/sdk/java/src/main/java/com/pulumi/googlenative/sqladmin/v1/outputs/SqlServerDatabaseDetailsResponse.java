// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SqlServerDatabaseDetailsResponse {
    /**
     * @return The version of SQL Server with which the database is to be made compatible
     * 
     */
    private final Integer compatibilityLevel;
    /**
     * @return The recovery model of a SQL Server database
     * 
     */
    private final String recoveryModel;

    @CustomType.Constructor
    private SqlServerDatabaseDetailsResponse(
        @CustomType.Parameter("compatibilityLevel") Integer compatibilityLevel,
        @CustomType.Parameter("recoveryModel") String recoveryModel) {
        this.compatibilityLevel = compatibilityLevel;
        this.recoveryModel = recoveryModel;
    }

    /**
     * @return The version of SQL Server with which the database is to be made compatible
     * 
     */
    public Integer compatibilityLevel() {
        return this.compatibilityLevel;
    }
    /**
     * @return The recovery model of a SQL Server database
     * 
     */
    public String recoveryModel() {
        return this.recoveryModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlServerDatabaseDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer compatibilityLevel;
        private String recoveryModel;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlServerDatabaseDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compatibilityLevel = defaults.compatibilityLevel;
    	      this.recoveryModel = defaults.recoveryModel;
        }

        public Builder compatibilityLevel(Integer compatibilityLevel) {
            this.compatibilityLevel = Objects.requireNonNull(compatibilityLevel);
            return this;
        }
        public Builder recoveryModel(String recoveryModel) {
            this.recoveryModel = Objects.requireNonNull(recoveryModel);
            return this;
        }        public SqlServerDatabaseDetailsResponse build() {
            return new SqlServerDatabaseDetailsResponse(compatibilityLevel, recoveryModel);
        }
    }
}
