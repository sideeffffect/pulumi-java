// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CertificateCertificatePolicyIssuerParameters {
    /**
     * @return The name of the Certificate Issuer. Possible values include `Self` (for self-signed certificate), or `Unknown` (for a certificate issuing authority like `Let&#39;s Encrypt` and Azure direct supported ones). Changing this forces a new resource to be created.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private CertificateCertificatePolicyIssuerParameters(@CustomType.Parameter("name") String name) {
        this.name = name;
    }

    /**
     * @return The name of the Certificate Issuer. Possible values include `Self` (for self-signed certificate), or `Unknown` (for a certificate issuing authority like `Let&#39;s Encrypt` and Azure direct supported ones). Changing this forces a new resource to be created.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificatePolicyIssuerParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificatePolicyIssuerParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public CertificateCertificatePolicyIssuerParameters build() {
            return new CertificateCertificatePolicyIssuerParameters(name);
        }
    }
}
