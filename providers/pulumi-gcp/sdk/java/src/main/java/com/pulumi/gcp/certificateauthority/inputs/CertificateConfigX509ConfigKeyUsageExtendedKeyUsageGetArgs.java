// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs Empty = new CertificateConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs();

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.2. Officially described as &#34;TLS WWW client authentication&#34;, though regularly used for non-WWW TLS.
     * 
     */
    @Import(name="clientAuth")
    private @Nullable Output<Boolean> clientAuth;

    public Optional<Output<Boolean>> clientAuth() {
        return Optional.ofNullable(this.clientAuth);
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.3. Officially described as &#34;Signing of downloadable executable code client authentication&#34;.
     * 
     */
    @Import(name="codeSigning")
    private @Nullable Output<Boolean> codeSigning;

    public Optional<Output<Boolean>> codeSigning() {
        return Optional.ofNullable(this.codeSigning);
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.4. Officially described as &#34;Email protection&#34;.
     * 
     */
    @Import(name="emailProtection")
    private @Nullable Output<Boolean> emailProtection;

    public Optional<Output<Boolean>> emailProtection() {
        return Optional.ofNullable(this.emailProtection);
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.9. Officially described as &#34;Signing OCSP responses&#34;.
     * 
     */
    @Import(name="ocspSigning")
    private @Nullable Output<Boolean> ocspSigning;

    public Optional<Output<Boolean>> ocspSigning() {
        return Optional.ofNullable(this.ocspSigning);
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.1. Officially described as &#34;TLS WWW server authentication&#34;, though regularly used for non-WWW TLS.
     * 
     */
    @Import(name="serverAuth")
    private @Nullable Output<Boolean> serverAuth;

    public Optional<Output<Boolean>> serverAuth() {
        return Optional.ofNullable(this.serverAuth);
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.8. Officially described as &#34;Binding the hash of an object to a time&#34;.
     * 
     */
    @Import(name="timeStamping")
    private @Nullable Output<Boolean> timeStamping;

    public Optional<Output<Boolean>> timeStamping() {
        return Optional.ofNullable(this.timeStamping);
    }

    private CertificateConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs() {}

    private CertificateConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs(CertificateConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs $) {
        this.clientAuth = $.clientAuth;
        this.codeSigning = $.codeSigning;
        this.emailProtection = $.emailProtection;
        this.ocspSigning = $.ocspSigning;
        this.serverAuth = $.serverAuth;
        this.timeStamping = $.timeStamping;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs $;

        public Builder() {
            $ = new CertificateConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs();
        }

        public Builder(CertificateConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs defaults) {
            $ = new CertificateConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientAuth(@Nullable Output<Boolean> clientAuth) {
            $.clientAuth = clientAuth;
            return this;
        }

        public Builder clientAuth(Boolean clientAuth) {
            return clientAuth(Output.of(clientAuth));
        }

        public Builder codeSigning(@Nullable Output<Boolean> codeSigning) {
            $.codeSigning = codeSigning;
            return this;
        }

        public Builder codeSigning(Boolean codeSigning) {
            return codeSigning(Output.of(codeSigning));
        }

        public Builder emailProtection(@Nullable Output<Boolean> emailProtection) {
            $.emailProtection = emailProtection;
            return this;
        }

        public Builder emailProtection(Boolean emailProtection) {
            return emailProtection(Output.of(emailProtection));
        }

        public Builder ocspSigning(@Nullable Output<Boolean> ocspSigning) {
            $.ocspSigning = ocspSigning;
            return this;
        }

        public Builder ocspSigning(Boolean ocspSigning) {
            return ocspSigning(Output.of(ocspSigning));
        }

        public Builder serverAuth(@Nullable Output<Boolean> serverAuth) {
            $.serverAuth = serverAuth;
            return this;
        }

        public Builder serverAuth(Boolean serverAuth) {
            return serverAuth(Output.of(serverAuth));
        }

        public Builder timeStamping(@Nullable Output<Boolean> timeStamping) {
            $.timeStamping = timeStamping;
            return this;
        }

        public Builder timeStamping(Boolean timeStamping) {
            return timeStamping(Output.of(timeStamping));
        }

        public CertificateConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs build() {
            return $;
        }
    }

}
