// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetKMSCryptoKeyVersionPublicKey extends com.pulumi.resources.InvokeArgs {

    public static final GetKMSCryptoKeyVersionPublicKey Empty = new GetKMSCryptoKeyVersionPublicKey();

    /**
     * The CryptoKeyVersionAlgorithm that this CryptoKeyVersion supports.
     * 
     */
    @Import(name="algorithm", required=true)
    private String algorithm;

    public String algorithm() {
        return this.algorithm;
    }

    /**
     * The public key, encoded in PEM format. For more information, see the RFC 7468 sections for General Considerations and Textual Encoding of Subject Public Key Info.
     * 
     */
    @Import(name="pem", required=true)
    private String pem;

    public String pem() {
        return this.pem;
    }

    private GetKMSCryptoKeyVersionPublicKey() {}

    private GetKMSCryptoKeyVersionPublicKey(GetKMSCryptoKeyVersionPublicKey $) {
        this.algorithm = $.algorithm;
        this.pem = $.pem;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKMSCryptoKeyVersionPublicKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKMSCryptoKeyVersionPublicKey $;

        public Builder() {
            $ = new GetKMSCryptoKeyVersionPublicKey();
        }

        public Builder(GetKMSCryptoKeyVersionPublicKey defaults) {
            $ = new GetKMSCryptoKeyVersionPublicKey(Objects.requireNonNull(defaults));
        }

        public Builder algorithm(String algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        public Builder pem(String pem) {
            $.pem = pem;
            return this;
        }

        public GetKMSCryptoKeyVersionPublicKey build() {
            $.algorithm = Objects.requireNonNull($.algorithm, "expected parameter 'algorithm' to be non-null");
            $.pem = Objects.requireNonNull($.pem, "expected parameter 'pem' to be non-null");
            return $;
        }
    }

}
