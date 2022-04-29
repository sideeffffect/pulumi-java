// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class URLMapPathMatcherPathRuleRouteActionUrlRewriteArgs extends ResourceArgs {

    public static final URLMapPathMatcherPathRuleRouteActionUrlRewriteArgs Empty = new URLMapPathMatcherPathRuleRouteActionUrlRewriteArgs();

    /**
     * Prior to forwarding the request to the selected service, the request&#39;s host header is replaced
     * with contents of hostRewrite.
     * The value must be between 1 and 255 characters.
     * 
     */
    @Import(name="hostRewrite")
    private @Nullable Output<String> hostRewrite;

    /**
     * @return Prior to forwarding the request to the selected service, the request&#39;s host header is replaced
     * with contents of hostRewrite.
     * The value must be between 1 and 255 characters.
     * 
     */
    public Optional<Output<String>> hostRewrite() {
        return Optional.ofNullable(this.hostRewrite);
    }

    /**
     * Prior to forwarding the request to the selected backend service, the matching portion of the
     * request&#39;s path is replaced by pathPrefixRewrite.
     * The value must be between 1 and 1024 characters.
     * 
     */
    @Import(name="pathPrefixRewrite")
    private @Nullable Output<String> pathPrefixRewrite;

    /**
     * @return Prior to forwarding the request to the selected backend service, the matching portion of the
     * request&#39;s path is replaced by pathPrefixRewrite.
     * The value must be between 1 and 1024 characters.
     * 
     */
    public Optional<Output<String>> pathPrefixRewrite() {
        return Optional.ofNullable(this.pathPrefixRewrite);
    }

    private URLMapPathMatcherPathRuleRouteActionUrlRewriteArgs() {}

    private URLMapPathMatcherPathRuleRouteActionUrlRewriteArgs(URLMapPathMatcherPathRuleRouteActionUrlRewriteArgs $) {
        this.hostRewrite = $.hostRewrite;
        this.pathPrefixRewrite = $.pathPrefixRewrite;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(URLMapPathMatcherPathRuleRouteActionUrlRewriteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private URLMapPathMatcherPathRuleRouteActionUrlRewriteArgs $;

        public Builder() {
            $ = new URLMapPathMatcherPathRuleRouteActionUrlRewriteArgs();
        }

        public Builder(URLMapPathMatcherPathRuleRouteActionUrlRewriteArgs defaults) {
            $ = new URLMapPathMatcherPathRuleRouteActionUrlRewriteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostRewrite Prior to forwarding the request to the selected service, the request&#39;s host header is replaced
         * with contents of hostRewrite.
         * The value must be between 1 and 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder hostRewrite(@Nullable Output<String> hostRewrite) {
            $.hostRewrite = hostRewrite;
            return this;
        }

        /**
         * @param hostRewrite Prior to forwarding the request to the selected service, the request&#39;s host header is replaced
         * with contents of hostRewrite.
         * The value must be between 1 and 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder hostRewrite(String hostRewrite) {
            return hostRewrite(Output.of(hostRewrite));
        }

        /**
         * @param pathPrefixRewrite Prior to forwarding the request to the selected backend service, the matching portion of the
         * request&#39;s path is replaced by pathPrefixRewrite.
         * The value must be between 1 and 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder pathPrefixRewrite(@Nullable Output<String> pathPrefixRewrite) {
            $.pathPrefixRewrite = pathPrefixRewrite;
            return this;
        }

        /**
         * @param pathPrefixRewrite Prior to forwarding the request to the selected backend service, the matching portion of the
         * request&#39;s path is replaced by pathPrefixRewrite.
         * The value must be between 1 and 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder pathPrefixRewrite(String pathPrefixRewrite) {
            return pathPrefixRewrite(Output.of(pathPrefixRewrite));
        }

        public URLMapPathMatcherPathRuleRouteActionUrlRewriteArgs build() {
            return $;
        }
    }

}
