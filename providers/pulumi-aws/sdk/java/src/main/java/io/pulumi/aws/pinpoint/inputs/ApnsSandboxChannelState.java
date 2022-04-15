// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.pinpoint.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApnsSandboxChannelState extends io.pulumi.resources.ResourceArgs {

    public static final ApnsSandboxChannelState Empty = new ApnsSandboxChannelState();

    /**
     * The application ID.
     * 
     */
    @Import(name="applicationId")
      private final @Nullable Output<String> applicationId;

    public Output<String> applicationId() {
        return this.applicationId == null ? Codegen.empty() : this.applicationId;
    }

    /**
     * The ID assigned to your iOS app. To find this value, choose Certificates, IDs & Profiles, choose App IDs in the Identifiers section, and choose your app.
     * 
     */
    @Import(name="bundleId")
      private final @Nullable Output<String> bundleId;

    public Output<String> bundleId() {
        return this.bundleId == null ? Codegen.empty() : this.bundleId;
    }

    /**
     * The pem encoded TLS Certificate from Apple.
     * 
     */
    @Import(name="certificate")
      private final @Nullable Output<String> certificate;

    public Output<String> certificate() {
        return this.certificate == null ? Codegen.empty() : this.certificate;
    }

    /**
     * The default authentication method used for APNs Sandbox.
     * __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
     * You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
     * If your default authentication type fails, Amazon Pinpoint doesn't attempt to use the other authentication type.
     * 
     */
    @Import(name="defaultAuthenticationMethod")
      private final @Nullable Output<String> defaultAuthenticationMethod;

    public Output<String> defaultAuthenticationMethod() {
        return this.defaultAuthenticationMethod == null ? Codegen.empty() : this.defaultAuthenticationMethod;
    }

    /**
     * Whether the channel is enabled or disabled. Defaults to `true`.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * The Certificate Private Key file (ie. `.key` file).
     * 
     */
    @Import(name="privateKey")
      private final @Nullable Output<String> privateKey;

    public Output<String> privateKey() {
        return this.privateKey == null ? Codegen.empty() : this.privateKey;
    }

    /**
     * The ID assigned to your Apple developer account team. This value is provided on the Membership page.
     * 
     */
    @Import(name="teamId")
      private final @Nullable Output<String> teamId;

    public Output<String> teamId() {
        return this.teamId == null ? Codegen.empty() : this.teamId;
    }

    /**
     * The `.p8` file that you download from your Apple developer account when you create an authentication key.
     * 
     */
    @Import(name="tokenKey")
      private final @Nullable Output<String> tokenKey;

    public Output<String> tokenKey() {
        return this.tokenKey == null ? Codegen.empty() : this.tokenKey;
    }

    /**
     * The ID assigned to your signing key. To find this value, choose Certificates, IDs & Profiles, and choose your key in the Keys section.
     * 
     */
    @Import(name="tokenKeyId")
      private final @Nullable Output<String> tokenKeyId;

    public Output<String> tokenKeyId() {
        return this.tokenKeyId == null ? Codegen.empty() : this.tokenKeyId;
    }

    public ApnsSandboxChannelState(
        @Nullable Output<String> applicationId,
        @Nullable Output<String> bundleId,
        @Nullable Output<String> certificate,
        @Nullable Output<String> defaultAuthenticationMethod,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> privateKey,
        @Nullable Output<String> teamId,
        @Nullable Output<String> tokenKey,
        @Nullable Output<String> tokenKeyId) {
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

    private ApnsSandboxChannelState() {
        this.applicationId = Codegen.empty();
        this.bundleId = Codegen.empty();
        this.certificate = Codegen.empty();
        this.defaultAuthenticationMethod = Codegen.empty();
        this.enabled = Codegen.empty();
        this.privateKey = Codegen.empty();
        this.teamId = Codegen.empty();
        this.tokenKey = Codegen.empty();
        this.tokenKeyId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApnsSandboxChannelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> applicationId;
        private @Nullable Output<String> bundleId;
        private @Nullable Output<String> certificate;
        private @Nullable Output<String> defaultAuthenticationMethod;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> privateKey;
        private @Nullable Output<String> teamId;
        private @Nullable Output<String> tokenKey;
        private @Nullable Output<String> tokenKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(ApnsSandboxChannelState defaults) {
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

        public Builder applicationId(@Nullable Output<String> applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = Codegen.ofNullable(applicationId);
            return this;
        }
        public Builder bundleId(@Nullable Output<String> bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public Builder bundleId(@Nullable String bundleId) {
            this.bundleId = Codegen.ofNullable(bundleId);
            return this;
        }
        public Builder certificate(@Nullable Output<String> certificate) {
            this.certificate = certificate;
            return this;
        }
        public Builder certificate(@Nullable String certificate) {
            this.certificate = Codegen.ofNullable(certificate);
            return this;
        }
        public Builder defaultAuthenticationMethod(@Nullable Output<String> defaultAuthenticationMethod) {
            this.defaultAuthenticationMethod = defaultAuthenticationMethod;
            return this;
        }
        public Builder defaultAuthenticationMethod(@Nullable String defaultAuthenticationMethod) {
            this.defaultAuthenticationMethod = Codegen.ofNullable(defaultAuthenticationMethod);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder privateKey(@Nullable Output<String> privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        public Builder privateKey(@Nullable String privateKey) {
            this.privateKey = Codegen.ofNullable(privateKey);
            return this;
        }
        public Builder teamId(@Nullable Output<String> teamId) {
            this.teamId = teamId;
            return this;
        }
        public Builder teamId(@Nullable String teamId) {
            this.teamId = Codegen.ofNullable(teamId);
            return this;
        }
        public Builder tokenKey(@Nullable Output<String> tokenKey) {
            this.tokenKey = tokenKey;
            return this;
        }
        public Builder tokenKey(@Nullable String tokenKey) {
            this.tokenKey = Codegen.ofNullable(tokenKey);
            return this;
        }
        public Builder tokenKeyId(@Nullable Output<String> tokenKeyId) {
            this.tokenKeyId = tokenKeyId;
            return this;
        }
        public Builder tokenKeyId(@Nullable String tokenKeyId) {
            this.tokenKeyId = Codegen.ofNullable(tokenKeyId);
            return this;
        }        public ApnsSandboxChannelState build() {
            return new ApnsSandboxChannelState(applicationId, bundleId, certificate, defaultAuthenticationMethod, enabled, privateKey, teamId, tokenKey, tokenKeyId);
        }
    }
}
