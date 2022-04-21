// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesArgs;
import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationTrustArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerTlsValidationArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerTlsValidationArgs Empty = new VirtualNodeSpecListenerTlsValidationArgs();

    /**
     * The SANs for a TLS validation context.
     * 
     */
    @Import(name="subjectAlternativeNames")
    private @Nullable Output<VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesArgs> subjectAlternativeNames;

    public Optional<Output<VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesArgs>> subjectAlternativeNames() {
        return Optional.ofNullable(this.subjectAlternativeNames);
    }

    /**
     * The TLS validation context trust.
     * 
     */
    @Import(name="trust", required=true)
    private Output<VirtualNodeSpecListenerTlsValidationTrustArgs> trust;

    public Output<VirtualNodeSpecListenerTlsValidationTrustArgs> trust() {
        return this.trust;
    }

    private VirtualNodeSpecListenerTlsValidationArgs() {}

    private VirtualNodeSpecListenerTlsValidationArgs(VirtualNodeSpecListenerTlsValidationArgs $) {
        this.subjectAlternativeNames = $.subjectAlternativeNames;
        this.trust = $.trust;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecListenerTlsValidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecListenerTlsValidationArgs $;

        public Builder() {
            $ = new VirtualNodeSpecListenerTlsValidationArgs();
        }

        public Builder(VirtualNodeSpecListenerTlsValidationArgs defaults) {
            $ = new VirtualNodeSpecListenerTlsValidationArgs(Objects.requireNonNull(defaults));
        }

        public Builder subjectAlternativeNames(@Nullable Output<VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesArgs> subjectAlternativeNames) {
            $.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        public Builder subjectAlternativeNames(VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesArgs subjectAlternativeNames) {
            return subjectAlternativeNames(Output.of(subjectAlternativeNames));
        }

        public Builder trust(Output<VirtualNodeSpecListenerTlsValidationTrustArgs> trust) {
            $.trust = trust;
            return this;
        }

        public Builder trust(VirtualNodeSpecListenerTlsValidationTrustArgs trust) {
            return trust(Output.of(trust));
        }

        public VirtualNodeSpecListenerTlsValidationArgs build() {
            $.trust = Objects.requireNonNull($.trust, "expected parameter 'trust' to be non-null");
            return $;
        }
    }

}
