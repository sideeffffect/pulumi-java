// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleActionCountCustomRequestHandlingGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleActionCountGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleActionCountGetArgs Empty = new WebAclRuleActionCountGetArgs();

    /**
     * Defines custom handling for the web request. See Custom Request Handling below for details.
     * 
     */
    @Import(name="customRequestHandling")
    private @Nullable Output<WebAclRuleActionCountCustomRequestHandlingGetArgs> customRequestHandling;

    public Optional<Output<WebAclRuleActionCountCustomRequestHandlingGetArgs>> customRequestHandling() {
        return Optional.ofNullable(this.customRequestHandling);
    }

    private WebAclRuleActionCountGetArgs() {}

    private WebAclRuleActionCountGetArgs(WebAclRuleActionCountGetArgs $) {
        this.customRequestHandling = $.customRequestHandling;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleActionCountGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleActionCountGetArgs $;

        public Builder() {
            $ = new WebAclRuleActionCountGetArgs();
        }

        public Builder(WebAclRuleActionCountGetArgs defaults) {
            $ = new WebAclRuleActionCountGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder customRequestHandling(@Nullable Output<WebAclRuleActionCountCustomRequestHandlingGetArgs> customRequestHandling) {
            $.customRequestHandling = customRequestHandling;
            return this;
        }

        public Builder customRequestHandling(WebAclRuleActionCountCustomRequestHandlingGetArgs customRequestHandling) {
            return customRequestHandling(Output.of(customRequestHandling));
        }

        public WebAclRuleActionCountGetArgs build() {
            return $;
        }
    }

}
