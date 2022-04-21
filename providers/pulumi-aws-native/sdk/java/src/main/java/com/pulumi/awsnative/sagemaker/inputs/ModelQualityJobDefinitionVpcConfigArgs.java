// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Specifies a VPC that your training jobs and hosted models have access to. Control access to and from your training and model containers by configuring the VPC.
 * 
 */
public final class ModelQualityJobDefinitionVpcConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelQualityJobDefinitionVpcConfigArgs Empty = new ModelQualityJobDefinitionVpcConfigArgs();

    /**
     * The VPC security group IDs, in the form sg-xxxxxxxx. Specify the security groups for the VPC that is specified in the Subnets field.
     * 
     */
    @Import(name="securityGroupIds", required=true)
    private Output<List<String>> securityGroupIds;

    public Output<List<String>> securityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * The ID of the subnets in the VPC to which you want to connect to your monitoring jobs.
     * 
     */
    @Import(name="subnets", required=true)
    private Output<List<String>> subnets;

    public Output<List<String>> subnets() {
        return this.subnets;
    }

    private ModelQualityJobDefinitionVpcConfigArgs() {}

    private ModelQualityJobDefinitionVpcConfigArgs(ModelQualityJobDefinitionVpcConfigArgs $) {
        this.securityGroupIds = $.securityGroupIds;
        this.subnets = $.subnets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelQualityJobDefinitionVpcConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelQualityJobDefinitionVpcConfigArgs $;

        public Builder() {
            $ = new ModelQualityJobDefinitionVpcConfigArgs();
        }

        public Builder(ModelQualityJobDefinitionVpcConfigArgs defaults) {
            $ = new ModelQualityJobDefinitionVpcConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder securityGroupIds(Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        public Builder subnets(Output<List<String>> subnets) {
            $.subnets = subnets;
            return this;
        }

        public Builder subnets(List<String> subnets) {
            return subnets(Output.of(subnets));
        }

        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }

        public ModelQualityJobDefinitionVpcConfigArgs build() {
            $.securityGroupIds = Objects.requireNonNull($.securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
            $.subnets = Objects.requireNonNull($.subnets, "expected parameter 'subnets' to be non-null");
            return $;
        }
    }

}
