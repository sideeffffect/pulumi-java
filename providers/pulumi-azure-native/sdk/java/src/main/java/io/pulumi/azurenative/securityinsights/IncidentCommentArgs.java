// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IncidentCommentArgs extends io.pulumi.resources.ResourceArgs {

    public static final IncidentCommentArgs Empty = new IncidentCommentArgs();

    /**
     * Incident comment ID
     * 
     */
    @InputImport(name="incidentCommentId")
      private final @Nullable Input<String> incidentCommentId;

    public Input<String> getIncidentCommentId() {
        return this.incidentCommentId == null ? Input.empty() : this.incidentCommentId;
    }

    /**
     * Incident ID
     * 
     */
    @InputImport(name="incidentId", required=true)
      private final Input<String> incidentId;

    public Input<String> getIncidentId() {
        return this.incidentId;
    }

    /**
     * The comment message
     * 
     */
    @InputImport(name="message", required=true)
      private final Input<String> message;

    public Input<String> getMessage() {
        return this.message;
    }

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @InputImport(name="operationalInsightsResourceProvider", required=true)
      private final Input<String> operationalInsightsResourceProvider;

    public Input<String> getOperationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
      private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public IncidentCommentArgs(
        @Nullable Input<String> incidentCommentId,
        Input<String> incidentId,
        Input<String> message,
        Input<String> operationalInsightsResourceProvider,
        Input<String> resourceGroupName,
        Input<String> workspaceName) {
        this.incidentCommentId = incidentCommentId;
        this.incidentId = Objects.requireNonNull(incidentId, "expected parameter 'incidentId' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private IncidentCommentArgs() {
        this.incidentCommentId = Input.empty();
        this.incidentId = Input.empty();
        this.message = Input.empty();
        this.operationalInsightsResourceProvider = Input.empty();
        this.resourceGroupName = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IncidentCommentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> incidentCommentId;
        private Input<String> incidentId;
        private Input<String> message;
        private Input<String> operationalInsightsResourceProvider;
        private Input<String> resourceGroupName;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(IncidentCommentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.incidentCommentId = defaults.incidentCommentId;
    	      this.incidentId = defaults.incidentId;
    	      this.message = defaults.message;
    	      this.operationalInsightsResourceProvider = defaults.operationalInsightsResourceProvider;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder incidentCommentId(@Nullable Input<String> incidentCommentId) {
            this.incidentCommentId = incidentCommentId;
            return this;
        }

        public Builder incidentCommentId(@Nullable String incidentCommentId) {
            this.incidentCommentId = Input.ofNullable(incidentCommentId);
            return this;
        }

        public Builder incidentId(Input<String> incidentId) {
            this.incidentId = Objects.requireNonNull(incidentId);
            return this;
        }

        public Builder incidentId(String incidentId) {
            this.incidentId = Input.of(Objects.requireNonNull(incidentId));
            return this;
        }

        public Builder message(Input<String> message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder message(String message) {
            this.message = Input.of(Objects.requireNonNull(message));
            return this;
        }

        public Builder operationalInsightsResourceProvider(Input<String> operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider);
            return this;
        }

        public Builder operationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Input.of(Objects.requireNonNull(operationalInsightsResourceProvider));
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder workspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }
        public IncidentCommentArgs build() {
            return new IncidentCommentArgs(incidentCommentId, incidentId, message, operationalInsightsResourceProvider, resourceGroupName, workspaceName);
        }
    }
}
