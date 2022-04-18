// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.azurenative.recoveryservices.outputs.CurrentJobDetailsResponse;
import com.pulumi.azurenative.recoveryservices.outputs.HealthErrorResponse;
import com.pulumi.azurenative.recoveryservices.outputs.VMwareCbtMigrationDetailsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MigrationItemPropertiesResponse {
    /**
     * The allowed operations on the migration item, based on the current migration state of the item.
     * 
     */
    private final List<String> allowedOperations;
    /**
     * The current job details.
     * 
     */
    private final CurrentJobDetailsResponse currentJob;
    /**
     * The consolidated health.
     * 
     */
    private final String health;
    /**
     * The list of health errors.
     * 
     */
    private final List<HealthErrorResponse> healthErrors;
    /**
     * The on-premise virtual machine name.
     * 
     */
    private final String machineName;
    /**
     * The migration status.
     * 
     */
    private final String migrationState;
    /**
     * The migration state description.
     * 
     */
    private final String migrationStateDescription;
    /**
     * The name of policy governing this item.
     * 
     */
    private final String policyFriendlyName;
    /**
     * The ARM Id of policy governing this item.
     * 
     */
    private final String policyId;
    /**
     * The migration provider custom settings.
     * 
     */
    private final @Nullable VMwareCbtMigrationDetailsResponse providerSpecificDetails;
    /**
     * The recovery services provider ARM Id.
     * 
     */
    private final String recoveryServicesProviderId;
    /**
     * The test migrate state.
     * 
     */
    private final String testMigrateState;
    /**
     * The test migrate state description.
     * 
     */
    private final String testMigrateStateDescription;

    @CustomType.Constructor
    private MigrationItemPropertiesResponse(
        @CustomType.Parameter("allowedOperations") List<String> allowedOperations,
        @CustomType.Parameter("currentJob") CurrentJobDetailsResponse currentJob,
        @CustomType.Parameter("health") String health,
        @CustomType.Parameter("healthErrors") List<HealthErrorResponse> healthErrors,
        @CustomType.Parameter("machineName") String machineName,
        @CustomType.Parameter("migrationState") String migrationState,
        @CustomType.Parameter("migrationStateDescription") String migrationStateDescription,
        @CustomType.Parameter("policyFriendlyName") String policyFriendlyName,
        @CustomType.Parameter("policyId") String policyId,
        @CustomType.Parameter("providerSpecificDetails") @Nullable VMwareCbtMigrationDetailsResponse providerSpecificDetails,
        @CustomType.Parameter("recoveryServicesProviderId") String recoveryServicesProviderId,
        @CustomType.Parameter("testMigrateState") String testMigrateState,
        @CustomType.Parameter("testMigrateStateDescription") String testMigrateStateDescription) {
        this.allowedOperations = allowedOperations;
        this.currentJob = currentJob;
        this.health = health;
        this.healthErrors = healthErrors;
        this.machineName = machineName;
        this.migrationState = migrationState;
        this.migrationStateDescription = migrationStateDescription;
        this.policyFriendlyName = policyFriendlyName;
        this.policyId = policyId;
        this.providerSpecificDetails = providerSpecificDetails;
        this.recoveryServicesProviderId = recoveryServicesProviderId;
        this.testMigrateState = testMigrateState;
        this.testMigrateStateDescription = testMigrateStateDescription;
    }

    /**
     * The allowed operations on the migration item, based on the current migration state of the item.
     * 
    */
    public List<String> allowedOperations() {
        return this.allowedOperations;
    }
    /**
     * The current job details.
     * 
    */
    public CurrentJobDetailsResponse currentJob() {
        return this.currentJob;
    }
    /**
     * The consolidated health.
     * 
    */
    public String health() {
        return this.health;
    }
    /**
     * The list of health errors.
     * 
    */
    public List<HealthErrorResponse> healthErrors() {
        return this.healthErrors;
    }
    /**
     * The on-premise virtual machine name.
     * 
    */
    public String machineName() {
        return this.machineName;
    }
    /**
     * The migration status.
     * 
    */
    public String migrationState() {
        return this.migrationState;
    }
    /**
     * The migration state description.
     * 
    */
    public String migrationStateDescription() {
        return this.migrationStateDescription;
    }
    /**
     * The name of policy governing this item.
     * 
    */
    public String policyFriendlyName() {
        return this.policyFriendlyName;
    }
    /**
     * The ARM Id of policy governing this item.
     * 
    */
    public String policyId() {
        return this.policyId;
    }
    /**
     * The migration provider custom settings.
     * 
    */
    public Optional<VMwareCbtMigrationDetailsResponse> providerSpecificDetails() {
        return Optional.ofNullable(this.providerSpecificDetails);
    }
    /**
     * The recovery services provider ARM Id.
     * 
    */
    public String recoveryServicesProviderId() {
        return this.recoveryServicesProviderId;
    }
    /**
     * The test migrate state.
     * 
    */
    public String testMigrateState() {
        return this.testMigrateState;
    }
    /**
     * The test migrate state description.
     * 
    */
    public String testMigrateStateDescription() {
        return this.testMigrateStateDescription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrationItemPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedOperations;
        private CurrentJobDetailsResponse currentJob;
        private String health;
        private List<HealthErrorResponse> healthErrors;
        private String machineName;
        private String migrationState;
        private String migrationStateDescription;
        private String policyFriendlyName;
        private String policyId;
        private @Nullable VMwareCbtMigrationDetailsResponse providerSpecificDetails;
        private String recoveryServicesProviderId;
        private String testMigrateState;
        private String testMigrateStateDescription;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrationItemPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedOperations = defaults.allowedOperations;
    	      this.currentJob = defaults.currentJob;
    	      this.health = defaults.health;
    	      this.healthErrors = defaults.healthErrors;
    	      this.machineName = defaults.machineName;
    	      this.migrationState = defaults.migrationState;
    	      this.migrationStateDescription = defaults.migrationStateDescription;
    	      this.policyFriendlyName = defaults.policyFriendlyName;
    	      this.policyId = defaults.policyId;
    	      this.providerSpecificDetails = defaults.providerSpecificDetails;
    	      this.recoveryServicesProviderId = defaults.recoveryServicesProviderId;
    	      this.testMigrateState = defaults.testMigrateState;
    	      this.testMigrateStateDescription = defaults.testMigrateStateDescription;
        }

        public Builder allowedOperations(List<String> allowedOperations) {
            this.allowedOperations = Objects.requireNonNull(allowedOperations);
            return this;
        }
        public Builder allowedOperations(String... allowedOperations) {
            return allowedOperations(List.of(allowedOperations));
        }
        public Builder currentJob(CurrentJobDetailsResponse currentJob) {
            this.currentJob = Objects.requireNonNull(currentJob);
            return this;
        }
        public Builder health(String health) {
            this.health = Objects.requireNonNull(health);
            return this;
        }
        public Builder healthErrors(List<HealthErrorResponse> healthErrors) {
            this.healthErrors = Objects.requireNonNull(healthErrors);
            return this;
        }
        public Builder healthErrors(HealthErrorResponse... healthErrors) {
            return healthErrors(List.of(healthErrors));
        }
        public Builder machineName(String machineName) {
            this.machineName = Objects.requireNonNull(machineName);
            return this;
        }
        public Builder migrationState(String migrationState) {
            this.migrationState = Objects.requireNonNull(migrationState);
            return this;
        }
        public Builder migrationStateDescription(String migrationStateDescription) {
            this.migrationStateDescription = Objects.requireNonNull(migrationStateDescription);
            return this;
        }
        public Builder policyFriendlyName(String policyFriendlyName) {
            this.policyFriendlyName = Objects.requireNonNull(policyFriendlyName);
            return this;
        }
        public Builder policyId(String policyId) {
            this.policyId = Objects.requireNonNull(policyId);
            return this;
        }
        public Builder providerSpecificDetails(@Nullable VMwareCbtMigrationDetailsResponse providerSpecificDetails) {
            this.providerSpecificDetails = providerSpecificDetails;
            return this;
        }
        public Builder recoveryServicesProviderId(String recoveryServicesProviderId) {
            this.recoveryServicesProviderId = Objects.requireNonNull(recoveryServicesProviderId);
            return this;
        }
        public Builder testMigrateState(String testMigrateState) {
            this.testMigrateState = Objects.requireNonNull(testMigrateState);
            return this;
        }
        public Builder testMigrateStateDescription(String testMigrateStateDescription) {
            this.testMigrateStateDescription = Objects.requireNonNull(testMigrateStateDescription);
            return this;
        }        public MigrationItemPropertiesResponse build() {
            return new MigrationItemPropertiesResponse(allowedOperations, currentJob, health, healthErrors, machineName, migrationState, migrationStateDescription, policyFriendlyName, policyId, providerSpecificDetails, recoveryServicesProviderId, testMigrateState, testMigrateStateDescription);
        }
    }
}
