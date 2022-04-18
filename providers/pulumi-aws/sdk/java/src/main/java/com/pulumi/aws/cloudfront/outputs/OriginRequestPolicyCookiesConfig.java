// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.OriginRequestPolicyCookiesConfigCookies;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OriginRequestPolicyCookiesConfig {
    private final String cookieBehavior;
    private final @Nullable OriginRequestPolicyCookiesConfigCookies cookies;

    @CustomType.Constructor
    private OriginRequestPolicyCookiesConfig(
        @CustomType.Parameter("cookieBehavior") String cookieBehavior,
        @CustomType.Parameter("cookies") @Nullable OriginRequestPolicyCookiesConfigCookies cookies) {
        this.cookieBehavior = cookieBehavior;
        this.cookies = cookies;
    }

    public String cookieBehavior() {
        return this.cookieBehavior;
    }
    public Optional<OriginRequestPolicyCookiesConfigCookies> cookies() {
        return Optional.ofNullable(this.cookies);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginRequestPolicyCookiesConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cookieBehavior;
        private @Nullable OriginRequestPolicyCookiesConfigCookies cookies;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginRequestPolicyCookiesConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookieBehavior = defaults.cookieBehavior;
    	      this.cookies = defaults.cookies;
        }

        public Builder cookieBehavior(String cookieBehavior) {
            this.cookieBehavior = Objects.requireNonNull(cookieBehavior);
            return this;
        }
        public Builder cookies(@Nullable OriginRequestPolicyCookiesConfigCookies cookies) {
            this.cookies = cookies;
            return this;
        }        public OriginRequestPolicyCookiesConfig build() {
            return new OriginRequestPolicyCookiesConfig(cookieBehavior, cookies);
        }
    }
}
