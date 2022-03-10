// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The properties of a default cluster
 * 
 */
public final class ManagementClusterResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagementClusterResponse Empty = new ManagementClusterResponse();

    /**
     * The identity
     * 
     */
    @InputImport(name="clusterId", required=true)
      private final Integer clusterId;

    public Integer getClusterId() {
        return this.clusterId;
    }

    /**
     * The cluster size
     * 
     */
    @InputImport(name="clusterSize", required=true)
      private final Integer clusterSize;

    public Integer getClusterSize() {
        return this.clusterSize;
    }

    /**
     * The hosts
     * 
     */
    @InputImport(name="hosts", required=true)
      private final List<String> hosts;

    public List<String> getHosts() {
        return this.hosts;
    }

    /**
     * The state of the cluster provisioning
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    public ManagementClusterResponse(
        Integer clusterId,
        Integer clusterSize,
        List<String> hosts,
        String provisioningState) {
        this.clusterId = Objects.requireNonNull(clusterId, "expected parameter 'clusterId' to be non-null");
        this.clusterSize = Objects.requireNonNull(clusterSize, "expected parameter 'clusterSize' to be non-null");
        this.hosts = Objects.requireNonNull(hosts, "expected parameter 'hosts' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
    }

    private ManagementClusterResponse() {
        this.clusterId = null;
        this.clusterSize = null;
        this.hosts = List.of();
        this.provisioningState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementClusterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer clusterId;
        private Integer clusterSize;
        private List<String> hosts;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementClusterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.clusterSize = defaults.clusterSize;
    	      this.hosts = defaults.hosts;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder clusterId(Integer clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }

        public Builder clusterSize(Integer clusterSize) {
            this.clusterSize = Objects.requireNonNull(clusterSize);
            return this;
        }

        public Builder hosts(List<String> hosts) {
            this.hosts = Objects.requireNonNull(hosts);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public ManagementClusterResponse build() {
            return new ManagementClusterResponse(clusterId, clusterSize, hosts, provisioningState);
        }
    }
}
