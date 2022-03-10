// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBodyArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethodArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPathArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs Empty = new RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @InputImport(name="allQueryArguments")
      private final @Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    public Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Input.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @InputImport(name="body")
      private final @Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBodyArgs> body;

    public Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBodyArgs> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @InputImport(name="method")
      private final @Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethodArgs> method;

    public Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethodArgs> getMethod() {
        return this.method == null ? Input.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @InputImport(name="queryString")
      private final @Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> queryString;

    public Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> getQueryString() {
        return this.queryString == null ? Input.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @InputImport(name="singleHeader")
      private final @Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;

    public Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> getSingleHeader() {
        return this.singleHeader == null ? Input.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @InputImport(name="singleQueryArgument")
      private final @Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    public Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Input.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @InputImport(name="uriPath")
      private final @Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> uriPath;

    public Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> getUriPath() {
        return this.uriPath == null ? Input.empty() : this.uriPath;
    }

    public RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs(
        @Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments,
        @Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBodyArgs> body,
        @Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethodArgs> method,
        @Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> queryString,
        @Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> singleHeader,
        @Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument,
        @Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs() {
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

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;
        private @Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBodyArgs> body;
        private @Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethodArgs> method;
        private @Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> queryString;
        private @Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;
        private @Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;
        private @Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder allQueryArguments(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            this.allQueryArguments = Input.ofNullable(allQueryArguments);
            return this;
        }

        public Builder body(@Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBodyArgs> body) {
            this.body = body;
            return this;
        }

        public Builder body(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBodyArgs body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder method(@Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethodArgs> method) {
            this.method = method;
            return this;
        }

        public Builder method(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethodArgs method) {
            this.method = Input.ofNullable(method);
            return this;
        }

        public Builder queryString(@Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder queryString(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs queryString) {
            this.queryString = Input.ofNullable(queryString);
            return this;
        }

        public Builder singleHeader(@Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder singleHeader(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs singleHeader) {
            this.singleHeader = Input.ofNullable(singleHeader);
            return this;
        }

        public Builder singleQueryArgument(@Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder singleQueryArgument(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            this.singleQueryArgument = Input.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder uriPath(@Nullable Input<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder uriPath(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPathArgs uriPath) {
            this.uriPath = Input.ofNullable(uriPath);
            return this;
        }
        public RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs build() {
            return new RuleGroupRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
