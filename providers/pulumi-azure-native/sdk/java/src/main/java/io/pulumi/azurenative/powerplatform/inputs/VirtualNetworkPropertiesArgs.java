// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerplatform.inputs;

import io.pulumi.azurenative.powerplatform.inputs.SubnetPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings concerning the virtual network.
 * 
 */
public final class VirtualNetworkPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkPropertiesArgs Empty = new VirtualNetworkPropertiesArgs();

    /**
     * Uri of the virtual network.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Properties of a subnet.
     * 
     */
    @InputImport(name="subnet")
      private final @Nullable Input<SubnetPropertiesArgs> subnet;

    public Input<SubnetPropertiesArgs> getSubnet() {
        return this.subnet == null ? Input.empty() : this.subnet;
    }

    public VirtualNetworkPropertiesArgs(
        @Nullable Input<String> id,
        @Nullable Input<SubnetPropertiesArgs> subnet) {
        this.id = id;
        this.subnet = subnet;
    }

    private VirtualNetworkPropertiesArgs() {
        this.id = Input.empty();
        this.subnet = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<SubnetPropertiesArgs> subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.subnet = defaults.subnet;
        }

        public Builder id(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder subnet(@Nullable Input<SubnetPropertiesArgs> subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder subnet(@Nullable SubnetPropertiesArgs subnet) {
            this.subnet = Input.ofNullable(subnet);
            return this;
        }
        public VirtualNetworkPropertiesArgs build() {
            return new VirtualNetworkPropertiesArgs(id, subnet);
        }
    }
}
