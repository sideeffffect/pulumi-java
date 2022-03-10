// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.azurenative.customerinsights.enums.FrequencyTypes;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Connector mapping property availability.
 * 
 */
public final class ConnectorMappingAvailabilityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorMappingAvailabilityArgs Empty = new ConnectorMappingAvailabilityArgs();

    /**
     * The frequency to update.
     * 
     */
    @InputImport(name="frequency")
      private final @Nullable Input<FrequencyTypes> frequency;

    public Input<FrequencyTypes> getFrequency() {
        return this.frequency == null ? Input.empty() : this.frequency;
    }

    /**
     * The interval of the given frequency to use.
     * 
     */
    @InputImport(name="interval", required=true)
      private final Input<Integer> interval;

    public Input<Integer> getInterval() {
        return this.interval;
    }

    public ConnectorMappingAvailabilityArgs(
        @Nullable Input<FrequencyTypes> frequency,
        Input<Integer> interval) {
        this.frequency = frequency;
        this.interval = Objects.requireNonNull(interval, "expected parameter 'interval' to be non-null");
    }

    private ConnectorMappingAvailabilityArgs() {
        this.frequency = Input.empty();
        this.interval = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorMappingAvailabilityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FrequencyTypes> frequency;
        private Input<Integer> interval;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorMappingAvailabilityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frequency = defaults.frequency;
    	      this.interval = defaults.interval;
        }

        public Builder frequency(@Nullable Input<FrequencyTypes> frequency) {
            this.frequency = frequency;
            return this;
        }

        public Builder frequency(@Nullable FrequencyTypes frequency) {
            this.frequency = Input.ofNullable(frequency);
            return this;
        }

        public Builder interval(Input<Integer> interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }

        public Builder interval(Integer interval) {
            this.interval = Input.of(Objects.requireNonNull(interval));
            return this;
        }
        public ConnectorMappingAvailabilityArgs build() {
            return new ConnectorMappingAvailabilityArgs(frequency, interval);
        }
    }
}
