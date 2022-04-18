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
      private final String asciiArmoredPgpPublicKey;

    public String asciiArmoredPgpPublicKey() {
        return this.asciiArmoredPgpPublicKey;
    }

    /**
     * Optional. A descriptive comment. This field may be updated.
     * 
     */
    @Import(name="comment", required=true)
      private final String comment;

    public String comment() {
        return this.comment;
    }

    /**
     * A raw PKIX SubjectPublicKeyInfo format public key. NOTE: `id` may be explicitly provided by the caller when using this type of public key, but it MUST be a valid RFC3986 URI. If `id` is left blank, a default one will be computed based on the digest of the DER encoding of the public key.
     * 
     */
    @Import(name="pkixPublicKey", required=true)
      private final PkixPublicKeyResponse pkixPublicKey;

    public PkixPublicKeyResponse pkixPublicKey() {
        return this.pkixPublicKey;
    }

    public AttestorPublicKeyResponse(
        String asciiArmoredPgpPublicKey,
        String comment,
        PkixPublicKeyResponse pkixPublicKey) {
        this.asciiArmoredPgpPublicKey = Objects.requireNonNull(asciiArmoredPgpPublicKey, "expected parameter 'asciiArmoredPgpPublicKey' to be non-null");
        this.comment = Objects.requireNonNull(comment, "expected parameter 'comment' to be non-null");
        this.pkixPublicKey = Objects.requireNonNull(pkixPublicKey, "expected parameter 'pkixPublicKey' to be non-null");
    }

    private AttestorPublicKeyResponse() {
        this.asciiArmoredPgpPublicKey = null;
        this.comment = null;
        this.pkixPublicKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestorPublicKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String asciiArmoredPgpPublicKey;
        private String comment;
        private PkixPublicKeyResponse pkixPublicKey;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestorPublicKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asciiArmoredPgpPublicKey = defaults.asciiArmoredPgpPublicKey;
    	      this.comment = defaults.comment;
    	      this.pkixPublicKey = defaults.pkixPublicKey;
        }

        public Builder asciiArmoredPgpPublicKey(String asciiArmoredPgpPublicKey) {
            this.asciiArmoredPgpPublicKey = Objects.requireNonNull(asciiArmoredPgpPublicKey);
            return this;
        }
        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        public Builder pkixPublicKey(PkixPublicKeyResponse pkixPublicKey) {
            this.pkixPublicKey = Objects.requireNonNull(pkixPublicKey);
            return this;
        }        public AttestorPublicKeyResponse build() {
            return new AttestorPublicKeyResponse(asciiArmoredPgpPublicKey, comment, pkixPublicKey);
        }
    }
}
