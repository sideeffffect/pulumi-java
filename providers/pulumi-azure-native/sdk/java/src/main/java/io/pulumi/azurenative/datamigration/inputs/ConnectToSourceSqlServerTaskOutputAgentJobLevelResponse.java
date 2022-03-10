// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.MigrationEligibilityInfoResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * AgentJob level output for the task that validates connection to SQL Server and also validates source server requirements
 * 
 */
public final class ConnectToSourceSqlServerTaskOutputAgentJobLevelResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectToSourceSqlServerTaskOutputAgentJobLevelResponse Empty = new ConnectToSourceSqlServerTaskOutputAgentJobLevelResponse();

    /**
     * Result identifier
     * 
     */
    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The state of the original AgentJob.
     * 
     */
    @InputImport(name="isEnabled", required=true)
      private final Boolean isEnabled;

    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * The type of AgentJob.
     * 
     */
    @InputImport(name="jobCategory", required=true)
      private final String jobCategory;

    public String getJobCategory() {
        return this.jobCategory;
    }

    /**
     * The owner of the AgentJob
     * 
     */
    @InputImport(name="jobOwner", required=true)
      private final String jobOwner;

    public String getJobOwner() {
        return this.jobOwner;
    }

    /**
     * UTC Date and time when the AgentJob was last executed.
     * 
     */
    @InputImport(name="lastExecutedOn", required=true)
      private final String lastExecutedOn;

    public String getLastExecutedOn() {
        return this.lastExecutedOn;
    }

    /**
     * Information about eligibility of agent job for migration.
     * 
     */
    @InputImport(name="migrationEligibility", required=true)
      private final MigrationEligibilityInfoResponse migrationEligibility;

    public MigrationEligibilityInfoResponse getMigrationEligibility() {
        return this.migrationEligibility;
    }

    /**
     * AgentJob name
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Type of result - database level or task level
     * Expected value is 'AgentJobLevelOutput'.
     * 
     */
    @InputImport(name="resultType", required=true)
      private final String resultType;

    public String getResultType() {
        return this.resultType;
    }

    public ConnectToSourceSqlServerTaskOutputAgentJobLevelResponse(
        String id,
        Boolean isEnabled,
        String jobCategory,
        String jobOwner,
        String lastExecutedOn,
        MigrationEligibilityInfoResponse migrationEligibility,
        String name,
        String resultType) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.jobCategory = Objects.requireNonNull(jobCategory, "expected parameter 'jobCategory' to be non-null");
        this.jobOwner = Objects.requireNonNull(jobOwner, "expected parameter 'jobOwner' to be non-null");
        this.lastExecutedOn = Objects.requireNonNull(lastExecutedOn, "expected parameter 'lastExecutedOn' to be non-null");
        this.migrationEligibility = Objects.requireNonNull(migrationEligibility, "expected parameter 'migrationEligibility' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resultType = Objects.requireNonNull(resultType, "expected parameter 'resultType' to be non-null");
    }

    private ConnectToSourceSqlServerTaskOutputAgentJobLevelResponse() {
        this.id = null;
        this.isEnabled = null;
        this.jobCategory = null;
        this.jobOwner = null;
        this.lastExecutedOn = null;
        this.migrationEligibility = null;
        this.name = null;
        this.resultType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToSourceSqlServerTaskOutputAgentJobLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private Boolean isEnabled;
        private String jobCategory;
        private String jobOwner;
        private String lastExecutedOn;
        private MigrationEligibilityInfoResponse migrationEligibility;
        private String name;
        private String resultType;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToSourceSqlServerTaskOutputAgentJobLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.isEnabled = defaults.isEnabled;
    	      this.jobCategory = defaults.jobCategory;
    	      this.jobOwner = defaults.jobOwner;
    	      this.lastExecutedOn = defaults.lastExecutedOn;
    	      this.migrationEligibility = defaults.migrationEligibility;
    	      this.name = defaults.name;
    	      this.resultType = defaults.resultType;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder jobCategory(String jobCategory) {
            this.jobCategory = Objects.requireNonNull(jobCategory);
            return this;
        }

        public Builder jobOwner(String jobOwner) {
            this.jobOwner = Objects.requireNonNull(jobOwner);
            return this;
        }

        public Builder lastExecutedOn(String lastExecutedOn) {
            this.lastExecutedOn = Objects.requireNonNull(lastExecutedOn);
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
        public ConnectToSourceSqlServerTaskOutputAgentJobLevelResponse build() {
            return new ConnectToSourceSqlServerTaskOutputAgentJobLevelResponse(id, isEnabled, jobCategory, jobOwner, lastExecutedOn, migrationEligibility, name, resultType);
        }
    }
}
