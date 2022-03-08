// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.enums.WebACLForwardedIPConfigurationFallbackBehavior;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WebACLForwardedIPConfiguration {
    private final WebACLForwardedIPConfigurationFallbackBehavior fallbackBehavior;
    private final String headerName;

    @OutputCustomType.Constructor({"fallbackBehavior","headerName"})
    private WebACLForwardedIPConfiguration(
        WebACLForwardedIPConfigurationFallbackBehavior fallbackBehavior,
        String headerName) {
        this.fallbackBehavior = fallbackBehavior;
        this.headerName = headerName;
    }

    public WebACLForwardedIPConfigurationFallbackBehavior getFallbackBehavior() {
        return this.fallbackBehavior;
    }
    public String getHeaderName() {
        return this.headerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLForwardedIPConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLForwardedIPConfigurationFallbackBehavior fallbackBehavior;
        private String headerName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLForwardedIPConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fallbackBehavior = defaults.fallbackBehavior;
    	      this.headerName = defaults.headerName;
        }

        public Builder setFallbackBehavior(WebACLForwardedIPConfigurationFallbackBehavior fallbackBehavior) {
            this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior);
            return this;
        }

        public Builder setHeaderName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }
        public WebACLForwardedIPConfiguration build() {
            return new WebACLForwardedIPConfiguration(fallbackBehavior, headerName);
        }
    }
}
