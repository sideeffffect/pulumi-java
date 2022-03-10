// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IpFirewallRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final IpFirewallRuleArgs Empty = new IpFirewallRuleArgs();

    /**
     * The end IP address of the firewall rule. Must be IPv4 format. Must be greater than or equal to startIpAddress
     * 
     */
    @InputImport(name="endIpAddress")
      private final @Nullable Input<String> endIpAddress;

    public Input<String> getEndIpAddress() {
        return this.endIpAddress == null ? Input.empty() : this.endIpAddress;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The IP firewall rule name
     * 
     */
    @InputImport(name="ruleName")
      private final @Nullable Input<String> ruleName;

    public Input<String> getRuleName() {
        return this.ruleName == null ? Input.empty() : this.ruleName;
    }

    /**
     * The start IP address of the firewall rule. Must be IPv4 format
     * 
     */
    @InputImport(name="startIpAddress")
      private final @Nullable Input<String> startIpAddress;

    public Input<String> getStartIpAddress() {
        return this.startIpAddress == null ? Input.empty() : this.startIpAddress;
    }

    /**
     * The name of the workspace
     * 
     */
    @InputImport(name="workspaceName", required=true)
      private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public IpFirewallRuleArgs(
        @Nullable Input<String> endIpAddress,
        Input<String> resourceGroupName,
        @Nullable Input<String> ruleName,
        @Nullable Input<String> startIpAddress,
        Input<String> workspaceName) {
        this.endIpAddress = endIpAddress;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleName = ruleName;
        this.startIpAddress = startIpAddress;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private IpFirewallRuleArgs() {
        this.endIpAddress = Input.empty();
        this.resourceGroupName = Input.empty();
        this.ruleName = Input.empty();
        this.startIpAddress = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpFirewallRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> endIpAddress;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> ruleName;
        private @Nullable Input<String> startIpAddress;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(IpFirewallRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endIpAddress = defaults.endIpAddress;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleName = defaults.ruleName;
    	      this.startIpAddress = defaults.startIpAddress;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder endIpAddress(@Nullable Input<String> endIpAddress) {
            this.endIpAddress = endIpAddress;
            return this;
        }

        public Builder endIpAddress(@Nullable String endIpAddress) {
            this.endIpAddress = Input.ofNullable(endIpAddress);
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

        public Builder ruleName(@Nullable Input<String> ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        public Builder ruleName(@Nullable String ruleName) {
            this.ruleName = Input.ofNullable(ruleName);
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

        public Builder workspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }
        public IpFirewallRuleArgs build() {
            return new IpFirewallRuleArgs(endIpAddress, resourceGroupName, ruleName, startIpAddress, workspaceName);
        }
    }
}
