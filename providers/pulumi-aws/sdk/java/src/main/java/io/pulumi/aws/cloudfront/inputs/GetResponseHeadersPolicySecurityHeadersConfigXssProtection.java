// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetResponseHeadersPolicySecurityHeadersConfigXssProtection extends io.pulumi.resources.InvokeArgs {

    public static final GetResponseHeadersPolicySecurityHeadersConfigXssProtection Empty = new GetResponseHeadersPolicySecurityHeadersConfigXssProtection();

    /**
     * A Boolean value that determines whether CloudFront includes the mode=block directive in the X-XSS-Protection header.
     * 
     */
    @InputImport(name="modeBlock", required=true)
      private final Boolean modeBlock;

    public Boolean getModeBlock() {
        return this.modeBlock;
    }

    /**
     * A Boolean value that determines whether CloudFront overrides the X-XSS-Protection HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    @InputImport(name="override", required=true)
      private final Boolean override;

    public Boolean getOverride() {
        return this.override;
    }

    /**
     * A Boolean value that determines the value of the X-XSS-Protection HTTP response header. When this setting is true, the value of the X-XSS-Protection header is 1. When this setting is false, the value of the X-XSS-Protection header is 0.
     * 
     */
    @InputImport(name="protection", required=true)
      private final Boolean protection;

    public Boolean getProtection() {
        return this.protection;
    }

    /**
     * A Boolean value that determines whether CloudFront sets a reporting URI in the X-XSS-Protection header.
     * 
     */
    @InputImport(name="reportUri", required=true)
      private final String reportUri;

    public String getReportUri() {
        return this.reportUri;
    }

    public GetResponseHeadersPolicySecurityHeadersConfigXssProtection(
        Boolean modeBlock,
        Boolean override,
        Boolean protection,
        String reportUri) {
        this.modeBlock = Objects.requireNonNull(modeBlock, "expected parameter 'modeBlock' to be non-null");
        this.override = Objects.requireNonNull(override, "expected parameter 'override' to be non-null");
        this.protection = Objects.requireNonNull(protection, "expected parameter 'protection' to be non-null");
        this.reportUri = Objects.requireNonNull(reportUri, "expected parameter 'reportUri' to be non-null");
    }

    private GetResponseHeadersPolicySecurityHeadersConfigXssProtection() {
        this.modeBlock = null;
        this.override = null;
        this.protection = null;
        this.reportUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponseHeadersPolicySecurityHeadersConfigXssProtection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean modeBlock;
        private Boolean override;
        private Boolean protection;
        private String reportUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResponseHeadersPolicySecurityHeadersConfigXssProtection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.modeBlock = defaults.modeBlock;
    	      this.override = defaults.override;
    	      this.protection = defaults.protection;
    	      this.reportUri = defaults.reportUri;
        }

        public Builder modeBlock(Boolean modeBlock) {
            this.modeBlock = Objects.requireNonNull(modeBlock);
            return this;
        }

        public Builder override(Boolean override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }

        public Builder protection(Boolean protection) {
            this.protection = Objects.requireNonNull(protection);
            return this;
        }

        public Builder reportUri(String reportUri) {
            this.reportUri = Objects.requireNonNull(reportUri);
            return this;
        }
        public GetResponseHeadersPolicySecurityHeadersConfigXssProtection build() {
            return new GetResponseHeadersPolicySecurityHeadersConfigXssProtection(modeBlock, override, protection, reportUri);
        }
    }
}
