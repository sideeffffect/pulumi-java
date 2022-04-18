// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.outputs;

import com.pulumi.awsnative.cloudfront.outputs.ResponseHeadersPolicyAccessControlAllowHeaders;
import com.pulumi.awsnative.cloudfront.outputs.ResponseHeadersPolicyAccessControlAllowMethods;
import com.pulumi.awsnative.cloudfront.outputs.ResponseHeadersPolicyAccessControlAllowOrigins;
import com.pulumi.awsnative.cloudfront.outputs.ResponseHeadersPolicyAccessControlExposeHeaders;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResponseHeadersPolicyCorsConfig {
    private final Boolean accessControlAllowCredentials;
    private final ResponseHeadersPolicyAccessControlAllowHeaders accessControlAllowHeaders;
    private final ResponseHeadersPolicyAccessControlAllowMethods accessControlAllowMethods;
    private final ResponseHeadersPolicyAccessControlAllowOrigins accessControlAllowOrigins;
    private final @Nullable ResponseHeadersPolicyAccessControlExposeHeaders accessControlExposeHeaders;
    private final @Nullable Integer accessControlMaxAgeSec;
    private final Boolean originOverride;

    @CustomType.Constructor
    private ResponseHeadersPolicyCorsConfig(
        @CustomType.Parameter("accessControlAllowCredentials") Boolean accessControlAllowCredentials,
        @CustomType.Parameter("accessControlAllowHeaders") ResponseHeadersPolicyAccessControlAllowHeaders accessControlAllowHeaders,
        @CustomType.Parameter("accessControlAllowMethods") ResponseHeadersPolicyAccessControlAllowMethods accessControlAllowMethods,
        @CustomType.Parameter("accessControlAllowOrigins") ResponseHeadersPolicyAccessControlAllowOrigins accessControlAllowOrigins,
        @CustomType.Parameter("accessControlExposeHeaders") @Nullable ResponseHeadersPolicyAccessControlExposeHeaders accessControlExposeHeaders,
        @CustomType.Parameter("accessControlMaxAgeSec") @Nullable Integer accessControlMaxAgeSec,
        @CustomType.Parameter("originOverride") Boolean originOverride) {
        this.accessControlAllowCredentials = accessControlAllowCredentials;
        this.accessControlAllowHeaders = accessControlAllowHeaders;
        this.accessControlAllowMethods = accessControlAllowMethods;
        this.accessControlAllowOrigins = accessControlAllowOrigins;
        this.accessControlExposeHeaders = accessControlExposeHeaders;
        this.accessControlMaxAgeSec = accessControlMaxAgeSec;
        this.originOverride = originOverride;
    }

    public Boolean accessControlAllowCredentials() {
        return this.accessControlAllowCredentials;
    }
    public ResponseHeadersPolicyAccessControlAllowHeaders accessControlAllowHeaders() {
        return this.accessControlAllowHeaders;
    }
    public ResponseHeadersPolicyAccessControlAllowMethods accessControlAllowMethods() {
        return this.accessControlAllowMethods;
    }
    public ResponseHeadersPolicyAccessControlAllowOrigins accessControlAllowOrigins() {
        return this.accessControlAllowOrigins;
    }
    public Optional<ResponseHeadersPolicyAccessControlExposeHeaders> accessControlExposeHeaders() {
        return Optional.ofNullable(this.accessControlExposeHeaders);
    }
    public Optional<Integer> accessControlMaxAgeSec() {
        return Optional.ofNullable(this.accessControlMaxAgeSec);
    }
    public Boolean originOverride() {
        return this.originOverride;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyCorsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean accessControlAllowCredentials;
        private ResponseHeadersPolicyAccessControlAllowHeaders accessControlAllowHeaders;
        private ResponseHeadersPolicyAccessControlAllowMethods accessControlAllowMethods;
        private ResponseHeadersPolicyAccessControlAllowOrigins accessControlAllowOrigins;
        private @Nullable ResponseHeadersPolicyAccessControlExposeHeaders accessControlExposeHeaders;
        private @Nullable Integer accessControlMaxAgeSec;
        private Boolean originOverride;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyCorsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControlAllowCredentials = defaults.accessControlAllowCredentials;
    	      this.accessControlAllowHeaders = defaults.accessControlAllowHeaders;
    	      this.accessControlAllowMethods = defaults.accessControlAllowMethods;
    	      this.accessControlAllowOrigins = defaults.accessControlAllowOrigins;
    	      this.accessControlExposeHeaders = defaults.accessControlExposeHeaders;
    	      this.accessControlMaxAgeSec = defaults.accessControlMaxAgeSec;
    	      this.originOverride = defaults.originOverride;
        }

        public Builder accessControlAllowCredentials(Boolean accessControlAllowCredentials) {
            this.accessControlAllowCredentials = Objects.requireNonNull(accessControlAllowCredentials);
            return this;
        }
        public Builder accessControlAllowHeaders(ResponseHeadersPolicyAccessControlAllowHeaders accessControlAllowHeaders) {
            this.accessControlAllowHeaders = Objects.requireNonNull(accessControlAllowHeaders);
            return this;
        }
        public Builder accessControlAllowMethods(ResponseHeadersPolicyAccessControlAllowMethods accessControlAllowMethods) {
            this.accessControlAllowMethods = Objects.requireNonNull(accessControlAllowMethods);
            return this;
        }
        public Builder accessControlAllowOrigins(ResponseHeadersPolicyAccessControlAllowOrigins accessControlAllowOrigins) {
            this.accessControlAllowOrigins = Objects.requireNonNull(accessControlAllowOrigins);
            return this;
        }
        public Builder accessControlExposeHeaders(@Nullable ResponseHeadersPolicyAccessControlExposeHeaders accessControlExposeHeaders) {
            this.accessControlExposeHeaders = accessControlExposeHeaders;
            return this;
        }
        public Builder accessControlMaxAgeSec(@Nullable Integer accessControlMaxAgeSec) {
            this.accessControlMaxAgeSec = accessControlMaxAgeSec;
            return this;
        }
        public Builder originOverride(Boolean originOverride) {
            this.originOverride = Objects.requireNonNull(originOverride);
            return this;
        }        public ResponseHeadersPolicyCorsConfig build() {
            return new ResponseHeadersPolicyCorsConfig(accessControlAllowCredentials, accessControlAllowHeaders, accessControlAllowMethods, accessControlAllowOrigins, accessControlExposeHeaders, accessControlMaxAgeSec, originOverride);
        }
    }
}
