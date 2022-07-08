// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SecurityPolicyRuleMatcherConfigResponse {
    /**
     * @return CIDR IP address range. Maximum number of src_ip_ranges allowed is 10.
     * 
     */
    private final List<String> srcIpRanges;

    @CustomType.Constructor
    private SecurityPolicyRuleMatcherConfigResponse(@CustomType.Parameter("srcIpRanges") List<String> srcIpRanges) {
        this.srcIpRanges = srcIpRanges;
    }

    /**
     * @return CIDR IP address range. Maximum number of src_ip_ranges allowed is 10.
     * 
     */
    public List<String> srcIpRanges() {
        return this.srcIpRanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleMatcherConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> srcIpRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleMatcherConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.srcIpRanges = defaults.srcIpRanges;
        }

        public Builder srcIpRanges(List<String> srcIpRanges) {
            this.srcIpRanges = Objects.requireNonNull(srcIpRanges);
            return this;
        }
        public Builder srcIpRanges(String... srcIpRanges) {
            return srcIpRanges(List.of(srcIpRanges));
        }        public SecurityPolicyRuleMatcherConfigResponse build() {
            return new SecurityPolicyRuleMatcherConfigResponse(srcIpRanges);
        }
    }
}
