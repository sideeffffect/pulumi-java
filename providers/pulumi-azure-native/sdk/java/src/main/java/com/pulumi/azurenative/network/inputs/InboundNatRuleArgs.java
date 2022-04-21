// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.TransportProtocol;
import com.pulumi.azurenative.network.inputs.SubResourceArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Inbound NAT rule of the load balancer.
 * 
 */
public final class InboundNatRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final InboundNatRuleArgs Empty = new InboundNatRuleArgs();

    /**
     * The port used for the internal endpoint. Acceptable values range from 1 to 65535.
     * 
     */
    @Import(name="backendPort")
    private @Nullable Output<Integer> backendPort;

    public Optional<Output<Integer>> backendPort() {
        return Optional.ofNullable(this.backendPort);
    }

    /**
     * Configures a virtual machine&#39;s endpoint for the floating IP capability required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn Availability Groups in SQL server. This setting can&#39;t be changed after you create the endpoint.
     * 
     */
    @Import(name="enableFloatingIP")
    private @Nullable Output<Boolean> enableFloatingIP;

    public Optional<Output<Boolean>> enableFloatingIP() {
        return Optional.ofNullable(this.enableFloatingIP);
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
     * A reference to frontend IP addresses.
     * 
     */
    @Import(name="frontendIPConfiguration")
    private @Nullable Output<SubResourceArgs> frontendIPConfiguration;

    public Optional<Output<SubResourceArgs>> frontendIPConfiguration() {
        return Optional.ofNullable(this.frontendIPConfiguration);
    }

    /**
     * The port for the external endpoint. Port numbers for each rule must be unique within the Load Balancer. Acceptable values range from 1 to 65534.
     * 
     */
    @Import(name="frontendPort")
    private @Nullable Output<Integer> frontendPort;

    public Optional<Output<Integer>> frontendPort() {
        return Optional.ofNullable(this.frontendPort);
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
     * The timeout for the TCP idle connection. The value can be set between 4 and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     * 
     */
    @Import(name="idleTimeoutInMinutes")
    private @Nullable Output<Integer> idleTimeoutInMinutes;

    public Optional<Output<Integer>> idleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }

    /**
     * The name of the resource that is unique within the set of inbound NAT rules used by the load balancer. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The reference to the transport protocol used by the load balancing rule.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<Either<String,TransportProtocol>> protocol;

    public Optional<Output<Either<String,TransportProtocol>>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    private InboundNatRuleArgs() {}

    private InboundNatRuleArgs(InboundNatRuleArgs $) {
        this.backendPort = $.backendPort;
        this.enableFloatingIP = $.enableFloatingIP;
        this.enableTcpReset = $.enableTcpReset;
        this.frontendIPConfiguration = $.frontendIPConfiguration;
        this.frontendPort = $.frontendPort;
        this.id = $.id;
        this.idleTimeoutInMinutes = $.idleTimeoutInMinutes;
        this.name = $.name;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InboundNatRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InboundNatRuleArgs $;

        public Builder() {
            $ = new InboundNatRuleArgs();
        }

        public Builder(InboundNatRuleArgs defaults) {
            $ = new InboundNatRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder backendPort(@Nullable Output<Integer> backendPort) {
            $.backendPort = backendPort;
            return this;
        }

        public Builder backendPort(Integer backendPort) {
            return backendPort(Output.of(backendPort));
        }

        public Builder enableFloatingIP(@Nullable Output<Boolean> enableFloatingIP) {
            $.enableFloatingIP = enableFloatingIP;
            return this;
        }

        public Builder enableFloatingIP(Boolean enableFloatingIP) {
            return enableFloatingIP(Output.of(enableFloatingIP));
        }

        public Builder enableTcpReset(@Nullable Output<Boolean> enableTcpReset) {
            $.enableTcpReset = enableTcpReset;
            return this;
        }

        public Builder enableTcpReset(Boolean enableTcpReset) {
            return enableTcpReset(Output.of(enableTcpReset));
        }

        public Builder frontendIPConfiguration(@Nullable Output<SubResourceArgs> frontendIPConfiguration) {
            $.frontendIPConfiguration = frontendIPConfiguration;
            return this;
        }

        public Builder frontendIPConfiguration(SubResourceArgs frontendIPConfiguration) {
            return frontendIPConfiguration(Output.of(frontendIPConfiguration));
        }

        public Builder frontendPort(@Nullable Output<Integer> frontendPort) {
            $.frontendPort = frontendPort;
            return this;
        }

        public Builder frontendPort(Integer frontendPort) {
            return frontendPort(Output.of(frontendPort));
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

        public Builder protocol(@Nullable Output<Either<String,TransportProtocol>> protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder protocol(Either<String,TransportProtocol> protocol) {
            return protocol(Output.of(protocol));
        }

        public InboundNatRuleArgs build() {
            return $;
        }
    }

}
