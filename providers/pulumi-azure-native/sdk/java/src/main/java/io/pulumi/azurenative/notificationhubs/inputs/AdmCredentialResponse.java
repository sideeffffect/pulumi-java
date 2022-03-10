// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of a NotificationHub AdmCredential.
 * 
 */
public final class AdmCredentialResponse extends io.pulumi.resources.InvokeArgs {

    public static final AdmCredentialResponse Empty = new AdmCredentialResponse();

    /**
     * The URL of the authorization token.
     * 
     */
    @InputImport(name="authTokenUrl")
      private final @Nullable String authTokenUrl;

    public Optional<String> getAuthTokenUrl() {
        return this.authTokenUrl == null ? Optional.empty() : Optional.ofNullable(this.authTokenUrl);
    }

    /**
     * The client identifier.
     * 
     */
    @InputImport(name="clientId")
      private final @Nullable String clientId;

    public Optional<String> getClientId() {
        return this.clientId == null ? Optional.empty() : Optional.ofNullable(this.clientId);
    }

    /**
     * The credential secret access key.
     * 
     */
    @InputImport(name="clientSecret")
      private final @Nullable String clientSecret;

    public Optional<String> getClientSecret() {
        return this.clientSecret == null ? Optional.empty() : Optional.ofNullable(this.clientSecret);
    }

    public AdmCredentialResponse(
        @Nullable String authTokenUrl,
        @Nullable String clientId,
        @Nullable String clientSecret) {
        this.authTokenUrl = authTokenUrl;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    private AdmCredentialResponse() {
        this.authTokenUrl = null;
        this.clientId = null;
        this.clientSecret = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdmCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authTokenUrl;
        private @Nullable String clientId;
        private @Nullable String clientSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(AdmCredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authTokenUrl = defaults.authTokenUrl;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
        }

        public Builder authTokenUrl(@Nullable String authTokenUrl) {
            this.authTokenUrl = authTokenUrl;
            return this;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public AdmCredentialResponse build() {
            return new AdmCredentialResponse(authTokenUrl, clientId, clientSecret);
        }
    }
}
