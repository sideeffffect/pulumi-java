// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetInternetGatewayArgs extends InvokeArgs {

    public static final GetInternetGatewayArgs Empty = new GetInternetGatewayArgs();

    /**
     * ID of internet gateway.
     * 
     */
    @Import(name="internetGatewayId", required=true)
    private String internetGatewayId;

    /**
     * @return ID of internet gateway.
     * 
     */
    public String internetGatewayId() {
        return this.internetGatewayId;
    }

    private GetInternetGatewayArgs() {}

    private GetInternetGatewayArgs(GetInternetGatewayArgs $) {
        this.internetGatewayId = $.internetGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInternetGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInternetGatewayArgs $;

        public Builder() {
            $ = new GetInternetGatewayArgs();
        }

        public Builder(GetInternetGatewayArgs defaults) {
            $ = new GetInternetGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param internetGatewayId ID of internet gateway.
         * 
         * @return builder
         * 
         */
        public Builder internetGatewayId(String internetGatewayId) {
            $.internetGatewayId = internetGatewayId;
            return this;
        }

        public GetInternetGatewayArgs build() {
            $.internetGatewayId = Objects.requireNonNull($.internetGatewayId, "expected parameter 'internetGatewayId' to be non-null");
            return $;
        }
    }

}
