// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere;

import io.pulumi.azurenative.connectedvmwarevsphere.inputs.ExtendedLocationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HostArgs extends io.pulumi.resources.ResourceArgs {

    public static final HostArgs Empty = new HostArgs();

    /**
     * Gets or sets the extended location.
     * 
     */
    @InputImport(name="extendedLocation")
      private final @Nullable Input<ExtendedLocationArgs> extendedLocation;

    public Input<ExtendedLocationArgs> getExtendedLocation() {
        return this.extendedLocation == null ? Input.empty() : this.extendedLocation;
    }

    /**
     * Name of the host.
     * 
     */
    @InputImport(name="hostName")
      private final @Nullable Input<String> hostName;

    public Input<String> getHostName() {
        return this.hostName == null ? Input.empty() : this.hostName;
    }

    /**
     * Gets or sets the inventory Item ID for the host.
     * 
     */
    @InputImport(name="inventoryItemId")
      private final @Nullable Input<String> inventoryItemId;

    public Input<String> getInventoryItemId() {
        return this.inventoryItemId == null ? Input.empty() : this.inventoryItemId;
    }

    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Gets or sets the location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Gets or sets the vCenter MoRef (Managed Object Reference) ID for the host.
     * 
     */
    @InputImport(name="moRefId")
      private final @Nullable Input<String> moRefId;

    public Input<String> getMoRefId() {
        return this.moRefId == null ? Input.empty() : this.moRefId;
    }

    /**
     * The Resource Group Name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets the Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Gets or sets the ARM Id of the vCenter resource in which this host resides.
     * 
     */
    @InputImport(name="vCenterId")
      private final @Nullable Input<String> vCenterId;

    public Input<String> getVCenterId() {
        return this.vCenterId == null ? Input.empty() : this.vCenterId;
    }

    public HostArgs(
        @Nullable Input<ExtendedLocationArgs> extendedLocation,
        @Nullable Input<String> hostName,
        @Nullable Input<String> inventoryItemId,
        @Nullable Input<String> kind,
        @Nullable Input<String> location,
        @Nullable Input<String> moRefId,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> vCenterId) {
        this.extendedLocation = extendedLocation;
        this.hostName = hostName;
        this.inventoryItemId = inventoryItemId;
        this.kind = kind;
        this.location = location;
        this.moRefId = moRefId;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.vCenterId = vCenterId;
    }

    private HostArgs() {
        this.extendedLocation = Input.empty();
        this.hostName = Input.empty();
        this.inventoryItemId = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.moRefId = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.vCenterId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ExtendedLocationArgs> extendedLocation;
        private @Nullable Input<String> hostName;
        private @Nullable Input<String> inventoryItemId;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> location;
        private @Nullable Input<String> moRefId;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> vCenterId;

        public Builder() {
    	      // Empty
        }

        public Builder(HostArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.hostName = defaults.hostName;
    	      this.inventoryItemId = defaults.inventoryItemId;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.moRefId = defaults.moRefId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.vCenterId = defaults.vCenterId;
        }

        public Builder extendedLocation(@Nullable Input<ExtendedLocationArgs> extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder extendedLocation(@Nullable ExtendedLocationArgs extendedLocation) {
            this.extendedLocation = Input.ofNullable(extendedLocation);
            return this;
        }

        public Builder hostName(@Nullable Input<String> hostName) {
            this.hostName = hostName;
            return this;
        }

        public Builder hostName(@Nullable String hostName) {
            this.hostName = Input.ofNullable(hostName);
            return this;
        }

        public Builder inventoryItemId(@Nullable Input<String> inventoryItemId) {
            this.inventoryItemId = inventoryItemId;
            return this;
        }

        public Builder inventoryItemId(@Nullable String inventoryItemId) {
            this.inventoryItemId = Input.ofNullable(inventoryItemId);
            return this;
        }

        public Builder kind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder moRefId(@Nullable Input<String> moRefId) {
            this.moRefId = moRefId;
            return this;
        }

        public Builder moRefId(@Nullable String moRefId) {
            this.moRefId = Input.ofNullable(moRefId);
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

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder vCenterId(@Nullable Input<String> vCenterId) {
            this.vCenterId = vCenterId;
            return this;
        }

        public Builder vCenterId(@Nullable String vCenterId) {
            this.vCenterId = Input.ofNullable(vCenterId);
            return this;
        }
        public HostArgs build() {
            return new HostArgs(extendedLocation, hostName, inventoryItemId, kind, location, moRefId, resourceGroupName, tags, vCenterId);
        }
    }
}
