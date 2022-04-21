// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderGetArgs Empty = new WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderGetArgs();

    /**
     * The name of the query header to inspect. This setting must be provided as lower case characters.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderGetArgs() {}

    private WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderGetArgs(WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderGetArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderGetArgs $;

        public Builder() {
            $ = new WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderGetArgs();
        }

        public Builder(WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderGetArgs defaults) {
            $ = new WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderGetArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
