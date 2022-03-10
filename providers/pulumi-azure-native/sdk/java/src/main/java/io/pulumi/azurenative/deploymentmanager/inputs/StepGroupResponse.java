// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.azurenative.deploymentmanager.inputs.PrePostStepResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties that define a Step group in a rollout.
 * 
 */
public final class StepGroupResponse extends io.pulumi.resources.InvokeArgs {

    public static final StepGroupResponse Empty = new StepGroupResponse();

    /**
     * The list of step group names on which this step group depends on.
     * 
     */
    @InputImport(name="dependsOnStepGroups")
      private final @Nullable List<String> dependsOnStepGroups;

    public List<String> getDependsOnStepGroups() {
        return this.dependsOnStepGroups == null ? List.of() : this.dependsOnStepGroups;
    }

    /**
     * The resource Id of service unit to be deployed. The service unit should be from the service topology referenced in targetServiceTopologyId
     * 
     */
    @InputImport(name="deploymentTargetId", required=true)
      private final String deploymentTargetId;

    public String getDeploymentTargetId() {
        return this.deploymentTargetId;
    }

    /**
     * The name of the step group.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The list of steps to be run after deploying the target.
     * 
     */
    @InputImport(name="postDeploymentSteps")
      private final @Nullable List<PrePostStepResponse> postDeploymentSteps;

    public List<PrePostStepResponse> getPostDeploymentSteps() {
        return this.postDeploymentSteps == null ? List.of() : this.postDeploymentSteps;
    }

    /**
     * The list of steps to be run before deploying the target.
     * 
     */
    @InputImport(name="preDeploymentSteps")
      private final @Nullable List<PrePostStepResponse> preDeploymentSteps;

    public List<PrePostStepResponse> getPreDeploymentSteps() {
        return this.preDeploymentSteps == null ? List.of() : this.preDeploymentSteps;
    }

    public StepGroupResponse(
        @Nullable List<String> dependsOnStepGroups,
        String deploymentTargetId,
        String name,
        @Nullable List<PrePostStepResponse> postDeploymentSteps,
        @Nullable List<PrePostStepResponse> preDeploymentSteps) {
        this.dependsOnStepGroups = dependsOnStepGroups;
        this.deploymentTargetId = Objects.requireNonNull(deploymentTargetId, "expected parameter 'deploymentTargetId' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.postDeploymentSteps = postDeploymentSteps;
        this.preDeploymentSteps = preDeploymentSteps;
    }

    private StepGroupResponse() {
        this.dependsOnStepGroups = List.of();
        this.deploymentTargetId = null;
        this.name = null;
        this.postDeploymentSteps = List.of();
        this.preDeploymentSteps = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StepGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> dependsOnStepGroups;
        private String deploymentTargetId;
        private String name;
        private @Nullable List<PrePostStepResponse> postDeploymentSteps;
        private @Nullable List<PrePostStepResponse> preDeploymentSteps;

        public Builder() {
    	      // Empty
        }

        public Builder(StepGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOnStepGroups = defaults.dependsOnStepGroups;
    	      this.deploymentTargetId = defaults.deploymentTargetId;
    	      this.name = defaults.name;
    	      this.postDeploymentSteps = defaults.postDeploymentSteps;
    	      this.preDeploymentSteps = defaults.preDeploymentSteps;
        }

        public Builder dependsOnStepGroups(@Nullable List<String> dependsOnStepGroups) {
            this.dependsOnStepGroups = dependsOnStepGroups;
            return this;
        }

        public Builder deploymentTargetId(String deploymentTargetId) {
            this.deploymentTargetId = Objects.requireNonNull(deploymentTargetId);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder postDeploymentSteps(@Nullable List<PrePostStepResponse> postDeploymentSteps) {
            this.postDeploymentSteps = postDeploymentSteps;
            return this;
        }

        public Builder preDeploymentSteps(@Nullable List<PrePostStepResponse> preDeploymentSteps) {
            this.preDeploymentSteps = preDeploymentSteps;
            return this;
        }
        public StepGroupResponse build() {
            return new StepGroupResponse(dependsOnStepGroups, deploymentTargetId, name, postDeploymentSteps, preDeploymentSteps);
        }
    }
}
