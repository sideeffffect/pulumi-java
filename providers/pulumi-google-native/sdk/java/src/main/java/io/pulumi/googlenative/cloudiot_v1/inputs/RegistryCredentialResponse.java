// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudiot_v1.inputs.PublicKeyCertificateResponse;
import java.util.Objects;


/**
 * A server-stored registry credential used to validate device credentials.
 * 
 */
public final class RegistryCredentialResponse extends io.pulumi.resources.InvokeArgs {

    public static final RegistryCredentialResponse Empty = new RegistryCredentialResponse();

    /**
     * A public key certificate used to verify the device credentials.
     * 
     */
    @InputImport(name="publicKeyCertificate", required=true)
      private final PublicKeyCertificateResponse publicKeyCertificate;

    public PublicKeyCertificateResponse getPublicKeyCertificate() {
        return this.publicKeyCertificate;
    }

    public RegistryCredentialResponse(PublicKeyCertificateResponse publicKeyCertificate) {
        this.publicKeyCertificate = Objects.requireNonNull(publicKeyCertificate, "expected parameter 'publicKeyCertificate' to be non-null");
    }

    private RegistryCredentialResponse() {
        this.publicKeyCertificate = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PublicKeyCertificateResponse publicKeyCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryCredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeyCertificate = defaults.publicKeyCertificate;
        }

        public Builder publicKeyCertificate(PublicKeyCertificateResponse publicKeyCertificate) {
            this.publicKeyCertificate = Objects.requireNonNull(publicKeyCertificate);
            return this;
        }
        public RegistryCredentialResponse build() {
            return new RegistryCredentialResponse(publicKeyCertificate);
        }
    }
}
