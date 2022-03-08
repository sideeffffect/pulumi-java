// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption {
    /**
     * A Boolean value that determines whether CloudFront overrides the X-XSS-Protection HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    private final Boolean override;

    @OutputCustomType.Constructor({"override"})
    private GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption(Boolean override) {
        this.override = override;
    }

    /**
     * A Boolean value that determines whether CloudFront overrides the X-XSS-Protection HTTP response header received from the origin with the one specified in this response headers policy.
     * 
    */
    public Boolean getOverride() {
        return this.override;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean override;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.override = defaults.override;
        }

        public Builder setOverride(Boolean override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }
        public GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption build() {
            return new GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption(override);
        }
    }
}
