// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.SubnetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IP configuration profile child resource.
 * 
 */
public final class IPConfigurationProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final IPConfigurationProfileArgs Empty = new IPConfigurationProfileArgs();

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The reference to the subnet resource to create a container network interface ip configuration.
     * 
     */
    @Import(name="subnet")
    private @Nullable Output<SubnetArgs> subnet;

    public Optional<Output<SubnetArgs>> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    private IPConfigurationProfileArgs() {}

    private IPConfigurationProfileArgs(IPConfigurationProfileArgs $) {
        this.id = $.id;
        this.name = $.name;
        this.subnet = $.subnet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IPConfigurationProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IPConfigurationProfileArgs $;

        public Builder() {
            $ = new IPConfigurationProfileArgs();
        }

        public Builder(IPConfigurationProfileArgs defaults) {
            $ = new IPConfigurationProfileArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder subnet(@Nullable Output<SubnetArgs> subnet) {
            $.subnet = subnet;
            return this;
        }

        public Builder subnet(SubnetArgs subnet) {
            return subnet(Output.of(subnet));
        }

        public IPConfigurationProfileArgs build() {
            return $;
        }
    }

}
