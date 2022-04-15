// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.aws.codedeploy.inputs.DeploymentGroupEc2TagSetEc2TagFilterGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentGroupEc2TagSetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupEc2TagSetGetArgs Empty = new DeploymentGroupEc2TagSetGetArgs();

    /**
     * Tag filters associated with the deployment group. See the AWS docs for details.
     * 
     */
    @Import(name="ec2TagFilters")
      private final @Nullable Output<List<DeploymentGroupEc2TagSetEc2TagFilterGetArgs>> ec2TagFilters;

    public Output<List<DeploymentGroupEc2TagSetEc2TagFilterGetArgs>> ec2TagFilters() {
        return this.ec2TagFilters == null ? Codegen.empty() : this.ec2TagFilters;
    }

    public DeploymentGroupEc2TagSetGetArgs(@Nullable Output<List<DeploymentGroupEc2TagSetEc2TagFilterGetArgs>> ec2TagFilters) {
        this.ec2TagFilters = ec2TagFilters;
    }

    private DeploymentGroupEc2TagSetGetArgs() {
        this.ec2TagFilters = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupEc2TagSetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<DeploymentGroupEc2TagSetEc2TagFilterGetArgs>> ec2TagFilters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupEc2TagSetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ec2TagFilters = defaults.ec2TagFilters;
        }

        public Builder ec2TagFilters(@Nullable Output<List<DeploymentGroupEc2TagSetEc2TagFilterGetArgs>> ec2TagFilters) {
            this.ec2TagFilters = ec2TagFilters;
            return this;
        }
        public Builder ec2TagFilters(@Nullable List<DeploymentGroupEc2TagSetEc2TagFilterGetArgs> ec2TagFilters) {
            this.ec2TagFilters = Codegen.ofNullable(ec2TagFilters);
            return this;
        }
        public Builder ec2TagFilters(DeploymentGroupEc2TagSetEc2TagFilterGetArgs... ec2TagFilters) {
            return ec2TagFilters(List.of(ec2TagFilters));
        }        public DeploymentGroupEc2TagSetGetArgs build() {
            return new DeploymentGroupEc2TagSetGetArgs(ec2TagFilters);
        }
    }
}
