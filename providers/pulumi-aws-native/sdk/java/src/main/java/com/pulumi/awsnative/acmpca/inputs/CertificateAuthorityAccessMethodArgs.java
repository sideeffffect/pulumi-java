// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.acmpca.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Structure that contains X.509 AccessMethod information. Assign one and ONLY one field.
 * 
 */
public final class CertificateAuthorityAccessMethodArgs extends ResourceArgs {

    public static final CertificateAuthorityAccessMethodArgs Empty = new CertificateAuthorityAccessMethodArgs();

    @Import(name="accessMethodType")
    private @Nullable Output<String> accessMethodType;

    public Optional<Output<String>> accessMethodType() {
        return Optional.ofNullable(this.accessMethodType);
    }

    @Import(name="customObjectIdentifier")
    private @Nullable Output<String> customObjectIdentifier;

    public Optional<Output<String>> customObjectIdentifier() {
        return Optional.ofNullable(this.customObjectIdentifier);
    }

    private CertificateAuthorityAccessMethodArgs() {}

    private CertificateAuthorityAccessMethodArgs(CertificateAuthorityAccessMethodArgs $) {
        this.accessMethodType = $.accessMethodType;
        this.customObjectIdentifier = $.customObjectIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateAuthorityAccessMethodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateAuthorityAccessMethodArgs $;

        public Builder() {
            $ = new CertificateAuthorityAccessMethodArgs();
        }

        public Builder(CertificateAuthorityAccessMethodArgs defaults) {
            $ = new CertificateAuthorityAccessMethodArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessMethodType(@Nullable Output<String> accessMethodType) {
            $.accessMethodType = accessMethodType;
            return this;
        }

        public Builder accessMethodType(String accessMethodType) {
            return accessMethodType(Output.of(accessMethodType));
        }

        public Builder customObjectIdentifier(@Nullable Output<String> customObjectIdentifier) {
            $.customObjectIdentifier = customObjectIdentifier;
            return this;
        }

        public Builder customObjectIdentifier(String customObjectIdentifier) {
            return customObjectIdentifier(Output.of(customObjectIdentifier));
        }

        public CertificateAuthorityAccessMethodArgs build() {
            return $;
        }
    }

}
