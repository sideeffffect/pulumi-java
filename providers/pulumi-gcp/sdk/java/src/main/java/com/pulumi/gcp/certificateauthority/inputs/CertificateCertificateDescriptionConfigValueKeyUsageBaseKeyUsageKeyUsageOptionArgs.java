// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs Empty = new CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs();

    /**
     * The key may be used to sign certificates.
     * 
     */
    @Import(name="certSign")
    private @Nullable Output<Boolean> certSign;

    public Optional<Output<Boolean>> certSign() {
        return Optional.ofNullable(this.certSign);
    }

    /**
     * The key may be used for cryptographic commitments. Note that this may also be referred to as &#34;non-repudiation&#34;.
     * 
     */
    @Import(name="contentCommitment")
    private @Nullable Output<Boolean> contentCommitment;

    public Optional<Output<Boolean>> contentCommitment() {
        return Optional.ofNullable(this.contentCommitment);
    }

    /**
     * The key may be used sign certificate revocation lists.
     * 
     */
    @Import(name="crlSign")
    private @Nullable Output<Boolean> crlSign;

    public Optional<Output<Boolean>> crlSign() {
        return Optional.ofNullable(this.crlSign);
    }

    /**
     * The key may be used to encipher data.
     * 
     */
    @Import(name="dataEncipherment")
    private @Nullable Output<Boolean> dataEncipherment;

    public Optional<Output<Boolean>> dataEncipherment() {
        return Optional.ofNullable(this.dataEncipherment);
    }

    /**
     * The key may be used to decipher only.
     * 
     */
    @Import(name="decipherOnly")
    private @Nullable Output<Boolean> decipherOnly;

    public Optional<Output<Boolean>> decipherOnly() {
        return Optional.ofNullable(this.decipherOnly);
    }

    /**
     * The key may be used for digital signatures.
     * 
     */
    @Import(name="digitalSignature")
    private @Nullable Output<Boolean> digitalSignature;

    public Optional<Output<Boolean>> digitalSignature() {
        return Optional.ofNullable(this.digitalSignature);
    }

    /**
     * The key may be used to encipher only.
     * 
     */
    @Import(name="encipherOnly")
    private @Nullable Output<Boolean> encipherOnly;

    public Optional<Output<Boolean>> encipherOnly() {
        return Optional.ofNullable(this.encipherOnly);
    }

    /**
     * The key may be used in a key agreement protocol.
     * 
     */
    @Import(name="keyAgreement")
    private @Nullable Output<Boolean> keyAgreement;

    public Optional<Output<Boolean>> keyAgreement() {
        return Optional.ofNullable(this.keyAgreement);
    }

    /**
     * The key may be used to encipher other keys.
     * 
     */
    @Import(name="keyEncipherment")
    private @Nullable Output<Boolean> keyEncipherment;

    public Optional<Output<Boolean>> keyEncipherment() {
        return Optional.ofNullable(this.keyEncipherment);
    }

    private CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs() {}

    private CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs(CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs $) {
        this.certSign = $.certSign;
        this.contentCommitment = $.contentCommitment;
        this.crlSign = $.crlSign;
        this.dataEncipherment = $.dataEncipherment;
        this.decipherOnly = $.decipherOnly;
        this.digitalSignature = $.digitalSignature;
        this.encipherOnly = $.encipherOnly;
        this.keyAgreement = $.keyAgreement;
        this.keyEncipherment = $.keyEncipherment;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs $;

        public Builder() {
            $ = new CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs();
        }

        public Builder(CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs defaults) {
            $ = new CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs(Objects.requireNonNull(defaults));
        }

        public Builder certSign(@Nullable Output<Boolean> certSign) {
            $.certSign = certSign;
            return this;
        }

        public Builder certSign(Boolean certSign) {
            return certSign(Output.of(certSign));
        }

        public Builder contentCommitment(@Nullable Output<Boolean> contentCommitment) {
            $.contentCommitment = contentCommitment;
            return this;
        }

        public Builder contentCommitment(Boolean contentCommitment) {
            return contentCommitment(Output.of(contentCommitment));
        }

        public Builder crlSign(@Nullable Output<Boolean> crlSign) {
            $.crlSign = crlSign;
            return this;
        }

        public Builder crlSign(Boolean crlSign) {
            return crlSign(Output.of(crlSign));
        }

        public Builder dataEncipherment(@Nullable Output<Boolean> dataEncipherment) {
            $.dataEncipherment = dataEncipherment;
            return this;
        }

        public Builder dataEncipherment(Boolean dataEncipherment) {
            return dataEncipherment(Output.of(dataEncipherment));
        }

        public Builder decipherOnly(@Nullable Output<Boolean> decipherOnly) {
            $.decipherOnly = decipherOnly;
            return this;
        }

        public Builder decipherOnly(Boolean decipherOnly) {
            return decipherOnly(Output.of(decipherOnly));
        }

        public Builder digitalSignature(@Nullable Output<Boolean> digitalSignature) {
            $.digitalSignature = digitalSignature;
            return this;
        }

        public Builder digitalSignature(Boolean digitalSignature) {
            return digitalSignature(Output.of(digitalSignature));
        }

        public Builder encipherOnly(@Nullable Output<Boolean> encipherOnly) {
            $.encipherOnly = encipherOnly;
            return this;
        }

        public Builder encipherOnly(Boolean encipherOnly) {
            return encipherOnly(Output.of(encipherOnly));
        }

        public Builder keyAgreement(@Nullable Output<Boolean> keyAgreement) {
            $.keyAgreement = keyAgreement;
            return this;
        }

        public Builder keyAgreement(Boolean keyAgreement) {
            return keyAgreement(Output.of(keyAgreement));
        }

        public Builder keyEncipherment(@Nullable Output<Boolean> keyEncipherment) {
            $.keyEncipherment = keyEncipherment;
            return this;
        }

        public Builder keyEncipherment(Boolean keyEncipherment) {
            return keyEncipherment(Output.of(keyEncipherment));
        }

        public CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs build() {
            return $;
        }
    }

}
