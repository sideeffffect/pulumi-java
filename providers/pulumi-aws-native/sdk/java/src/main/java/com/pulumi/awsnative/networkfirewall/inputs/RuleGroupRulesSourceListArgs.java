// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkfirewall.inputs;

import com.pulumi.awsnative.networkfirewall.enums.RuleGroupGeneratedRulesType;
import com.pulumi.awsnative.networkfirewall.enums.RuleGroupTargetType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRulesSourceListArgs extends ResourceArgs {

    public static final RuleGroupRulesSourceListArgs Empty = new RuleGroupRulesSourceListArgs();

    @Import(name="generatedRulesType", required=true)
    private Output<RuleGroupGeneratedRulesType> generatedRulesType;

    public Output<RuleGroupGeneratedRulesType> generatedRulesType() {
        return this.generatedRulesType;
    }

    @Import(name="targetTypes", required=true)
    private Output<List<RuleGroupTargetType>> targetTypes;

    public Output<List<RuleGroupTargetType>> targetTypes() {
        return this.targetTypes;
    }

    @Import(name="targets", required=true)
    private Output<List<String>> targets;

    public Output<List<String>> targets() {
        return this.targets;
    }

    private RuleGroupRulesSourceListArgs() {}

    private RuleGroupRulesSourceListArgs(RuleGroupRulesSourceListArgs $) {
        this.generatedRulesType = $.generatedRulesType;
        this.targetTypes = $.targetTypes;
        this.targets = $.targets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRulesSourceListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRulesSourceListArgs $;

        public Builder() {
            $ = new RuleGroupRulesSourceListArgs();
        }

        public Builder(RuleGroupRulesSourceListArgs defaults) {
            $ = new RuleGroupRulesSourceListArgs(Objects.requireNonNull(defaults));
        }

        public Builder generatedRulesType(Output<RuleGroupGeneratedRulesType> generatedRulesType) {
            $.generatedRulesType = generatedRulesType;
            return this;
        }

        public Builder generatedRulesType(RuleGroupGeneratedRulesType generatedRulesType) {
            return generatedRulesType(Output.of(generatedRulesType));
        }

        public Builder targetTypes(Output<List<RuleGroupTargetType>> targetTypes) {
            $.targetTypes = targetTypes;
            return this;
        }

        public Builder targetTypes(List<RuleGroupTargetType> targetTypes) {
            return targetTypes(Output.of(targetTypes));
        }

        public Builder targetTypes(RuleGroupTargetType... targetTypes) {
            return targetTypes(List.of(targetTypes));
        }

        public Builder targets(Output<List<String>> targets) {
            $.targets = targets;
            return this;
        }

        public Builder targets(List<String> targets) {
            return targets(Output.of(targets));
        }

        public Builder targets(String... targets) {
            return targets(List.of(targets));
        }

        public RuleGroupRulesSourceListArgs build() {
            $.generatedRulesType = Objects.requireNonNull($.generatedRulesType, "expected parameter 'generatedRulesType' to be non-null");
            $.targetTypes = Objects.requireNonNull($.targetTypes, "expected parameter 'targetTypes' to be non-null");
            $.targets = Objects.requireNonNull($.targets, "expected parameter 'targets' to be non-null");
            return $;
        }
    }

}
