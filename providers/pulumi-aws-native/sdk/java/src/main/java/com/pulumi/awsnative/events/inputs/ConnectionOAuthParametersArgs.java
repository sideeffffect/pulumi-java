// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.events.inputs;

import com.pulumi.awsnative.events.enums.ConnectionOAuthParametersHttpMethod;
import com.pulumi.awsnative.events.inputs.ConnectionClientParametersArgs;
import com.pulumi.awsnative.events.inputs.ConnectionHttpParametersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionOAuthParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionOAuthParametersArgs Empty = new ConnectionOAuthParametersArgs();

    @Import(name="authorizationEndpoint", required=true)
    private Output<String> authorizationEndpoint;

    public Output<String> authorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    @Import(name="clientParameters", required=true)
    private Output<ConnectionClientParametersArgs> clientParameters;

    public Output<ConnectionClientParametersArgs> clientParameters() {
        return this.clientParameters;
    }

    @Import(name="httpMethod", required=true)
    private Output<ConnectionOAuthParametersHttpMethod> httpMethod;

    public Output<ConnectionOAuthParametersHttpMethod> httpMethod() {
        return this.httpMethod;
    }

    @Import(name="oAuthHttpParameters")
    private @Nullable Output<ConnectionHttpParametersArgs> oAuthHttpParameters;

    public Optional<Output<ConnectionHttpParametersArgs>> oAuthHttpParameters() {
        return Optional.ofNullable(this.oAuthHttpParameters);
    }

    private ConnectionOAuthParametersArgs() {}

    private ConnectionOAuthParametersArgs(ConnectionOAuthParametersArgs $) {
        this.authorizationEndpoint = $.authorizationEndpoint;
        this.clientParameters = $.clientParameters;
        this.httpMethod = $.httpMethod;
        this.oAuthHttpParameters = $.oAuthHttpParameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionOAuthParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionOAuthParametersArgs $;

        public Builder() {
            $ = new ConnectionOAuthParametersArgs();
        }

        public Builder(ConnectionOAuthParametersArgs defaults) {
            $ = new ConnectionOAuthParametersArgs(Objects.requireNonNull(defaults));
        }

        public Builder authorizationEndpoint(Output<String> authorizationEndpoint) {
            $.authorizationEndpoint = authorizationEndpoint;
            return this;
        }

        public Builder authorizationEndpoint(String authorizationEndpoint) {
            return authorizationEndpoint(Output.of(authorizationEndpoint));
        }

        public Builder clientParameters(Output<ConnectionClientParametersArgs> clientParameters) {
            $.clientParameters = clientParameters;
            return this;
        }

        public Builder clientParameters(ConnectionClientParametersArgs clientParameters) {
            return clientParameters(Output.of(clientParameters));
        }

        public Builder httpMethod(Output<ConnectionOAuthParametersHttpMethod> httpMethod) {
            $.httpMethod = httpMethod;
            return this;
        }

        public Builder httpMethod(ConnectionOAuthParametersHttpMethod httpMethod) {
            return httpMethod(Output.of(httpMethod));
        }

        public Builder oAuthHttpParameters(@Nullable Output<ConnectionHttpParametersArgs> oAuthHttpParameters) {
            $.oAuthHttpParameters = oAuthHttpParameters;
            return this;
        }

        public Builder oAuthHttpParameters(ConnectionHttpParametersArgs oAuthHttpParameters) {
            return oAuthHttpParameters(Output.of(oAuthHttpParameters));
        }

        public ConnectionOAuthParametersArgs build() {
            $.authorizationEndpoint = Objects.requireNonNull($.authorizationEndpoint, "expected parameter 'authorizationEndpoint' to be non-null");
            $.clientParameters = Objects.requireNonNull($.clientParameters, "expected parameter 'clientParameters' to be non-null");
            $.httpMethod = Objects.requireNonNull($.httpMethod, "expected parameter 'httpMethod' to be non-null");
            return $;
        }
    }

}
