// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VolumeArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeArgs Empty = new VolumeArgs();

    @InputImport(name="throughputMibps")
    private final @Nullable Input<Double> throughputMibps;

    public Input<Double> getThroughputMibps() {
        return this.throughputMibps == null ? Input.empty() : this.throughputMibps;
    }

    /**
     * Maximum storage quota allowed for a file system in bytes. This is a soft quota used for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes.
     * 
     */
    @InputImport(name="usageThreshold", required=true)
    private final Input<Double> usageThreshold;

    public Input<Double> getUsageThreshold() {
        return this.usageThreshold;
    }

    public VolumeArgs(
        @Nullable Input<Double> throughputMibps,
        Input<Double> usageThreshold) {
        this.throughputMibps = throughputMibps == null ? Input.ofNullable(0e+00) : throughputMibps;
        this.usageThreshold = usageThreshold == null ? Input.ofNullable(1.073741824e+11) : Objects.requireNonNull(usageThreshold, "expected parameter 'usageThreshold' to be non-null");
    }

    private VolumeArgs() {
        this.throughputMibps = Input.empty();
        this.usageThreshold = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> throughputMibps;
        private Input<Double> usageThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.throughputMibps = defaults.throughputMibps;
    	      this.usageThreshold = defaults.usageThreshold;
        }

        public Builder setThroughputMibps(@Nullable Input<Double> throughputMibps) {
            this.throughputMibps = throughputMibps;
            return this;
        }

        public Builder setThroughputMibps(@Nullable Double throughputMibps) {
            this.throughputMibps = Input.ofNullable(throughputMibps);
            return this;
        }

        public Builder setUsageThreshold(Input<Double> usageThreshold) {
            this.usageThreshold = Objects.requireNonNull(usageThreshold);
            return this;
        }

        public Builder setUsageThreshold(Double usageThreshold) {
            this.usageThreshold = Input.of(Objects.requireNonNull(usageThreshold));
            return this;
        }

        public VolumeArgs build() {
            return new VolumeArgs(throughputMibps, usageThreshold);
        }
    }
}
