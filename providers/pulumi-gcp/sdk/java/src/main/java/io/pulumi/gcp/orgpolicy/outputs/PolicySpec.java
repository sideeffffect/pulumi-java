// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.orgpolicy.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.orgpolicy.outputs.PolicySpecRule;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PolicySpec {
    /**
     * - 
     * An opaque tag indicating the current version of the `Policy`, used for concurrency control. This field is ignored if used in a `CreatePolicy` request. When the `Policy` is returned from either a `GetPolicy` or a `ListPolicies` request, this `etag` indicates the version of the current `Policy` to use when executing a read-modify-write loop. When the `Policy` is returned from a `GetEffectivePolicy` request, the `etag` will be unset.
     * 
     */
    private final @Nullable String etag;
    /**
     * Determines the inheritance behavior for this `Policy`. If `inherit_from_parent` is true, PolicyRules set higher up in the hierarchy (up to the closest root) are inherited and present in the effective policy. If it is false, then no rules are inherited, and this Policy becomes the new root for evaluation. This field can be set only for Policies which configure list constraints.
     * 
     */
    private final @Nullable Boolean inheritFromParent;
    /**
     * Ignores policies set above this resource and restores the `constraint_default` enforcement behavior of the specific `Constraint` at this resource. This field can be set in policies for either list or boolean constraints. If set, `rules` must be empty and `inherit_from_parent` must be set to false.
     * 
     */
    private final @Nullable Boolean reset;
    /**
     * Up to 10 PolicyRules are allowed. In Policies for boolean constraints, the following requirements apply: - There must be one and only one PolicyRule where condition is unset. - BooleanPolicyRules with conditions must set `enforced` to the opposite of the PolicyRule without a condition. - During policy evaluation, PolicyRules with conditions that are true for a target resource take precedence.
     * 
     */
    private final @Nullable List<PolicySpecRule> rules;
    /**
     * - 
     * Output only. The time stamp this was previously updated. This represents the last time a call to `CreatePolicy` or `UpdatePolicy` was made for that `Policy`.
     * 
     */
    private final @Nullable String updateTime;

    @OutputCustomType.Constructor
    private PolicySpec(
        @OutputCustomType.Parameter("etag") @Nullable String etag,
        @OutputCustomType.Parameter("inheritFromParent") @Nullable Boolean inheritFromParent,
        @OutputCustomType.Parameter("reset") @Nullable Boolean reset,
        @OutputCustomType.Parameter("rules") @Nullable List<PolicySpecRule> rules,
        @OutputCustomType.Parameter("updateTime") @Nullable String updateTime) {
        this.etag = etag;
        this.inheritFromParent = inheritFromParent;
        this.reset = reset;
        this.rules = rules;
        this.updateTime = updateTime;
    }

    /**
     * - 
     * An opaque tag indicating the current version of the `Policy`, used for concurrency control. This field is ignored if used in a `CreatePolicy` request. When the `Policy` is returned from either a `GetPolicy` or a `ListPolicies` request, this `etag` indicates the version of the current `Policy` to use when executing a read-modify-write loop. When the `Policy` is returned from a `GetEffectivePolicy` request, the `etag` will be unset.
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Determines the inheritance behavior for this `Policy`. If `inherit_from_parent` is true, PolicyRules set higher up in the hierarchy (up to the closest root) are inherited and present in the effective policy. If it is false, then no rules are inherited, and this Policy becomes the new root for evaluation. This field can be set only for Policies which configure list constraints.
     * 
    */
    public Optional<Boolean> getInheritFromParent() {
        return Optional.ofNullable(this.inheritFromParent);
    }
    /**
     * Ignores policies set above this resource and restores the `constraint_default` enforcement behavior of the specific `Constraint` at this resource. This field can be set in policies for either list or boolean constraints. If set, `rules` must be empty and `inherit_from_parent` must be set to false.
     * 
    */
    public Optional<Boolean> getReset() {
        return Optional.ofNullable(this.reset);
    }
    /**
     * Up to 10 PolicyRules are allowed. In Policies for boolean constraints, the following requirements apply: - There must be one and only one PolicyRule where condition is unset. - BooleanPolicyRules with conditions must set `enforced` to the opposite of the PolicyRule without a condition. - During policy evaluation, PolicyRules with conditions that are true for a target resource take precedence.
     * 
    */
    public List<PolicySpecRule> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }
    /**
     * - 
     * Output only. The time stamp this was previously updated. This represents the last time a call to `CreatePolicy` or `UpdatePolicy` was made for that `Policy`.
     * 
    */
    public Optional<String> getUpdateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicySpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String etag;
        private @Nullable Boolean inheritFromParent;
        private @Nullable Boolean reset;
        private @Nullable List<PolicySpecRule> rules;
        private @Nullable String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicySpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.inheritFromParent = defaults.inheritFromParent;
    	      this.reset = defaults.reset;
    	      this.rules = defaults.rules;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder inheritFromParent(@Nullable Boolean inheritFromParent) {
            this.inheritFromParent = inheritFromParent;
            return this;
        }

        public Builder reset(@Nullable Boolean reset) {
            this.reset = reset;
            return this;
        }

        public Builder rules(@Nullable List<PolicySpecRule> rules) {
            this.rules = rules;
            return this;
        }

        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public PolicySpec build() {
            return new PolicySpec(etag, inheritFromParent, reset, rules, updateTime);
        }
    }
}
