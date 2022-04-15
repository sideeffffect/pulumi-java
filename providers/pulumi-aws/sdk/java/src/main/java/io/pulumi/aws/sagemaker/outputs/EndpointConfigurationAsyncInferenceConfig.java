// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.aws.sagemaker.outputs.EndpointConfigurationAsyncInferenceConfigClientConfig;
import io.pulumi.aws.sagemaker.outputs.EndpointConfigurationAsyncInferenceConfigOutputConfig;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointConfigurationAsyncInferenceConfig {
    /**
     * Configures the behavior of the client used by Amazon SageMaker to interact with the model container during asynchronous inference.
     * 
     */
    private final @Nullable EndpointConfigurationAsyncInferenceConfigClientConfig clientConfig;
    /**
     * Specifies the configuration for asynchronous inference invocation outputs.
     * 
     */
    private final EndpointConfigurationAsyncInferenceConfigOutputConfig outputConfig;

    @CustomType.Constructor
    private EndpointConfigurationAsyncInferenceConfig(
        @CustomType.Parameter("clientConfig") @Nullable EndpointConfigurationAsyncInferenceConfigClientConfig clientConfig,
        @CustomType.Parameter("outputConfig") EndpointConfigurationAsyncInferenceConfigOutputConfig outputConfig) {
        this.clientConfig = clientConfig;
        this.outputConfig = outputConfig;
    }

    /**
     * Configures the behavior of the client used by Amazon SageMaker to interact with the model container during asynchronous inference.
     * 
    */
    public Optional<EndpointConfigurationAsyncInferenceConfigClientConfig> clientConfig() {
        return Optional.ofNullable(this.clientConfig);
    }
    /**
     * Specifies the configuration for asynchronous inference invocation outputs.
     * 
    */
    public EndpointConfigurationAsyncInferenceConfigOutputConfig outputConfig() {
        return this.outputConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConfigurationAsyncInferenceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EndpointConfigurationAsyncInferenceConfigClientConfig clientConfig;
        private EndpointConfigurationAsyncInferenceConfigOutputConfig outputConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConfigurationAsyncInferenceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientConfig = defaults.clientConfig;
    	      this.outputConfig = defaults.outputConfig;
        }

        public Builder clientConfig(@Nullable EndpointConfigurationAsyncInferenceConfigClientConfig clientConfig) {
            this.clientConfig = clientConfig;
            return this;
        }
        public Builder outputConfig(EndpointConfigurationAsyncInferenceConfigOutputConfig outputConfig) {
            this.outputConfig = Objects.requireNonNull(outputConfig);
            return this;
        }        public EndpointConfigurationAsyncInferenceConfig build() {
            return new EndpointConfigurationAsyncInferenceConfig(clientConfig, outputConfig);
        }
    }
}
