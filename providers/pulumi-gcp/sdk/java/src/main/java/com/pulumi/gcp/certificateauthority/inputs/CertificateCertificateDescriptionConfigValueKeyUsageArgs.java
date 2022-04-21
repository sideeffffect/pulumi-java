// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageArgs;
import com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsageArgs;
import com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionConfigValueKeyUsageArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionConfigValueKeyUsageArgs Empty = new CertificateCertificateDescriptionConfigValueKeyUsageArgs();

    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    @Import(name="baseKeyUsages")
    private @Nullable Output<List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageArgs>> baseKeyUsages;

    public Optional<Output<List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageArgs>>> baseKeyUsages() {
        return Optional.ofNullable(this.baseKeyUsages);
    }

    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    @Import(name="extendedKeyUsages")
    private @Nullable Output<List<CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsageArgs>> extendedKeyUsages;

    public Optional<Output<List<CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsageArgs>>> extendedKeyUsages() {
        return Optional.ofNullable(this.extendedKeyUsages);
    }

    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * Structure is documented below.
     * 
     */
    @Import(name="unknownExtendedKeyUsages")
    private @Nullable Output<List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages;

    public Optional<Output<List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs>>> unknownExtendedKeyUsages() {
        return Optional.ofNullable(this.unknownExtendedKeyUsages);
    }

    private CertificateCertificateDescriptionConfigValueKeyUsageArgs() {}

    private CertificateCertificateDescriptionConfigValueKeyUsageArgs(CertificateCertificateDescriptionConfigValueKeyUsageArgs $) {
        this.baseKeyUsages = $.baseKeyUsages;
        this.extendedKeyUsages = $.extendedKeyUsages;
        this.unknownExtendedKeyUsages = $.unknownExtendedKeyUsages;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateCertificateDescriptionConfigValueKeyUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateCertificateDescriptionConfigValueKeyUsageArgs $;

        public Builder() {
            $ = new CertificateCertificateDescriptionConfigValueKeyUsageArgs();
        }

        public Builder(CertificateCertificateDescriptionConfigValueKeyUsageArgs defaults) {
            $ = new CertificateCertificateDescriptionConfigValueKeyUsageArgs(Objects.requireNonNull(defaults));
        }

        public Builder baseKeyUsages(@Nullable Output<List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageArgs>> baseKeyUsages) {
            $.baseKeyUsages = baseKeyUsages;
            return this;
        }

        public Builder baseKeyUsages(List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageArgs> baseKeyUsages) {
            return baseKeyUsages(Output.of(baseKeyUsages));
        }

        public Builder baseKeyUsages(CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageArgs... baseKeyUsages) {
            return baseKeyUsages(List.of(baseKeyUsages));
        }

        public Builder extendedKeyUsages(@Nullable Output<List<CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsageArgs>> extendedKeyUsages) {
            $.extendedKeyUsages = extendedKeyUsages;
            return this;
        }

        public Builder extendedKeyUsages(List<CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsageArgs> extendedKeyUsages) {
            return extendedKeyUsages(Output.of(extendedKeyUsages));
        }

        public Builder extendedKeyUsages(CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsageArgs... extendedKeyUsages) {
            return extendedKeyUsages(List.of(extendedKeyUsages));
        }

        public Builder unknownExtendedKeyUsages(@Nullable Output<List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages) {
            $.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
            return this;
        }

        public Builder unknownExtendedKeyUsages(List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs> unknownExtendedKeyUsages) {
            return unknownExtendedKeyUsages(Output.of(unknownExtendedKeyUsages));
        }

        public Builder unknownExtendedKeyUsages(CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs... unknownExtendedKeyUsages) {
            return unknownExtendedKeyUsages(List.of(unknownExtendedKeyUsages));
        }

        public CertificateCertificateDescriptionConfigValueKeyUsageArgs build() {
            return $;
        }
    }

}
