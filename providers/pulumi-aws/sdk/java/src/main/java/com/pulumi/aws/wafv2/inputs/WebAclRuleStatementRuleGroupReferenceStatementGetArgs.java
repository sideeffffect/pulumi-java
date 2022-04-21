// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementExcludedRuleGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRuleGroupReferenceStatementGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRuleGroupReferenceStatementGetArgs Empty = new WebAclRuleStatementRuleGroupReferenceStatementGetArgs();

    /**
     * The Amazon Resource Name (ARN) of the `aws.wafv2.RuleGroup` resource.
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }

    /**
     * The `rules` whose actions are set to `COUNT` by the web ACL, regardless of the action that is set on the rule. See Excluded Rule below for details.
     * 
     */
    @Import(name="excludedRules")
    private @Nullable Output<List<WebAclRuleStatementRuleGroupReferenceStatementExcludedRuleGetArgs>> excludedRules;

    public Optional<Output<List<WebAclRuleStatementRuleGroupReferenceStatementExcludedRuleGetArgs>>> excludedRules() {
        return Optional.ofNullable(this.excludedRules);
    }

    private WebAclRuleStatementRuleGroupReferenceStatementGetArgs() {}

    private WebAclRuleStatementRuleGroupReferenceStatementGetArgs(WebAclRuleStatementRuleGroupReferenceStatementGetArgs $) {
        this.arn = $.arn;
        this.excludedRules = $.excludedRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementRuleGroupReferenceStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementRuleGroupReferenceStatementGetArgs $;

        public Builder() {
            $ = new WebAclRuleStatementRuleGroupReferenceStatementGetArgs();
        }

        public Builder(WebAclRuleStatementRuleGroupReferenceStatementGetArgs defaults) {
            $ = new WebAclRuleStatementRuleGroupReferenceStatementGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder excludedRules(@Nullable Output<List<WebAclRuleStatementRuleGroupReferenceStatementExcludedRuleGetArgs>> excludedRules) {
            $.excludedRules = excludedRules;
            return this;
        }

        public Builder excludedRules(List<WebAclRuleStatementRuleGroupReferenceStatementExcludedRuleGetArgs> excludedRules) {
            return excludedRules(Output.of(excludedRules));
        }

        public Builder excludedRules(WebAclRuleStatementRuleGroupReferenceStatementExcludedRuleGetArgs... excludedRules) {
            return excludedRules(List.of(excludedRules));
        }

        public WebAclRuleStatementRuleGroupReferenceStatementGetArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
