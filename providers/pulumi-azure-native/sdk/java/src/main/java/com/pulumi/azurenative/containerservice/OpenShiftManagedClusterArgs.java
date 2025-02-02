// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice;

import com.pulumi.azurenative.containerservice.inputs.NetworkProfileArgs;
import com.pulumi.azurenative.containerservice.inputs.OpenShiftManagedClusterAgentPoolProfileArgs;
import com.pulumi.azurenative.containerservice.inputs.OpenShiftManagedClusterAuthProfileArgs;
import com.pulumi.azurenative.containerservice.inputs.OpenShiftManagedClusterMasterPoolProfileArgs;
import com.pulumi.azurenative.containerservice.inputs.OpenShiftRouterProfileArgs;
import com.pulumi.azurenative.containerservice.inputs.PurchasePlanArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OpenShiftManagedClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final OpenShiftManagedClusterArgs Empty = new OpenShiftManagedClusterArgs();

    /**
     * Configuration of OpenShift cluster VMs.
     * 
     */
    @Import(name="agentPoolProfiles")
    private @Nullable Output<List<OpenShiftManagedClusterAgentPoolProfileArgs>> agentPoolProfiles;

    /**
     * @return Configuration of OpenShift cluster VMs.
     * 
     */
    public Optional<Output<List<OpenShiftManagedClusterAgentPoolProfileArgs>>> agentPoolProfiles() {
        return Optional.ofNullable(this.agentPoolProfiles);
    }

    /**
     * Configures OpenShift authentication.
     * 
     */
    @Import(name="authProfile")
    private @Nullable Output<OpenShiftManagedClusterAuthProfileArgs> authProfile;

    /**
     * @return Configures OpenShift authentication.
     * 
     */
    public Optional<Output<OpenShiftManagedClusterAuthProfileArgs>> authProfile() {
        return Optional.ofNullable(this.authProfile);
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Configuration for OpenShift master VMs.
     * 
     */
    @Import(name="masterPoolProfile")
    private @Nullable Output<OpenShiftManagedClusterMasterPoolProfileArgs> masterPoolProfile;

    /**
     * @return Configuration for OpenShift master VMs.
     * 
     */
    public Optional<Output<OpenShiftManagedClusterMasterPoolProfileArgs>> masterPoolProfile() {
        return Optional.ofNullable(this.masterPoolProfile);
    }

    /**
     * Configuration for OpenShift networking.
     * 
     */
    @Import(name="networkProfile")
    private @Nullable Output<NetworkProfileArgs> networkProfile;

    /**
     * @return Configuration for OpenShift networking.
     * 
     */
    public Optional<Output<NetworkProfileArgs>> networkProfile() {
        return Optional.ofNullable(this.networkProfile);
    }

    /**
     * Version of OpenShift specified when creating the cluster.
     * 
     */
    @Import(name="openShiftVersion", required=true)
    private Output<String> openShiftVersion;

    /**
     * @return Version of OpenShift specified when creating the cluster.
     * 
     */
    public Output<String> openShiftVersion() {
        return this.openShiftVersion;
    }

    /**
     * Define the resource plan as required by ARM for billing purposes
     * 
     */
    @Import(name="plan")
    private @Nullable Output<PurchasePlanArgs> plan;

    /**
     * @return Define the resource plan as required by ARM for billing purposes
     * 
     */
    public Optional<Output<PurchasePlanArgs>> plan() {
        return Optional.ofNullable(this.plan);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the OpenShift managed cluster resource.
     * 
     */
    @Import(name="resourceName")
    private @Nullable Output<String> resourceName;

    /**
     * @return The name of the OpenShift managed cluster resource.
     * 
     */
    public Optional<Output<String>> resourceName() {
        return Optional.ofNullable(this.resourceName);
    }

    /**
     * Configuration for OpenShift router(s).
     * 
     */
    @Import(name="routerProfiles")
    private @Nullable Output<List<OpenShiftRouterProfileArgs>> routerProfiles;

    /**
     * @return Configuration for OpenShift router(s).
     * 
     */
    public Optional<Output<List<OpenShiftRouterProfileArgs>>> routerProfiles() {
        return Optional.ofNullable(this.routerProfiles);
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private OpenShiftManagedClusterArgs() {}

    private OpenShiftManagedClusterArgs(OpenShiftManagedClusterArgs $) {
        this.agentPoolProfiles = $.agentPoolProfiles;
        this.authProfile = $.authProfile;
        this.location = $.location;
        this.masterPoolProfile = $.masterPoolProfile;
        this.networkProfile = $.networkProfile;
        this.openShiftVersion = $.openShiftVersion;
        this.plan = $.plan;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
        this.routerProfiles = $.routerProfiles;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpenShiftManagedClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpenShiftManagedClusterArgs $;

        public Builder() {
            $ = new OpenShiftManagedClusterArgs();
        }

        public Builder(OpenShiftManagedClusterArgs defaults) {
            $ = new OpenShiftManagedClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param agentPoolProfiles Configuration of OpenShift cluster VMs.
         * 
         * @return builder
         * 
         */
        public Builder agentPoolProfiles(@Nullable Output<List<OpenShiftManagedClusterAgentPoolProfileArgs>> agentPoolProfiles) {
            $.agentPoolProfiles = agentPoolProfiles;
            return this;
        }

        /**
         * @param agentPoolProfiles Configuration of OpenShift cluster VMs.
         * 
         * @return builder
         * 
         */
        public Builder agentPoolProfiles(List<OpenShiftManagedClusterAgentPoolProfileArgs> agentPoolProfiles) {
            return agentPoolProfiles(Output.of(agentPoolProfiles));
        }

        /**
         * @param agentPoolProfiles Configuration of OpenShift cluster VMs.
         * 
         * @return builder
         * 
         */
        public Builder agentPoolProfiles(OpenShiftManagedClusterAgentPoolProfileArgs... agentPoolProfiles) {
            return agentPoolProfiles(List.of(agentPoolProfiles));
        }

        /**
         * @param authProfile Configures OpenShift authentication.
         * 
         * @return builder
         * 
         */
        public Builder authProfile(@Nullable Output<OpenShiftManagedClusterAuthProfileArgs> authProfile) {
            $.authProfile = authProfile;
            return this;
        }

        /**
         * @param authProfile Configures OpenShift authentication.
         * 
         * @return builder
         * 
         */
        public Builder authProfile(OpenShiftManagedClusterAuthProfileArgs authProfile) {
            return authProfile(Output.of(authProfile));
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param masterPoolProfile Configuration for OpenShift master VMs.
         * 
         * @return builder
         * 
         */
        public Builder masterPoolProfile(@Nullable Output<OpenShiftManagedClusterMasterPoolProfileArgs> masterPoolProfile) {
            $.masterPoolProfile = masterPoolProfile;
            return this;
        }

        /**
         * @param masterPoolProfile Configuration for OpenShift master VMs.
         * 
         * @return builder
         * 
         */
        public Builder masterPoolProfile(OpenShiftManagedClusterMasterPoolProfileArgs masterPoolProfile) {
            return masterPoolProfile(Output.of(masterPoolProfile));
        }

        /**
         * @param networkProfile Configuration for OpenShift networking.
         * 
         * @return builder
         * 
         */
        public Builder networkProfile(@Nullable Output<NetworkProfileArgs> networkProfile) {
            $.networkProfile = networkProfile;
            return this;
        }

        /**
         * @param networkProfile Configuration for OpenShift networking.
         * 
         * @return builder
         * 
         */
        public Builder networkProfile(NetworkProfileArgs networkProfile) {
            return networkProfile(Output.of(networkProfile));
        }

        /**
         * @param openShiftVersion Version of OpenShift specified when creating the cluster.
         * 
         * @return builder
         * 
         */
        public Builder openShiftVersion(Output<String> openShiftVersion) {
            $.openShiftVersion = openShiftVersion;
            return this;
        }

        /**
         * @param openShiftVersion Version of OpenShift specified when creating the cluster.
         * 
         * @return builder
         * 
         */
        public Builder openShiftVersion(String openShiftVersion) {
            return openShiftVersion(Output.of(openShiftVersion));
        }

        /**
         * @param plan Define the resource plan as required by ARM for billing purposes
         * 
         * @return builder
         * 
         */
        public Builder plan(@Nullable Output<PurchasePlanArgs> plan) {
            $.plan = plan;
            return this;
        }

        /**
         * @param plan Define the resource plan as required by ARM for billing purposes
         * 
         * @return builder
         * 
         */
        public Builder plan(PurchasePlanArgs plan) {
            return plan(Output.of(plan));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param resourceName The name of the OpenShift managed cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(@Nullable Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName The name of the OpenShift managed cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        /**
         * @param routerProfiles Configuration for OpenShift router(s).
         * 
         * @return builder
         * 
         */
        public Builder routerProfiles(@Nullable Output<List<OpenShiftRouterProfileArgs>> routerProfiles) {
            $.routerProfiles = routerProfiles;
            return this;
        }

        /**
         * @param routerProfiles Configuration for OpenShift router(s).
         * 
         * @return builder
         * 
         */
        public Builder routerProfiles(List<OpenShiftRouterProfileArgs> routerProfiles) {
            return routerProfiles(Output.of(routerProfiles));
        }

        /**
         * @param routerProfiles Configuration for OpenShift router(s).
         * 
         * @return builder
         * 
         */
        public Builder routerProfiles(OpenShiftRouterProfileArgs... routerProfiles) {
            return routerProfiles(List.of(routerProfiles));
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public OpenShiftManagedClusterArgs build() {
            $.openShiftVersion = Objects.requireNonNull($.openShiftVersion, "expected parameter 'openShiftVersion' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
