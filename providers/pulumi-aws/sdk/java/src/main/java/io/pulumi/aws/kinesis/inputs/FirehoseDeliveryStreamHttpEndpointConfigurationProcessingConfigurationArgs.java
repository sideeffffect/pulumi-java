// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationArgs Empty = new FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationArgs();

    /**
     * Enables or disables data processing.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Array of data processors. More details are given below
     * 
     */
    @InputImport(name="processors")
      private final @Nullable Input<List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorArgs>> processors;

    public Input<List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorArgs>> getProcessors() {
        return this.processors == null ? Input.empty() : this.processors;
    }

    public FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorArgs>> processors) {
        this.enabled = enabled;
        this.processors = processors;
    }

    private FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationArgs() {
        this.enabled = Input.empty();
        this.processors = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorArgs>> processors;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.processors = defaults.processors;
        }

        public Builder enabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder processors(@Nullable Input<List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorArgs>> processors) {
            this.processors = processors;
            return this;
        }

        public Builder processors(@Nullable List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorArgs> processors) {
            this.processors = Input.ofNullable(processors);
            return this;
        }
        public FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationArgs build() {
            return new FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationArgs(enabled, processors);
        }
    }
}
