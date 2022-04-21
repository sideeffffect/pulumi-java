// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties controlling TLS Certificate Validation.
 * 
 */
public final class BackendTlsPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final BackendTlsPropertiesResponse Empty = new BackendTlsPropertiesResponse();

    /**
     * Flag indicating whether SSL certificate chain validation should be done when using self-signed certificates for this backend host.
     * 
     */
    @Import(name="validateCertificateChain")
    private @Nullable Boolean validateCertificateChain;

    public Optional<Boolean> validateCertificateChain() {
        return Optional.ofNullable(this.validateCertificateChain);
    }

    /**
     * Flag indicating whether SSL certificate name validation should be done when using self-signed certificates for this backend host.
     * 
     */
    @Import(name="validateCertificateName")
    private @Nullable Boolean validateCertificateName;

    public Optional<Boolean> validateCertificateName() {
        return Optional.ofNullable(this.validateCertificateName);
    }

    private BackendTlsPropertiesResponse() {}

    private BackendTlsPropertiesResponse(BackendTlsPropertiesResponse $) {
        this.validateCertificateChain = $.validateCertificateChain;
        this.validateCertificateName = $.validateCertificateName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendTlsPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendTlsPropertiesResponse $;

        public Builder() {
            $ = new BackendTlsPropertiesResponse();
        }

        public Builder(BackendTlsPropertiesResponse defaults) {
            $ = new BackendTlsPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder validateCertificateChain(@Nullable Boolean validateCertificateChain) {
            $.validateCertificateChain = validateCertificateChain;
            return this;
        }

        public Builder validateCertificateName(@Nullable Boolean validateCertificateName) {
            $.validateCertificateName = validateCertificateName;
            return this;
        }

        public BackendTlsPropertiesResponse build() {
            $.validateCertificateChain = Codegen.booleanProp("validateCertificateChain").arg($.validateCertificateChain).def(true).getNullable();
            $.validateCertificateName = Codegen.booleanProp("validateCertificateName").arg($.validateCertificateName).def(true).getNullable();
            return $;
        }
    }

}
