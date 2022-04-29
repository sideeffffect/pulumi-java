// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2;

import com.pulumi.awsnative.ec2.inputs.CarrierGatewayTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CarrierGatewayArgs extends ResourceArgs {

    public static final CarrierGatewayArgs Empty = new CarrierGatewayArgs();

    /**
     * The tags for the carrier gateway.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<CarrierGatewayTagArgs>> tags;

    /**
     * @return The tags for the carrier gateway.
     * 
     */
    public Optional<Output<List<CarrierGatewayTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The ID of the VPC.
     * 
     */
    @Import(name="vpcId", required=true)
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    private CarrierGatewayArgs() {}

    private CarrierGatewayArgs(CarrierGatewayArgs $) {
        this.tags = $.tags;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CarrierGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CarrierGatewayArgs $;

        public Builder() {
            $ = new CarrierGatewayArgs();
        }

        public Builder(CarrierGatewayArgs defaults) {
            $ = new CarrierGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param tags The tags for the carrier gateway.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<CarrierGatewayTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags for the carrier gateway.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<CarrierGatewayTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The tags for the carrier gateway.
         * 
         * @return builder
         * 
         */
        public Builder tags(CarrierGatewayTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param vpcId The ID of the VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public CarrierGatewayArgs build() {
            $.vpcId = Objects.requireNonNull($.vpcId, "expected parameter 'vpcId' to be non-null");
            return $;
        }
    }

}
