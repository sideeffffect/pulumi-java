// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LaunchTemplateElasticInferenceAccelerator {
    /**
     * Accelerator type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private LaunchTemplateElasticInferenceAccelerator(@CustomType.Parameter("type") String type) {
        this.type = type;
    }

    /**
     * Accelerator type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateElasticInferenceAccelerator defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchTemplateElasticInferenceAccelerator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public LaunchTemplateElasticInferenceAccelerator build() {
            return new LaunchTemplateElasticInferenceAccelerator(type);
        }
    }
}
