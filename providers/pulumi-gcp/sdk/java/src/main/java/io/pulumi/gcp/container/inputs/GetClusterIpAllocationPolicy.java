// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetClusterIpAllocationPolicy extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterIpAllocationPolicy Empty = new GetClusterIpAllocationPolicy();

    @InputImport(name="clusterIpv4CidrBlock", required=true)
      private final String clusterIpv4CidrBlock;

    public String getClusterIpv4CidrBlock() {
        return this.clusterIpv4CidrBlock;
    }

    @InputImport(name="clusterSecondaryRangeName", required=true)
      private final String clusterSecondaryRangeName;

    public String getClusterSecondaryRangeName() {
        return this.clusterSecondaryRangeName;
    }

    @InputImport(name="servicesIpv4CidrBlock", required=true)
      private final String servicesIpv4CidrBlock;

    public String getServicesIpv4CidrBlock() {
        return this.servicesIpv4CidrBlock;
    }

    @InputImport(name="servicesSecondaryRangeName", required=true)
      private final String servicesSecondaryRangeName;

    public String getServicesSecondaryRangeName() {
        return this.servicesSecondaryRangeName;
    }

    public GetClusterIpAllocationPolicy(
        String clusterIpv4CidrBlock,
        String clusterSecondaryRangeName,
        String servicesIpv4CidrBlock,
        String servicesSecondaryRangeName) {
        this.clusterIpv4CidrBlock = Objects.requireNonNull(clusterIpv4CidrBlock, "expected parameter 'clusterIpv4CidrBlock' to be non-null");
        this.clusterSecondaryRangeName = Objects.requireNonNull(clusterSecondaryRangeName, "expected parameter 'clusterSecondaryRangeName' to be non-null");
        this.servicesIpv4CidrBlock = Objects.requireNonNull(servicesIpv4CidrBlock, "expected parameter 'servicesIpv4CidrBlock' to be non-null");
        this.servicesSecondaryRangeName = Objects.requireNonNull(servicesSecondaryRangeName, "expected parameter 'servicesSecondaryRangeName' to be non-null");
    }

    private GetClusterIpAllocationPolicy() {
        this.clusterIpv4CidrBlock = null;
        this.clusterSecondaryRangeName = null;
        this.servicesIpv4CidrBlock = null;
        this.servicesSecondaryRangeName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterIpAllocationPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterIpv4CidrBlock;
        private String clusterSecondaryRangeName;
        private String servicesIpv4CidrBlock;
        private String servicesSecondaryRangeName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterIpAllocationPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIpv4CidrBlock = defaults.clusterIpv4CidrBlock;
    	      this.clusterSecondaryRangeName = defaults.clusterSecondaryRangeName;
    	      this.servicesIpv4CidrBlock = defaults.servicesIpv4CidrBlock;
    	      this.servicesSecondaryRangeName = defaults.servicesSecondaryRangeName;
        }

        public Builder clusterIpv4CidrBlock(String clusterIpv4CidrBlock) {
            this.clusterIpv4CidrBlock = Objects.requireNonNull(clusterIpv4CidrBlock);
            return this;
        }

        public Builder clusterSecondaryRangeName(String clusterSecondaryRangeName) {
            this.clusterSecondaryRangeName = Objects.requireNonNull(clusterSecondaryRangeName);
            return this;
        }

        public Builder servicesIpv4CidrBlock(String servicesIpv4CidrBlock) {
            this.servicesIpv4CidrBlock = Objects.requireNonNull(servicesIpv4CidrBlock);
            return this;
        }

        public Builder servicesSecondaryRangeName(String servicesSecondaryRangeName) {
            this.servicesSecondaryRangeName = Objects.requireNonNull(servicesSecondaryRangeName);
            return this;
        }
        public GetClusterIpAllocationPolicy build() {
            return new GetClusterIpAllocationPolicy(clusterIpv4CidrBlock, clusterSecondaryRangeName, servicesIpv4CidrBlock, servicesSecondaryRangeName);
        }
    }
}
