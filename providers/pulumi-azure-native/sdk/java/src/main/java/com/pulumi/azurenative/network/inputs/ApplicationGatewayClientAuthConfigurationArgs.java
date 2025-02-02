// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Application gateway client authentication configuration.
 * 
 */
public final class ApplicationGatewayClientAuthConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayClientAuthConfigurationArgs Empty = new ApplicationGatewayClientAuthConfigurationArgs();

    /**
     * Verify client certificate issuer name on the application gateway.
     * 
     */
    @Import(name="verifyClientCertIssuerDN")
    private @Nullable Output<Boolean> verifyClientCertIssuerDN;

    /**
     * @return Verify client certificate issuer name on the application gateway.
     * 
     */
    public Optional<Output<Boolean>> verifyClientCertIssuerDN() {
        return Optional.ofNullable(this.verifyClientCertIssuerDN);
    }

    private ApplicationGatewayClientAuthConfigurationArgs() {}

    private ApplicationGatewayClientAuthConfigurationArgs(ApplicationGatewayClientAuthConfigurationArgs $) {
        this.verifyClientCertIssuerDN = $.verifyClientCertIssuerDN;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationGatewayClientAuthConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationGatewayClientAuthConfigurationArgs $;

        public Builder() {
            $ = new ApplicationGatewayClientAuthConfigurationArgs();
        }

        public Builder(ApplicationGatewayClientAuthConfigurationArgs defaults) {
            $ = new ApplicationGatewayClientAuthConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param verifyClientCertIssuerDN Verify client certificate issuer name on the application gateway.
         * 
         * @return builder
         * 
         */
        public Builder verifyClientCertIssuerDN(@Nullable Output<Boolean> verifyClientCertIssuerDN) {
            $.verifyClientCertIssuerDN = verifyClientCertIssuerDN;
            return this;
        }

        /**
         * @param verifyClientCertIssuerDN Verify client certificate issuer name on the application gateway.
         * 
         * @return builder
         * 
         */
        public Builder verifyClientCertIssuerDN(Boolean verifyClientCertIssuerDN) {
            return verifyClientCertIssuerDN(Output.of(verifyClientCertIssuerDN));
        }

        public ApplicationGatewayClientAuthConfigurationArgs build() {
            return $;
        }
    }

}
