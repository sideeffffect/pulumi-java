// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewrite {
    /**
     * Prior to forwarding the request to the selected service, the request's host
     * header is replaced with contents of hostRewrite. The value must be between 1 and
     * 255 characters.
     * 
     */
    private final @Nullable String hostRewrite;
    /**
     * Prior to forwarding the request to the selected backend service, the matching
     * portion of the request's path is replaced by pathPrefixRewrite. The value must
     * be between 1 and 1024 characters.
     * 
     */
    private final @Nullable String pathPrefixRewrite;

    @OutputCustomType.Constructor
    private RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewrite(
        @OutputCustomType.Parameter("hostRewrite") @Nullable String hostRewrite,
        @OutputCustomType.Parameter("pathPrefixRewrite") @Nullable String pathPrefixRewrite) {
        this.hostRewrite = hostRewrite;
        this.pathPrefixRewrite = pathPrefixRewrite;
    }

    /**
     * Prior to forwarding the request to the selected service, the request's host
     * header is replaced with contents of hostRewrite. The value must be between 1 and
     * 255 characters.
     * 
    */
    public Optional<String> getHostRewrite() {
        return Optional.ofNullable(this.hostRewrite);
    }
    /**
     * Prior to forwarding the request to the selected backend service, the matching
     * portion of the request's path is replaced by pathPrefixRewrite. The value must
     * be between 1 and 1024 characters.
     * 
    */
    public Optional<String> getPathPrefixRewrite() {
        return Optional.ofNullable(this.pathPrefixRewrite);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewrite defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostRewrite;
        private @Nullable String pathPrefixRewrite;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewrite defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostRewrite = defaults.hostRewrite;
    	      this.pathPrefixRewrite = defaults.pathPrefixRewrite;
        }

        public Builder hostRewrite(@Nullable String hostRewrite) {
            this.hostRewrite = hostRewrite;
            return this;
        }

        public Builder pathPrefixRewrite(@Nullable String pathPrefixRewrite) {
            this.pathPrefixRewrite = pathPrefixRewrite;
            return this;
        }
        public RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewrite build() {
            return new RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewrite(hostRewrite, pathPrefixRewrite);
        }
    }
}
