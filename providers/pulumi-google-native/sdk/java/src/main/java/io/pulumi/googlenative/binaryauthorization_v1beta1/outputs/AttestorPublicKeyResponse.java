// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.binaryauthorization_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.binaryauthorization_v1beta1.outputs.PkixPublicKeyResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AttestorPublicKeyResponse {
    /**
     * ASCII-armored representation of a PGP public key, as the entire output by the command `gpg --export --armor foo@example.com` (either LF or CRLF line endings). When using this field, `id` should be left blank. The BinAuthz API handlers will calculate the ID and fill it in automatically. BinAuthz computes this ID as the OpenPGP RFC4880 V4 fingerprint, represented as upper-case hex. If `id` is provided by the caller, it will be overwritten by the API-calculated ID.
     * 
     */
    private final String asciiArmoredPgpPublicKey;
    /**
     * Optional. A descriptive comment. This field may be updated.
     * 
     */
    private final String comment;
    /**
     * A raw PKIX SubjectPublicKeyInfo format public key. NOTE: `id` may be explicitly provided by the caller when using this type of public key, but it MUST be a valid RFC3986 URI. If `id` is left blank, a default one will be computed based on the digest of the DER encoding of the public key.
     * 
     */
    private final PkixPublicKeyResponse pkixPublicKey;

    @OutputCustomType.Constructor({"asciiArmoredPgpPublicKey","comment","pkixPublicKey"})
    private AttestorPublicKeyResponse(
        String asciiArmoredPgpPublicKey,
        String comment,
        PkixPublicKeyResponse pkixPublicKey) {
        this.asciiArmoredPgpPublicKey = asciiArmoredPgpPublicKey;
        this.comment = comment;
        this.pkixPublicKey = pkixPublicKey;
    }

    /**
     * ASCII-armored representation of a PGP public key, as the entire output by the command `gpg --export --armor foo@example.com` (either LF or CRLF line endings). When using this field, `id` should be left blank. The BinAuthz API handlers will calculate the ID and fill it in automatically. BinAuthz computes this ID as the OpenPGP RFC4880 V4 fingerprint, represented as upper-case hex. If `id` is provided by the caller, it will be overwritten by the API-calculated ID.
     * 
    */
    public String getAsciiArmoredPgpPublicKey() {
        return this.asciiArmoredPgpPublicKey;
    }
    /**
     * Optional. A descriptive comment. This field may be updated.
     * 
    */
    public String getComment() {
        return this.comment;
    }
    /**
     * A raw PKIX SubjectPublicKeyInfo format public key. NOTE: `id` may be explicitly provided by the caller when using this type of public key, but it MUST be a valid RFC3986 URI. If `id` is left blank, a default one will be computed based on the digest of the DER encoding of the public key.
     * 
    */
    public PkixPublicKeyResponse getPkixPublicKey() {
        return this.pkixPublicKey;
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

        public Builder setAsciiArmoredPgpPublicKey(String asciiArmoredPgpPublicKey) {
            this.asciiArmoredPgpPublicKey = Objects.requireNonNull(asciiArmoredPgpPublicKey);
            return this;
        }

        public Builder setComment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }

        public Builder setPkixPublicKey(PkixPublicKeyResponse pkixPublicKey) {
            this.pkixPublicKey = Objects.requireNonNull(pkixPublicKey);
            return this;
        }
        public AttestorPublicKeyResponse build() {
            return new AttestorPublicKeyResponse(asciiArmoredPgpPublicKey, comment, pkixPublicKey);
        }
    }
}
