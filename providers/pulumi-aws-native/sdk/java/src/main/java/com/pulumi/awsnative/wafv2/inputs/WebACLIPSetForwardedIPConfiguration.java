// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.enums.WebACLIPSetForwardedIPConfigurationFallbackBehavior;
import com.pulumi.awsnative.wafv2.enums.WebACLIPSetForwardedIPConfigurationPosition;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WebACLIPSetForwardedIPConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final WebACLIPSetForwardedIPConfiguration Empty = new WebACLIPSetForwardedIPConfiguration();

    @Import(name="fallbackBehavior", required=true)
    private WebACLIPSetForwardedIPConfigurationFallbackBehavior fallbackBehavior;

    public WebACLIPSetForwardedIPConfigurationFallbackBehavior fallbackBehavior() {
        return this.fallbackBehavior;
    }

    @Import(name="headerName", required=true)
    private String headerName;

    public String headerName() {
        return this.headerName;
    }

    @Import(name="position", required=true)
    private WebACLIPSetForwardedIPConfigurationPosition position;

    public WebACLIPSetForwardedIPConfigurationPosition position() {
        return this.position;
    }

    private WebACLIPSetForwardedIPConfiguration() {}

    private WebACLIPSetForwardedIPConfiguration(WebACLIPSetForwardedIPConfiguration $) {
        this.fallbackBehavior = $.fallbackBehavior;
        this.headerName = $.headerName;
        this.position = $.position;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebACLIPSetForwardedIPConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLIPSetForwardedIPConfiguration $;

        public Builder() {
            $ = new WebACLIPSetForwardedIPConfiguration();
        }

        public Builder(WebACLIPSetForwardedIPConfiguration defaults) {
            $ = new WebACLIPSetForwardedIPConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder fallbackBehavior(WebACLIPSetForwardedIPConfigurationFallbackBehavior fallbackBehavior) {
            $.fallbackBehavior = fallbackBehavior;
            return this;
        }

        public Builder headerName(String headerName) {
            $.headerName = headerName;
            return this;
        }

        public Builder position(WebACLIPSetForwardedIPConfigurationPosition position) {
            $.position = position;
            return this;
        }

        public WebACLIPSetForwardedIPConfiguration build() {
            $.fallbackBehavior = Objects.requireNonNull($.fallbackBehavior, "expected parameter 'fallbackBehavior' to be non-null");
            $.headerName = Objects.requireNonNull($.headerName, "expected parameter 'headerName' to be non-null");
            $.position = Objects.requireNonNull($.position, "expected parameter 'position' to be non-null");
            return $;
        }
    }

}
