// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.outputs;

import com.pulumi.awsnative.wafv2.outputs.WebACLImmunityTimeProperty;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebACLCaptchaConfig {
    private final @Nullable WebACLImmunityTimeProperty immunityTimeProperty;

    @CustomType.Constructor
    private WebACLCaptchaConfig(@CustomType.Parameter("immunityTimeProperty") @Nullable WebACLImmunityTimeProperty immunityTimeProperty) {
        this.immunityTimeProperty = immunityTimeProperty;
    }

    public Optional<WebACLImmunityTimeProperty> immunityTimeProperty() {
        return Optional.ofNullable(this.immunityTimeProperty);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLCaptchaConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebACLImmunityTimeProperty immunityTimeProperty;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLCaptchaConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.immunityTimeProperty = defaults.immunityTimeProperty;
        }

        public Builder immunityTimeProperty(@Nullable WebACLImmunityTimeProperty immunityTimeProperty) {
            this.immunityTimeProperty = immunityTimeProperty;
            return this;
        }        public WebACLCaptchaConfig build() {
            return new WebACLCaptchaConfig(immunityTimeProperty);
        }
    }
}
