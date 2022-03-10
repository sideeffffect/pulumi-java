// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.outputs.RuleGroupFieldToMatchSingleHeaderProperties;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupFieldToMatchSingleQueryArgumentProperties;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupJsonBody;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupFieldToMatch {
    /**
     * All query arguments of a web request.
     * 
     */
    private final @Nullable Object allQueryArguments;
    /**
     * The body of a web request. This immediately follows the request headers.
     * 
     */
    private final @Nullable Object body;
    private final @Nullable RuleGroupJsonBody jsonBody;
    /**
     * The HTTP method of a web request. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private final @Nullable Object method;
    /**
     * The query string of a web request. This is the part of a URL that appears after a ? character, if any.
     * 
     */
    private final @Nullable Object queryString;
    private final @Nullable RuleGroupFieldToMatchSingleHeaderProperties singleHeader;
    /**
     * One query argument in a web request, identified by name, for example UserName or SalesRegion. The name can be up to 30 characters long and isn't case sensitive.
     * 
     */
    private final @Nullable RuleGroupFieldToMatchSingleQueryArgumentProperties singleQueryArgument;
    /**
     * The path component of the URI of a web request. This is the part of a web request that identifies a resource, for example, /images/daily-ad.jpg.
     * 
     */
    private final @Nullable Object uriPath;

    @OutputCustomType.Constructor
    private RuleGroupFieldToMatch(
        @OutputCustomType.Parameter("allQueryArguments") @Nullable Object allQueryArguments,
        @OutputCustomType.Parameter("body") @Nullable Object body,
        @OutputCustomType.Parameter("jsonBody") @Nullable RuleGroupJsonBody jsonBody,
        @OutputCustomType.Parameter("method") @Nullable Object method,
        @OutputCustomType.Parameter("queryString") @Nullable Object queryString,
        @OutputCustomType.Parameter("singleHeader") @Nullable RuleGroupFieldToMatchSingleHeaderProperties singleHeader,
        @OutputCustomType.Parameter("singleQueryArgument") @Nullable RuleGroupFieldToMatchSingleQueryArgumentProperties singleQueryArgument,
        @OutputCustomType.Parameter("uriPath") @Nullable Object uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.jsonBody = jsonBody;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    /**
     * All query arguments of a web request.
     * 
    */
    public Optional<Object> getAllQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * The body of a web request. This immediately follows the request headers.
     * 
    */
    public Optional<Object> getBody() {
        return Optional.ofNullable(this.body);
    }
    public Optional<RuleGroupJsonBody> getJsonBody() {
        return Optional.ofNullable(this.jsonBody);
    }
    /**
     * The HTTP method of a web request. The method indicates the type of operation that the request is asking the origin to perform.
     * 
    */
    public Optional<Object> getMethod() {
        return Optional.ofNullable(this.method);
    }
    /**
     * The query string of a web request. This is the part of a URL that appears after a ? character, if any.
     * 
    */
    public Optional<Object> getQueryString() {
        return Optional.ofNullable(this.queryString);
    }
    public Optional<RuleGroupFieldToMatchSingleHeaderProperties> getSingleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * One query argument in a web request, identified by name, for example UserName or SalesRegion. The name can be up to 30 characters long and isn't case sensitive.
     * 
    */
    public Optional<RuleGroupFieldToMatchSingleQueryArgumentProperties> getSingleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * The path component of the URI of a web request. This is the part of a web request that identifies a resource, for example, /images/daily-ad.jpg.
     * 
    */
    public Optional<Object> getUriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object allQueryArguments;
        private @Nullable Object body;
        private @Nullable RuleGroupJsonBody jsonBody;
        private @Nullable Object method;
        private @Nullable Object queryString;
        private @Nullable RuleGroupFieldToMatchSingleHeaderProperties singleHeader;
        private @Nullable RuleGroupFieldToMatchSingleQueryArgumentProperties singleQueryArgument;
        private @Nullable Object uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.jsonBody = defaults.jsonBody;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Object allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder body(@Nullable Object body) {
            this.body = body;
            return this;
        }

        public Builder jsonBody(@Nullable RuleGroupJsonBody jsonBody) {
            this.jsonBody = jsonBody;
            return this;
        }

        public Builder method(@Nullable Object method) {
            this.method = method;
            return this;
        }

        public Builder queryString(@Nullable Object queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder singleHeader(@Nullable RuleGroupFieldToMatchSingleHeaderProperties singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder singleQueryArgument(@Nullable RuleGroupFieldToMatchSingleQueryArgumentProperties singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder uriPath(@Nullable Object uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public RuleGroupFieldToMatch build() {
            return new RuleGroupFieldToMatch(allQueryArguments, body, jsonBody, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
