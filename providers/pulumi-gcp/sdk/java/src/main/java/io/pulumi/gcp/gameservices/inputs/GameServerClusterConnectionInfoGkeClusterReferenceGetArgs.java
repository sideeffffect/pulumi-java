// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class GameServerClusterConnectionInfoGkeClusterReferenceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GameServerClusterConnectionInfoGkeClusterReferenceGetArgs Empty = new GameServerClusterConnectionInfoGkeClusterReferenceGetArgs();

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
      private final Output<String> cluster;

    public Output<String> cluster() {
        return this.cluster;
    }

    public GameServerClusterConnectionInfoGkeClusterReferenceGetArgs(Output<String> cluster) {
        this.cluster = Objects.requireNonNull(cluster, "expected parameter 'cluster' to be non-null");
    }

    private GameServerClusterConnectionInfoGkeClusterReferenceGetArgs() {
        this.cluster = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerClusterConnectionInfoGkeClusterReferenceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> cluster;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerClusterConnectionInfoGkeClusterReferenceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
        }

        public Builder cluster(Output<String> cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }
        public Builder cluster(String cluster) {
            this.cluster = Output.of(Objects.requireNonNull(cluster));
            return this;
        }        public GameServerClusterConnectionInfoGkeClusterReferenceGetArgs build() {
            return new GameServerClusterConnectionInfoGkeClusterReferenceGetArgs(cluster);
        }
    }
}
