// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkmanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLinkArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLinkArgs Empty = new GetLinkArgs();

    /**
     * The ID of the global network.
     * 
     */
    @Import(name="globalNetworkId", required=true)
    private String globalNetworkId;

    public String globalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * The ID of the link.
     * 
     */
    @Import(name="linkId", required=true)
    private String linkId;

    public String linkId() {
        return this.linkId;
    }

    private GetLinkArgs() {}

    private GetLinkArgs(GetLinkArgs $) {
        this.globalNetworkId = $.globalNetworkId;
        this.linkId = $.linkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLinkArgs $;

        public Builder() {
            $ = new GetLinkArgs();
        }

        public Builder(GetLinkArgs defaults) {
            $ = new GetLinkArgs(Objects.requireNonNull(defaults));
        }

        public Builder globalNetworkId(String globalNetworkId) {
            $.globalNetworkId = globalNetworkId;
            return this;
        }

        public Builder linkId(String linkId) {
            $.linkId = linkId;
            return this;
        }

        public GetLinkArgs build() {
            $.globalNetworkId = Objects.requireNonNull($.globalNetworkId, "expected parameter 'globalNetworkId' to be non-null");
            $.linkId = Objects.requireNonNull($.linkId, "expected parameter 'linkId' to be non-null");
            return $;
        }
    }

}
