// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.inputs.WebACLStatementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.List;
import java.util.Objects;


public final class WebACLOrStatementArgs extends ResourceArgs {

    public static final WebACLOrStatementArgs Empty = new WebACLOrStatementArgs();

    @Import(name="statements", required=true)
    private Output<List<WebACLStatementArgs>> statements;

    public Output<List<WebACLStatementArgs>> statements() {
        return this.statements;
    }

    private WebACLOrStatementArgs() {}

    private WebACLOrStatementArgs(WebACLOrStatementArgs $) {
        this.statements = $.statements;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebACLOrStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLOrStatementArgs $;

        public Builder() {
            $ = new WebACLOrStatementArgs();
        }

        public Builder(WebACLOrStatementArgs defaults) {
            $ = new WebACLOrStatementArgs(Objects.requireNonNull(defaults));
        }

        public Builder statements(Output<List<WebACLStatementArgs>> statements) {
            $.statements = statements;
            return this;
        }

        public Builder statements(List<WebACLStatementArgs> statements) {
            return statements(Output.of(statements));
        }

        public Builder statements(WebACLStatementArgs... statements) {
            return statements(List.of(statements));
        }

        public WebACLOrStatementArgs build() {
            $.statements = Objects.requireNonNull($.statements, "expected parameter 'statements' to be non-null");
            return $;
        }
    }

}
