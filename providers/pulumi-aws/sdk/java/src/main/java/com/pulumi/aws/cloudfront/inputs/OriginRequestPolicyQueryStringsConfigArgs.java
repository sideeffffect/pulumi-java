// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyQueryStringsConfigQueryStringsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OriginRequestPolicyQueryStringsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final OriginRequestPolicyQueryStringsConfigArgs Empty = new OriginRequestPolicyQueryStringsConfigArgs();

    @Import(name="queryStringBehavior", required=true)
    private Output<String> queryStringBehavior;

    public Output<String> queryStringBehavior() {
        return this.queryStringBehavior;
    }

    @Import(name="queryStrings")
    private @Nullable Output<OriginRequestPolicyQueryStringsConfigQueryStringsArgs> queryStrings;

    public Optional<Output<OriginRequestPolicyQueryStringsConfigQueryStringsArgs>> queryStrings() {
        return Optional.ofNullable(this.queryStrings);
    }

    private OriginRequestPolicyQueryStringsConfigArgs() {}

    private OriginRequestPolicyQueryStringsConfigArgs(OriginRequestPolicyQueryStringsConfigArgs $) {
        this.queryStringBehavior = $.queryStringBehavior;
        this.queryStrings = $.queryStrings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OriginRequestPolicyQueryStringsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OriginRequestPolicyQueryStringsConfigArgs $;

        public Builder() {
            $ = new OriginRequestPolicyQueryStringsConfigArgs();
        }

        public Builder(OriginRequestPolicyQueryStringsConfigArgs defaults) {
            $ = new OriginRequestPolicyQueryStringsConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder queryStringBehavior(Output<String> queryStringBehavior) {
            $.queryStringBehavior = queryStringBehavior;
            return this;
        }

        public Builder queryStringBehavior(String queryStringBehavior) {
            return queryStringBehavior(Output.of(queryStringBehavior));
        }

        public Builder queryStrings(@Nullable Output<OriginRequestPolicyQueryStringsConfigQueryStringsArgs> queryStrings) {
            $.queryStrings = queryStrings;
            return this;
        }

        public Builder queryStrings(OriginRequestPolicyQueryStringsConfigQueryStringsArgs queryStrings) {
            return queryStrings(Output.of(queryStrings));
        }

        public OriginRequestPolicyQueryStringsConfigArgs build() {
            $.queryStringBehavior = Objects.requireNonNull($.queryStringBehavior, "expected parameter 'queryStringBehavior' to be non-null");
            return $;
        }
    }

}
