// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class ConnectorProfileTrendmicroConnectorProfileCredentialsArgs extends ResourceArgs {

    public static final ConnectorProfileTrendmicroConnectorProfileCredentialsArgs Empty = new ConnectorProfileTrendmicroConnectorProfileCredentialsArgs();

    /**
     * The Secret Access Key portion of the credentials.
     * 
     */
    @Import(name="apiSecretKey", required=true)
    private Output<String> apiSecretKey;

    /**
     * @return The Secret Access Key portion of the credentials.
     * 
     */
    public Output<String> apiSecretKey() {
        return this.apiSecretKey;
    }

    private ConnectorProfileTrendmicroConnectorProfileCredentialsArgs() {}

    private ConnectorProfileTrendmicroConnectorProfileCredentialsArgs(ConnectorProfileTrendmicroConnectorProfileCredentialsArgs $) {
        this.apiSecretKey = $.apiSecretKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorProfileTrendmicroConnectorProfileCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorProfileTrendmicroConnectorProfileCredentialsArgs $;

        public Builder() {
            $ = new ConnectorProfileTrendmicroConnectorProfileCredentialsArgs();
        }

        public Builder(ConnectorProfileTrendmicroConnectorProfileCredentialsArgs defaults) {
            $ = new ConnectorProfileTrendmicroConnectorProfileCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiSecretKey The Secret Access Key portion of the credentials.
         * 
         * @return builder
         * 
         */
        public Builder apiSecretKey(Output<String> apiSecretKey) {
            $.apiSecretKey = apiSecretKey;
            return this;
        }

        /**
         * @param apiSecretKey The Secret Access Key portion of the credentials.
         * 
         * @return builder
         * 
         */
        public Builder apiSecretKey(String apiSecretKey) {
            return apiSecretKey(Output.of(apiSecretKey));
        }

        public ConnectorProfileTrendmicroConnectorProfileCredentialsArgs build() {
            $.apiSecretKey = Objects.requireNonNull($.apiSecretKey, "expected parameter 'apiSecretKey' to be non-null");
            return $;
        }
    }

}
