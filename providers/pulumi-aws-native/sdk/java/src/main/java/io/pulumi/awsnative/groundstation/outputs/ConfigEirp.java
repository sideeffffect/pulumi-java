// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.outputs;

import io.pulumi.awsnative.groundstation.enums.ConfigEirpUnits;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConfigEirp {
    private final @Nullable ConfigEirpUnits units;
    private final @Nullable Double value;

    @OutputCustomType.Constructor
    private ConfigEirp(
        @OutputCustomType.Parameter("units") @Nullable ConfigEirpUnits units,
        @OutputCustomType.Parameter("value") @Nullable Double value) {
        this.units = units;
        this.value = value;
    }

    public Optional<ConfigEirpUnits> getUnits() {
        return Optional.ofNullable(this.units);
    }
    public Optional<Double> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigEirp defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConfigEirpUnits units;
        private @Nullable Double value;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigEirp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.units = defaults.units;
    	      this.value = defaults.value;
        }

        public Builder units(@Nullable ConfigEirpUnits units) {
            this.units = units;
            return this;
        }

        public Builder value(@Nullable Double value) {
            this.value = value;
            return this;
        }
        public ConfigEirp build() {
            return new ConfigEirp(units, value);
        }
    }
}
