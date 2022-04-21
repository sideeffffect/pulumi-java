// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse extends com.pulumi.resources.InvokeArgs {

    public static final SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse Empty = new SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse();

    /**
     * The name of the header to set.
     * 
     */
    @Import(name="headerName", required=true)
    private String headerName;

    public String headerName() {
        return this.headerName;
    }

    /**
     * The value to set the named header to.
     * 
     */
    @Import(name="headerValue", required=true)
    private String headerValue;

    public String headerValue() {
        return this.headerValue;
    }

    private SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse() {}

    private SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse(SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse $) {
        this.headerName = $.headerName;
        this.headerValue = $.headerValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse $;

        public Builder() {
            $ = new SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse();
        }

        public Builder(SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse defaults) {
            $ = new SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse(Objects.requireNonNull(defaults));
        }

        public Builder headerName(String headerName) {
            $.headerName = headerName;
            return this;
        }

        public Builder headerValue(String headerValue) {
            $.headerValue = headerValue;
            return this;
        }

        public SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse build() {
            $.headerName = Objects.requireNonNull($.headerName, "expected parameter 'headerName' to be non-null");
            $.headerValue = Objects.requireNonNull($.headerValue, "expected parameter 'headerValue' to be non-null");
            return $;
        }
    }

}
