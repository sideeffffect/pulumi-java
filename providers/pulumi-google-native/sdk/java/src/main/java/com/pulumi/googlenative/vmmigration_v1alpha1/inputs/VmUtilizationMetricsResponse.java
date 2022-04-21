// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Utilization metrics values for a single VM.
 * 
 */
public final class VmUtilizationMetricsResponse extends com.pulumi.resources.InvokeArgs {

    public static final VmUtilizationMetricsResponse Empty = new VmUtilizationMetricsResponse();

    /**
     * Average CPU usage, percent.
     * 
     */
    @Import(name="cpuAverage", required=true)
    private Integer cpuAverage;

    public Integer cpuAverage() {
        return this.cpuAverage;
    }

    /**
     * Average CPU usage, percent.
     * 
     */
    @Import(name="cpuAveragePercent", required=true)
    private Integer cpuAveragePercent;

    public Integer cpuAveragePercent() {
        return this.cpuAveragePercent;
    }

    /**
     * Max CPU usage, percent.
     * 
     */
    @Import(name="cpuMax", required=true)
    private Integer cpuMax;

    public Integer cpuMax() {
        return this.cpuMax;
    }

    /**
     * Max CPU usage, percent.
     * 
     */
    @Import(name="cpuMaxPercent", required=true)
    private Integer cpuMaxPercent;

    public Integer cpuMaxPercent() {
        return this.cpuMaxPercent;
    }

    /**
     * Average disk IO rate, in kilobytes per second.
     * 
     */
    @Import(name="diskIoRateAverage", required=true)
    private String diskIoRateAverage;

    public String diskIoRateAverage() {
        return this.diskIoRateAverage;
    }

    /**
     * Average disk IO rate, in kilobytes per second.
     * 
     */
    @Import(name="diskIoRateAverageKbps", required=true)
    private String diskIoRateAverageKbps;

    public String diskIoRateAverageKbps() {
        return this.diskIoRateAverageKbps;
    }

    /**
     * Max disk IO rate, in kilobytes per second.
     * 
     */
    @Import(name="diskIoRateMax", required=true)
    private String diskIoRateMax;

    public String diskIoRateMax() {
        return this.diskIoRateMax;
    }

    /**
     * Max disk IO rate, in kilobytes per second.
     * 
     */
    @Import(name="diskIoRateMaxKbps", required=true)
    private String diskIoRateMaxKbps;

    public String diskIoRateMaxKbps() {
        return this.diskIoRateMaxKbps;
    }

    /**
     * Average memory usage, percent.
     * 
     */
    @Import(name="memoryAverage", required=true)
    private Integer memoryAverage;

    public Integer memoryAverage() {
        return this.memoryAverage;
    }

    /**
     * Average memory usage, percent.
     * 
     */
    @Import(name="memoryAveragePercent", required=true)
    private Integer memoryAveragePercent;

    public Integer memoryAveragePercent() {
        return this.memoryAveragePercent;
    }

    /**
     * Max memory usage, percent.
     * 
     */
    @Import(name="memoryMax", required=true)
    private Integer memoryMax;

    public Integer memoryMax() {
        return this.memoryMax;
    }

    /**
     * Max memory usage, percent.
     * 
     */
    @Import(name="memoryMaxPercent", required=true)
    private Integer memoryMaxPercent;

    public Integer memoryMaxPercent() {
        return this.memoryMaxPercent;
    }

