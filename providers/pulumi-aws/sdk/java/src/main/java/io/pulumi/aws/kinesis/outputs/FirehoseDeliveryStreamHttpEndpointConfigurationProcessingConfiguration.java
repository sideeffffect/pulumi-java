// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessor;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration {
    /**
     * Enables or disables data processing.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * Array of data processors. More details are given below
     * 
     */
    private final @Nullable List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessor> processors;

    @OutputCustomType.Constructor
    private FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration(
        @OutputCustomType.Parameter("enabled") @Nullable Boolean enabled,
        @OutputCustomType.Parameter("processors") @Nullable List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessor> processors) {
        this.enabled = enabled;
        this.processors = processors;
    }

    /**
     * Enables or disables data processing.
     * 
    */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * Array of data processors. More details are given below
     * 
    */
    public List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessor> getProcessors() {
        return this.processors == null ? List.of() : this.processors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessor> processors;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.processors = defaults.processors;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder processors(@Nullable List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessor> processors) {
            this.processors = processors;
            return this;
        }
        public FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration build() {
            return new FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration(enabled, processors);
        }
    }
}
