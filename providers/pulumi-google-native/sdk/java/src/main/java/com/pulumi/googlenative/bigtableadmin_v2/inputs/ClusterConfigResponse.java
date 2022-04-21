// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigtableadmin_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.bigtableadmin_v2.inputs.ClusterAutoscalingConfigResponse;
import java.util.Objects;


/**
 * Configuration for a cluster.
 * 
 */
public final class ClusterConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final ClusterConfigResponse Empty = new ClusterConfigResponse();

    /**
     * Autoscaling configuration for this cluster.
     * 
     */
    @Import(name="clusterAutoscalingConfig", required=true)
    private ClusterAutoscalingConfigResponse clusterAutoscalingConfig;

    public ClusterAutoscalingConfigResponse clusterAutoscalingConfig() {
        return this.clusterAutoscalingConfig;
    }

    private ClusterConfigResponse() {}

    private ClusterConfigResponse(ClusterConfigResponse $) {
        this.clusterAutoscalingConfig = $.clusterAutoscalingConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterConfigResponse $;

        public Builder() {
            $ = new ClusterConfigResponse();
        }

        public Builder(ClusterConfigResponse defaults) {
            $ = new ClusterConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder clusterAutoscalingConfig(ClusterAutoscalingConfigResponse clusterAutoscalingConfig) {
            $.clusterAutoscalingConfig = clusterAutoscalingConfig;
            return this;
        }

        public ClusterConfigResponse build() {
            $.clusterAutoscalingConfig = Objects.requireNonNull($.clusterAutoscalingConfig, "expected parameter 'clusterAutoscalingConfig' to be non-null");
            return $;
        }
    }

}
