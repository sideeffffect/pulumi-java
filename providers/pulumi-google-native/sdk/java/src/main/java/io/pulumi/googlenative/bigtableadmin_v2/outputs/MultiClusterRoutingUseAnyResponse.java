// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MultiClusterRoutingUseAnyResponse {
    /**
     * The set of clusters to route to. The order is ignored; clusters will be tried in order of distance. If left empty, all clusters are eligible.
     * 
     */
    private final List<String> clusterIds;

    @OutputCustomType.Constructor
    private MultiClusterRoutingUseAnyResponse(@OutputCustomType.Parameter("clusterIds") List<String> clusterIds) {
        this.clusterIds = clusterIds;
    }

    /**
     * The set of clusters to route to. The order is ignored; clusters will be tried in order of distance. If left empty, all clusters are eligible.
     * 
    */
    public List<String> getClusterIds() {
        return this.clusterIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiClusterRoutingUseAnyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> clusterIds;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiClusterRoutingUseAnyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIds = defaults.clusterIds;
        }

        public Builder clusterIds(List<String> clusterIds) {
            this.clusterIds = Objects.requireNonNull(clusterIds);
            return this;
        }
        public MultiClusterRoutingUseAnyResponse build() {
            return new MultiClusterRoutingUseAnyResponse(clusterIds);
        }
    }
}
