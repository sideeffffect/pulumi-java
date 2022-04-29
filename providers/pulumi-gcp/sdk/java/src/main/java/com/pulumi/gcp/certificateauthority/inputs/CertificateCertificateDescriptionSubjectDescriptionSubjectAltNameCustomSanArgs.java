// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectIdArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs extends ResourceArgs {

    public static final CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs Empty = new CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs();

    /**
     * Indicates whether or not this extension is critical (i.e., if the client does not know how to
     * handle this extension, the client should consider this to be an error).
     * 
     */
    @Import(name="critical")
    private @Nullable Output<Boolean> critical;

    /**
     * @return Indicates whether or not this extension is critical (i.e., if the client does not know how to
     * handle this extension, the client should consider this to be an error).
     * 
     */
    public Optional<Output<Boolean>> critical() {
        return Optional.ofNullable(this.critical);
    }

    @Import(name="obectIds")
    private @Nullable Output<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectIdArgs>> obectIds;

    public Optional<Output<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectIdArgs>>> obectIds() {
        return Optional.ofNullable(this.obectIds);
    }

    /**
     * The value of this X.509 extension. A base64-encoded string.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value of this X.509 extension. A base64-encoded string.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs() {}

    private CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs(CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs $) {
        this.critical = $.critical;
        this.obectIds = $.obectIds;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs $;

        public Builder() {
            $ = new CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs();
        }

        public Builder(CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs defaults) {
            $ = new CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param critical Indicates whether or not this extension is critical (i.e., if the client does not know how to
         * handle this extension, the client should consider this to be an error).
         * 
         * @return builder
         * 
         */
        public Builder critical(@Nullable Output<Boolean> critical) {
            $.critical = critical;
            return this;
        }

        /**
         * @param critical Indicates whether or not this extension is critical (i.e., if the client does not know how to
         * handle this extension, the client should consider this to be an error).
         * 
         * @return builder
         * 
         */
        public Builder critical(Boolean critical) {
            return critical(Output.of(critical));
        }

        public Builder obectIds(@Nullable Output<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectIdArgs>> obectIds) {
            $.obectIds = obectIds;
            return this;
        }

        public Builder obectIds(List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectIdArgs> obectIds) {
            return obectIds(Output.of(obectIds));
        }

        public Builder obectIds(CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectIdArgs... obectIds) {
            return obectIds(List.of(obectIds));
        }

        /**
         * @param value The value of this X.509 extension. A base64-encoded string.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of this X.509 extension. A base64-encoded string.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs build() {
            return $;
        }
    }

}
