// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class PullThroughCacheRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final PullThroughCacheRuleArgs Empty = new PullThroughCacheRuleArgs();

    /**
     * The repository name prefix to use when caching images from the source registry.
     * 
     */
    @InputImport(name="ecrRepositoryPrefix", required=true)
      private final Input<String> ecrRepositoryPrefix;

    public Input<String> getEcrRepositoryPrefix() {
        return this.ecrRepositoryPrefix;
    }

    /**
     * The registry URL of the upstream public registry to use as the source.
     * 
     */
    @InputImport(name="upstreamRegistryUrl", required=true)
      private final Input<String> upstreamRegistryUrl;

    public Input<String> getUpstreamRegistryUrl() {
        return this.upstreamRegistryUrl;
    }

    public PullThroughCacheRuleArgs(
        Input<String> ecrRepositoryPrefix,
        Input<String> upstreamRegistryUrl) {
        this.ecrRepositoryPrefix = Objects.requireNonNull(ecrRepositoryPrefix, "expected parameter 'ecrRepositoryPrefix' to be non-null");
        this.upstreamRegistryUrl = Objects.requireNonNull(upstreamRegistryUrl, "expected parameter 'upstreamRegistryUrl' to be non-null");
    }

    private PullThroughCacheRuleArgs() {
        this.ecrRepositoryPrefix = Input.empty();
        this.upstreamRegistryUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PullThroughCacheRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> ecrRepositoryPrefix;
        private Input<String> upstreamRegistryUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(PullThroughCacheRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ecrRepositoryPrefix = defaults.ecrRepositoryPrefix;
    	      this.upstreamRegistryUrl = defaults.upstreamRegistryUrl;
        }

        public Builder ecrRepositoryPrefix(Input<String> ecrRepositoryPrefix) {
            this.ecrRepositoryPrefix = Objects.requireNonNull(ecrRepositoryPrefix);
            return this;
        }

        public Builder ecrRepositoryPrefix(String ecrRepositoryPrefix) {
            this.ecrRepositoryPrefix = Input.of(Objects.requireNonNull(ecrRepositoryPrefix));
            return this;
        }

        public Builder upstreamRegistryUrl(Input<String> upstreamRegistryUrl) {
            this.upstreamRegistryUrl = Objects.requireNonNull(upstreamRegistryUrl);
            return this;
        }

        public Builder upstreamRegistryUrl(String upstreamRegistryUrl) {
            this.upstreamRegistryUrl = Input.of(Objects.requireNonNull(upstreamRegistryUrl));
            return this;
        }
        public PullThroughCacheRuleArgs build() {
            return new PullThroughCacheRuleArgs(ecrRepositoryPrefix, upstreamRegistryUrl);
        }
    }
}
