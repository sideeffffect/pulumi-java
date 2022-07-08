// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container.v1beta1.inputs.MaxPodsConstraintArgs;
import com.pulumi.googlenative.container.v1beta1.inputs.NodeConfigArgs;
import com.pulumi.googlenative.container.v1beta1.inputs.NodeManagementArgs;
import com.pulumi.googlenative.container.v1beta1.inputs.NodeNetworkConfigArgs;
import com.pulumi.googlenative.container.v1beta1.inputs.NodePoolAutoscalingArgs;
import com.pulumi.googlenative.container.v1beta1.inputs.PlacementPolicyArgs;
import com.pulumi.googlenative.container.v1beta1.inputs.StatusConditionArgs;
import com.pulumi.googlenative.container.v1beta1.inputs.UpgradeSettingsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * NodePool contains the name and configuration for a cluster&#39;s node pool. Node pools are a set of nodes (i.e. VM&#39;s), with a common configuration and specification, under the control of the cluster master. They may have a set of Kubernetes labels applied to them, which may be used to reference them during pod scheduling. They may also be resized up or down, to accommodate the workload. These upgrade settings control the level of parallelism and the level of disruption caused by an upgrade. maxUnavailable controls the number of nodes that can be simultaneously unavailable. maxSurge controls the number of additional nodes that can be added to the node pool temporarily for the time of the upgrade to increase the number of available nodes. (maxUnavailable + maxSurge) determines the level of parallelism (how many nodes are being upgraded at the same time). Note: upgrades inevitably introduce some disruption since workloads need to be moved from old nodes to new, upgraded ones. Even if maxUnavailable=0, this holds true. (Disruption stays within the limits of PodDisruptionBudget, if it is configured.) Consider a hypothetical node pool with 5 nodes having maxSurge=2, maxUnavailable=1. This means the upgrade process upgrades 3 nodes simultaneously. It creates 2 additional (upgraded) nodes, then it brings down 3 old (not yet upgraded) nodes at the same time. This ensures that there are always at least 4 nodes available.
 * 
 */
