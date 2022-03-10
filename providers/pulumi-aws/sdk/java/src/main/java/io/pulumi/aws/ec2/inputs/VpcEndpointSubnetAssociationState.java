// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcEndpointSubnetAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final VpcEndpointSubnetAssociationState Empty = new VpcEndpointSubnetAssociationState();

    /**
     * The ID of the subnet to be associated with the VPC endpoint.
     * 
     */
    @InputImport(name="subnetId")
      private final @Nullable Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId == null ? Input.empty() : this.subnetId;
    }

    /**
     * The ID of the VPC endpoint with which the subnet will be associated.
     * 
     */
    @InputImport(name="vpcEndpointId")
      private final @Nullable Input<String> vpcEndpointId;

    public Input<String> getVpcEndpointId() {
        return this.vpcEndpointId == null ? Input.empty() : this.vpcEndpointId;
    }

    public VpcEndpointSubnetAssociationState(
        @Nullable Input<String> subnetId,
        @Nullable Input<String> vpcEndpointId) {
        this.subnetId = subnetId;
        this.vpcEndpointId = vpcEndpointId;
    }

    private VpcEndpointSubnetAssociationState() {
        this.subnetId = Input.empty();
        this.vpcEndpointId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcEndpointSubnetAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> subnetId;
        private @Nullable Input<String> vpcEndpointId;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcEndpointSubnetAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetId = defaults.subnetId;
    	      this.vpcEndpointId = defaults.vpcEndpointId;
        }

        public Builder subnetId(@Nullable Input<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = Input.ofNullable(subnetId);
            return this;
        }

        public Builder vpcEndpointId(@Nullable Input<String> vpcEndpointId) {
            this.vpcEndpointId = vpcEndpointId;
            return this;
        }

        public Builder vpcEndpointId(@Nullable String vpcEndpointId) {
            this.vpcEndpointId = Input.ofNullable(vpcEndpointId);
            return this;
        }
        public VpcEndpointSubnetAssociationState build() {
            return new VpcEndpointSubnetAssociationState(subnetId, vpcEndpointId);
        }
    }
}
