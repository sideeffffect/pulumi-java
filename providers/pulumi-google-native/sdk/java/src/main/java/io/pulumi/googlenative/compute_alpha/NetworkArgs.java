// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.NetworkNetworkFirewallPolicyEnforcementOrder;
import io.pulumi.googlenative.compute_alpha.inputs.NetworkRoutingConfigArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkArgs Empty = new NetworkArgs();

    /**
     * Must be set to create a VPC network. If not set, a legacy network is created. When set to true, the VPC network is created in auto mode. When set to false, the VPC network is created in custom mode. An auto mode VPC network starts with one subnet per region. Each subnet has a predetermined range as described in Auto mode VPC network IP ranges. For custom mode VPC networks, you can add subnets using the subnetworks insert method.
     * 
     */
    @InputImport(name="autoCreateSubnetworks")
      private final @Nullable Input<Boolean> autoCreateSubnetworks;

    public Input<Boolean> getAutoCreateSubnetworks() {
        return this.autoCreateSubnetworks == null ? Input.empty() : this.autoCreateSubnetworks;
    }

    /**
     * An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Enable ULA internal ipv6 on this network. Enabling this feature will assign a /48 from google defined ULA prefix fd20::/20. .
     * 
     */
    @InputImport(name="enableUlaInternalIpv6")
      private final @Nullable Input<Boolean> enableUlaInternalIpv6;

    public Input<Boolean> getEnableUlaInternalIpv6() {
        return this.enableUlaInternalIpv6 == null ? Input.empty() : this.enableUlaInternalIpv6;
    }

    /**
     * When enabling ula internal ipv6, caller optionally can specify the /48 range they want from the google defined ULA prefix fd20::/20. The input must be a valid /48 ULA IPv6 address and must be within the fd20::/20. Operation will fail if the speficied /48 is already in used by another resource. If the field is not speficied, then a /48 range will be randomly allocated from fd20::/20 and returned via this field. .
     * 
     */
    @InputImport(name="internalIpv6Range")
      private final @Nullable Input<String> internalIpv6Range;

    public Input<String> getInternalIpv6Range() {
        return this.internalIpv6Range == null ? Input.empty() : this.internalIpv6Range;
    }

    /**
     * Maximum Transmission Unit in bytes. The minimum value for this field is 1460 and the maximum value is 1500 bytes. If unspecified, defaults to 1460.
     * 
     */
    @InputImport(name="mtu")
      private final @Nullable Input<Integer> mtu;

    public Input<Integer> getMtu() {
        return this.mtu == null ? Input.empty() : this.mtu;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="networkFirewallPolicyEnforcementOrder")
      private final @Nullable Input<NetworkNetworkFirewallPolicyEnforcementOrder> networkFirewallPolicyEnforcementOrder;

    public Input<NetworkNetworkFirewallPolicyEnforcementOrder> getNetworkFirewallPolicyEnforcementOrder() {
        return this.networkFirewallPolicyEnforcementOrder == null ? Input.empty() : this.networkFirewallPolicyEnforcementOrder;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * The network-level routing configuration for this network. Used by Cloud Router to determine what type of network-wide routing behavior to enforce.
     * 
     */
    @InputImport(name="routingConfig")
      private final @Nullable Input<NetworkRoutingConfigArgs> routingConfig;

    public Input<NetworkRoutingConfigArgs> getRoutingConfig() {
        return this.routingConfig == null ? Input.empty() : this.routingConfig;
    }

    public NetworkArgs(
        @Nullable Input<Boolean> autoCreateSubnetworks,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> enableUlaInternalIpv6,
        @Nullable Input<String> internalIpv6Range,
        @Nullable Input<Integer> mtu,
        @Nullable Input<String> name,
        @Nullable Input<NetworkNetworkFirewallPolicyEnforcementOrder> networkFirewallPolicyEnforcementOrder,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<NetworkRoutingConfigArgs> routingConfig) {
        this.autoCreateSubnetworks = autoCreateSubnetworks;
        this.description = description;
        this.enableUlaInternalIpv6 = enableUlaInternalIpv6;
        this.internalIpv6Range = internalIpv6Range;
        this.mtu = mtu;
        this.name = name;
        this.networkFirewallPolicyEnforcementOrder = networkFirewallPolicyEnforcementOrder;
        this.project = project;
        this.requestId = requestId;
        this.routingConfig = routingConfig;
    }

    private NetworkArgs() {
        this.autoCreateSubnetworks = Input.empty();
        this.description = Input.empty();
        this.enableUlaInternalIpv6 = Input.empty();
        this.internalIpv6Range = Input.empty();
        this.mtu = Input.empty();
        this.name = Input.empty();
        this.networkFirewallPolicyEnforcementOrder = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.routingConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoCreateSubnetworks;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> enableUlaInternalIpv6;
        private @Nullable Input<String> internalIpv6Range;
        private @Nullable Input<Integer> mtu;
        private @Nullable Input<String> name;
        private @Nullable Input<NetworkNetworkFirewallPolicyEnforcementOrder> networkFirewallPolicyEnforcementOrder;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<NetworkRoutingConfigArgs> routingConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoCreateSubnetworks = defaults.autoCreateSubnetworks;
    	      this.description = defaults.description;
    	      this.enableUlaInternalIpv6 = defaults.enableUlaInternalIpv6;
    	      this.internalIpv6Range = defaults.internalIpv6Range;
    	      this.mtu = defaults.mtu;
    	      this.name = defaults.name;
    	      this.networkFirewallPolicyEnforcementOrder = defaults.networkFirewallPolicyEnforcementOrder;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.routingConfig = defaults.routingConfig;
        }

        public Builder autoCreateSubnetworks(@Nullable Input<Boolean> autoCreateSubnetworks) {
            this.autoCreateSubnetworks = autoCreateSubnetworks;
            return this;
        }

        public Builder autoCreateSubnetworks(@Nullable Boolean autoCreateSubnetworks) {
            this.autoCreateSubnetworks = Input.ofNullable(autoCreateSubnetworks);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder enableUlaInternalIpv6(@Nullable Input<Boolean> enableUlaInternalIpv6) {
            this.enableUlaInternalIpv6 = enableUlaInternalIpv6;
            return this;
        }

        public Builder enableUlaInternalIpv6(@Nullable Boolean enableUlaInternalIpv6) {
            this.enableUlaInternalIpv6 = Input.ofNullable(enableUlaInternalIpv6);
            return this;
        }

        public Builder internalIpv6Range(@Nullable Input<String> internalIpv6Range) {
            this.internalIpv6Range = internalIpv6Range;
            return this;
        }

        public Builder internalIpv6Range(@Nullable String internalIpv6Range) {
            this.internalIpv6Range = Input.ofNullable(internalIpv6Range);
            return this;
        }

        public Builder mtu(@Nullable Input<Integer> mtu) {
            this.mtu = mtu;
            return this;
        }

        public Builder mtu(@Nullable Integer mtu) {
            this.mtu = Input.ofNullable(mtu);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder networkFirewallPolicyEnforcementOrder(@Nullable Input<NetworkNetworkFirewallPolicyEnforcementOrder> networkFirewallPolicyEnforcementOrder) {
            this.networkFirewallPolicyEnforcementOrder = networkFirewallPolicyEnforcementOrder;
            return this;
        }

        public Builder networkFirewallPolicyEnforcementOrder(@Nullable NetworkNetworkFirewallPolicyEnforcementOrder networkFirewallPolicyEnforcementOrder) {
            this.networkFirewallPolicyEnforcementOrder = Input.ofNullable(networkFirewallPolicyEnforcementOrder);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder requestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder routingConfig(@Nullable Input<NetworkRoutingConfigArgs> routingConfig) {
            this.routingConfig = routingConfig;
            return this;
        }

        public Builder routingConfig(@Nullable NetworkRoutingConfigArgs routingConfig) {
            this.routingConfig = Input.ofNullable(routingConfig);
            return this;
        }
        public NetworkArgs build() {
            return new NetworkArgs(autoCreateSubnetworks, description, enableUlaInternalIpv6, internalIpv6Range, mtu, name, networkFirewallPolicyEnforcementOrder, project, requestId, routingConfig);
        }
    }
}
