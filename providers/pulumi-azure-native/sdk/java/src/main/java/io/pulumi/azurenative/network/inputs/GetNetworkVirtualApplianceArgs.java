// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkVirtualApplianceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNetworkVirtualApplianceArgs Empty = new GetNetworkVirtualApplianceArgs();

    /**
     * Expands referenced resources.
     * 
     */
    @InputImport(name="expand")
      private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * The name of Network Virtual Appliance.
     * 
     */
    @InputImport(name="networkVirtualApplianceName", required=true)
      private final String networkVirtualApplianceName;

    public String getNetworkVirtualApplianceName() {
        return this.networkVirtualApplianceName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetNetworkVirtualApplianceArgs(
        @Nullable String expand,
        String networkVirtualApplianceName,
        String resourceGroupName) {
        this.expand = expand;
        this.networkVirtualApplianceName = Objects.requireNonNull(networkVirtualApplianceName, "expected parameter 'networkVirtualApplianceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetNetworkVirtualApplianceArgs() {
        this.expand = null;
        this.networkVirtualApplianceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkVirtualApplianceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String networkVirtualApplianceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkVirtualApplianceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.networkVirtualApplianceName = defaults.networkVirtualApplianceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder expand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder networkVirtualApplianceName(String networkVirtualApplianceName) {
            this.networkVirtualApplianceName = Objects.requireNonNull(networkVirtualApplianceName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetNetworkVirtualApplianceArgs build() {
            return new GetNetworkVirtualApplianceArgs(expand, networkVirtualApplianceName, resourceGroupName);
        }
    }
}
