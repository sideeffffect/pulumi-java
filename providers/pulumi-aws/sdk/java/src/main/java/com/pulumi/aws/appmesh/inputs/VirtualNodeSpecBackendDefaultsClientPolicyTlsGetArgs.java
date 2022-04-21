// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs;
import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs Empty = new VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs();

    /**
     * The listener&#39;s TLS certificate.
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs> certificate;

    public Optional<Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * Whether the policy is enforced. Default is `true`.
     * 
     */
    @Import(name="enforce")
    private @Nullable Output<Boolean> enforce;

    public Optional<Output<Boolean>> enforce() {
        return Optional.ofNullable(this.enforce);
    }

    /**
     * One or more ports that the policy is enforced for.
     * 
     */
    @Import(name="ports")
    private @Nullable Output<List<Integer>> ports;

    public Optional<Output<List<Integer>>> ports() {
        return Optional.ofNullable(this.ports);
    }

    /**
     * The listener&#39;s Transport Layer Security (TLS) validation context.
     * 
     */
    @Import(name="validation", required=true)
    private Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationGetArgs> validation;

    public Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationGetArgs> validation() {
        return this.validation;
    }

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs() {}

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs(VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs $) {
        this.certificate = $.certificate;
        this.enforce = $.enforce;
        this.ports = $.ports;
        this.validation = $.validation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs $;

        public Builder() {
            $ = new VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs();
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs defaults) {
            $ = new VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder certificate(@Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs> certificate) {
            $.certificate = certificate;
            return this;
        }

        public Builder certificate(VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs certificate) {
            return certificate(Output.of(certificate));
        }

        public Builder enforce(@Nullable Output<Boolean> enforce) {
            $.enforce = enforce;
            return this;
        }

        public Builder enforce(Boolean enforce) {
            return enforce(Output.of(enforce));
        }

        public Builder ports(@Nullable Output<List<Integer>> ports) {
            $.ports = ports;
            return this;
        }

        public Builder ports(List<Integer> ports) {
            return ports(Output.of(ports));
        }

        public Builder ports(Integer... ports) {
            return ports(List.of(ports));
        }

        public Builder validation(Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationGetArgs> validation) {
            $.validation = validation;
            return this;
        }

        public Builder validation(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationGetArgs validation) {
            return validation(Output.of(validation));
        }

        public VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs build() {
            $.validation = Objects.requireNonNull($.validation, "expected parameter 'validation' to be non-null");
            return $;
        }
    }

}
