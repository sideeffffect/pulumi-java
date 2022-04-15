// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSds {
    /**
     * The name of the secret for a virtual node's Transport Layer Security (TLS) Secret Discovery Service validation context trust.
     * 
     */
    private final String secretName;

    @CustomType.Constructor
    private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSds(@CustomType.Parameter("secretName") String secretName) {
        this.secretName = secretName;
    }

    /**
     * The name of the secret for a virtual node's Transport Layer Security (TLS) Secret Discovery Service validation context trust.
     * 
    */
    public String secretName() {
        return this.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSds defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String secretName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSds defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretName = defaults.secretName;
        }

        public Builder secretName(String secretName) {
            this.secretName = Objects.requireNonNull(secretName);
            return this;
        }        public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSds build() {
            return new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSds(secretName);
        }
    }
}
