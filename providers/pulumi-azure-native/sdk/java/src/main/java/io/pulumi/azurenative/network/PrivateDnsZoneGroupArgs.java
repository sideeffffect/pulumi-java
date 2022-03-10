// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.PrivateDnsZoneConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateDnsZoneGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateDnsZoneGroupArgs Empty = new PrivateDnsZoneGroupArgs();

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
     * Name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A collection of private dns zone configurations of the private dns zone group.
     * 
     */
    @InputImport(name="privateDnsZoneConfigs")
      private final @Nullable Input<List<PrivateDnsZoneConfigArgs>> privateDnsZoneConfigs;

    public Input<List<PrivateDnsZoneConfigArgs>> getPrivateDnsZoneConfigs() {
        return this.privateDnsZoneConfigs == null ? Input.empty() : this.privateDnsZoneConfigs;
    }

    /**
     * The name of the private dns zone group.
     * 
     */
    @InputImport(name="privateDnsZoneGroupName")
      private final @Nullable Input<String> privateDnsZoneGroupName;

    public Input<String> getPrivateDnsZoneGroupName() {
        return this.privateDnsZoneGroupName == null ? Input.empty() : this.privateDnsZoneGroupName;
    }

    /**
     * The name of the private endpoint.
     * 
     */
    @InputImport(name="privateEndpointName", required=true)
      private final Input<String> privateEndpointName;

    public Input<String> getPrivateEndpointName() {
        return this.privateEndpointName;
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

    public PrivateDnsZoneGroupArgs(
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        @Nullable Input<List<PrivateDnsZoneConfigArgs>> privateDnsZoneConfigs,
        @Nullable Input<String> privateDnsZoneGroupName,
        Input<String> privateEndpointName,
        Input<String> resourceGroupName) {
        this.id = id;
        this.name = name;
        this.privateDnsZoneConfigs = privateDnsZoneConfigs;
        this.privateDnsZoneGroupName = privateDnsZoneGroupName;
        this.privateEndpointName = Objects.requireNonNull(privateEndpointName, "expected parameter 'privateEndpointName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private PrivateDnsZoneGroupArgs() {
        this.id = Input.empty();
        this.name = Input.empty();
        this.privateDnsZoneConfigs = Input.empty();
        this.privateDnsZoneGroupName = Input.empty();
        this.privateEndpointName = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateDnsZoneGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private @Nullable Input<List<PrivateDnsZoneConfigArgs>> privateDnsZoneConfigs;
        private @Nullable Input<String> privateDnsZoneGroupName;
        private Input<String> privateEndpointName;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateDnsZoneGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateDnsZoneConfigs = defaults.privateDnsZoneConfigs;
    	      this.privateDnsZoneGroupName = defaults.privateDnsZoneGroupName;
    	      this.privateEndpointName = defaults.privateEndpointName;
    	      this.resourceGroupName = defaults.resourceGroupName;
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

        public Builder privateDnsZoneConfigs(@Nullable Input<List<PrivateDnsZoneConfigArgs>> privateDnsZoneConfigs) {
            this.privateDnsZoneConfigs = privateDnsZoneConfigs;
            return this;
        }

        public Builder privateDnsZoneConfigs(@Nullable List<PrivateDnsZoneConfigArgs> privateDnsZoneConfigs) {
            this.privateDnsZoneConfigs = Input.ofNullable(privateDnsZoneConfigs);
            return this;
        }

        public Builder privateDnsZoneGroupName(@Nullable Input<String> privateDnsZoneGroupName) {
            this.privateDnsZoneGroupName = privateDnsZoneGroupName;
            return this;
        }

        public Builder privateDnsZoneGroupName(@Nullable String privateDnsZoneGroupName) {
            this.privateDnsZoneGroupName = Input.ofNullable(privateDnsZoneGroupName);
            return this;
        }

        public Builder privateEndpointName(Input<String> privateEndpointName) {
            this.privateEndpointName = Objects.requireNonNull(privateEndpointName);
            return this;
        }

        public Builder privateEndpointName(String privateEndpointName) {
            this.privateEndpointName = Input.of(Objects.requireNonNull(privateEndpointName));
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
        public PrivateDnsZoneGroupArgs build() {
            return new PrivateDnsZoneGroupArgs(id, name, privateDnsZoneConfigs, privateDnsZoneGroupName, privateEndpointName, resourceGroupName);
        }
    }
}
