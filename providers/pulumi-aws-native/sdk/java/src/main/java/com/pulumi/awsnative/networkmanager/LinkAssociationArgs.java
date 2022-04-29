// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkmanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class LinkAssociationArgs extends ResourceArgs {

    public static final LinkAssociationArgs Empty = new LinkAssociationArgs();

    /**
     * The ID of the device
     * 
     */
    @Import(name="deviceId", required=true)
    private Output<String> deviceId;

    /**
     * @return The ID of the device
     * 
     */
    public Output<String> deviceId() {
        return this.deviceId;
    }

    /**
     * The ID of the global network.
     * 
     */
    @Import(name="globalNetworkId", required=true)
    private Output<String> globalNetworkId;

    /**
     * @return The ID of the global network.
     * 
     */
    public Output<String> globalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * The ID of the link
     * 
     */
    @Import(name="linkId", required=true)
    private Output<String> linkId;

    /**
     * @return The ID of the link
     * 
     */
    public Output<String> linkId() {
        return this.linkId;
    }

    private LinkAssociationArgs() {}

    private LinkAssociationArgs(LinkAssociationArgs $) {
        this.deviceId = $.deviceId;
        this.globalNetworkId = $.globalNetworkId;
        this.linkId = $.linkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkAssociationArgs $;

        public Builder() {
            $ = new LinkAssociationArgs();
        }

        public Builder(LinkAssociationArgs defaults) {
            $ = new LinkAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceId The ID of the device
         * 
         * @return builder
         * 
         */
        public Builder deviceId(Output<String> deviceId) {
            $.deviceId = deviceId;
            return this;
        }

        /**
         * @param deviceId The ID of the device
         * 
         * @return builder
         * 
         */
        public Builder deviceId(String deviceId) {
            return deviceId(Output.of(deviceId));
        }

        /**
         * @param globalNetworkId The ID of the global network.
         * 
         * @return builder
         * 
         */
        public Builder globalNetworkId(Output<String> globalNetworkId) {
            $.globalNetworkId = globalNetworkId;
            return this;
        }

        /**
         * @param globalNetworkId The ID of the global network.
         * 
         * @return builder
         * 
         */
        public Builder globalNetworkId(String globalNetworkId) {
            return globalNetworkId(Output.of(globalNetworkId));
        }

        /**
         * @param linkId The ID of the link
         * 
         * @return builder
         * 
         */
        public Builder linkId(Output<String> linkId) {
            $.linkId = linkId;
            return this;
        }

        /**
         * @param linkId The ID of the link
         * 
         * @return builder
         * 
         */
        public Builder linkId(String linkId) {
            return linkId(Output.of(linkId));
        }

        public LinkAssociationArgs build() {
            $.deviceId = Objects.requireNonNull($.deviceId, "expected parameter 'deviceId' to be non-null");
            $.globalNetworkId = Objects.requireNonNull($.globalNetworkId, "expected parameter 'globalNetworkId' to be non-null");
            $.linkId = Objects.requireNonNull($.linkId, "expected parameter 'linkId' to be non-null");
            return $;
        }
    }

}
