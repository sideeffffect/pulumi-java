// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementGetArgs Empty = new WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementGetArgs();

    /**
     * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
    private Output<List<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementGetArgs>> statements;

    public Output<List<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementGetArgs>> statements() {
        return this.statements;
    }

    private WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementGetArgs() {}

    private WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementGetArgs(WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementGetArgs $) {
        this.statements = $.statements;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementGetArgs $;

        public Builder() {
            $ = new WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementGetArgs();
        }

        public Builder(WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementGetArgs defaults) {
            $ = new WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder statements(Output<List<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementGetArgs>> statements) {
            $.statements = statements;
            return this;
        }

        public Builder statements(List<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementGetArgs> statements) {
            return statements(Output.of(statements));
        }

        public Builder statements(WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementGetArgs... statements) {
            return statements(List.of(statements));
        }

        public WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementGetArgs build() {
            $.statements = Objects.requireNonNull($.statements, "expected parameter 'statements' to be non-null");
            return $;
        }
    }

}
