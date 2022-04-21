// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBodyArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethodArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs Empty = new WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
    private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    public Optional<Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs>> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
    private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBodyArgs> body;

    public Optional<Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBodyArgs>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
    private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethodArgs> method;

    public Optional<Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethodArgs>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
    private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> queryString;

    public Optional<Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs>> queryString() {
        return Optional.ofNullable(this.queryString);
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
    private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;

    public Optional<Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs>> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
    private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    public Optional<Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs>> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
    private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> uriPath;

    public Optional<Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathArgs>> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    private WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs() {}

    private WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs(WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs $) {
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
    public static Builder builder(WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs $;

        public Builder() {
            $ = new WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs();
        }

        public Builder(WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs defaults) {
            $ = new WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs(Objects.requireNonNull(defaults));
        }

        public Builder allQueryArguments(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            $.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder allQueryArguments(WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            return allQueryArguments(Output.of(allQueryArguments));
        }

        public Builder body(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBodyArgs> body) {
            $.body = body;
            return this;
        }

        public Builder body(WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBodyArgs body) {
            return body(Output.of(body));
        }

        public Builder method(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethodArgs> method) {
            $.method = method;
            return this;
        }

        public Builder method(WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethodArgs method) {
            return method(Output.of(method));
        }

        public Builder queryString(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> queryString) {
            $.queryString = queryString;
            return this;
        }

        public Builder queryString(WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs queryString) {
            return queryString(Output.of(queryString));
        }

        public Builder singleHeader(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            $.singleHeader = singleHeader;
            return this;
        }

        public Builder singleHeader(WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs singleHeader) {
            return singleHeader(Output.of(singleHeader));
        }

        public Builder singleQueryArgument(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            $.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder singleQueryArgument(WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            return singleQueryArgument(Output.of(singleQueryArgument));
        }

        public Builder uriPath(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> uriPath) {
            $.uriPath = uriPath;
            return this;
        }

        public Builder uriPath(WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathArgs uriPath) {
            return uriPath(Output.of(uriPath));
        }

        public WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs build() {
            return $;
        }
    }

}
