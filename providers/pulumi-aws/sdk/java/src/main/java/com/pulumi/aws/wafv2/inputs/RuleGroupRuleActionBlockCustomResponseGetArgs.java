// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionBlockCustomResponseResponseHeaderGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupRuleActionBlockCustomResponseGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleActionBlockCustomResponseGetArgs Empty = new RuleGroupRuleActionBlockCustomResponseGetArgs();

    /**
     * References the response body that you want AWS WAF to return to the web request client. This must reference a `key` defined in a `custom_response_body` block of this resource.
     * 
     */
    @Import(name="customResponseBodyKey")
    private @Nullable Output<String> customResponseBodyKey;

    public Optional<Output<String>> customResponseBodyKey() {
        return Optional.ofNullable(this.customResponseBodyKey);
    }

    /**
     * The HTTP status code to return to the client.
     * 
     */
    @Import(name="responseCode", required=true)
    private Output<Integer> responseCode;

    public Output<Integer> responseCode() {
        return this.responseCode;
    }

    /**
     * The `response_header` blocks used to define the HTTP response headers added to the response. See Custom HTTP Header below for details.
     * 
     */
    @Import(name="responseHeaders")
    private @Nullable Output<List<RuleGroupRuleActionBlockCustomResponseResponseHeaderGetArgs>> responseHeaders;

    public Optional<Output<List<RuleGroupRuleActionBlockCustomResponseResponseHeaderGetArgs>>> responseHeaders() {
        return Optional.ofNullable(this.responseHeaders);
    }

    private RuleGroupRuleActionBlockCustomResponseGetArgs() {}

    private RuleGroupRuleActionBlockCustomResponseGetArgs(RuleGroupRuleActionBlockCustomResponseGetArgs $) {
        this.customResponseBodyKey = $.customResponseBodyKey;
        this.responseCode = $.responseCode;
        this.responseHeaders = $.responseHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleActionBlockCustomResponseGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleActionBlockCustomResponseGetArgs $;

        public Builder() {
            $ = new RuleGroupRuleActionBlockCustomResponseGetArgs();
        }

        public Builder(RuleGroupRuleActionBlockCustomResponseGetArgs defaults) {
            $ = new RuleGroupRuleActionBlockCustomResponseGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder customResponseBodyKey(@Nullable Output<String> customResponseBodyKey) {
            $.customResponseBodyKey = customResponseBodyKey;
            return this;
        }

        public Builder customResponseBodyKey(String customResponseBodyKey) {
            return customResponseBodyKey(Output.of(customResponseBodyKey));
        }

        public Builder responseCode(Output<Integer> responseCode) {
            $.responseCode = responseCode;
            return this;
        }

        public Builder responseCode(Integer responseCode) {
            return responseCode(Output.of(responseCode));
        }

        public Builder responseHeaders(@Nullable Output<List<RuleGroupRuleActionBlockCustomResponseResponseHeaderGetArgs>> responseHeaders) {
            $.responseHeaders = responseHeaders;
            return this;
        }

        public Builder responseHeaders(List<RuleGroupRuleActionBlockCustomResponseResponseHeaderGetArgs> responseHeaders) {
            return responseHeaders(Output.of(responseHeaders));
        }

        public Builder responseHeaders(RuleGroupRuleActionBlockCustomResponseResponseHeaderGetArgs... responseHeaders) {
            return responseHeaders(List.of(responseHeaders));
        }

        public RuleGroupRuleActionBlockCustomResponseGetArgs build() {
            $.responseCode = Objects.requireNonNull($.responseCode, "expected parameter 'responseCode' to be non-null");
            return $;
        }
    }

}
