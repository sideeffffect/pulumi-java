// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.containeranalysis.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OccurenceAttestationSignatureArgs extends io.pulumi.resources.ResourceArgs {

    public static final OccurenceAttestationSignatureArgs Empty = new OccurenceAttestationSignatureArgs();

    /**
     * The identifier for the public key that verifies this
     * signature. MUST be an RFC3986 conformant
     * URI. * When possible, the key id should be an
     * immutable reference, such as a cryptographic digest.
     * Examples of valid values:
     * * OpenPGP V4 public key fingerprint. See https://www.iana.org/assignments/uri-schemes/prov/openpgp4fpr
     *   for more details on this scheme.
     * * `openpgp4fpr:74FAF3B861BDA0870C7B6DEF607E48D2A663AEEA`
     * * RFC6920 digest-named SubjectPublicKeyInfo (digest of the DER serialization):
     * * "ni:///sha-256;cD9o9Cq6LG3jD0iKXqEi_vdjJGecm_iXkbqVoScViaU"
     * 
     */
    @Import(name="publicKeyId", required=true)
      private final Output<String> publicKeyId;

    public Output<String> publicKeyId() {
        return this.publicKeyId;
    }

    /**
     * The content of the signature, an opaque bytestring.
     * The payload that this signature verifies MUST be
     * unambiguously provided with the Signature during
     * verification. A wrapper message might provide the
     * payload explicitly. Alternatively, a message might
     * have a canonical serialization that can always be
     * unambiguously computed to derive the payload.
     * 
     */
    @Import(name="signature")
      private final @Nullable Output<String> signature;

    public Output<String> signature() {
        return this.signature == null ? Codegen.empty() : this.signature;
    }

    public OccurenceAttestationSignatureArgs(
        Output<String> publicKeyId,
        @Nullable Output<String> signature) {
        this.publicKeyId = Objects.requireNonNull(publicKeyId, "expected parameter 'publicKeyId' to be non-null");
        this.signature = signature;
    }

    private OccurenceAttestationSignatureArgs() {
        this.publicKeyId = Codegen.empty();
        this.signature = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OccurenceAttestationSignatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> publicKeyId;
        private @Nullable Output<String> signature;

        public Builder() {
    	      // Empty
        }

        public Builder(OccurenceAttestationSignatureArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeyId = defaults.publicKeyId;
    	      this.signature = defaults.signature;
        }

        public Builder publicKeyId(Output<String> publicKeyId) {
            this.publicKeyId = Objects.requireNonNull(publicKeyId);
            return this;
        }
        public Builder publicKeyId(String publicKeyId) {
            this.publicKeyId = Output.of(Objects.requireNonNull(publicKeyId));
            return this;
        }
        public Builder signature(@Nullable Output<String> signature) {
            this.signature = signature;
            return this;
        }
        public Builder signature(@Nullable String signature) {
            this.signature = Codegen.ofNullable(signature);
            return this;
        }        public OccurenceAttestationSignatureArgs build() {
            return new OccurenceAttestationSignatureArgs(publicKeyId, signature);
        }
    }
}
