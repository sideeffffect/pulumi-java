// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationTrustFileGetArgs;
import com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationTrustSdsGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecListenerTlsValidationTrustGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecListenerTlsValidationTrustGetArgs Empty = new VirtualGatewaySpecListenerTlsValidationTrustGetArgs();

    /**
     * The TLS validation context trust for a local file certificate.
     * 
     */
    @Import(name="file")
    private @Nullable Output<VirtualGatewaySpecListenerTlsValidationTrustFileGetArgs> file;

    public Optional<Output<VirtualGatewaySpecListenerTlsValidationTrustFileGetArgs>> file() {
        return Optional.ofNullable(this.file);
    }

    /**
     * The TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    @Import(name="sds")
    private @Nullable Output<VirtualGatewaySpecListenerTlsValidationTrustSdsGetArgs> sds;

    public Optional<Output<VirtualGatewaySpecListenerTlsValidationTrustSdsGetArgs>> sds() {
        return Optional.ofNullable(this.sds);
    }

    private VirtualGatewaySpecListenerTlsValidationTrustGetArgs() {}

    private VirtualGatewaySpecListenerTlsValidationTrustGetArgs(VirtualGatewaySpecListenerTlsValidationTrustGetArgs $) {
        this.file = $.file;
        this.sds = $.sds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualGatewaySpecListenerTlsValidationTrustGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualGatewaySpecListenerTlsValidationTrustGetArgs $;

        public Builder() {
            $ = new VirtualGatewaySpecListenerTlsValidationTrustGetArgs();
        }

        public Builder(VirtualGatewaySpecListenerTlsValidationTrustGetArgs defaults) {
            $ = new VirtualGatewaySpecListenerTlsValidationTrustGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder file(@Nullable Output<VirtualGatewaySpecListenerTlsValidationTrustFileGetArgs> file) {
            $.file = file;
            return this;
        }

        public Builder file(VirtualGatewaySpecListenerTlsValidationTrustFileGetArgs file) {
            return file(Output.of(file));
        }

        public Builder sds(@Nullable Output<VirtualGatewaySpecListenerTlsValidationTrustSdsGetArgs> sds) {
            $.sds = sds;
            return this;
        }

        public Builder sds(VirtualGatewaySpecListenerTlsValidationTrustSdsGetArgs sds) {
            return sds(Output.of(sds));
        }

        public VirtualGatewaySpecListenerTlsValidationTrustGetArgs build() {
            return $;
        }
    }

}
