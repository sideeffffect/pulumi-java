// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSourceControlArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSourceControlArgs Empty = new GetSourceControlArgs();

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @Import(name="operationalInsightsResourceProvider", required=true)
    private String operationalInsightsResourceProvider;

    public String operationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Source control Id
     * 
     */
    @Import(name="sourceControlId", required=true)
    private String sourceControlId;

    public String sourceControlId() {
        return this.sourceControlId;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    public String workspaceName() {
        return this.workspaceName;
    }

    private GetSourceControlArgs() {}

    private GetSourceControlArgs(GetSourceControlArgs $) {
        this.operationalInsightsResourceProvider = $.operationalInsightsResourceProvider;
        this.resourceGroupName = $.resourceGroupName;
        this.sourceControlId = $.sourceControlId;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSourceControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSourceControlArgs $;

        public Builder() {
            $ = new GetSourceControlArgs();
        }

        public Builder(GetSourceControlArgs defaults) {
            $ = new GetSourceControlArgs(Objects.requireNonNull(defaults));
        }

        public Builder operationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            $.operationalInsightsResourceProvider = operationalInsightsResourceProvider;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder sourceControlId(String sourceControlId) {
            $.sourceControlId = sourceControlId;
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetSourceControlArgs build() {
            $.operationalInsightsResourceProvider = Objects.requireNonNull($.operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sourceControlId = Objects.requireNonNull($.sourceControlId, "expected parameter 'sourceControlId' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
