// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appautoscaling.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimensionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimensionGetArgs Empty = new PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimensionGetArgs();

    /**
     * The name of the policy. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Value of the dimension.
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    public PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimensionGetArgs(
        Output<String> name,
        Output<String> value) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimensionGetArgs() {
        this.name = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimensionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimensionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimensionGetArgs build() {
            return new PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimensionGetArgs(name, value);
        }
    }
}
