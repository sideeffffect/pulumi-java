// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscalerAutoscalingPolicyScaleDownControlArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalerAutoscalingPolicyScaleDownControlArgs Empty = new AutoscalerAutoscalingPolicyScaleDownControlArgs();

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @InputImport(name="maxScaledDownReplicas")
      private final @Nullable Input<AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs> maxScaledDownReplicas;

    public Input<AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs> getMaxScaledDownReplicas() {
        return this.maxScaledDownReplicas == null ? Input.empty() : this.maxScaledDownReplicas;
    }

    /**
     * How long back autoscaling should look when computing recommendations
     * to include directives regarding slower scale down, as described above.
     * 
     */
    @InputImport(name="timeWindowSec")
      private final @Nullable Input<Integer> timeWindowSec;

    public Input<Integer> getTimeWindowSec() {
        return this.timeWindowSec == null ? Input.empty() : this.timeWindowSec;
    }

    public AutoscalerAutoscalingPolicyScaleDownControlArgs(
        @Nullable Input<AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs> maxScaledDownReplicas,
        @Nullable Input<Integer> timeWindowSec) {
        this.maxScaledDownReplicas = maxScaledDownReplicas;
        this.timeWindowSec = timeWindowSec;
    }

    private AutoscalerAutoscalingPolicyScaleDownControlArgs() {
        this.maxScaledDownReplicas = Input.empty();
        this.timeWindowSec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalerAutoscalingPolicyScaleDownControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs> maxScaledDownReplicas;
        private @Nullable Input<Integer> timeWindowSec;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalerAutoscalingPolicyScaleDownControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxScaledDownReplicas = defaults.maxScaledDownReplicas;
    	      this.timeWindowSec = defaults.timeWindowSec;
        }

        public Builder maxScaledDownReplicas(@Nullable Input<AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs> maxScaledDownReplicas) {
            this.maxScaledDownReplicas = maxScaledDownReplicas;
            return this;
        }

        public Builder maxScaledDownReplicas(@Nullable AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs maxScaledDownReplicas) {
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
        public AutoscalerAutoscalingPolicyScaleDownControlArgs build() {
            return new AutoscalerAutoscalingPolicyScaleDownControlArgs(maxScaledDownReplicas, timeWindowSec);
        }
    }
}
