// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementArgs();

    /**
     * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
      private final Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementArgs>> statements;

    public Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementArgs>> statements() {
        return this.statements;
    }

    public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementArgs(Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementArgs() {
        this.statements = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementArgs> statements) {
            this.statements = Output.of(Objects.requireNonNull(statements));
            return this;
        }
        public Builder statements(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementArgs... statements) {
            return statements(List.of(statements));
        }        public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementArgs build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementArgs(statements);
        }
    }
}
