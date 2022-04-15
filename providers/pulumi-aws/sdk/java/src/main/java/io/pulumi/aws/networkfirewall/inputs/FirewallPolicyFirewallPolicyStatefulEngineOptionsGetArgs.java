// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class FirewallPolicyFirewallPolicyStatefulEngineOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyFirewallPolicyStatefulEngineOptionsGetArgs Empty = new FirewallPolicyFirewallPolicyStatefulEngineOptionsGetArgs();

    /**
     * Indicates how to manage the order of stateful rule evaluation for the policy. Default value: `DEFAULT_ACTION_ORDER`. Valid values: `DEFAULT_ACTION_ORDER`, `STRICT_ORDER`.
     * 
     */
    @Import(name="ruleOrder", required=true)
      private final Output<String> ruleOrder;

    public Output<String> ruleOrder() {
        return this.ruleOrder;
    }

    public FirewallPolicyFirewallPolicyStatefulEngineOptionsGetArgs(Output<String> ruleOrder) {
        this.ruleOrder = Objects.requireNonNull(ruleOrder, "expected parameter 'ruleOrder' to be non-null");
    }

    private FirewallPolicyFirewallPolicyStatefulEngineOptionsGetArgs() {
        this.ruleOrder = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFirewallPolicyStatefulEngineOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> ruleOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyFirewallPolicyStatefulEngineOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleOrder = defaults.ruleOrder;
        }

        public Builder ruleOrder(Output<String> ruleOrder) {
            this.ruleOrder = Objects.requireNonNull(ruleOrder);
            return this;
        }
        public Builder ruleOrder(String ruleOrder) {
            this.ruleOrder = Output.of(Objects.requireNonNull(ruleOrder));
            return this;
        }        public FirewallPolicyFirewallPolicyStatefulEngineOptionsGetArgs build() {
            return new FirewallPolicyFirewallPolicyStatefulEngineOptionsGetArgs(ruleOrder);
        }
    }
}
