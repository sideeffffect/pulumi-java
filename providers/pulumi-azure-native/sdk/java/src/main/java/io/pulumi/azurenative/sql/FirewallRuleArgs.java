// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallRuleArgs Empty = new FirewallRuleArgs();

    /**
     * The end IP address of the firewall rule. Must be IPv4 format. Must be greater than or equal to startIpAddress. Use value '0.0.0.0' for all Azure-internal IP addresses.
     * 
     */
    @InputImport(name="endIpAddress")
      private final @Nullable Input<String> endIpAddress;

    public Input<String> getEndIpAddress() {
        return this.endIpAddress == null ? Input.empty() : this.endIpAddress;
    }

    /**
     * The name of the firewall rule.
     * 
     */
    @InputImport(name="firewallRuleName")
      private final @Nullable Input<String> firewallRuleName;

    public Input<String> getFirewallRuleName() {
        return this.firewallRuleName == null ? Input.empty() : this.firewallRuleName;
    }

    /**
     * Resource name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @InputImport(name="serverName", required=true)
      private final Input<String> serverName;

    public Input<String> getServerName() {
        return this.serverName;
    }

    /**
     * The start IP address of the firewall rule. Must be IPv4 format. Use value '0.0.0.0' for all Azure-internal IP addresses.
     * 
     */
    @InputImport(name="startIpAddress")
      private final @Nullable Input<String> startIpAddress;

    public Input<String> getStartIpAddress() {
        return this.startIpAddress == null ? Input.empty() : this.startIpAddress;
    }

    public FirewallRuleArgs(
        @Nullable Input<String> endIpAddress,
        @Nullable Input<String> firewallRuleName,
        @Nullable Input<String> name,
        Input<String> resourceGroupName,
        Input<String> serverName,
        @Nullable Input<String> startIpAddress) {
        this.endIpAddress = endIpAddress;
        this.firewallRuleName = firewallRuleName;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.startIpAddress = startIpAddress;
    }

    private FirewallRuleArgs() {
        this.endIpAddress = Input.empty();
        this.firewallRuleName = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serverName = Input.empty();
        this.startIpAddress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> endIpAddress;
        private @Nullable Input<String> firewallRuleName;
        private @Nullable Input<String> name;
        private Input<String> resourceGroupName;
        private Input<String> serverName;
        private @Nullable Input<String> startIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endIpAddress = defaults.endIpAddress;
    	      this.firewallRuleName = defaults.firewallRuleName;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
    	      this.startIpAddress = defaults.startIpAddress;
        }

        public Builder endIpAddress(@Nullable Input<String> endIpAddress) {
            this.endIpAddress = endIpAddress;
            return this;
        }

        public Builder endIpAddress(@Nullable String endIpAddress) {
            this.endIpAddress = Input.ofNullable(endIpAddress);
            return this;
        }

        public Builder firewallRuleName(@Nullable Input<String> firewallRuleName) {
            this.firewallRuleName = firewallRuleName;
            return this;
        }

        public Builder firewallRuleName(@Nullable String firewallRuleName) {
            this.firewallRuleName = Input.ofNullable(firewallRuleName);
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

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder serverName(Input<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder serverName(String serverName) {
            this.serverName = Input.of(Objects.requireNonNull(serverName));
            return this;
        }

        public Builder startIpAddress(@Nullable Input<String> startIpAddress) {
            this.startIpAddress = startIpAddress;
            return this;
        }

        public Builder startIpAddress(@Nullable String startIpAddress) {
            this.startIpAddress = Input.ofNullable(startIpAddress);
            return this;
        }
        public FirewallRuleArgs build() {
            return new FirewallRuleArgs(endIpAddress, firewallRuleName, name, resourceGroupName, serverName, startIpAddress);
        }
    }
}
