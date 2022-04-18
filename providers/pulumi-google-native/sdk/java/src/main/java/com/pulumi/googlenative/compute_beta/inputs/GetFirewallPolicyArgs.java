// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFirewallPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFirewallPolicyArgs Empty = new GetFirewallPolicyArgs();

    @Import(name="firewallPolicy", required=true)
      private final String firewallPolicy;

    public String firewallPolicy() {
        return this.firewallPolicy;
    }

    public GetFirewallPolicyArgs(String firewallPolicy) {
        this.firewallPolicy = Objects.requireNonNull(firewallPolicy, "expected parameter 'firewallPolicy' to be non-null");
    }

    private GetFirewallPolicyArgs() {
        this.firewallPolicy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String firewallPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firewallPolicy = defaults.firewallPolicy;
        }

        public Builder firewallPolicy(String firewallPolicy) {
            this.firewallPolicy = Objects.requireNonNull(firewallPolicy);
            return this;
        }        public GetFirewallPolicyArgs build() {
            return new GetFirewallPolicyArgs(firewallPolicy);
        }
    }
}
