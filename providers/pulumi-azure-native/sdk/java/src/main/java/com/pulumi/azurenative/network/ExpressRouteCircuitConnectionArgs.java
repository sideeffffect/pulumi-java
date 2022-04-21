// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.Ipv6CircuitConnectionConfigArgs;
import com.pulumi.azurenative.network.inputs.SubResourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExpressRouteCircuitConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExpressRouteCircuitConnectionArgs Empty = new ExpressRouteCircuitConnectionArgs();

    /**
     * /29 IP address space to carve out Customer addresses for tunnels.
     * 
     */
    @Import(name="addressPrefix")
    private @Nullable Output<String> addressPrefix;

    public Optional<Output<String>> addressPrefix() {
        return Optional.ofNullable(this.addressPrefix);
    }

    /**
     * The authorization key.
     * 
     */
    @Import(name="authorizationKey")
    private @Nullable Output<String> authorizationKey;

    public Optional<Output<String>> authorizationKey() {
        return Optional.ofNullable(this.authorizationKey);
    }

    /**
     * The name of the express route circuit.
     * 
     */
    @Import(name="circuitName", required=true)
    private Output<String> circuitName;

    public Output<String> circuitName() {
        return this.circuitName;
    }

    /**
     * The name of the express route circuit connection.
     * 
     */
    @Import(name="connectionName")
    private @Nullable Output<String> connectionName;

    public Optional<Output<String>> connectionName() {
        return Optional.ofNullable(this.connectionName);
    }

    /**
     * Reference to Express Route Circuit Private Peering Resource of the circuit initiating connection.
     * 
     */
    @Import(name="expressRouteCircuitPeering")
    private @Nullable Output<SubResourceArgs> expressRouteCircuitPeering;

    public Optional<Output<SubResourceArgs>> expressRouteCircuitPeering() {
        return Optional.ofNullable(this.expressRouteCircuitPeering);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * IPv6 Address PrefixProperties of the express route circuit connection.
     * 
     */
    @Import(name="ipv6CircuitConnectionConfig")
    private @Nullable Output<Ipv6CircuitConnectionConfigArgs> ipv6CircuitConnectionConfig;

    public Optional<Output<Ipv6CircuitConnectionConfigArgs>> ipv6CircuitConnectionConfig() {
        return Optional.ofNullable(this.ipv6CircuitConnectionConfig);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Reference to Express Route Circuit Private Peering Resource of the peered circuit.
     * 
     */
    @Import(name="peerExpressRouteCircuitPeering")
    private @Nullable Output<SubResourceArgs> peerExpressRouteCircuitPeering;

    public Optional<Output<SubResourceArgs>> peerExpressRouteCircuitPeering() {
        return Optional.ofNullable(this.peerExpressRouteCircuitPeering);
    }

    /**
     * The name of the peering.
     * 
     */
    @Import(name="peeringName", required=true)
    private Output<String> peeringName;

    public Output<String> peeringName() {
        return this.peeringName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private ExpressRouteCircuitConnectionArgs() {}

    private ExpressRouteCircuitConnectionArgs(ExpressRouteCircuitConnectionArgs $) {
        this.addressPrefix = $.addressPrefix;
        this.authorizationKey = $.authorizationKey;
        this.circuitName = $.circuitName;
        this.connectionName = $.connectionName;
        this.expressRouteCircuitPeering = $.expressRouteCircuitPeering;
        this.id = $.id;
        this.ipv6CircuitConnectionConfig = $.ipv6CircuitConnectionConfig;
        this.name = $.name;
        this.peerExpressRouteCircuitPeering = $.peerExpressRouteCircuitPeering;
        this.peeringName = $.peeringName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExpressRouteCircuitConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExpressRouteCircuitConnectionArgs $;

        public Builder() {
            $ = new ExpressRouteCircuitConnectionArgs();
        }

        public Builder(ExpressRouteCircuitConnectionArgs defaults) {
            $ = new ExpressRouteCircuitConnectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder addressPrefix(@Nullable Output<String> addressPrefix) {
            $.addressPrefix = addressPrefix;
            return this;
        }

        public Builder addressPrefix(String addressPrefix) {
            return addressPrefix(Output.of(addressPrefix));
        }

        public Builder authorizationKey(@Nullable Output<String> authorizationKey) {
            $.authorizationKey = authorizationKey;
            return this;
        }

        public Builder authorizationKey(String authorizationKey) {
            return authorizationKey(Output.of(authorizationKey));
        }

        public Builder circuitName(Output<String> circuitName) {
            $.circuitName = circuitName;
            return this;
        }

        public Builder circuitName(String circuitName) {
            return circuitName(Output.of(circuitName));
        }

        public Builder connectionName(@Nullable Output<String> connectionName) {
            $.connectionName = connectionName;
            return this;
        }

        public Builder connectionName(String connectionName) {
            return connectionName(Output.of(connectionName));
        }

        public Builder expressRouteCircuitPeering(@Nullable Output<SubResourceArgs> expressRouteCircuitPeering) {
            $.expressRouteCircuitPeering = expressRouteCircuitPeering;
            return this;
        }

        public Builder expressRouteCircuitPeering(SubResourceArgs expressRouteCircuitPeering) {
            return expressRouteCircuitPeering(Output.of(expressRouteCircuitPeering));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder ipv6CircuitConnectionConfig(@Nullable Output<Ipv6CircuitConnectionConfigArgs> ipv6CircuitConnectionConfig) {
            $.ipv6CircuitConnectionConfig = ipv6CircuitConnectionConfig;
            return this;
        }

        public Builder ipv6CircuitConnectionConfig(Ipv6CircuitConnectionConfigArgs ipv6CircuitConnectionConfig) {
            return ipv6CircuitConnectionConfig(Output.of(ipv6CircuitConnectionConfig));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder peerExpressRouteCircuitPeering(@Nullable Output<SubResourceArgs> peerExpressRouteCircuitPeering) {
            $.peerExpressRouteCircuitPeering = peerExpressRouteCircuitPeering;
            return this;
        }

        public Builder peerExpressRouteCircuitPeering(SubResourceArgs peerExpressRouteCircuitPeering) {
            return peerExpressRouteCircuitPeering(Output.of(peerExpressRouteCircuitPeering));
        }

        public Builder peeringName(Output<String> peeringName) {
            $.peeringName = peeringName;
            return this;
        }

        public Builder peeringName(String peeringName) {
            return peeringName(Output.of(peeringName));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ExpressRouteCircuitConnectionArgs build() {
            $.circuitName = Objects.requireNonNull($.circuitName, "expected parameter 'circuitName' to be non-null");
            $.peeringName = Objects.requireNonNull($.peeringName, "expected parameter 'peeringName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
