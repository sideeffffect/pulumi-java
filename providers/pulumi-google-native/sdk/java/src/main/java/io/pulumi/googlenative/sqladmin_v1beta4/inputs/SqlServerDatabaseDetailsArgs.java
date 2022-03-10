// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a Sql Server database on the Cloud SQL instance.
 * 
 */
public final class SqlServerDatabaseDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlServerDatabaseDetailsArgs Empty = new SqlServerDatabaseDetailsArgs();

    /**
     * The version of SQL Server with which the database is to be made compatible
     * 
     */
    @InputImport(name="compatibilityLevel")
      private final @Nullable Input<Integer> compatibilityLevel;

    public Input<Integer> getCompatibilityLevel() {
        return this.compatibilityLevel == null ? Input.empty() : this.compatibilityLevel;
    }

    /**
     * The recovery model of a SQL Server database
     * 
     */
    @InputImport(name="recoveryModel")
      private final @Nullable Input<String> recoveryModel;

    public Input<String> getRecoveryModel() {
        return this.recoveryModel == null ? Input.empty() : this.recoveryModel;
    }

    public SqlServerDatabaseDetailsArgs(
        @Nullable Input<Integer> compatibilityLevel,
        @Nullable Input<String> recoveryModel) {
        this.compatibilityLevel = compatibilityLevel;
        this.recoveryModel = recoveryModel;
    }

    private SqlServerDatabaseDetailsArgs() {
        this.compatibilityLevel = Input.empty();
        this.recoveryModel = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlServerDatabaseDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> compatibilityLevel;
        private @Nullable Input<String> recoveryModel;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlServerDatabaseDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compatibilityLevel = defaults.compatibilityLevel;
    	      this.recoveryModel = defaults.recoveryModel;
        }

        public Builder compatibilityLevel(@Nullable Input<Integer> compatibilityLevel) {
            this.compatibilityLevel = compatibilityLevel;
            return this;
        }

        public Builder compatibilityLevel(@Nullable Integer compatibilityLevel) {
            this.compatibilityLevel = Input.ofNullable(compatibilityLevel);
            return this;
        }

        public Builder recoveryModel(@Nullable Input<String> recoveryModel) {
            this.recoveryModel = recoveryModel;
            return this;
        }

        public Builder recoveryModel(@Nullable String recoveryModel) {
            this.recoveryModel = Input.ofNullable(recoveryModel);
            return this;
        }
        public SqlServerDatabaseDetailsArgs build() {
            return new SqlServerDatabaseDetailsArgs(compatibilityLevel, recoveryModel);
        }
    }
}
