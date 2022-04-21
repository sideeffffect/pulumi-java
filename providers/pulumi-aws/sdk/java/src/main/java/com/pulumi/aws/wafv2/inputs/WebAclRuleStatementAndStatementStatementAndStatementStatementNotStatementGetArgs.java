// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementGetArgs Empty = new WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementGetArgs();

    /**
     * The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
    private Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementGetArgs>> statements;

    public Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementGetArgs>> statements() {
        return this.statements;
    }

    private WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementGetArgs() {}

    private WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementGetArgs(WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementGetArgs $) {
        this.statements = $.statements;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementGetArgs $;

        public Builder() {
            $ = new WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementGetArgs();
        }

        public Builder(WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementGetArgs defaults) {
            $ = new WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder statements(Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementGetArgs>> statements) {
            $.statements = statements;
            return this;
        }

        public Builder statements(List<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementGetArgs> statements) {
            return statements(Output.of(statements));
        }

        public Builder statements(WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementGetArgs... statements) {
            return statements(List.of(statements));
        }

        public WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementGetArgs build() {
            $.statements = Objects.requireNonNull($.statements, "expected parameter 'statements' to be non-null");
            return $;
        }
    }

}
