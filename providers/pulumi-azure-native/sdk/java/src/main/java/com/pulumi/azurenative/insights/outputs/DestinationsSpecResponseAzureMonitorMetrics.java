// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DestinationsSpecResponseAzureMonitorMetrics {
    /**
     * @return A friendly name for the destination.
     * This name should be unique across all destinations (regardless of type) within the data collection rule.
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private DestinationsSpecResponseAzureMonitorMetrics(@CustomType.Parameter("name") @Nullable String name) {
        this.name = name;
    }

    /**
     * @return A friendly name for the destination.
     * This name should be unique across all destinations (regardless of type) within the data collection rule.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DestinationsSpecResponseAzureMonitorMetrics defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DestinationsSpecResponseAzureMonitorMetrics defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public DestinationsSpecResponseAzureMonitorMetrics build() {
            return new DestinationsSpecResponseAzureMonitorMetrics(name);
        }
    }
}
