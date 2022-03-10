// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsProcessingConfigurationLambdaGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


public final class AnalyticsApplicationInputsProcessingConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationInputsProcessingConfigurationGetArgs Empty = new AnalyticsApplicationInputsProcessingConfigurationGetArgs();

    /**
     * The Lambda function configuration. See Lambda below for more details.
     * 
     */
    @InputImport(name="lambda", required=true)
      private final Input<AnalyticsApplicationInputsProcessingConfigurationLambdaGetArgs> lambda;

    public Input<AnalyticsApplicationInputsProcessingConfigurationLambdaGetArgs> getLambda() {
        return this.lambda;
    }

    public AnalyticsApplicationInputsProcessingConfigurationGetArgs(Input<AnalyticsApplicationInputsProcessingConfigurationLambdaGetArgs> lambda) {
        this.lambda = Objects.requireNonNull(lambda, "expected parameter 'lambda' to be non-null");
    }

    private AnalyticsApplicationInputsProcessingConfigurationGetArgs() {
        this.lambda = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationInputsProcessingConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<AnalyticsApplicationInputsProcessingConfigurationLambdaGetArgs> lambda;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationInputsProcessingConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lambda = defaults.lambda;
        }

        public Builder lambda(Input<AnalyticsApplicationInputsProcessingConfigurationLambdaGetArgs> lambda) {
            this.lambda = Objects.requireNonNull(lambda);
            return this;
        }

        public Builder lambda(AnalyticsApplicationInputsProcessingConfigurationLambdaGetArgs lambda) {
            this.lambda = Input.of(Objects.requireNonNull(lambda));
            return this;
        }
        public AnalyticsApplicationInputsProcessingConfigurationGetArgs build() {
            return new AnalyticsApplicationInputsProcessingConfigurationGetArgs(lambda);
        }
    }
}
