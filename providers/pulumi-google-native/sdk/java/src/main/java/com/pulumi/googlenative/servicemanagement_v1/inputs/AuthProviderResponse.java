// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.servicemanagement_v1.inputs.JwtLocationResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Configuration for an authentication provider, including support for [JSON Web Token (JWT)](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32).
 * 
 */
public final class AuthProviderResponse extends com.pulumi.resources.InvokeArgs {

    public static final AuthProviderResponse Empty = new AuthProviderResponse();

    /**
     * The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences will be accepted. When this setting is absent, JWTs with audiences: - "https://[service.name]/[google.protobuf.Api.name]" - "https://[service.name]/" will be accepted. For example, if no audiences are in the setting, LibraryService API will accept JWTs with the following audiences: - https://library-example.googleapis.com/google.example.library.v1.LibraryService - https://library-example.googleapis.com/ Example: audiences: bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
     * 
     */
    @Import(name="audiences", required=true)
      private final String audiences;

    public String audiences() {
        return this.audiences;
    }

    /**
     * Redirect URL if JWT token is required but not present or is expired. Implement authorizationUrl of securityDefinitions in OpenAPI spec.
     * 
     */
    @Import(name="authorizationUrl", required=true)
      private final String authorizationUrl;

    public String authorizationUrl() {
        return this.authorizationUrl;
    }

    /**
     * Identifies the principal that issued the JWT. See https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.1 Usually a URL or an email address. Example: https://securetoken.google.com Example: 1234567-compute@developer.gserviceaccount.com
     * 
     */
    @Import(name="issuer", required=true)
      private final String issuer;

    public String issuer() {
        return this.issuer;
    }

    /**
     * URL of the provider's public key set to validate signature of the JWT. See [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata). Optional if the key set document: - can be retrieved from [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html) of the issuer. - can be inferred from the email domain of the issuer (e.g. a Google service account). Example: https://www.googleapis.com/oauth2/v1/certs
     * 
     */
    @Import(name="jwksUri", required=true)
      private final String jwksUri;

    public String jwksUri() {
        return this.jwksUri;
    }

    /**
     * Defines the locations to extract the JWT. JWT locations can be either from HTTP headers or URL query parameters. The rule is that the first match wins. The checking order is: checking all headers first, then URL query parameters. If not specified, default to use following 3 locations: 1) Authorization: Bearer 2) x-goog-iap-jwt-assertion 3) access_token query parameter Default locations can be specified as followings: jwt_locations: - header: Authorization value_prefix: "Bearer " - header: x-goog-iap-jwt-assertion - query: access_token
     * 
     */
    @Import(name="jwtLocations", required=true)
      private final List<JwtLocationResponse> jwtLocations;

    public List<JwtLocationResponse> jwtLocations() {
        return this.jwtLocations;
    }

    public AuthProviderResponse(
        String audiences,
        String authorizationUrl,
        String issuer,
        String jwksUri,
        List<JwtLocationResponse> jwtLocations) {
        this.audiences = Objects.requireNonNull(audiences, "expected parameter 'audiences' to be non-null");
        this.authorizationUrl = Objects.requireNonNull(authorizationUrl, "expected parameter 'authorizationUrl' to be non-null");
        this.issuer = Objects.requireNonNull(issuer, "expected parameter 'issuer' to be non-null");
        this.jwksUri = Objects.requireNonNull(jwksUri, "expected parameter 'jwksUri' to be non-null");
        this.jwtLocations = Objects.requireNonNull(jwtLocations, "expected parameter 'jwtLocations' to be non-null");
    }

    private AuthProviderResponse() {
        this.audiences = null;
        this.authorizationUrl = null;
        this.issuer = null;
        this.jwksUri = null;
        this.jwtLocations = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthProviderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String audiences;
        private String authorizationUrl;
        private String issuer;
        private String jwksUri;
        private List<JwtLocationResponse> jwtLocations;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthProviderResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audiences = defaults.audiences;
    	      this.authorizationUrl = defaults.authorizationUrl;
    	      this.issuer = defaults.issuer;
    	      this.jwksUri = defaults.jwksUri;
    	      this.jwtLocations = defaults.jwtLocations;
        }

        public Builder audiences(String audiences) {
            this.audiences = Objects.requireNonNull(audiences);
            return this;
        }
        public Builder authorizationUrl(String authorizationUrl) {
            this.authorizationUrl = Objects.requireNonNull(authorizationUrl);
            return this;
        }
        public Builder issuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }
        public Builder jwksUri(String jwksUri) {
            this.jwksUri = Objects.requireNonNull(jwksUri);
            return this;
        }
        public Builder jwtLocations(List<JwtLocationResponse> jwtLocations) {
            this.jwtLocations = Objects.requireNonNull(jwtLocations);
            return this;
        }
        public Builder jwtLocations(JwtLocationResponse... jwtLocations) {
            return jwtLocations(List.of(jwtLocations));
        }        public AuthProviderResponse build() {
            return new AuthProviderResponse(audiences, authorizationUrl, issuer, jwksUri, jwtLocations);
        }
    }
}
