// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.FixedOrPercentResponse;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class AutoscalingPolicyScaleDownControlResponse {
    /**
     * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
     * 
     */
    private final FixedOrPercentResponse maxScaledDownReplicas;
    /**
     * How far back autoscaling looks when computing recommendations to include directives regarding slower scale in, as described above.
     * 
     */
    private final Integer timeWindowSec;

    @OutputCustomType.Constructor({"maxScaledDownReplicas","timeWindowSec"})
    private AutoscalingPolicyScaleDownControlResponse(
        FixedOrPercentResponse maxScaledDownReplicas,
        Integer timeWindowSec) {
        this.maxScaledDownReplicas = maxScaledDownReplicas;
        this.timeWindowSec = timeWindowSec;
    }

    /**
     * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
     * 
    */
    public FixedOrPercentResponse getMaxScaledDownReplicas() {
        return this.maxScaledDownReplicas;
    }
    /**
     * How far back autoscaling looks when computing recommendations to include directives regarding slower scale in, as described above.
     * 
    */
    public Integer getTimeWindowSec() {
        return this.timeWindowSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicyScaleDownControlResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FixedOrPercentResponse maxScaledDownReplicas;
        private Integer timeWindowSec;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicyScaleDownControlResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxScaledDownReplicas = defaults.maxScaledDownReplicas;
    	      this.timeWindowSec = defaults.timeWindowSec;
        }

        public Builder setMaxScaledDownReplicas(FixedOrPercentResponse maxScaledDownReplicas) {
            this.maxScaledDownReplicas = Objects.requireNonNull(maxScaledDownReplicas);
            return this;
        }

        public Builder setTimeWindowSec(Integer timeWindowSec) {
            this.timeWindowSec = Objects.requireNonNull(timeWindowSec);
            return this;
        }
        public AutoscalingPolicyScaleDownControlResponse build() {
            return new AutoscalingPolicyScaleDownControlResponse(maxScaledDownReplicas, timeWindowSec);
        }
    }
}
