// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.clouddeploy.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information specifying a GKE Cluster.
 * 
 */
public final class GkeClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GkeClusterArgs Empty = new GkeClusterArgs();

    /**
     * Information specifying a GKE Cluster. Format is `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}.
     * 
     */
    @Import(name="cluster")
    private @Nullable Output<String> cluster;

    /**
     * @return Information specifying a GKE Cluster. Format is `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}.
     * 
     */
    public Optional<Output<String>> cluster() {
        return Optional.ofNullable(this.cluster);
    }

    /**
     * Optional. If true, `cluster` is accessed using the private IP address of the control plane endpoint. Otherwise, the default IP address of the control plane endpoint is used. The default IP address is the private IP address for clusters with private control-plane endpoints and the public IP address otherwise. Only specify this option when `cluster` is a [private GKE cluster](https://cloud.google.com/kubernetes-engine/docs/concepts/private-cluster-concept).
     * 
     */
    @Import(name="internalIp")
    private @Nullable Output<Boolean> internalIp;

    /**
     * @return Optional. If true, `cluster` is accessed using the private IP address of the control plane endpoint. Otherwise, the default IP address of the control plane endpoint is used. The default IP address is the private IP address for clusters with private control-plane endpoints and the public IP address otherwise. Only specify this option when `cluster` is a [private GKE cluster](https://cloud.google.com/kubernetes-engine/docs/concepts/private-cluster-concept).
     * 
     */
    public Optional<Output<Boolean>> internalIp() {
        return Optional.ofNullable(this.internalIp);
    }

    private GkeClusterArgs() {}

    private GkeClusterArgs(GkeClusterArgs $) {
        this.cluster = $.cluster;
        this.internalIp = $.internalIp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GkeClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GkeClusterArgs $;

        public Builder() {
            $ = new GkeClusterArgs();
        }

        public Builder(GkeClusterArgs defaults) {
            $ = new GkeClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cluster Information specifying a GKE Cluster. Format is `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}.
         * 
         * @return builder
         * 
         */
        public Builder cluster(@Nullable Output<String> cluster) {
            $.cluster = cluster;
            return this;
        }

        /**
         * @param cluster Information specifying a GKE Cluster. Format is `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}.
         * 
         * @return builder
         * 
         */
        public Builder cluster(String cluster) {
            return cluster(Output.of(cluster));
        }

        /**
         * @param internalIp Optional. If true, `cluster` is accessed using the private IP address of the control plane endpoint. Otherwise, the default IP address of the control plane endpoint is used. The default IP address is the private IP address for clusters with private control-plane endpoints and the public IP address otherwise. Only specify this option when `cluster` is a [private GKE cluster](https://cloud.google.com/kubernetes-engine/docs/concepts/private-cluster-concept).
         * 
         * @return builder
         * 
         */
        public Builder internalIp(@Nullable Output<Boolean> internalIp) {
            $.internalIp = internalIp;
            return this;
        }

        /**
         * @param internalIp Optional. If true, `cluster` is accessed using the private IP address of the control plane endpoint. Otherwise, the default IP address of the control plane endpoint is used. The default IP address is the private IP address for clusters with private control-plane endpoints and the public IP address otherwise. Only specify this option when `cluster` is a [private GKE cluster](https://cloud.google.com/kubernetes-engine/docs/concepts/private-cluster-concept).
         * 
         * @return builder
         * 
         */
        public Builder internalIp(Boolean internalIp) {
            return internalIp(Output.of(internalIp));
        }

        public GkeClusterArgs build() {
            return $;
        }
    }

}
