// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointConfigurationAsyncInferenceConfigClientConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointConfigurationAsyncInferenceConfigClientConfigGetArgs Empty = new EndpointConfigurationAsyncInferenceConfigClientConfigGetArgs();

    /**
     * The maximum number of concurrent requests sent by the SageMaker client to the model container. If no value is provided, Amazon SageMaker will choose an optimal value for you.
     * 
     */
    @InputImport(name="maxConcurrentInvocationsPerInstance")
      private final @Nullable Input<Integer> maxConcurrentInvocationsPerInstance;

    public Input<Integer> getMaxConcurrentInvocationsPerInstance() {
        return this.maxConcurrentInvocationsPerInstance == null ? Input.empty() : this.maxConcurrentInvocationsPerInstance;
    }

    public EndpointConfigurationAsyncInferenceConfigClientConfigGetArgs(@Nullable Input<Integer> maxConcurrentInvocationsPerInstance) {
        this.maxConcurrentInvocationsPerInstance = maxConcurrentInvocationsPerInstance;
    }

    private EndpointConfigurationAsyncInferenceConfigClientConfigGetArgs() {
        this.maxConcurrentInvocationsPerInstance = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConfigurationAsyncInferenceConfigClientConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> maxConcurrentInvocationsPerInstance;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConfigurationAsyncInferenceConfigClientConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxConcurrentInvocationsPerInstance = defaults.maxConcurrentInvocationsPerInstance;
        }

        public Builder maxConcurrentInvocationsPerInstance(@Nullable Input<Integer> maxConcurrentInvocationsPerInstance) {
            this.maxConcurrentInvocationsPerInstance = maxConcurrentInvocationsPerInstance;
            return this;
        }

        public Builder maxConcurrentInvocationsPerInstance(@Nullable Integer maxConcurrentInvocationsPerInstance) {
            this.maxConcurrentInvocationsPerInstance = Input.ofNullable(maxConcurrentInvocationsPerInstance);
            return this;
        }
        public EndpointConfigurationAsyncInferenceConfigClientConfigGetArgs build() {
            return new EndpointConfigurationAsyncInferenceConfigClientConfigGetArgs(maxConcurrentInvocationsPerInstance);
        }
    }
}
