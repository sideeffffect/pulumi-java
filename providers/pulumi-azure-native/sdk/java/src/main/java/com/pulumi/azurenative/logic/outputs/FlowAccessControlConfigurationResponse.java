// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.azurenative.logic.outputs.FlowAccessControlConfigurationPolicyResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowAccessControlConfigurationResponse {
    /**
     * @return The access control configuration for workflow actions.
     * 
     */
    private final @Nullable FlowAccessControlConfigurationPolicyResponse actions;
    /**
     * @return The access control configuration for accessing workflow run contents.
     * 
     */
    private final @Nullable FlowAccessControlConfigurationPolicyResponse contents;
    /**
     * @return The access control configuration for invoking workflow triggers.
     * 
     */
    private final @Nullable FlowAccessControlConfigurationPolicyResponse triggers;
    /**
     * @return The access control configuration for workflow management.
     * 
     */
    private final @Nullable FlowAccessControlConfigurationPolicyResponse workflowManagement;

    @CustomType.Constructor
    private FlowAccessControlConfigurationResponse(
        @CustomType.Parameter("actions") @Nullable FlowAccessControlConfigurationPolicyResponse actions,
        @CustomType.Parameter("contents") @Nullable FlowAccessControlConfigurationPolicyResponse contents,
        @CustomType.Parameter("triggers") @Nullable FlowAccessControlConfigurationPolicyResponse triggers,
        @CustomType.Parameter("workflowManagement") @Nullable FlowAccessControlConfigurationPolicyResponse workflowManagement) {
        this.actions = actions;
        this.contents = contents;
        this.triggers = triggers;
        this.workflowManagement = workflowManagement;
    }

    /**
     * @return The access control configuration for workflow actions.
     * 
     */
    public Optional<FlowAccessControlConfigurationPolicyResponse> actions() {
        return Optional.ofNullable(this.actions);
    }
    /**
     * @return The access control configuration for accessing workflow run contents.
     * 
     */
    public Optional<FlowAccessControlConfigurationPolicyResponse> contents() {
        return Optional.ofNullable(this.contents);
    }
    /**
     * @return The access control configuration for invoking workflow triggers.
     * 
     */
    public Optional<FlowAccessControlConfigurationPolicyResponse> triggers() {
        return Optional.ofNullable(this.triggers);
    }
    /**
     * @return The access control configuration for workflow management.
     * 
     */
    public Optional<FlowAccessControlConfigurationPolicyResponse> workflowManagement() {
        return Optional.ofNullable(this.workflowManagement);
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
        }        public FlowAccessControlConfigurationResponse build() {
            return new FlowAccessControlConfigurationResponse(actions, contents, triggers, workflowManagement);
        }
    }
}
