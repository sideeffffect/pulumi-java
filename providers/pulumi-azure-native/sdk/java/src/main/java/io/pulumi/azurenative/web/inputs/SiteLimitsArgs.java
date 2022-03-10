// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Metric limits set on an app.
 * 
 */
public final class SiteLimitsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SiteLimitsArgs Empty = new SiteLimitsArgs();

    /**
     * Maximum allowed disk size usage in MB.
     * 
     */
    @InputImport(name="maxDiskSizeInMb")
      private final @Nullable Input<Double> maxDiskSizeInMb;

    public Input<Double> getMaxDiskSizeInMb() {
        return this.maxDiskSizeInMb == null ? Input.empty() : this.maxDiskSizeInMb;
    }

    /**
     * Maximum allowed memory usage in MB.
     * 
     */
    @InputImport(name="maxMemoryInMb")
      private final @Nullable Input<Double> maxMemoryInMb;

    public Input<Double> getMaxMemoryInMb() {
        return this.maxMemoryInMb == null ? Input.empty() : this.maxMemoryInMb;
    }

    /**
     * Maximum allowed CPU usage percentage.
     * 
     */
    @InputImport(name="maxPercentageCpu")
      private final @Nullable Input<Double> maxPercentageCpu;

    public Input<Double> getMaxPercentageCpu() {
        return this.maxPercentageCpu == null ? Input.empty() : this.maxPercentageCpu;
    }

    public SiteLimitsArgs(
        @Nullable Input<Double> maxDiskSizeInMb,
        @Nullable Input<Double> maxMemoryInMb,
        @Nullable Input<Double> maxPercentageCpu) {
        this.maxDiskSizeInMb = maxDiskSizeInMb;
        this.maxMemoryInMb = maxMemoryInMb;
        this.maxPercentageCpu = maxPercentageCpu;
    }

    private SiteLimitsArgs() {
        this.maxDiskSizeInMb = Input.empty();
        this.maxMemoryInMb = Input.empty();
        this.maxPercentageCpu = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SiteLimitsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> maxDiskSizeInMb;
        private @Nullable Input<Double> maxMemoryInMb;
        private @Nullable Input<Double> maxPercentageCpu;

        public Builder() {
    	      // Empty
        }

        public Builder(SiteLimitsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxDiskSizeInMb = defaults.maxDiskSizeInMb;
    	      this.maxMemoryInMb = defaults.maxMemoryInMb;
    	      this.maxPercentageCpu = defaults.maxPercentageCpu;
        }

        public Builder maxDiskSizeInMb(@Nullable Input<Double> maxDiskSizeInMb) {
            this.maxDiskSizeInMb = maxDiskSizeInMb;
            return this;
        }

        public Builder maxDiskSizeInMb(@Nullable Double maxDiskSizeInMb) {
            this.maxDiskSizeInMb = Input.ofNullable(maxDiskSizeInMb);
            return this;
        }

        public Builder maxMemoryInMb(@Nullable Input<Double> maxMemoryInMb) {
            this.maxMemoryInMb = maxMemoryInMb;
            return this;
        }

        public Builder maxMemoryInMb(@Nullable Double maxMemoryInMb) {
            this.maxMemoryInMb = Input.ofNullable(maxMemoryInMb);
            return this;
        }

        public Builder maxPercentageCpu(@Nullable Input<Double> maxPercentageCpu) {
            this.maxPercentageCpu = maxPercentageCpu;
            return this;
        }

        public Builder maxPercentageCpu(@Nullable Double maxPercentageCpu) {
            this.maxPercentageCpu = Input.ofNullable(maxPercentageCpu);
            return this;
        }
        public SiteLimitsArgs build() {
            return new SiteLimitsArgs(maxDiskSizeInMb, maxMemoryInMb, maxPercentageCpu);
        }
    }
}
