// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ModelContainerImageConfig {
    /**
     * Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). Allowed values are: `Platform` and `Vpc`.
     * 
     */
    private final String repositoryAccessMode;

    @CustomType.Constructor
    private ModelContainerImageConfig(@CustomType.Parameter("repositoryAccessMode") String repositoryAccessMode) {
        this.repositoryAccessMode = repositoryAccessMode;
    }

    /**
     * Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). Allowed values are: `Platform` and `Vpc`.
     * 
    */
    public String repositoryAccessMode() {
        return this.repositoryAccessMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelContainerImageConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String repositoryAccessMode;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelContainerImageConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repositoryAccessMode = defaults.repositoryAccessMode;
        }

        public Builder repositoryAccessMode(String repositoryAccessMode) {
            this.repositoryAccessMode = Objects.requireNonNull(repositoryAccessMode);
            return this;
        }        public ModelContainerImageConfig build() {
            return new ModelContainerImageConfig(repositoryAccessMode);
        }
    }
}
