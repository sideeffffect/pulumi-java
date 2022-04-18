// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.notificationhubs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BaiduCredentialResponse {
    /**
     * Baidu Api Key.
     * 
     */
    private final @Nullable String baiduApiKey;
    /**
     * Baidu Endpoint.
     * 
     */
    private final @Nullable String baiduEndPoint;
    /**
     * Baidu Secret Key
     * 
     */
    private final @Nullable String baiduSecretKey;

    @CustomType.Constructor
    private BaiduCredentialResponse(
        @CustomType.Parameter("baiduApiKey") @Nullable String baiduApiKey,
        @CustomType.Parameter("baiduEndPoint") @Nullable String baiduEndPoint,
        @CustomType.Parameter("baiduSecretKey") @Nullable String baiduSecretKey) {
        this.baiduApiKey = baiduApiKey;
        this.baiduEndPoint = baiduEndPoint;
        this.baiduSecretKey = baiduSecretKey;
    }

    /**
     * Baidu Api Key.
     * 
    */
    public Optional<String> baiduApiKey() {
        return Optional.ofNullable(this.baiduApiKey);
    }
    /**
     * Baidu Endpoint.
     * 
    */
    public Optional<String> baiduEndPoint() {
        return Optional.ofNullable(this.baiduEndPoint);
    }
    /**
     * Baidu Secret Key
     * 
    */
    public Optional<String> baiduSecretKey() {
        return Optional.ofNullable(this.baiduSecretKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BaiduCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String baiduApiKey;
        private @Nullable String baiduEndPoint;
        private @Nullable String baiduSecretKey;

        public Builder() {
    	      // Empty
        }

        public Builder(BaiduCredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baiduApiKey = defaults.baiduApiKey;
    	      this.baiduEndPoint = defaults.baiduEndPoint;
    	      this.baiduSecretKey = defaults.baiduSecretKey;
        }

        public Builder baiduApiKey(@Nullable String baiduApiKey) {
            this.baiduApiKey = baiduApiKey;
            return this;
        }
        public Builder baiduEndPoint(@Nullable String baiduEndPoint) {
            this.baiduEndPoint = baiduEndPoint;
            return this;
        }
        public Builder baiduSecretKey(@Nullable String baiduSecretKey) {
            this.baiduSecretKey = baiduSecretKey;
            return this;
        }        public BaiduCredentialResponse build() {
            return new BaiduCredentialResponse(baiduApiKey, baiduEndPoint, baiduSecretKey);
        }
    }
}
