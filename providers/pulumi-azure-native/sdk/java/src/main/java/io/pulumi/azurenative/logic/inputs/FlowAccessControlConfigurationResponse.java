// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.FlowAccessControlConfigurationPolicyResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The access control configuration.
 * 
 */
public final class FlowAccessControlConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final FlowAccessControlConfigurationResponse Empty = new FlowAccessControlConfigurationResponse();

    /**
     * The access control configuration for workflow actions.
     * 
     */
    @InputImport(name="actions")
      private final @Nullable FlowAccessControlConfigurationPolicyResponse actions;

    public Optional<FlowAccessControlConfigurationPolicyResponse> getActions() {
        return this.actions == null ? Optional.empty() : Optional.ofNullable(this.actions);
    }

    /**
     * The access control configuration for accessing workflow run contents.
     * 
     */
    @InputImport(name="contents")
      private final @Nullable FlowAccessControlConfigurationPolicyResponse contents;

    public Optional<FlowAccessControlConfigurationPolicyResponse> getContents() {
        return this.contents == null ? Optional.empty() : Optional.ofNullable(this.contents);
    }

    /**
     * The access control configuration for invoking workflow triggers.
     * 
     */
    @InputImport(name="triggers")
      private final @Nullable FlowAccessControlConfigurationPolicyResponse triggers;

    public Optional<FlowAccessControlConfigurationPolicyResponse> getTriggers() {
        return this.triggers == null ? Optional.empty() : Optional.ofNullable(this.triggers);
    }

    /**
     * The access control configuration for workflow management.
     * 
     */
    @InputImport(name="workflowManagement")
      private final @Nullable FlowAccessControlConfigurationPolicyResponse workflowManagement;

    public Optional<FlowAccessControlConfigurationPolicyResponse> getWorkflowManagement() {
        return this.workflowManagement == null ? Optional.empty() : Optional.ofNullable(this.workflowManagement);
    }

    public FlowAccessControlConfigurationResponse(
        @Nullable FlowAccessControlConfigurationPolicyResponse actions,
        @Nullable FlowAccessControlConfigurationPolicyResponse contents,
        @Nullable FlowAccessControlConfigurationPolicyResponse triggers,
        @Nullable FlowAccessControlConfigurationPolicyResponse workflowManagement) {
        this.actions = actions;
        this.contents = contents;
        this.triggers = triggers;
        this.workflowManagement = workflowManagement;
    }

    private FlowAccessControlConfigurationResponse() {
        this.actions = null;
        this.contents = null;
        this.triggers = null;
        this.workflowManagement = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowAccessControlConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowAccessControlConfigurationPolicyResponse actions;
        private @Nullable FlowAccessControlConfigurationPolicyResponse contents;
        private @Nullable FlowAccessControlConfigurationPolicyResponse triggers;
        private @Nullable FlowAccessControlConfigurationPolicyResponse workflowManagement;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowAccessControlConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.contents = defaults.contents;
    	      this.triggers = defaults.triggers;
    	      this.workflowManagement = defaults.workflowManagement;
        }

        public Builder actions(@Nullable FlowAccessControlConfigurationPolicyResponse actions) {
            this.actions = actions;
            return this;
        }

        public Builder contents(@Nullable FlowAccessControlConfigurationPolicyResponse contents) {
            this.contents = contents;
            return this;
        }

        public Builder triggers(@Nullable FlowAccessControlConfigurationPolicyResponse triggers) {
            this.triggers = triggers;
            return this;
        }

        public Builder workflowManagement(@Nullable FlowAccessControlConfigurationPolicyResponse workflowManagement) {
            this.workflowManagement = workflowManagement;
            return this;
        }
        public FlowAccessControlConfigurationResponse build() {
            return new FlowAccessControlConfigurationResponse(actions, contents, triggers, workflowManagement);
        }
    }
}
