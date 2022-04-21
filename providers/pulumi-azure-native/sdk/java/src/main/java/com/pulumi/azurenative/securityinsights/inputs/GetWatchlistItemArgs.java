// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWatchlistItemArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWatchlistItemArgs Empty = new GetWatchlistItemArgs();

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
     * Watchlist Alias
     * 
     */
    @Import(name="watchlistAlias", required=true)
    private String watchlistAlias;

    public String watchlistAlias() {
        return this.watchlistAlias;
    }

    /**
     * Watchlist Item Id (GUID)
     * 
     */
    @Import(name="watchlistItemId", required=true)
    private String watchlistItemId;

    public String watchlistItemId() {
        return this.watchlistItemId;
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

    private GetWatchlistItemArgs() {}

    private GetWatchlistItemArgs(GetWatchlistItemArgs $) {
        this.operationalInsightsResourceProvider = $.operationalInsightsResourceProvider;
        this.resourceGroupName = $.resourceGroupName;
        this.watchlistAlias = $.watchlistAlias;
        this.watchlistItemId = $.watchlistItemId;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWatchlistItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWatchlistItemArgs $;

        public Builder() {
            $ = new GetWatchlistItemArgs();
        }

        public Builder(GetWatchlistItemArgs defaults) {
            $ = new GetWatchlistItemArgs(Objects.requireNonNull(defaults));
        }

        public Builder operationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            $.operationalInsightsResourceProvider = operationalInsightsResourceProvider;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder watchlistAlias(String watchlistAlias) {
            $.watchlistAlias = watchlistAlias;
            return this;
        }

        public Builder watchlistItemId(String watchlistItemId) {
            $.watchlistItemId = watchlistItemId;
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetWatchlistItemArgs build() {
            $.operationalInsightsResourceProvider = Objects.requireNonNull($.operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.watchlistAlias = Objects.requireNonNull($.watchlistAlias, "expected parameter 'watchlistAlias' to be non-null");
            $.watchlistItemId = Objects.requireNonNull($.watchlistItemId, "expected parameter 'watchlistItemId' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
