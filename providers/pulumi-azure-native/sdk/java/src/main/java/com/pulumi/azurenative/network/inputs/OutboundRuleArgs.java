// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.LoadBalancerOutboundRuleProtocol;
import com.pulumi.azurenative.network.inputs.SubResourceArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Outbound rule of the load balancer.
 * 
 */
public final class OutboundRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final OutboundRuleArgs Empty = new OutboundRuleArgs();

    /**
     * The number of outbound ports to be used for NAT.
     * 
     */
    @Import(name="allocatedOutboundPorts")
    private @Nullable Output<Integer> allocatedOutboundPorts;

    public Optional<Output<Integer>> allocatedOutboundPorts() {
        return Optional.ofNullable(this.allocatedOutboundPorts);
    }

    /**
     * A reference to a pool of DIPs. Outbound traffic is randomly load balanced across IPs in the backend IPs.
     * 
     */
    @Import(name="backendAddressPool", required=true)
    private Output<SubResourceArgs> backendAddressPool;

    public Output<SubResourceArgs> backendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
     * 
     */
    @Import(name="enableTcpReset")
    private @Nullable Output<Boolean> enableTcpReset;

    public Optional<Output<Boolean>> enableTcpReset() {
        return Optional.ofNullable(this.enableTcpReset);
    }

    /**
     * The Frontend IP addresses of the load balancer.
     * 
     */
    @Import(name="frontendIPConfigurations", required=true)
    private Output<List<SubResourceArgs>> frontendIPConfigurations;

    public Output<List<SubResourceArgs>> frontendIPConfigurations() {
        return this.frontendIPConfigurations;
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
     * The timeout for the TCP idle connection.
     * 
     */
    @Import(name="idleTimeoutInMinutes")
    private @Nullable Output<Integer> idleTimeoutInMinutes;

    public Optional<Output<Integer>> idleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }

    /**
     * The name of the resource that is unique within the set of outbound rules used by the load balancer. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The protocol for the outbound rule in load balancer.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<Either<String,LoadBalancerOutboundRuleProtocol>> protocol;

    public Output<Either<String,LoadBalancerOutboundRuleProtocol>> protocol() {
        return this.protocol;
    }

    private OutboundRuleArgs() {}

    private OutboundRuleArgs(OutboundRuleArgs $) {
        this.allocatedOutboundPorts = $.allocatedOutboundPorts;
        this.backendAddressPool = $.backendAddressPool;
        this.enableTcpReset = $.enableTcpReset;
        this.frontendIPConfigurations = $.frontendIPConfigurations;
        this.id = $.id;
        this.idleTimeoutInMinutes = $.idleTimeoutInMinutes;
        this.name = $.name;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OutboundRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OutboundRuleArgs $;

        public Builder() {
            $ = new OutboundRuleArgs();
        }

        public Builder(OutboundRuleArgs defaults) {
            $ = new OutboundRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder allocatedOutboundPorts(@Nullable Output<Integer> allocatedOutboundPorts) {
            $.allocatedOutboundPorts = allocatedOutboundPorts;
            return this;
        }

        public Builder allocatedOutboundPorts(Integer allocatedOutboundPorts) {
            return allocatedOutboundPorts(Output.of(allocatedOutboundPorts));
        }

        public Builder backendAddressPool(Output<SubResourceArgs> backendAddressPool) {
            $.backendAddressPool = backendAddressPool;
            return this;
        }

        public Builder backendAddressPool(SubResourceArgs backendAddressPool) {
            return backendAddressPool(Output.of(backendAddressPool));
        }

        public Builder enableTcpReset(@Nullable Output<Boolean> enableTcpReset) {
            $.enableTcpReset = enableTcpReset;
            return this;
        }

        public Builder enableTcpReset(Boolean enableTcpReset) {
            return enableTcpReset(Output.of(enableTcpReset));
        }

        public Builder frontendIPConfigurations(Output<List<SubResourceArgs>> frontendIPConfigurations) {
            $.frontendIPConfigurations = frontendIPConfigurations;
            return this;
        }

        public Builder frontendIPConfigurations(List<SubResourceArgs> frontendIPConfigurations) {
            return frontendIPConfigurations(Output.of(frontendIPConfigurations));
        }

        public Builder frontendIPConfigurations(SubResourceArgs... frontendIPConfigurations) {
            return frontendIPConfigurations(List.of(frontendIPConfigurations));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder idleTimeoutInMinutes(@Nullable Output<Integer> idleTimeoutInMinutes) {
            $.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        public Builder idleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
            return idleTimeoutInMinutes(Output.of(idleTimeoutInMinutes));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder protocol(Output<Either<String,LoadBalancerOutboundRuleProtocol>> protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder protocol(Either<String,LoadBalancerOutboundRuleProtocol> protocol) {
            return protocol(Output.of(protocol));
        }

        public OutboundRuleArgs build() {
            $.backendAddressPool = Objects.requireNonNull($.backendAddressPool, "expected parameter 'backendAddressPool' to be non-null");
            $.frontendIPConfigurations = Objects.requireNonNull($.frontendIPConfigurations, "expected parameter 'frontendIPConfigurations' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            return $;
        }
    }

}
