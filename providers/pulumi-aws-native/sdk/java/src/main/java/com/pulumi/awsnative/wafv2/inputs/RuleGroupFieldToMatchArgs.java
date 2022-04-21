// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.inputs.RuleGroupFieldToMatchSingleHeaderPropertiesArgs;
import com.pulumi.awsnative.wafv2.inputs.RuleGroupFieldToMatchSingleQueryArgumentPropertiesArgs;
import com.pulumi.awsnative.wafv2.inputs.RuleGroupJsonBodyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Field of the request to match.
 * 
 */
public final class RuleGroupFieldToMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupFieldToMatchArgs Empty = new RuleGroupFieldToMatchArgs();

    /**
     * All query arguments of a web request.
     * 
     */
    @Import(name="allQueryArguments")
    private @Nullable Output<Object> allQueryArguments;

    public Optional<Output<Object>> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }

    /**
     * The body of a web request. This immediately follows the request headers.
     * 
     */
    @Import(name="body")
    private @Nullable Output<Object> body;

    public Optional<Output<Object>> body() {
        return Optional.ofNullable(this.body);
    }

    @Import(name="jsonBody")
    private @Nullable Output<RuleGroupJsonBodyArgs> jsonBody;

    public Optional<Output<RuleGroupJsonBodyArgs>> jsonBody() {
        return Optional.ofNullable(this.jsonBody);
    }

    /**
     * The HTTP method of a web request. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
    private @Nullable Output<Object> method;

    public Optional<Output<Object>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * The query string of a web request. This is the part of a URL that appears after a ? character, if any.
     * 
     */
    @Import(name="queryString")
    private @Nullable Output<Object> queryString;

    public Optional<Output<Object>> queryString() {
        return Optional.ofNullable(this.queryString);
    }

    @Import(name="singleHeader")
    private @Nullable Output<RuleGroupFieldToMatchSingleHeaderPropertiesArgs> singleHeader;

    public Optional<Output<RuleGroupFieldToMatchSingleHeaderPropertiesArgs>> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }

    /**
     * One query argument in a web request, identified by name, for example UserName or SalesRegion. The name can be up to 30 characters long and isn&#39;t case sensitive.
     * 
     */
    @Import(name="singleQueryArgument")
    private @Nullable Output<RuleGroupFieldToMatchSingleQueryArgumentPropertiesArgs> singleQueryArgument;

    public Optional<Output<RuleGroupFieldToMatchSingleQueryArgumentPropertiesArgs>> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }

    /**
     * The path component of the URI of a web request. This is the part of a web request that identifies a resource, for example, /images/daily-ad.jpg.
     * 
     */
    @Import(name="uriPath")
    private @Nullable Output<Object> uriPath;

    public Optional<Output<Object>> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    private RuleGroupFieldToMatchArgs() {}

    private RuleGroupFieldToMatchArgs(RuleGroupFieldToMatchArgs $) {
        this.allQueryArguments = $.allQueryArguments;
        this.body = $.body;
        this.jsonBody = $.jsonBody;
        this.method = $.method;
        this.queryString = $.queryString;
        this.singleHeader = $.singleHeader;
        this.singleQueryArgument = $.singleQueryArgument;
        this.uriPath = $.uriPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupFieldToMatchArgs $;

        public Builder() {
            $ = new RuleGroupFieldToMatchArgs();
        }

        public Builder(RuleGroupFieldToMatchArgs defaults) {
            $ = new RuleGroupFieldToMatchArgs(Objects.requireNonNull(defaults));
        }

        public Builder allQueryArguments(@Nullable Output<Object> allQueryArguments) {
            $.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder allQueryArguments(Object allQueryArguments) {
            return allQueryArguments(Output.of(allQueryArguments));
        }

        public Builder body(@Nullable Output<Object> body) {
            $.body = body;
            return this;
        }

        public Builder body(Object body) {
            return body(Output.of(body));
        }

        public Builder jsonBody(@Nullable Output<RuleGroupJsonBodyArgs> jsonBody) {
            $.jsonBody = jsonBody;
            return this;
        }

        public Builder jsonBody(RuleGroupJsonBodyArgs jsonBody) {
            return jsonBody(Output.of(jsonBody));
        }

        public Builder method(@Nullable Output<Object> method) {
            $.method = method;
            return this;
        }

        public Builder method(Object method) {
            return method(Output.of(method));
        }

        public Builder queryString(@Nullable Output<Object> queryString) {
            $.queryString = queryString;
            return this;
        }

        public Builder queryString(Object queryString) {
            return queryString(Output.of(queryString));
        }

        public Builder singleHeader(@Nullable Output<RuleGroupFieldToMatchSingleHeaderPropertiesArgs> singleHeader) {
            $.singleHeader = singleHeader;
            return this;
        }

        public Builder singleHeader(RuleGroupFieldToMatchSingleHeaderPropertiesArgs singleHeader) {
            return singleHeader(Output.of(singleHeader));
        }

        public Builder singleQueryArgument(@Nullable Output<RuleGroupFieldToMatchSingleQueryArgumentPropertiesArgs> singleQueryArgument) {
            $.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder singleQueryArgument(RuleGroupFieldToMatchSingleQueryArgumentPropertiesArgs singleQueryArgument) {
            return singleQueryArgument(Output.of(singleQueryArgument));
        }

        public Builder uriPath(@Nullable Output<Object> uriPath) {
            $.uriPath = uriPath;
            return this;
        }

        public Builder uriPath(Object uriPath) {
            return uriPath(Output.of(uriPath));
        }

        public RuleGroupFieldToMatchArgs build() {
            return $;
        }
    }

}
