// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.tpu.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.tpu.inputs.NodeNetworkEndpointGetArgs;
import com.pulumi.gcp.tpu.inputs.NodeSchedulingConfigGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodeState extends com.pulumi.resources.ResourceArgs {

    public static final NodeState Empty = new NodeState();

    /**
     * The type of hardware accelerators associated with this node.
     * 
     */
    @Import(name="acceleratorType")
    private @Nullable Output<String> acceleratorType;

    public Optional<Output<String>> acceleratorType() {
        return Optional.ofNullable(this.acceleratorType);
    }

    /**
     * The CIDR block that the TPU node will use when selecting an IP
     * address. This CIDR block must be a /29 block; the Compute Engine
     * networks API forbids a smaller block, and using a larger block would
     * be wasteful (a node can only consume one IP address).
     * Errors will occur if the CIDR block has already been used for a
     * currently existing TPU node, the CIDR block conflicts with any
     * subnetworks in the user&#39;s provided network, or the provided network
     * is peered with another network that is using that CIDR block.
     * 
     */
    @Import(name="cidrBlock")
    private @Nullable Output<String> cidrBlock;

    public Optional<Output<String>> cidrBlock() {
        return Optional.ofNullable(this.cidrBlock);
    }

    /**
     * The user-supplied description of the TPU. Maximum of 512 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Resource labels to represent user provided metadata.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The immutable name of the TPU.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of a network to peer the TPU node to. It must be a
     * preexisting Compute Engine network inside of the project on which
     * this API has been activated. If none is provided, &#34;default&#34; will be
     * used.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * The network endpoints where TPU workers can be accessed and sent work. It is recommended that Tensorflow clients of the
     * node first reach out to the first (index 0) entry.
     * 
     */
    @Import(name="networkEndpoints")
    private @Nullable Output<List<NodeNetworkEndpointGetArgs>> networkEndpoints;

    public Optional<Output<List<NodeNetworkEndpointGetArgs>>> networkEndpoints() {
        return Optional.ofNullable(this.networkEndpoints);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Sets the scheduling options for this TPU instance.
     * Structure is documented below.
     * 
     */
    @Import(name="schedulingConfig")
    private @Nullable Output<NodeSchedulingConfigGetArgs> schedulingConfig;

    public Optional<Output<NodeSchedulingConfigGetArgs>> schedulingConfig() {
        return Optional.ofNullable(this.schedulingConfig);
    }

    /**
     * The service account used to run the tensor flow services within the node. To share resources, including Google Cloud
     * Storage data, with the Tensorflow job running in the Node, this account must have permissions to that data.
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * The version of Tensorflow running in the Node.
     * 
     */
    @Import(name="tensorflowVersion")
    private @Nullable Output<String> tensorflowVersion;

    public Optional<Output<String>> tensorflowVersion() {
        return Optional.ofNullable(this.tensorflowVersion);
    }

    /**
     * Whether the VPC peering for the node is set up through Service Networking API.
     * The VPC Peering should be set up before provisioning the node. If this field is set,
     * cidr_block field should not be specified. If the network that you want to peer the
     * TPU Node to is a Shared VPC network, the node must be created with this this field enabled.
     * 
     */
    @Import(name="useServiceNetworking")
    private @Nullable Output<Boolean> useServiceNetworking;

    public Optional<Output<Boolean>> useServiceNetworking() {
        return Optional.ofNullable(this.useServiceNetworking);
    }

    /**
     * The GCP location for the TPU. If it is not provided, the provider zone is used.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private NodeState() {}

    private NodeState(NodeState $) {
        this.acceleratorType = $.acceleratorType;
        this.cidrBlock = $.cidrBlock;
        this.description = $.description;
        this.labels = $.labels;
        this.name = $.name;
        this.network = $.network;
        this.networkEndpoints = $.networkEndpoints;
        this.project = $.project;
        this.schedulingConfig = $.schedulingConfig;
        this.serviceAccount = $.serviceAccount;
        this.tensorflowVersion = $.tensorflowVersion;
        this.useServiceNetworking = $.useServiceNetworking;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeState $;

        public Builder() {
            $ = new NodeState();
        }

        public Builder(NodeState defaults) {
            $ = new NodeState(Objects.requireNonNull(defaults));
        }

        public Builder acceleratorType(@Nullable Output<String> acceleratorType) {
            $.acceleratorType = acceleratorType;
            return this;
        }

        public Builder acceleratorType(String acceleratorType) {
            return acceleratorType(Output.of(acceleratorType));
        }

        public Builder cidrBlock(@Nullable Output<String> cidrBlock) {
            $.cidrBlock = cidrBlock;
            return this;
        }

        public Builder cidrBlock(String cidrBlock) {
            return cidrBlock(Output.of(cidrBlock));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        public Builder network(String network) {
            return network(Output.of(network));
        }

        public Builder networkEndpoints(@Nullable Output<List<NodeNetworkEndpointGetArgs>> networkEndpoints) {
            $.networkEndpoints = networkEndpoints;
            return this;
        }

        public Builder networkEndpoints(List<NodeNetworkEndpointGetArgs> networkEndpoints) {
            return networkEndpoints(Output.of(networkEndpoints));
        }

        public Builder networkEndpoints(NodeNetworkEndpointGetArgs... networkEndpoints) {
            return networkEndpoints(List.of(networkEndpoints));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder schedulingConfig(@Nullable Output<NodeSchedulingConfigGetArgs> schedulingConfig) {
            $.schedulingConfig = schedulingConfig;
            return this;
        }

        public Builder schedulingConfig(NodeSchedulingConfigGetArgs schedulingConfig) {
            return schedulingConfig(Output.of(schedulingConfig));
        }

        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        public Builder tensorflowVersion(@Nullable Output<String> tensorflowVersion) {
            $.tensorflowVersion = tensorflowVersion;
            return this;
        }

        public Builder tensorflowVersion(String tensorflowVersion) {
            return tensorflowVersion(Output.of(tensorflowVersion));
        }

        public Builder useServiceNetworking(@Nullable Output<Boolean> useServiceNetworking) {
            $.useServiceNetworking = useServiceNetworking;
            return this;
        }

        public Builder useServiceNetworking(Boolean useServiceNetworking) {
            return useServiceNetworking(Output.of(useServiceNetworking));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public NodeState build() {
            return $;
        }
    }

}
