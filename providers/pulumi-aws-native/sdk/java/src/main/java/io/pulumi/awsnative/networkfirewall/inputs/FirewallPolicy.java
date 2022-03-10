// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.inputs.FirewallPolicyCustomAction;
import io.pulumi.awsnative.networkfirewall.inputs.FirewallPolicyStatefulEngineOptions;
import io.pulumi.awsnative.networkfirewall.inputs.FirewallPolicyStatefulRuleGroupReference;
import io.pulumi.awsnative.networkfirewall.inputs.FirewallPolicyStatelessRuleGroupReference;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallPolicy extends io.pulumi.resources.InvokeArgs {

    public static final FirewallPolicy Empty = new FirewallPolicy();

    @InputImport(name="statefulDefaultActions")
      private final @Nullable List<String> statefulDefaultActions;

    public List<String> getStatefulDefaultActions() {
        return this.statefulDefaultActions == null ? List.of() : this.statefulDefaultActions;
    }

    @InputImport(name="statefulEngineOptions")
      private final @Nullable FirewallPolicyStatefulEngineOptions statefulEngineOptions;

    public Optional<FirewallPolicyStatefulEngineOptions> getStatefulEngineOptions() {
        return this.statefulEngineOptions == null ? Optional.empty() : Optional.ofNullable(this.statefulEngineOptions);
    }

    @InputImport(name="statefulRuleGroupReferences")
      private final @Nullable List<FirewallPolicyStatefulRuleGroupReference> statefulRuleGroupReferences;

    public List<FirewallPolicyStatefulRuleGroupReference> getStatefulRuleGroupReferences() {
        return this.statefulRuleGroupReferences == null ? List.of() : this.statefulRuleGroupReferences;
    }

    @InputImport(name="statelessCustomActions")
      private final @Nullable List<FirewallPolicyCustomAction> statelessCustomActions;

    public List<FirewallPolicyCustomAction> getStatelessCustomActions() {
        return this.statelessCustomActions == null ? List.of() : this.statelessCustomActions;
    }

    @InputImport(name="statelessDefaultActions", required=true)
      private final List<String> statelessDefaultActions;

    public List<String> getStatelessDefaultActions() {
        return this.statelessDefaultActions;
    }

    @InputImport(name="statelessFragmentDefaultActions", required=true)
      private final List<String> statelessFragmentDefaultActions;

    public List<String> getStatelessFragmentDefaultActions() {
        return this.statelessFragmentDefaultActions;
    }

    @InputImport(name="statelessRuleGroupReferences")
      private final @Nullable List<FirewallPolicyStatelessRuleGroupReference> statelessRuleGroupReferences;

    public List<FirewallPolicyStatelessRuleGroupReference> getStatelessRuleGroupReferences() {
        return this.statelessRuleGroupReferences == null ? List.of() : this.statelessRuleGroupReferences;
    }

    public FirewallPolicy(
        @Nullable List<String> statefulDefaultActions,
        @Nullable FirewallPolicyStatefulEngineOptions statefulEngineOptions,
        @Nullable List<FirewallPolicyStatefulRuleGroupReference> statefulRuleGroupReferences,
        @Nullable List<FirewallPolicyCustomAction> statelessCustomActions,
        List<String> statelessDefaultActions,
        List<String> statelessFragmentDefaultActions,
        @Nullable List<FirewallPolicyStatelessRuleGroupReference> statelessRuleGroupReferences) {
        this.statefulDefaultActions = statefulDefaultActions;
        this.statefulEngineOptions = statefulEngineOptions;
        this.statefulRuleGroupReferences = statefulRuleGroupReferences;
        this.statelessCustomActions = statelessCustomActions;
        this.statelessDefaultActions = Objects.requireNonNull(statelessDefaultActions, "expected parameter 'statelessDefaultActions' to be non-null");
        this.statelessFragmentDefaultActions = Objects.requireNonNull(statelessFragmentDefaultActions, "expected parameter 'statelessFragmentDefaultActions' to be non-null");
        this.statelessRuleGroupReferences = statelessRuleGroupReferences;
    }

    private FirewallPolicy() {
        this.statefulDefaultActions = List.of();
        this.statefulEngineOptions = null;
        this.statefulRuleGroupReferences = List.of();
        this.statelessCustomActions = List.of();
        this.statelessDefaultActions = List.of();
        this.statelessFragmentDefaultActions = List.of();
        this.statelessRuleGroupReferences = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> statefulDefaultActions;
        private @Nullable FirewallPolicyStatefulEngineOptions statefulEngineOptions;
        private @Nullable List<FirewallPolicyStatefulRuleGroupReference> statefulRuleGroupReferences;
        private @Nullable List<FirewallPolicyCustomAction> statelessCustomActions;
        private List<String> statelessDefaultActions;
        private List<String> statelessFragmentDefaultActions;
        private @Nullable List<FirewallPolicyStatelessRuleGroupReference> statelessRuleGroupReferences;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statefulDefaultActions = defaults.statefulDefaultActions;
    	      this.statefulEngineOptions = defaults.statefulEngineOptions;
    	      this.statefulRuleGroupReferences = defaults.statefulRuleGroupReferences;
    	      this.statelessCustomActions = defaults.statelessCustomActions;
    	      this.statelessDefaultActions = defaults.statelessDefaultActions;
    	      this.statelessFragmentDefaultActions = defaults.statelessFragmentDefaultActions;
    	      this.statelessRuleGroupReferences = defaults.statelessRuleGroupReferences;
        }

        public Builder statefulDefaultActions(@Nullable List<String> statefulDefaultActions) {
            this.statefulDefaultActions = statefulDefaultActions;
            return this;
        }

        public Builder statefulEngineOptions(@Nullable FirewallPolicyStatefulEngineOptions statefulEngineOptions) {
            this.statefulEngineOptions = statefulEngineOptions;
            return this;
        }

        public Builder statefulRuleGroupReferences(@Nullable List<FirewallPolicyStatefulRuleGroupReference> statefulRuleGroupReferences) {
            this.statefulRuleGroupReferences = statefulRuleGroupReferences;
            return this;
        }

        public Builder statelessCustomActions(@Nullable List<FirewallPolicyCustomAction> statelessCustomActions) {
            this.statelessCustomActions = statelessCustomActions;
            return this;
        }

        public Builder statelessDefaultActions(List<String> statelessDefaultActions) {
            this.statelessDefaultActions = Objects.requireNonNull(statelessDefaultActions);
            return this;
        }

        public Builder statelessFragmentDefaultActions(List<String> statelessFragmentDefaultActions) {
            this.statelessFragmentDefaultActions = Objects.requireNonNull(statelessFragmentDefaultActions);
            return this;
        }

        public Builder statelessRuleGroupReferences(@Nullable List<FirewallPolicyStatelessRuleGroupReference> statelessRuleGroupReferences) {
            this.statelessRuleGroupReferences = statelessRuleGroupReferences;
            return this;
        }
        public FirewallPolicy build() {
            return new FirewallPolicy(statefulDefaultActions, statefulEngineOptions, statefulRuleGroupReferences, statelessCustomActions, statelessDefaultActions, statelessFragmentDefaultActions, statelessRuleGroupReferences);
        }
    }
}
