// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupGetArgs Empty = new DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupGetArgs();

    /**
     * Name of the target group.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupGetArgs(Input<String> name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupGetArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupGetArgs build() {
            return new DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupGetArgs(name);
        }
    }
}
