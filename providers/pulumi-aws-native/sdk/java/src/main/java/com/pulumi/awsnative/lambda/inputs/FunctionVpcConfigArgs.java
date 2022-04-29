// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lambda.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The VPC security groups and subnets that are attached to a Lambda function. When you connect a function to a VPC, Lambda creates an elastic network interface for each combination of security group and subnet in the function&#39;s VPC configuration. The function can only access resources and the internet through that VPC.
 * 
 */
public final class FunctionVpcConfigArgs extends ResourceArgs {

    public static final FunctionVpcConfigArgs Empty = new FunctionVpcConfigArgs();

    /**
     * A list of VPC security groups IDs.
     * 
     */
    @Import(name="securityGroupIds")
    private @Nullable Output<List<String>> securityGroupIds;

    /**
     * @return A list of VPC security groups IDs.
     * 
     */
    public Optional<Output<List<String>>> securityGroupIds() {
        return Optional.ofNullable(this.securityGroupIds);
    }

    /**
     * A list of VPC subnet IDs.
     * 
     */
    @Import(name="subnetIds")
    private @Nullable Output<List<String>> subnetIds;

    /**
     * @return A list of VPC subnet IDs.
     * 
     */
    public Optional<Output<List<String>>> subnetIds() {
        return Optional.ofNullable(this.subnetIds);
    }

    private FunctionVpcConfigArgs() {}

    private FunctionVpcConfigArgs(FunctionVpcConfigArgs $) {
        this.securityGroupIds = $.securityGroupIds;
        this.subnetIds = $.subnetIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionVpcConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionVpcConfigArgs $;

        public Builder() {
            $ = new FunctionVpcConfigArgs();
        }

        public Builder(FunctionVpcConfigArgs defaults) {
            $ = new FunctionVpcConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param securityGroupIds A list of VPC security groups IDs.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds A list of VPC security groups IDs.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        /**
         * @param securityGroupIds A list of VPC security groups IDs.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        /**
         * @param subnetIds A list of VPC subnet IDs.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds A list of VPC subnet IDs.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        /**
         * @param subnetIds A list of VPC subnet IDs.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        public FunctionVpcConfigArgs build() {
            return $;
        }
    }

}
