// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.awsnative.appflow.inputs.ConnectorProfileConnectorOAuthRequestArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsPropertiesArgs Empty = new ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsPropertiesArgs();

    @Import(name="accessToken")
    private @Nullable Output<String> accessToken;

    public Optional<Output<String>> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }

    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    @Import(name="clientSecret")
    private @Nullable Output<String> clientSecret;

    public Optional<Output<String>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    @Import(name="connectorOAuthRequest")
    private @Nullable Output<ConnectorProfileConnectorOAuthRequestArgs> connectorOAuthRequest;

    public Optional<Output<ConnectorProfileConnectorOAuthRequestArgs>> connectorOAuthRequest() {
        return Optional.ofNullable(this.connectorOAuthRequest);
    }

    @Import(name="refreshToken")
    private @Nullable Output<String> refreshToken;

    public Optional<Output<String>> refreshToken() {
        return Optional.ofNullable(this.refreshToken);
    }

    private ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsPropertiesArgs() {}

    private ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsPropertiesArgs(ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsPropertiesArgs $) {
        this.accessToken = $.accessToken;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.connectorOAuthRequest = $.connectorOAuthRequest;
        this.refreshToken = $.refreshToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsPropertiesArgs $;

        public Builder() {
            $ = new ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsPropertiesArgs();
        }

        public Builder(ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsPropertiesArgs defaults) {
            $ = new ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessToken(@Nullable Output<String> accessToken) {
            $.accessToken = accessToken;
            return this;
        }

        public Builder accessToken(String accessToken) {
            return accessToken(Output.of(accessToken));
        }

        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        public Builder connectorOAuthRequest(@Nullable Output<ConnectorProfileConnectorOAuthRequestArgs> connectorOAuthRequest) {
            $.connectorOAuthRequest = connectorOAuthRequest;
            return this;
        }

        public Builder connectorOAuthRequest(ConnectorProfileConnectorOAuthRequestArgs connectorOAuthRequest) {
            return connectorOAuthRequest(Output.of(connectorOAuthRequest));
        }

        public Builder refreshToken(@Nullable Output<String> refreshToken) {
            $.refreshToken = refreshToken;
            return this;
        }

        public Builder refreshToken(String refreshToken) {
            return refreshToken(Output.of(refreshToken));
        }

        public ConnectorProfileSAPODataConnectorProfileCredentialsOAuthCredentialsPropertiesArgs build() {
            return $;
        }
    }

}
