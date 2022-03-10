// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ClusterJobResponse {
    /**
     * Resource ID of the streaming job.
     * 
     */
    private final String id;
    /**
     * The current execution state of the streaming job.
     * 
     */
    private final String jobState;
    /**
     * The number of streaming units that are used by the streaming job.
     * 
     */
    private final Integer streamingUnits;

    @OutputCustomType.Constructor
    private ClusterJobResponse(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("jobState") String jobState,
        @OutputCustomType.Parameter("streamingUnits") Integer streamingUnits) {
        this.id = id;
        this.jobState = jobState;
        this.streamingUnits = streamingUnits;
    }

    /**
     * Resource ID of the streaming job.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The current execution state of the streaming job.
     * 
    */
    public String getJobState() {
        return this.jobState;
    }
    /**
     * The number of streaming units that are used by the streaming job.
     * 
    */
    public Integer getStreamingUnits() {
        return this.streamingUnits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String jobState;
        private Integer streamingUnits;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.jobState = defaults.jobState;
    	      this.streamingUnits = defaults.streamingUnits;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder jobState(String jobState) {
            this.jobState = Objects.requireNonNull(jobState);
            return this;
        }

        public Builder streamingUnits(Integer streamingUnits) {
            this.streamingUnits = Objects.requireNonNull(streamingUnits);
            return this;
        }
        public ClusterJobResponse build() {
            return new ClusterJobResponse(id, jobState, streamingUnits);
        }
    }
}
