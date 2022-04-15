// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.compute.outputs.AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicas;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoscalarAutoscalingPolicyScaleInControl {
    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    private final @Nullable AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicas maxScaledInReplicas;
    /**
     * How long back autoscaling should look when computing recommendations
     * to include directives regarding slower scale down, as described above.
     * 
     */
    private final @Nullable Integer timeWindowSec;

    @CustomType.Constructor
    private AutoscalarAutoscalingPolicyScaleInControl(
        @CustomType.Parameter("maxScaledInReplicas") @Nullable AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicas maxScaledInReplicas,
        @CustomType.Parameter("timeWindowSec") @Nullable Integer timeWindowSec) {
        this.maxScaledInReplicas = maxScaledInReplicas;
        this.timeWindowSec = timeWindowSec;
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
    */
    public Optional<AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicas> maxScaledInReplicas() {
        return Optional.ofNullable(this.maxScaledInReplicas);
    }
    /**
     * How long back autoscaling should look when computing recommendations
     * to include directives regarding slower scale down, as described above.
     * 
    */
    public Optional<Integer> timeWindowSec() {
        return Optional.ofNullable(this.timeWindowSec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalarAutoscalingPolicyScaleInControl defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicas maxScaledInReplicas;
        private @Nullable Integer timeWindowSec;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalarAutoscalingPolicyScaleInControl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxScaledInReplicas = defaults.maxScaledInReplicas;
    	      this.timeWindowSec = defaults.timeWindowSec;
        }

        public Builder maxScaledInReplicas(@Nullable AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicas maxScaledInReplicas) {
            this.maxScaledInReplicas = maxScaledInReplicas;
            return this;
        }
        public Builder timeWindowSec(@Nullable Integer timeWindowSec) {
            this.timeWindowSec = timeWindowSec;
            return this;
        }        public AutoscalarAutoscalingPolicyScaleInControl build() {
            return new AutoscalarAutoscalingPolicyScaleInControl(maxScaledInReplicas, timeWindowSec);
        }
    }
}
