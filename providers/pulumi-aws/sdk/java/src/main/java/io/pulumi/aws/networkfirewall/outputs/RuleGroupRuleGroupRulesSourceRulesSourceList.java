// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RuleGroupRuleGroupRulesSourceRulesSourceList {
    /**
     * String value to specify whether domains in the target list are allowed or denied access. Valid values: `ALLOWLIST`, `DENYLIST`.
     * 
     */
    private final String generatedRulesType;
    /**
     * Set of types of domain specifications that are provided in the `targets` argument. Valid values: `HTTP_HOST`, `TLS_SNI`.
     * 
     */
    private final List<String> targetTypes;
    /**
     * Set of domains that you want to inspect for in your traffic flows.
     * 
     */
    private final List<String> targets;

    @CustomType.Constructor
    private RuleGroupRuleGroupRulesSourceRulesSourceList(
        @CustomType.Parameter("generatedRulesType") String generatedRulesType,
        @CustomType.Parameter("targetTypes") List<String> targetTypes,
        @CustomType.Parameter("targets") List<String> targets) {
        this.generatedRulesType = generatedRulesType;
        this.targetTypes = targetTypes;
        this.targets = targets;
    }

    /**
     * String value to specify whether domains in the target list are allowed or denied access. Valid values: `ALLOWLIST`, `DENYLIST`.
     * 
    */
    public String generatedRulesType() {
        return this.generatedRulesType;
    }
    /**
     * Set of types of domain specifications that are provided in the `targets` argument. Valid values: `HTTP_HOST`, `TLS_SNI`.
     * 
    */
    public List<String> targetTypes() {
        return this.targetTypes;
    }
    /**
     * Set of domains that you want to inspect for in your traffic flows.
     * 
    */
    public List<String> targets() {
        return this.targets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceRulesSourceList defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String generatedRulesType;
        private List<String> targetTypes;
        private List<String> targets;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceRulesSourceList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.generatedRulesType = defaults.generatedRulesType;
    	      this.targetTypes = defaults.targetTypes;
    	      this.targets = defaults.targets;
        }

        public Builder generatedRulesType(String generatedRulesType) {
            this.generatedRulesType = Objects.requireNonNull(generatedRulesType);
            return this;
        }
        public Builder targetTypes(List<String> targetTypes) {
            this.targetTypes = Objects.requireNonNull(targetTypes);
            return this;
        }
        public Builder targetTypes(String... targetTypes) {
            return targetTypes(List.of(targetTypes));
        }
        public Builder targets(List<String> targets) {
            this.targets = Objects.requireNonNull(targets);
            return this;
        }
        public Builder targets(String... targets) {
            return targets(List.of(targets));
        }        public RuleGroupRuleGroupRulesSourceRulesSourceList build() {
            return new RuleGroupRuleGroupRulesSourceRulesSourceList(generatedRulesType, targetTypes, targets);
        }
    }
}
