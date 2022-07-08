// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.tpu.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.tpu.v1.enums.NodeHealth;
import com.pulumi.googlenative.tpu.v1.inputs.SchedulingConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodeArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeArgs Empty = new NodeArgs();

    /**
     * The type of hardware accelerators associated with this node.
     * 
     */
    @Import(name="acceleratorType", required=true)
    private Output<String> acceleratorType;

    /**
     * @return The type of hardware accelerators associated with this node.
     * 
     */
    public Output<String> acceleratorType() {
        return this.acceleratorType;
    }

    /**
     * The CIDR block that the TPU node will use when selecting an IP address. This CIDR block must be a /29 block; the Compute Engine networks API forbids a smaller block, and using a larger block would be wasteful (a node can only consume one IP address). Errors will occur if the CIDR block has already been used for a currently existing TPU node, the CIDR block conflicts with any subnetworks in the user&#39;s provided network, or the provided network is peered with another network that is using that CIDR block.
     * 
     */
    @Import(name="cidrBlock")
    private @Nullable Output<String> cidrBlock;

    /**
     * @return The CIDR block that the TPU node will use when selecting an IP address. This CIDR block must be a /29 block; the Compute Engine networks API forbids a smaller block, and using a larger block would be wasteful (a node can only consume one IP address). Errors will occur if the CIDR block has already been used for a currently existing TPU node, the CIDR block conflicts with any subnetworks in the user&#39;s provided network, or the provided network is peered with another network that is using that CIDR block.
     * 
     */
    public Optional<Output<String>> cidrBlock() {
        return Optional.ofNullable(this.cidrBlock);
    }

    /**
     * The user-supplied description of the TPU. Maximum of 512 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The user-supplied description of the TPU. Maximum of 512 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The health status of the TPU node.
     * 
     */
    @Import(name="health")
    private @Nullable Output<NodeHealth> health;

    /**
     * @return The health status of the TPU node.
     * 
     */
    public Optional<Output<NodeHealth>> health() {
        return Optional.ofNullable(this.health);
    }

    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Resource labels to represent user-provided metadata.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of a network they wish to peer the TPU node to. It must be a preexisting Compute Engine network inside of the project on which this API has been activated. If none is provided, &#34;default&#34; will be used.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return The name of a network they wish to peer the TPU node to. It must be a preexisting Compute Engine network inside of the project on which this API has been activated. If none is provided, &#34;default&#34; will be used.
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * The unqualified resource name.
     * 
     */
    @Import(name="nodeId")
    private @Nullable Output<String> nodeId;

    /**
     * @return The unqualified resource name.
     * 
     */
    public Optional<Output<String>> nodeId() {
        return Optional.ofNullable(this.nodeId);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The scheduling options for this node.
     * 
     */
    @Import(name="schedulingConfig")
    private @Nullable Output<SchedulingConfigArgs> schedulingConfig;

    /**
     * @return The scheduling options for this node.
     * 
     */
    public Optional<Output<SchedulingConfigArgs>> schedulingConfig() {
        return Optional.ofNullable(this.schedulingConfig);
    }

    /**
     * The version of Tensorflow running in the Node.
     * 
     */
    @Import(name="tensorflowVersion", required=true)
    private Output<String> tensorflowVersion;

    /**
     * @return The version of Tensorflow running in the Node.
     * 
     */
    public Output<String> tensorflowVersion() {
        return this.tensorflowVersion;
    }

    /**
     * Whether the VPC peering for the node is set up through Service Networking API. The VPC Peering should be set up before provisioning the node. If this field is set, cidr_block field should not be specified. If the network, that you want to peer the TPU Node to, is Shared VPC networks, the node must be created with this this field enabled.
     * 
     */
    @Import(name="useServiceNetworking")
    private @Nullable Output<Boolean> useServiceNetworking;

    /**
     * @return Whether the VPC peering for the node is set up through Service Networking API. The VPC Peering should be set up before provisioning the node. If this field is set, cidr_block field should not be specified. If the network, that you want to peer the TPU Node to, is Shared VPC networks, the node must be created with this this field enabled.
     * 
     */
    public Optional<Output<Boolean>> useServiceNetworking() {
        return Optional.ofNullable(this.useServiceNetworking);
    }

    private NodeArgs() {}

    private NodeArgs(NodeArgs $) {
        this.acceleratorType = $.acceleratorType;
        this.cidrBlock = $.cidrBlock;
        this.description = $.description;
        this.health = $.health;
        this.labels = $.labels;
        this.location = $.location;
        this.network = $.network;
        this.nodeId = $.nodeId;
        this.project = $.project;
        this.schedulingConfig = $.schedulingConfig;
        this.tensorflowVersion = $.tensorflowVersion;
        this.useServiceNetworking = $.useServiceNetworking;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeArgs $;

        public Builder() {
            $ = new NodeArgs();
        }

        public Builder(NodeArgs defaults) {
            $ = new NodeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratorType The type of hardware accelerators associated with this node.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorType(Output<String> acceleratorType) {
            $.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * @param acceleratorType The type of hardware accelerators associated with this node.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorType(String acceleratorType) {
            return acceleratorType(Output.of(acceleratorType));
        }

        /**
         * @param cidrBlock The CIDR block that the TPU node will use when selecting an IP address. This CIDR block must be a /29 block; the Compute Engine networks API forbids a smaller block, and using a larger block would be wasteful (a node can only consume one IP address). Errors will occur if the CIDR block has already been used for a currently existing TPU node, the CIDR block conflicts with any subnetworks in the user&#39;s provided network, or the provided network is peered with another network that is using that CIDR block.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(@Nullable Output<String> cidrBlock) {
            $.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * @param cidrBlock The CIDR block that the TPU node will use when selecting an IP address. This CIDR block must be a /29 block; the Compute Engine networks API forbids a smaller block, and using a larger block would be wasteful (a node can only consume one IP address). Errors will occur if the CIDR block has already been used for a currently existing TPU node, the CIDR block conflicts with any subnetworks in the user&#39;s provided network, or the provided network is peered with another network that is using that CIDR block.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(String cidrBlock) {
            return cidrBlock(Output.of(cidrBlock));
        }

        /**
         * @param description The user-supplied description of the TPU. Maximum of 512 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The user-supplied description of the TPU. Maximum of 512 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param health The health status of the TPU node.
         * 
         * @return builder
         * 
         */
        public Builder health(@Nullable Output<NodeHealth> health) {
            $.health = health;
            return this;
        }

        /**
         * @param health The health status of the TPU node.
         * 
         * @return builder
         * 
         */
        public Builder health(NodeHealth health) {
            return health(Output.of(health));
        }

        /**
         * @param labels Resource labels to represent user-provided metadata.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Resource labels to represent user-provided metadata.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param network The name of a network they wish to peer the TPU node to. It must be a preexisting Compute Engine network inside of the project on which this API has been activated. If none is provided, &#34;default&#34; will be used.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The name of a network they wish to peer the TPU node to. It must be a preexisting Compute Engine network inside of the project on which this API has been activated. If none is provided, &#34;default&#34; will be used.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param nodeId The unqualified resource name.
         * 
         * @return builder
         * 
         */
        public Builder nodeId(@Nullable Output<String> nodeId) {
            $.nodeId = nodeId;
            return this;
        }

        /**
         * @param nodeId The unqualified resource name.
         * 
         * @return builder
         * 
         */
        public Builder nodeId(String nodeId) {
            return nodeId(Output.of(nodeId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param schedulingConfig The scheduling options for this node.
         * 
         * @return builder
         * 
         */
        public Builder schedulingConfig(@Nullable Output<SchedulingConfigArgs> schedulingConfig) {
            $.schedulingConfig = schedulingConfig;
            return this;
        }

        /**
         * @param schedulingConfig The scheduling options for this node.
         * 
         * @return builder
         * 
         */
        public Builder schedulingConfig(SchedulingConfigArgs schedulingConfig) {
            return schedulingConfig(Output.of(schedulingConfig));
        }

        /**
         * @param tensorflowVersion The version of Tensorflow running in the Node.
         * 
         * @return builder
         * 
         */
        public Builder tensorflowVersion(Output<String> tensorflowVersion) {
            $.tensorflowVersion = tensorflowVersion;
            return this;
        }

        /**
         * @param tensorflowVersion The version of Tensorflow running in the Node.
         * 
         * @return builder
         * 
         */
        public Builder tensorflowVersion(String tensorflowVersion) {
            return tensorflowVersion(Output.of(tensorflowVersion));
        }

        /**
         * @param useServiceNetworking Whether the VPC peering for the node is set up through Service Networking API. The VPC Peering should be set up before provisioning the node. If this field is set, cidr_block field should not be specified. If the network, that you want to peer the TPU Node to, is Shared VPC networks, the node must be created with this this field enabled.
         * 
         * @return builder
         * 
         */
        public Builder useServiceNetworking(@Nullable Output<Boolean> useServiceNetworking) {
            $.useServiceNetworking = useServiceNetworking;
            return this;
        }

        /**
         * @param useServiceNetworking Whether the VPC peering for the node is set up through Service Networking API. The VPC Peering should be set up before provisioning the node. If this field is set, cidr_block field should not be specified. If the network, that you want to peer the TPU Node to, is Shared VPC networks, the node must be created with this this field enabled.
         * 
         * @return builder
         * 
         */
        public Builder useServiceNetworking(Boolean useServiceNetworking) {
            return useServiceNetworking(Output.of(useServiceNetworking));
        }

        public NodeArgs build() {
            $.acceleratorType = Objects.requireNonNull($.acceleratorType, "expected parameter 'acceleratorType' to be non-null");
            $.tensorflowVersion = Objects.requireNonNull($.tensorflowVersion, "expected parameter 'tensorflowVersion' to be non-null");
            return $;
        }
    }

}
