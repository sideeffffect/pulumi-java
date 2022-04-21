// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A load balancer object representing the load balancer to use with the task set. The supported load balancer types are either an Application Load Balancer or a Network Load Balancer.
 * 
 */
public final class TaskSetLoadBalancerArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskSetLoadBalancerArgs Empty = new TaskSetLoadBalancerArgs();

    /**
     * The name of the container (as it appears in a container definition) to associate with the load balancer.
     * 
     */
    @Import(name="containerName")
    private @Nullable Output<String> containerName;

    public Optional<Output<String>> containerName() {
        return Optional.ofNullable(this.containerName);
    }

    /**
     * The port on the container to associate with the load balancer. This port must correspond to a containerPort in the task definition the tasks in the service are using. For tasks that use the EC2 launch type, the container instance they are launched on must allow ingress traffic on the hostPort of the port mapping.
     * 
     */
    @Import(name="containerPort")
    private @Nullable Output<Integer> containerPort;

    public Optional<Output<Integer>> containerPort() {
        return Optional.ofNullable(this.containerPort);
    }

    /**
     * The name of the load balancer to associate with the Amazon ECS service or task set. A load balancer name is only specified when using a Classic Load Balancer. If you are using an Application Load Balancer or a Network Load Balancer this should be omitted.
     * 
     */
    @Import(name="loadBalancerName")
    private @Nullable Output<String> loadBalancerName;

    public Optional<Output<String>> loadBalancerName() {
        return Optional.ofNullable(this.loadBalancerName);
    }

    /**
     * The full Amazon Resource Name (ARN) of the Elastic Load Balancing target group or groups associated with a service or task set. A target group ARN is only specified when using an Application Load Balancer or Network Load Balancer. If you are using a Classic Load Balancer this should be omitted. For services using the ECS deployment controller, you can specify one or multiple target groups. For more information, see https://docs.aws.amazon.com/AmazonECS/latest/developerguide/register-multiple-targetgroups.html in the Amazon Elastic Container Service Developer Guide. For services using the CODE_DEPLOY deployment controller, you are required to define two target groups for the load balancer. For more information, see https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-bluegreen.html in the Amazon Elastic Container Service Developer Guide. If your service&#39;s task definition uses the awsvpc network mode (which is required for the Fargate launch type), you must choose ip as the target type, not instance, when creating your target groups because tasks that use the awsvpc network mode are associated with an elastic network interface, not an Amazon EC2 instance.
     * 
     */
    @Import(name="targetGroupArn")
    private @Nullable Output<String> targetGroupArn;

    public Optional<Output<String>> targetGroupArn() {
        return Optional.ofNullable(this.targetGroupArn);
    }

    private TaskSetLoadBalancerArgs() {}

    private TaskSetLoadBalancerArgs(TaskSetLoadBalancerArgs $) {
        this.containerName = $.containerName;
        this.containerPort = $.containerPort;
        this.loadBalancerName = $.loadBalancerName;
        this.targetGroupArn = $.targetGroupArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskSetLoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskSetLoadBalancerArgs $;

        public Builder() {
            $ = new TaskSetLoadBalancerArgs();
        }

        public Builder(TaskSetLoadBalancerArgs defaults) {
            $ = new TaskSetLoadBalancerArgs(Objects.requireNonNull(defaults));
        }

        public Builder containerName(@Nullable Output<String> containerName) {
            $.containerName = containerName;
            return this;
        }

        public Builder containerName(String containerName) {
            return containerName(Output.of(containerName));
        }

        public Builder containerPort(@Nullable Output<Integer> containerPort) {
            $.containerPort = containerPort;
            return this;
        }

        public Builder containerPort(Integer containerPort) {
            return containerPort(Output.of(containerPort));
        }

        public Builder loadBalancerName(@Nullable Output<String> loadBalancerName) {
            $.loadBalancerName = loadBalancerName;
            return this;
        }

        public Builder loadBalancerName(String loadBalancerName) {
            return loadBalancerName(Output.of(loadBalancerName));
        }

        public Builder targetGroupArn(@Nullable Output<String> targetGroupArn) {
            $.targetGroupArn = targetGroupArn;
            return this;
        }

        public Builder targetGroupArn(String targetGroupArn) {
            return targetGroupArn(Output.of(targetGroupArn));
        }

        public TaskSetLoadBalancerArgs build() {
            return $;
        }
    }

}
