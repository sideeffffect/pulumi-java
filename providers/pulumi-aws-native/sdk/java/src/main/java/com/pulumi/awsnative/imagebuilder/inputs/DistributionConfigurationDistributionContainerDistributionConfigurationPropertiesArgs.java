// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.imagebuilder.inputs;

import com.pulumi.awsnative.imagebuilder.inputs.DistributionConfigurationTargetContainerRepositoryArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container distribution settings for encryption, licensing, and sharing in a specific Region.
 * 
 */
public final class DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs Empty = new DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs();

    /**
     * Tags that are attached to the container distribution configuration.
     * 
     */
    @Import(name="containerTags")
    private @Nullable Output<List<String>> containerTags;

    public Optional<Output<List<String>>> containerTags() {
        return Optional.ofNullable(this.containerTags);
    }

    /**
     * The description of the container distribution configuration.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The destination repository for the container distribution configuration.
     * 
     */
    @Import(name="targetRepository")
    private @Nullable Output<DistributionConfigurationTargetContainerRepositoryArgs> targetRepository;

    public Optional<Output<DistributionConfigurationTargetContainerRepositoryArgs>> targetRepository() {
        return Optional.ofNullable(this.targetRepository);
    }

    private DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs() {}

    private DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs(DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs $) {
        this.containerTags = $.containerTags;
        this.description = $.description;
        this.targetRepository = $.targetRepository;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs $;

        public Builder() {
            $ = new DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs();
        }

        public Builder(DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs defaults) {
            $ = new DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder containerTags(@Nullable Output<List<String>> containerTags) {
            $.containerTags = containerTags;
            return this;
        }

        public Builder containerTags(List<String> containerTags) {
            return containerTags(Output.of(containerTags));
        }

        public Builder containerTags(String... containerTags) {
            return containerTags(List.of(containerTags));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder targetRepository(@Nullable Output<DistributionConfigurationTargetContainerRepositoryArgs> targetRepository) {
            $.targetRepository = targetRepository;
            return this;
        }

        public Builder targetRepository(DistributionConfigurationTargetContainerRepositoryArgs targetRepository) {
            return targetRepository(Output.of(targetRepository));
        }

        public DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs build() {
            return $;
        }
    }

}
