// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup {
    /**
     * Name of the target group.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor
    private DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup(@OutputCustomType.Parameter("name") String name) {
        this.name = name;
    }

    /**
     * Name of the target group.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup build() {
            return new DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup(name);
        }
    }
}
