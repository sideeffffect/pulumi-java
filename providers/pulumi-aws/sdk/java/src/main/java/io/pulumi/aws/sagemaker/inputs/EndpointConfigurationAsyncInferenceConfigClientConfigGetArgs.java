// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointConfigurationAsyncInferenceConfigClientConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointConfigurationAsyncInferenceConfigClientConfigGetArgs Empty = new EndpointConfigurationAsyncInferenceConfigClientConfigGetArgs();

    /**
     * The maximum number of concurrent requests sent by the SageMaker client to the model container. If no value is provided, Amazon SageMaker will choose an optimal value for you.
     * 
     */
    @Import(name="maxConcurrentInvocationsPerInstance")
      private final @Nullable Output<Integer> maxConcurrentInvocationsPerInstance;

    public Output<Integer> maxConcurrentInvocationsPerInstance() {
        return this.maxConcurrentInvocationsPerInstance == null ? Codegen.empty() : this.maxConcurrentInvocationsPerInstance;
    }

    public EndpointConfigurationAsyncInferenceConfigClientConfigGetArgs(@Nullable Output<Integer> maxConcurrentInvocationsPerInstance) {
        this.maxConcurrentInvocationsPerInstance = maxConcurrentInvocationsPerInstance;
    }

    private EndpointConfigurationAsyncInferenceConfigClientConfigGetArgs() {
        this.maxConcurrentInvocationsPerInstance = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConfigurationAsyncInferenceConfigClientConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxConcurrentInvocationsPerInstance;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConfigurationAsyncInferenceConfigClientConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxConcurrentInvocationsPerInstance = defaults.maxConcurrentInvocationsPerInstance;
        }

        public Builder maxConcurrentInvocationsPerInstance(@Nullable Output<Integer> maxConcurrentInvocationsPerInstance) {
            this.maxConcurrentInvocationsPerInstance = maxConcurrentInvocationsPerInstance;
            return this;
        }
        public Builder maxConcurrentInvocationsPerInstance(@Nullable Integer maxConcurrentInvocationsPerInstance) {
            this.maxConcurrentInvocationsPerInstance = Codegen.ofNullable(maxConcurrentInvocationsPerInstance);
            return this;
        }        public EndpointConfigurationAsyncInferenceConfigClientConfigGetArgs build() {
            return new EndpointConfigurationAsyncInferenceConfigClientConfigGetArgs(maxConcurrentInvocationsPerInstance);
        }
    }
}
