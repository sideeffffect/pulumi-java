// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetTransitGatewayPeeringAttachmentArgs extends InvokeArgs {

    public static final GetTransitGatewayPeeringAttachmentArgs Empty = new GetTransitGatewayPeeringAttachmentArgs();

    /**
     * The ID of the transit gateway peering attachment.
     * 
     */
    @Import(name="transitGatewayAttachmentId", required=true)
    private String transitGatewayAttachmentId;

    /**
     * @return The ID of the transit gateway peering attachment.
     * 
     */
    public String transitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }

    private GetTransitGatewayPeeringAttachmentArgs() {}

    private GetTransitGatewayPeeringAttachmentArgs(GetTransitGatewayPeeringAttachmentArgs $) {
        this.transitGatewayAttachmentId = $.transitGatewayAttachmentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTransitGatewayPeeringAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTransitGatewayPeeringAttachmentArgs $;

        public Builder() {
            $ = new GetTransitGatewayPeeringAttachmentArgs();
        }

        public Builder(GetTransitGatewayPeeringAttachmentArgs defaults) {
            $ = new GetTransitGatewayPeeringAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param transitGatewayAttachmentId The ID of the transit gateway peering attachment.
         * 
         * @return builder
         * 
         */
        public Builder transitGatewayAttachmentId(String transitGatewayAttachmentId) {
            $.transitGatewayAttachmentId = transitGatewayAttachmentId;
            return this;
        }

        public GetTransitGatewayPeeringAttachmentArgs build() {
            $.transitGatewayAttachmentId = Objects.requireNonNull($.transitGatewayAttachmentId, "expected parameter 'transitGatewayAttachmentId' to be non-null");
            return $;
        }
    }

}
