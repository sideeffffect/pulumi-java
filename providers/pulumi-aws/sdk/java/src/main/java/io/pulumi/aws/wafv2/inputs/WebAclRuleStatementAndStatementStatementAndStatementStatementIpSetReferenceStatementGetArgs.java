// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs Empty = new WebAclRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs();

    /**
     * The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
     */
    @InputImport(name="arn", required=true)
      private final Input<String> arn;

    public Input<String> getArn() {
        return this.arn;
    }

    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. See IPSet Forwarded IP Config below for more details.
     * 
     */
    @InputImport(name="ipSetForwardedIpConfig")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigGetArgs> ipSetForwardedIpConfig;

    public Input<WebAclRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigGetArgs> getIpSetForwardedIpConfig() {
        return this.ipSetForwardedIpConfig == null ? Input.empty() : this.ipSetForwardedIpConfig;
    }

    public WebAclRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs(
        Input<String> arn,
        @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigGetArgs> ipSetForwardedIpConfig) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.ipSetForwardedIpConfig = ipSetForwardedIpConfig;
    }

    private WebAclRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs() {
        this.arn = Input.empty();
        this.ipSetForwardedIpConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> arn;
        private @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigGetArgs> ipSetForwardedIpConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.ipSetForwardedIpConfig = defaults.ipSetForwardedIpConfig;
        }

        public Builder arn(Input<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder arn(String arn) {
            this.arn = Input.of(Objects.requireNonNull(arn));
            return this;
        }

        public Builder ipSetForwardedIpConfig(@Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigGetArgs> ipSetForwardedIpConfig) {
            this.ipSetForwardedIpConfig = ipSetForwardedIpConfig;
            return this;
        }

        public Builder ipSetForwardedIpConfig(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigGetArgs ipSetForwardedIpConfig) {
            this.ipSetForwardedIpConfig = Input.ofNullable(ipSetForwardedIpConfig);
            return this;
        }
        public WebAclRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs build() {
            return new WebAclRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs(arn, ipSetForwardedIpConfig);
        }
    }
}
