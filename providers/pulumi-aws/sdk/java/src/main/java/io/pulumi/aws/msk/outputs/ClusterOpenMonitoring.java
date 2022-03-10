// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.outputs;

import io.pulumi.aws.msk.outputs.ClusterOpenMonitoringPrometheus;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class ClusterOpenMonitoring {
    /**
     * Configuration block for Prometheus settings for open monitoring. See below.
     * 
     */
    private final ClusterOpenMonitoringPrometheus prometheus;

    @OutputCustomType.Constructor
    private ClusterOpenMonitoring(@OutputCustomType.Parameter("prometheus") ClusterOpenMonitoringPrometheus prometheus) {
        this.prometheus = prometheus;
    }

    /**
     * Configuration block for Prometheus settings for open monitoring. See below.
     * 
    */
    public ClusterOpenMonitoringPrometheus getPrometheus() {
        return this.prometheus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterOpenMonitoring defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterOpenMonitoringPrometheus prometheus;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterOpenMonitoring defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prometheus = defaults.prometheus;
        }

        public Builder prometheus(ClusterOpenMonitoringPrometheus prometheus) {
            this.prometheus = Objects.requireNonNull(prometheus);
            return this;
        }
        public ClusterOpenMonitoring build() {
            return new ClusterOpenMonitoring(prometheus);
        }
    }
}
