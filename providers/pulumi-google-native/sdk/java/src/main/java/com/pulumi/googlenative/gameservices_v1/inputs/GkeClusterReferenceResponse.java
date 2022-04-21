// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A reference to a GKE cluster.
 * 
 */
public final class GkeClusterReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final GkeClusterReferenceResponse Empty = new GkeClusterReferenceResponse();

    /**
     * The full or partial name of a GKE cluster, using one of the following forms: * `projects/{project}/locations/{location}/clusters/{cluster}` * `locations/{location}/clusters/{cluster}` * `{cluster}` If project and location are not specified, the project and location of the GameServerCluster resource are used to generate the full name of the GKE cluster.
     * 
     */
    @Import(name="cluster", required=true)
    private String cluster;

    public String cluster() {
        return this.cluster;
    }

    private GkeClusterReferenceResponse() {}

    private GkeClusterReferenceResponse(GkeClusterReferenceResponse $) {
        this.cluster = $.cluster;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GkeClusterReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GkeClusterReferenceResponse $;

        public Builder() {
            $ = new GkeClusterReferenceResponse();
        }

        public Builder(GkeClusterReferenceResponse defaults) {
            $ = new GkeClusterReferenceResponse(Objects.requireNonNull(defaults));
        }

        public Builder cluster(String cluster) {
            $.cluster = cluster;
            return this;
        }

        public GkeClusterReferenceResponse build() {
            $.cluster = Objects.requireNonNull($.cluster, "expected parameter 'cluster' to be non-null");
            return $;
        }
    }

}
