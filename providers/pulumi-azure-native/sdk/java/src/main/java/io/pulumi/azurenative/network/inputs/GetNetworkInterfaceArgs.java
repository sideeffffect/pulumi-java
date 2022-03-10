// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkInterfaceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNetworkInterfaceArgs Empty = new GetNetworkInterfaceArgs();

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
     * The name of the network interface.
     * 
     */
    @InputImport(name="networkInterfaceName", required=true)
      private final String networkInterfaceName;

    public String getNetworkInterfaceName() {
        return this.networkInterfaceName;
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

    public GetNetworkInterfaceArgs(
        @Nullable String expand,
        String networkInterfaceName,
        String resourceGroupName) {
        this.expand = expand;
        this.networkInterfaceName = Objects.requireNonNull(networkInterfaceName, "expected parameter 'networkInterfaceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetNetworkInterfaceArgs() {
        this.expand = null;
        this.networkInterfaceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String networkInterfaceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkInterfaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.networkInterfaceName = defaults.networkInterfaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder expand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder networkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = Objects.requireNonNull(networkInterfaceName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetNetworkInterfaceArgs build() {
            return new GetNetworkInterfaceArgs(expand, networkInterfaceName, resourceGroupName);
        }
    }
}
