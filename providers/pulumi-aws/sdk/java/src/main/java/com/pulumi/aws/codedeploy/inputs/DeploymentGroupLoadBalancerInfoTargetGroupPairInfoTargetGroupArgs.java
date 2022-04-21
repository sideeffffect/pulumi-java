// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codedeploy.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs Empty = new DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs();

    /**
     * Name of the target group.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs() {}

    private DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs $;

        public Builder() {
            $ = new DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs();
        }

        public Builder(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs defaults) {
            $ = new DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
