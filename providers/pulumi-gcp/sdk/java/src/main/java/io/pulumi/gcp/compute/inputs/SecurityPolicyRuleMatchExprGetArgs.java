// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class SecurityPolicyRuleMatchExprGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleMatchExprGetArgs Empty = new SecurityPolicyRuleMatchExprGetArgs();

    /**
     * Textual representation of an expression in Common Expression Language syntax.
     * The application context of the containing message determines which well-known feature set of CEL is supported.
     * 
     */
    @Import(name="expression", required=true)
      private final Output<String> expression;

    public Output<String> expression() {
        return this.expression;
    }

    public SecurityPolicyRuleMatchExprGetArgs(Output<String> expression) {
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
    }

    private SecurityPolicyRuleMatchExprGetArgs() {
        this.expression = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleMatchExprGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> expression;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleMatchExprGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
        }

        public Builder expression(Output<String> expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }
        public Builder expression(String expression) {
            this.expression = Output.of(Objects.requireNonNull(expression));
            return this;
        }        public SecurityPolicyRuleMatchExprGetArgs build() {
            return new SecurityPolicyRuleMatchExprGetArgs(expression);
        }
    }
}
