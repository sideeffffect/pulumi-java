// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * GkeCluster contains information specific to GKE clusters.
 * 
 */
public final class GkeClusterResponse extends com.pulumi.resources.InvokeArgs {

    public static final GkeClusterResponse Empty = new GkeClusterResponse();

    /**
     * If cluster_missing is set then it denotes that the GKE cluster no longer exists in the GKE Control Plane.
     * 
     */
    @Import(name="clusterMissing", required=true)
    private Boolean clusterMissing;

    public Boolean clusterMissing() {
        return this.clusterMissing;
    }

    /**
     * Immutable. Self-link of the GCP resource for the GKE cluster. For example: //container.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster Zonal clusters are also supported.
     * 
     */
    @Import(name="resourceLink", required=true)
    private String resourceLink;

    public String resourceLink() {
        return this.resourceLink;
    }

    private GkeClusterResponse() {}

    private GkeClusterResponse(GkeClusterResponse $) {
        this.clusterMissing = $.clusterMissing;
        this.resourceLink = $.resourceLink;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GkeClusterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GkeClusterResponse $;

        public Builder() {
            $ = new GkeClusterResponse();
        }

        public Builder(GkeClusterResponse defaults) {
            $ = new GkeClusterResponse(Objects.requireNonNull(defaults));
        }

        public Builder clusterMissing(Boolean clusterMissing) {
            $.clusterMissing = clusterMissing;
            return this;
        }

        public Builder resourceLink(String resourceLink) {
            $.resourceLink = resourceLink;
            return this;
        }

        public GkeClusterResponse build() {
            $.clusterMissing = Objects.requireNonNull($.clusterMissing, "expected parameter 'clusterMissing' to be non-null");
            $.resourceLink = Objects.requireNonNull($.resourceLink, "expected parameter 'resourceLink' to be non-null");
            return $;
        }
    }

}
