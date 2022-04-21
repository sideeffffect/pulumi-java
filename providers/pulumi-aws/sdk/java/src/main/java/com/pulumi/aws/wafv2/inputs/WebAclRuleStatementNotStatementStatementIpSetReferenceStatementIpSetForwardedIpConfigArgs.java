// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WebAclRuleStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs Empty = new WebAclRuleStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs();

    /**
     * - The match status to assign to the web request if the request doesn&#39;t have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
     * 
     */
    @Import(name="fallbackBehavior", required=true)
    private Output<String> fallbackBehavior;

    public Output<String> fallbackBehavior() {
        return this.fallbackBehavior;
    }

    /**
     * - The name of the HTTP header to use for the IP address.
     * 
     */
    @Import(name="headerName", required=true)
    private Output<String> headerName;

    public Output<String> headerName() {
        return this.headerName;
    }

    /**
     * - The position in the header to search for the IP address. Valid values include: `FIRST`, `LAST`, or `ANY`. If `ANY` is specified and the header contains more than 10 IP addresses, AWS WAFv2 inspects the last 10.
     * 
     */
    @Import(name="position", required=true)
    private Output<String> position;

    public Output<String> position() {
        return this.position;
    }

    private WebAclRuleStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs() {}

    private WebAclRuleStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs(WebAclRuleStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs $) {
        this.fallbackBehavior = $.fallbackBehavior;
        this.headerName = $.headerName;
        this.position = $.position;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs $;

        public Builder() {
            $ = new WebAclRuleStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs();
        }

        public Builder(WebAclRuleStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs defaults) {
            $ = new WebAclRuleStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder fallbackBehavior(Output<String> fallbackBehavior) {
            $.fallbackBehavior = fallbackBehavior;
            return this;
        }

        public Builder fallbackBehavior(String fallbackBehavior) {
            return fallbackBehavior(Output.of(fallbackBehavior));
        }

        public Builder headerName(Output<String> headerName) {
            $.headerName = headerName;
            return this;
        }

        public Builder headerName(String headerName) {
            return headerName(Output.of(headerName));
        }

        public Builder position(Output<String> position) {
            $.position = position;
            return this;
        }

        public Builder position(String position) {
            return position(Output.of(position));
        }

        public WebAclRuleStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs build() {
            $.fallbackBehavior = Objects.requireNonNull($.fallbackBehavior, "expected parameter 'fallbackBehavior' to be non-null");
            $.headerName = Objects.requireNonNull($.headerName, "expected parameter 'headerName' to be non-null");
            $.position = Objects.requireNonNull($.position, "expected parameter 'position' to be non-null");
            return $;
        }
    }

}
