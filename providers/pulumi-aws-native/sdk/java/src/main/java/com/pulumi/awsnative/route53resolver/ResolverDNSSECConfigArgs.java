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


public final class ResolverDNSSECConfigArgs extends ResourceArgs {

    public static final ResolverDNSSECConfigArgs Empty = new ResolverDNSSECConfigArgs();

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

    private ResolverDNSSECConfigArgs() {}

    private ResolverDNSSECConfigArgs(ResolverDNSSECConfigArgs $) {
        this.resourceId = $.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResolverDNSSECConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResolverDNSSECConfigArgs $;

        public Builder() {
            $ = new ResolverDNSSECConfigArgs();
        }

        public Builder(ResolverDNSSECConfigArgs defaults) {
            $ = new ResolverDNSSECConfigArgs(Objects.requireNonNull(defaults));
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

        public ResolverDNSSECConfigArgs build() {
            return $;
        }
    }

}
