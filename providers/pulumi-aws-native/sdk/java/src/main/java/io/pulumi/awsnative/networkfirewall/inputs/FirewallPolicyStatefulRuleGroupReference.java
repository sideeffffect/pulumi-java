// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallPolicyStatefulRuleGroupReference extends io.pulumi.resources.InvokeArgs {

    public static final FirewallPolicyStatefulRuleGroupReference Empty = new FirewallPolicyStatefulRuleGroupReference();

    @InputImport(name="priority")
      private final @Nullable Integer priority;

    public Optional<Integer> getPriority() {
        return this.priority == null ? Optional.empty() : Optional.ofNullable(this.priority);
    }

    @InputImport(name="resourceArn", required=true)
      private final String resourceArn;

    public String getResourceArn() {
        return this.resourceArn;
    }

    public FirewallPolicyStatefulRuleGroupReference(
        @Nullable Integer priority,
        String resourceArn) {
        this.priority = priority;
        this.resourceArn = Objects.requireNonNull(resourceArn, "expected parameter 'resourceArn' to be non-null");
    }

    private FirewallPolicyStatefulRuleGroupReference() {
        this.priority = null;
        this.resourceArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyStatefulRuleGroupReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer priority;
        private String resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyStatefulRuleGroupReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }
        public FirewallPolicyStatefulRuleGroupReference build() {
            return new FirewallPolicyStatefulRuleGroupReference(priority, resourceArn);
        }
    }
}
