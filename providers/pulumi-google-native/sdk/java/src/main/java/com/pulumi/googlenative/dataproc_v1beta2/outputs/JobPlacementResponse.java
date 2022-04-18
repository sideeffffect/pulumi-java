// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class JobPlacementResponse {
    /**
     * Optional. Cluster labels to identify a cluster where the job will be submitted.
     * 
     */
    private final Map<String,String> clusterLabels;
    /**
     * The name of the cluster where the job will be submitted.
     * 
     */
    private final String clusterName;
    /**
     * A cluster UUID generated by the Dataproc service when the job is submitted.
     * 
     */
    private final String clusterUuid;

    @CustomType.Constructor
    private JobPlacementResponse(
        @CustomType.Parameter("clusterLabels") Map<String,String> clusterLabels,
        @CustomType.Parameter("clusterName") String clusterName,
        @CustomType.Parameter("clusterUuid") String clusterUuid) {
        this.clusterLabels = clusterLabels;
        this.clusterName = clusterName;
        this.clusterUuid = clusterUuid;
    }

    /**
     * Optional. Cluster labels to identify a cluster where the job will be submitted.
     * 
    */
    public Map<String,String> clusterLabels() {
        return this.clusterLabels;
    }
    /**
     * The name of the cluster where the job will be submitted.
     * 
    */
    public String clusterName() {
        return this.clusterName;
    }
    /**
     * A cluster UUID generated by the Dataproc service when the job is submitted.
     * 
    */
    public String clusterUuid() {
        return this.clusterUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobPlacementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> clusterLabels;
        private String clusterName;
        private String clusterUuid;

        public Builder() {
    	      // Empty
        }

        public Builder(JobPlacementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterLabels = defaults.clusterLabels;
    	      this.clusterName = defaults.clusterName;
    	      this.clusterUuid = defaults.clusterUuid;
        }

        public Builder clusterLabels(Map<String,String> clusterLabels) {
            this.clusterLabels = Objects.requireNonNull(clusterLabels);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder clusterUuid(String clusterUuid) {
            this.clusterUuid = Objects.requireNonNull(clusterUuid);
            return this;
        }        public JobPlacementResponse build() {
            return new JobPlacementResponse(clusterLabels, clusterName, clusterUuid);
        }
    }
}
