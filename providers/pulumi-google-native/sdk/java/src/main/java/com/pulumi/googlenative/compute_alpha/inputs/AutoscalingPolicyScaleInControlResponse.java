// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.FixedOrPercentResponse;
import java.lang.Integer;
import java.util.Objects;


/**
 * Configuration that allows for slower scale in so that even if Autoscaler recommends an abrupt scale in of a MIG, it will be throttled as specified by the parameters below.
 * 
 */
public final class AutoscalingPolicyScaleInControlResponse extends com.pulumi.resources.InvokeArgs {

    public static final AutoscalingPolicyScaleInControlResponse Empty = new AutoscalingPolicyScaleInControlResponse();

    /**
     * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
     * 
     */
    @Import(name="maxScaledInReplicas", required=true)
    private FixedOrPercentResponse maxScaledInReplicas;

    public FixedOrPercentResponse maxScaledInReplicas() {
        return this.maxScaledInReplicas;
    }

    /**
     * How far back autoscaling looks when computing recommendations to include directives regarding slower scale in, as described above.
     * 
     */
    @Import(name="timeWindowSec", required=true)
    private Integer timeWindowSec;

    public Integer timeWindowSec() {
        return this.timeWindowSec;
    }

    private AutoscalingPolicyScaleInControlResponse() {}

    private AutoscalingPolicyScaleInControlResponse(AutoscalingPolicyScaleInControlResponse $) {
        this.maxScaledInReplicas = $.maxScaledInReplicas;
        this.timeWindowSec = $.timeWindowSec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoscalingPolicyScaleInControlResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscalingPolicyScaleInControlResponse $;

        public Builder() {
            $ = new AutoscalingPolicyScaleInControlResponse();
        }

        public Builder(AutoscalingPolicyScaleInControlResponse defaults) {
            $ = new AutoscalingPolicyScaleInControlResponse(Objects.requireNonNull(defaults));
        }

        public Builder maxScaledInReplicas(FixedOrPercentResponse maxScaledInReplicas) {
            $.maxScaledInReplicas = maxScaledInReplicas;
            return this;
        }

        public Builder timeWindowSec(Integer timeWindowSec) {
            $.timeWindowSec = timeWindowSec;
            return this;
        }

        public AutoscalingPolicyScaleInControlResponse build() {
            $.maxScaledInReplicas = Objects.requireNonNull($.maxScaledInReplicas, "expected parameter 'maxScaledInReplicas' to be non-null");
            $.timeWindowSec = Objects.requireNonNull($.timeWindowSec, "expected parameter 'timeWindowSec' to be non-null");
            return $;
        }
    }

}
