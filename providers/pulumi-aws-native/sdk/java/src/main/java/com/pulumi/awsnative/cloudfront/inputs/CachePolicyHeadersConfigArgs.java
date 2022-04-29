// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CachePolicyHeadersConfigArgs extends ResourceArgs {

    public static final CachePolicyHeadersConfigArgs Empty = new CachePolicyHeadersConfigArgs();

    @Import(name="headerBehavior", required=true)
    private Output<String> headerBehavior;

    public Output<String> headerBehavior() {
        return this.headerBehavior;
    }

    @Import(name="headers")
    private @Nullable Output<List<String>> headers;

    public Optional<Output<List<String>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    private CachePolicyHeadersConfigArgs() {}

    private CachePolicyHeadersConfigArgs(CachePolicyHeadersConfigArgs $) {
        this.headerBehavior = $.headerBehavior;
        this.headers = $.headers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CachePolicyHeadersConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CachePolicyHeadersConfigArgs $;

        public Builder() {
            $ = new CachePolicyHeadersConfigArgs();
        }

        public Builder(CachePolicyHeadersConfigArgs defaults) {
            $ = new CachePolicyHeadersConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder headerBehavior(Output<String> headerBehavior) {
            $.headerBehavior = headerBehavior;
            return this;
        }

        public Builder headerBehavior(String headerBehavior) {
            return headerBehavior(Output.of(headerBehavior));
        }

        public Builder headers(@Nullable Output<List<String>> headers) {
            $.headers = headers;
            return this;
        }

        public Builder headers(List<String> headers) {
            return headers(Output.of(headers));
        }

        public Builder headers(String... headers) {
            return headers(List.of(headers));
        }

        public CachePolicyHeadersConfigArgs build() {
            $.headerBehavior = Objects.requireNonNull($.headerBehavior, "expected parameter 'headerBehavior' to be non-null");
            return $;
        }
    }

}
