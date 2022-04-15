// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskSetLoadBalancerGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskSetLoadBalancerGetArgs Empty = new TaskSetLoadBalancerGetArgs();

    /**
     * The name of the container to associate with the load balancer (as it appears in a container definition).
     * 
     */
    @Import(name="containerName", required=true)
      private final Output<String> containerName;

    public Output<String> containerName() {
        return this.containerName;
    }

    /**
     * The port on the container to associate with the load balancer. Defaults to `0` if not specified.
     * 
     */
    @Import(name="containerPort")
      private final @Nullable Output<Integer> containerPort;

    public Output<Integer> containerPort() {
        return this.containerPort == null ? Codegen.empty() : this.containerPort;
    }

    /**
     * The name of the ELB (Classic) to associate with the service.
     * 
     */
    @Import(name="loadBalancerName")
      private final @Nullable Output<String> loadBalancerName;

    public Output<String> loadBalancerName() {
        return this.loadBalancerName == null ? Codegen.empty() : this.loadBalancerName;
    }

    /**
     * The ARN of the Load Balancer target group to associate with the service.
     * 
     */
    @Import(name="targetGroupArn")
      private final @Nullable Output<String> targetGroupArn;

    public Output<String> targetGroupArn() {
        return this.targetGroupArn == null ? Codegen.empty() : this.targetGroupArn;
    }

    public TaskSetLoadBalancerGetArgs(
        Output<String> containerName,
        @Nullable Output<Integer> containerPort,
        @Nullable Output<String> loadBalancerName,
        @Nullable Output<String> targetGroupArn) {
        this.containerName = Objects.requireNonNull(containerName, "expected parameter 'containerName' to be non-null");
        this.containerPort = containerPort;
        this.loadBalancerName = loadBalancerName;
        this.targetGroupArn = targetGroupArn;
    }

    private TaskSetLoadBalancerGetArgs() {
        this.containerName = Codegen.empty();
        this.containerPort = Codegen.empty();
        this.loadBalancerName = Codegen.empty();
        this.targetGroupArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSetLoadBalancerGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> containerName;
        private @Nullable Output<Integer> containerPort;
        private @Nullable Output<String> loadBalancerName;
        private @Nullable Output<String> targetGroupArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskSetLoadBalancerGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.containerPort = defaults.containerPort;
    	      this.loadBalancerName = defaults.loadBalancerName;
    	      this.targetGroupArn = defaults.targetGroupArn;
        }

        public Builder containerName(Output<String> containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }
        public Builder containerName(String containerName) {
            this.containerName = Output.of(Objects.requireNonNull(containerName));
            return this;
        }
        public Builder containerPort(@Nullable Output<Integer> containerPort) {
            this.containerPort = containerPort;
            return this;
        }
        public Builder containerPort(@Nullable Integer containerPort) {
            this.containerPort = Codegen.ofNullable(containerPort);
            return this;
        }
        public Builder loadBalancerName(@Nullable Output<String> loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public Builder loadBalancerName(@Nullable String loadBalancerName) {
            this.loadBalancerName = Codegen.ofNullable(loadBalancerName);
            return this;
        }
        public Builder targetGroupArn(@Nullable Output<String> targetGroupArn) {
            this.targetGroupArn = targetGroupArn;
            return this;
        }
        public Builder targetGroupArn(@Nullable String targetGroupArn) {
            this.targetGroupArn = Codegen.ofNullable(targetGroupArn);
            return this;
        }        public TaskSetLoadBalancerGetArgs build() {
            return new TaskSetLoadBalancerGetArgs(containerName, containerPort, loadBalancerName, targetGroupArn);
        }
    }
}
