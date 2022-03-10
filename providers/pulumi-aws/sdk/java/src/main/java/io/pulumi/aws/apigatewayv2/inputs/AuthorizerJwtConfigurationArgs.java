// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorizerJwtConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorizerJwtConfigurationArgs Empty = new AuthorizerJwtConfigurationArgs();

    /**
     * A list of the intended recipients of the JWT. A valid JWT must provide an aud that matches at least one entry in this list.
     * 
     */
    @InputImport(name="audiences")
      private final @Nullable Input<List<String>> audiences;

    public Input<List<String>> getAudiences() {
        return this.audiences == null ? Input.empty() : this.audiences;
    }

    /**
     * The base domain of the identity provider that issues JSON Web Tokens, such as the `endpoint` attribute of the `aws.cognito.UserPool` resource.
     * 
     */
    @InputImport(name="issuer")
      private final @Nullable Input<String> issuer;

    public Input<String> getIssuer() {
        return this.issuer == null ? Input.empty() : this.issuer;
    }

    public AuthorizerJwtConfigurationArgs(
        @Nullable Input<List<String>> audiences,
        @Nullable Input<String> issuer) {
        this.audiences = audiences;
        this.issuer = issuer;
    }

    private AuthorizerJwtConfigurationArgs() {
        this.audiences = Input.empty();
        this.issuer = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizerJwtConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> audiences;
        private @Nullable Input<String> issuer;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorizerJwtConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audiences = defaults.audiences;
    	      this.issuer = defaults.issuer;
        }

        public Builder audiences(@Nullable Input<List<String>> audiences) {
            this.audiences = audiences;
            return this;
        }

        public Builder audiences(@Nullable List<String> audiences) {
            this.audiences = Input.ofNullable(audiences);
            return this;
        }

        public Builder issuer(@Nullable Input<String> issuer) {
            this.issuer = issuer;
            return this;
        }

        public Builder issuer(@Nullable String issuer) {
            this.issuer = Input.ofNullable(issuer);
            return this;
        }
        public AuthorizerJwtConfigurationArgs build() {
            return new AuthorizerJwtConfigurationArgs(audiences, issuer);
        }
    }
}
