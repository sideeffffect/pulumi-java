// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.MigrationEligibilityInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConnectToSourceSqlServerTaskOutputLoginLevelResponse {
    /**
     * The default database for the login.
     * 
     */
    private final String defaultDatabase;
    /**
     * Result identifier
     * 
     */
    private final String id;
    /**
     * The state of the login.
     * 
     */
    private final Boolean isEnabled;
    /**
     * The type of login.
     * 
     */
    private final String loginType;
    /**
     * Information about eligibility of login for migration.
     * 
     */
    private final MigrationEligibilityInfoResponse migrationEligibility;
    /**
     * Login name.
     * 
     */
    private final String name;
    /**
     * Type of result - database level or task level
     * Expected value is 'LoginLevelOutput'.
     * 
     */
    private final String resultType;

    @OutputCustomType.Constructor
    private ConnectToSourceSqlServerTaskOutputLoginLevelResponse(
        @OutputCustomType.Parameter("defaultDatabase") String defaultDatabase,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("isEnabled") Boolean isEnabled,
        @OutputCustomType.Parameter("loginType") String loginType,
        @OutputCustomType.Parameter("migrationEligibility") MigrationEligibilityInfoResponse migrationEligibility,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("resultType") String resultType) {
        this.defaultDatabase = defaultDatabase;
        this.id = id;
        this.isEnabled = isEnabled;
        this.loginType = loginType;
        this.migrationEligibility = migrationEligibility;
        this.name = name;
        this.resultType = resultType;
    }

    /**
     * The default database for the login.
     * 
    */
    public String getDefaultDatabase() {
        return this.defaultDatabase;
    }
    /**
     * Result identifier
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The state of the login.
     * 
    */
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * The type of login.
     * 
    */
    public String getLoginType() {
        return this.loginType;
    }
    /**
     * Information about eligibility of login for migration.
     * 
    */
    public MigrationEligibilityInfoResponse getMigrationEligibility() {
        return this.migrationEligibility;
    }
    /**
     * Login name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Type of result - database level or task level
     * Expected value is 'LoginLevelOutput'.
     * 
    */
    public String getResultType() {
        return this.resultType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToSourceSqlServerTaskOutputLoginLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultDatabase;
        private String id;
        private Boolean isEnabled;
        private String loginType;
        private MigrationEligibilityInfoResponse migrationEligibility;
        private String name;
        private String resultType;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToSourceSqlServerTaskOutputLoginLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultDatabase = defaults.defaultDatabase;
    	      this.id = defaults.id;
    	      this.isEnabled = defaults.isEnabled;
    	      this.loginType = defaults.loginType;
    	      this.migrationEligibility = defaults.migrationEligibility;
    	      this.name = defaults.name;
    	      this.resultType = defaults.resultType;
        }

        public Builder defaultDatabase(String defaultDatabase) {
            this.defaultDatabase = Objects.requireNonNull(defaultDatabase);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder loginType(String loginType) {
            this.loginType = Objects.requireNonNull(loginType);
            return this;
        }

        public Builder migrationEligibility(MigrationEligibilityInfoResponse migrationEligibility) {
            this.migrationEligibility = Objects.requireNonNull(migrationEligibility);
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
        public ConnectToSourceSqlServerTaskOutputLoginLevelResponse build() {
            return new ConnectToSourceSqlServerTaskOutputLoginLevelResponse(defaultDatabase, id, isEnabled, loginType, migrationEligibility, name, resultType);
        }
    }
}
