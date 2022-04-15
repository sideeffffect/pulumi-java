// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementArgs Empty = new WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementArgs();

    /**
     * The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
     */
    @Import(name="arn", required=true)
      private final Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }

    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. See IPSet Forwarded IP Config below for more details.
     * 
     */
    @Import(name="ipSetForwardedIpConfig")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs> ipSetForwardedIpConfig;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs> ipSetForwardedIpConfig() {
        return this.ipSetForwardedIpConfig == null ? Codegen.empty() : this.ipSetForwardedIpConfig;
    }

    public WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementArgs(
        Output<String> arn,
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs> ipSetForwardedIpConfig) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.ipSetForwardedIpConfig = ipSetForwardedIpConfig;
    }

    private WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementArgs() {
        this.arn = Codegen.empty();
        this.ipSetForwardedIpConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> arn;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs> ipSetForwardedIpConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.ipSetForwardedIpConfig = defaults.ipSetForwardedIpConfig;
        }

        public Builder arn(Output<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder arn(String arn) {
            this.arn = Output.of(Objects.requireNonNull(arn));
            return this;
        }
        public Builder ipSetForwardedIpConfig(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs> ipSetForwardedIpConfig) {
            this.ipSetForwardedIpConfig = ipSetForwardedIpConfig;
            return this;
        }
        public Builder ipSetForwardedIpConfig(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs ipSetForwardedIpConfig) {
            this.ipSetForwardedIpConfig = Codegen.ofNullable(ipSetForwardedIpConfig);
            return this;
        }        public WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementArgs build() {
            return new WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementArgs(arn, ipSetForwardedIpConfig);
        }
    }
}
