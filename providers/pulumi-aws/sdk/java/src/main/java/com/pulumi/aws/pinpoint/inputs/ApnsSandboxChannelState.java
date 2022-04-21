// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pinpoint.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApnsSandboxChannelState extends com.pulumi.resources.ResourceArgs {

    public static final ApnsSandboxChannelState Empty = new ApnsSandboxChannelState();

    /**
     * The application ID.
     * 
     */
    @Import(name="applicationId")
    private @Nullable Output<String> applicationId;

    public Optional<Output<String>> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    /**
     * The ID assigned to your iOS app. To find this value, choose Certificates, IDs &amp; Profiles, choose App IDs in the Identifiers section, and choose your app.
     * 
     */
    @Import(name="bundleId")
    private @Nullable Output<String> bundleId;

    public Optional<Output<String>> bundleId() {
        return Optional.ofNullable(this.bundleId);
    }

    /**
     * The pem encoded TLS Certificate from Apple.
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * The default authentication method used for APNs Sandbox.
     * __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
     * You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
     * If your default authentication type fails, Amazon Pinpoint doesn&#39;t attempt to use the other authentication type.
     * 
     */
    @Import(name="defaultAuthenticationMethod")
    private @Nullable Output<String> defaultAuthenticationMethod;

    public Optional<Output<String>> defaultAuthenticationMethod() {
        return Optional.ofNullable(this.defaultAuthenticationMethod);
    }

    /**
     * Whether the channel is enabled or disabled. Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The Certificate Private Key file (ie. `.key` file).
     * 
     */
    @Import(name="privateKey")
    private @Nullable Output<String> privateKey;

    public Optional<Output<String>> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }

    /**
     * The ID assigned to your Apple developer account team. This value is provided on the Membership page.
     * 
     */
    @Import(name="teamId")
    private @Nullable Output<String> teamId;

    public Optional<Output<String>> teamId() {
        return Optional.ofNullable(this.teamId);
    }

    /**
     * The `.p8` file that you download from your Apple developer account when you create an authentication key.
     * 
     */
    @Import(name="tokenKey")
    private @Nullable Output<String> tokenKey;

    public Optional<Output<String>> tokenKey() {
        return Optional.ofNullable(this.tokenKey);
    }

    /**
     * The ID assigned to your signing key. To find this value, choose Certificates, IDs &amp; Profiles, and choose your key in the Keys section.
     * 
     */
    @Import(name="tokenKeyId")
    private @Nullable Output<String> tokenKeyId;

    public Optional<Output<String>> tokenKeyId() {
        return Optional.ofNullable(this.tokenKeyId);
    }

    private ApnsSandboxChannelState() {}

    private ApnsSandboxChannelState(ApnsSandboxChannelState $) {
        this.applicationId = $.applicationId;
        this.bundleId = $.bundleId;
        this.certificate = $.certificate;
        this.defaultAuthenticationMethod = $.defaultAuthenticationMethod;
        this.enabled = $.enabled;
        this.privateKey = $.privateKey;
        this.teamId = $.teamId;
        this.tokenKey = $.tokenKey;
        this.tokenKeyId = $.tokenKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApnsSandboxChannelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApnsSandboxChannelState $;

        public Builder() {
            $ = new ApnsSandboxChannelState();
        }

        public Builder(ApnsSandboxChannelState defaults) {
            $ = new ApnsSandboxChannelState(Objects.requireNonNull(defaults));
        }

        public Builder applicationId(@Nullable Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        public Builder bundleId(@Nullable Output<String> bundleId) {
            $.bundleId = bundleId;
            return this;
        }

        public Builder bundleId(String bundleId) {
            return bundleId(Output.of(bundleId));
        }

        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        public Builder defaultAuthenticationMethod(@Nullable Output<String> defaultAuthenticationMethod) {
            $.defaultAuthenticationMethod = defaultAuthenticationMethod;
            return this;
        }

        public Builder defaultAuthenticationMethod(String defaultAuthenticationMethod) {
            return defaultAuthenticationMethod(Output.of(defaultAuthenticationMethod));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder privateKey(@Nullable Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        public Builder teamId(@Nullable Output<String> teamId) {
            $.teamId = teamId;
            return this;
        }

        public Builder teamId(String teamId) {
            return teamId(Output.of(teamId));
        }

        public Builder tokenKey(@Nullable Output<String> tokenKey) {
            $.tokenKey = tokenKey;
            return this;
        }

        public Builder tokenKey(String tokenKey) {
            return tokenKey(Output.of(tokenKey));
        }

        public Builder tokenKeyId(@Nullable Output<String> tokenKeyId) {
            $.tokenKeyId = tokenKeyId;
            return this;
        }

        public Builder tokenKeyId(String tokenKeyId) {
            return tokenKeyId(Output.of(tokenKeyId));
        }

        public ApnsSandboxChannelState build() {
            return $;
        }
    }

}
