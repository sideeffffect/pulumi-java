// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.apimanagement.inputs.ResourceLocationDataContractArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayArgs Empty = new GatewayArgs();

    /**
     * Gateway description
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Gateway entity identifier. Must be unique in the current API Management service instance. Must not have value 'managed'
     * 
     */
    @InputImport(name="gatewayId")
      private final @Nullable Input<String> gatewayId;

    public Input<String> getGatewayId() {
        return this.gatewayId == null ? Input.empty() : this.gatewayId;
    }

    /**
     * Gateway location.
     * 
     */
    @InputImport(name="locationData")
      private final @Nullable Input<ResourceLocationDataContractArgs> locationData;

    public Input<ResourceLocationDataContractArgs> getLocationData() {
        return this.locationData == null ? Input.empty() : this.locationData;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @InputImport(name="serviceName", required=true)
      private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    public GatewayArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> gatewayId,
        @Nullable Input<ResourceLocationDataContractArgs> locationData,
        Input<String> resourceGroupName,
        Input<String> serviceName) {
        this.description = description;
        this.gatewayId = gatewayId;
        this.locationData = locationData;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GatewayArgs() {
        this.description = Input.empty();
        this.gatewayId = Input.empty();
        this.locationData = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> gatewayId;
        private @Nullable Input<ResourceLocationDataContractArgs> locationData;
        private Input<String> resourceGroupName;
        private Input<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.gatewayId = defaults.gatewayId;
    	      this.locationData = defaults.locationData;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder gatewayId(@Nullable Input<String> gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        public Builder gatewayId(@Nullable String gatewayId) {
            this.gatewayId = Input.ofNullable(gatewayId);
            return this;
        }

        public Builder locationData(@Nullable Input<ResourceLocationDataContractArgs> locationData) {
            this.locationData = locationData;
            return this;
        }

        public Builder locationData(@Nullable ResourceLocationDataContractArgs locationData) {
            this.locationData = Input.ofNullable(locationData);
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

        public Builder serviceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder serviceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public GatewayArgs build() {
            return new GatewayArgs(description, gatewayId, locationData, resourceGroupName, serviceName);
        }
    }
}
