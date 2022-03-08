// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class KpiAliasResponse {
    /**
     * KPI alias name.
     * 
     */
    private final String aliasName;
    /**
     * The expression.
     * 
     */
    private final String expression;

    @OutputCustomType.Constructor({"aliasName","expression"})
    private KpiAliasResponse(
        String aliasName,
        String expression) {
        this.aliasName = aliasName;
        this.expression = expression;
    }

    /**
     * KPI alias name.
     * 
    */
    public String getAliasName() {
        return this.aliasName;
    }
    /**
     * The expression.
     * 
    */
    public String getExpression() {
        return this.expression;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KpiAliasResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aliasName;
        private String expression;

        public Builder() {
    	      // Empty
        }

        public Builder(KpiAliasResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliasName = defaults.aliasName;
    	      this.expression = defaults.expression;
        }

        public Builder setAliasName(String aliasName) {
            this.aliasName = Objects.requireNonNull(aliasName);
            return this;
        }

        public Builder setExpression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }
        public KpiAliasResponse build() {
            return new KpiAliasResponse(aliasName, expression);
        }
    }
}
