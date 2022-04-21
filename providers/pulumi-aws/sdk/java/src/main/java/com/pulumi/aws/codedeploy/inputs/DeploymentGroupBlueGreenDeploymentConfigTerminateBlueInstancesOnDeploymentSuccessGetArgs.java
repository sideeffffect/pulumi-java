// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codedeploy.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessGetArgs Empty = new DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessGetArgs();

    /**
     * The action to take on instances in the original environment after a successful blue/green deployment.
     * * `TERMINATE`: Instances are terminated after a specified wait time.
     * * `KEEP_ALIVE`: Instances are left running after they are deregistered from the load balancer and removed from the deployment group.
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * The number of minutes to wait after a successful blue/green deployment before terminating instances from the original environment.
     * 
     */
    @Import(name="terminationWaitTimeInMinutes")
    private @Nullable Output<Integer> terminationWaitTimeInMinutes;

    public Optional<Output<Integer>> terminationWaitTimeInMinutes() {
        return Optional.ofNullable(this.terminationWaitTimeInMinutes);
    }

    private DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessGetArgs() {}

    private DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessGetArgs(DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessGetArgs $) {
        this.action = $.action;
        this.terminationWaitTimeInMinutes = $.terminationWaitTimeInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessGetArgs $;

        public Builder() {
            $ = new DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessGetArgs();
        }

        public Builder(DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessGetArgs defaults) {
            $ = new DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        public Builder action(String action) {
            return action(Output.of(action));
        }

        public Builder terminationWaitTimeInMinutes(@Nullable Output<Integer> terminationWaitTimeInMinutes) {
            $.terminationWaitTimeInMinutes = terminationWaitTimeInMinutes;
            return this;
        }

        public Builder terminationWaitTimeInMinutes(Integer terminationWaitTimeInMinutes) {
            return terminationWaitTimeInMinutes(Output.of(terminationWaitTimeInMinutes));
        }

        public DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessGetArgs build() {
            return $;
        }
    }

}
