// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.ConnectionMonitorEndpointScopeItemArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the connection monitor endpoint scope.
 * 
 */
public final class ConnectionMonitorEndpointScopeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionMonitorEndpointScopeArgs Empty = new ConnectionMonitorEndpointScopeArgs();

    /**
     * List of items which needs to be excluded from the endpoint scope.
     * 
     */
    @Import(name="exclude")
    private @Nullable Output<List<ConnectionMonitorEndpointScopeItemArgs>> exclude;

    public Optional<Output<List<ConnectionMonitorEndpointScopeItemArgs>>> exclude() {
        return Optional.ofNullable(this.exclude);
    }

    /**
     * List of items which needs to be included to the endpoint scope.
     * 
     */
    @Import(name="include")
    private @Nullable Output<List<ConnectionMonitorEndpointScopeItemArgs>> include;

    public Optional<Output<List<ConnectionMonitorEndpointScopeItemArgs>>> include() {
        return Optional.ofNullable(this.include);
    }

    private ConnectionMonitorEndpointScopeArgs() {}

    private ConnectionMonitorEndpointScopeArgs(ConnectionMonitorEndpointScopeArgs $) {
        this.exclude = $.exclude;
        this.include = $.include;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionMonitorEndpointScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionMonitorEndpointScopeArgs $;

        public Builder() {
            $ = new ConnectionMonitorEndpointScopeArgs();
        }

        public Builder(ConnectionMonitorEndpointScopeArgs defaults) {
            $ = new ConnectionMonitorEndpointScopeArgs(Objects.requireNonNull(defaults));
        }

        public Builder exclude(@Nullable Output<List<ConnectionMonitorEndpointScopeItemArgs>> exclude) {
            $.exclude = exclude;
            return this;
        }

        public Builder exclude(List<ConnectionMonitorEndpointScopeItemArgs> exclude) {
            return exclude(Output.of(exclude));
        }

        public Builder exclude(ConnectionMonitorEndpointScopeItemArgs... exclude) {
            return exclude(List.of(exclude));
        }

        public Builder include(@Nullable Output<List<ConnectionMonitorEndpointScopeItemArgs>> include) {
            $.include = include;
            return this;
        }

        public Builder include(List<ConnectionMonitorEndpointScopeItemArgs> include) {
            return include(Output.of(include));
        }

        public Builder include(ConnectionMonitorEndpointScopeItemArgs... include) {
            return include(List.of(include));
        }

        public ConnectionMonitorEndpointScopeArgs build() {
            return $;
        }
    }

}
