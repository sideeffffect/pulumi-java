// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.tpu.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodeNetworkEndpointArgs extends ResourceArgs {

    public static final NodeNetworkEndpointArgs Empty = new NodeNetworkEndpointArgs();

    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    @Import(name="port")
    private @Nullable Output<Integer> port;

    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    private NodeNetworkEndpointArgs() {}

    private NodeNetworkEndpointArgs(NodeNetworkEndpointArgs $) {
        this.ipAddress = $.ipAddress;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeNetworkEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeNetworkEndpointArgs $;

        public Builder() {
            $ = new NodeNetworkEndpointArgs();
        }

        public Builder(NodeNetworkEndpointArgs defaults) {
            $ = new NodeNetworkEndpointArgs(Objects.requireNonNull(defaults));
        }

        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public NodeNetworkEndpointArgs build() {
            return $;
        }
    }

}
