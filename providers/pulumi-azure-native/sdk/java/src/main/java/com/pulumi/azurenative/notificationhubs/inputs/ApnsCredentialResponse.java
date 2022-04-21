// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.notificationhubs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of a NotificationHub ApnsCredential.
 * 
 */
public final class ApnsCredentialResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApnsCredentialResponse Empty = new ApnsCredentialResponse();

    /**
     * The APNS certificate. Specify if using Certificate Authentication Mode.
     * 
     */
    @Import(name="apnsCertificate")
    private @Nullable String apnsCertificate;

    public Optional<String> apnsCertificate() {
        return Optional.ofNullable(this.apnsCertificate);
    }

    /**
     * The issuer (iss) registered claim key. The value is a 10-character TeamId, obtained from your developer account. Specify if using Token Authentication Mode.
     * 
     */
    @Import(name="appId")
    private @Nullable String appId;

    public Optional<String> appId() {
        return Optional.ofNullable(this.appId);
    }

    /**
     * The name of the application or BundleId. Specify if using Token Authentication Mode.
     * 
     */
    @Import(name="appName")
    private @Nullable String appName;

    public Optional<String> appName() {
        return Optional.ofNullable(this.appName);
    }

    /**
     * The APNS certificate password if it exists.
     * 
     */
    @Import(name="certificateKey")
    private @Nullable String certificateKey;

    public Optional<String> certificateKey() {
        return Optional.ofNullable(this.certificateKey);
    }

    /**
     * The APNS endpoint of this credential. If using Certificate Authentication Mode and Sandbox specify &#39;gateway.sandbox.push.apple.com&#39;. If using Certificate Authentication Mode and Production specify &#39;gateway.push.apple.com&#39;. If using Token Authentication Mode and Sandbox specify &#39;https://api.development.push.apple.com:443/3/device&#39;. If using Token Authentication Mode and Production specify &#39;https://api.push.apple.com:443/3/device&#39;.
     * 
     */
    @Import(name="endpoint")
    private @Nullable String endpoint;

    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * A 10-character key identifier (kid) key, obtained from your developer account. Specify if using Token Authentication Mode.
     * 
     */
    @Import(name="keyId")
    private @Nullable String keyId;

    public Optional<String> keyId() {
        return Optional.ofNullable(this.keyId);
    }

    /**
     * The APNS certificate thumbprint. Specify if using Certificate Authentication Mode.
     * 
     */
    @Import(name="thumbprint")
    private @Nullable String thumbprint;

    public Optional<String> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    /**
     * Provider Authentication Token, obtained through your developer account. Specify if using Token Authentication Mode.
     * 
     */
    @Import(name="token")
    private @Nullable String token;

    public Optional<String> token() {
        return Optional.ofNullable(this.token);
    }

    private ApnsCredentialResponse() {}

    private ApnsCredentialResponse(ApnsCredentialResponse $) {
        this.apnsCertificate = $.apnsCertificate;
        this.appId = $.appId;
        this.appName = $.appName;
        this.certificateKey = $.certificateKey;
        this.endpoint = $.endpoint;
        this.keyId = $.keyId;
        this.thumbprint = $.thumbprint;
        this.token = $.token;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApnsCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApnsCredentialResponse $;

        public Builder() {
            $ = new ApnsCredentialResponse();
        }

        public Builder(ApnsCredentialResponse defaults) {
            $ = new ApnsCredentialResponse(Objects.requireNonNull(defaults));
        }

        public Builder apnsCertificate(@Nullable String apnsCertificate) {
            $.apnsCertificate = apnsCertificate;
            return this;
        }

        public Builder appId(@Nullable String appId) {
            $.appId = appId;
            return this;
        }

        public Builder appName(@Nullable String appName) {
            $.appName = appName;
            return this;
        }

        public Builder certificateKey(@Nullable String certificateKey) {
            $.certificateKey = certificateKey;
            return this;
        }

        public Builder endpoint(@Nullable String endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        public Builder keyId(@Nullable String keyId) {
            $.keyId = keyId;
            return this;
        }

        public Builder thumbprint(@Nullable String thumbprint) {
            $.thumbprint = thumbprint;
            return this;
        }

        public Builder token(@Nullable String token) {
            $.token = token;
            return this;
        }

        public ApnsCredentialResponse build() {
            return $;
        }
    }

}
