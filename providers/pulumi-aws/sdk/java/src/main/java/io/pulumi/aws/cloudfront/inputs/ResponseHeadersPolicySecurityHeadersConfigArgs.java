// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigFrameOptionsArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResponseHeadersPolicySecurityHeadersConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicySecurityHeadersConfigArgs Empty = new ResponseHeadersPolicySecurityHeadersConfigArgs();

    /**
     * The policy directives and their values that CloudFront includes as values for the `Content-Security-Policy` HTTP response header.
     * 
     */
    @Import(name="contentSecurityPolicy")
      private final @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyArgs> contentSecurityPolicy;

    public Output<ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyArgs> contentSecurityPolicy() {
        return this.contentSecurityPolicy == null ? Codegen.empty() : this.contentSecurityPolicy;
    }

    /**
     * Determines whether CloudFront includes the `X-Content-Type-Options` HTTP response header with its value set to `nosniff`. See Content Type Options for more information.
     * 
     */
    @Import(name="contentTypeOptions")
      private final @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsArgs> contentTypeOptions;

    public Output<ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsArgs> contentTypeOptions() {
        return this.contentTypeOptions == null ? Codegen.empty() : this.contentTypeOptions;
    }

    /**
     * Determines whether CloudFront includes the `X-Frame-Options` HTTP response header and the header’s value. See Frame Options for more information.
     * 
     */
    @Import(name="frameOptions")
      private final @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigFrameOptionsArgs> frameOptions;

    public Output<ResponseHeadersPolicySecurityHeadersConfigFrameOptionsArgs> frameOptions() {
        return this.frameOptions == null ? Codegen.empty() : this.frameOptions;
    }

    /**
     * The value of the `Referrer-Policy` HTTP response header. Valid Values: `no-referrer` | `no-referrer-when-downgrade` | `origin` | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
     * 
     */
    @Import(name="referrerPolicy")
      private final @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs> referrerPolicy;

    public Output<ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs> referrerPolicy() {
        return this.referrerPolicy == null ? Codegen.empty() : this.referrerPolicy;
    }

    /**
     * Determines whether CloudFront includes the `Strict-Transport-Security` HTTP response header and the header’s value. See Strict Transport Security for more information.
     * 
     */
    @Import(name="strictTransportSecurity")
      private final @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityArgs> strictTransportSecurity;

    public Output<ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityArgs> strictTransportSecurity() {
        return this.strictTransportSecurity == null ? Codegen.empty() : this.strictTransportSecurity;
    }

    /**
     * Determine whether CloudFront includes the `X-XSS-Protection` HTTP response header and the header’s value. See XSS Protection for more information.
     * 
     */
    @Import(name="xssProtection")
      private final @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs> xssProtection;

    public Output<ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs> xssProtection() {
        return this.xssProtection == null ? Codegen.empty() : this.xssProtection;
    }

    public ResponseHeadersPolicySecurityHeadersConfigArgs(
        @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyArgs> contentSecurityPolicy,
        @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsArgs> contentTypeOptions,
        @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigFrameOptionsArgs> frameOptions,
        @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs> referrerPolicy,
        @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityArgs> strictTransportSecurity,
        @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs> xssProtection) {
        this.contentSecurityPolicy = contentSecurityPolicy;
        this.contentTypeOptions = contentTypeOptions;
        this.frameOptions = frameOptions;
        this.referrerPolicy = referrerPolicy;
        this.strictTransportSecurity = strictTransportSecurity;
        this.xssProtection = xssProtection;
    }

    private ResponseHeadersPolicySecurityHeadersConfigArgs() {
        this.contentSecurityPolicy = Codegen.empty();
        this.contentTypeOptions = Codegen.empty();
        this.frameOptions = Codegen.empty();
        this.referrerPolicy = Codegen.empty();
        this.strictTransportSecurity = Codegen.empty();
        this.xssProtection = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicySecurityHeadersConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyArgs> contentSecurityPolicy;
        private @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsArgs> contentTypeOptions;
        private @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigFrameOptionsArgs> frameOptions;
        private @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs> referrerPolicy;
        private @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityArgs> strictTransportSecurity;
        private @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs> xssProtection;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicySecurityHeadersConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentSecurityPolicy = defaults.contentSecurityPolicy;
    	      this.contentTypeOptions = defaults.contentTypeOptions;
    	      this.frameOptions = defaults.frameOptions;
    	      this.referrerPolicy = defaults.referrerPolicy;
    	      this.strictTransportSecurity = defaults.strictTransportSecurity;
    	      this.xssProtection = defaults.xssProtection;
        }

        public Builder contentSecurityPolicy(@Nullable Output<ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyArgs> contentSecurityPolicy) {
            this.contentSecurityPolicy = contentSecurityPolicy;
            return this;
        }
        public Builder contentSecurityPolicy(@Nullable ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyArgs contentSecurityPolicy) {
            this.contentSecurityPolicy = Codegen.ofNullable(contentSecurityPolicy);
            return this;
        }
        public Builder contentTypeOptions(@Nullable Output<ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsArgs> contentTypeOptions) {
            this.contentTypeOptions = contentTypeOptions;
            return this;
        }
        public Builder contentTypeOptions(@Nullable ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsArgs contentTypeOptions) {
            this.contentTypeOptions = Codegen.ofNullable(contentTypeOptions);
            return this;
        }
        public Builder frameOptions(@Nullable Output<ResponseHeadersPolicySecurityHeadersConfigFrameOptionsArgs> frameOptions) {
            this.frameOptions = frameOptions;
            return this;
        }
        public Builder frameOptions(@Nullable ResponseHeadersPolicySecurityHeadersConfigFrameOptionsArgs frameOptions) {
            this.frameOptions = Codegen.ofNullable(frameOptions);
            return this;
        }
        public Builder referrerPolicy(@Nullable Output<ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs> referrerPolicy) {
            this.referrerPolicy = referrerPolicy;
            return this;
        }
        public Builder referrerPolicy(@Nullable ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs referrerPolicy) {
            this.referrerPolicy = Codegen.ofNullable(referrerPolicy);
            return this;
        }
        public Builder strictTransportSecurity(@Nullable Output<ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityArgs> strictTransportSecurity) {
            this.strictTransportSecurity = strictTransportSecurity;
            return this;
        }
        public Builder strictTransportSecurity(@Nullable ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityArgs strictTransportSecurity) {
            this.strictTransportSecurity = Codegen.ofNullable(strictTransportSecurity);
            return this;
        }
        public Builder xssProtection(@Nullable Output<ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs> xssProtection) {
            this.xssProtection = xssProtection;
            return this;
        }
        public Builder xssProtection(@Nullable ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs xssProtection) {
            this.xssProtection = Codegen.ofNullable(xssProtection);
            return this;
        }        public ResponseHeadersPolicySecurityHeadersConfigArgs build() {
            return new ResponseHeadersPolicySecurityHeadersConfigArgs(contentSecurityPolicy, contentTypeOptions, frameOptions, referrerPolicy, strictTransportSecurity, xssProtection);
        }
    }
}
