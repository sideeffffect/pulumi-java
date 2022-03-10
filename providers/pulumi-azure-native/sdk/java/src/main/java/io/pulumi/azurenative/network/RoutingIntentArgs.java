// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.RoutingPolicyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RoutingIntentArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoutingIntentArgs Empty = new RoutingIntentArgs();

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The resource group name of the RoutingIntent.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the per VirtualHub singleton Routing Intent resource.
     * 
     */
    @InputImport(name="routingIntentName")
      private final @Nullable Input<String> routingIntentName;

    public Input<String> getRoutingIntentName() {
        return this.routingIntentName == null ? Input.empty() : this.routingIntentName;
    }

    /**
     * List of routing policies.
     * 
     */
    @InputImport(name="routingPolicies")
      private final @Nullable Input<List<RoutingPolicyArgs>> routingPolicies;

    public Input<List<RoutingPolicyArgs>> getRoutingPolicies() {
        return this.routingPolicies == null ? Input.empty() : this.routingPolicies;
    }

    /**
     * The name of the VirtualHub.
     * 
     */
    @InputImport(name="virtualHubName", required=true)
      private final Input<String> virtualHubName;

    public Input<String> getVirtualHubName() {
        return this.virtualHubName;
    }

    public RoutingIntentArgs(
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        Input<String> resourceGroupName,
        @Nullable Input<String> routingIntentName,
        @Nullable Input<List<RoutingPolicyArgs>> routingPolicies,
        Input<String> virtualHubName) {
        this.id = id;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.routingIntentName = routingIntentName;
        this.routingPolicies = routingPolicies;
        this.virtualHubName = Objects.requireNonNull(virtualHubName, "expected parameter 'virtualHubName' to be non-null");
    }

    private RoutingIntentArgs() {
        this.id = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.routingIntentName = Input.empty();
        this.routingPolicies = Input.empty();
        this.virtualHubName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingIntentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> routingIntentName;
        private @Nullable Input<List<RoutingPolicyArgs>> routingPolicies;
        private Input<String> virtualHubName;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingIntentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.routingIntentName = defaults.routingIntentName;
    	      this.routingPolicies = defaults.routingPolicies;
    	      this.virtualHubName = defaults.virtualHubName;
        }

        public Builder id(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
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

        public Builder routingIntentName(@Nullable Input<String> routingIntentName) {
            this.routingIntentName = routingIntentName;
            return this;
        }

        public Builder routingIntentName(@Nullable String routingIntentName) {
            this.routingIntentName = Input.ofNullable(routingIntentName);
            return this;
        }

        public Builder routingPolicies(@Nullable Input<List<RoutingPolicyArgs>> routingPolicies) {
            this.routingPolicies = routingPolicies;
            return this;
        }

        public Builder routingPolicies(@Nullable List<RoutingPolicyArgs> routingPolicies) {
            this.routingPolicies = Input.ofNullable(routingPolicies);
            return this;
        }

        public Builder virtualHubName(Input<String> virtualHubName) {
            this.virtualHubName = Objects.requireNonNull(virtualHubName);
            return this;
        }

        public Builder virtualHubName(String virtualHubName) {
            this.virtualHubName = Input.of(Objects.requireNonNull(virtualHubName));
            return this;
        }
        public RoutingIntentArgs build() {
            return new RoutingIntentArgs(id, name, resourceGroupName, routingIntentName, routingPolicies, virtualHubName);
        }
    }
}
