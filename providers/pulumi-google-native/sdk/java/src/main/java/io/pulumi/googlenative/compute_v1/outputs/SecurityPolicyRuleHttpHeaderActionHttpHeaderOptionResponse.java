// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse {
    /**
     * The name of the header to set.
     * 
     */
    private final String headerName;
    /**
     * The value to set the named header to.
     * 
     */
    private final String headerValue;

    @OutputCustomType.Constructor
    private SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse(
        @OutputCustomType.Parameter("headerName") String headerName,
        @OutputCustomType.Parameter("headerValue") String headerValue) {
        this.headerName = headerName;
        this.headerValue = headerValue;
    }

    /**
     * The name of the header to set.
     * 
    */
    public String getHeaderName() {
        return this.headerName;
    }
    /**
     * The value to set the named header to.
     * 
    */
    public String getHeaderValue() {
        return this.headerValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String headerName;
        private String headerValue;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.headerValue = defaults.headerValue;
        }

        public Builder headerName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder headerValue(String headerValue) {
            this.headerValue = Objects.requireNonNull(headerValue);
            return this;
        }
        public SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse build() {
            return new SecurityPolicyRuleHttpHeaderActionHttpHeaderOptionResponse(headerName, headerValue);
        }
    }
}
