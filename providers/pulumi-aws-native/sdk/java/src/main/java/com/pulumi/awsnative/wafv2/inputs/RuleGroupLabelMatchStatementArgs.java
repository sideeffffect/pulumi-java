// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.enums.RuleGroupLabelMatchScope;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupLabelMatchStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupLabelMatchStatementArgs Empty = new RuleGroupLabelMatchStatementArgs();

    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    @Import(name="scope", required=true)
    private Output<RuleGroupLabelMatchScope> scope;

    public Output<RuleGroupLabelMatchScope> scope() {
        return this.scope;
    }

    private RuleGroupLabelMatchStatementArgs() {}

    private RuleGroupLabelMatchStatementArgs(RuleGroupLabelMatchStatementArgs $) {
        this.key = $.key;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupLabelMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupLabelMatchStatementArgs $;

        public Builder() {
            $ = new RuleGroupLabelMatchStatementArgs();
        }

        public Builder(RuleGroupLabelMatchStatementArgs defaults) {
            $ = new RuleGroupLabelMatchStatementArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder scope(Output<RuleGroupLabelMatchScope> scope) {
            $.scope = scope;
            return this;
        }

        public Builder scope(RuleGroupLabelMatchScope scope) {
            return scope(Output.of(scope));
        }

        public RuleGroupLabelMatchStatementArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
