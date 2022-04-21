// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.certificateauthority.inputs.CertificateConfigSubjectConfigSubjectAltNameGetArgs;
import com.pulumi.gcp.certificateauthority.inputs.CertificateConfigSubjectConfigSubjectGetArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateConfigSubjectConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateConfigSubjectConfigGetArgs Empty = new CertificateConfigSubjectConfigGetArgs();

    /**
     * Contains distinguished name fields such as the location and organization.
     * Structure is documented below.
     * 
     */
    @Import(name="subject", required=true)
    private Output<CertificateConfigSubjectConfigSubjectGetArgs> subject;

    public Output<CertificateConfigSubjectConfigSubjectGetArgs> subject() {
        return this.subject;
    }

    /**
     * The subject alternative name fields.
     * Structure is documented below.
     * 
     */
    @Import(name="subjectAltName")
    private @Nullable Output<CertificateConfigSubjectConfigSubjectAltNameGetArgs> subjectAltName;

    public Optional<Output<CertificateConfigSubjectConfigSubjectAltNameGetArgs>> subjectAltName() {
        return Optional.ofNullable(this.subjectAltName);
    }

    private CertificateConfigSubjectConfigGetArgs() {}

    private CertificateConfigSubjectConfigGetArgs(CertificateConfigSubjectConfigGetArgs $) {
        this.subject = $.subject;
        this.subjectAltName = $.subjectAltName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateConfigSubjectConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateConfigSubjectConfigGetArgs $;

        public Builder() {
            $ = new CertificateConfigSubjectConfigGetArgs();
        }

        public Builder(CertificateConfigSubjectConfigGetArgs defaults) {
            $ = new CertificateConfigSubjectConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder subject(Output<CertificateConfigSubjectConfigSubjectGetArgs> subject) {
            $.subject = subject;
            return this;
        }

        public Builder subject(CertificateConfigSubjectConfigSubjectGetArgs subject) {
            return subject(Output.of(subject));
        }

        public Builder subjectAltName(@Nullable Output<CertificateConfigSubjectConfigSubjectAltNameGetArgs> subjectAltName) {
            $.subjectAltName = subjectAltName;
            return this;
        }

        public Builder subjectAltName(CertificateConfigSubjectConfigSubjectAltNameGetArgs subjectAltName) {
            return subjectAltName(Output.of(subjectAltName));
        }

        public CertificateConfigSubjectConfigGetArgs build() {
            $.subject = Objects.requireNonNull($.subject, "expected parameter 'subject' to be non-null");
            return $;
        }
    }

}
