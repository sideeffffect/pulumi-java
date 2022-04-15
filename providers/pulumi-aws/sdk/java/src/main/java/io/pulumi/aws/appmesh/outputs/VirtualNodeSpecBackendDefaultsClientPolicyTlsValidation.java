// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames;
import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation {
    /**
     * The SANs for a TLS validation context.
     * 
     */
    private final @Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames subjectAlternativeNames;
    /**
     * The TLS validation context trust.
     * 
     */
    private final VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust trust;

    @CustomType.Constructor
    private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation(
        @CustomType.Parameter("subjectAlternativeNames") @Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames subjectAlternativeNames,
        @CustomType.Parameter("trust") VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust trust) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        this.trust = trust;
    }

    /**
     * The SANs for a TLS validation context.
     * 
    */
    public Optional<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames> subjectAlternativeNames() {
        return Optional.ofNullable(this.subjectAlternativeNames);
    }
    /**
     * The TLS validation context trust.
     * 
    */
    public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust trust() {
        return this.trust;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames subjectAlternativeNames;
        private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust trust;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.trust = defaults.trust;
        }

        public Builder subjectAlternativeNames(@Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }
        public Builder trust(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust trust) {
            this.trust = Objects.requireNonNull(trust);
            return this;
        }        public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation build() {
            return new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation(subjectAlternativeNames, trust);
        }
    }
}
