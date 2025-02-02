// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.RegionalReplicationStatusResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ReplicationStatusResponse {
    /**
     * @return This is the aggregated replication status based on all the regional replication status flags.
     * 
     */
    private final String aggregatedState;
    /**
     * @return This is a summary of replication status for each region.
     * 
     */
    private final List<RegionalReplicationStatusResponse> summary;

    @CustomType.Constructor
    private ReplicationStatusResponse(
        @CustomType.Parameter("aggregatedState") String aggregatedState,
        @CustomType.Parameter("summary") List<RegionalReplicationStatusResponse> summary) {
        this.aggregatedState = aggregatedState;
        this.summary = summary;
    }

    /**
     * @return This is the aggregated replication status based on all the regional replication status flags.
     * 
     */
    public String aggregatedState() {
        return this.aggregatedState;
    }
    /**
     * @return This is a summary of replication status for each region.
     * 
     */
    public List<RegionalReplicationStatusResponse> summary() {
        return this.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aggregatedState;
        private List<RegionalReplicationStatusResponse> summary;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregatedState = defaults.aggregatedState;
    	      this.summary = defaults.summary;
        }

        public Builder aggregatedState(String aggregatedState) {
            this.aggregatedState = Objects.requireNonNull(aggregatedState);
            return this;
        }
        public Builder summary(List<RegionalReplicationStatusResponse> summary) {
            this.summary = Objects.requireNonNull(summary);
            return this;
        }
        public Builder summary(RegionalReplicationStatusResponse... summary) {
            return summary(List.of(summary));
        }        public ReplicationStatusResponse build() {
            return new ReplicationStatusResponse(aggregatedState, summary);
        }
    }
}
