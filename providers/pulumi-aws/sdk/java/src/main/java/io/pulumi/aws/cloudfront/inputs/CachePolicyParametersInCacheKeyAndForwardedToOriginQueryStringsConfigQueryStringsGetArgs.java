// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsGetArgs Empty = new CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsGetArgs();

    /**
     * A list of item names (cookies, headers, or query strings).
     * 
     */
    @Import(name="items")
      private final @Nullable Output<List<String>> items;

    public Output<List<String>> items() {
        return this.items == null ? Codegen.empty() : this.items;
    }

    public CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsGetArgs(@Nullable Output<List<String>> items) {
        this.items = items;
    }

    private CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsGetArgs() {
        this.items = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> items;

        public Builder() {
    	      // Empty
        }

        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(@Nullable Output<List<String>> items) {
            this.items = items;
            return this;
        }
        public Builder items(@Nullable List<String> items) {
            this.items = Codegen.ofNullable(items);
            return this;
        }
        public Builder items(String... items) {
            return items(List.of(items));
        }        public CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsGetArgs build() {
            return new CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsGetArgs(items);
        }
    }
}
