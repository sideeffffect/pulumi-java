// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatement {
    /**
     * An array of two-character country codes, for example, [ "US", "CN" ], from the alpha-2 country ISO codes of the `ISO 3166` international standard. See the [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchStatement.html) for valid values.
     * 
     */
    private final List<String> countryCodes;
    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. See Forwarded IP Config below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfig forwardedIpConfig;

    @OutputCustomType.Constructor
    private WebAclRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatement(
        @OutputCustomType.Parameter("countryCodes") List<String> countryCodes,
        @OutputCustomType.Parameter("forwardedIpConfig") @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfig forwardedIpConfig) {
        this.countryCodes = countryCodes;
        this.forwardedIpConfig = forwardedIpConfig;
    }

    /**
     * An array of two-character country codes, for example, [ "US", "CN" ], from the alpha-2 country ISO codes of the `ISO 3166` international standard. See the [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchStatement.html) for valid values.
     * 
    */
    public List<String> getCountryCodes() {
        return this.countryCodes;
    }
    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. See Forwarded IP Config below for details.
     * 
    */
    public Optional<WebAclRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfig> getForwardedIpConfig() {
        return Optional.ofNullable(this.forwardedIpConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> countryCodes;
        private @Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfig forwardedIpConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.countryCodes = defaults.countryCodes;
    	      this.forwardedIpConfig = defaults.forwardedIpConfig;
        }

        public Builder countryCodes(List<String> countryCodes) {
            this.countryCodes = Objects.requireNonNull(countryCodes);
            return this;
        }

        public Builder forwardedIpConfig(@Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfig forwardedIpConfig) {
            this.forwardedIpConfig = forwardedIpConfig;
            return this;
        }
        public WebAclRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatement build() {
            return new WebAclRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatement(countryCodes, forwardedIpConfig);
        }
    }
}
