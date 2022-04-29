// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageArgs extends ResourceArgs {

    public static final CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageArgs Empty = new CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageArgs();

    /**
     * The key may be used to sign certificates.
     * 
     */
    @Import(name="certSign")
    private @Nullable Output<Boolean> certSign;

    /**
     * @return The key may be used to sign certificates.
     * 
     */
    public Optional<Output<Boolean>> certSign() {
        return Optional.ofNullable(this.certSign);
    }

    /**
     * The key may be used for cryptographic commitments. Note that this may also be referred to as &#34;non-repudiation&#34;.
     * 
     */
    @Import(name="contentCommitment")
    private @Nullable Output<Boolean> contentCommitment;

    /**
     * @return The key may be used for cryptographic commitments. Note that this may also be referred to as &#34;non-repudiation&#34;.
     * 
     */
    public Optional<Output<Boolean>> contentCommitment() {
        return Optional.ofNullable(this.contentCommitment);
    }

    /**
     * The key may be used sign certificate revocation lists.
     * 
     */
    @Import(name="crlSign")
    private @Nullable Output<Boolean> crlSign;

    /**
     * @return The key may be used sign certificate revocation lists.
     * 
     */
    public Optional<Output<Boolean>> crlSign() {
        return Optional.ofNullable(this.crlSign);
    }

    /**
     * The key may be used to encipher data.
     * 
     */
    @Import(name="dataEncipherment")
    private @Nullable Output<Boolean> dataEncipherment;

    /**
     * @return The key may be used to encipher data.
     * 
     */
    public Optional<Output<Boolean>> dataEncipherment() {
        return Optional.ofNullable(this.dataEncipherment);
    }

    /**
     * The key may be used to decipher only.
     * 
     */
    @Import(name="decipherOnly")
    private @Nullable Output<Boolean> decipherOnly;

    /**
     * @return The key may be used to decipher only.
     * 
     */
    public Optional<Output<Boolean>> decipherOnly() {
        return Optional.ofNullable(this.decipherOnly);
    }

    /**
     * The key may be used for digital signatures.
     * 
     */
    @Import(name="digitalSignature")
    private @Nullable Output<Boolean> digitalSignature;

    /**
     * @return The key may be used for digital signatures.
     * 
     */
    public Optional<Output<Boolean>> digitalSignature() {
        return Optional.ofNullable(this.digitalSignature);
    }

    /**
     * The key may be used to encipher only.
     * 
     */
    @Import(name="encipherOnly")
    private @Nullable Output<Boolean> encipherOnly;

    /**
     * @return The key may be used to encipher only.
     * 
     */
    public Optional<Output<Boolean>> encipherOnly() {
        return Optional.ofNullable(this.encipherOnly);
    }

    /**
     * The key may be used in a key agreement protocol.
     * 
     */
    @Import(name="keyAgreement")
    private @Nullable Output<Boolean> keyAgreement;

    /**
     * @return The key may be used in a key agreement protocol.
     * 
     */
    public Optional<Output<Boolean>> keyAgreement() {
        return Optional.ofNullable(this.keyAgreement);
    }

    /**
     * The key may be used to encipher other keys.
     * 
     */
    @Import(name="keyEncipherment")
    private @Nullable Output<Boolean> keyEncipherment;

    /**
     * @return The key may be used to encipher other keys.
     * 
     */
    public Optional<Output<Boolean>> keyEncipherment() {
        return Optional.ofNullable(this.keyEncipherment);
    }

    private CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageArgs() {}

    private CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageArgs(CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageArgs $) {
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
    public static Builder builder(CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageArgs $;

        public Builder() {
            $ = new CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageArgs();
        }

        public Builder(CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageArgs defaults) {
            $ = new CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certSign The key may be used to sign certificates.
         * 
         * @return builder
         * 
         */
        public Builder certSign(@Nullable Output<Boolean> certSign) {
            $.certSign = certSign;
            return this;
        }

        /**
         * @param certSign The key may be used to sign certificates.
         * 
         * @return builder
         * 
         */
        public Builder certSign(Boolean certSign) {
            return certSign(Output.of(certSign));
        }

        /**
         * @param contentCommitment The key may be used for cryptographic commitments. Note that this may also be referred to as &#34;non-repudiation&#34;.
         * 
         * @return builder
         * 
         */
        public Builder contentCommitment(@Nullable Output<Boolean> contentCommitment) {
            $.contentCommitment = contentCommitment;
            return this;
        }

        /**
         * @param contentCommitment The key may be used for cryptographic commitments. Note that this may also be referred to as &#34;non-repudiation&#34;.
         * 
         * @return builder
         * 
         */
        public Builder contentCommitment(Boolean contentCommitment) {
            return contentCommitment(Output.of(contentCommitment));
        }

        /**
         * @param crlSign The key may be used sign certificate revocation lists.
         * 
         * @return builder
         * 
         */
        public Builder crlSign(@Nullable Output<Boolean> crlSign) {
            $.crlSign = crlSign;
            return this;
        }

        /**
         * @param crlSign The key may be used sign certificate revocation lists.
         * 
         * @return builder
         * 
         */
        public Builder crlSign(Boolean crlSign) {
            return crlSign(Output.of(crlSign));
        }

        /**
         * @param dataEncipherment The key may be used to encipher data.
         * 
         * @return builder
         * 
         */
        public Builder dataEncipherment(@Nullable Output<Boolean> dataEncipherment) {
            $.dataEncipherment = dataEncipherment;
            return this;
        }

        /**
         * @param dataEncipherment The key may be used to encipher data.
         * 
         * @return builder
         * 
         */
        public Builder dataEncipherment(Boolean dataEncipherment) {
            return dataEncipherment(Output.of(dataEncipherment));
        }

        /**
         * @param decipherOnly The key may be used to decipher only.
         * 
         * @return builder
         * 
         */
        public Builder decipherOnly(@Nullable Output<Boolean> decipherOnly) {
            $.decipherOnly = decipherOnly;
            return this;
        }

        /**
         * @param decipherOnly The key may be used to decipher only.
         * 
         * @return builder
         * 
         */
        public Builder decipherOnly(Boolean decipherOnly) {
            return decipherOnly(Output.of(decipherOnly));
        }

        /**
         * @param digitalSignature The key may be used for digital signatures.
         * 
         * @return builder
         * 
         */
        public Builder digitalSignature(@Nullable Output<Boolean> digitalSignature) {
            $.digitalSignature = digitalSignature;
            return this;
        }

        /**
         * @param digitalSignature The key may be used for digital signatures.
         * 
         * @return builder
         * 
         */
        public Builder digitalSignature(Boolean digitalSignature) {
            return digitalSignature(Output.of(digitalSignature));
        }

        /**
         * @param encipherOnly The key may be used to encipher only.
         * 
         * @return builder
         * 
         */
        public Builder encipherOnly(@Nullable Output<Boolean> encipherOnly) {
            $.encipherOnly = encipherOnly;
            return this;
        }

        /**
         * @param encipherOnly The key may be used to encipher only.
         * 
         * @return builder
         * 
         */
        public Builder encipherOnly(Boolean encipherOnly) {
            return encipherOnly(Output.of(encipherOnly));
        }

        /**
         * @param keyAgreement The key may be used in a key agreement protocol.
         * 
         * @return builder
         * 
         */
        public Builder keyAgreement(@Nullable Output<Boolean> keyAgreement) {
            $.keyAgreement = keyAgreement;
            return this;
        }

        /**
         * @param keyAgreement The key may be used in a key agreement protocol.
         * 
         * @return builder
         * 
         */
        public Builder keyAgreement(Boolean keyAgreement) {
            return keyAgreement(Output.of(keyAgreement));
        }

        /**
         * @param keyEncipherment The key may be used to encipher other keys.
         * 
         * @return builder
         * 
         */
        public Builder keyEncipherment(@Nullable Output<Boolean> keyEncipherment) {
            $.keyEncipherment = keyEncipherment;
            return this;
        }

        /**
         * @param keyEncipherment The key may be used to encipher other keys.
         * 
         * @return builder
         * 
         */
        public Builder keyEncipherment(Boolean keyEncipherment) {
            return keyEncipherment(Output.of(keyEncipherment));
        }

        public CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageArgs build() {
            return $;
        }
    }

}
