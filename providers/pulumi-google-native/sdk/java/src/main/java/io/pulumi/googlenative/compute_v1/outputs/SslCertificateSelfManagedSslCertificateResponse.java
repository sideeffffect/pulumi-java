// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SslCertificateSelfManagedSslCertificateResponse {
    /**
     * A local certificate file. The certificate must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
     * 
     */
    private final String certificate;
    /**
     * A write-only private key in PEM format. Only insert requests will include this field.
     * 
     */
    private final String privateKey;

    @OutputCustomType.Constructor({"certificate","privateKey"})
    private SslCertificateSelfManagedSslCertificateResponse(
        String certificate,
        String privateKey) {
        this.certificate = certificate;
        this.privateKey = privateKey;
    }

    /**
     * A local certificate file. The certificate must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
     * 
    */
    public String getCertificate() {
        return this.certificate;
    }
    /**
     * A write-only private key in PEM format. Only insert requests will include this field.
     * 
    */
    public String getPrivateKey() {
        return this.privateKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslCertificateSelfManagedSslCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificate;
        private String privateKey;

        public Builder() {
    	      // Empty
        }

        public Builder(SslCertificateSelfManagedSslCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.privateKey = defaults.privateKey;
        }

        public Builder setCertificate(String certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }

        public Builder setPrivateKey(String privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }
        public SslCertificateSelfManagedSslCertificateResponse build() {
            return new SslCertificateSelfManagedSslCertificateResponse(certificate, privateKey);
        }
    }
}
