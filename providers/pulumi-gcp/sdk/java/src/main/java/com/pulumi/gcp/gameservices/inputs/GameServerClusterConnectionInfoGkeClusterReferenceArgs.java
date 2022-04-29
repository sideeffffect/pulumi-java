// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gameservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class GameServerClusterConnectionInfoGkeClusterReferenceArgs extends ResourceArgs {

    public static final GameServerClusterConnectionInfoGkeClusterReferenceArgs Empty = new GameServerClusterConnectionInfoGkeClusterReferenceArgs();

    /**
     * The full or partial name of a GKE cluster, using one of the following
     * forms:
     * * `projects/{project_id}/locations/{location}/clusters/{cluster_id}`
     * * `locations/{location}/clusters/{cluster_id}`
     * * `{cluster_id}`
     *   If project and location are not specified, the project and location of the
     *   GameServerCluster resource are used to generate the full name of the
     *   GKE cluster.
     * 
     */
    @Import(name="cluster", required=true)
    private Output<String> cluster;

    /**
     * @return The full or partial name of a GKE cluster, using one of the following
     * forms:
     * * `projects/{project_id}/locations/{location}/clusters/{cluster_id}`
     * * `locations/{location}/clusters/{cluster_id}`
     * * `{cluster_id}`
     *   If project and location are not specified, the project and location of the
     *   GameServerCluster resource are used to generate the full name of the
     *   GKE cluster.
     * 
     */
    public Output<String> cluster() {
        return this.cluster;
    }

    private GameServerClusterConnectionInfoGkeClusterReferenceArgs() {}

    private GameServerClusterConnectionInfoGkeClusterReferenceArgs(GameServerClusterConnectionInfoGkeClusterReferenceArgs $) {
        this.cluster = $.cluster;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GameServerClusterConnectionInfoGkeClusterReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GameServerClusterConnectionInfoGkeClusterReferenceArgs $;

        public Builder() {
            $ = new GameServerClusterConnectionInfoGkeClusterReferenceArgs();
        }

        public Builder(GameServerClusterConnectionInfoGkeClusterReferenceArgs defaults) {
            $ = new GameServerClusterConnectionInfoGkeClusterReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cluster The full or partial name of a GKE cluster, using one of the following
         * forms:
         * * `projects/{project_id}/locations/{location}/clusters/{cluster_id}`
         * * `locations/{location}/clusters/{cluster_id}`
         * * `{cluster_id}`
         *   If project and location are not specified, the project and location of the
         *   GameServerCluster resource are used to generate the full name of the
         *   GKE cluster.
         * 
         * @return builder
         * 
         */
        public Builder cluster(Output<String> cluster) {
            $.cluster = cluster;
            return this;
        }

        /**
         * @param cluster The full or partial name of a GKE cluster, using one of the following
         * forms:
         * * `projects/{project_id}/locations/{location}/clusters/{cluster_id}`
         * * `locations/{location}/clusters/{cluster_id}`
         * * `{cluster_id}`
         *   If project and location are not specified, the project and location of the
         *   GameServerCluster resource are used to generate the full name of the
         *   GKE cluster.
         * 
         * @return builder
         * 
         */
        public Builder cluster(String cluster) {
            return cluster(Output.of(cluster));
        }

        public GameServerClusterConnectionInfoGkeClusterReferenceArgs build() {
            $.cluster = Objects.requireNonNull($.cluster, "expected parameter 'cluster' to be non-null");
            return $;
        }
    }

}