    /**
     * Average network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    @Import(name="networkThroughputAverage", required=true)
    private String networkThroughputAverage;

    public String networkThroughputAverage() {
        return this.networkThroughputAverage;
    }

    /**
     * Average network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    @Import(name="networkThroughputAverageKbps", required=true)
    private String networkThroughputAverageKbps;

    public String networkThroughputAverageKbps() {
        return this.networkThroughputAverageKbps;
    }

    /**
     * Max network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    @Import(name="networkThroughputMax", required=true)
    private String networkThroughputMax;

    public String networkThroughputMax() {
        return this.networkThroughputMax;
    }

    /**
     * Max network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    @Import(name="networkThroughputMaxKbps", required=true)
    private String networkThroughputMaxKbps;

    public String networkThroughputMaxKbps() {
        return this.networkThroughputMaxKbps;
    }

    private VmUtilizationMetricsResponse() {}

    private VmUtilizationMetricsResponse(VmUtilizationMetricsResponse $) {
        this.cpuAverage = $.cpuAverage;
        this.cpuAveragePercent = $.cpuAveragePercent;
        this.cpuMax = $.cpuMax;
        this.cpuMaxPercent = $.cpuMaxPercent;
        this.diskIoRateAverage = $.diskIoRateAverage;
        this.diskIoRateAverageKbps = $.diskIoRateAverageKbps;
        this.diskIoRateMax = $.diskIoRateMax;
        this.diskIoRateMaxKbps = $.diskIoRateMaxKbps;
        this.memoryAverage = $.memoryAverage;
        this.memoryAveragePercent = $.memoryAveragePercent;
        this.memoryMax = $.memoryMax;
        this.memoryMaxPercent = $.memoryMaxPercent;
        this.networkThroughputAverage = $.networkThroughputAverage;
        this.networkThroughputAverageKbps = $.networkThroughputAverageKbps;
        this.networkThroughputMax = $.networkThroughputMax;
        this.networkThroughputMaxKbps = $.networkThroughputMaxKbps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VmUtilizationMetricsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VmUtilizationMetricsResponse $;

        public Builder() {
            $ = new VmUtilizationMetricsResponse();
        }

        public Builder(VmUtilizationMetricsResponse defaults) {
            $ = new VmUtilizationMetricsResponse(Objects.requireNonNull(defaults));
        }

        public Builder cpuAverage(Integer cpuAverage) {
            $.cpuAverage = cpuAverage;
            return this;
        }

        public Builder cpuAveragePercent(Integer cpuAveragePercent) {
            $.cpuAveragePercent = cpuAveragePercent;
            return this;
        }

        public Builder cpuMax(Integer cpuMax) {
            $.cpuMax = cpuMax;
            return this;
        }

        public Builder cpuMaxPercent(Integer cpuMaxPercent) {
            $.cpuMaxPercent = cpuMaxPercent;
            return this;
        }

        public Builder diskIoRateAverage(String diskIoRateAverage) {
            $.diskIoRateAverage = diskIoRateAverage;
            return this;
        }

        public Builder diskIoRateAverageKbps(String diskIoRateAverageKbps) {
            $.diskIoRateAverageKbps = diskIoRateAverageKbps;
            return this;
        }

        public Builder diskIoRateMax(String diskIoRateMax) {
            $.diskIoRateMax = diskIoRateMax;
            return this;
        }

        public Builder diskIoRateMaxKbps(String diskIoRateMaxKbps) {
            $.diskIoRateMaxKbps = diskIoRateMaxKbps;
            return this;
        }

        public Builder memoryAverage(Integer memoryAverage) {
            $.memoryAverage = memoryAverage;
            return this;
        }

        public Builder memoryAveragePercent(Integer memoryAveragePercent) {
            $.memoryAveragePercent = memoryAveragePercent;
            return this;
        }

        public Builder memoryMax(Integer memoryMax) {
            $.memoryMax = memoryMax;
            return this;
        }

        public Builder memoryMaxPercent(Integer memoryMaxPercent) {
            $.memoryMaxPercent = memoryMaxPercent;
            return this;
        }

        public Builder networkThroughputAverage(String networkThroughputAverage) {
            $.networkThroughputAverage = networkThroughputAverage;
            return this;
        }

        public Builder networkThroughputAverageKbps(String networkThroughputAverageKbps) {
            $.networkThroughputAverageKbps = networkThroughputAverageKbps;
            return this;
        }

        public Builder networkThroughputMax(String networkThroughputMax) {
            $.networkThroughputMax = networkThroughputMax;
            return this;
        }

        public Builder networkThroughputMaxKbps(String networkThroughputMaxKbps) {
            $.networkThroughputMaxKbps = networkThroughputMaxKbps;
            return this;
        }

        public VmUtilizationMetricsResponse build() {
            $.cpuAverage = Objects.requireNonNull($.cpuAverage, "expected parameter 'cpuAverage' to be non-null");
            $.cpuAveragePercent = Objects.requireNonNull($.cpuAveragePercent, "expected parameter 'cpuAveragePercent' to be non-null");
            $.cpuMax = Objects.requireNonNull($.cpuMax, "expected parameter 'cpuMax' to be non-null");
            $.cpuMaxPercent = Objects.requireNonNull($.cpuMaxPercent, "expected parameter 'cpuMaxPercent' to be non-null");
            $.diskIoRateAverage = Objects.requireNonNull($.diskIoRateAverage, "expected parameter 'diskIoRateAverage' to be non-null");
            $.diskIoRateAverageKbps = Objects.requireNonNull($.diskIoRateAverageKbps, "expected parameter 'diskIoRateAverageKbps' to be non-null");
            $.diskIoRateMax = Objects.requireNonNull($.diskIoRateMax, "expected parameter 'diskIoRateMax' to be non-null");
            $.diskIoRateMaxKbps = Objects.requireNonNull($.diskIoRateMaxKbps, "expected parameter 'diskIoRateMaxKbps' to be non-null");
            $.memoryAverage = Objects.requireNonNull($.memoryAverage, "expected parameter 'memoryAverage' to be non-null");
            $.memoryAveragePercent = Objects.requireNonNull($.memoryAveragePercent, "expected parameter 'memoryAveragePercent' to be non-null");
            $.memoryMax = Objects.requireNonNull($.memoryMax, "expected parameter 'memoryMax' to be non-null");
            $.memoryMaxPercent = Objects.requireNonNull($.memoryMaxPercent, "expected parameter 'memoryMaxPercent' to be non-null");
            $.networkThroughputAverage = Objects.requireNonNull($.networkThroughputAverage, "expected parameter 'networkThroughputAverage' to be non-null");
            $.networkThroughputAverageKbps = Objects.requireNonNull($.networkThroughputAverageKbps, "expected parameter 'networkThroughputAverageKbps' to be non-null");
            $.networkThroughputMax = Objects.requireNonNull($.networkThroughputMax, "expected parameter 'networkThroughputMax' to be non-null");
            $.networkThroughputMaxKbps = Objects.requireNonNull($.networkThroughputMaxKbps, "expected parameter 'networkThroughputMaxKbps' to be non-null");
            return $;
        }
    }

}
