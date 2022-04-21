// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs Empty = new WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs();

    /**
     * The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }

    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See IPSet Forwarded IP Config below for more details.
     * 
     */
    @Import(name="ipSetForwardedIpConfig")
    private @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigGetArgs> ipSetForwardedIpConfig;

    public Optional<Output<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigGetArgs>> ipSetForwardedIpConfig() {
        return Optional.ofNullable(this.ipSetForwardedIpConfig);
    }

    private WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs() {}

    private WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs(WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs $) {
        this.arn = $.arn;
        this.ipSetForwardedIpConfig = $.ipSetForwardedIpConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs $;

        public Builder() {
            $ = new WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs();
        }

        public Builder(WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs defaults) {
            $ = new WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder ipSetForwardedIpConfig(@Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigGetArgs> ipSetForwardedIpConfig) {
            $.ipSetForwardedIpConfig = ipSetForwardedIpConfig;
            return this;
        }

        public Builder ipSetForwardedIpConfig(WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigGetArgs ipSetForwardedIpConfig) {
            return ipSetForwardedIpConfig(Output.of(ipSetForwardedIpConfig));
        }

        public WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
