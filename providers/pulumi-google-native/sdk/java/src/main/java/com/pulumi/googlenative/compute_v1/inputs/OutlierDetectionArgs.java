// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_v1.inputs.DurationArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings controlling the eviction of unhealthy hosts from the load balancing pool for the backend service.
 * 
 */
public final class OutlierDetectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final OutlierDetectionArgs Empty = new OutlierDetectionArgs();

    /**
     * The base time that a host is ejected for. The real ejection time is equal to the base ejection time multiplied by the number of times the host has been ejected. Defaults to 30000ms or 30s.
     * 
     */
    @Import(name="baseEjectionTime")
    private @Nullable Output<DurationArgs> baseEjectionTime;

    public Optional<Output<DurationArgs>> baseEjectionTime() {
        return Optional.ofNullable(this.baseEjectionTime);
    }

    /**
     * Number of errors before a host is ejected from the connection pool. When the backend host is accessed over HTTP, a 5xx return code qualifies as an error. Defaults to 5.
     * 
     */
    @Import(name="consecutiveErrors")
    private @Nullable Output<Integer> consecutiveErrors;

    public Optional<Output<Integer>> consecutiveErrors() {
        return Optional.ofNullable(this.consecutiveErrors);
    }

    /**
     * The number of consecutive gateway failures (502, 503, 504 status or connection errors that are mapped to one of those status codes) before a consecutive gateway failure ejection occurs. Defaults to 3.
     * 
     */
    @Import(name="consecutiveGatewayFailure")
    private @Nullable Output<Integer> consecutiveGatewayFailure;

    public Optional<Output<Integer>> consecutiveGatewayFailure() {
        return Optional.ofNullable(this.consecutiveGatewayFailure);
    }

    /**
     * The percentage chance that a host will be actually ejected when an outlier status is detected through consecutive 5xx. This setting can be used to disable ejection or to ramp it up slowly. Defaults to 0.
     * 
     */
    @Import(name="enforcingConsecutiveErrors")
    private @Nullable Output<Integer> enforcingConsecutiveErrors;

    public Optional<Output<Integer>> enforcingConsecutiveErrors() {
        return Optional.ofNullable(this.enforcingConsecutiveErrors);
    }

    /**
     * The percentage chance that a host will be actually ejected when an outlier status is detected through consecutive gateway failures. This setting can be used to disable ejection or to ramp it up slowly. Defaults to 100.
     * 
     */
    @Import(name="enforcingConsecutiveGatewayFailure")
    private @Nullable Output<Integer> enforcingConsecutiveGatewayFailure;

    public Optional<Output<Integer>> enforcingConsecutiveGatewayFailure() {
        return Optional.ofNullable(this.enforcingConsecutiveGatewayFailure);
    }

    /**
     * The percentage chance that a host will be actually ejected when an outlier status is detected through success rate statistics. This setting can be used to disable ejection or to ramp it up slowly. Defaults to 100.
     * 
     */
    @Import(name="enforcingSuccessRate")
    private @Nullable Output<Integer> enforcingSuccessRate;

    public Optional<Output<Integer>> enforcingSuccessRate() {
        return Optional.ofNullable(this.enforcingSuccessRate);
    }

    /**
     * Time interval between ejection analysis sweeps. This can result in both new ejections as well as hosts being returned to service. Defaults to 1 second.
     * 
     */
    @Import(name="interval")
    private @Nullable Output<DurationArgs> interval;

    public Optional<Output<DurationArgs>> interval() {
        return Optional.ofNullable(this.interval);
    }

    /**
     * Maximum percentage of hosts in the load balancing pool for the backend service that can be ejected. Defaults to 50%.
     * 
     */
    @Import(name="maxEjectionPercent")
    private @Nullable Output<Integer> maxEjectionPercent;

    public Optional<Output<Integer>> maxEjectionPercent() {
        return Optional.ofNullable(this.maxEjectionPercent);
    }

    /**
     * The number of hosts in a cluster that must have enough request volume to detect success rate outliers. If the number of hosts is less than this setting, outlier detection via success rate statistics is not performed for any host in the cluster. Defaults to 5.
     * 
     */
    @Import(name="successRateMinimumHosts")
    private @Nullable Output<Integer> successRateMinimumHosts;

    public Optional<Output<Integer>> successRateMinimumHosts() {
        return Optional.ofNullable(this.successRateMinimumHosts);
    }

    /**
     * The minimum number of total requests that must be collected in one interval (as defined by the interval duration above) to include this host in success rate based outlier detection. If the volume is lower than this setting, outlier detection via success rate statistics is not performed for that host. Defaults to 100.
     * 
     */
    @Import(name="successRateRequestVolume")
    private @Nullable Output<Integer> successRateRequestVolume;

    public Optional<Output<Integer>> successRateRequestVolume() {
        return Optional.ofNullable(this.successRateRequestVolume);
    }

    /**
     * This factor is used to determine the ejection threshold for success rate outlier ejection. The ejection threshold is the difference between the mean success rate, and the product of this factor and the standard deviation of the mean success rate: mean - (stdev * success_rate_stdev_factor). This factor is divided by a thousand to get a double. That is, if the desired factor is 1.9, the runtime value should be 1900. Defaults to 1900.
     * 
     */
    @Import(name="successRateStdevFactor")
    private @Nullable Output<Integer> successRateStdevFactor;

    public Optional<Output<Integer>> successRateStdevFactor() {
        return Optional.ofNullable(this.successRateStdevFactor);
    }

    private OutlierDetectionArgs() {}

    private OutlierDetectionArgs(OutlierDetectionArgs $) {
        this.baseEjectionTime = $.baseEjectionTime;
        this.consecutiveErrors = $.consecutiveErrors;
        this.consecutiveGatewayFailure = $.consecutiveGatewayFailure;
        this.enforcingConsecutiveErrors = $.enforcingConsecutiveErrors;
        this.enforcingConsecutiveGatewayFailure = $.enforcingConsecutiveGatewayFailure;
        this.enforcingSuccessRate = $.enforcingSuccessRate;
        this.interval = $.interval;
        this.maxEjectionPercent = $.maxEjectionPercent;
        this.successRateMinimumHosts = $.successRateMinimumHosts;
        this.successRateRequestVolume = $.successRateRequestVolume;
        this.successRateStdevFactor = $.successRateStdevFactor;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OutlierDetectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OutlierDetectionArgs $;

        public Builder() {
            $ = new OutlierDetectionArgs();
        }

        public Builder(OutlierDetectionArgs defaults) {
            $ = new OutlierDetectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder baseEjectionTime(@Nullable Output<DurationArgs> baseEjectionTime) {
            $.baseEjectionTime = baseEjectionTime;
            return this;
        }

        public Builder baseEjectionTime(DurationArgs baseEjectionTime) {
            return baseEjectionTime(Output.of(baseEjectionTime));
        }

        public Builder consecutiveErrors(@Nullable Output<Integer> consecutiveErrors) {
            $.consecutiveErrors = consecutiveErrors;
            return this;
        }

        public Builder consecutiveErrors(Integer consecutiveErrors) {
            return consecutiveErrors(Output.of(consecutiveErrors));
        }

        public Builder consecutiveGatewayFailure(@Nullable Output<Integer> consecutiveGatewayFailure) {
            $.consecutiveGatewayFailure = consecutiveGatewayFailure;
            return this;
        }

        public Builder consecutiveGatewayFailure(Integer consecutiveGatewayFailure) {
            return consecutiveGatewayFailure(Output.of(consecutiveGatewayFailure));
        }

        public Builder enforcingConsecutiveErrors(@Nullable Output<Integer> enforcingConsecutiveErrors) {
            $.enforcingConsecutiveErrors = enforcingConsecutiveErrors;
            return this;
        }

        public Builder enforcingConsecutiveErrors(Integer enforcingConsecutiveErrors) {
            return enforcingConsecutiveErrors(Output.of(enforcingConsecutiveErrors));
        }

        public Builder enforcingConsecutiveGatewayFailure(@Nullable Output<Integer> enforcingConsecutiveGatewayFailure) {
            $.enforcingConsecutiveGatewayFailure = enforcingConsecutiveGatewayFailure;
            return this;
        }

        public Builder enforcingConsecutiveGatewayFailure(Integer enforcingConsecutiveGatewayFailure) {
            return enforcingConsecutiveGatewayFailure(Output.of(enforcingConsecutiveGatewayFailure));
        }

        public Builder enforcingSuccessRate(@Nullable Output<Integer> enforcingSuccessRate) {
            $.enforcingSuccessRate = enforcingSuccessRate;
            return this;
        }

        public Builder enforcingSuccessRate(Integer enforcingSuccessRate) {
            return enforcingSuccessRate(Output.of(enforcingSuccessRate));
        }

        public Builder interval(@Nullable Output<DurationArgs> interval) {
            $.interval = interval;
            return this;
        }

        public Builder interval(DurationArgs interval) {
            return interval(Output.of(interval));
        }

        public Builder maxEjectionPercent(@Nullable Output<Integer> maxEjectionPercent) {
            $.maxEjectionPercent = maxEjectionPercent;
            return this;
        }

        public Builder maxEjectionPercent(Integer maxEjectionPercent) {
            return maxEjectionPercent(Output.of(maxEjectionPercent));
        }

        public Builder successRateMinimumHosts(@Nullable Output<Integer> successRateMinimumHosts) {
            $.successRateMinimumHosts = successRateMinimumHosts;
            return this;
        }

        public Builder successRateMinimumHosts(Integer successRateMinimumHosts) {
            return successRateMinimumHosts(Output.of(successRateMinimumHosts));
        }

        public Builder successRateRequestVolume(@Nullable Output<Integer> successRateRequestVolume) {
            $.successRateRequestVolume = successRateRequestVolume;
            return this;
        }

        public Builder successRateRequestVolume(Integer successRateRequestVolume) {
            return successRateRequestVolume(Output.of(successRateRequestVolume));
        }

        public Builder successRateStdevFactor(@Nullable Output<Integer> successRateStdevFactor) {
            $.successRateStdevFactor = successRateStdevFactor;
            return this;
        }

        public Builder successRateStdevFactor(Integer successRateStdevFactor) {
            return successRateStdevFactor(Output.of(successRateStdevFactor));
        }

        public OutlierDetectionArgs build() {
            return $;
        }
    }

}
