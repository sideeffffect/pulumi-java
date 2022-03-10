// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.azurenative.deploymentmanager.inputs.MessageResponse;
import io.pulumi.azurenative.deploymentmanager.inputs.ResourceOperationResponse;
import io.pulumi.azurenative.deploymentmanager.inputs.StepOperationInfoResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines a specific step on a target service unit.
 * 
 */
public final class RolloutStepResponse extends io.pulumi.resources.InvokeArgs {

    public static final RolloutStepResponse Empty = new RolloutStepResponse();

    /**
     * Supplementary informative messages during rollout.
     * 
     */
    @InputImport(name="messages", required=true)
      private final List<MessageResponse> messages;

    public List<MessageResponse> getMessages() {
        return this.messages;
    }

    /**
     * Name of the step.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Detailed information of specific action execution.
     * 
     */
    @InputImport(name="operationInfo", required=true)
      private final StepOperationInfoResponse operationInfo;

    public StepOperationInfoResponse getOperationInfo() {
        return this.operationInfo;
    }

    /**
     * Set of resource operations that were performed, if any, on an Azure resource.
     * 
     */
    @InputImport(name="resourceOperations", required=true)
      private final List<ResourceOperationResponse> resourceOperations;

    public List<ResourceOperationResponse> getResourceOperations() {
        return this.resourceOperations;
    }

    /**
     * Current state of the step.
     * 
     */
    @InputImport(name="status", required=true)
      private final String status;

    public String getStatus() {
        return this.status;
    }

    /**
     * The step group the current step is part of.
     * 
     */
    @InputImport(name="stepGroup")
      private final @Nullable String stepGroup;

    public Optional<String> getStepGroup() {
        return this.stepGroup == null ? Optional.empty() : Optional.ofNullable(this.stepGroup);
    }

    public RolloutStepResponse(
        List<MessageResponse> messages,
        String name,
        StepOperationInfoResponse operationInfo,
        List<ResourceOperationResponse> resourceOperations,
        String status,
        @Nullable String stepGroup) {
        this.messages = Objects.requireNonNull(messages, "expected parameter 'messages' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.operationInfo = Objects.requireNonNull(operationInfo, "expected parameter 'operationInfo' to be non-null");
        this.resourceOperations = Objects.requireNonNull(resourceOperations, "expected parameter 'resourceOperations' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.stepGroup = stepGroup;
    }

    private RolloutStepResponse() {
        this.messages = List.of();
        this.name = null;
        this.operationInfo = null;
        this.resourceOperations = List.of();
        this.status = null;
        this.stepGroup = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RolloutStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MessageResponse> messages;
        private String name;
        private StepOperationInfoResponse operationInfo;
        private List<ResourceOperationResponse> resourceOperations;
        private String status;
        private @Nullable String stepGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(RolloutStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messages = defaults.messages;
    	      this.name = defaults.name;
    	      this.operationInfo = defaults.operationInfo;
    	      this.resourceOperations = defaults.resourceOperations;
    	      this.status = defaults.status;
    	      this.stepGroup = defaults.stepGroup;
        }

        public Builder messages(List<MessageResponse> messages) {
            this.messages = Objects.requireNonNull(messages);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder operationInfo(StepOperationInfoResponse operationInfo) {
            this.operationInfo = Objects.requireNonNull(operationInfo);
            return this;
        }

        public Builder resourceOperations(List<ResourceOperationResponse> resourceOperations) {
            this.resourceOperations = Objects.requireNonNull(resourceOperations);
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder stepGroup(@Nullable String stepGroup) {
            this.stepGroup = stepGroup;
            return this;
        }
        public RolloutStepResponse build() {
            return new RolloutStepResponse(messages, name, operationInfo, resourceOperations, status, stepGroup);
        }
    }
}
