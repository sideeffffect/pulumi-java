// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.FixedOrPercentArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration that allows for slower scale in so that even if Autoscaler recommends an abrupt scale in of a MIG, it will be throttled as specified by the parameters below.
 * 
 */
public final class AutoscalingPolicyScaleDownControlArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalingPolicyScaleDownControlArgs Empty = new AutoscalingPolicyScaleDownControlArgs();

    /**
     * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
     * 
     */
    @InputImport(name="maxScaledDownReplicas")
      private final @Nullable Input<FixedOrPercentArgs> maxScaledDownReplicas;

    public Input<FixedOrPercentArgs> getMaxScaledDownReplicas() {
        return this.maxScaledDownReplicas == null ? Input.empty() : this.maxScaledDownReplicas;
    }

    /**
     * How far back autoscaling looks when computing recommendations to include directives regarding slower scale in, as described above.
     * 
     */
    @InputImport(name="timeWindowSec")
      private final @Nullable Input<Integer> timeWindowSec;

    public Input<Integer> getTimeWindowSec() {
        return this.timeWindowSec == null ? Input.empty() : this.timeWindowSec;
    }

    public AutoscalingPolicyScaleDownControlArgs(
        @Nullable Input<FixedOrPercentArgs> maxScaledDownReplicas,
        @Nullable Input<Integer> timeWindowSec) {
        this.maxScaledDownReplicas = maxScaledDownReplicas;
        this.timeWindowSec = timeWindowSec;
    }

    private AutoscalingPolicyScaleDownControlArgs() {
        this.maxScaledDownReplicas = Input.empty();
        this.timeWindowSec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicyScaleDownControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FixedOrPercentArgs> maxScaledDownReplicas;
        private @Nullable Input<Integer> timeWindowSec;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicyScaleDownControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxScaledDownReplicas = defaults.maxScaledDownReplicas;
    	      this.timeWindowSec = defaults.timeWindowSec;
        }

        public Builder maxScaledDownReplicas(@Nullable Input<FixedOrPercentArgs> maxScaledDownReplicas) {
            this.maxScaledDownReplicas = maxScaledDownReplicas;
            return this;
        }

        public Builder maxScaledDownReplicas(@Nullable FixedOrPercentArgs maxScaledDownReplicas) {
            this.maxScaledDownReplicas = Input.ofNullable(maxScaledDownReplicas);
            return this;
        }

        public Builder timeWindowSec(@Nullable Input<Integer> timeWindowSec) {
            this.timeWindowSec = timeWindowSec;
            return this;
        }

        public Builder timeWindowSec(@Nullable Integer timeWindowSec) {
            this.timeWindowSec = Input.ofNullable(timeWindowSec);
            return this;
        }
        public AutoscalingPolicyScaleDownControlArgs build() {
            return new AutoscalingPolicyScaleDownControlArgs(maxScaledDownReplicas, timeWindowSec);
        }
    }
}
