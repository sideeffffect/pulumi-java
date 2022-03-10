// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.outputs;

import io.pulumi.awsnative.imagebuilder.enums.DistributionConfigurationTargetContainerRepositoryService;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DistributionConfigurationTargetContainerRepository {
    /**
     * The repository name of target container repository.
     * 
     */
    private final @Nullable String repositoryName;
    /**
     * The service of target container repository.
     * 
     */
    private final @Nullable DistributionConfigurationTargetContainerRepositoryService service;

    @OutputCustomType.Constructor
    private DistributionConfigurationTargetContainerRepository(
        @OutputCustomType.Parameter("repositoryName") @Nullable String repositoryName,
        @OutputCustomType.Parameter("service") @Nullable DistributionConfigurationTargetContainerRepositoryService service) {
        this.repositoryName = repositoryName;
        this.service = service;
    }

    /**
     * The repository name of target container repository.
     * 
    */
    public Optional<String> getRepositoryName() {
        return Optional.ofNullable(this.repositoryName);
    }
    /**
     * The service of target container repository.
     * 
    */
    public Optional<DistributionConfigurationTargetContainerRepositoryService> getService() {
        return Optional.ofNullable(this.service);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationTargetContainerRepository defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String repositoryName;
        private @Nullable DistributionConfigurationTargetContainerRepositoryService service;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfigurationTargetContainerRepository defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repositoryName = defaults.repositoryName;
    	      this.service = defaults.service;
        }

        public Builder repositoryName(@Nullable String repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }

        public Builder service(@Nullable DistributionConfigurationTargetContainerRepositoryService service) {
            this.service = service;
            return this;
        }
        public DistributionConfigurationTargetContainerRepository build() {
            return new DistributionConfigurationTargetContainerRepository(repositoryName, service);
        }
    }
}
