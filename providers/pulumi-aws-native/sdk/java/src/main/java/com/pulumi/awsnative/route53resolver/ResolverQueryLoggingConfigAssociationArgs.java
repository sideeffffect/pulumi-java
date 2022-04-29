// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53resolver;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResolverQueryLoggingConfigAssociationArgs extends ResourceArgs {

    public static final ResolverQueryLoggingConfigAssociationArgs Empty = new ResolverQueryLoggingConfigAssociationArgs();

    /**
     * ResolverQueryLogConfigId
     * 
     */
    @Import(name="resolverQueryLogConfigId")
    private @Nullable Output<String> resolverQueryLogConfigId;

    /**
     * @return ResolverQueryLogConfigId
     * 
     */
    public Optional<Output<String>> resolverQueryLogConfigId() {
        return Optional.ofNullable(this.resolverQueryLogConfigId);
    }

    /**
     * ResourceId
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    /**
     * @return ResourceId
     * 
     */
    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    private ResolverQueryLoggingConfigAssociationArgs() {}

    private ResolverQueryLoggingConfigAssociationArgs(ResolverQueryLoggingConfigAssociationArgs $) {
        this.resolverQueryLogConfigId = $.resolverQueryLogConfigId;
        this.resourceId = $.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResolverQueryLoggingConfigAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResolverQueryLoggingConfigAssociationArgs $;

        public Builder() {
            $ = new ResolverQueryLoggingConfigAssociationArgs();
        }

        public Builder(ResolverQueryLoggingConfigAssociationArgs defaults) {
            $ = new ResolverQueryLoggingConfigAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resolverQueryLogConfigId ResolverQueryLogConfigId
         * 
         * @return builder
         * 
         */
        public Builder resolverQueryLogConfigId(@Nullable Output<String> resolverQueryLogConfigId) {
            $.resolverQueryLogConfigId = resolverQueryLogConfigId;
            return this;
        }

        /**
         * @param resolverQueryLogConfigId ResolverQueryLogConfigId
         * 
         * @return builder
         * 
         */
        public Builder resolverQueryLogConfigId(String resolverQueryLogConfigId) {
            return resolverQueryLogConfigId(Output.of(resolverQueryLogConfigId));
        }

        /**
         * @param resourceId ResourceId
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId ResourceId
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public ResolverQueryLoggingConfigAssociationArgs build() {
            return $;
        }
    }

}
