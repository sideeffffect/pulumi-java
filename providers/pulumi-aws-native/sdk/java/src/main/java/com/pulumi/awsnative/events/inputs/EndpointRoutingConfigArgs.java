// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.events.inputs;

import com.pulumi.awsnative.events.inputs.EndpointFailoverConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class EndpointRoutingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointRoutingConfigArgs Empty = new EndpointRoutingConfigArgs();

    @Import(name="failoverConfig", required=true)
    private Output<EndpointFailoverConfigArgs> failoverConfig;

    public Output<EndpointFailoverConfigArgs> failoverConfig() {
        return this.failoverConfig;
    }

    private EndpointRoutingConfigArgs() {}

    private EndpointRoutingConfigArgs(EndpointRoutingConfigArgs $) {
        this.failoverConfig = $.failoverConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointRoutingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointRoutingConfigArgs $;

        public Builder() {
            $ = new EndpointRoutingConfigArgs();
        }

        public Builder(EndpointRoutingConfigArgs defaults) {
            $ = new EndpointRoutingConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder failoverConfig(Output<EndpointFailoverConfigArgs> failoverConfig) {
            $.failoverConfig = failoverConfig;
            return this;
        }

        public Builder failoverConfig(EndpointFailoverConfigArgs failoverConfig) {
            return failoverConfig(Output.of(failoverConfig));
        }

        public EndpointRoutingConfigArgs build() {
            $.failoverConfig = Objects.requireNonNull($.failoverConfig, "expected parameter 'failoverConfig' to be non-null");
            return $;
        }
    }

}
