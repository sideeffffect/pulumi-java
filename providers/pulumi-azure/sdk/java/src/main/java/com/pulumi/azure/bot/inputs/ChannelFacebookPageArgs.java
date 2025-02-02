// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.bot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ChannelFacebookPageArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelFacebookPageArgs Empty = new ChannelFacebookPageArgs();

    /**
     * The Facebook Page Access Token for the Facebook Channel.
     * 
     */
    @Import(name="accessToken", required=true)
    private Output<String> accessToken;

    /**
     * @return The Facebook Page Access Token for the Facebook Channel.
     * 
     */
    public Output<String> accessToken() {
        return this.accessToken;
    }

    /**
     * The Facebook Page ID for the Facebook Channel.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The Facebook Page ID for the Facebook Channel.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private ChannelFacebookPageArgs() {}

    private ChannelFacebookPageArgs(ChannelFacebookPageArgs $) {
        this.accessToken = $.accessToken;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelFacebookPageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelFacebookPageArgs $;

        public Builder() {
            $ = new ChannelFacebookPageArgs();
        }

        public Builder(ChannelFacebookPageArgs defaults) {
            $ = new ChannelFacebookPageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessToken The Facebook Page Access Token for the Facebook Channel.
         * 
         * @return builder
         * 
         */
        public Builder accessToken(Output<String> accessToken) {
            $.accessToken = accessToken;
            return this;
        }

        /**
         * @param accessToken The Facebook Page Access Token for the Facebook Channel.
         * 
         * @return builder
         * 
         */
        public Builder accessToken(String accessToken) {
            return accessToken(Output.of(accessToken));
        }

        /**
         * @param id The Facebook Page ID for the Facebook Channel.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The Facebook Page ID for the Facebook Channel.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public ChannelFacebookPageArgs build() {
            $.accessToken = Objects.requireNonNull($.accessToken, "expected parameter 'accessToken' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
