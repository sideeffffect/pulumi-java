// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 *  The remote virtual network should be in the same region. See here to learn more (https://docs.microsoft.com/en-us/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering).
 * 
 */
public final class VirtualNetworkPeeringPropertiesFormatRemoteVirtualNetworkArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkPeeringPropertiesFormatRemoteVirtualNetworkArgs Empty = new VirtualNetworkPeeringPropertiesFormatRemoteVirtualNetworkArgs();

    /**
     * The Id of the remote virtual network.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    public VirtualNetworkPeeringPropertiesFormatRemoteVirtualNetworkArgs(@Nullable Input<String> id) {
        this.id = id;
    }

    private VirtualNetworkPeeringPropertiesFormatRemoteVirtualNetworkArgs() {
        this.id = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkPeeringPropertiesFormatRemoteVirtualNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkPeeringPropertiesFormatRemoteVirtualNetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }
        public VirtualNetworkPeeringPropertiesFormatRemoteVirtualNetworkArgs build() {
            return new VirtualNetworkPeeringPropertiesFormatRemoteVirtualNetworkArgs(id);
        }
    }
}
