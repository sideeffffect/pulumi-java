// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcm;
import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustFile;
import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustSds;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust {
    /**
     * The TLS validation context trust for an AWS Certificate Manager (ACM) certificate.
     * 
     */
    private final @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcm acm;
    /**
     * The TLS validation context trust for a local file certificate.
     * 
     */
    private final @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustFile file;
    /**
     * The TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    private final @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustSds sds;

    @CustomType.Constructor
    private VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust(
        @CustomType.Parameter("acm") @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcm acm,
        @CustomType.Parameter("file") @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustFile file,
        @CustomType.Parameter("sds") @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustSds sds) {
        this.acm = acm;
        this.file = file;
        this.sds = sds;
    }

    /**
     * The TLS validation context trust for an AWS Certificate Manager (ACM) certificate.
     * 
    */
    public Optional<VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcm> acm() {
        return Optional.ofNullable(this.acm);
    }
    /**
     * The TLS validation context trust for a local file certificate.
     * 
    */
    public Optional<VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustFile> file() {
        return Optional.ofNullable(this.file);
    }
    /**
     * The TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
    */
    public Optional<VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustSds> sds() {
        return Optional.ofNullable(this.sds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcm acm;
        private @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustFile file;
        private @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustSds sds;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acm = defaults.acm;
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        public Builder acm(@Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcm acm) {
            this.acm = acm;
            return this;
        }
        public Builder file(@Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustFile file) {
            this.file = file;
            return this;
        }
        public Builder sds(@Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustSds sds) {
            this.sds = sds;
            return this;
        }        public VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust build() {
            return new VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust(acm, file, sds);
        }
    }
}
