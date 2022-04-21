// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A selector that chooses target cluster for jobs based on metadata.
 * 
 */
public final class ClusterSelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterSelectorArgs Empty = new ClusterSelectorArgs();

    /**
     * The cluster labels. Cluster must have all labels to match.
     * 
     */
    @Import(name="clusterLabels", required=true)
    private Output<Map<String,String>> clusterLabels;

    public Output<Map<String,String>> clusterLabels() {
        return this.clusterLabels;
    }

    /**
     * Optional. The zone where workflow process executes. This parameter does not affect the selection of the cluster.If unspecified, the zone of the first cluster matching the selector is used.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private ClusterSelectorArgs() {}

    private ClusterSelectorArgs(ClusterSelectorArgs $) {
        this.clusterLabels = $.clusterLabels;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterSelectorArgs $;

        public Builder() {
            $ = new ClusterSelectorArgs();
        }

        public Builder(ClusterSelectorArgs defaults) {
            $ = new ClusterSelectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterLabels(Output<Map<String,String>> clusterLabels) {
            $.clusterLabels = clusterLabels;
            return this;
        }

        public Builder clusterLabels(Map<String,String> clusterLabels) {
            return clusterLabels(Output.of(clusterLabels));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public ClusterSelectorArgs build() {
            $.clusterLabels = Objects.requireNonNull($.clusterLabels, "expected parameter 'clusterLabels' to be non-null");
            return $;
        }
    }

}
