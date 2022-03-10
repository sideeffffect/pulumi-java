// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.deploymentmanager_v2beta.inputs.DeploymentUpdateLabelEntryResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DeploymentUpdateResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeploymentUpdateResponse Empty = new DeploymentUpdateResponse();

    /**
     * An optional user-provided description of the deployment after the current update has been applied.
     * 
     */
    @InputImport(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * Map of One Platform labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
     * 
     */
    @InputImport(name="labels", required=true)
      private final List<DeploymentUpdateLabelEntryResponse> labels;

    public List<DeploymentUpdateLabelEntryResponse> getLabels() {
        return this.labels;
    }

    /**
     * URL of the manifest representing the update configuration of this deployment.
     * 
     */
    @InputImport(name="manifest", required=true)
      private final String manifest;

    public String getManifest() {
        return this.manifest;
    }

    public DeploymentUpdateResponse(
        String description,
        List<DeploymentUpdateLabelEntryResponse> labels,
        String manifest) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.manifest = Objects.requireNonNull(manifest, "expected parameter 'manifest' to be non-null");
    }

    private DeploymentUpdateResponse() {
        this.description = null;
        this.labels = List.of();
        this.manifest = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentUpdateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private List<DeploymentUpdateLabelEntryResponse> labels;
        private String manifest;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentUpdateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.manifest = defaults.manifest;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder labels(List<DeploymentUpdateLabelEntryResponse> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder manifest(String manifest) {
            this.manifest = Objects.requireNonNull(manifest);
            return this;
        }
        public DeploymentUpdateResponse build() {
            return new DeploymentUpdateResponse(description, labels, manifest);
        }
    }
}
