// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbformariadb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFirewallRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFirewallRuleArgs Empty = new GetFirewallRuleArgs();

    /**
     * The name of the server firewall rule.
     * 
     */
    @Import(name="firewallRuleName", required=true)
    private String firewallRuleName;

    public String firewallRuleName() {
        return this.firewallRuleName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
    private String serverName;

    public String serverName() {
        return this.serverName;
    }

    private GetFirewallRuleArgs() {}

    private GetFirewallRuleArgs(GetFirewallRuleArgs $) {
        this.firewallRuleName = $.firewallRuleName;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirewallRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirewallRuleArgs $;

        public Builder() {
            $ = new GetFirewallRuleArgs();
        }

        public Builder(GetFirewallRuleArgs defaults) {
            $ = new GetFirewallRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder firewallRuleName(String firewallRuleName) {
            $.firewallRuleName = firewallRuleName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder serverName(String serverName) {
            $.serverName = serverName;
            return this;
        }

        public GetFirewallRuleArgs build() {
            $.firewallRuleName = Objects.requireNonNull($.firewallRuleName, "expected parameter 'firewallRuleName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
