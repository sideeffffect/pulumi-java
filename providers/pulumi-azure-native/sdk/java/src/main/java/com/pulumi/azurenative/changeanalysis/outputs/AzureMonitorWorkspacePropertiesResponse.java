// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.changeanalysis.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureMonitorWorkspacePropertiesResponse {
    /**
     * The mode of includeChangeDetails feature. The flag configures whether to include or exclude content of the change before and after values.
     * 
     */
    private final @Nullable String includeChangeDetails;
    /**
     * The Azure Monitor workspace ID - the unique identifier for the Log Analytics workspace.
     * 
     */
    private final @Nullable String workspaceId;
    /**
     * The Azure Monitor workspace ARM Resource ID. The resource ID should be in the following format: /subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}
     * 
     */
    private final @Nullable String workspaceResourceId;

    @CustomType.Constructor
    private AzureMonitorWorkspacePropertiesResponse(
        @CustomType.Parameter("includeChangeDetails") @Nullable String includeChangeDetails,
        @CustomType.Parameter("workspaceId") @Nullable String workspaceId,
        @CustomType.Parameter("workspaceResourceId") @Nullable String workspaceResourceId) {
        this.includeChangeDetails = includeChangeDetails;
        this.workspaceId = workspaceId;
        this.workspaceResourceId = workspaceResourceId;
    }

    /**
     * The mode of includeChangeDetails feature. The flag configures whether to include or exclude content of the change before and after values.
     * 
    */
    public Optional<String> includeChangeDetails() {
        return Optional.ofNullable(this.includeChangeDetails);
    }
    /**
     * The Azure Monitor workspace ID - the unique identifier for the Log Analytics workspace.
     * 
    */
    public Optional<String> workspaceId() {
        return Optional.ofNullable(this.workspaceId);
    }
    /**
     * The Azure Monitor workspace ARM Resource ID. The resource ID should be in the following format: /subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}
     * 
    */
    public Optional<String> workspaceResourceId() {
        return Optional.ofNullable(this.workspaceResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMonitorWorkspacePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String includeChangeDetails;
        private @Nullable String workspaceId;
        private @Nullable String workspaceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMonitorWorkspacePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeChangeDetails = defaults.includeChangeDetails;
    	      this.workspaceId = defaults.workspaceId;
    	      this.workspaceResourceId = defaults.workspaceResourceId;
        }

        public Builder includeChangeDetails(@Nullable String includeChangeDetails) {
            this.includeChangeDetails = includeChangeDetails;
            return this;
        }
        public Builder workspaceId(@Nullable String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public Builder workspaceResourceId(@Nullable String workspaceResourceId) {
            this.workspaceResourceId = workspaceResourceId;
            return this;
        }        public AzureMonitorWorkspacePropertiesResponse build() {
            return new AzureMonitorWorkspacePropertiesResponse(includeChangeDetails, workspaceId, workspaceResourceId);
        }
    }
}
