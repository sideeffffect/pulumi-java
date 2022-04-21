// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.binaryauthorization_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.binaryauthorization_v1beta1.inputs.PkixPublicKeyResponse;
import java.lang.String;
import java.util.Objects;


/**
 * An attestor public key that will be used to verify attestations signed by this attestor.
 * 
 */
public final class AttestorPublicKeyResponse extends com.pulumi.resources.InvokeArgs {

    public static final AttestorPublicKeyResponse Empty = new AttestorPublicKeyResponse();

    /**
     * ASCII-armored representation of a PGP public key, as the entire output by the command `gpg --export --armor foo@example.com` (either LF or CRLF line endings). When using this field, `id` should be left blank. The BinAuthz API handlers will calculate the ID and fill it in automatically. BinAuthz computes this ID as the OpenPGP RFC4880 V4 fingerprint, represented as upper-case hex. If `id` is provided by the caller, it will be overwritten by the API-calculated ID.
     * 
     */
    @Import(name="asciiArmoredPgpPublicKey", required=true)
    private String asciiArmoredPgpPublicKey;

    public String asciiArmoredPgpPublicKey() {
        return this.asciiArmoredPgpPublicKey;
    }

    /**
     * Optional. A descriptive comment. This field may be updated.
     * 
     */
    @Import(name="comment", required=true)
    private String comment;

    public String comment() {
        return this.comment;
    }

    /**
     * A raw PKIX SubjectPublicKeyInfo format public key. NOTE: `id` may be explicitly provided by the caller when using this type of public key, but it MUST be a valid RFC3986 URI. If `id` is left blank, a default one will be computed based on the digest of the DER encoding of the public key.
     * 
     */
    @Import(name="pkixPublicKey", required=true)
    private PkixPublicKeyResponse pkixPublicKey;

    public PkixPublicKeyResponse pkixPublicKey() {
        return this.pkixPublicKey;
    }

    private AttestorPublicKeyResponse() {}

    private AttestorPublicKeyResponse(AttestorPublicKeyResponse $) {
        this.asciiArmoredPgpPublicKey = $.asciiArmoredPgpPublicKey;
        this.comment = $.comment;
        this.pkixPublicKey = $.pkixPublicKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AttestorPublicKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttestorPublicKeyResponse $;

        public Builder() {
            $ = new AttestorPublicKeyResponse();
        }

        public Builder(AttestorPublicKeyResponse defaults) {
            $ = new AttestorPublicKeyResponse(Objects.requireNonNull(defaults));
        }

        public Builder asciiArmoredPgpPublicKey(String asciiArmoredPgpPublicKey) {
            $.asciiArmoredPgpPublicKey = asciiArmoredPgpPublicKey;
            return this;
        }

        public Builder comment(String comment) {
            $.comment = comment;
            return this;
        }

        public Builder pkixPublicKey(PkixPublicKeyResponse pkixPublicKey) {
            $.pkixPublicKey = pkixPublicKey;
            return this;
        }

        public AttestorPublicKeyResponse build() {
            $.asciiArmoredPgpPublicKey = Objects.requireNonNull($.asciiArmoredPgpPublicKey, "expected parameter 'asciiArmoredPgpPublicKey' to be non-null");
            $.comment = Objects.requireNonNull($.comment, "expected parameter 'comment' to be non-null");
            $.pkixPublicKey = Objects.requireNonNull($.pkixPublicKey, "expected parameter 'pkixPublicKey' to be non-null");
            return $;
        }
    }

}
