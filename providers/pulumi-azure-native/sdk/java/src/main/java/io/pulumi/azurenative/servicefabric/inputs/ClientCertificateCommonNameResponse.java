// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the client certificate details using common name.
 * 
 */
public final class ClientCertificateCommonNameResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClientCertificateCommonNameResponse Empty = new ClientCertificateCommonNameResponse();

    /**
     * The common name of the client certificate.
     * 
     */
    @InputImport(name="certificateCommonName", required=true)
      private final String certificateCommonName;

    public String getCertificateCommonName() {
        return this.certificateCommonName;
    }

    /**
     * The issuer thumbprint of the client certificate.
     * 
     */
    @InputImport(name="certificateIssuerThumbprint", required=true)
      private final String certificateIssuerThumbprint;

    public String getCertificateIssuerThumbprint() {
        return this.certificateIssuerThumbprint;
    }

    /**
     * Indicates if the client certificate has admin access to the cluster. Non admin clients can perform only read only operations on the cluster.
     * 
     */
    @InputImport(name="isAdmin", required=true)
      private final Boolean isAdmin;

    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    public ClientCertificateCommonNameResponse(
        String certificateCommonName,
        String certificateIssuerThumbprint,
        Boolean isAdmin) {
        this.certificateCommonName = Objects.requireNonNull(certificateCommonName, "expected parameter 'certificateCommonName' to be non-null");
        this.certificateIssuerThumbprint = Objects.requireNonNull(certificateIssuerThumbprint, "expected parameter 'certificateIssuerThumbprint' to be non-null");
        this.isAdmin = Objects.requireNonNull(isAdmin, "expected parameter 'isAdmin' to be non-null");
    }

    private ClientCertificateCommonNameResponse() {
        this.certificateCommonName = null;
        this.certificateIssuerThumbprint = null;
        this.isAdmin = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientCertificateCommonNameResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateCommonName;
        private String certificateIssuerThumbprint;
        private Boolean isAdmin;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientCertificateCommonNameResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateCommonName = defaults.certificateCommonName;
    	      this.certificateIssuerThumbprint = defaults.certificateIssuerThumbprint;
    	      this.isAdmin = defaults.isAdmin;
        }

        public Builder certificateCommonName(String certificateCommonName) {
            this.certificateCommonName = Objects.requireNonNull(certificateCommonName);
            return this;
        }

        public Builder certificateIssuerThumbprint(String certificateIssuerThumbprint) {
            this.certificateIssuerThumbprint = Objects.requireNonNull(certificateIssuerThumbprint);
            return this;
        }

        public Builder isAdmin(Boolean isAdmin) {
            this.isAdmin = Objects.requireNonNull(isAdmin);
            return this;
        }
        public ClientCertificateCommonNameResponse build() {
            return new ClientCertificateCommonNameResponse(certificateCommonName, certificateIssuerThumbprint, isAdmin);
        }
    }
}
