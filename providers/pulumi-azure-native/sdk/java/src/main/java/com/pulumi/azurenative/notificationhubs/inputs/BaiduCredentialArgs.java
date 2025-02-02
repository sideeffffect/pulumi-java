// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.notificationhubs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of a NotificationHub BaiduCredential.
 * 
 */
public final class BaiduCredentialArgs extends com.pulumi.resources.ResourceArgs {

    public static final BaiduCredentialArgs Empty = new BaiduCredentialArgs();

    /**
     * Baidu Api Key.
     * 
     */
    @Import(name="baiduApiKey")
    private @Nullable Output<String> baiduApiKey;

    /**
     * @return Baidu Api Key.
     * 
     */
    public Optional<Output<String>> baiduApiKey() {
        return Optional.ofNullable(this.baiduApiKey);
    }

    /**
     * Baidu Endpoint.
     * 
     */
    @Import(name="baiduEndPoint")
    private @Nullable Output<String> baiduEndPoint;

    /**
     * @return Baidu Endpoint.
     * 
     */
    public Optional<Output<String>> baiduEndPoint() {
        return Optional.ofNullable(this.baiduEndPoint);
    }

    /**
     * Baidu Secret Key
     * 
     */
    @Import(name="baiduSecretKey")
    private @Nullable Output<String> baiduSecretKey;

    /**
     * @return Baidu Secret Key
     * 
     */
    public Optional<Output<String>> baiduSecretKey() {
        return Optional.ofNullable(this.baiduSecretKey);
    }

    private BaiduCredentialArgs() {}

    private BaiduCredentialArgs(BaiduCredentialArgs $) {
        this.baiduApiKey = $.baiduApiKey;
        this.baiduEndPoint = $.baiduEndPoint;
        this.baiduSecretKey = $.baiduSecretKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BaiduCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BaiduCredentialArgs $;

        public Builder() {
            $ = new BaiduCredentialArgs();
        }

        public Builder(BaiduCredentialArgs defaults) {
            $ = new BaiduCredentialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param baiduApiKey Baidu Api Key.
         * 
         * @return builder
         * 
         */
        public Builder baiduApiKey(@Nullable Output<String> baiduApiKey) {
            $.baiduApiKey = baiduApiKey;
            return this;
        }

        /**
         * @param baiduApiKey Baidu Api Key.
         * 
         * @return builder
         * 
         */
        public Builder baiduApiKey(String baiduApiKey) {
            return baiduApiKey(Output.of(baiduApiKey));
        }

        /**
         * @param baiduEndPoint Baidu Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder baiduEndPoint(@Nullable Output<String> baiduEndPoint) {
            $.baiduEndPoint = baiduEndPoint;
            return this;
        }

        /**
         * @param baiduEndPoint Baidu Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder baiduEndPoint(String baiduEndPoint) {
            return baiduEndPoint(Output.of(baiduEndPoint));
        }

        /**
         * @param baiduSecretKey Baidu Secret Key
         * 
         * @return builder
         * 
         */
        public Builder baiduSecretKey(@Nullable Output<String> baiduSecretKey) {
            $.baiduSecretKey = baiduSecretKey;
            return this;
        }

        /**
         * @param baiduSecretKey Baidu Secret Key
         * 
         * @return builder
         * 
         */
        public Builder baiduSecretKey(String baiduSecretKey) {
            return baiduSecretKey(Output.of(baiduSecretKey));
        }

        public BaiduCredentialArgs build() {
            return $;
        }
    }

}
