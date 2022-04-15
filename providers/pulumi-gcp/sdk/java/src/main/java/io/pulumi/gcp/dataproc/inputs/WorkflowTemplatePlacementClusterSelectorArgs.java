// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementClusterSelectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementClusterSelectorArgs Empty = new WorkflowTemplatePlacementClusterSelectorArgs();

    /**
     * Required. The cluster labels. Cluster must have all labels to match.
     * 
     */
    @Import(name="clusterLabels", required=true)
      private final Output<Map<String,String>> clusterLabels;

    public Output<Map<String,String>> clusterLabels() {
        return this.clusterLabels;
    }

    /**
     * Optional. The zone where the Compute Engine cluster will be located. On a create request, it is required in the "global" region. If omitted in a non-global Dataproc region, the service will pick a zone in the corresponding Compute Engine region. On a get request, zone will always be present. A full URL, partial URI, or short name are valid. Examples: * `https://www.googleapis.com/compute/v1/projects/` * `us-central1-f`
     * 
     */
    @Import(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> zone() {
        return this.zone == null ? Codegen.empty() : this.zone;
    }

    public WorkflowTemplatePlacementClusterSelectorArgs(
        Output<Map<String,String>> clusterLabels,
        @Nullable Output<String> zone) {
        this.clusterLabels = Objects.requireNonNull(clusterLabels, "expected parameter 'clusterLabels' to be non-null");
        this.zone = zone;
    }

    private WorkflowTemplatePlacementClusterSelectorArgs() {
        this.clusterLabels = Codegen.empty();
        this.zone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementClusterSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Map<String,String>> clusterLabels;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementClusterSelectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterLabels = defaults.clusterLabels;
    	      this.zone = defaults.zone;
        }

        public Builder clusterLabels(Output<Map<String,String>> clusterLabels) {
            this.clusterLabels = Objects.requireNonNull(clusterLabels);
            return this;
        }
        public Builder clusterLabels(Map<String,String> clusterLabels) {
            this.clusterLabels = Output.of(Objects.requireNonNull(clusterLabels));
            return this;
        }
        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = Codegen.ofNullable(zone);
            return this;
        }        public WorkflowTemplatePlacementClusterSelectorArgs build() {
            return new WorkflowTemplatePlacementClusterSelectorArgs(clusterLabels, zone);
        }
    }
}
