// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class ClusterVerticalPodAutoscalingGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterVerticalPodAutoscalingGetArgs Empty = new ClusterVerticalPodAutoscalingGetArgs();

    /**
     * Enable the PodSecurityPolicy controller for this cluster.
     * If enabled, pods must be valid under a PodSecurityPolicy to be created.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private ClusterVerticalPodAutoscalingGetArgs() {}

    private ClusterVerticalPodAutoscalingGetArgs(ClusterVerticalPodAutoscalingGetArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterVerticalPodAutoscalingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterVerticalPodAutoscalingGetArgs $;

        public Builder() {
            $ = new ClusterVerticalPodAutoscalingGetArgs();
        }

        public Builder(ClusterVerticalPodAutoscalingGetArgs defaults) {
            $ = new ClusterVerticalPodAutoscalingGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ClusterVerticalPodAutoscalingGetArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
