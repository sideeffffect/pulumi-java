// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.PgpSignedAttestationArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Occurrence that represents a single &#34;attestation&#34;. The authenticity of an Attestation can be verified using the attached signature. If the verifier trusts the public key of the signer, then verifying the signature is sufficient to establish trust. In this circumstance, the AttestationAuthority to which this Attestation is attached is primarily useful for look-up (how to find this Attestation if you already know the Authority and artifact to be verified) and intent (which authority was this attestation intended to sign for).
 * 
 */
public final class AttestationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AttestationArgs Empty = new AttestationArgs();

    @Import(name="pgpSignedAttestation")
    private @Nullable Output<PgpSignedAttestationArgs> pgpSignedAttestation;

    public Optional<Output<PgpSignedAttestationArgs>> pgpSignedAttestation() {
        return Optional.ofNullable(this.pgpSignedAttestation);
    }

    private AttestationArgs() {}

    private AttestationArgs(AttestationArgs $) {
        this.pgpSignedAttestation = $.pgpSignedAttestation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AttestationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttestationArgs $;

        public Builder() {
            $ = new AttestationArgs();
        }

        public Builder(AttestationArgs defaults) {
            $ = new AttestationArgs(Objects.requireNonNull(defaults));
        }

        public Builder pgpSignedAttestation(@Nullable Output<PgpSignedAttestationArgs> pgpSignedAttestation) {
            $.pgpSignedAttestation = pgpSignedAttestation;
            return this;
        }

        public Builder pgpSignedAttestation(PgpSignedAttestationArgs pgpSignedAttestation) {
            return pgpSignedAttestation(Output.of(pgpSignedAttestation));
        }

        public AttestationArgs build() {
            return $;
        }
    }

}
