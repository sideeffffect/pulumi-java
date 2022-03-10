// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.pinpoint.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApnsVoipSandboxChannelState extends io.pulumi.resources.ResourceArgs {

    public static final ApnsVoipSandboxChannelState Empty = new ApnsVoipSandboxChannelState();

    /**
     * The application ID.
     * 
     */
    @InputImport(name="applicationId")
      private final @Nullable Input<String> applicationId;

    public Input<String> getApplicationId() {
        return this.applicationId == null ? Input.empty() : this.applicationId;
    }

    /**
     * The ID assigned to your iOS app. To find this value, choose Certificates, IDs & Profiles, choose App IDs in the Identifiers section, and choose your app.
     * 
     */
    @InputImport(name="bundleId")
      private final @Nullable Input<String> bundleId;

    public Input<String> getBundleId() {
        return this.bundleId == null ? Input.empty() : this.bundleId;
    }

    /**
     * The pem encoded TLS Certificate from Apple.
     * 
     */
    @InputImport(name="certificate")
      private final @Nullable Input<String> certificate;

    public Input<String> getCertificate() {
        return this.certificate == null ? Input.empty() : this.certificate;
    }

    /**
     * The default authentication method used for APNs.
     * __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
     * You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
     * If your default authentication type fails, Amazon Pinpoint doesn't attempt to use the other authentication type.
     * 
     */
    @InputImport(name="defaultAuthenticationMethod")
      private final @Nullable Input<String> defaultAuthenticationMethod;

    public Input<String> getDefaultAuthenticationMethod() {
        return this.defaultAuthenticationMethod == null ? Input.empty() : this.defaultAuthenticationMethod;
    }

    /**
     * Whether the channel is enabled or disabled. Defaults to `true`.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The Certificate Private Key file (ie. `.key` file).
     * 
     */
    @InputImport(name="privateKey")
      private final @Nullable Input<String> privateKey;

    public Input<String> getPrivateKey() {
        return this.privateKey == null ? Input.empty() : this.privateKey;
    }

    /**
     * The ID assigned to your Apple developer account team. This value is provided on the Membership page.
     * 
     */
    @InputImport(name="teamId")
      private final @Nullable Input<String> teamId;

    public Input<String> getTeamId() {
        return this.teamId == null ? Input.empty() : this.teamId;
    }

    /**
     * The `.p8` file that you download from your Apple developer account when you create an authentication key.
     * 
     */
    @InputImport(name="tokenKey")
      private final @Nullable Input<String> tokenKey;

    public Input<String> getTokenKey() {
        return this.tokenKey == null ? Input.empty() : this.tokenKey;
    }

    /**
     * The ID assigned to your signing key. To find this value, choose Certificates, IDs & Profiles, and choose your key in the Keys section.
     * 
     */
    @InputImport(name="tokenKeyId")
      private final @Nullable Input<String> tokenKeyId;

    public Input<String> getTokenKeyId() {
        return this.tokenKeyId == null ? Input.empty() : this.tokenKeyId;
    }

    public ApnsVoipSandboxChannelState(
        @Nullable Input<String> applicationId,
        @Nullable Input<String> bundleId,
        @Nullable Input<String> certificate,
        @Nullable Input<String> defaultAuthenticationMethod,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> privateKey,
        @Nullable Input<String> teamId,
        @Nullable Input<String> tokenKey,
        @Nullable Input<String> tokenKeyId) {
        this.applicationId = applicationId;
        this.bundleId = bundleId;
        this.certificate = certificate;
        this.defaultAuthenticationMethod = defaultAuthenticationMethod;
        this.enabled = enabled;
        this.privateKey = privateKey;
        this.teamId = teamId;
        this.tokenKey = tokenKey;
        this.tokenKeyId = tokenKeyId;
    }

    private ApnsVoipSandboxChannelState() {
        this.applicationId = Input.empty();
        this.bundleId = Input.empty();
        this.certificate = Input.empty();
        this.defaultAuthenticationMethod = Input.empty();
        this.enabled = Input.empty();
        this.privateKey = Input.empty();
        this.teamId = Input.empty();
        this.tokenKey = Input.empty();
        this.tokenKeyId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApnsVoipSandboxChannelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> applicationId;
        private @Nullable Input<String> bundleId;
        private @Nullable Input<String> certificate;
        private @Nullable Input<String> defaultAuthenticationMethod;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> privateKey;
        private @Nullable Input<String> teamId;
        private @Nullable Input<String> tokenKey;
        private @Nullable Input<String> tokenKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(ApnsVoipSandboxChannelState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.bundleId = defaults.bundleId;
    	      this.certificate = defaults.certificate;
    	      this.defaultAuthenticationMethod = defaults.defaultAuthenticationMethod;
    	      this.enabled = defaults.enabled;
    	      this.privateKey = defaults.privateKey;
    	      this.teamId = defaults.teamId;
    	      this.tokenKey = defaults.tokenKey;
    	      this.tokenKeyId = defaults.tokenKeyId;
        }

        public Builder applicationId(@Nullable Input<String> applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = Input.ofNullable(applicationId);
            return this;
        }

        public Builder bundleId(@Nullable Input<String> bundleId) {
            this.bundleId = bundleId;
            return this;
        }

        public Builder bundleId(@Nullable String bundleId) {
            this.bundleId = Input.ofNullable(bundleId);
            return this;
        }

        public Builder certificate(@Nullable Input<String> certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder certificate(@Nullable String certificate) {
            this.certificate = Input.ofNullable(certificate);
            return this;
        }

        public Builder defaultAuthenticationMethod(@Nullable Input<String> defaultAuthenticationMethod) {
            this.defaultAuthenticationMethod = defaultAuthenticationMethod;
            return this;
        }

        public Builder defaultAuthenticationMethod(@Nullable String defaultAuthenticationMethod) {
            this.defaultAuthenticationMethod = Input.ofNullable(defaultAuthenticationMethod);
            return this;
        }

        public Builder enabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder privateKey(@Nullable Input<String> privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        public Builder privateKey(@Nullable String privateKey) {
            this.privateKey = Input.ofNullable(privateKey);
            return this;
        }

        public Builder teamId(@Nullable Input<String> teamId) {
            this.teamId = teamId;
            return this;
        }

        public Builder teamId(@Nullable String teamId) {
            this.teamId = Input.ofNullable(teamId);
            return this;
        }

        public Builder tokenKey(@Nullable Input<String> tokenKey) {
            this.tokenKey = tokenKey;
            return this;
        }

        public Builder tokenKey(@Nullable String tokenKey) {
            this.tokenKey = Input.ofNullable(tokenKey);
            return this;
        }

        public Builder tokenKeyId(@Nullable Input<String> tokenKeyId) {
            this.tokenKeyId = tokenKeyId;
            return this;
        }

        public Builder tokenKeyId(@Nullable String tokenKeyId) {
            this.tokenKeyId = Input.ofNullable(tokenKeyId);
            return this;
        }
        public ApnsVoipSandboxChannelState build() {
            return new ApnsVoipSandboxChannelState(applicationId, bundleId, certificate, defaultAuthenticationMethod, enabled, privateKey, teamId, tokenKey, tokenKeyId);
        }
    }
}
