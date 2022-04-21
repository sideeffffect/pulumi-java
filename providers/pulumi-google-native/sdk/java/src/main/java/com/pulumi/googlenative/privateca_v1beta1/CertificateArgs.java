// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.privateca_v1beta1.inputs.CertificateConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateArgs Empty = new CertificateArgs();

    @Import(name="certificateAuthorityId", required=true)
    private Output<String> certificateAuthorityId;

    public Output<String> certificateAuthorityId() {
        return this.certificateAuthorityId;
    }

    @Import(name="certificateId")
    private @Nullable Output<String> certificateId;

    public Optional<Output<String>> certificateId() {
        return Optional.ofNullable(this.certificateId);
    }

    /**
     * Immutable. A description of the certificate and key that does not require X.509 or ASN.1.
     * 
     */
    @Import(name="config")
    private @Nullable Output<CertificateConfigArgs> config;

    public Optional<Output<CertificateConfigArgs>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * Optional. Labels with user-defined metadata.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Immutable. The desired lifetime of a certificate. Used to create the &#34;not_before_time&#34; and &#34;not_after_time&#34; fields inside an X.509 certificate. Note that the lifetime may be truncated if it would extend past the life of any certificate authority in the issuing chain.
     * 
     */
    @Import(name="lifetime", required=true)
    private Output<String> lifetime;

    public Output<String> lifetime() {
        return this.lifetime;
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Immutable. A pem-encoded X.509 certificate signing request (CSR).
     * 
     */
    @Import(name="pemCsr")
    private @Nullable Output<String> pemCsr;

    public Optional<Output<String>> pemCsr() {
        return Optional.ofNullable(this.pemCsr);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    private CertificateArgs() {}

    private CertificateArgs(CertificateArgs $) {
        this.certificateAuthorityId = $.certificateAuthorityId;
        this.certificateId = $.certificateId;
        this.config = $.config;
        this.labels = $.labels;
        this.lifetime = $.lifetime;
        this.location = $.location;
        this.pemCsr = $.pemCsr;
        this.project = $.project;
        this.requestId = $.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateArgs $;

        public Builder() {
            $ = new CertificateArgs();
        }

        public Builder(CertificateArgs defaults) {
            $ = new CertificateArgs(Objects.requireNonNull(defaults));
        }

        public Builder certificateAuthorityId(Output<String> certificateAuthorityId) {
            $.certificateAuthorityId = certificateAuthorityId;
            return this;
        }

        public Builder certificateAuthorityId(String certificateAuthorityId) {
            return certificateAuthorityId(Output.of(certificateAuthorityId));
        }

        public Builder certificateId(@Nullable Output<String> certificateId) {
            $.certificateId = certificateId;
            return this;
        }

        public Builder certificateId(String certificateId) {
            return certificateId(Output.of(certificateId));
        }

        public Builder config(@Nullable Output<CertificateConfigArgs> config) {
            $.config = config;
            return this;
        }

        public Builder config(CertificateConfigArgs config) {
            return config(Output.of(config));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder lifetime(Output<String> lifetime) {
            $.lifetime = lifetime;
            return this;
        }

        public Builder lifetime(String lifetime) {
            return lifetime(Output.of(lifetime));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder pemCsr(@Nullable Output<String> pemCsr) {
            $.pemCsr = pemCsr;
            return this;
        }

        public Builder pemCsr(String pemCsr) {
            return pemCsr(Output.of(pemCsr));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public CertificateArgs build() {
            $.certificateAuthorityId = Objects.requireNonNull($.certificateAuthorityId, "expected parameter 'certificateAuthorityId' to be non-null");
            $.lifetime = Objects.requireNonNull($.lifetime, "expected parameter 'lifetime' to be non-null");
            return $;
        }
    }

}
