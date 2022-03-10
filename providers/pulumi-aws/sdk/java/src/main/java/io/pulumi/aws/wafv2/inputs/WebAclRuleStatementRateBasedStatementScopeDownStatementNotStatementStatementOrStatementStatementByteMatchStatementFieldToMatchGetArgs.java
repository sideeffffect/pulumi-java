// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchBodyGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchMethodGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchGetArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchGetArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @InputImport(name="allQueryArguments")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Input.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @InputImport(name="body")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchBodyGetArgs> body;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchBodyGetArgs> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @InputImport(name="method")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchMethodGetArgs> method;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchMethodGetArgs> getMethod() {
        return this.method == null ? Input.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @InputImport(name="queryString")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs> queryString;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs> getQueryString() {
        return this.queryString == null ? Input.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @InputImport(name="singleHeader")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> getSingleHeader() {
        return this.singleHeader == null ? Input.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @InputImport(name="singleQueryArgument")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Input.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @InputImport(name="uriPath")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs> uriPath;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs> getUriPath() {
        return this.uriPath == null ? Input.empty() : this.uriPath;
    }

    public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchGetArgs(
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchBodyGetArgs> body,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchMethodGetArgs> method,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs> queryString,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchGetArgs() {
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

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchBodyGetArgs> body;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchMethodGetArgs> method;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs> queryString;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder allQueryArguments(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs allQueryArguments) {
            this.allQueryArguments = Input.ofNullable(allQueryArguments);
            return this;
        }

        public Builder body(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchBodyGetArgs> body) {
            this.body = body;
            return this;
        }

        public Builder body(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchBodyGetArgs body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder method(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchMethodGetArgs> method) {
            this.method = method;
            return this;
        }

        public Builder method(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchMethodGetArgs method) {
            this.method = Input.ofNullable(method);
            return this;
        }

        public Builder queryString(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder queryString(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs queryString) {
            this.queryString = Input.ofNullable(queryString);
            return this;
        }

        public Builder singleHeader(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder singleHeader(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs singleHeader) {
            this.singleHeader = Input.ofNullable(singleHeader);
            return this;
        }

        public Builder singleQueryArgument(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder singleQueryArgument(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs singleQueryArgument) {
            this.singleQueryArgument = Input.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder uriPath(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder uriPath(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs uriPath) {
            this.uriPath = Input.ofNullable(uriPath);
            return this;
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchGetArgs build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchGetArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
