// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure Monitor Metrics destination.
 * 
 */
public final class DestinationsSpecAzureMonitorMetricsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DestinationsSpecAzureMonitorMetricsArgs Empty = new DestinationsSpecAzureMonitorMetricsArgs();

    /**
     * A friendly name for the destination.
     * This name should be unique across all destinations (regardless of type) within the data collection rule.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public DestinationsSpecAzureMonitorMetricsArgs(@Nullable Input<String> name) {
        this.name = name;
    }

    private DestinationsSpecAzureMonitorMetricsArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DestinationsSpecAzureMonitorMetricsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(DestinationsSpecAzureMonitorMetricsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public DestinationsSpecAzureMonitorMetricsArgs build() {
            return new DestinationsSpecAzureMonitorMetricsArgs(name);
        }
    }
}
