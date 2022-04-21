// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FirewallPolicyFirewallPolicyStatefulEngineOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyFirewallPolicyStatefulEngineOptionsArgs Empty = new FirewallPolicyFirewallPolicyStatefulEngineOptionsArgs();

    /**
     * Indicates how to manage the order of stateful rule evaluation for the policy. Default value: `DEFAULT_ACTION_ORDER`. Valid values: `DEFAULT_ACTION_ORDER`, `STRICT_ORDER`.
     * 
     */
    @Import(name="ruleOrder", required=true)
    private Output<String> ruleOrder;

    public Output<String> ruleOrder() {
        return this.ruleOrder;
    }

    private FirewallPolicyFirewallPolicyStatefulEngineOptionsArgs() {}

    private FirewallPolicyFirewallPolicyStatefulEngineOptionsArgs(FirewallPolicyFirewallPolicyStatefulEngineOptionsArgs $) {
        this.ruleOrder = $.ruleOrder;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyFirewallPolicyStatefulEngineOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyFirewallPolicyStatefulEngineOptionsArgs $;

        public Builder() {
            $ = new FirewallPolicyFirewallPolicyStatefulEngineOptionsArgs();
        }

        public Builder(FirewallPolicyFirewallPolicyStatefulEngineOptionsArgs defaults) {
            $ = new FirewallPolicyFirewallPolicyStatefulEngineOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder ruleOrder(Output<String> ruleOrder) {
            $.ruleOrder = ruleOrder;
            return this;
        }

        public Builder ruleOrder(String ruleOrder) {
            return ruleOrder(Output.of(ruleOrder));
        }

        public FirewallPolicyFirewallPolicyStatefulEngineOptionsArgs build() {
            $.ruleOrder = Objects.requireNonNull($.ruleOrder, "expected parameter 'ruleOrder' to be non-null");
            return $;
        }
    }

}
