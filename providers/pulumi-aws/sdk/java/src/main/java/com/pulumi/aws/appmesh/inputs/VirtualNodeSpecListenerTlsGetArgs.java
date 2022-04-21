// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsCertificateGetArgs;
import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerTlsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerTlsGetArgs Empty = new VirtualNodeSpecListenerTlsGetArgs();

    /**
     * The listener&#39;s TLS certificate.
     * 
     */
    @Import(name="certificate", required=true)
    private Output<VirtualNodeSpecListenerTlsCertificateGetArgs> certificate;

    public Output<VirtualNodeSpecListenerTlsCertificateGetArgs> certificate() {
        return this.certificate;
    }

    /**
     * The listener&#39;s TLS mode. Valid values: `DISABLED`, `PERMISSIVE`, `STRICT`.
     * 
     */
    @Import(name="mode", required=true)
    private Output<String> mode;

    public Output<String> mode() {
        return this.mode;
    }

    /**
     * The listener&#39;s Transport Layer Security (TLS) validation context.
     * 
     */
    @Import(name="validation")
    private @Nullable Output<VirtualNodeSpecListenerTlsValidationGetArgs> validation;

    public Optional<Output<VirtualNodeSpecListenerTlsValidationGetArgs>> validation() {
        return Optional.ofNullable(this.validation);
    }

    private VirtualNodeSpecListenerTlsGetArgs() {}

    private VirtualNodeSpecListenerTlsGetArgs(VirtualNodeSpecListenerTlsGetArgs $) {
        this.certificate = $.certificate;
        this.mode = $.mode;
        this.validation = $.validation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecListenerTlsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecListenerTlsGetArgs $;

        public Builder() {
            $ = new VirtualNodeSpecListenerTlsGetArgs();
        }

        public Builder(VirtualNodeSpecListenerTlsGetArgs defaults) {
            $ = new VirtualNodeSpecListenerTlsGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder certificate(Output<VirtualNodeSpecListenerTlsCertificateGetArgs> certificate) {
            $.certificate = certificate;
            return this;
        }

        public Builder certificate(VirtualNodeSpecListenerTlsCertificateGetArgs certificate) {
            return certificate(Output.of(certificate));
        }

        public Builder mode(Output<String> mode) {
            $.mode = mode;
            return this;
        }

        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        public Builder validation(@Nullable Output<VirtualNodeSpecListenerTlsValidationGetArgs> validation) {
            $.validation = validation;
            return this;
        }

        public Builder validation(VirtualNodeSpecListenerTlsValidationGetArgs validation) {
            return validation(Output.of(validation));
        }

        public VirtualNodeSpecListenerTlsGetArgs build() {
            $.certificate = Objects.requireNonNull($.certificate, "expected parameter 'certificate' to be non-null");
            $.mode = Objects.requireNonNull($.mode, "expected parameter 'mode' to be non-null");
            return $;
        }
    }

}
