// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Define a match condition
 * 
 */
public final class RulesEngineMatchConditionResponse extends io.pulumi.resources.InvokeArgs {

    public static final RulesEngineMatchConditionResponse Empty = new RulesEngineMatchConditionResponse();

    /**
     * Describes if this is negate condition or not
     * 
     */
    @InputImport(name="negateCondition")
      private final @Nullable Boolean negateCondition;

    public Optional<Boolean> getNegateCondition() {
        return this.negateCondition == null ? Optional.empty() : Optional.ofNullable(this.negateCondition);
    }

    /**
     * Match values to match against. The operator will apply to each value in here with OR semantics. If any of them match the variable with the given operator this match condition is considered a match.
     * 
     */
    @InputImport(name="rulesEngineMatchValue", required=true)
      private final List<String> rulesEngineMatchValue;

    public List<String> getRulesEngineMatchValue() {
        return this.rulesEngineMatchValue;
    }

    /**
     * Match Variable
     * 
     */
    @InputImport(name="rulesEngineMatchVariable", required=true)
      private final String rulesEngineMatchVariable;

    public String getRulesEngineMatchVariable() {
        return this.rulesEngineMatchVariable;
    }

    /**
     * Describes operator to apply to the match condition.
     * 
     */
    @InputImport(name="rulesEngineOperator", required=true)
      private final String rulesEngineOperator;

    public String getRulesEngineOperator() {
        return this.rulesEngineOperator;
    }

    /**
     * Name of selector in RequestHeader or RequestBody to be matched
     * 
     */
    @InputImport(name="selector")
      private final @Nullable String selector;

    public Optional<String> getSelector() {
        return this.selector == null ? Optional.empty() : Optional.ofNullable(this.selector);
    }

    /**
     * List of transforms
     * 
     */
    @InputImport(name="transforms")
      private final @Nullable List<String> transforms;

    public List<String> getTransforms() {
        return this.transforms == null ? List.of() : this.transforms;
    }

    public RulesEngineMatchConditionResponse(
        @Nullable Boolean negateCondition,
        List<String> rulesEngineMatchValue,
        String rulesEngineMatchVariable,
        String rulesEngineOperator,
        @Nullable String selector,
        @Nullable List<String> transforms) {
        this.negateCondition = negateCondition;
        this.rulesEngineMatchValue = Objects.requireNonNull(rulesEngineMatchValue, "expected parameter 'rulesEngineMatchValue' to be non-null");
        this.rulesEngineMatchVariable = Objects.requireNonNull(rulesEngineMatchVariable, "expected parameter 'rulesEngineMatchVariable' to be non-null");
        this.rulesEngineOperator = Objects.requireNonNull(rulesEngineOperator, "expected parameter 'rulesEngineOperator' to be non-null");
        this.selector = selector;
        this.transforms = transforms;
    }

    private RulesEngineMatchConditionResponse() {
        this.negateCondition = null;
        this.rulesEngineMatchValue = List.of();
        this.rulesEngineMatchVariable = null;
        this.rulesEngineOperator = null;
        this.selector = null;
        this.transforms = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesEngineMatchConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean negateCondition;
        private List<String> rulesEngineMatchValue;
        private String rulesEngineMatchVariable;
        private String rulesEngineOperator;
        private @Nullable String selector;
        private @Nullable List<String> transforms;

        public Builder() {
    	      // Empty
        }

        public Builder(RulesEngineMatchConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.negateCondition = defaults.negateCondition;
    	      this.rulesEngineMatchValue = defaults.rulesEngineMatchValue;
    	      this.rulesEngineMatchVariable = defaults.rulesEngineMatchVariable;
    	      this.rulesEngineOperator = defaults.rulesEngineOperator;
    	      this.selector = defaults.selector;
    	      this.transforms = defaults.transforms;
        }

        public Builder negateCondition(@Nullable Boolean negateCondition) {
            this.negateCondition = negateCondition;
            return this;
        }

        public Builder rulesEngineMatchValue(List<String> rulesEngineMatchValue) {
            this.rulesEngineMatchValue = Objects.requireNonNull(rulesEngineMatchValue);
            return this;
        }

        public Builder rulesEngineMatchVariable(String rulesEngineMatchVariable) {
            this.rulesEngineMatchVariable = Objects.requireNonNull(rulesEngineMatchVariable);
            return this;
        }

        public Builder rulesEngineOperator(String rulesEngineOperator) {
            this.rulesEngineOperator = Objects.requireNonNull(rulesEngineOperator);
            return this;
        }

        public Builder selector(@Nullable String selector) {
            this.selector = selector;
            return this;
        }

        public Builder transforms(@Nullable List<String> transforms) {
            this.transforms = transforms;
            return this;
        }
        public RulesEngineMatchConditionResponse build() {
            return new RulesEngineMatchConditionResponse(negateCondition, rulesEngineMatchValue, rulesEngineMatchVariable, rulesEngineOperator, selector, transforms);
        }
    }
}
