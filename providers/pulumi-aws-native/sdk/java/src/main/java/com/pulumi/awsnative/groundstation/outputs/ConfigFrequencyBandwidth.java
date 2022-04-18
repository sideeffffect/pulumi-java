// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.groundstation.outputs;

import com.pulumi.awsnative.groundstation.enums.ConfigBandwidthUnits;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigFrequencyBandwidth {
    private final @Nullable ConfigBandwidthUnits units;
    private final @Nullable Double value;

    @CustomType.Constructor
    private ConfigFrequencyBandwidth(
        @CustomType.Parameter("units") @Nullable ConfigBandwidthUnits units,
        @CustomType.Parameter("value") @Nullable Double value) {
        this.units = units;
        this.value = value;
    }

    public Optional<ConfigBandwidthUnits> units() {
        return Optional.ofNullable(this.units);
    }
    public Optional<Double> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigFrequencyBandwidth defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConfigBandwidthUnits units;
        private @Nullable Double value;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigFrequencyBandwidth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.units = defaults.units;
    	      this.value = defaults.value;
        }

        public Builder units(@Nullable ConfigBandwidthUnits units) {
            this.units = units;
            return this;
        }
        public Builder value(@Nullable Double value) {
            this.value = value;
            return this;
        }        public ConfigFrequencyBandwidth build() {
            return new ConfigFrequencyBandwidth(units, value);
        }
    }
}
