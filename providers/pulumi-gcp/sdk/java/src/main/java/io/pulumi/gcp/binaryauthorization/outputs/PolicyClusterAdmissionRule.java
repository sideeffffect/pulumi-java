// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.binaryauthorization.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class PolicyClusterAdmissionRule {
    /**
     * The identifier for this object. Format specified above.
     * 
     */
    private final String cluster;
    /**
     * The action when a pod creation is denied by the admission rule.
     * Possible values are `ENFORCED_BLOCK_AND_AUDIT_LOG` and `DRYRUN_AUDIT_LOG_ONLY`.
     * 
     */
    private final String enforcementMode;
    /**
     * How this admission rule will be evaluated.
     * Possible values are `ALWAYS_ALLOW`, `REQUIRE_ATTESTATION`, and `ALWAYS_DENY`.
     * 
     */
    private final String evaluationMode;
    /**
     * The resource names of the attestors that must attest to a
     * container image. If the attestor is in a different project from the
     * policy, it should be specified in the format `projects/*{@literal /}attestors/*`.
     * Each attestor must exist before a policy can reference it. To add an
     * attestor to a policy the principal issuing the policy change
     * request must be able to read the attestor resource.
     * Note: this field must be non-empty when the evaluation_mode field
     * specifies REQUIRE_ATTESTATION, otherwise it must be empty.
     * 
     */
    private final @Nullable List<String> requireAttestationsBies;

    @CustomType.Constructor
    private PolicyClusterAdmissionRule(
        @CustomType.Parameter("cluster") String cluster,
        @CustomType.Parameter("enforcementMode") String enforcementMode,
        @CustomType.Parameter("evaluationMode") String evaluationMode,
        @CustomType.Parameter("requireAttestationsBies") @Nullable List<String> requireAttestationsBies) {
        this.cluster = cluster;
        this.enforcementMode = enforcementMode;
        this.evaluationMode = evaluationMode;
        this.requireAttestationsBies = requireAttestationsBies;
    }

    /**
     * The identifier for this object. Format specified above.
     * 
    */
    public String cluster() {
        return this.cluster;
    }
    /**
     * The action when a pod creation is denied by the admission rule.
     * Possible values are `ENFORCED_BLOCK_AND_AUDIT_LOG` and `DRYRUN_AUDIT_LOG_ONLY`.
     * 
    */
    public String enforcementMode() {
        return this.enforcementMode;
    }
    /**
     * How this admission rule will be evaluated.
     * Possible values are `ALWAYS_ALLOW`, `REQUIRE_ATTESTATION`, and `ALWAYS_DENY`.
     * 
    */
    public String evaluationMode() {
        return this.evaluationMode;
    }
    /**
     * The resource names of the attestors that must attest to a
     * container image. If the attestor is in a different project from the
     * policy, it should be specified in the format `projects/*{@literal /}attestors/*`.
     * Each attestor must exist before a policy can reference it. To add an
     * attestor to a policy the principal issuing the policy change
     * request must be able to read the attestor resource.
     * Note: this field must be non-empty when the evaluation_mode field
     * specifies REQUIRE_ATTESTATION, otherwise it must be empty.
     * 
    */
    public List<String> requireAttestationsBies() {
        return this.requireAttestationsBies == null ? List.of() : this.requireAttestationsBies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyClusterAdmissionRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cluster;
        private String enforcementMode;
        private String evaluationMode;
        private @Nullable List<String> requireAttestationsBies;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyClusterAdmissionRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
    	      this.enforcementMode = defaults.enforcementMode;
    	      this.evaluationMode = defaults.evaluationMode;
    	      this.requireAttestationsBies = defaults.requireAttestationsBies;
        }

        public Builder cluster(String cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }
        public Builder enforcementMode(String enforcementMode) {
            this.enforcementMode = Objects.requireNonNull(enforcementMode);
            return this;
        }
        public Builder evaluationMode(String evaluationMode) {
            this.evaluationMode = Objects.requireNonNull(evaluationMode);
            return this;
        }
        public Builder requireAttestationsBies(@Nullable List<String> requireAttestationsBies) {
            this.requireAttestationsBies = requireAttestationsBies;
            return this;
        }
        public Builder requireAttestationsBies(String... requireAttestationsBies) {
            return requireAttestationsBies(List.of(requireAttestationsBies));
        }        public PolicyClusterAdmissionRule build() {
            return new PolicyClusterAdmissionRule(cluster, enforcementMode, evaluationMode, requireAttestationsBies);
        }
    }
}
