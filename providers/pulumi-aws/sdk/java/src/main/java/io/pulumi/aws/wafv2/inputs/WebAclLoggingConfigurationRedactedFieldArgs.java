// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsArgs;
import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldBodyArgs;
import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldMethodArgs;
import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldQueryStringArgs;
import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldSingleHeaderArgs;
import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentArgs;
import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldUriPathArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclLoggingConfigurationRedactedFieldArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclLoggingConfigurationRedactedFieldArgs Empty = new WebAclLoggingConfigurationRedactedFieldArgs();

    /**
     * Redact all query arguments.
     * 
     * @Deprecated
     * Not supported by WAFv2 API
     * 
     */
    @Deprecated /* Not supported by WAFv2 API */
    @InputImport(name="allQueryArguments")
      private final @Nullable Input<WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsArgs> allQueryArguments;

    @Deprecated /* Not supported by WAFv2 API */
    public Input<WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Input.empty() : this.allQueryArguments;
    }

    /**
     * Redact the request body, which immediately follows the request headers.
     * 
     * @Deprecated
     * Not supported by WAFv2 API
     * 
     */
    @Deprecated /* Not supported by WAFv2 API */
    @InputImport(name="body")
      private final @Nullable Input<WebAclLoggingConfigurationRedactedFieldBodyArgs> body;

    @Deprecated /* Not supported by WAFv2 API */
    public Input<WebAclLoggingConfigurationRedactedFieldBodyArgs> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * Redact the HTTP method. Must be specified as an empty configuration block `{}`. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @InputImport(name="method")
      private final @Nullable Input<WebAclLoggingConfigurationRedactedFieldMethodArgs> method;

    public Input<WebAclLoggingConfigurationRedactedFieldMethodArgs> getMethod() {
        return this.method == null ? Input.empty() : this.method;
    }

    /**
     * Redact the query string. Must be specified as an empty configuration block `{}`. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @InputImport(name="queryString")
      private final @Nullable Input<WebAclLoggingConfigurationRedactedFieldQueryStringArgs> queryString;

    public Input<WebAclLoggingConfigurationRedactedFieldQueryStringArgs> getQueryString() {
        return this.queryString == null ? Input.empty() : this.queryString;
    }

    /**
     * Redact a single header. See Single Header below for details.
     * 
     */
    @InputImport(name="singleHeader")
      private final @Nullable Input<WebAclLoggingConfigurationRedactedFieldSingleHeaderArgs> singleHeader;

    public Input<WebAclLoggingConfigurationRedactedFieldSingleHeaderArgs> getSingleHeader() {
        return this.singleHeader == null ? Input.empty() : this.singleHeader;
    }

    /**
     * Redact a single query argument. See Single Query Argument below for details.
     * 
     * @Deprecated
     * Not supported by WAFv2 API
     * 
     */
    @Deprecated /* Not supported by WAFv2 API */
    @InputImport(name="singleQueryArgument")
      private final @Nullable Input<WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentArgs> singleQueryArgument;

    @Deprecated /* Not supported by WAFv2 API */
    public Input<WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Input.empty() : this.singleQueryArgument;
    }

    /**
     * Redact the request URI path. Must be specified as an empty configuration block `{}`. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @InputImport(name="uriPath")
      private final @Nullable Input<WebAclLoggingConfigurationRedactedFieldUriPathArgs> uriPath;

    public Input<WebAclLoggingConfigurationRedactedFieldUriPathArgs> getUriPath() {
        return this.uriPath == null ? Input.empty() : this.uriPath;
    }

    public WebAclLoggingConfigurationRedactedFieldArgs(
        @Nullable Input<WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsArgs> allQueryArguments,
        @Nullable Input<WebAclLoggingConfigurationRedactedFieldBodyArgs> body,
        @Nullable Input<WebAclLoggingConfigurationRedactedFieldMethodArgs> method,
        @Nullable Input<WebAclLoggingConfigurationRedactedFieldQueryStringArgs> queryString,
        @Nullable Input<WebAclLoggingConfigurationRedactedFieldSingleHeaderArgs> singleHeader,
        @Nullable Input<WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentArgs> singleQueryArgument,
        @Nullable Input<WebAclLoggingConfigurationRedactedFieldUriPathArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclLoggingConfigurationRedactedFieldArgs() {
        this.allQueryArguments = Input.empty();
        this.body = Input.empty();
        this.method = Input.empty();
        this.queryString = Input.empty();
        this.singleHeader = Input.empty();
        this.singleQueryArgument = Input.empty();
        this.uriPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfigurationRedactedFieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsArgs> allQueryArguments;
        private @Nullable Input<WebAclLoggingConfigurationRedactedFieldBodyArgs> body;
        private @Nullable Input<WebAclLoggingConfigurationRedactedFieldMethodArgs> method;
        private @Nullable Input<WebAclLoggingConfigurationRedactedFieldQueryStringArgs> queryString;
        private @Nullable Input<WebAclLoggingConfigurationRedactedFieldSingleHeaderArgs> singleHeader;
        private @Nullable Input<WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentArgs> singleQueryArgument;
        private @Nullable Input<WebAclLoggingConfigurationRedactedFieldUriPathArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfigurationRedactedFieldArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Input<WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder allQueryArguments(@Nullable WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsArgs allQueryArguments) {
            this.allQueryArguments = Input.ofNullable(allQueryArguments);
            return this;
        }

        public Builder body(@Nullable Input<WebAclLoggingConfigurationRedactedFieldBodyArgs> body) {
            this.body = body;
            return this;
        }

        public Builder body(@Nullable WebAclLoggingConfigurationRedactedFieldBodyArgs body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder method(@Nullable Input<WebAclLoggingConfigurationRedactedFieldMethodArgs> method) {
            this.method = method;
            return this;
        }

        public Builder method(@Nullable WebAclLoggingConfigurationRedactedFieldMethodArgs method) {
            this.method = Input.ofNullable(method);
            return this;
        }

        public Builder queryString(@Nullable Input<WebAclLoggingConfigurationRedactedFieldQueryStringArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder queryString(@Nullable WebAclLoggingConfigurationRedactedFieldQueryStringArgs queryString) {
            this.queryString = Input.ofNullable(queryString);
            return this;
        }

        public Builder singleHeader(@Nullable Input<WebAclLoggingConfigurationRedactedFieldSingleHeaderArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder singleHeader(@Nullable WebAclLoggingConfigurationRedactedFieldSingleHeaderArgs singleHeader) {
            this.singleHeader = Input.ofNullable(singleHeader);
            return this;
        }

        public Builder singleQueryArgument(@Nullable Input<WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder singleQueryArgument(@Nullable WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentArgs singleQueryArgument) {
            this.singleQueryArgument = Input.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder uriPath(@Nullable Input<WebAclLoggingConfigurationRedactedFieldUriPathArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder uriPath(@Nullable WebAclLoggingConfigurationRedactedFieldUriPathArgs uriPath) {
            this.uriPath = Input.ofNullable(uriPath);
            return this;
        }
        public WebAclLoggingConfigurationRedactedFieldArgs build() {
            return new WebAclLoggingConfigurationRedactedFieldArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
