// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights;

import io.pulumi.azurenative.policyinsights.enums.ComplianceState;
import io.pulumi.azurenative.policyinsights.inputs.AttestationEvidenceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AttestationAtResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AttestationAtResourceArgs Empty = new AttestationAtResourceArgs();

    /**
     * The name of the attestation.
     * 
     */
    @InputImport(name="attestationName")
      private final @Nullable Input<String> attestationName;

    public Input<String> getAttestationName() {
        return this.attestationName == null ? Input.empty() : this.attestationName;
    }

    /**
     * Comments describing why this attestation was created.
     * 
     */
    @InputImport(name="comments")
      private final @Nullable Input<String> comments;

    public Input<String> getComments() {
        return this.comments == null ? Input.empty() : this.comments;
    }

    /**
     * The compliance state that should be set on the resource.
     * 
     */
    @InputImport(name="complianceState")
      private final @Nullable Input<Either<String,ComplianceState>> complianceState;

    public Input<Either<String,ComplianceState>> getComplianceState() {
        return this.complianceState == null ? Input.empty() : this.complianceState;
    }

    /**
     * The evidence supporting the compliance state set in this attestation.
     * 
     */
    @InputImport(name="evidence")
      private final @Nullable Input<List<AttestationEvidenceArgs>> evidence;

    public Input<List<AttestationEvidenceArgs>> getEvidence() {
        return this.evidence == null ? Input.empty() : this.evidence;
    }

    /**
     * The time the compliance state should expire.
     * 
     */
    @InputImport(name="expiresOn")
      private final @Nullable Input<String> expiresOn;

    public Input<String> getExpiresOn() {
        return this.expiresOn == null ? Input.empty() : this.expiresOn;
    }

    /**
     * The person responsible for setting the state of the resource. This value is typically an Azure Active Directory object ID.
     * 
     */
    @InputImport(name="owner")
      private final @Nullable Input<String> owner;

    public Input<String> getOwner() {
        return this.owner == null ? Input.empty() : this.owner;
    }

    /**
     * The resource ID of the policy assignment that the attestation is setting the state for.
     * 
     */
    @InputImport(name="policyAssignmentId", required=true)
      private final Input<String> policyAssignmentId;

    public Input<String> getPolicyAssignmentId() {
        return this.policyAssignmentId;
    }

    /**
     * The policy definition reference ID from a policy set definition that the attestation is setting the state for. If the policy assignment assigns a policy set definition the attestation can choose a definition within the set definition with this property or omit this and set the state for the entire set definition.
     * 
     */
    @InputImport(name="policyDefinitionReferenceId")
      private final @Nullable Input<String> policyDefinitionReferenceId;

    public Input<String> getPolicyDefinitionReferenceId() {
        return this.policyDefinitionReferenceId == null ? Input.empty() : this.policyDefinitionReferenceId;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="resourceId", required=true)
      private final Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId;
    }

    public AttestationAtResourceArgs(
        @Nullable Input<String> attestationName,
        @Nullable Input<String> comments,
        @Nullable Input<Either<String,ComplianceState>> complianceState,
        @Nullable Input<List<AttestationEvidenceArgs>> evidence,
        @Nullable Input<String> expiresOn,
        @Nullable Input<String> owner,
        Input<String> policyAssignmentId,
        @Nullable Input<String> policyDefinitionReferenceId,
        Input<String> resourceId) {
        this.attestationName = attestationName;
        this.comments = comments;
        this.complianceState = complianceState;
        this.evidence = evidence;
        this.expiresOn = expiresOn;
        this.owner = owner;
        this.policyAssignmentId = Objects.requireNonNull(policyAssignmentId, "expected parameter 'policyAssignmentId' to be non-null");
        this.policyDefinitionReferenceId = policyDefinitionReferenceId;
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
    }

    private AttestationAtResourceArgs() {
        this.attestationName = Input.empty();
        this.comments = Input.empty();
        this.complianceState = Input.empty();
        this.evidence = Input.empty();
        this.expiresOn = Input.empty();
        this.owner = Input.empty();
        this.policyAssignmentId = Input.empty();
        this.policyDefinitionReferenceId = Input.empty();
        this.resourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestationAtResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> attestationName;
        private @Nullable Input<String> comments;
        private @Nullable Input<Either<String,ComplianceState>> complianceState;
        private @Nullable Input<List<AttestationEvidenceArgs>> evidence;
        private @Nullable Input<String> expiresOn;
        private @Nullable Input<String> owner;
        private Input<String> policyAssignmentId;
        private @Nullable Input<String> policyDefinitionReferenceId;
        private Input<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestationAtResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestationName = defaults.attestationName;
    	      this.comments = defaults.comments;
    	      this.complianceState = defaults.complianceState;
    	      this.evidence = defaults.evidence;
    	      this.expiresOn = defaults.expiresOn;
    	      this.owner = defaults.owner;
    	      this.policyAssignmentId = defaults.policyAssignmentId;
    	      this.policyDefinitionReferenceId = defaults.policyDefinitionReferenceId;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder attestationName(@Nullable Input<String> attestationName) {
            this.attestationName = attestationName;
            return this;
        }

        public Builder attestationName(@Nullable String attestationName) {
            this.attestationName = Input.ofNullable(attestationName);
            return this;
        }

        public Builder comments(@Nullable Input<String> comments) {
            this.comments = comments;
            return this;
        }

        public Builder comments(@Nullable String comments) {
            this.comments = Input.ofNullable(comments);
            return this;
        }

        public Builder complianceState(@Nullable Input<Either<String,ComplianceState>> complianceState) {
            this.complianceState = complianceState;
            return this;
        }

        public Builder complianceState(@Nullable Either<String,ComplianceState> complianceState) {
            this.complianceState = Input.ofNullable(complianceState);
            return this;
        }

        public Builder evidence(@Nullable Input<List<AttestationEvidenceArgs>> evidence) {
            this.evidence = evidence;
            return this;
        }

        public Builder evidence(@Nullable List<AttestationEvidenceArgs> evidence) {
            this.evidence = Input.ofNullable(evidence);
            return this;
        }

        public Builder expiresOn(@Nullable Input<String> expiresOn) {
            this.expiresOn = expiresOn;
            return this;
        }

        public Builder expiresOn(@Nullable String expiresOn) {
            this.expiresOn = Input.ofNullable(expiresOn);
            return this;
        }

        public Builder owner(@Nullable Input<String> owner) {
            this.owner = owner;
            return this;
        }

        public Builder owner(@Nullable String owner) {
            this.owner = Input.ofNullable(owner);
            return this;
        }

        public Builder policyAssignmentId(Input<String> policyAssignmentId) {
            this.policyAssignmentId = Objects.requireNonNull(policyAssignmentId);
            return this;
        }

        public Builder policyAssignmentId(String policyAssignmentId) {
            this.policyAssignmentId = Input.of(Objects.requireNonNull(policyAssignmentId));
            return this;
        }

        public Builder policyDefinitionReferenceId(@Nullable Input<String> policyDefinitionReferenceId) {
            this.policyDefinitionReferenceId = policyDefinitionReferenceId;
            return this;
        }

        public Builder policyDefinitionReferenceId(@Nullable String policyDefinitionReferenceId) {
            this.policyDefinitionReferenceId = Input.ofNullable(policyDefinitionReferenceId);
            return this;
        }

        public Builder resourceId(Input<String> resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder resourceId(String resourceId) {
            this.resourceId = Input.of(Objects.requireNonNull(resourceId));
            return this;
        }
        public AttestationAtResourceArgs build() {
            return new AttestationAtResourceArgs(attestationName, comments, complianceState, evidence, expiresOn, owner, policyAssignmentId, policyDefinitionReferenceId, resourceId);
        }
    }
}
