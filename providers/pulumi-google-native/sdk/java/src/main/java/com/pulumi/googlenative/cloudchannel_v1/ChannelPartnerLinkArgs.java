// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudchannel_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudchannel_v1.enums.ChannelPartnerLinkLinkState;
import java.lang.String;
import java.util.Objects;


public final class ChannelPartnerLinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelPartnerLinkArgs Empty = new ChannelPartnerLinkArgs();

    @Import(name="accountId", required=true)
    private Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * State of the channel partner link.
     * 
     */
    @Import(name="linkState", required=true)
    private Output<ChannelPartnerLinkLinkState> linkState;

    public Output<ChannelPartnerLinkLinkState> linkState() {
        return this.linkState;
    }

    /**
     * Cloud Identity ID of the linked reseller.
     * 
     */
    @Import(name="resellerCloudIdentityId", required=true)
    private Output<String> resellerCloudIdentityId;

    public Output<String> resellerCloudIdentityId() {
        return this.resellerCloudIdentityId;
    }

    private ChannelPartnerLinkArgs() {}

    private ChannelPartnerLinkArgs(ChannelPartnerLinkArgs $) {
        this.accountId = $.accountId;
        this.linkState = $.linkState;
        this.resellerCloudIdentityId = $.resellerCloudIdentityId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelPartnerLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelPartnerLinkArgs $;

        public Builder() {
            $ = new ChannelPartnerLinkArgs();
        }

        public Builder(ChannelPartnerLinkArgs defaults) {
            $ = new ChannelPartnerLinkArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        public Builder linkState(Output<ChannelPartnerLinkLinkState> linkState) {
            $.linkState = linkState;
            return this;
        }

        public Builder linkState(ChannelPartnerLinkLinkState linkState) {
            return linkState(Output.of(linkState));
        }

        public Builder resellerCloudIdentityId(Output<String> resellerCloudIdentityId) {
            $.resellerCloudIdentityId = resellerCloudIdentityId;
            return this;
        }

        public Builder resellerCloudIdentityId(String resellerCloudIdentityId) {
            return resellerCloudIdentityId(Output.of(resellerCloudIdentityId));
        }

        public ChannelPartnerLinkArgs build() {
            $.accountId = Objects.requireNonNull($.accountId, "expected parameter 'accountId' to be non-null");
            $.linkState = Objects.requireNonNull($.linkState, "expected parameter 'linkState' to be non-null");
            $.resellerCloudIdentityId = Objects.requireNonNull($.resellerCloudIdentityId, "expected parameter 'resellerCloudIdentityId' to be non-null");
            return $;
        }
    }

}
