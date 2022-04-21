// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldBodyGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldMethodGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldQueryStringGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldSingleHeaderGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldUriPathGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclLoggingConfigurationRedactedFieldGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclLoggingConfigurationRedactedFieldGetArgs Empty = new WebAclLoggingConfigurationRedactedFieldGetArgs();

    /**
     * Redact all query arguments.
     * 
     * @deprecated
     * Not supported by WAFv2 API
     * 
     */
    @Deprecated /* Not supported by WAFv2 API */
    @Import(name="allQueryArguments")
    private @Nullable Output<WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs> allQueryArguments;

    @Deprecated /* Not supported by WAFv2 API */
    public Optional<Output<WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs>> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }

    /**
     * Redact the request body, which immediately follows the request headers.
     * 
     * @deprecated
     * Not supported by WAFv2 API
     * 
     */
    @Deprecated /* Not supported by WAFv2 API */
    @Import(name="body")
    private @Nullable Output<WebAclLoggingConfigurationRedactedFieldBodyGetArgs> body;

    @Deprecated /* Not supported by WAFv2 API */
    public Optional<Output<WebAclLoggingConfigurationRedactedFieldBodyGetArgs>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * Redact the HTTP method. Must be specified as an empty configuration block `{}`. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
    private @Nullable Output<WebAclLoggingConfigurationRedactedFieldMethodGetArgs> method;

    public Optional<Output<WebAclLoggingConfigurationRedactedFieldMethodGetArgs>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * Redact the query string. Must be specified as an empty configuration block `{}`. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
    private @Nullable Output<WebAclLoggingConfigurationRedactedFieldQueryStringGetArgs> queryString;

    public Optional<Output<WebAclLoggingConfigurationRedactedFieldQueryStringGetArgs>> queryString() {
        return Optional.ofNullable(this.queryString);
    }

    /**
     * Redact a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
    private @Nullable Output<WebAclLoggingConfigurationRedactedFieldSingleHeaderGetArgs> singleHeader;

    public Optional<Output<WebAclLoggingConfigurationRedactedFieldSingleHeaderGetArgs>> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }

    /**
     * Redact a single query argument. See Single Query Argument below for details.
     * 
     * @deprecated
     * Not supported by WAFv2 API
     * 
     */
    @Deprecated /* Not supported by WAFv2 API */
    @Import(name="singleQueryArgument")
    private @Nullable Output<WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentGetArgs> singleQueryArgument;

    @Deprecated /* Not supported by WAFv2 API */
    public Optional<Output<WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentGetArgs>> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }

    /**
     * Redact the request URI path. Must be specified as an empty configuration block `{}`. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
    private @Nullable Output<WebAclLoggingConfigurationRedactedFieldUriPathGetArgs> uriPath;

    public Optional<Output<WebAclLoggingConfigurationRedactedFieldUriPathGetArgs>> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    private WebAclLoggingConfigurationRedactedFieldGetArgs() {}

    private WebAclLoggingConfigurationRedactedFieldGetArgs(WebAclLoggingConfigurationRedactedFieldGetArgs $) {
        this.allQueryArguments = $.allQueryArguments;
        this.body = $.body;
        this.method = $.method;
        this.queryString = $.queryString;
        this.singleHeader = $.singleHeader;
        this.singleQueryArgument = $.singleQueryArgument;
        this.uriPath = $.uriPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclLoggingConfigurationRedactedFieldGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclLoggingConfigurationRedactedFieldGetArgs $;

        public Builder() {
            $ = new WebAclLoggingConfigurationRedactedFieldGetArgs();
        }

        public Builder(WebAclLoggingConfigurationRedactedFieldGetArgs defaults) {
            $ = new WebAclLoggingConfigurationRedactedFieldGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder allQueryArguments(@Nullable Output<WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs> allQueryArguments) {
            $.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder allQueryArguments(WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs allQueryArguments) {
            return allQueryArguments(Output.of(allQueryArguments));
        }

        public Builder body(@Nullable Output<WebAclLoggingConfigurationRedactedFieldBodyGetArgs> body) {
            $.body = body;
            return this;
        }

        public Builder body(WebAclLoggingConfigurationRedactedFieldBodyGetArgs body) {
            return body(Output.of(body));
        }

        public Builder method(@Nullable Output<WebAclLoggingConfigurationRedactedFieldMethodGetArgs> method) {
            $.method = method;
            return this;
        }

        public Builder method(WebAclLoggingConfigurationRedactedFieldMethodGetArgs method) {
            return method(Output.of(method));
        }

        public Builder queryString(@Nullable Output<WebAclLoggingConfigurationRedactedFieldQueryStringGetArgs> queryString) {
            $.queryString = queryString;
            return this;
        }

        public Builder queryString(WebAclLoggingConfigurationRedactedFieldQueryStringGetArgs queryString) {
            return queryString(Output.of(queryString));
        }

        public Builder singleHeader(@Nullable Output<WebAclLoggingConfigurationRedactedFieldSingleHeaderGetArgs> singleHeader) {
            $.singleHeader = singleHeader;
            return this;
        }

        public Builder singleHeader(WebAclLoggingConfigurationRedactedFieldSingleHeaderGetArgs singleHeader) {
            return singleHeader(Output.of(singleHeader));
        }

        public Builder singleQueryArgument(@Nullable Output<WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentGetArgs> singleQueryArgument) {
            $.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder singleQueryArgument(WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentGetArgs singleQueryArgument) {
            return singleQueryArgument(Output.of(singleQueryArgument));
        }

        public Builder uriPath(@Nullable Output<WebAclLoggingConfigurationRedactedFieldUriPathGetArgs> uriPath) {
            $.uriPath = uriPath;
            return this;
        }

        public Builder uriPath(WebAclLoggingConfigurationRedactedFieldUriPathGetArgs uriPath) {
            return uriPath(Output.of(uriPath));
        }

        public WebAclLoggingConfigurationRedactedFieldGetArgs build() {
            return $;
        }
    }

}
