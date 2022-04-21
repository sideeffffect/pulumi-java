// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Exclude variables from managed rule evaluation.
 * 
 */
public final class ManagedRuleExclusionResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagedRuleExclusionResponse Empty = new ManagedRuleExclusionResponse();

    /**
     * The variable type to be excluded.
     * 
     */
    @Import(name="matchVariable", required=true)
    private String matchVariable;

    public String matchVariable() {
        return this.matchVariable;
    }

    /**
     * Selector value for which elements in the collection this exclusion applies to.
     * 
     */
    @Import(name="selector", required=true)
    private String selector;

    public String selector() {
        return this.selector;
    }

    /**
     * Comparison operator to apply to the selector when specifying which elements in the collection this exclusion applies to.
     * 
     */
    @Import(name="selectorMatchOperator", required=true)
    private String selectorMatchOperator;

    public String selectorMatchOperator() {
        return this.selectorMatchOperator;
    }

    private ManagedRuleExclusionResponse() {}

    private ManagedRuleExclusionResponse(ManagedRuleExclusionResponse $) {
        this.matchVariable = $.matchVariable;
        this.selector = $.selector;
        this.selectorMatchOperator = $.selectorMatchOperator;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedRuleExclusionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedRuleExclusionResponse $;

        public Builder() {
            $ = new ManagedRuleExclusionResponse();
        }

        public Builder(ManagedRuleExclusionResponse defaults) {
            $ = new ManagedRuleExclusionResponse(Objects.requireNonNull(defaults));
        }

        public Builder matchVariable(String matchVariable) {
            $.matchVariable = matchVariable;
            return this;
        }

        public Builder selector(String selector) {
            $.selector = selector;
            return this;
        }

        public Builder selectorMatchOperator(String selectorMatchOperator) {
            $.selectorMatchOperator = selectorMatchOperator;
            return this;
        }

        public ManagedRuleExclusionResponse build() {
            $.matchVariable = Objects.requireNonNull($.matchVariable, "expected parameter 'matchVariable' to be non-null");
            $.selector = Objects.requireNonNull($.selector, "expected parameter 'selector' to be non-null");
            $.selectorMatchOperator = Objects.requireNonNull($.selectorMatchOperator, "expected parameter 'selectorMatchOperator' to be non-null");
            return $;
        }
    }

}
