// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codedeploy.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DeploymentGroupEcsServiceGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupEcsServiceGetArgs Empty = new DeploymentGroupEcsServiceGetArgs();

    /**
     * The name of the ECS cluster.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * The name of the ECS service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    private DeploymentGroupEcsServiceGetArgs() {}

    private DeploymentGroupEcsServiceGetArgs(DeploymentGroupEcsServiceGetArgs $) {
        this.clusterName = $.clusterName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentGroupEcsServiceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentGroupEcsServiceGetArgs $;

        public Builder() {
            $ = new DeploymentGroupEcsServiceGetArgs();
        }

        public Builder(DeploymentGroupEcsServiceGetArgs defaults) {
            $ = new DeploymentGroupEcsServiceGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public DeploymentGroupEcsServiceGetArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
