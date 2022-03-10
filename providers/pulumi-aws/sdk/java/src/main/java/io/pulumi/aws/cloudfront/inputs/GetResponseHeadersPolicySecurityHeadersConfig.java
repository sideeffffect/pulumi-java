// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.GetResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy;
import io.pulumi.aws.cloudfront.inputs.GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption;
import io.pulumi.aws.cloudfront.inputs.GetResponseHeadersPolicySecurityHeadersConfigFrameOption;
import io.pulumi.aws.cloudfront.inputs.GetResponseHeadersPolicySecurityHeadersConfigReferrerPolicy;
import io.pulumi.aws.cloudfront.inputs.GetResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurity;
import io.pulumi.aws.cloudfront.inputs.GetResponseHeadersPolicySecurityHeadersConfigXssProtection;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class GetResponseHeadersPolicySecurityHeadersConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetResponseHeadersPolicySecurityHeadersConfig Empty = new GetResponseHeadersPolicySecurityHeadersConfig();

    /**
     * The policy directives and their values that CloudFront includes as values for the Content-Security-Policy HTTP response header.
     * 
     */
    @InputImport(name="contentSecurityPolicies", required=true)
      private final List<GetResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy> contentSecurityPolicies;

    public List<GetResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy> getContentSecurityPolicies() {
        return this.contentSecurityPolicies;
    }

    /**
     * A setting that determines whether CloudFront includes the X-Content-Type-Options HTTP response header with its value set to nosniff. See Content Type Options for more information.
     * 
     */
    @InputImport(name="contentTypeOptions", required=true)
      private final List<GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption> contentTypeOptions;

    public List<GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption> getContentTypeOptions() {
        return this.contentTypeOptions;
    }

    /**
     * A setting that determines whether CloudFront includes the X-Frame-Options HTTP response header and the header’s value. See Frame Options for more information.
     * 
     */
    @InputImport(name="frameOptions", required=true)
      private final List<GetResponseHeadersPolicySecurityHeadersConfigFrameOption> frameOptions;

    public List<GetResponseHeadersPolicySecurityHeadersConfigFrameOption> getFrameOptions() {
        return this.frameOptions;
    }

    /**
     * The value of the Referrer-Policy HTTP response header. Valid Values: `no-referrer` | `no-referrer-when-downgrade` | `origin` | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
     * 
     */
    @InputImport(name="referrerPolicies", required=true)
      private final List<GetResponseHeadersPolicySecurityHeadersConfigReferrerPolicy> referrerPolicies;

    public List<GetResponseHeadersPolicySecurityHeadersConfigReferrerPolicy> getReferrerPolicies() {
        return this.referrerPolicies;
    }

    /**
     * Settings that determine whether CloudFront includes the Strict-Transport-Security HTTP response header and the header’s value. See Strict Transport Security for more information.
     * 
     */
    @InputImport(name="strictTransportSecurities", required=true)
      private final List<GetResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurity> strictTransportSecurities;

    public List<GetResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurity> getStrictTransportSecurities() {
        return this.strictTransportSecurities;
    }

    /**
     * Settings that determine whether CloudFront includes the X-XSS-Protection HTTP response header and the header’s value. See XSS Protection for more information.
     * 
     */
    @InputImport(name="xssProtections", required=true)
      private final List<GetResponseHeadersPolicySecurityHeadersConfigXssProtection> xssProtections;

    public List<GetResponseHeadersPolicySecurityHeadersConfigXssProtection> getXssProtections() {
        return this.xssProtections;
    }

    public GetResponseHeadersPolicySecurityHeadersConfig(
        List<GetResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy> contentSecurityPolicies,
        List<GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption> contentTypeOptions,
        List<GetResponseHeadersPolicySecurityHeadersConfigFrameOption> frameOptions,
        List<GetResponseHeadersPolicySecurityHeadersConfigReferrerPolicy> referrerPolicies,
        List<GetResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurity> strictTransportSecurities,
        List<GetResponseHeadersPolicySecurityHeadersConfigXssProtection> xssProtections) {
        this.contentSecurityPolicies = Objects.requireNonNull(contentSecurityPolicies, "expected parameter 'contentSecurityPolicies' to be non-null");
        this.contentTypeOptions = Objects.requireNonNull(contentTypeOptions, "expected parameter 'contentTypeOptions' to be non-null");
        this.frameOptions = Objects.requireNonNull(frameOptions, "expected parameter 'frameOptions' to be non-null");
        this.referrerPolicies = Objects.requireNonNull(referrerPolicies, "expected parameter 'referrerPolicies' to be non-null");
        this.strictTransportSecurities = Objects.requireNonNull(strictTransportSecurities, "expected parameter 'strictTransportSecurities' to be non-null");
        this.xssProtections = Objects.requireNonNull(xssProtections, "expected parameter 'xssProtections' to be non-null");
    }

    private GetResponseHeadersPolicySecurityHeadersConfig() {
        this.contentSecurityPolicies = List.of();
        this.contentTypeOptions = List.of();
        this.frameOptions = List.of();
        this.referrerPolicies = List.of();
        this.strictTransportSecurities = List.of();
        this.xssProtections = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponseHeadersPolicySecurityHeadersConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy> contentSecurityPolicies;
        private List<GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption> contentTypeOptions;
        private List<GetResponseHeadersPolicySecurityHeadersConfigFrameOption> frameOptions;
        private List<GetResponseHeadersPolicySecurityHeadersConfigReferrerPolicy> referrerPolicies;
        private List<GetResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurity> strictTransportSecurities;
        private List<GetResponseHeadersPolicySecurityHeadersConfigXssProtection> xssProtections;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResponseHeadersPolicySecurityHeadersConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentSecurityPolicies = defaults.contentSecurityPolicies;
    	      this.contentTypeOptions = defaults.contentTypeOptions;
    	      this.frameOptions = defaults.frameOptions;
    	      this.referrerPolicies = defaults.referrerPolicies;
    	      this.strictTransportSecurities = defaults.strictTransportSecurities;
    	      this.xssProtections = defaults.xssProtections;
        }

        public Builder contentSecurityPolicies(List<GetResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy> contentSecurityPolicies) {
            this.contentSecurityPolicies = Objects.requireNonNull(contentSecurityPolicies);
            return this;
        }

        public Builder contentTypeOptions(List<GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption> contentTypeOptions) {
            this.contentTypeOptions = Objects.requireNonNull(contentTypeOptions);
            return this;
        }

        public Builder frameOptions(List<GetResponseHeadersPolicySecurityHeadersConfigFrameOption> frameOptions) {
            this.frameOptions = Objects.requireNonNull(frameOptions);
            return this;
        }

        public Builder referrerPolicies(List<GetResponseHeadersPolicySecurityHeadersConfigReferrerPolicy> referrerPolicies) {
            this.referrerPolicies = Objects.requireNonNull(referrerPolicies);
            return this;
        }

        public Builder strictTransportSecurities(List<GetResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurity> strictTransportSecurities) {
            this.strictTransportSecurities = Objects.requireNonNull(strictTransportSecurities);
            return this;
        }

        public Builder xssProtections(List<GetResponseHeadersPolicySecurityHeadersConfigXssProtection> xssProtections) {
            this.xssProtections = Objects.requireNonNull(xssProtections);
            return this;
        }
        public GetResponseHeadersPolicySecurityHeadersConfig build() {
            return new GetResponseHeadersPolicySecurityHeadersConfig(contentSecurityPolicies, contentTypeOptions, frameOptions, referrerPolicies, strictTransportSecurities, xssProtections);
        }
    }
}
