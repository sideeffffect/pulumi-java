// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.groundstation.inputs;

import com.pulumi.awsnative.groundstation.inputs.DataflowEndpointGroupSocketAddressArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataflowEndpointGroupDataflowEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataflowEndpointGroupDataflowEndpointArgs Empty = new DataflowEndpointGroupDataflowEndpointArgs();

    @Import(name="address")
    private @Nullable Output<DataflowEndpointGroupSocketAddressArgs> address;

    public Optional<Output<DataflowEndpointGroupSocketAddressArgs>> address() {
        return Optional.ofNullable(this.address);
    }

    @Import(name="mtu")
    private @Nullable Output<Integer> mtu;

    public Optional<Output<Integer>> mtu() {
        return Optional.ofNullable(this.mtu);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private DataflowEndpointGroupDataflowEndpointArgs() {}

    private DataflowEndpointGroupDataflowEndpointArgs(DataflowEndpointGroupDataflowEndpointArgs $) {
        this.address = $.address;
        this.mtu = $.mtu;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataflowEndpointGroupDataflowEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataflowEndpointGroupDataflowEndpointArgs $;

        public Builder() {
            $ = new DataflowEndpointGroupDataflowEndpointArgs();
        }

        public Builder(DataflowEndpointGroupDataflowEndpointArgs defaults) {
            $ = new DataflowEndpointGroupDataflowEndpointArgs(Objects.requireNonNull(defaults));
        }

        public Builder address(@Nullable Output<DataflowEndpointGroupSocketAddressArgs> address) {
            $.address = address;
            return this;
        }

        public Builder address(DataflowEndpointGroupSocketAddressArgs address) {
            return address(Output.of(address));
        }

        public Builder mtu(@Nullable Output<Integer> mtu) {
            $.mtu = mtu;
            return this;
        }

        public Builder mtu(Integer mtu) {
            return mtu(Output.of(mtu));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public DataflowEndpointGroupDataflowEndpointArgs build() {
            return $;
        }
    }

}
