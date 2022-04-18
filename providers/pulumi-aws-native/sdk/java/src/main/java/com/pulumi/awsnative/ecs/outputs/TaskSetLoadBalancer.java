// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskSetLoadBalancer {
    /**
     * The name of the container (as it appears in a container definition) to associate with the load balancer.
     * 
     */
    private final @Nullable String containerName;
    /**
     * The port on the container to associate with the load balancer. This port must correspond to a containerPort in the task definition the tasks in the service are using. For tasks that use the EC2 launch type, the container instance they are launched on must allow ingress traffic on the hostPort of the port mapping.
     * 
     */
    private final @Nullable Integer containerPort;
    /**
     * The name of the load balancer to associate with the Amazon ECS service or task set. A load balancer name is only specified when using a Classic Load Balancer. If you are using an Application Load Balancer or a Network Load Balancer this should be omitted.
     * 
     */
    private final @Nullable String loadBalancerName;
    /**
     * The full Amazon Resource Name (ARN) of the Elastic Load Balancing target group or groups associated with a service or task set. A target group ARN is only specified when using an Application Load Balancer or Network Load Balancer. If you are using a Classic Load Balancer this should be omitted. For services using the ECS deployment controller, you can specify one or multiple target groups. For more information, see https://docs.aws.amazon.com/AmazonECS/latest/developerguide/register-multiple-targetgroups.html in the Amazon Elastic Container Service Developer Guide. For services using the CODE_DEPLOY deployment controller, you are required to define two target groups for the load balancer. For more information, see https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-bluegreen.html in the Amazon Elastic Container Service Developer Guide. If your service's task definition uses the awsvpc network mode (which is required for the Fargate launch type), you must choose ip as the target type, not instance, when creating your target groups because tasks that use the awsvpc network mode are associated with an elastic network interface, not an Amazon EC2 instance.
     * 
     */
    private final @Nullable String targetGroupArn;

    @CustomType.Constructor
    private TaskSetLoadBalancer(
        @CustomType.Parameter("containerName") @Nullable String containerName,
        @CustomType.Parameter("containerPort") @Nullable Integer containerPort,
        @CustomType.Parameter("loadBalancerName") @Nullable String loadBalancerName,
        @CustomType.Parameter("targetGroupArn") @Nullable String targetGroupArn) {
        this.containerName = containerName;
        this.containerPort = containerPort;
        this.loadBalancerName = loadBalancerName;
        this.targetGroupArn = targetGroupArn;
    }

    /**
     * The name of the container (as it appears in a container definition) to associate with the load balancer.
     * 
    */
    public Optional<String> containerName() {
        return Optional.ofNullable(this.containerName);
    }
    /**
     * The port on the container to associate with the load balancer. This port must correspond to a containerPort in the task definition the tasks in the service are using. For tasks that use the EC2 launch type, the container instance they are launched on must allow ingress traffic on the hostPort of the port mapping.
     * 
    */
    public Optional<Integer> containerPort() {
        return Optional.ofNullable(this.containerPort);
    }
    /**
     * The name of the load balancer to associate with the Amazon ECS service or task set. A load balancer name is only specified when using a Classic Load Balancer. If you are using an Application Load Balancer or a Network Load Balancer this should be omitted.
     * 
    */
    public Optional<String> loadBalancerName() {
        return Optional.ofNullable(this.loadBalancerName);
    }
    /**
     * The full Amazon Resource Name (ARN) of the Elastic Load Balancing target group or groups associated with a service or task set. A target group ARN is only specified when using an Application Load Balancer or Network Load Balancer. If you are using a Classic Load Balancer this should be omitted. For services using the ECS deployment controller, you can specify one or multiple target groups. For more information, see https://docs.aws.amazon.com/AmazonECS/latest/developerguide/register-multiple-targetgroups.html in the Amazon Elastic Container Service Developer Guide. For services using the CODE_DEPLOY deployment controller, you are required to define two target groups for the load balancer. For more information, see https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-bluegreen.html in the Amazon Elastic Container Service Developer Guide. If your service's task definition uses the awsvpc network mode (which is required for the Fargate launch type), you must choose ip as the target type, not instance, when creating your target groups because tasks that use the awsvpc network mode are associated with an elastic network interface, not an Amazon EC2 instance.
     * 
    */
    public Optional<String> targetGroupArn() {
        return Optional.ofNullable(this.targetGroupArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSetLoadBalancer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String containerName;
        private @Nullable Integer containerPort;
        private @Nullable String loadBalancerName;
        private @Nullable String targetGroupArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskSetLoadBalancer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.containerPort = defaults.containerPort;
    	      this.loadBalancerName = defaults.loadBalancerName;
    	      this.targetGroupArn = defaults.targetGroupArn;
        }

        public Builder containerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }
        public Builder containerPort(@Nullable Integer containerPort) {
            this.containerPort = containerPort;
            return this;
        }
        public Builder loadBalancerName(@Nullable String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public Builder targetGroupArn(@Nullable String targetGroupArn) {
            this.targetGroupArn = targetGroupArn;
            return this;
        }        public TaskSetLoadBalancer build() {
            return new TaskSetLoadBalancer(containerName, containerPort, loadBalancerName, targetGroupArn);
        }
    }
}
