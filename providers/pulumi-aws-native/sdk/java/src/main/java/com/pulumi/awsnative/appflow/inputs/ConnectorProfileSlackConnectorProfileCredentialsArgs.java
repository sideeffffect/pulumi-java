// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.awsnative.appflow.inputs.ConnectorProfileConnectorOAuthRequestArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorProfileSlackConnectorProfileCredentialsArgs extends ResourceArgs {

    public static final ConnectorProfileSlackConnectorProfileCredentialsArgs Empty = new ConnectorProfileSlackConnectorProfileCredentialsArgs();

    /**
     * The credentials used to access protected resources.
     * 
     */
    @Import(name="accessToken")
    private @Nullable Output<String> accessToken;

    /**
     * @return The credentials used to access protected resources.
     * 
     */
    public Optional<Output<String>> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }

    /**
     * The identiﬁer for the desired client.
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    /**
     * @return The identiﬁer for the desired client.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * The client secret used by the oauth client to authenticate to the authorization server.
     * 
     */
    @Import(name="clientSecret", required=true)
    private Output<String> clientSecret;

    /**
     * @return The client secret used by the oauth client to authenticate to the authorization server.
     * 
     */
    public Output<String> clientSecret() {
        return this.clientSecret;
    }

    /**
     * The oauth needed to request security tokens from the connector endpoint.
     * 
     */
    @Import(name="connectorOAuthRequest")
    private @Nullable Output<ConnectorProfileConnectorOAuthRequestArgs> connectorOAuthRequest;

    /**
     * @return The oauth needed to request security tokens from the connector endpoint.
     * 
     */
    public Optional<Output<ConnectorProfileConnectorOAuthRequestArgs>> connectorOAuthRequest() {
        return Optional.ofNullable(this.connectorOAuthRequest);
    }

    private ConnectorProfileSlackConnectorProfileCredentialsArgs() {}

    private ConnectorProfileSlackConnectorProfileCredentialsArgs(ConnectorProfileSlackConnectorProfileCredentialsArgs $) {
        this.accessToken = $.accessToken;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.connectorOAuthRequest = $.connectorOAuthRequest;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorProfileSlackConnectorProfileCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorProfileSlackConnectorProfileCredentialsArgs $;

        public Builder() {
            $ = new ConnectorProfileSlackConnectorProfileCredentialsArgs();
        }

        public Builder(ConnectorProfileSlackConnectorProfileCredentialsArgs defaults) {
            $ = new ConnectorProfileSlackConnectorProfileCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessToken The credentials used to access protected resources.
         * 
         * @return builder
         * 
         */
        public Builder accessToken(@Nullable Output<String> accessToken) {
            $.accessToken = accessToken;
            return this;
        }

        /**
         * @param accessToken The credentials used to access protected resources.
         * 
         * @return builder
         * 
         */
        public Builder accessToken(String accessToken) {
            return accessToken(Output.of(accessToken));
        }

        /**
         * @param clientId The identiﬁer for the desired client.
         * 
         * @return builder
         * 
         */
        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The identiﬁer for the desired client.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret The client secret used by the oauth client to authenticate to the authorization server.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret The client secret used by the oauth client to authenticate to the authorization server.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param connectorOAuthRequest The oauth needed to request security tokens from the connector endpoint.
         * 
         * @return builder
         * 
         */
        public Builder connectorOAuthRequest(@Nullable Output<ConnectorProfileConnectorOAuthRequestArgs> connectorOAuthRequest) {
            $.connectorOAuthRequest = connectorOAuthRequest;
            return this;
        }

        /**
         * @param connectorOAuthRequest The oauth needed to request security tokens from the connector endpoint.
         * 
         * @return builder
         * 
         */
        public Builder connectorOAuthRequest(ConnectorProfileConnectorOAuthRequestArgs connectorOAuthRequest) {
            return connectorOAuthRequest(Output.of(connectorOAuthRequest));
        }

        public ConnectorProfileSlackConnectorProfileCredentialsArgs build() {
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            $.clientSecret = Objects.requireNonNull($.clientSecret, "expected parameter 'clientSecret' to be non-null");
            return $;
        }
    }

}
