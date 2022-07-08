// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.certificatemanager.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SelfManagedCertificateResponse {
    /**
     * @return Input only. The PEM-encoded certificate chain. Leaf certificate comes first, followed by intermediate ones if any.
     * 
     */
    private final String pemCertificate;
    /**
     * @return Input only. The PEM-encoded private key of the leaf certificate.
     * 
     */
    private final String pemPrivateKey;

    @CustomType.Constructor
    private SelfManagedCertificateResponse(
        @CustomType.Parameter("pemCertificate") String pemCertificate,
        @CustomType.Parameter("pemPrivateKey") String pemPrivateKey) {
        this.pemCertificate = pemCertificate;
        this.pemPrivateKey = pemPrivateKey;
    }

    /**
     * @return Input only. The PEM-encoded certificate chain. Leaf certificate comes first, followed by intermediate ones if any.
     * 
     */
    public String pemCertificate() {
        return this.pemCertificate;
    }
    /**
     * @return Input only. The PEM-encoded private key of the leaf certificate.
     * 
     */
    public String pemPrivateKey() {
        return this.pemPrivateKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelfManagedCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String pemCertificate;
        private String pemPrivateKey;

        public Builder() {
    	      // Empty
        }

        public Builder(SelfManagedCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pemCertificate = defaults.pemCertificate;
    	      this.pemPrivateKey = defaults.pemPrivateKey;
        }

        public Builder pemCertificate(String pemCertificate) {
            this.pemCertificate = Objects.requireNonNull(pemCertificate);
            return this;
        }
        public Builder pemPrivateKey(String pemPrivateKey) {
            this.pemPrivateKey = Objects.requireNonNull(pemPrivateKey);
            return this;
        }        public SelfManagedCertificateResponse build() {
            return new SelfManagedCertificateResponse(pemCertificate, pemPrivateKey);
        }
    }
}
