// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.memorydb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterEndpointArgs extends ResourceArgs {

    public static final ClusterEndpointArgs Empty = new ClusterEndpointArgs();

    /**
     * The DNS address of the primary read-write node.
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return The DNS address of the primary read-write node.
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * The port number that the engine is listening on.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port number that the engine is listening on.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    private ClusterEndpointArgs() {}

    private ClusterEndpointArgs(ClusterEndpointArgs $) {
        this.address = $.address;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterEndpointArgs $;

        public Builder() {
            $ = new ClusterEndpointArgs();
        }

        public Builder(ClusterEndpointArgs defaults) {
            $ = new ClusterEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The DNS address of the primary read-write node.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The DNS address of the primary read-write node.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param port The port number that the engine is listening on.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number that the engine is listening on.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public ClusterEndpointArgs build() {
            return $;
        }
    }

}
