// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerOutlierDetectionBaseEjectionDuration;
import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerOutlierDetectionInterval;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class VirtualNodeSpecListenerOutlierDetection {
    /**
     * The base amount of time for which a host is ejected.
     * 
     */
    private final VirtualNodeSpecListenerOutlierDetectionBaseEjectionDuration baseEjectionDuration;
    /**
     * The time interval between ejection sweep analysis.
     * 
     */
    private final VirtualNodeSpecListenerOutlierDetectionInterval interval;
    /**
     * Maximum percentage of hosts in load balancing pool for upstream service that can be ejected. Will eject at least one host regardless of the value.
     * Minimum value of `0`. Maximum value of `100`.
     * 
     */
    private final Integer maxEjectionPercent;
    /**
     * Number of consecutive `5xx` errors required for ejection. Minimum value of `1`.
     * 
     */
    private final Integer maxServerErrors;

    @OutputCustomType.Constructor({"baseEjectionDuration","interval","maxEjectionPercent","maxServerErrors"})
    private VirtualNodeSpecListenerOutlierDetection(
        VirtualNodeSpecListenerOutlierDetectionBaseEjectionDuration baseEjectionDuration,
        VirtualNodeSpecListenerOutlierDetectionInterval interval,
        Integer maxEjectionPercent,
        Integer maxServerErrors) {
        this.baseEjectionDuration = baseEjectionDuration;
        this.interval = interval;
        this.maxEjectionPercent = maxEjectionPercent;
        this.maxServerErrors = maxServerErrors;
    }

    /**
     * The base amount of time for which a host is ejected.
     * 
    */
    public VirtualNodeSpecListenerOutlierDetectionBaseEjectionDuration getBaseEjectionDuration() {
        return this.baseEjectionDuration;
    }
    /**
     * The time interval between ejection sweep analysis.
     * 
    */
    public VirtualNodeSpecListenerOutlierDetectionInterval getInterval() {
        return this.interval;
    }
    /**
     * Maximum percentage of hosts in load balancing pool for upstream service that can be ejected. Will eject at least one host regardless of the value.
     * Minimum value of `0`. Maximum value of `100`.
     * 
    */
    public Integer getMaxEjectionPercent() {
        return this.maxEjectionPercent;
    }
    /**
     * Number of consecutive `5xx` errors required for ejection. Minimum value of `1`.
     * 
    */
    public Integer getMaxServerErrors() {
        return this.maxServerErrors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerOutlierDetection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecListenerOutlierDetectionBaseEjectionDuration baseEjectionDuration;
        private VirtualNodeSpecListenerOutlierDetectionInterval interval;
        private Integer maxEjectionPercent;
        private Integer maxServerErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerOutlierDetection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseEjectionDuration = defaults.baseEjectionDuration;
    	      this.interval = defaults.interval;
    	      this.maxEjectionPercent = defaults.maxEjectionPercent;
    	      this.maxServerErrors = defaults.maxServerErrors;
        }

        public Builder setBaseEjectionDuration(VirtualNodeSpecListenerOutlierDetectionBaseEjectionDuration baseEjectionDuration) {
            this.baseEjectionDuration = Objects.requireNonNull(baseEjectionDuration);
            return this;
        }

        public Builder setInterval(VirtualNodeSpecListenerOutlierDetectionInterval interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }

        public Builder setMaxEjectionPercent(Integer maxEjectionPercent) {
            this.maxEjectionPercent = Objects.requireNonNull(maxEjectionPercent);
            return this;
        }

        public Builder setMaxServerErrors(Integer maxServerErrors) {
            this.maxServerErrors = Objects.requireNonNull(maxServerErrors);
            return this;
        }
        public VirtualNodeSpecListenerOutlierDetection build() {
            return new VirtualNodeSpecListenerOutlierDetection(baseEjectionDuration, interval, maxEjectionPercent, maxServerErrors);
        }
    }
}
