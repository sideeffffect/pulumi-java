// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Workspace features.
 * 
 */
public final class WorkspaceFeaturesResponse extends io.pulumi.resources.InvokeArgs {

    public static final WorkspaceFeaturesResponse Empty = new WorkspaceFeaturesResponse();

    /**
     * Dedicated LA cluster resourceId that is linked to the workspaces.
     * 
     */
    @InputImport(name="clusterResourceId")
      private final @Nullable String clusterResourceId;

    public Optional<String> getClusterResourceId() {
        return this.clusterResourceId == null ? Optional.empty() : Optional.ofNullable(this.clusterResourceId);
    }

    /**
     * Disable Non-AAD based Auth.
     * 
     */
    @InputImport(name="disableLocalAuth")
      private final @Nullable Boolean disableLocalAuth;

    public Optional<Boolean> getDisableLocalAuth() {
        return this.disableLocalAuth == null ? Optional.empty() : Optional.ofNullable(this.disableLocalAuth);
    }

    /**
     * Flag that indicate if data should be exported.
     * 
     */
    @InputImport(name="enableDataExport")
      private final @Nullable Boolean enableDataExport;

    public Optional<Boolean> getEnableDataExport() {
        return this.enableDataExport == null ? Optional.empty() : Optional.ofNullable(this.enableDataExport);
    }

    /**
     * Flag that indicate which permission to use - resource or workspace or both.
     * 
     */
    @InputImport(name="enableLogAccessUsingOnlyResourcePermissions")
      private final @Nullable Boolean enableLogAccessUsingOnlyResourcePermissions;

    public Optional<Boolean> getEnableLogAccessUsingOnlyResourcePermissions() {
        return this.enableLogAccessUsingOnlyResourcePermissions == null ? Optional.empty() : Optional.ofNullable(this.enableLogAccessUsingOnlyResourcePermissions);
    }

    /**
     * Flag that describes if we want to remove the data after 30 days.
     * 
     */
    @InputImport(name="immediatePurgeDataOn30Days")
      private final @Nullable Boolean immediatePurgeDataOn30Days;

    public Optional<Boolean> getImmediatePurgeDataOn30Days() {
        return this.immediatePurgeDataOn30Days == null ? Optional.empty() : Optional.ofNullable(this.immediatePurgeDataOn30Days);
    }

    public WorkspaceFeaturesResponse(
        @Nullable String clusterResourceId,
        @Nullable Boolean disableLocalAuth,
        @Nullable Boolean enableDataExport,
        @Nullable Boolean enableLogAccessUsingOnlyResourcePermissions,
        @Nullable Boolean immediatePurgeDataOn30Days) {
        this.clusterResourceId = clusterResourceId;
        this.disableLocalAuth = disableLocalAuth;
        this.enableDataExport = enableDataExport;
        this.enableLogAccessUsingOnlyResourcePermissions = enableLogAccessUsingOnlyResourcePermissions;
        this.immediatePurgeDataOn30Days = immediatePurgeDataOn30Days;
    }

    private WorkspaceFeaturesResponse() {
        this.clusterResourceId = null;
        this.disableLocalAuth = null;
        this.enableDataExport = null;
        this.enableLogAccessUsingOnlyResourcePermissions = null;
        this.immediatePurgeDataOn30Days = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceFeaturesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clusterResourceId;
        private @Nullable Boolean disableLocalAuth;
        private @Nullable Boolean enableDataExport;
        private @Nullable Boolean enableLogAccessUsingOnlyResourcePermissions;
        private @Nullable Boolean immediatePurgeDataOn30Days;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceFeaturesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterResourceId = defaults.clusterResourceId;
    	      this.disableLocalAuth = defaults.disableLocalAuth;
    	      this.enableDataExport = defaults.enableDataExport;
    	      this.enableLogAccessUsingOnlyResourcePermissions = defaults.enableLogAccessUsingOnlyResourcePermissions;
    	      this.immediatePurgeDataOn30Days = defaults.immediatePurgeDataOn30Days;
        }

        public Builder clusterResourceId(@Nullable String clusterResourceId) {
            this.clusterResourceId = clusterResourceId;
            return this;
        }

        public Builder disableLocalAuth(@Nullable Boolean disableLocalAuth) {
            this.disableLocalAuth = disableLocalAuth;
            return this;
        }

        public Builder enableDataExport(@Nullable Boolean enableDataExport) {
            this.enableDataExport = enableDataExport;
            return this;
        }

        public Builder enableLogAccessUsingOnlyResourcePermissions(@Nullable Boolean enableLogAccessUsingOnlyResourcePermissions) {
            this.enableLogAccessUsingOnlyResourcePermissions = enableLogAccessUsingOnlyResourcePermissions;
            return this;
        }

        public Builder immediatePurgeDataOn30Days(@Nullable Boolean immediatePurgeDataOn30Days) {
            this.immediatePurgeDataOn30Days = immediatePurgeDataOn30Days;
            return this;
        }
        public WorkspaceFeaturesResponse build() {
            return new WorkspaceFeaturesResponse(clusterResourceId, disableLocalAuth, enableDataExport, enableLogAccessUsingOnlyResourcePermissions, immediatePurgeDataOn30Days);
        }
    }
}
