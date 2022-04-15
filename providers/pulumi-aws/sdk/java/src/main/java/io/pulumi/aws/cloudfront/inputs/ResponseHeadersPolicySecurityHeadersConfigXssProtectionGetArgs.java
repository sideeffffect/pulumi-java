// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResponseHeadersPolicySecurityHeadersConfigXssProtectionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicySecurityHeadersConfigXssProtectionGetArgs Empty = new ResponseHeadersPolicySecurityHeadersConfigXssProtectionGetArgs();

    /**
     * A Boolean value that determines whether CloudFront includes the `mode=block` directive in the `X-XSS-Protection` header.
     * 
     */
    @Import(name="modeBlock")
      private final @Nullable Output<Boolean> modeBlock;

    public Output<Boolean> modeBlock() {
        return this.modeBlock == null ? Codegen.empty() : this.modeBlock;
    }

    /**
     * A Boolean value that determines whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    @Import(name="override", required=true)
      private final Output<Boolean> override;

    public Output<Boolean> override() {
        return this.override;
    }

    /**
     * A Boolean value that determines the value of the `X-XSS-Protection` HTTP response header. When this setting is `true`, the value of the `X-XSS-Protection` header is `1`. When this setting is `false`, the value of the `X-XSS-Protection` header is `0`.
     * 
     */
    @Import(name="protection", required=true)
      private final Output<Boolean> protection;

    public Output<Boolean> protection() {
        return this.protection;
    }

    /**
     * A reporting URI, which CloudFront uses as the value of the report directive in the `X-XSS-Protection` header. You cannot specify a `report_uri` when `mode_block` is `true`.
     * 
     */
    @Import(name="reportUri")
      private final @Nullable Output<String> reportUri;

    public Output<String> reportUri() {
        return this.reportUri == null ? Codegen.empty() : this.reportUri;
    }

    public ResponseHeadersPolicySecurityHeadersConfigXssProtectionGetArgs(
        @Nullable Output<Boolean> modeBlock,
        Output<Boolean> override,
        Output<Boolean> protection,
        @Nullable Output<String> reportUri) {
        this.modeBlock = modeBlock;
        this.override = Objects.requireNonNull(override, "expected parameter 'override' to be non-null");
        this.protection = Objects.requireNonNull(protection, "expected parameter 'protection' to be non-null");
        this.reportUri = reportUri;
    }

    private ResponseHeadersPolicySecurityHeadersConfigXssProtectionGetArgs() {
        this.modeBlock = Codegen.empty();
        this.override = Codegen.empty();
        this.protection = Codegen.empty();
        this.reportUri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicySecurityHeadersConfigXssProtectionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> modeBlock;
        private Output<Boolean> override;
        private Output<Boolean> protection;
        private @Nullable Output<String> reportUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicySecurityHeadersConfigXssProtectionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.modeBlock = defaults.modeBlock;
    	      this.override = defaults.override;
    	      this.protection = defaults.protection;
    	      this.reportUri = defaults.reportUri;
        }

        public Builder modeBlock(@Nullable Output<Boolean> modeBlock) {
            this.modeBlock = modeBlock;
            return this;
        }
        public Builder modeBlock(@Nullable Boolean modeBlock) {
            this.modeBlock = Codegen.ofNullable(modeBlock);
            return this;
        }
        public Builder override(Output<Boolean> override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }
        public Builder override(Boolean override) {
            this.override = Output.of(Objects.requireNonNull(override));
            return this;
        }
        public Builder protection(Output<Boolean> protection) {
            this.protection = Objects.requireNonNull(protection);
            return this;
        }
        public Builder protection(Boolean protection) {
            this.protection = Output.of(Objects.requireNonNull(protection));
            return this;
        }
        public Builder reportUri(@Nullable Output<String> reportUri) {
            this.reportUri = reportUri;
            return this;
        }
        public Builder reportUri(@Nullable String reportUri) {
            this.reportUri = Codegen.ofNullable(reportUri);
            return this;
        }        public ResponseHeadersPolicySecurityHeadersConfigXssProtectionGetArgs build() {
            return new ResponseHeadersPolicySecurityHeadersConfigXssProtectionGetArgs(modeBlock, override, protection, reportUri);
        }
    }
}
