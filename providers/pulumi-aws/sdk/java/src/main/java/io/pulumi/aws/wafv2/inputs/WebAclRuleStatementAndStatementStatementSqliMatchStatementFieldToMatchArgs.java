// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchBodyArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchMethodArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPathArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs Empty = new WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @InputImport(name="allQueryArguments")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    public Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Input.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @InputImport(name="body")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchBodyArgs> body;

    public Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchBodyArgs> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @InputImport(name="method")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchMethodArgs> method;

    public Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchMethodArgs> getMethod() {
        return this.method == null ? Input.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @InputImport(name="queryString")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> queryString;

    public Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> getQueryString() {
        return this.queryString == null ? Input.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @InputImport(name="singleHeader")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;

    public Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> getSingleHeader() {
        return this.singleHeader == null ? Input.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @InputImport(name="singleQueryArgument")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    public Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Input.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @InputImport(name="uriPath")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> uriPath;

    public Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> getUriPath() {
        return this.uriPath == null ? Input.empty() : this.uriPath;
    }

    public WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs(
        @Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments,
        @Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchBodyArgs> body,
        @Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchMethodArgs> method,
        @Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> queryString,
        @Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> singleHeader,
        @Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument,
        @Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs() {
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

    public static Builder builder(WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;
        private @Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchBodyArgs> body;
        private @Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchMethodArgs> method;
        private @Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> queryString;
        private @Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;
        private @Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;
        private @Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder allQueryArguments(@Nullable WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            this.allQueryArguments = Input.ofNullable(allQueryArguments);
            return this;
        }

        public Builder body(@Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchBodyArgs> body) {
            this.body = body;
            return this;
        }

        public Builder body(@Nullable WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchBodyArgs body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder method(@Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchMethodArgs> method) {
            this.method = method;
            return this;
        }

        public Builder method(@Nullable WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchMethodArgs method) {
            this.method = Input.ofNullable(method);
            return this;
        }

        public Builder queryString(@Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder queryString(@Nullable WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs queryString) {
            this.queryString = Input.ofNullable(queryString);
            return this;
        }

        public Builder singleHeader(@Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder singleHeader(@Nullable WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs singleHeader) {
            this.singleHeader = Input.ofNullable(singleHeader);
            return this;
        }

        public Builder singleQueryArgument(@Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder singleQueryArgument(@Nullable WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            this.singleQueryArgument = Input.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder uriPath(@Nullable Input<WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder uriPath(@Nullable WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPathArgs uriPath) {
            this.uriPath = Input.ofNullable(uriPath);
            return this;
        }
        public WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs build() {
            return new WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
