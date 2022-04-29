// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage;

import com.pulumi.awsnative.mediapackage.inputs.PackagingGroupAuthorizationArgs;
import com.pulumi.awsnative.mediapackage.inputs.PackagingGroupLogConfigurationArgs;
import com.pulumi.awsnative.mediapackage.inputs.PackagingGroupTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PackagingGroupArgs extends ResourceArgs {

    public static final PackagingGroupArgs Empty = new PackagingGroupArgs();

    /**
     * CDN Authorization
     * 
     */
    @Import(name="authorization")
    private @Nullable Output<PackagingGroupAuthorizationArgs> authorization;

    /**
     * @return CDN Authorization
     * 
     */
    public Optional<Output<PackagingGroupAuthorizationArgs>> authorization() {
        return Optional.ofNullable(this.authorization);
    }

    /**
     * The configuration parameters for egress access logging.
     * 
     */
    @Import(name="egressAccessLogs")
    private @Nullable Output<PackagingGroupLogConfigurationArgs> egressAccessLogs;

    /**
     * @return The configuration parameters for egress access logging.
     * 
     */
    public Optional<Output<PackagingGroupLogConfigurationArgs>> egressAccessLogs() {
        return Optional.ofNullable(this.egressAccessLogs);
    }

    /**
     * A collection of tags associated with a resource
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<PackagingGroupTagArgs>> tags;

    /**
     * @return A collection of tags associated with a resource
     * 
     */
    public Optional<Output<List<PackagingGroupTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private PackagingGroupArgs() {}

    private PackagingGroupArgs(PackagingGroupArgs $) {
        this.authorization = $.authorization;
        this.egressAccessLogs = $.egressAccessLogs;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PackagingGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PackagingGroupArgs $;

        public Builder() {
            $ = new PackagingGroupArgs();
        }

        public Builder(PackagingGroupArgs defaults) {
            $ = new PackagingGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorization CDN Authorization
         * 
         * @return builder
         * 
         */
        public Builder authorization(@Nullable Output<PackagingGroupAuthorizationArgs> authorization) {
            $.authorization = authorization;
            return this;
        }

        /**
         * @param authorization CDN Authorization
         * 
         * @return builder
         * 
         */
        public Builder authorization(PackagingGroupAuthorizationArgs authorization) {
            return authorization(Output.of(authorization));
        }

        /**
         * @param egressAccessLogs The configuration parameters for egress access logging.
         * 
         * @return builder
         * 
         */
        public Builder egressAccessLogs(@Nullable Output<PackagingGroupLogConfigurationArgs> egressAccessLogs) {
            $.egressAccessLogs = egressAccessLogs;
            return this;
        }

        /**
         * @param egressAccessLogs The configuration parameters for egress access logging.
         * 
         * @return builder
         * 
         */
        public Builder egressAccessLogs(PackagingGroupLogConfigurationArgs egressAccessLogs) {
            return egressAccessLogs(Output.of(egressAccessLogs));
        }

        /**
         * @param tags A collection of tags associated with a resource
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<PackagingGroupTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A collection of tags associated with a resource
         * 
         * @return builder
         * 
         */
        public Builder tags(List<PackagingGroupTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A collection of tags associated with a resource
         * 
         * @return builder
         * 
         */
        public Builder tags(PackagingGroupTagArgs... tags) {
            return tags(List.of(tags));
        }

        public PackagingGroupArgs build() {
            return $;
        }
    }

}
