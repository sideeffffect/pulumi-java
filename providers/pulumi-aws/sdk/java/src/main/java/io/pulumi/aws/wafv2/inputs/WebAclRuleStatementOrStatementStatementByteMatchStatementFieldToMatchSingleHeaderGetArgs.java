// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class WebAclRuleStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs Empty = new WebAclRuleStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs();

    /**
     * The name of the query header to inspect. This setting must be provided as lower case characters.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    public WebAclRuleStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs(Output<String> name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private WebAclRuleStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs() {
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public WebAclRuleStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs build() {
            return new WebAclRuleStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs(name);
        }
    }
}
