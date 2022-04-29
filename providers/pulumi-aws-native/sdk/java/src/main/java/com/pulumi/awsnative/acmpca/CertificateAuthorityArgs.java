// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.acmpca;

import com.pulumi.awsnative.acmpca.inputs.CertificateAuthorityCsrExtensionsArgs;
import com.pulumi.awsnative.acmpca.inputs.CertificateAuthorityRevocationConfigurationArgs;
import com.pulumi.awsnative.acmpca.inputs.CertificateAuthoritySubjectArgs;
import com.pulumi.awsnative.acmpca.inputs.CertificateAuthorityTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateAuthorityArgs extends ResourceArgs {

    public static final CertificateAuthorityArgs Empty = new CertificateAuthorityArgs();

    /**
     * Structure that contains CSR pass through extension information used by the CreateCertificateAuthority action.
     * 
     */
    @Import(name="csrExtensions")
    private @Nullable Output<CertificateAuthorityCsrExtensionsArgs> csrExtensions;

    /**
     * @return Structure that contains CSR pass through extension information used by the CreateCertificateAuthority action.
     * 
     */
    public Optional<Output<CertificateAuthorityCsrExtensionsArgs>> csrExtensions() {
        return Optional.ofNullable(this.csrExtensions);
    }

    /**
     * Public key algorithm and size, in bits, of the key pair that your CA creates when it issues a certificate.
     * 
     */
    @Import(name="keyAlgorithm", required=true)
    private Output<String> keyAlgorithm;

    /**
     * @return Public key algorithm and size, in bits, of the key pair that your CA creates when it issues a certificate.
     * 
     */
    public Output<String> keyAlgorithm() {
        return this.keyAlgorithm;
    }

    /**
     * KeyStorageSecurityStadard defines a cryptographic key management compliance standard used for handling CA keys.
     * 
     */
    @Import(name="keyStorageSecurityStandard")
    private @Nullable Output<String> keyStorageSecurityStandard;

    /**
     * @return KeyStorageSecurityStadard defines a cryptographic key management compliance standard used for handling CA keys.
     * 
     */
    public Optional<Output<String>> keyStorageSecurityStandard() {
        return Optional.ofNullable(this.keyStorageSecurityStandard);
    }

    /**
     * Certificate revocation information used by the CreateCertificateAuthority and UpdateCertificateAuthority actions.
     * 
     */
    @Import(name="revocationConfiguration")
    private @Nullable Output<CertificateAuthorityRevocationConfigurationArgs> revocationConfiguration;

    /**
     * @return Certificate revocation information used by the CreateCertificateAuthority and UpdateCertificateAuthority actions.
     * 
     */
    public Optional<Output<CertificateAuthorityRevocationConfigurationArgs>> revocationConfiguration() {
        return Optional.ofNullable(this.revocationConfiguration);
    }

    /**
     * Algorithm your CA uses to sign certificate requests.
     * 
     */
    @Import(name="signingAlgorithm", required=true)
    private Output<String> signingAlgorithm;

    /**
     * @return Algorithm your CA uses to sign certificate requests.
     * 
     */
    public Output<String> signingAlgorithm() {
        return this.signingAlgorithm;
    }

    /**
     * Structure that contains X.500 distinguished name information for your CA.
     * 
     */
    @Import(name="subject", required=true)
    private Output<CertificateAuthoritySubjectArgs> subject;

    /**
     * @return Structure that contains X.500 distinguished name information for your CA.
     * 
     */
    public Output<CertificateAuthoritySubjectArgs> subject() {
        return this.subject;
    }

    @Import(name="tags")
    private @Nullable Output<List<CertificateAuthorityTagArgs>> tags;

    public Optional<Output<List<CertificateAuthorityTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The type of the certificate authority.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of the certificate authority.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private CertificateAuthorityArgs() {}

    private CertificateAuthorityArgs(CertificateAuthorityArgs $) {
        this.csrExtensions = $.csrExtensions;
        this.keyAlgorithm = $.keyAlgorithm;
        this.keyStorageSecurityStandard = $.keyStorageSecurityStandard;
        this.revocationConfiguration = $.revocationConfiguration;
        this.signingAlgorithm = $.signingAlgorithm;
        this.subject = $.subject;
        this.tags = $.tags;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateAuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateAuthorityArgs $;

        public Builder() {
            $ = new CertificateAuthorityArgs();
        }

        public Builder(CertificateAuthorityArgs defaults) {
            $ = new CertificateAuthorityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param csrExtensions Structure that contains CSR pass through extension information used by the CreateCertificateAuthority action.
         * 
         * @return builder
         * 
         */
        public Builder csrExtensions(@Nullable Output<CertificateAuthorityCsrExtensionsArgs> csrExtensions) {
            $.csrExtensions = csrExtensions;
            return this;
        }

        /**
         * @param csrExtensions Structure that contains CSR pass through extension information used by the CreateCertificateAuthority action.
         * 
         * @return builder
         * 
         */
        public Builder csrExtensions(CertificateAuthorityCsrExtensionsArgs csrExtensions) {
            return csrExtensions(Output.of(csrExtensions));
        }

        /**
         * @param keyAlgorithm Public key algorithm and size, in bits, of the key pair that your CA creates when it issues a certificate.
         * 
         * @return builder
         * 
         */
        public Builder keyAlgorithm(Output<String> keyAlgorithm) {
            $.keyAlgorithm = keyAlgorithm;
            return this;
        }

        /**
         * @param keyAlgorithm Public key algorithm and size, in bits, of the key pair that your CA creates when it issues a certificate.
         * 
         * @return builder
         * 
         */
        public Builder keyAlgorithm(String keyAlgorithm) {
            return keyAlgorithm(Output.of(keyAlgorithm));
        }

        /**
         * @param keyStorageSecurityStandard KeyStorageSecurityStadard defines a cryptographic key management compliance standard used for handling CA keys.
         * 
         * @return builder
         * 
         */
        public Builder keyStorageSecurityStandard(@Nullable Output<String> keyStorageSecurityStandard) {
            $.keyStorageSecurityStandard = keyStorageSecurityStandard;
            return this;
        }

        /**
         * @param keyStorageSecurityStandard KeyStorageSecurityStadard defines a cryptographic key management compliance standard used for handling CA keys.
         * 
         * @return builder
         * 
         */
        public Builder keyStorageSecurityStandard(String keyStorageSecurityStandard) {
            return keyStorageSecurityStandard(Output.of(keyStorageSecurityStandard));
        }

        /**
         * @param revocationConfiguration Certificate revocation information used by the CreateCertificateAuthority and UpdateCertificateAuthority actions.
         * 
         * @return builder
         * 
         */
        public Builder revocationConfiguration(@Nullable Output<CertificateAuthorityRevocationConfigurationArgs> revocationConfiguration) {
            $.revocationConfiguration = revocationConfiguration;
            return this;
        }

        /**
         * @param revocationConfiguration Certificate revocation information used by the CreateCertificateAuthority and UpdateCertificateAuthority actions.
         * 
         * @return builder
         * 
         */
        public Builder revocationConfiguration(CertificateAuthorityRevocationConfigurationArgs revocationConfiguration) {
            return revocationConfiguration(Output.of(revocationConfiguration));
        }

        /**
         * @param signingAlgorithm Algorithm your CA uses to sign certificate requests.
         * 
         * @return builder
         * 
         */
        public Builder signingAlgorithm(Output<String> signingAlgorithm) {
            $.signingAlgorithm = signingAlgorithm;
            return this;
        }

        /**
         * @param signingAlgorithm Algorithm your CA uses to sign certificate requests.
         * 
         * @return builder
         * 
         */
        public Builder signingAlgorithm(String signingAlgorithm) {
            return signingAlgorithm(Output.of(signingAlgorithm));
        }

        /**
         * @param subject Structure that contains X.500 distinguished name information for your CA.
         * 
         * @return builder
         * 
         */
        public Builder subject(Output<CertificateAuthoritySubjectArgs> subject) {
            $.subject = subject;
            return this;
        }

        /**
         * @param subject Structure that contains X.500 distinguished name information for your CA.
         * 
         * @return builder
         * 
         */
        public Builder subject(CertificateAuthoritySubjectArgs subject) {
            return subject(Output.of(subject));
        }

        public Builder tags(@Nullable Output<List<CertificateAuthorityTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<CertificateAuthorityTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(CertificateAuthorityTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param type The type of the certificate authority.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the certificate authority.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public CertificateAuthorityArgs build() {
            $.keyAlgorithm = Objects.requireNonNull($.keyAlgorithm, "expected parameter 'keyAlgorithm' to be non-null");
            $.signingAlgorithm = Objects.requireNonNull($.signingAlgorithm, "expected parameter 'signingAlgorithm' to be non-null");
            $.subject = Objects.requireNonNull($.subject, "expected parameter 'subject' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
