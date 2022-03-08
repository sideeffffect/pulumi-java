// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirewallPolicyFirewallPolicyStatefulRuleGroupReference {
    /**
     * An integer setting that indicates the order in which to apply the stateful rule groups in a single policy. This argument must be specified if the policy has a `stateful_engine_options` block with a `rule_order` value of `STRICT_ORDER`. AWS Network Firewall applies each stateful rule group to a packet starting with the group that has the lowest priority setting.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * The Amazon Resource Name (ARN) of the stateful rule group.
     * 
     */
    private final String resourceArn;

    @OutputCustomType.Constructor({"priority","resourceArn"})
    private FirewallPolicyFirewallPolicyStatefulRuleGroupReference(
        @Nullable Integer priority,
        String resourceArn) {
        this.priority = priority;
        this.resourceArn = resourceArn;
    }

    /**
     * An integer setting that indicates the order in which to apply the stateful rule groups in a single policy. This argument must be specified if the policy has a `stateful_engine_options` block with a `rule_order` value of `STRICT_ORDER`. AWS Network Firewall applies each stateful rule group to a packet starting with the group that has the lowest priority setting.
     * 
    */
    public Optional<Integer> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * The Amazon Resource Name (ARN) of the stateful rule group.
     * 
    */
    public String getResourceArn() {
        return this.resourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFirewallPolicyStatefulRuleGroupReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer priority;
        private String resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyFirewallPolicyStatefulRuleGroupReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder setResourceArn(String resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }
        public FirewallPolicyFirewallPolicyStatefulRuleGroupReference build() {
            return new FirewallPolicyFirewallPolicyStatefulRuleGroupReference(priority, resourceArn);
        }
    }
}
