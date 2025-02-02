// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ManagedRuleExclusionResponse {
    /**
     * @return The variable type to be excluded.
     * 
     */
    private final String matchVariable;
    /**
     * @return Selector value for which elements in the collection this exclusion applies to.
     * 
     */
    private final String selector;
    /**
     * @return Comparison operator to apply to the selector when specifying which elements in the collection this exclusion applies to.
     * 
     */
    private final String selectorMatchOperator;

    @CustomType.Constructor
    private ManagedRuleExclusionResponse(
        @CustomType.Parameter("matchVariable") String matchVariable,
        @CustomType.Parameter("selector") String selector,
        @CustomType.Parameter("selectorMatchOperator") String selectorMatchOperator) {
        this.matchVariable = matchVariable;
        this.selector = selector;
        this.selectorMatchOperator = selectorMatchOperator;
    }

    /**
     * @return The variable type to be excluded.
     * 
     */
    public String matchVariable() {
        return this.matchVariable;
    }
    /**
     * @return Selector value for which elements in the collection this exclusion applies to.
     * 
     */
    public String selector() {
        return this.selector;
    }
    /**
     * @return Comparison operator to apply to the selector when specifying which elements in the collection this exclusion applies to.
     * 
     */
    public String selectorMatchOperator() {
        return this.selectorMatchOperator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedRuleExclusionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String matchVariable;
        private String selector;
        private String selectorMatchOperator;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedRuleExclusionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchVariable = defaults.matchVariable;
    	      this.selector = defaults.selector;
    	      this.selectorMatchOperator = defaults.selectorMatchOperator;
        }

        public Builder matchVariable(String matchVariable) {
            this.matchVariable = Objects.requireNonNull(matchVariable);
            return this;
        }
        public Builder selector(String selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }
        public Builder selectorMatchOperator(String selectorMatchOperator) {
            this.selectorMatchOperator = Objects.requireNonNull(selectorMatchOperator);
            return this;
        }        public ManagedRuleExclusionResponse build() {
            return new ManagedRuleExclusionResponse(matchVariable, selector, selectorMatchOperator);
        }
    }
}
