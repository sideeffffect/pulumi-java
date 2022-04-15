// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class LaunchTemplateElasticInferenceAcceleratorArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchTemplateElasticInferenceAcceleratorArgs Empty = new LaunchTemplateElasticInferenceAcceleratorArgs();

    /**
     * Accelerator type.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public LaunchTemplateElasticInferenceAcceleratorArgs(Output<String> type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private LaunchTemplateElasticInferenceAcceleratorArgs() {
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateElasticInferenceAcceleratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchTemplateElasticInferenceAcceleratorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public LaunchTemplateElasticInferenceAcceleratorArgs build() {
            return new LaunchTemplateElasticInferenceAcceleratorArgs(type);
        }
    }
}
