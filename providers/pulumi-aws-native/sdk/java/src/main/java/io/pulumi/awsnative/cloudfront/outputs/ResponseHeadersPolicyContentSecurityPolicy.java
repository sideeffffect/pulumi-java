// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResponseHeadersPolicyContentSecurityPolicy {
    private final String contentSecurityPolicy;
    private final Boolean override;

    @OutputCustomType.Constructor
    private ResponseHeadersPolicyContentSecurityPolicy(
        @OutputCustomType.Parameter("contentSecurityPolicy") String contentSecurityPolicy,
        @OutputCustomType.Parameter("override") Boolean override) {
        this.contentSecurityPolicy = contentSecurityPolicy;
        this.override = override;
    }

    public String getContentSecurityPolicy() {
        return this.contentSecurityPolicy;
    }
    public Boolean getOverride() {
        return this.override;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyContentSecurityPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contentSecurityPolicy;
        private Boolean override;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyContentSecurityPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentSecurityPolicy = defaults.contentSecurityPolicy;
    	      this.override = defaults.override;
        }

        public Builder contentSecurityPolicy(String contentSecurityPolicy) {
            this.contentSecurityPolicy = Objects.requireNonNull(contentSecurityPolicy);
            return this;
        }

        public Builder override(Boolean override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }
        public ResponseHeadersPolicyContentSecurityPolicy build() {
            return new ResponseHeadersPolicyContentSecurityPolicy(contentSecurityPolicy, override);
        }
    }
}
