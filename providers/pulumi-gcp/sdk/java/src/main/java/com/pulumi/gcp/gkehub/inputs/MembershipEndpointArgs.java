// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.gkehub.inputs.MembershipEndpointGkeClusterArgs;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MembershipEndpointArgs extends ResourceArgs {

    public static final MembershipEndpointArgs Empty = new MembershipEndpointArgs();

    /**
     * If this Membership is a Kubernetes API server hosted on GKE, this is a self link to its GCP resource.
     * Structure is documented below.
     * 
     */
    @Import(name="gkeCluster")
    private @Nullable Output<MembershipEndpointGkeClusterArgs> gkeCluster;

    /**
     * @return If this Membership is a Kubernetes API server hosted on GKE, this is a self link to its GCP resource.
     * Structure is documented below.
     * 
     */
    public Optional<Output<MembershipEndpointGkeClusterArgs>> gkeCluster() {
        return Optional.ofNullable(this.gkeCluster);
    }

    private MembershipEndpointArgs() {}

    private MembershipEndpointArgs(MembershipEndpointArgs $) {
        this.gkeCluster = $.gkeCluster;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MembershipEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MembershipEndpointArgs $;

        public Builder() {
            $ = new MembershipEndpointArgs();
        }

        public Builder(MembershipEndpointArgs defaults) {
            $ = new MembershipEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gkeCluster If this Membership is a Kubernetes API server hosted on GKE, this is a self link to its GCP resource.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder gkeCluster(@Nullable Output<MembershipEndpointGkeClusterArgs> gkeCluster) {
            $.gkeCluster = gkeCluster;
            return this;
        }

        /**
         * @param gkeCluster If this Membership is a Kubernetes API server hosted on GKE, this is a self link to its GCP resource.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder gkeCluster(MembershipEndpointGkeClusterArgs gkeCluster) {
            return gkeCluster(Output.of(gkeCluster));
        }

        public MembershipEndpointArgs build() {
            return $;
        }
    }

}
