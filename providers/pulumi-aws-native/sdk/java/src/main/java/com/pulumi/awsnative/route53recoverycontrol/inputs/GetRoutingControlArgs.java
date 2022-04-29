// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53recoverycontrol.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetRoutingControlArgs extends InvokeArgs {

    public static final GetRoutingControlArgs Empty = new GetRoutingControlArgs();

    /**
     * The Amazon Resource Name (ARN) of the routing control.
     * 
     */
    @Import(name="routingControlArn", required=true)
    private String routingControlArn;

    /**
     * @return The Amazon Resource Name (ARN) of the routing control.
     * 
     */
    public String routingControlArn() {
        return this.routingControlArn;
    }

    private GetRoutingControlArgs() {}

    private GetRoutingControlArgs(GetRoutingControlArgs $) {
        this.routingControlArn = $.routingControlArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRoutingControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRoutingControlArgs $;

        public Builder() {
            $ = new GetRoutingControlArgs();
        }

        public Builder(GetRoutingControlArgs defaults) {
            $ = new GetRoutingControlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param routingControlArn The Amazon Resource Name (ARN) of the routing control.
         * 
         * @return builder
         * 
         */
        public Builder routingControlArn(String routingControlArn) {
            $.routingControlArn = routingControlArn;
            return this;
        }

        public GetRoutingControlArgs build() {
            $.routingControlArn = Objects.requireNonNull($.routingControlArn, "expected parameter 'routingControlArn' to be non-null");
            return $;
        }
    }

}
