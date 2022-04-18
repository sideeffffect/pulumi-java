// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;


/**
 * Scheduler settings for standard environment.
 * 
 */
public final class StandardSchedulerSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final StandardSchedulerSettingsResponse Empty = new StandardSchedulerSettingsResponse();

    /**
     * Maximum number of instances to run for this version. Set to zero to disable max_instances configuration.
     * 
     */
    @Import(name="maxInstances", required=true)
      private final Integer maxInstances;

    public Integer maxInstances() {
        return this.maxInstances;
    }

    /**
     * Minimum number of instances to run for this version. Set to zero to disable min_instances configuration.
     * 
     */
    @Import(name="minInstances", required=true)
      private final Integer minInstances;

    public Integer minInstances() {
        return this.minInstances;
    }

    /**
     * Target CPU utilization ratio to maintain when scaling.
     * 
     */
    @Import(name="targetCpuUtilization", required=true)
      private final Double targetCpuUtilization;

    public Double targetCpuUtilization() {
        return this.targetCpuUtilization;
    }

    /**
     * Target throughput utilization ratio to maintain when scaling
     * 
     */
    @Import(name="targetThroughputUtilization", required=true)
      private final Double targetThroughputUtilization;

    public Double targetThroughputUtilization() {
        return this.targetThroughputUtilization;
    }

    public StandardSchedulerSettingsResponse(
        Integer maxInstances,
        Integer minInstances,
        Double targetCpuUtilization,
        Double targetThroughputUtilization) {
        this.maxInstances = Objects.requireNonNull(maxInstances, "expected parameter 'maxInstances' to be non-null");
        this.minInstances = Objects.requireNonNull(minInstances, "expected parameter 'minInstances' to be non-null");
        this.targetCpuUtilization = Objects.requireNonNull(targetCpuUtilization, "expected parameter 'targetCpuUtilization' to be non-null");
        this.targetThroughputUtilization = Objects.requireNonNull(targetThroughputUtilization, "expected parameter 'targetThroughputUtilization' to be non-null");
    }

    private StandardSchedulerSettingsResponse() {
        this.maxInstances = null;
        this.minInstances = null;
        this.targetCpuUtilization = null;
        this.targetThroughputUtilization = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardSchedulerSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxInstances;
        private Integer minInstances;
        private Double targetCpuUtilization;
        private Double targetThroughputUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardSchedulerSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxInstances = defaults.maxInstances;
    	      this.minInstances = defaults.minInstances;
    	      this.targetCpuUtilization = defaults.targetCpuUtilization;
    	      this.targetThroughputUtilization = defaults.targetThroughputUtilization;
        }

        public Builder maxInstances(Integer maxInstances) {
            this.maxInstances = Objects.requireNonNull(maxInstances);
            return this;
        }
        public Builder minInstances(Integer minInstances) {
            this.minInstances = Objects.requireNonNull(minInstances);
            return this;
        }
        public Builder targetCpuUtilization(Double targetCpuUtilization) {
            this.targetCpuUtilization = Objects.requireNonNull(targetCpuUtilization);
            return this;
        }
        public Builder targetThroughputUtilization(Double targetThroughputUtilization) {
            this.targetThroughputUtilization = Objects.requireNonNull(targetThroughputUtilization);
            return this;
        }        public StandardSchedulerSettingsResponse build() {
            return new StandardSchedulerSettingsResponse(maxInstances, minInstances, targetCpuUtilization, targetThroughputUtilization);
        }
    }
}
