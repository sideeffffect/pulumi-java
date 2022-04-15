// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleActionCountCustomRequestHandlingGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleActionCountGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleActionCountGetArgs Empty = new WebAclRuleActionCountGetArgs();

    /**
     * Defines custom handling for the web request. See Custom Request Handling below for details.
     * 
     */
    @Import(name="customRequestHandling")
      private final @Nullable Output<WebAclRuleActionCountCustomRequestHandlingGetArgs> customRequestHandling;

    public Output<WebAclRuleActionCountCustomRequestHandlingGetArgs> customRequestHandling() {
        return this.customRequestHandling == null ? Codegen.empty() : this.customRequestHandling;
    }

    public WebAclRuleActionCountGetArgs(@Nullable Output<WebAclRuleActionCountCustomRequestHandlingGetArgs> customRequestHandling) {
        this.customRequestHandling = customRequestHandling;
    }

    private WebAclRuleActionCountGetArgs() {
        this.customRequestHandling = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleActionCountGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleActionCountCustomRequestHandlingGetArgs> customRequestHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleActionCountGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRequestHandling = defaults.customRequestHandling;
        }

        public Builder customRequestHandling(@Nullable Output<WebAclRuleActionCountCustomRequestHandlingGetArgs> customRequestHandling) {
            this.customRequestHandling = customRequestHandling;
            return this;
        }
        public Builder customRequestHandling(@Nullable WebAclRuleActionCountCustomRequestHandlingGetArgs customRequestHandling) {
            this.customRequestHandling = Codegen.ofNullable(customRequestHandling);
            return this;
        }        public WebAclRuleActionCountGetArgs build() {
            return new WebAclRuleActionCountGetArgs(customRequestHandling);
        }
    }
}
