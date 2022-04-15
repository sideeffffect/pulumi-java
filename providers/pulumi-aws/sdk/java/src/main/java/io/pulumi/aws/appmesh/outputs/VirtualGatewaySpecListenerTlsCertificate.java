// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecListenerTlsCertificateAcm;
import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecListenerTlsCertificateFile;
import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecListenerTlsCertificateSds;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualGatewaySpecListenerTlsCertificate {
    /**
     * An AWS Certificate Manager (ACM) certificate.
     * 
     */
    private final @Nullable VirtualGatewaySpecListenerTlsCertificateAcm acm;
    /**
     * A local file certificate.
     * 
     */
    private final @Nullable VirtualGatewaySpecListenerTlsCertificateFile file;
    /**
     * A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    private final @Nullable VirtualGatewaySpecListenerTlsCertificateSds sds;

    @CustomType.Constructor
    private VirtualGatewaySpecListenerTlsCertificate(
        @CustomType.Parameter("acm") @Nullable VirtualGatewaySpecListenerTlsCertificateAcm acm,
        @CustomType.Parameter("file") @Nullable VirtualGatewaySpecListenerTlsCertificateFile file,
        @CustomType.Parameter("sds") @Nullable VirtualGatewaySpecListenerTlsCertificateSds sds) {
        this.acm = acm;
        this.file = file;
        this.sds = sds;
    }

    /**
     * An AWS Certificate Manager (ACM) certificate.
     * 
    */
    public Optional<VirtualGatewaySpecListenerTlsCertificateAcm> acm() {
        return Optional.ofNullable(this.acm);
    }
    /**
     * A local file certificate.
     * 
    */
    public Optional<VirtualGatewaySpecListenerTlsCertificateFile> file() {
        return Optional.ofNullable(this.file);
    }
    /**
     * A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
    */
    public Optional<VirtualGatewaySpecListenerTlsCertificateSds> sds() {
        return Optional.ofNullable(this.sds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerTlsCertificate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualGatewaySpecListenerTlsCertificateAcm acm;
        private @Nullable VirtualGatewaySpecListenerTlsCertificateFile file;
        private @Nullable VirtualGatewaySpecListenerTlsCertificateSds sds;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerTlsCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acm = defaults.acm;
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        public Builder acm(@Nullable VirtualGatewaySpecListenerTlsCertificateAcm acm) {
            this.acm = acm;
            return this;
        }
        public Builder file(@Nullable VirtualGatewaySpecListenerTlsCertificateFile file) {
            this.file = file;
            return this;
        }
        public Builder sds(@Nullable VirtualGatewaySpecListenerTlsCertificateSds sds) {
            this.sds = sds;
            return this;
        }        public VirtualGatewaySpecListenerTlsCertificate build() {
            return new VirtualGatewaySpecListenerTlsCertificate(acm, file, sds);
        }
    }
}
