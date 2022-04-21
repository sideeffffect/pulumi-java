// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.identityplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TenantInboundSamlConfigSpConfigSpCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final TenantInboundSamlConfigSpConfigSpCertificateArgs Empty = new TenantInboundSamlConfigSpConfigSpCertificateArgs();

    /**
     * - 
     * The x509 certificate
     * 
     */
    @Import(name="x509Certificate")
    private @Nullable Output<String> x509Certificate;

    public Optional<Output<String>> x509Certificate() {
        return Optional.ofNullable(this.x509Certificate);
    }

    private TenantInboundSamlConfigSpConfigSpCertificateArgs() {}

    private TenantInboundSamlConfigSpConfigSpCertificateArgs(TenantInboundSamlConfigSpConfigSpCertificateArgs $) {
        this.x509Certificate = $.x509Certificate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TenantInboundSamlConfigSpConfigSpCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TenantInboundSamlConfigSpConfigSpCertificateArgs $;

        public Builder() {
            $ = new TenantInboundSamlConfigSpConfigSpCertificateArgs();
        }

        public Builder(TenantInboundSamlConfigSpConfigSpCertificateArgs defaults) {
            $ = new TenantInboundSamlConfigSpConfigSpCertificateArgs(Objects.requireNonNull(defaults));
        }

        public Builder x509Certificate(@Nullable Output<String> x509Certificate) {
            $.x509Certificate = x509Certificate;
            return this;
        }

        public Builder x509Certificate(String x509Certificate) {
            return x509Certificate(Output.of(x509Certificate));
        }

        public TenantInboundSamlConfigSpConfigSpCertificateArgs build() {
            return $;
        }
    }

}
