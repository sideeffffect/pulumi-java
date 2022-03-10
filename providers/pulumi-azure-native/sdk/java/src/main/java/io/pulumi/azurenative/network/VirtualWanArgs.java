// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualWanArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualWanArgs Empty = new VirtualWanArgs();

    /**
     * True if branch to branch traffic is allowed.
     * 
     */
    @InputImport(name="allowBranchToBranchTraffic")
      private final @Nullable Input<Boolean> allowBranchToBranchTraffic;

    public Input<Boolean> getAllowBranchToBranchTraffic() {
        return this.allowBranchToBranchTraffic == null ? Input.empty() : this.allowBranchToBranchTraffic;
    }

    /**
     * True if Vnet to Vnet traffic is allowed.
     * 
     */
    @InputImport(name="allowVnetToVnetTraffic")
      private final @Nullable Input<Boolean> allowVnetToVnetTraffic;

    public Input<Boolean> getAllowVnetToVnetTraffic() {
        return this.allowVnetToVnetTraffic == null ? Input.empty() : this.allowVnetToVnetTraffic;
    }

    /**
     * Vpn encryption to be disabled or not.
     * 
     */
    @InputImport(name="disableVpnEncryption")
      private final @Nullable Input<Boolean> disableVpnEncryption;

    public Input<Boolean> getDisableVpnEncryption() {
        return this.disableVpnEncryption == null ? Input.empty() : this.disableVpnEncryption;
    }

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
     * Resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The resource group name of the VirtualWan.
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
     * The type of the VirtualWAN.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * The name of the VirtualWAN being created or updated.
     * 
     */
    @InputImport(name="virtualWANName")
      private final @Nullable Input<String> virtualWANName;

    public Input<String> getVirtualWANName() {
        return this.virtualWANName == null ? Input.empty() : this.virtualWANName;
    }

    public VirtualWanArgs(
        @Nullable Input<Boolean> allowBranchToBranchTraffic,
        @Nullable Input<Boolean> allowVnetToVnetTraffic,
        @Nullable Input<Boolean> disableVpnEncryption,
        @Nullable Input<String> id,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> type,
        @Nullable Input<String> virtualWANName) {
        this.allowBranchToBranchTraffic = allowBranchToBranchTraffic;
        this.allowVnetToVnetTraffic = allowVnetToVnetTraffic;
        this.disableVpnEncryption = disableVpnEncryption;
        this.id = id;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.type = type;
        this.virtualWANName = virtualWANName;
    }

    private VirtualWanArgs() {
        this.allowBranchToBranchTraffic = Input.empty();
        this.allowVnetToVnetTraffic = Input.empty();
        this.disableVpnEncryption = Input.empty();
        this.id = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.type = Input.empty();
        this.virtualWANName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualWanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowBranchToBranchTraffic;
        private @Nullable Input<Boolean> allowVnetToVnetTraffic;
        private @Nullable Input<Boolean> disableVpnEncryption;
        private @Nullable Input<String> id;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> type;
        private @Nullable Input<String> virtualWANName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualWanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowBranchToBranchTraffic = defaults.allowBranchToBranchTraffic;
    	      this.allowVnetToVnetTraffic = defaults.allowVnetToVnetTraffic;
    	      this.disableVpnEncryption = defaults.disableVpnEncryption;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.virtualWANName = defaults.virtualWANName;
        }

        public Builder allowBranchToBranchTraffic(@Nullable Input<Boolean> allowBranchToBranchTraffic) {
            this.allowBranchToBranchTraffic = allowBranchToBranchTraffic;
            return this;
        }

        public Builder allowBranchToBranchTraffic(@Nullable Boolean allowBranchToBranchTraffic) {
            this.allowBranchToBranchTraffic = Input.ofNullable(allowBranchToBranchTraffic);
            return this;
        }

        public Builder allowVnetToVnetTraffic(@Nullable Input<Boolean> allowVnetToVnetTraffic) {
            this.allowVnetToVnetTraffic = allowVnetToVnetTraffic;
            return this;
        }

        public Builder allowVnetToVnetTraffic(@Nullable Boolean allowVnetToVnetTraffic) {
            this.allowVnetToVnetTraffic = Input.ofNullable(allowVnetToVnetTraffic);
            return this;
        }

        public Builder disableVpnEncryption(@Nullable Input<Boolean> disableVpnEncryption) {
            this.disableVpnEncryption = disableVpnEncryption;
            return this;
        }

        public Builder disableVpnEncryption(@Nullable Boolean disableVpnEncryption) {
            this.disableVpnEncryption = Input.ofNullable(disableVpnEncryption);
            return this;
        }

        public Builder id(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Input.ofNullable(id);
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

        public Builder type(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder virtualWANName(@Nullable Input<String> virtualWANName) {
            this.virtualWANName = virtualWANName;
            return this;
        }

        public Builder virtualWANName(@Nullable String virtualWANName) {
            this.virtualWANName = Input.ofNullable(virtualWANName);
            return this;
        }
        public VirtualWanArgs build() {
            return new VirtualWanArgs(allowBranchToBranchTraffic, allowVnetToVnetTraffic, disableVpnEncryption, id, location, resourceGroupName, tags, type, virtualWANName);
        }
    }
}
