// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclDefaultActionBlockCustomResponseResponseHeaderGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclDefaultActionBlockCustomResponseGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclDefaultActionBlockCustomResponseGetArgs Empty = new WebAclDefaultActionBlockCustomResponseGetArgs();

    /**
     * References the response body that you want AWS WAF to return to the web request client. This must reference a `key` defined in a `custom_response_body` block of this resource.
     * 
     */
    @InputImport(name="customResponseBodyKey")
      private final @Nullable Input<String> customResponseBodyKey;

    public Input<String> getCustomResponseBodyKey() {
        return this.customResponseBodyKey == null ? Input.empty() : this.customResponseBodyKey;
    }

    /**
     * The HTTP status code to return to the client.
     * 
     */
    @InputImport(name="responseCode", required=true)
      private final Input<Integer> responseCode;

    public Input<Integer> getResponseCode() {
        return this.responseCode;
    }

    /**
     * The `response_header` blocks used to define the HTTP response headers added to the response. See Custom HTTP Header below for details.
     * 
     */
    @InputImport(name="responseHeaders")
      private final @Nullable Input<List<WebAclDefaultActionBlockCustomResponseResponseHeaderGetArgs>> responseHeaders;

    public Input<List<WebAclDefaultActionBlockCustomResponseResponseHeaderGetArgs>> getResponseHeaders() {
        return this.responseHeaders == null ? Input.empty() : this.responseHeaders;
    }

    public WebAclDefaultActionBlockCustomResponseGetArgs(
        @Nullable Input<String> customResponseBodyKey,
        Input<Integer> responseCode,
        @Nullable Input<List<WebAclDefaultActionBlockCustomResponseResponseHeaderGetArgs>> responseHeaders) {
        this.customResponseBodyKey = customResponseBodyKey;
        this.responseCode = Objects.requireNonNull(responseCode, "expected parameter 'responseCode' to be non-null");
        this.responseHeaders = responseHeaders;
    }

    private WebAclDefaultActionBlockCustomResponseGetArgs() {
        this.customResponseBodyKey = Input.empty();
        this.responseCode = Input.empty();
        this.responseHeaders = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclDefaultActionBlockCustomResponseGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> customResponseBodyKey;
        private Input<Integer> responseCode;
        private @Nullable Input<List<WebAclDefaultActionBlockCustomResponseResponseHeaderGetArgs>> responseHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclDefaultActionBlockCustomResponseGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customResponseBodyKey = defaults.customResponseBodyKey;
    	      this.responseCode = defaults.responseCode;
    	      this.responseHeaders = defaults.responseHeaders;
        }

        public Builder customResponseBodyKey(@Nullable Input<String> customResponseBodyKey) {
            this.customResponseBodyKey = customResponseBodyKey;
            return this;
        }

        public Builder customResponseBodyKey(@Nullable String customResponseBodyKey) {
            this.customResponseBodyKey = Input.ofNullable(customResponseBodyKey);
            return this;
        }

        public Builder responseCode(Input<Integer> responseCode) {
            this.responseCode = Objects.requireNonNull(responseCode);
            return this;
        }

        public Builder responseCode(Integer responseCode) {
            this.responseCode = Input.of(Objects.requireNonNull(responseCode));
            return this;
        }

        public Builder responseHeaders(@Nullable Input<List<WebAclDefaultActionBlockCustomResponseResponseHeaderGetArgs>> responseHeaders) {
            this.responseHeaders = responseHeaders;
            return this;
        }

        public Builder responseHeaders(@Nullable List<WebAclDefaultActionBlockCustomResponseResponseHeaderGetArgs> responseHeaders) {
            this.responseHeaders = Input.ofNullable(responseHeaders);
            return this;
        }
        public WebAclDefaultActionBlockCustomResponseGetArgs build() {
            return new WebAclDefaultActionBlockCustomResponseGetArgs(customResponseBodyKey, responseCode, responseHeaders);
        }
    }
}
