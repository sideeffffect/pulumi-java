// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFirewallPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFirewallPolicyPlainArgs Empty = new GetFirewallPolicyPlainArgs();

    @Import(name="firewallPolicy", required=true)
    private String firewallPolicy;

    public String firewallPolicy() {
        return this.firewallPolicy;
    }

    private GetFirewallPolicyPlainArgs() {}

    private GetFirewallPolicyPlainArgs(GetFirewallPolicyPlainArgs $) {
        this.firewallPolicy = $.firewallPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirewallPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirewallPolicyPlainArgs $;

        public Builder() {
            $ = new GetFirewallPolicyPlainArgs();
        }

        public Builder(GetFirewallPolicyPlainArgs defaults) {
            $ = new GetFirewallPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder firewallPolicy(String firewallPolicy) {
            $.firewallPolicy = firewallPolicy;
            return this;
        }

        public GetFirewallPolicyPlainArgs build() {
            $.firewallPolicy = Objects.requireNonNull($.firewallPolicy, "expected parameter 'firewallPolicy' to be non-null");
            return $;
        }
    }

}
