// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class DistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryGetArgs Empty = new DistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryGetArgs();

    /**
     * The name of the container repository where the output container image is stored. This name is prefixed by the repository location.
     * 
     */
    @Import(name="repositoryName", required=true)
      private final Output<String> repositoryName;

    public Output<String> repositoryName() {
        return this.repositoryName;
    }

    /**
     * The service in which this image is registered. Valid values: `ECR`.
     * 
     */
    @Import(name="service", required=true)
      private final Output<String> service;

    public Output<String> service() {
        return this.service;
    }

    public DistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryGetArgs(
        Output<String> repositoryName,
        Output<String> service) {
        this.repositoryName = Objects.requireNonNull(repositoryName, "expected parameter 'repositoryName' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
    }

    private DistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryGetArgs() {
        this.repositoryName = Codegen.empty();
        this.service = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> repositoryName;
        private Output<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repositoryName = defaults.repositoryName;
    	      this.service = defaults.service;
        }

        public Builder repositoryName(Output<String> repositoryName) {
            this.repositoryName = Objects.requireNonNull(repositoryName);
            return this;
        }
        public Builder repositoryName(String repositoryName) {
            this.repositoryName = Output.of(Objects.requireNonNull(repositoryName));
            return this;
        }
        public Builder service(Output<String> service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public Builder service(String service) {
            this.service = Output.of(Objects.requireNonNull(service));
            return this;
        }        public DistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryGetArgs build() {
            return new DistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryGetArgs(repositoryName, service);
        }
    }
}
