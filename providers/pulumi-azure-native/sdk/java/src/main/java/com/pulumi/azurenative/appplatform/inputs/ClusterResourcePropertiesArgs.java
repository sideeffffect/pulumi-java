// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.azurenative.appplatform.inputs.NetworkProfileArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Service properties payload
 * 
 */
public final class ClusterResourcePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterResourcePropertiesArgs Empty = new ClusterResourcePropertiesArgs();

    /**
     * Network profile of the Service
     * 
     */
    @Import(name="networkProfile")
    private @Nullable Output<NetworkProfileArgs> networkProfile;

    /**
     * @return Network profile of the Service
     * 
     */
    public Optional<Output<NetworkProfileArgs>> networkProfile() {
        return Optional.ofNullable(this.networkProfile);
    }

    private ClusterResourcePropertiesArgs() {}

    private ClusterResourcePropertiesArgs(ClusterResourcePropertiesArgs $) {
        this.networkProfile = $.networkProfile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterResourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterResourcePropertiesArgs $;

        public Builder() {
            $ = new ClusterResourcePropertiesArgs();
        }

        public Builder(ClusterResourcePropertiesArgs defaults) {
            $ = new ClusterResourcePropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkProfile Network profile of the Service
         * 
         * @return builder
         * 
         */
        public Builder networkProfile(@Nullable Output<NetworkProfileArgs> networkProfile) {
            $.networkProfile = networkProfile;
            return this;
        }

        /**
         * @param networkProfile Network profile of the Service
         * 
         * @return builder
         * 
         */
        public Builder networkProfile(NetworkProfileArgs networkProfile) {
            return networkProfile(Output.of(networkProfile));
        }

        public ClusterResourcePropertiesArgs build() {
            return $;
        }
    }

}
