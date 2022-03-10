// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights.outputs;

import io.pulumi.azurenative.policyinsights.outputs.RemediationDeploymentSummaryResponse;
import io.pulumi.azurenative.policyinsights.outputs.RemediationFiltersResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRemediationAtResourceGroupResult {
    /**
     * The time at which the remediation was created.
     * 
     */
    private final String createdOn;
    /**
     * The deployment status summary for all deployments created by the remediation.
     * 
     */
    private final RemediationDeploymentSummaryResponse deploymentStatus;
    /**
     * The filters that will be applied to determine which resources to remediate.
     * 
     */
    private final @Nullable RemediationFiltersResponse filters;
    /**
     * The ID of the remediation.
     * 
     */
    private final String id;
    /**
     * The time at which the remediation was last updated.
     * 
     */
    private final String lastUpdatedOn;
    /**
     * The name of the remediation.
     * 
     */
    private final String name;
    /**
     * The resource ID of the policy assignment that should be remediated.
     * 
     */
    private final @Nullable String policyAssignmentId;
    /**
     * The policy definition reference ID of the individual definition that should be remediated. Required when the policy assignment being remediated assigns a policy set definition.
     * 
     */
    private final @Nullable String policyDefinitionReferenceId;
    /**
     * The status of the remediation.
     * 
     */
    private final String provisioningState;
    /**
     * The way resources to remediate are discovered. Defaults to ExistingNonCompliant if not specified.
     * 
     */
    private final @Nullable String resourceDiscoveryMode;
    /**
     * The type of the remediation.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetRemediationAtResourceGroupResult(
        @OutputCustomType.Parameter("createdOn") String createdOn,
        @OutputCustomType.Parameter("deploymentStatus") RemediationDeploymentSummaryResponse deploymentStatus,
        @OutputCustomType.Parameter("filters") @Nullable RemediationFiltersResponse filters,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("lastUpdatedOn") String lastUpdatedOn,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("policyAssignmentId") @Nullable String policyAssignmentId,
        @OutputCustomType.Parameter("policyDefinitionReferenceId") @Nullable String policyDefinitionReferenceId,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("resourceDiscoveryMode") @Nullable String resourceDiscoveryMode,
        @OutputCustomType.Parameter("type") String type) {
        this.createdOn = createdOn;
        this.deploymentStatus = deploymentStatus;
        this.filters = filters;
        this.id = id;
        this.lastUpdatedOn = lastUpdatedOn;
        this.name = name;
        this.policyAssignmentId = policyAssignmentId;
        this.policyDefinitionReferenceId = policyDefinitionReferenceId;
        this.provisioningState = provisioningState;
        this.resourceDiscoveryMode = resourceDiscoveryMode;
        this.type = type;
    }

    /**
     * The time at which the remediation was created.
     * 
    */
    public String getCreatedOn() {
        return this.createdOn;
    }
    /**
     * The deployment status summary for all deployments created by the remediation.
     * 
    */
    public RemediationDeploymentSummaryResponse getDeploymentStatus() {
        return this.deploymentStatus;
    }
    /**
     * The filters that will be applied to determine which resources to remediate.
     * 
    */
    public Optional<RemediationFiltersResponse> getFilters() {
        return Optional.ofNullable(this.filters);
    }
    /**
     * The ID of the remediation.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The time at which the remediation was last updated.
     * 
    */
    public String getLastUpdatedOn() {
        return this.lastUpdatedOn;
    }
    /**
     * The name of the remediation.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The resource ID of the policy assignment that should be remediated.
     * 
    */
    public Optional<String> getPolicyAssignmentId() {
        return Optional.ofNullable(this.policyAssignmentId);
    }
    /**
     * The policy definition reference ID of the individual definition that should be remediated. Required when the policy assignment being remediated assigns a policy set definition.
     * 
    */
    public Optional<String> getPolicyDefinitionReferenceId() {
        return Optional.ofNullable(this.policyDefinitionReferenceId);
    }
    /**
     * The status of the remediation.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The way resources to remediate are discovered. Defaults to ExistingNonCompliant if not specified.
     * 
    */
    public Optional<String> getResourceDiscoveryMode() {
        return Optional.ofNullable(this.resourceDiscoveryMode);
    }
    /**
     * The type of the remediation.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRemediationAtResourceGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdOn;
        private RemediationDeploymentSummaryResponse deploymentStatus;
        private @Nullable RemediationFiltersResponse filters;
        private String id;
        private String lastUpdatedOn;
        private String name;
        private @Nullable String policyAssignmentId;
        private @Nullable String policyDefinitionReferenceId;
        private String provisioningState;
        private @Nullable String resourceDiscoveryMode;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRemediationAtResourceGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdOn = defaults.createdOn;
    	      this.deploymentStatus = defaults.deploymentStatus;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.lastUpdatedOn = defaults.lastUpdatedOn;
    	      this.name = defaults.name;
    	      this.policyAssignmentId = defaults.policyAssignmentId;
    	      this.policyDefinitionReferenceId = defaults.policyDefinitionReferenceId;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceDiscoveryMode = defaults.resourceDiscoveryMode;
    	      this.type = defaults.type;
        }

        public Builder createdOn(String createdOn) {
            this.createdOn = Objects.requireNonNull(createdOn);
            return this;
        }

        public Builder deploymentStatus(RemediationDeploymentSummaryResponse deploymentStatus) {
            this.deploymentStatus = Objects.requireNonNull(deploymentStatus);
            return this;
        }

        public Builder filters(@Nullable RemediationFiltersResponse filters) {
            this.filters = filters;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder lastUpdatedOn(String lastUpdatedOn) {
            this.lastUpdatedOn = Objects.requireNonNull(lastUpdatedOn);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder policyAssignmentId(@Nullable String policyAssignmentId) {
            this.policyAssignmentId = policyAssignmentId;
            return this;
        }

        public Builder policyDefinitionReferenceId(@Nullable String policyDefinitionReferenceId) {
            this.policyDefinitionReferenceId = policyDefinitionReferenceId;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder resourceDiscoveryMode(@Nullable String resourceDiscoveryMode) {
            this.resourceDiscoveryMode = resourceDiscoveryMode;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetRemediationAtResourceGroupResult build() {
            return new GetRemediationAtResourceGroupResult(createdOn, deploymentStatus, filters, id, lastUpdatedOn, name, policyAssignmentId, policyDefinitionReferenceId, provisioningState, resourceDiscoveryMode, type);
        }
    }
}
