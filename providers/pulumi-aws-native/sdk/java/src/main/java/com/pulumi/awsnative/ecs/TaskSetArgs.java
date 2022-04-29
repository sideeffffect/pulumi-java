// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs;

import com.pulumi.awsnative.ecs.enums.TaskSetLaunchType;
import com.pulumi.awsnative.ecs.inputs.TaskSetLoadBalancerArgs;
import com.pulumi.awsnative.ecs.inputs.TaskSetNetworkConfigurationArgs;
import com.pulumi.awsnative.ecs.inputs.TaskSetScaleArgs;
import com.pulumi.awsnative.ecs.inputs.TaskSetServiceRegistryArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskSetArgs extends ResourceArgs {

    public static final TaskSetArgs Empty = new TaskSetArgs();

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to create the task set in.
     * 
     */
    @Import(name="cluster", required=true)
    private Output<String> cluster;

    /**
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to create the task set in.
     * 
     */
    public Output<String> cluster() {
        return this.cluster;
    }

    /**
     * An optional non-unique tag that identifies this task set in external systems. If the task set is associated with a service discovery registry, the tasks in this task set will have the ECS_TASK_SET_EXTERNAL_ID AWS Cloud Map attribute set to the provided value.
     * 
     */
    @Import(name="externalId")
    private @Nullable Output<String> externalId;

    /**
     * @return An optional non-unique tag that identifies this task set in external systems. If the task set is associated with a service discovery registry, the tasks in this task set will have the ECS_TASK_SET_EXTERNAL_ID AWS Cloud Map attribute set to the provided value.
     * 
     */
    public Optional<Output<String>> externalId() {
        return Optional.ofNullable(this.externalId);
    }

    /**
     * The launch type that new tasks in the task set will use. For more information, see https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html in the Amazon Elastic Container Service Developer Guide.
     * 
     */
    @Import(name="launchType")
    private @Nullable Output<TaskSetLaunchType> launchType;

    /**
     * @return The launch type that new tasks in the task set will use. For more information, see https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html in the Amazon Elastic Container Service Developer Guide.
     * 
     */
    public Optional<Output<TaskSetLaunchType>> launchType() {
        return Optional.ofNullable(this.launchType);
    }

    @Import(name="loadBalancers")
    private @Nullable Output<List<TaskSetLoadBalancerArgs>> loadBalancers;

    public Optional<Output<List<TaskSetLoadBalancerArgs>>> loadBalancers() {
        return Optional.ofNullable(this.loadBalancers);
    }

    @Import(name="networkConfiguration")
    private @Nullable Output<TaskSetNetworkConfigurationArgs> networkConfiguration;

    public Optional<Output<TaskSetNetworkConfigurationArgs>> networkConfiguration() {
        return Optional.ofNullable(this.networkConfiguration);
    }

    /**
     * The platform version that the tasks in the task set should use. A platform version is specified only for tasks using the Fargate launch type. If one isn&#39;t specified, the LATEST platform version is used by default.
     * 
     */
    @Import(name="platformVersion")
    private @Nullable Output<String> platformVersion;

    /**
     * @return The platform version that the tasks in the task set should use. A platform version is specified only for tasks using the Fargate launch type. If one isn&#39;t specified, the LATEST platform version is used by default.
     * 
     */
    public Optional<Output<String>> platformVersion() {
        return Optional.ofNullable(this.platformVersion);
    }

    /**
     * A floating-point percentage of the desired number of tasks to place and keep running in the task set.
     * 
     */
    @Import(name="scale")
    private @Nullable Output<TaskSetScaleArgs> scale;

    /**
     * @return A floating-point percentage of the desired number of tasks to place and keep running in the task set.
     * 
     */
    public Optional<Output<TaskSetScaleArgs>> scale() {
        return Optional.ofNullable(this.scale);
    }

    /**
     * The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
     * 
     */
    @Import(name="service", required=true)
    private Output<String> service;

    /**
     * @return The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    /**
     * The details of the service discovery registries to assign to this task set. For more information, see https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html.
     * 
     */
    @Import(name="serviceRegistries")
    private @Nullable Output<List<TaskSetServiceRegistryArgs>> serviceRegistries;

    /**
     * @return The details of the service discovery registries to assign to this task set. For more information, see https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html.
     * 
     */
    public Optional<Output<List<TaskSetServiceRegistryArgs>>> serviceRegistries() {
        return Optional.ofNullable(this.serviceRegistries);
    }

    /**
     * The short name or full Amazon Resource Name (ARN) of the task definition for the tasks in the task set to use.
     * 
     */
    @Import(name="taskDefinition", required=true)
    private Output<String> taskDefinition;

    /**
     * @return The short name or full Amazon Resource Name (ARN) of the task definition for the tasks in the task set to use.
     * 
     */
    public Output<String> taskDefinition() {
        return this.taskDefinition;
    }

    private TaskSetArgs() {}

    private TaskSetArgs(TaskSetArgs $) {
        this.cluster = $.cluster;
        this.externalId = $.externalId;
        this.launchType = $.launchType;
        this.loadBalancers = $.loadBalancers;
        this.networkConfiguration = $.networkConfiguration;
        this.platformVersion = $.platformVersion;
        this.scale = $.scale;
        this.service = $.service;
        this.serviceRegistries = $.serviceRegistries;
        this.taskDefinition = $.taskDefinition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskSetArgs $;

        public Builder() {
            $ = new TaskSetArgs();
        }

        public Builder(TaskSetArgs defaults) {
            $ = new TaskSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to create the task set in.
         * 
         * @return builder
         * 
         */
        public Builder cluster(Output<String> cluster) {
            $.cluster = cluster;
            return this;
        }

        /**
         * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to create the task set in.
         * 
         * @return builder
         * 
         */
        public Builder cluster(String cluster) {
            return cluster(Output.of(cluster));
        }

        /**
         * @param externalId An optional non-unique tag that identifies this task set in external systems. If the task set is associated with a service discovery registry, the tasks in this task set will have the ECS_TASK_SET_EXTERNAL_ID AWS Cloud Map attribute set to the provided value.
         * 
         * @return builder
         * 
         */
        public Builder externalId(@Nullable Output<String> externalId) {
            $.externalId = externalId;
            return this;
        }

        /**
         * @param externalId An optional non-unique tag that identifies this task set in external systems. If the task set is associated with a service discovery registry, the tasks in this task set will have the ECS_TASK_SET_EXTERNAL_ID AWS Cloud Map attribute set to the provided value.
         * 
         * @return builder
         * 
         */
        public Builder externalId(String externalId) {
            return externalId(Output.of(externalId));
        }

        /**
         * @param launchType The launch type that new tasks in the task set will use. For more information, see https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html in the Amazon Elastic Container Service Developer Guide.
         * 
         * @return builder
         * 
         */
        public Builder launchType(@Nullable Output<TaskSetLaunchType> launchType) {
            $.launchType = launchType;
            return this;
        }

        /**
         * @param launchType The launch type that new tasks in the task set will use. For more information, see https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html in the Amazon Elastic Container Service Developer Guide.
         * 
         * @return builder
         * 
         */
        public Builder launchType(TaskSetLaunchType launchType) {
            return launchType(Output.of(launchType));
        }

        public Builder loadBalancers(@Nullable Output<List<TaskSetLoadBalancerArgs>> loadBalancers) {
            $.loadBalancers = loadBalancers;
            return this;
        }

        public Builder loadBalancers(List<TaskSetLoadBalancerArgs> loadBalancers) {
            return loadBalancers(Output.of(loadBalancers));
        }

        public Builder loadBalancers(TaskSetLoadBalancerArgs... loadBalancers) {
            return loadBalancers(List.of(loadBalancers));
        }

        public Builder networkConfiguration(@Nullable Output<TaskSetNetworkConfigurationArgs> networkConfiguration) {
            $.networkConfiguration = networkConfiguration;
            return this;
        }

        public Builder networkConfiguration(TaskSetNetworkConfigurationArgs networkConfiguration) {
            return networkConfiguration(Output.of(networkConfiguration));
        }

        /**
         * @param platformVersion The platform version that the tasks in the task set should use. A platform version is specified only for tasks using the Fargate launch type. If one isn&#39;t specified, the LATEST platform version is used by default.
         * 
         * @return builder
         * 
         */
        public Builder platformVersion(@Nullable Output<String> platformVersion) {
            $.platformVersion = platformVersion;
            return this;
        }

        /**
         * @param platformVersion The platform version that the tasks in the task set should use. A platform version is specified only for tasks using the Fargate launch type. If one isn&#39;t specified, the LATEST platform version is used by default.
         * 
         * @return builder
         * 
         */
        public Builder platformVersion(String platformVersion) {
            return platformVersion(Output.of(platformVersion));
        }

        /**
         * @param scale A floating-point percentage of the desired number of tasks to place and keep running in the task set.
         * 
         * @return builder
         * 
         */
        public Builder scale(@Nullable Output<TaskSetScaleArgs> scale) {
            $.scale = scale;
            return this;
        }

        /**
         * @param scale A floating-point percentage of the desired number of tasks to place and keep running in the task set.
         * 
         * @return builder
         * 
         */
        public Builder scale(TaskSetScaleArgs scale) {
            return scale(Output.of(scale));
        }

        /**
         * @param service The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
         * 
         * @return builder
         * 
         */
        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        /**
         * @param serviceRegistries The details of the service discovery registries to assign to this task set. For more information, see https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html.
         * 
         * @return builder
         * 
         */
        public Builder serviceRegistries(@Nullable Output<List<TaskSetServiceRegistryArgs>> serviceRegistries) {
            $.serviceRegistries = serviceRegistries;
            return this;
        }

        /**
         * @param serviceRegistries The details of the service discovery registries to assign to this task set. For more information, see https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html.
         * 
         * @return builder
         * 
         */
        public Builder serviceRegistries(List<TaskSetServiceRegistryArgs> serviceRegistries) {
            return serviceRegistries(Output.of(serviceRegistries));
        }

        /**
         * @param serviceRegistries The details of the service discovery registries to assign to this task set. For more information, see https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html.
         * 
         * @return builder
         * 
         */
        public Builder serviceRegistries(TaskSetServiceRegistryArgs... serviceRegistries) {
            return serviceRegistries(List.of(serviceRegistries));
        }

        /**
         * @param taskDefinition The short name or full Amazon Resource Name (ARN) of the task definition for the tasks in the task set to use.
         * 
         * @return builder
         * 
         */
        public Builder taskDefinition(Output<String> taskDefinition) {
            $.taskDefinition = taskDefinition;
            return this;
        }

        /**
         * @param taskDefinition The short name or full Amazon Resource Name (ARN) of the task definition for the tasks in the task set to use.
         * 
         * @return builder
         * 
         */
        public Builder taskDefinition(String taskDefinition) {
            return taskDefinition(Output.of(taskDefinition));
        }

        public TaskSetArgs build() {
            $.cluster = Objects.requireNonNull($.cluster, "expected parameter 'cluster' to be non-null");
            $.service = Objects.requireNonNull($.service, "expected parameter 'service' to be non-null");
            $.taskDefinition = Objects.requireNonNull($.taskDefinition, "expected parameter 'taskDefinition' to be non-null");
            return $;
        }
    }

}
