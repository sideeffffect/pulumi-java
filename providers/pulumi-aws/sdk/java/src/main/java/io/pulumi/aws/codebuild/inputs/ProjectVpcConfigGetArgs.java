// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ProjectVpcConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectVpcConfigGetArgs Empty = new ProjectVpcConfigGetArgs();

    /**
     * Security group IDs to assign to running builds.
     * 
     */
    @Import(name="securityGroupIds", required=true)
      private final Output<List<String>> securityGroupIds;

    public Output<List<String>> securityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * Subnet IDs within which to run builds.
     * 
     */
    @Import(name="subnets", required=true)
      private final Output<List<String>> subnets;

    public Output<List<String>> subnets() {
        return this.subnets;
    }

    /**
     * ID of the VPC within which to run builds.
     * 
     */
    @Import(name="vpcId", required=true)
      private final Output<String> vpcId;

    public Output<String> vpcId() {
        return this.vpcId;
    }

    public ProjectVpcConfigGetArgs(
        Output<List<String>> securityGroupIds,
        Output<List<String>> subnets,
        Output<String> vpcId) {
        this.securityGroupIds = Objects.requireNonNull(securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
        this.subnets = Objects.requireNonNull(subnets, "expected parameter 'subnets' to be non-null");
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private ProjectVpcConfigGetArgs() {
        this.securityGroupIds = Codegen.empty();
        this.subnets = Codegen.empty();
        this.vpcId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectVpcConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> securityGroupIds;
        private Output<List<String>> subnets;
        private Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectVpcConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnets = defaults.subnets;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder securityGroupIds(Output<List<String>> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }
        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Output.of(Objects.requireNonNull(securityGroupIds));
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        public Builder subnets(Output<List<String>> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }
        public Builder subnets(List<String> subnets) {
            this.subnets = Output.of(Objects.requireNonNull(subnets));
            return this;
        }
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }
        public Builder vpcId(Output<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Output.of(Objects.requireNonNull(vpcId));
            return this;
        }        public ProjectVpcConfigGetArgs build() {
            return new ProjectVpcConfigGetArgs(securityGroupIds, subnets, vpcId);
        }
    }
}
