// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class PublishingOptionsResponse {
    /**
     * @return Optional. When true, publishes each CertificateAuthority&#39;s CA certificate and includes its URL in the &#34;Authority Information Access&#34; X.509 extension in all issued Certificates. If this is false, the CA certificate will not be published and the corresponding X.509 extension will not be written in issued certificates.
     * 
     */
    private final Boolean publishCaCert;
    /**
     * @return Optional. When true, publishes each CertificateAuthority&#39;s CRL and includes its URL in the &#34;CRL Distribution Points&#34; X.509 extension in all issued Certificates. If this is false, CRLs will not be published and the corresponding X.509 extension will not be written in issued certificates. CRLs will expire 7 days from their creation. However, we will rebuild daily. CRLs are also rebuilt shortly after a certificate is revoked.
     * 
     */
    private final Boolean publishCrl;

    @CustomType.Constructor
    private PublishingOptionsResponse(
        @CustomType.Parameter("publishCaCert") Boolean publishCaCert,
        @CustomType.Parameter("publishCrl") Boolean publishCrl) {
        this.publishCaCert = publishCaCert;
        this.publishCrl = publishCrl;
    }

    /**
     * @return Optional. When true, publishes each CertificateAuthority&#39;s CA certificate and includes its URL in the &#34;Authority Information Access&#34; X.509 extension in all issued Certificates. If this is false, the CA certificate will not be published and the corresponding X.509 extension will not be written in issued certificates.
     * 
     */
    public Boolean publishCaCert() {
        return this.publishCaCert;
    }
    /**
     * @return Optional. When true, publishes each CertificateAuthority&#39;s CRL and includes its URL in the &#34;CRL Distribution Points&#34; X.509 extension in all issued Certificates. If this is false, CRLs will not be published and the corresponding X.509 extension will not be written in issued certificates. CRLs will expire 7 days from their creation. However, we will rebuild daily. CRLs are also rebuilt shortly after a certificate is revoked.
     * 
     */
    public Boolean publishCrl() {
        return this.publishCrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublishingOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean publishCaCert;
        private Boolean publishCrl;

        public Builder() {
    	      // Empty
        }

        public Builder(PublishingOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publishCaCert = defaults.publishCaCert;
    	      this.publishCrl = defaults.publishCrl;
        }

        public Builder publishCaCert(Boolean publishCaCert) {
            this.publishCaCert = Objects.requireNonNull(publishCaCert);
            return this;
        }
        public Builder publishCrl(Boolean publishCrl) {
            this.publishCrl = Objects.requireNonNull(publishCrl);
            return this;
        }        public PublishingOptionsResponse build() {
            return new PublishingOptionsResponse(publishCaCert, publishCrl);
        }
    }
}