public final class NodePoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolArgs Empty = new NodePoolArgs();

    /**
     * Autoscaler configuration for this NodePool. Autoscaler is enabled only if a valid configuration is present.
     * 
     */
    @Import(name="autoscaling")
    private @Nullable Output<NodePoolAutoscalingArgs> autoscaling;

    /**
     * @return Autoscaler configuration for this NodePool. Autoscaler is enabled only if a valid configuration is present.
     * 
     */
    public Optional<Output<NodePoolAutoscalingArgs>> autoscaling() {
        return Optional.ofNullable(this.autoscaling);
    }

    /**
     * Which conditions caused the current node pool state.
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<StatusConditionArgs>> conditions;

    /**
     * @return Which conditions caused the current node pool state.
     * 
     */
    public Optional<Output<List<StatusConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * The node configuration of the pool.
     * 
     */
    @Import(name="config")
    private @Nullable Output<NodeConfigArgs> config;

    /**
     * @return The node configuration of the pool.
     * 
     */
    public Optional<Output<NodeConfigArgs>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * The initial node count for the pool. You must ensure that your Compute Engine [resource quota](https://cloud.google.com/compute/quotas) is sufficient for this number of instances. You must also have available firewall and routes quota.
     * 
     */
    @Import(name="initialNodeCount")
    private @Nullable Output<Integer> initialNodeCount;

    /**
     * @return The initial node count for the pool. You must ensure that your Compute Engine [resource quota](https://cloud.google.com/compute/quotas) is sufficient for this number of instances. You must also have available firewall and routes quota.
     * 
     */
    public Optional<Output<Integer>> initialNodeCount() {
        return Optional.ofNullable(this.initialNodeCount);
    }

    /**
     * The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool&#39;s nodes should be located. If this value is unspecified during node pool creation, the [Cluster.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.FIELDS.locations) value will be used, instead. Warning: changing node pool locations will result in nodes being added and/or removed.
     * 
     */
    @Import(name="locations")
    private @Nullable Output<List<String>> locations;

    /**
     * @return The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool&#39;s nodes should be located. If this value is unspecified during node pool creation, the [Cluster.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.FIELDS.locations) value will be used, instead. Warning: changing node pool locations will result in nodes being added and/or removed.
     * 
     */
    public Optional<Output<List<String>>> locations() {
        return Optional.ofNullable(this.locations);
    }

    /**
     * NodeManagement configuration for this NodePool.
     * 
     */
    @Import(name="management")
    private @Nullable Output<NodeManagementArgs> management;

    /**
     * @return NodeManagement configuration for this NodePool.
     * 
     */
    public Optional<Output<NodeManagementArgs>> management() {
        return Optional.ofNullable(this.management);
    }

    /**
     * The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
     * 
     */
    @Import(name="maxPodsConstraint")
    private @Nullable Output<MaxPodsConstraintArgs> maxPodsConstraint;

    /**
     * @return The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
     * 
     */
    public Optional<Output<MaxPodsConstraintArgs>> maxPodsConstraint() {
        return Optional.ofNullable(this.maxPodsConstraint);
    }

    /**
     * The name of the node pool.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the node pool.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Networking configuration for this NodePool. If specified, it overrides the cluster-level defaults.
     * 
     */
    @Import(name="networkConfig")
    private @Nullable Output<NodeNetworkConfigArgs> networkConfig;

    /**
     * @return Networking configuration for this NodePool. If specified, it overrides the cluster-level defaults.
     * 
     */
    public Optional<Output<NodeNetworkConfigArgs>> networkConfig() {
        return Optional.ofNullable(this.networkConfig);
    }

    /**
     * Specifies the node placement policy.
     * 
     */
    @Import(name="placementPolicy")
    private @Nullable Output<PlacementPolicyArgs> placementPolicy;

    /**
     * @return Specifies the node placement policy.
     * 
     */
    public Optional<Output<PlacementPolicyArgs>> placementPolicy() {
        return Optional.ofNullable(this.placementPolicy);
    }

    /**
     * Upgrade settings control disruption and speed of the upgrade.
     * 
     */
    @Import(name="upgradeSettings")
    private @Nullable Output<UpgradeSettingsArgs> upgradeSettings;

    /**
     * @return Upgrade settings control disruption and speed of the upgrade.
     * 
     */
    public Optional<Output<UpgradeSettingsArgs>> upgradeSettings() {
        return Optional.ofNullable(this.upgradeSettings);
    }

    /**
     * The version of the Kubernetes of this node.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The version of the Kubernetes of this node.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private NodePoolArgs() {}

    private NodePoolArgs(NodePoolArgs $) {
        this.autoscaling = $.autoscaling;
        this.conditions = $.conditions;
        this.config = $.config;
        this.initialNodeCount = $.initialNodeCount;
        this.locations = $.locations;
        this.management = $.management;
        this.maxPodsConstraint = $.maxPodsConstraint;
        this.name = $.name;
        this.networkConfig = $.networkConfig;
        this.placementPolicy = $.placementPolicy;
        this.upgradeSettings = $.upgradeSettings;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolArgs $;

        public Builder() {
            $ = new NodePoolArgs();
        }

        public Builder(NodePoolArgs defaults) {
            $ = new NodePoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoscaling Autoscaler configuration for this NodePool. Autoscaler is enabled only if a valid configuration is present.
         * 
         * @return builder
         * 
         */
        public Builder autoscaling(@Nullable Output<NodePoolAutoscalingArgs> autoscaling) {
            $.autoscaling = autoscaling;
            return this;
        }

        /**
         * @param autoscaling Autoscaler configuration for this NodePool. Autoscaler is enabled only if a valid configuration is present.
         * 
         * @return builder
         * 
         */
        public Builder autoscaling(NodePoolAutoscalingArgs autoscaling) {
            return autoscaling(Output.of(autoscaling));
        }

        /**
         * @param conditions Which conditions caused the current node pool state.
         * 
         * @return builder
         * 
         */
        public Builder conditions(@Nullable Output<List<StatusConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions Which conditions caused the current node pool state.
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<StatusConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions Which conditions caused the current node pool state.
         * 
         * @return builder
         * 
         */
        public Builder conditions(StatusConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        /**
         * @param config The node configuration of the pool.
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<NodeConfigArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config The node configuration of the pool.
         * 
         * @return builder
         * 
         */
        public Builder config(NodeConfigArgs config) {
            return config(Output.of(config));
        }

        /**
         * @param initialNodeCount The initial node count for the pool. You must ensure that your Compute Engine [resource quota](https://cloud.google.com/compute/quotas) is sufficient for this number of instances. You must also have available firewall and routes quota.
         * 
         * @return builder
         * 
         */
        public Builder initialNodeCount(@Nullable Output<Integer> initialNodeCount) {
            $.initialNodeCount = initialNodeCount;
            return this;
        }

        /**
         * @param initialNodeCount The initial node count for the pool. You must ensure that your Compute Engine [resource quota](https://cloud.google.com/compute/quotas) is sufficient for this number of instances. You must also have available firewall and routes quota.
         * 
         * @return builder
         * 
         */
        public Builder initialNodeCount(Integer initialNodeCount) {
            return initialNodeCount(Output.of(initialNodeCount));
        }

        /**
         * @param locations The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool&#39;s nodes should be located. If this value is unspecified during node pool creation, the [Cluster.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.FIELDS.locations) value will be used, instead. Warning: changing node pool locations will result in nodes being added and/or removed.
         * 
         * @return builder
         * 
         */
        public Builder locations(@Nullable Output<List<String>> locations) {
            $.locations = locations;
            return this;
        }

        /**
         * @param locations The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool&#39;s nodes should be located. If this value is unspecified during node pool creation, the [Cluster.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.FIELDS.locations) value will be used, instead. Warning: changing node pool locations will result in nodes being added and/or removed.
         * 
         * @return builder
         * 
         */
        public Builder locations(List<String> locations) {
            return locations(Output.of(locations));
        }

        /**
         * @param locations The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool&#39;s nodes should be located. If this value is unspecified during node pool creation, the [Cluster.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.FIELDS.locations) value will be used, instead. Warning: changing node pool locations will result in nodes being added and/or removed.
         * 
         * @return builder
         * 
         */
        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }

        /**
         * @param management NodeManagement configuration for this NodePool.
         * 
         * @return builder
         * 
         */
        public Builder management(@Nullable Output<NodeManagementArgs> management) {
            $.management = management;
            return this;
        }

        /**
         * @param management NodeManagement configuration for this NodePool.
         * 
         * @return builder
         * 
         */
        public Builder management(NodeManagementArgs management) {
            return management(Output.of(management));
        }

        /**
         * @param maxPodsConstraint The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
         * 
         * @return builder
         * 
         */
        public Builder maxPodsConstraint(@Nullable Output<MaxPodsConstraintArgs> maxPodsConstraint) {
            $.maxPodsConstraint = maxPodsConstraint;
            return this;
        }

        /**
         * @param maxPodsConstraint The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
         * 
         * @return builder
         * 
         */
        public Builder maxPodsConstraint(MaxPodsConstraintArgs maxPodsConstraint) {
            return maxPodsConstraint(Output.of(maxPodsConstraint));
        }

        /**
         * @param name The name of the node pool.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the node pool.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkConfig Networking configuration for this NodePool. If specified, it overrides the cluster-level defaults.
         * 
         * @return builder
         * 
         */
        public Builder networkConfig(@Nullable Output<NodeNetworkConfigArgs> networkConfig) {
            $.networkConfig = networkConfig;
            return this;
        }

        /**
         * @param networkConfig Networking configuration for this NodePool. If specified, it overrides the cluster-level defaults.
         * 
         * @return builder
         * 
         */
        public Builder networkConfig(NodeNetworkConfigArgs networkConfig) {
            return networkConfig(Output.of(networkConfig));
        }

        /**
         * @param placementPolicy Specifies the node placement policy.
         * 
         * @return builder
         * 
         */
        public Builder placementPolicy(@Nullable Output<PlacementPolicyArgs> placementPolicy) {
            $.placementPolicy = placementPolicy;
            return this;
        }

        /**
         * @param placementPolicy Specifies the node placement policy.
         * 
         * @return builder
         * 
         */
        public Builder placementPolicy(PlacementPolicyArgs placementPolicy) {
            return placementPolicy(Output.of(placementPolicy));
        }

        /**
         * @param upgradeSettings Upgrade settings control disruption and speed of the upgrade.
         * 
         * @return builder
         * 
         */
        public Builder upgradeSettings(@Nullable Output<UpgradeSettingsArgs> upgradeSettings) {
            $.upgradeSettings = upgradeSettings;
            return this;
        }

        /**
         * @param upgradeSettings Upgrade settings control disruption and speed of the upgrade.
         * 
         * @return builder
         * 
         */
        public Builder upgradeSettings(UpgradeSettingsArgs upgradeSettings) {
            return upgradeSettings(Output.of(upgradeSettings));
        }

        /**
         * @param version The version of the Kubernetes of this node.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of the Kubernetes of this node.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public NodePoolArgs build() {
            return $;
        }
    }

}
