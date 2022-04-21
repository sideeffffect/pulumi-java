// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkmanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectivityTestDestinationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectivityTestDestinationGetArgs Empty = new ConnectivityTestDestinationGetArgs();

    /**
     * A Compute Engine instance URI.
     * 
     */
    @Import(name="instance")
    private @Nullable Output<String> instance;

    public Optional<Output<String>> instance() {
        return Optional.ofNullable(this.instance);
    }

    /**
     * The IP address of the endpoint, which can be an external or
     * internal IP. An IPv6 address is only allowed when the test&#39;s
     * destination is a global load balancer VIP.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * A Compute Engine network URI.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * The IP protocol port of the endpoint. Only applicable when
     * protocol is TCP or UDP.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Project ID where the endpoint is located. The Project ID can be
     * derived from the URI if you provide a VM instance or network URI.
     * The following are two cases where you must provide the project ID:
     * 1. Only the IP address is specified, and the IP address is within
     *    a GCP project. 2. When you are using Shared VPC and the IP address
     *    that you provide is from the service project. In this case, the
     *    network that the IP address resides in is defined in the host
     *    project.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private ConnectivityTestDestinationGetArgs() {}

    private ConnectivityTestDestinationGetArgs(ConnectivityTestDestinationGetArgs $) {
        this.instance = $.instance;
        this.ipAddress = $.ipAddress;
        this.network = $.network;
        this.port = $.port;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectivityTestDestinationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectivityTestDestinationGetArgs $;

        public Builder() {
            $ = new ConnectivityTestDestinationGetArgs();
        }

        public Builder(ConnectivityTestDestinationGetArgs defaults) {
            $ = new ConnectivityTestDestinationGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder instance(@Nullable Output<String> instance) {
            $.instance = instance;
            return this;
        }

        public Builder instance(String instance) {
            return instance(Output.of(instance));
        }

        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        public Builder network(String network) {
            return network(Output.of(network));
        }

        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public ConnectivityTestDestinationGetArgs build() {
            return $;
        }
    }

}
