// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.privateca_v1beta1.inputs.SubordinateConfigChainResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a subordinate CA's issuers. This is either a resource path to a known issuing CertificateAuthority, or a PEM issuer certificate chain.
 * 
 */
public final class SubordinateConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final SubordinateConfigResponse Empty = new SubordinateConfigResponse();

    /**
     * This can refer to a CertificateAuthority that was used to create a subordinate CertificateAuthority. This field is used for information and usability purposes only. The resource name is in the format `projects/*{@literal /}locations/*{@literal /}certificateAuthorities/*`.
     * 
     */
    @InputImport(name="certificateAuthority", required=true)
      private final String certificateAuthority;

    public String getCertificateAuthority() {
        return this.certificateAuthority;
    }

    /**
     * Contains the PEM certificate chain for the issuers of this CertificateAuthority, but not pem certificate for this CA itself.
     * 
     */
    @InputImport(name="pemIssuerChain", required=true)
      private final SubordinateConfigChainResponse pemIssuerChain;

    public SubordinateConfigChainResponse getPemIssuerChain() {
        return this.pemIssuerChain;
    }

    public SubordinateConfigResponse(
        String certificateAuthority,
        SubordinateConfigChainResponse pemIssuerChain) {
        this.certificateAuthority = Objects.requireNonNull(certificateAuthority, "expected parameter 'certificateAuthority' to be non-null");
        this.pemIssuerChain = Objects.requireNonNull(pemIssuerChain, "expected parameter 'pemIssuerChain' to be non-null");
    }

    private SubordinateConfigResponse() {
        this.certificateAuthority = null;
        this.pemIssuerChain = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubordinateConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateAuthority;
        private SubordinateConfigChainResponse pemIssuerChain;

        public Builder() {
    	      // Empty
        }

        public Builder(SubordinateConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthority = defaults.certificateAuthority;
    	      this.pemIssuerChain = defaults.pemIssuerChain;
        }

        public Builder certificateAuthority(String certificateAuthority) {
            this.certificateAuthority = Objects.requireNonNull(certificateAuthority);
            return this;
        }

        public Builder pemIssuerChain(SubordinateConfigChainResponse pemIssuerChain) {
            this.pemIssuerChain = Objects.requireNonNull(pemIssuerChain);
            return this;
        }
        public SubordinateConfigResponse build() {
            return new SubordinateConfigResponse(certificateAuthority, pemIssuerChain);
        }
    }
}
