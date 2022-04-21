// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigateway_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.apigateway_v1beta.inputs.ApigatewayBackendConfigArgs;
import java.util.Objects;


/**
 * Configuration settings for Gateways.
 * 
 */
public final class ApigatewayGatewayConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApigatewayGatewayConfigArgs Empty = new ApigatewayGatewayConfigArgs();

    /**
     * Backend settings that are applied to all backends of the Gateway.
     * 
     */
    @Import(name="backendConfig", required=true)
    private Output<ApigatewayBackendConfigArgs> backendConfig;

    public Output<ApigatewayBackendConfigArgs> backendConfig() {
        return this.backendConfig;
    }

    private ApigatewayGatewayConfigArgs() {}

    private ApigatewayGatewayConfigArgs(ApigatewayGatewayConfigArgs $) {
        this.backendConfig = $.backendConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApigatewayGatewayConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApigatewayGatewayConfigArgs $;

        public Builder() {
            $ = new ApigatewayGatewayConfigArgs();
        }

        public Builder(ApigatewayGatewayConfigArgs defaults) {
            $ = new ApigatewayGatewayConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder backendConfig(Output<ApigatewayBackendConfigArgs> backendConfig) {
            $.backendConfig = backendConfig;
            return this;
        }

        public Builder backendConfig(ApigatewayBackendConfigArgs backendConfig) {
            return backendConfig(Output.of(backendConfig));
        }

        public ApigatewayGatewayConfigArgs build() {
            $.backendConfig = Objects.requireNonNull($.backendConfig, "expected parameter 'backendConfig' to be non-null");
            return $;
        }
    }

}
