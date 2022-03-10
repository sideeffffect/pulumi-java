// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The KPI alias.
 * 
 */
public final class KpiAliasArgs extends io.pulumi.resources.ResourceArgs {

    public static final KpiAliasArgs Empty = new KpiAliasArgs();

    /**
     * KPI alias name.
     * 
     */
    @InputImport(name="aliasName", required=true)
      private final Input<String> aliasName;

    public Input<String> getAliasName() {
        return this.aliasName;
    }

    /**
     * The expression.
     * 
     */
    @InputImport(name="expression", required=true)
      private final Input<String> expression;

    public Input<String> getExpression() {
        return this.expression;
    }

    public KpiAliasArgs(
        Input<String> aliasName,
        Input<String> expression) {
        this.aliasName = Objects.requireNonNull(aliasName, "expected parameter 'aliasName' to be non-null");
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
    }

    private KpiAliasArgs() {
        this.aliasName = Input.empty();
        this.expression = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KpiAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> aliasName;
        private Input<String> expression;

        public Builder() {
    	      // Empty
        }

        public Builder(KpiAliasArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliasName = defaults.aliasName;
    	      this.expression = defaults.expression;
        }

        public Builder aliasName(Input<String> aliasName) {
            this.aliasName = Objects.requireNonNull(aliasName);
            return this;
        }

        public Builder aliasName(String aliasName) {
            this.aliasName = Input.of(Objects.requireNonNull(aliasName));
            return this;
        }

        public Builder expression(Input<String> expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder expression(String expression) {
            this.expression = Input.of(Objects.requireNonNull(expression));
            return this;
        }
        public KpiAliasArgs build() {
            return new KpiAliasArgs(aliasName, expression);
        }
    }
}
