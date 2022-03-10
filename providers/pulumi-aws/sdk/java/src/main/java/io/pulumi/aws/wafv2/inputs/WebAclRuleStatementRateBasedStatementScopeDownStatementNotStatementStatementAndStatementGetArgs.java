// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementGetArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementGetArgs();

    /**
     * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @InputImport(name="statements", required=true)
      private final Input<List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementGetArgs>> statements;

    public Input<List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementGetArgs>> getStatements() {
        return this.statements;
    }

    public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementGetArgs(Input<List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementGetArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementGetArgs() {
        this.statements = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementGetArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(Input<List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementGetArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }

        public Builder statements(List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementGetArgs> statements) {
            this.statements = Input.of(Objects.requireNonNull(statements));
            return this;
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementGetArgs build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementGetArgs(statements);
        }
    }
}
