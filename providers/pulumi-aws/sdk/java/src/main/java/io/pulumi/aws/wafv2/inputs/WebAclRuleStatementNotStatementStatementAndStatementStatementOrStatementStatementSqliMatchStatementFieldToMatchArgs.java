// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethodArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPathArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs Empty = new WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @InputImport(name="allQueryArguments")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    public Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Input.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @InputImport(name="body")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs> body;

    public Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @InputImport(name="method")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethodArgs> method;

    public Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethodArgs> getMethod() {
        return this.method == null ? Input.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @InputImport(name="queryString")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> queryString;

    public Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> getQueryString() {
        return this.queryString == null ? Input.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @InputImport(name="singleHeader")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;

    public Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> getSingleHeader() {
        return this.singleHeader == null ? Input.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @InputImport(name="singleQueryArgument")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    public Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Input.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @InputImport(name="uriPath")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> uriPath;

    public Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> getUriPath() {
        return this.uriPath == null ? Input.empty() : this.uriPath;
    }

    public WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs(
        @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments,
        @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs> body,
        @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethodArgs> method,
        @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> queryString,
        @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> singleHeader,
        @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument,
        @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs() {
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

    public static Builder builder(WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs> body;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethodArgs> method;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> queryString;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder allQueryArguments(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            this.allQueryArguments = Input.ofNullable(allQueryArguments);
            return this;
        }

        public Builder body(@Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs> body) {
            this.body = body;
            return this;
        }

        public Builder body(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder method(@Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethodArgs> method) {
            this.method = method;
            return this;
        }

        public Builder method(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethodArgs method) {
            this.method = Input.ofNullable(method);
            return this;
        }

        public Builder queryString(@Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder queryString(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs queryString) {
            this.queryString = Input.ofNullable(queryString);
            return this;
        }

        public Builder singleHeader(@Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder singleHeader(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs singleHeader) {
            this.singleHeader = Input.ofNullable(singleHeader);
            return this;
        }

        public Builder singleQueryArgument(@Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder singleQueryArgument(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            this.singleQueryArgument = Input.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder uriPath(@Nullable Input<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder uriPath(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPathArgs uriPath) {
            this.uriPath = Input.ofNullable(uriPath);
            return this;
        }
        public WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs build() {
            return new WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
