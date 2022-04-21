// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.imagebuilder.inputs;

import com.pulumi.awsnative.imagebuilder.enums.ContainerRecipeTargetContainerRepositoryService;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The container repository where the output container image is stored.
 * 
 */
public final class ContainerRecipeTargetContainerRepositoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerRecipeTargetContainerRepositoryArgs Empty = new ContainerRecipeTargetContainerRepositoryArgs();

    /**
     * The name of the container repository where the output container image is stored. This name is prefixed by the repository location.
     * 
     */
    @Import(name="repositoryName")
    private @Nullable Output<String> repositoryName;

    public Optional<Output<String>> repositoryName() {
        return Optional.ofNullable(this.repositoryName);
    }

    /**
     * Specifies the service in which this image was registered.
     * 
     */
    @Import(name="service")
    private @Nullable Output<ContainerRecipeTargetContainerRepositoryService> service;

    public Optional<Output<ContainerRecipeTargetContainerRepositoryService>> service() {
        return Optional.ofNullable(this.service);
    }

    private ContainerRecipeTargetContainerRepositoryArgs() {}

    private ContainerRecipeTargetContainerRepositoryArgs(ContainerRecipeTargetContainerRepositoryArgs $) {
        this.repositoryName = $.repositoryName;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerRecipeTargetContainerRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerRecipeTargetContainerRepositoryArgs $;

        public Builder() {
            $ = new ContainerRecipeTargetContainerRepositoryArgs();
        }

        public Builder(ContainerRecipeTargetContainerRepositoryArgs defaults) {
            $ = new ContainerRecipeTargetContainerRepositoryArgs(Objects.requireNonNull(defaults));
        }

        public Builder repositoryName(@Nullable Output<String> repositoryName) {
            $.repositoryName = repositoryName;
            return this;
        }

        public Builder repositoryName(String repositoryName) {
            return repositoryName(Output.of(repositoryName));
        }

        public Builder service(@Nullable Output<ContainerRecipeTargetContainerRepositoryService> service) {
            $.service = service;
            return this;
        }

        public Builder service(ContainerRecipeTargetContainerRepositoryService service) {
            return service(Output.of(service));
        }

        public ContainerRecipeTargetContainerRepositoryArgs build() {
            return $;
        }
    }

}
