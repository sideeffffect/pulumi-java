// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * API connection properties
 * 
 */
public final class ApiConnectionTestLinkResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApiConnectionTestLinkResponse Empty = new ApiConnectionTestLinkResponse();

    /**
     * HTTP Method
     * 
     */
    @Import(name="method")
      private final @Nullable String method;

    public Optional<String> method() {
        return this.method == null ? Optional.empty() : Optional.ofNullable(this.method);
    }

    /**
     * Test link request URI
     * 
     */
    @Import(name="requestUri")
      private final @Nullable String requestUri;

    public Optional<String> requestUri() {
        return this.requestUri == null ? Optional.empty() : Optional.ofNullable(this.requestUri);
    }

    public ApiConnectionTestLinkResponse(
        @Nullable String method,
        @Nullable String requestUri) {
        this.method = method;
        this.requestUri = requestUri;
    }

    private ApiConnectionTestLinkResponse() {
        this.method = null;
        this.requestUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiConnectionTestLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String method;
        private @Nullable String requestUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiConnectionTestLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.method = defaults.method;
    	      this.requestUri = defaults.requestUri;
        }

        public Builder method(@Nullable String method) {
            this.method = method;
            return this;
        }
        public Builder requestUri(@Nullable String requestUri) {
            this.requestUri = requestUri;
            return this;
        }        public ApiConnectionTestLinkResponse build() {
            return new ApiConnectionTestLinkResponse(method, requestUri);
        }
    }
}
