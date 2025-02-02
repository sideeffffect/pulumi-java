// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataproc.outputs.WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTarget;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfig {
    /**
     * @return Optional. A target for the deployment.
     * 
     */
    private final @Nullable WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTarget namespacedGkeDeploymentTarget;

    @CustomType.Constructor
    private WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfig(@CustomType.Parameter("namespacedGkeDeploymentTarget") @Nullable WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTarget namespacedGkeDeploymentTarget) {
        this.namespacedGkeDeploymentTarget = namespacedGkeDeploymentTarget;
    }

    /**
     * @return Optional. A target for the deployment.
     * 
     */
    public Optional<WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTarget> namespacedGkeDeploymentTarget() {
        return Optional.ofNullable(this.namespacedGkeDeploymentTarget);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTarget namespacedGkeDeploymentTarget;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespacedGkeDeploymentTarget = defaults.namespacedGkeDeploymentTarget;
        }

        public Builder namespacedGkeDeploymentTarget(@Nullable WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTarget namespacedGkeDeploymentTarget) {
            this.namespacedGkeDeploymentTarget = namespacedGkeDeploymentTarget;
            return this;
        }        public WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfig build() {
            return new WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfig(namespacedGkeDeploymentTarget);
        }
    }
}
