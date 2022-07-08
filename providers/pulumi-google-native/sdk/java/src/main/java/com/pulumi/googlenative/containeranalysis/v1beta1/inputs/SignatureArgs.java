// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Verifiers (e.g. Kritis implementations) MUST verify signatures with respect to the trust anchors defined in policy (e.g. a Kritis policy). Typically this means that the verifier has been configured with a map from `public_key_id` to public key material (and any required parameters, e.g. signing algorithm). In particular, verification implementations MUST NOT treat the signature `public_key_id` as anything more than a key lookup hint. The `public_key_id` DOES NOT validate or authenticate a public key; it only provides a mechanism for quickly selecting a public key ALREADY CONFIGURED on the verifier through a trusted channel. Verification implementations MUST reject signatures in any of the following circumstances: * The `public_key_id` is not recognized by the verifier. * The public key that `public_key_id` refers to does not verify the signature with respect to the payload. The `signature` contents SHOULD NOT be &#34;attached&#34; (where the payload is included with the serialized `signature` bytes). Verifiers MUST ignore any &#34;attached&#34; payload and only verify signatures with respect to explicitly provided payload (e.g. a `payload` field on the proto message that holds this Signature, or the canonical serialization of the proto message that holds this signature).
 * 
 */
public final class SignatureArgs extends com.pulumi.resources.ResourceArgs {

    public static final SignatureArgs Empty = new SignatureArgs();

    /**
     * The identifier for the public key that verifies this signature. * The `public_key_id` is required. * The `public_key_id` SHOULD be an RFC3986 conformant URI. * When possible, the `public_key_id` SHOULD be an immutable reference, such as a cryptographic digest. Examples of valid `public_key_id`s: OpenPGP V4 public key fingerprint: * &#34;openpgp4fpr:74FAF3B861BDA0870C7B6DEF607E48D2A663AEEA&#34; See https://www.iana.org/assignments/uri-schemes/prov/openpgp4fpr for more details on this scheme. RFC6920 digest-named SubjectPublicKeyInfo (digest of the DER serialization): * &#34;ni:///sha-256;cD9o9Cq6LG3jD0iKXqEi_vdjJGecm_iXkbqVoScViaU&#34; * &#34;nih:///sha-256;703f68f42aba2c6de30f488a5ea122fef76324679c9bf89791ba95a1271589a5&#34;
     * 
     */
    @Import(name="publicKeyId")
    private @Nullable Output<String> publicKeyId;

    /**
     * @return The identifier for the public key that verifies this signature. * The `public_key_id` is required. * The `public_key_id` SHOULD be an RFC3986 conformant URI. * When possible, the `public_key_id` SHOULD be an immutable reference, such as a cryptographic digest. Examples of valid `public_key_id`s: OpenPGP V4 public key fingerprint: * &#34;openpgp4fpr:74FAF3B861BDA0870C7B6DEF607E48D2A663AEEA&#34; See https://www.iana.org/assignments/uri-schemes/prov/openpgp4fpr for more details on this scheme. RFC6920 digest-named SubjectPublicKeyInfo (digest of the DER serialization): * &#34;ni:///sha-256;cD9o9Cq6LG3jD0iKXqEi_vdjJGecm_iXkbqVoScViaU&#34; * &#34;nih:///sha-256;703f68f42aba2c6de30f488a5ea122fef76324679c9bf89791ba95a1271589a5&#34;
     * 
     */
    public Optional<Output<String>> publicKeyId() {
        return Optional.ofNullable(this.publicKeyId);
    }

    /**
     * The content of the signature, an opaque bytestring. The payload that this signature verifies MUST be unambiguously provided with the Signature during verification. A wrapper message might provide the payload explicitly. Alternatively, a message might have a canonical serialization that can always be unambiguously computed to derive the payload.
     * 
     */
    @Import(name="signature")
    private @Nullable Output<String> signature;

    /**
     * @return The content of the signature, an opaque bytestring. The payload that this signature verifies MUST be unambiguously provided with the Signature during verification. A wrapper message might provide the payload explicitly. Alternatively, a message might have a canonical serialization that can always be unambiguously computed to derive the payload.
     * 
     */
    public Optional<Output<String>> signature() {
        return Optional.ofNullable(this.signature);
    }

    private SignatureArgs() {}

    private SignatureArgs(SignatureArgs $) {
        this.publicKeyId = $.publicKeyId;
        this.signature = $.signature;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SignatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SignatureArgs $;

        public Builder() {
            $ = new SignatureArgs();
        }

        public Builder(SignatureArgs defaults) {
            $ = new SignatureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param publicKeyId The identifier for the public key that verifies this signature. * The `public_key_id` is required. * The `public_key_id` SHOULD be an RFC3986 conformant URI. * When possible, the `public_key_id` SHOULD be an immutable reference, such as a cryptographic digest. Examples of valid `public_key_id`s: OpenPGP V4 public key fingerprint: * &#34;openpgp4fpr:74FAF3B861BDA0870C7B6DEF607E48D2A663AEEA&#34; See https://www.iana.org/assignments/uri-schemes/prov/openpgp4fpr for more details on this scheme. RFC6920 digest-named SubjectPublicKeyInfo (digest of the DER serialization): * &#34;ni:///sha-256;cD9o9Cq6LG3jD0iKXqEi_vdjJGecm_iXkbqVoScViaU&#34; * &#34;nih:///sha-256;703f68f42aba2c6de30f488a5ea122fef76324679c9bf89791ba95a1271589a5&#34;
         * 
         * @return builder
         * 
         */
        public Builder publicKeyId(@Nullable Output<String> publicKeyId) {
            $.publicKeyId = publicKeyId;
            return this;
        }

        /**
         * @param publicKeyId The identifier for the public key that verifies this signature. * The `public_key_id` is required. * The `public_key_id` SHOULD be an RFC3986 conformant URI. * When possible, the `public_key_id` SHOULD be an immutable reference, such as a cryptographic digest. Examples of valid `public_key_id`s: OpenPGP V4 public key fingerprint: * &#34;openpgp4fpr:74FAF3B861BDA0870C7B6DEF607E48D2A663AEEA&#34; See https://www.iana.org/assignments/uri-schemes/prov/openpgp4fpr for more details on this scheme. RFC6920 digest-named SubjectPublicKeyInfo (digest of the DER serialization): * &#34;ni:///sha-256;cD9o9Cq6LG3jD0iKXqEi_vdjJGecm_iXkbqVoScViaU&#34; * &#34;nih:///sha-256;703f68f42aba2c6de30f488a5ea122fef76324679c9bf89791ba95a1271589a5&#34;
         * 
         * @return builder
         * 
         */
        public Builder publicKeyId(String publicKeyId) {
            return publicKeyId(Output.of(publicKeyId));
        }

        /**
         * @param signature The content of the signature, an opaque bytestring. The payload that this signature verifies MUST be unambiguously provided with the Signature during verification. A wrapper message might provide the payload explicitly. Alternatively, a message might have a canonical serialization that can always be unambiguously computed to derive the payload.
         * 
         * @return builder
         * 
         */
        public Builder signature(@Nullable Output<String> signature) {
            $.signature = signature;
            return this;
        }

        /**
         * @param signature The content of the signature, an opaque bytestring. The payload that this signature verifies MUST be unambiguously provided with the Signature during verification. A wrapper message might provide the payload explicitly. Alternatively, a message might have a canonical serialization that can always be unambiguously computed to derive the payload.
         * 
         * @return builder
         * 
         */
        public Builder signature(String signature) {
            return signature(Output.of(signature));
        }

        public SignatureArgs build() {
            return $;
        }
    }

}
