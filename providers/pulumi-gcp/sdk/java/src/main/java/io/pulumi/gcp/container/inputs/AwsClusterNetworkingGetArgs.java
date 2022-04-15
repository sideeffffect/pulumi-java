// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class AwsClusterNetworkingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsClusterNetworkingGetArgs Empty = new AwsClusterNetworkingGetArgs();

    /**
     * Required. All pods in the cluster are assigned an RFC1918 IPv4 address from these ranges. Only a single range is supported. This field cannot be changed after creation.
     * 
     */
    @Import(name="podAddressCidrBlocks", required=true)
      private final Output<List<String>> podAddressCidrBlocks;

    public Output<List<String>> podAddressCidrBlocks() {
        return this.podAddressCidrBlocks;
    }

    /**
     * Required. All services in the cluster are assigned an RFC1918 IPv4 address from these ranges. Only a single range is supported. This field cannot be changed after creation.
     * 
     */
    @Import(name="serviceAddressCidrBlocks", required=true)
      private final Output<List<String>> serviceAddressCidrBlocks;

    public Output<List<String>> serviceAddressCidrBlocks() {
        return this.serviceAddressCidrBlocks;
    }

    /**
     * Required. The VPC associated with the cluster. All component clusters (i.e. control plane and node pools) run on a single VPC. This field cannot be changed after creation.
     * 
     */
    @Import(name="vpcId", required=true)
      private final Output<String> vpcId;

    public Output<String> vpcId() {
        return this.vpcId;
    }

    public AwsClusterNetworkingGetArgs(
        Output<List<String>> podAddressCidrBlocks,
        Output<List<String>> serviceAddressCidrBlocks,
        Output<String> vpcId) {
        this.podAddressCidrBlocks = Objects.requireNonNull(podAddressCidrBlocks, "expected parameter 'podAddressCidrBlocks' to be non-null");
        this.serviceAddressCidrBlocks = Objects.requireNonNull(serviceAddressCidrBlocks, "expected parameter 'serviceAddressCidrBlocks' to be non-null");
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private AwsClusterNetworkingGetArgs() {
        this.podAddressCidrBlocks = Codegen.empty();
        this.serviceAddressCidrBlocks = Codegen.empty();
        this.vpcId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterNetworkingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> podAddressCidrBlocks;
        private Output<List<String>> serviceAddressCidrBlocks;
        private Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterNetworkingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.podAddressCidrBlocks = defaults.podAddressCidrBlocks;
    	      this.serviceAddressCidrBlocks = defaults.serviceAddressCidrBlocks;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder podAddressCidrBlocks(Output<List<String>> podAddressCidrBlocks) {
            this.podAddressCidrBlocks = Objects.requireNonNull(podAddressCidrBlocks);
            return this;
        }
        public Builder podAddressCidrBlocks(List<String> podAddressCidrBlocks) {
            this.podAddressCidrBlocks = Output.of(Objects.requireNonNull(podAddressCidrBlocks));
            return this;
        }
        public Builder podAddressCidrBlocks(String... podAddressCidrBlocks) {
            return podAddressCidrBlocks(List.of(podAddressCidrBlocks));
        }
        public Builder serviceAddressCidrBlocks(Output<List<String>> serviceAddressCidrBlocks) {
            this.serviceAddressCidrBlocks = Objects.requireNonNull(serviceAddressCidrBlocks);
            return this;
        }
        public Builder serviceAddressCidrBlocks(List<String> serviceAddressCidrBlocks) {
            this.serviceAddressCidrBlocks = Output.of(Objects.requireNonNull(serviceAddressCidrBlocks));
            return this;
        }
        public Builder serviceAddressCidrBlocks(String... serviceAddressCidrBlocks) {
            return serviceAddressCidrBlocks(List.of(serviceAddressCidrBlocks));
        }
        public Builder vpcId(Output<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Output.of(Objects.requireNonNull(vpcId));
            return this;
        }        public AwsClusterNetworkingGetArgs build() {
            return new AwsClusterNetworkingGetArgs(podAddressCidrBlocks, serviceAddressCidrBlocks, vpcId);
        }
    }
}
