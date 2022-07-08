// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class HorizontalPodAutoscalingResponse {
    /**
     * @return Whether the Horizontal Pod Autoscaling feature is enabled in the cluster. When enabled, it ensures that metrics are collected into Stackdriver Monitoring.
     * 
     */
    private final Boolean disabled;

    @CustomType.Constructor
    private HorizontalPodAutoscalingResponse(@CustomType.Parameter("disabled") Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * @return Whether the Horizontal Pod Autoscaling feature is enabled in the cluster. When enabled, it ensures that metrics are collected into Stackdriver Monitoring.
     * 
     */
    public Boolean disabled() {
        return this.disabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(HorizontalPodAutoscalingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
        }

        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }        public HorizontalPodAutoscalingResponse build() {
            return new HorizontalPodAutoscalingResponse(disabled);
        }
    }
}
