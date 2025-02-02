// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.acmpca.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Structure that contains X.509 ExtendedKeyUsage information.
 * 
 */
public final class CertificateExtendedKeyUsageArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateExtendedKeyUsageArgs Empty = new CertificateExtendedKeyUsageArgs();

    @Import(name="extendedKeyUsageObjectIdentifier")
    private @Nullable Output<String> extendedKeyUsageObjectIdentifier;

    public Optional<Output<String>> extendedKeyUsageObjectIdentifier() {
        return Optional.ofNullable(this.extendedKeyUsageObjectIdentifier);
    }

    @Import(name="extendedKeyUsageType")
    private @Nullable Output<String> extendedKeyUsageType;

    public Optional<Output<String>> extendedKeyUsageType() {
        return Optional.ofNullable(this.extendedKeyUsageType);
    }

    private CertificateExtendedKeyUsageArgs() {}

    private CertificateExtendedKeyUsageArgs(CertificateExtendedKeyUsageArgs $) {
        this.extendedKeyUsageObjectIdentifier = $.extendedKeyUsageObjectIdentifier;
        this.extendedKeyUsageType = $.extendedKeyUsageType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateExtendedKeyUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateExtendedKeyUsageArgs $;

        public Builder() {
            $ = new CertificateExtendedKeyUsageArgs();
        }

        public Builder(CertificateExtendedKeyUsageArgs defaults) {
            $ = new CertificateExtendedKeyUsageArgs(Objects.requireNonNull(defaults));
        }

        public Builder extendedKeyUsageObjectIdentifier(@Nullable Output<String> extendedKeyUsageObjectIdentifier) {
            $.extendedKeyUsageObjectIdentifier = extendedKeyUsageObjectIdentifier;
            return this;
        }

        public Builder extendedKeyUsageObjectIdentifier(String extendedKeyUsageObjectIdentifier) {
            return extendedKeyUsageObjectIdentifier(Output.of(extendedKeyUsageObjectIdentifier));
        }

        public Builder extendedKeyUsageType(@Nullable Output<String> extendedKeyUsageType) {
            $.extendedKeyUsageType = extendedKeyUsageType;
            return this;
        }

        public Builder extendedKeyUsageType(String extendedKeyUsageType) {
            return extendedKeyUsageType(Output.of(extendedKeyUsageType));
        }

        public CertificateExtendedKeyUsageArgs build() {
            return $;
        }
    }

}
