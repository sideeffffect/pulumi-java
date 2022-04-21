// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudkms_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Certificate chains needed to verify the attestation. Certificates in chains are PEM-encoded and are ordered based on https://tools.ietf.org/html/rfc5246#section-7.4.2.
 * 
 */
public final class CertificateChainsResponse extends com.pulumi.resources.InvokeArgs {

    public static final CertificateChainsResponse Empty = new CertificateChainsResponse();

    /**
     * Cavium certificate chain corresponding to the attestation.
     * 
     */
    @Import(name="caviumCerts", required=true)
    private List<String> caviumCerts;

    public List<String> caviumCerts() {
        return this.caviumCerts;
    }

    /**
     * Google card certificate chain corresponding to the attestation.
     * 
     */
    @Import(name="googleCardCerts", required=true)
    private List<String> googleCardCerts;

    public List<String> googleCardCerts() {
        return this.googleCardCerts;
    }

    /**
     * Google partition certificate chain corresponding to the attestation.
     * 
     */
    @Import(name="googlePartitionCerts", required=true)
    private List<String> googlePartitionCerts;

    public List<String> googlePartitionCerts() {
        return this.googlePartitionCerts;
    }

    private CertificateChainsResponse() {}

    private CertificateChainsResponse(CertificateChainsResponse $) {
        this.caviumCerts = $.caviumCerts;
        this.googleCardCerts = $.googleCardCerts;
        this.googlePartitionCerts = $.googlePartitionCerts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateChainsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateChainsResponse $;

        public Builder() {
            $ = new CertificateChainsResponse();
        }

        public Builder(CertificateChainsResponse defaults) {
            $ = new CertificateChainsResponse(Objects.requireNonNull(defaults));
        }

        public Builder caviumCerts(List<String> caviumCerts) {
            $.caviumCerts = caviumCerts;
            return this;
        }

        public Builder caviumCerts(String... caviumCerts) {
            return caviumCerts(List.of(caviumCerts));
        }

        public Builder googleCardCerts(List<String> googleCardCerts) {
            $.googleCardCerts = googleCardCerts;
            return this;
        }

        public Builder googleCardCerts(String... googleCardCerts) {
            return googleCardCerts(List.of(googleCardCerts));
        }

        public Builder googlePartitionCerts(List<String> googlePartitionCerts) {
            $.googlePartitionCerts = googlePartitionCerts;
            return this;
        }

        public Builder googlePartitionCerts(String... googlePartitionCerts) {
            return googlePartitionCerts(List.of(googlePartitionCerts));
        }

        public CertificateChainsResponse build() {
            $.caviumCerts = Objects.requireNonNull($.caviumCerts, "expected parameter 'caviumCerts' to be non-null");
            $.googleCardCerts = Objects.requireNonNull($.googleCardCerts, "expected parameter 'googleCardCerts' to be non-null");
            $.googlePartitionCerts = Objects.requireNonNull($.googlePartitionCerts, "expected parameter 'googlePartitionCerts' to be non-null");
            return $;
        }
    }

}
