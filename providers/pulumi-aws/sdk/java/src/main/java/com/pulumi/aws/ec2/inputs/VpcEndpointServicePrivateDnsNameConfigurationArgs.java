// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcEndpointServicePrivateDnsNameConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpcEndpointServicePrivateDnsNameConfigurationArgs Empty = new VpcEndpointServicePrivateDnsNameConfigurationArgs();

    /**
     * Name of the record subdomain the service provider needs to create.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Verification state of the VPC endpoint service. Consumers of the endpoint service can use the private name only when the state is `verified`.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Endpoint service verification type, for example `TXT`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Value the service provider adds to the private DNS name domain record before verification.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private VpcEndpointServicePrivateDnsNameConfigurationArgs() {}

    private VpcEndpointServicePrivateDnsNameConfigurationArgs(VpcEndpointServicePrivateDnsNameConfigurationArgs $) {
        this.name = $.name;
        this.state = $.state;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcEndpointServicePrivateDnsNameConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcEndpointServicePrivateDnsNameConfigurationArgs $;

        public Builder() {
            $ = new VpcEndpointServicePrivateDnsNameConfigurationArgs();
        }

        public Builder(VpcEndpointServicePrivateDnsNameConfigurationArgs defaults) {
            $ = new VpcEndpointServicePrivateDnsNameConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        public Builder state(String state) {
            return state(Output.of(state));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public VpcEndpointServicePrivateDnsNameConfigurationArgs build() {
            return $;
        }
    }

}
