// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBody;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethod;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryString;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPath;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch {
    /**
     * Inspect all query arguments.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBody body;
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethod method;
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString;
    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader;
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath;

    @OutputCustomType.Constructor
    private RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch(
        @OutputCustomType.Parameter("allQueryArguments") @Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments,
        @OutputCustomType.Parameter("body") @Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBody body,
        @OutputCustomType.Parameter("method") @Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethod method,
        @OutputCustomType.Parameter("queryString") @Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString,
        @OutputCustomType.Parameter("singleHeader") @Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader,
        @OutputCustomType.Parameter("singleQueryArgument") @Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument,
        @OutputCustomType.Parameter("uriPath") @Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    /**
     * Inspect all query arguments.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments> getAllQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBody> getBody() {
        return Optional.ofNullable(this.body);
    }
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethod> getMethod() {
        return Optional.ofNullable(this.method);
    }
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryString> getQueryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * Inspect a single header. See Single Header below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader> getSingleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument> getSingleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
    */
    public Optional<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPath> getUriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBody body;
        private @Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethod method;
        private @Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString;
        private @Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder body(@Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }

        public Builder method(@Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }

        public Builder queryString(@Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder singleHeader(@Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder singleQueryArgument(@Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder uriPath(@Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch build() {
            return new RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
