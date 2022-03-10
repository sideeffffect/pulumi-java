// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.enums.RuleGroupGeneratedRulesType;
import io.pulumi.awsnative.networkfirewall.enums.RuleGroupTargetType;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRulesSourceList extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupRulesSourceList Empty = new RuleGroupRulesSourceList();

    @InputImport(name="generatedRulesType", required=true)
      private final RuleGroupGeneratedRulesType generatedRulesType;

    public RuleGroupGeneratedRulesType getGeneratedRulesType() {
        return this.generatedRulesType;
    }

    @InputImport(name="targetTypes", required=true)
      private final List<RuleGroupTargetType> targetTypes;

    public List<RuleGroupTargetType> getTargetTypes() {
        return this.targetTypes;
    }

    @InputImport(name="targets", required=true)
      private final List<String> targets;

    public List<String> getTargets() {
        return this.targets;
    }

    public RuleGroupRulesSourceList(
        RuleGroupGeneratedRulesType generatedRulesType,
        List<RuleGroupTargetType> targetTypes,
        List<String> targets) {
        this.generatedRulesType = Objects.requireNonNull(generatedRulesType, "expected parameter 'generatedRulesType' to be non-null");
        this.targetTypes = Objects.requireNonNull(targetTypes, "expected parameter 'targetTypes' to be non-null");
        this.targets = Objects.requireNonNull(targets, "expected parameter 'targets' to be non-null");
    }

    private RuleGroupRulesSourceList() {
        this.generatedRulesType = null;
        this.targetTypes = List.of();
        this.targets = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRulesSourceList defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupGeneratedRulesType generatedRulesType;
        private List<RuleGroupTargetType> targetTypes;
        private List<String> targets;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRulesSourceList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.generatedRulesType = defaults.generatedRulesType;
    	      this.targetTypes = defaults.targetTypes;
    	      this.targets = defaults.targets;
        }

        public Builder generatedRulesType(RuleGroupGeneratedRulesType generatedRulesType) {
            this.generatedRulesType = Objects.requireNonNull(generatedRulesType);
            return this;
        }

        public Builder targetTypes(List<RuleGroupTargetType> targetTypes) {
            this.targetTypes = Objects.requireNonNull(targetTypes);
            return this;
        }

        public Builder targets(List<String> targets) {
            this.targets = Objects.requireNonNull(targets);
            return this;
        }
        public RuleGroupRulesSourceList build() {
            return new RuleGroupRulesSourceList(generatedRulesType, targetTypes, targets);
        }
    }
}
