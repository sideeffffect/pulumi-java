// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.ZoneType;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ZoneArgs extends io.pulumi.resources.ResourceArgs {

    public static final ZoneArgs Empty = new ZoneArgs();

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * A list of references to virtual networks that register hostnames in this DNS zone. This is a only when ZoneType is Private.
     * 
     */
    @InputImport(name="registrationVirtualNetworks")
      private final @Nullable Input<List<SubResourceArgs>> registrationVirtualNetworks;

    public Input<List<SubResourceArgs>> getRegistrationVirtualNetworks() {
        return this.registrationVirtualNetworks == null ? Input.empty() : this.registrationVirtualNetworks;
    }

    /**
     * A list of references to virtual networks that resolve records in this DNS zone. This is a only when ZoneType is Private.
     * 
     */
    @InputImport(name="resolutionVirtualNetworks")
      private final @Nullable Input<List<SubResourceArgs>> resolutionVirtualNetworks;

    public Input<List<SubResourceArgs>> getResolutionVirtualNetworks() {
        return this.resolutionVirtualNetworks == null ? Input.empty() : this.resolutionVirtualNetworks;
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
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The name of the DNS zone (without a terminating dot).
     * 
     */
    @InputImport(name="zoneName")
      private final @Nullable Input<String> zoneName;

    public Input<String> getZoneName() {
        return this.zoneName == null ? Input.empty() : this.zoneName;
    }

    /**
     * The type of this DNS zone (Public or Private).
     * 
     */
    @InputImport(name="zoneType")
      private final @Nullable Input<ZoneType> zoneType;

    public Input<ZoneType> getZoneType() {
        return this.zoneType == null ? Input.empty() : this.zoneType;
    }

    public ZoneArgs(
        @Nullable Input<String> location,
        @Nullable Input<List<SubResourceArgs>> registrationVirtualNetworks,
        @Nullable Input<List<SubResourceArgs>> resolutionVirtualNetworks,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> zoneName,
        @Nullable Input<ZoneType> zoneType) {
        this.location = location;
        this.registrationVirtualNetworks = registrationVirtualNetworks;
        this.resolutionVirtualNetworks = resolutionVirtualNetworks;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.zoneName = zoneName;
        this.zoneType = zoneType == null ? Input.ofNullable(io.pulumi.azurenative.network.enums.ZoneType.Public) : zoneType;
    }

    private ZoneArgs() {
        this.location = Input.empty();
        this.registrationVirtualNetworks = Input.empty();
        this.resolutionVirtualNetworks = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.zoneName = Input.empty();
        this.zoneType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZoneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;
        private @Nullable Input<List<SubResourceArgs>> registrationVirtualNetworks;
        private @Nullable Input<List<SubResourceArgs>> resolutionVirtualNetworks;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> zoneName;
        private @Nullable Input<ZoneType> zoneType;

        public Builder() {
    	      // Empty
        }

        public Builder(ZoneArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.registrationVirtualNetworks = defaults.registrationVirtualNetworks;
    	      this.resolutionVirtualNetworks = defaults.resolutionVirtualNetworks;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.zoneName = defaults.zoneName;
    	      this.zoneType = defaults.zoneType;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder registrationVirtualNetworks(@Nullable Input<List<SubResourceArgs>> registrationVirtualNetworks) {
            this.registrationVirtualNetworks = registrationVirtualNetworks;
            return this;
        }

        public Builder registrationVirtualNetworks(@Nullable List<SubResourceArgs> registrationVirtualNetworks) {
            this.registrationVirtualNetworks = Input.ofNullable(registrationVirtualNetworks);
            return this;
        }

        public Builder resolutionVirtualNetworks(@Nullable Input<List<SubResourceArgs>> resolutionVirtualNetworks) {
            this.resolutionVirtualNetworks = resolutionVirtualNetworks;
            return this;
        }

        public Builder resolutionVirtualNetworks(@Nullable List<SubResourceArgs> resolutionVirtualNetworks) {
            this.resolutionVirtualNetworks = Input.ofNullable(resolutionVirtualNetworks);
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

        public Builder zoneName(@Nullable Input<String> zoneName) {
            this.zoneName = zoneName;
            return this;
        }

        public Builder zoneName(@Nullable String zoneName) {
            this.zoneName = Input.ofNullable(zoneName);
            return this;
        }

        public Builder zoneType(@Nullable Input<ZoneType> zoneType) {
            this.zoneType = zoneType;
            return this;
        }

        public Builder zoneType(@Nullable ZoneType zoneType) {
            this.zoneType = Input.ofNullable(zoneType);
            return this;
        }
        public ZoneArgs build() {
            return new ZoneArgs(location, registrationVirtualNetworks, resolutionVirtualNetworks, resourceGroupName, tags, zoneName, zoneType);
        }
    }
}
