// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchBodyGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchMethodGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchQueryStringGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchUriPathGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchGetArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchGetArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs>> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchBodyGetArgs> body;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchBodyGetArgs>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchMethodGetArgs> method;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchMethodGetArgs>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchQueryStringGetArgs> queryString;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchQueryStringGetArgs>> queryString() {
        return Optional.ofNullable(this.queryString);
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs>> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs>> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchUriPathGetArgs> uriPath;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchUriPathGetArgs>> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchGetArgs() {}

    private WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchGetArgs(WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchGetArgs $) {
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
    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchGetArgs $;

        public Builder() {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchGetArgs();
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchGetArgs defaults) {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder allQueryArguments(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments) {
            $.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder allQueryArguments(WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs allQueryArguments) {
            return allQueryArguments(Output.of(allQueryArguments));
        }

        public Builder body(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchBodyGetArgs> body) {
            $.body = body;
            return this;
        }

        public Builder body(WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchBodyGetArgs body) {
            return body(Output.of(body));
        }

        public Builder method(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchMethodGetArgs> method) {
            $.method = method;
            return this;
        }

        public Builder method(WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchMethodGetArgs method) {
            return method(Output.of(method));
        }

        public Builder queryString(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchQueryStringGetArgs> queryString) {
            $.queryString = queryString;
            return this;
        }

        public Builder queryString(WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchQueryStringGetArgs queryString) {
            return queryString(Output.of(queryString));
        }

        public Builder singleHeader(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader) {
            $.singleHeader = singleHeader;
            return this;
        }

        public Builder singleHeader(WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs singleHeader) {
            return singleHeader(Output.of(singleHeader));
        }

        public Builder singleQueryArgument(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument) {
            $.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder singleQueryArgument(WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs singleQueryArgument) {
            return singleQueryArgument(Output.of(singleQueryArgument));
        }

        public Builder uriPath(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchUriPathGetArgs> uriPath) {
            $.uriPath = uriPath;
            return this;
        }

        public Builder uriPath(WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchUriPathGetArgs uriPath) {
            return uriPath(Output.of(uriPath));
        }

        public WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchGetArgs build() {
            return $;
        }
    }

}
