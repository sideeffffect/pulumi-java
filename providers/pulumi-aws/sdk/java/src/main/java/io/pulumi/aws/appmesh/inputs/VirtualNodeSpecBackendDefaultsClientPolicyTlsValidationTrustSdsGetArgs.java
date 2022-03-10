// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsGetArgs Empty = new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsGetArgs();

    /**
     * The name of the secret for a virtual node's Transport Layer Security (TLS) Secret Discovery Service validation context trust.
     * 
     */
    @InputImport(name="secretName", required=true)
      private final Input<String> secretName;

    public Input<String> getSecretName() {
        return this.secretName;
    }

    public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsGetArgs(Input<String> secretName) {
        this.secretName = Objects.requireNonNull(secretName, "expected parameter 'secretName' to be non-null");
    }

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsGetArgs() {
        this.secretName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> secretName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretName = defaults.secretName;
        }

        public Builder secretName(Input<String> secretName) {
            this.secretName = Objects.requireNonNull(secretName);
            return this;
        }

        public Builder secretName(String secretName) {
            this.secretName = Input.of(Objects.requireNonNull(secretName));
            return this;
        }
        public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsGetArgs build() {
            return new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsGetArgs(secretName);
        }
    }
}
