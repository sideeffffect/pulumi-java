// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Specifies a VPC that your training jobs and hosted models have access to. Control access to and from your training and model containers by configuring the VPC.
 * 
 */
public final class DataQualityJobDefinitionVpcConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataQualityJobDefinitionVpcConfigArgs Empty = new DataQualityJobDefinitionVpcConfigArgs();

    /**
     * The VPC security group IDs, in the form sg-xxxxxxxx. Specify the security groups for the VPC that is specified in the Subnets field.
     * 
     */
    @InputImport(name="securityGroupIds", required=true)
      private final Input<List<String>> securityGroupIds;

    public Input<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * The ID of the subnets in the VPC to which you want to connect to your monitoring jobs.
     * 
     */
    @InputImport(name="subnets", required=true)
      private final Input<List<String>> subnets;

    public Input<List<String>> getSubnets() {
        return this.subnets;
    }

    public DataQualityJobDefinitionVpcConfigArgs(
        Input<List<String>> securityGroupIds,
        Input<List<String>> subnets) {
        this.securityGroupIds = Objects.requireNonNull(securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
        this.subnets = Objects.requireNonNull(subnets, "expected parameter 'subnets' to be non-null");
    }

    private DataQualityJobDefinitionVpcConfigArgs() {
        this.securityGroupIds = Input.empty();
        this.subnets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataQualityJobDefinitionVpcConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> securityGroupIds;
        private Input<List<String>> subnets;

        public Builder() {
    	      // Empty
        }

        public Builder(DataQualityJobDefinitionVpcConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnets = defaults.subnets;
        }

        public Builder securityGroupIds(Input<List<String>> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }

        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Input.of(Objects.requireNonNull(securityGroupIds));
            return this;
        }

        public Builder subnets(Input<List<String>> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }

        public Builder subnets(List<String> subnets) {
            this.subnets = Input.of(Objects.requireNonNull(subnets));
            return this;
        }
        public DataQualityJobDefinitionVpcConfigArgs build() {
            return new DataQualityJobDefinitionVpcConfigArgs(securityGroupIds, subnets);
        }
    }
}
