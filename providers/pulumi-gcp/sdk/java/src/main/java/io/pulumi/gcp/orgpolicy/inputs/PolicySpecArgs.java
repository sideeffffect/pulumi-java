// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.orgpolicy.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.orgpolicy.inputs.PolicySpecRuleArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicySpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicySpecArgs Empty = new PolicySpecArgs();

    /**
     * - 
     * An opaque tag indicating the current version of the `Policy`, used for concurrency control. This field is ignored if used in a `CreatePolicy` request. When the `Policy` is returned from either a `GetPolicy` or a `ListPolicies` request, this `etag` indicates the version of the current `Policy` to use when executing a read-modify-write loop. When the `Policy` is returned from a `GetEffectivePolicy` request, the `etag` will be unset.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * Determines the inheritance behavior for this `Policy`. If `inherit_from_parent` is true, PolicyRules set higher up in the hierarchy (up to the closest root) are inherited and present in the effective policy. If it is false, then no rules are inherited, and this Policy becomes the new root for evaluation. This field can be set only for Policies which configure list constraints.
     * 
     */
    @InputImport(name="inheritFromParent")
      private final @Nullable Input<Boolean> inheritFromParent;

    public Input<Boolean> getInheritFromParent() {
        return this.inheritFromParent == null ? Input.empty() : this.inheritFromParent;
    }

    /**
     * Ignores policies set above this resource and restores the `constraint_default` enforcement behavior of the specific `Constraint` at this resource. This field can be set in policies for either list or boolean constraints. If set, `rules` must be empty and `inherit_from_parent` must be set to false.
     * 
     */
    @InputImport(name="reset")
      private final @Nullable Input<Boolean> reset;

    public Input<Boolean> getReset() {
        return this.reset == null ? Input.empty() : this.reset;
    }

    /**
     * Up to 10 PolicyRules are allowed. In Policies for boolean constraints, the following requirements apply: - There must be one and only one PolicyRule where condition is unset. - BooleanPolicyRules with conditions must set `enforced` to the opposite of the PolicyRule without a condition. - During policy evaluation, PolicyRules with conditions that are true for a target resource take precedence.
     * 
     */
    @InputImport(name="rules")
      private final @Nullable Input<List<PolicySpecRuleArgs>> rules;

    public Input<List<PolicySpecRuleArgs>> getRules() {
        return this.rules == null ? Input.empty() : this.rules;
    }

    /**
     * - 
     * Output only. The time stamp this was previously updated. This represents the last time a call to `CreatePolicy` or `UpdatePolicy` was made for that `Policy`.
     * 
     */
    @InputImport(name="updateTime")
      private final @Nullable Input<String> updateTime;

    public Input<String> getUpdateTime() {
        return this.updateTime == null ? Input.empty() : this.updateTime;
    }

    public PolicySpecArgs(
        @Nullable Input<String> etag,
        @Nullable Input<Boolean> inheritFromParent,
        @Nullable Input<Boolean> reset,
        @Nullable Input<List<PolicySpecRuleArgs>> rules,
        @Nullable Input<String> updateTime) {
        this.etag = etag;
        this.inheritFromParent = inheritFromParent;
        this.reset = reset;
        this.rules = rules;
        this.updateTime = updateTime;
    }

    private PolicySpecArgs() {
        this.etag = Input.empty();
        this.inheritFromParent = Input.empty();
        this.reset = Input.empty();
        this.rules = Input.empty();
        this.updateTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicySpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> etag;
        private @Nullable Input<Boolean> inheritFromParent;
        private @Nullable Input<Boolean> reset;
        private @Nullable Input<List<PolicySpecRuleArgs>> rules;
        private @Nullable Input<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicySpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.inheritFromParent = defaults.inheritFromParent;
    	      this.reset = defaults.reset;
    	      this.rules = defaults.rules;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder etag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder inheritFromParent(@Nullable Input<Boolean> inheritFromParent) {
            this.inheritFromParent = inheritFromParent;
            return this;
        }

        public Builder inheritFromParent(@Nullable Boolean inheritFromParent) {
            this.inheritFromParent = Input.ofNullable(inheritFromParent);
            return this;
        }

        public Builder reset(@Nullable Input<Boolean> reset) {
            this.reset = reset;
            return this;
        }

        public Builder reset(@Nullable Boolean reset) {
            this.reset = Input.ofNullable(reset);
            return this;
        }

        public Builder rules(@Nullable Input<List<PolicySpecRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder rules(@Nullable List<PolicySpecRuleArgs> rules) {
            this.rules = Input.ofNullable(rules);
            return this;
        }

        public Builder updateTime(@Nullable Input<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = Input.ofNullable(updateTime);
            return this;
        }
        public PolicySpecArgs build() {
            return new PolicySpecArgs(etag, inheritFromParent, reset, rules, updateTime);
        }
    }
}
