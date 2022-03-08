// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.outputs.FlowDistinguisherMethod;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.outputs.PolicyRulesWithSubjects;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.outputs.PriorityLevelConfigurationReference;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlowSchemaSpec {
    /**
     * `distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema. `nil` specifies that the distinguisher is disabled and thus will always be the empty string.
     * 
     */
    private final @Nullable FlowDistinguisherMethod distinguisherMethod;
    /**
     * `matchingPrecedence` is used to choose among the FlowSchemas that match a given request. The chosen FlowSchema is among those with the numerically lowest (which we take to be logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be ranged in [1,10000]. Note that if the precedence is not specified, it will be set to 1000 as default.
     * 
     */
    private final @Nullable Integer matchingPrecedence;
    /**
     * `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster. If the reference cannot be resolved, the FlowSchema will be ignored and marked as invalid in its status. Required.
     * 
     */
    private final PriorityLevelConfigurationReference priorityLevelConfiguration;
    /**
     * `rules` describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
     * 
     */
    private final @Nullable List<PolicyRulesWithSubjects> rules;

    @OutputCustomType.Constructor({"distinguisherMethod","matchingPrecedence","priorityLevelConfiguration","rules"})
    private FlowSchemaSpec(
        @Nullable FlowDistinguisherMethod distinguisherMethod,
        @Nullable Integer matchingPrecedence,
        PriorityLevelConfigurationReference priorityLevelConfiguration,
        @Nullable List<PolicyRulesWithSubjects> rules) {
        this.distinguisherMethod = distinguisherMethod;
        this.matchingPrecedence = matchingPrecedence;
        this.priorityLevelConfiguration = priorityLevelConfiguration;
        this.rules = rules;
    }

    /**
     * `distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema. `nil` specifies that the distinguisher is disabled and thus will always be the empty string.
     * 
    */
    public Optional<FlowDistinguisherMethod> getDistinguisherMethod() {
        return Optional.ofNullable(this.distinguisherMethod);
    }
    /**
     * `matchingPrecedence` is used to choose among the FlowSchemas that match a given request. The chosen FlowSchema is among those with the numerically lowest (which we take to be logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be ranged in [1,10000]. Note that if the precedence is not specified, it will be set to 1000 as default.
     * 
    */
    public Optional<Integer> getMatchingPrecedence() {
        return Optional.ofNullable(this.matchingPrecedence);
    }
    /**
     * `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster. If the reference cannot be resolved, the FlowSchema will be ignored and marked as invalid in its status. Required.
     * 
    */
    public PriorityLevelConfigurationReference getPriorityLevelConfiguration() {
        return this.priorityLevelConfiguration;
    }
    /**
     * `rules` describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
     * 
    */
    public List<PolicyRulesWithSubjects> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSchemaSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowDistinguisherMethod distinguisherMethod;
        private @Nullable Integer matchingPrecedence;
        private PriorityLevelConfigurationReference priorityLevelConfiguration;
        private @Nullable List<PolicyRulesWithSubjects> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSchemaSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distinguisherMethod = defaults.distinguisherMethod;
    	      this.matchingPrecedence = defaults.matchingPrecedence;
    	      this.priorityLevelConfiguration = defaults.priorityLevelConfiguration;
    	      this.rules = defaults.rules;
        }

        public Builder setDistinguisherMethod(@Nullable FlowDistinguisherMethod distinguisherMethod) {
            this.distinguisherMethod = distinguisherMethod;
            return this;
        }

        public Builder setMatchingPrecedence(@Nullable Integer matchingPrecedence) {
            this.matchingPrecedence = matchingPrecedence;
            return this;
        }

        public Builder setPriorityLevelConfiguration(PriorityLevelConfigurationReference priorityLevelConfiguration) {
            this.priorityLevelConfiguration = Objects.requireNonNull(priorityLevelConfiguration);
            return this;
        }

        public Builder setRules(@Nullable List<PolicyRulesWithSubjects> rules) {
            this.rules = rules;
            return this;
        }
        public FlowSchemaSpec build() {
            return new FlowSchemaSpec(distinguisherMethod, matchingPrecedence, priorityLevelConfiguration, rules);
        }
    }
}
