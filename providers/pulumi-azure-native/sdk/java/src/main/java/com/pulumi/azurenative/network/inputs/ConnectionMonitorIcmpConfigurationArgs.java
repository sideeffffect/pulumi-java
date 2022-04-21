// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the ICMP configuration.
 * 
 */
public final class ConnectionMonitorIcmpConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionMonitorIcmpConfigurationArgs Empty = new ConnectionMonitorIcmpConfigurationArgs();

    /**
     * Value indicating whether path evaluation with trace route should be disabled.
     * 
     */
    @Import(name="disableTraceRoute")
    private @Nullable Output<Boolean> disableTraceRoute;

    public Optional<Output<Boolean>> disableTraceRoute() {
        return Optional.ofNullable(this.disableTraceRoute);
    }

    private ConnectionMonitorIcmpConfigurationArgs() {}

    private ConnectionMonitorIcmpConfigurationArgs(ConnectionMonitorIcmpConfigurationArgs $) {
        this.disableTraceRoute = $.disableTraceRoute;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionMonitorIcmpConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionMonitorIcmpConfigurationArgs $;

        public Builder() {
            $ = new ConnectionMonitorIcmpConfigurationArgs();
        }

        public Builder(ConnectionMonitorIcmpConfigurationArgs defaults) {
            $ = new ConnectionMonitorIcmpConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder disableTraceRoute(@Nullable Output<Boolean> disableTraceRoute) {
            $.disableTraceRoute = disableTraceRoute;
            return this;
        }

        public Builder disableTraceRoute(Boolean disableTraceRoute) {
            return disableTraceRoute(Output.of(disableTraceRoute));
        }

        public ConnectionMonitorIcmpConfigurationArgs build() {
            return $;
        }
    }

}
