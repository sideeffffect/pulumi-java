// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.imagebuilder.inputs;

import com.pulumi.awsnative.imagebuilder.inputs.DistributionConfigurationAmiDistributionConfigurationArgs;
import com.pulumi.awsnative.imagebuilder.inputs.DistributionConfigurationContainerDistributionConfigurationArgs;
import com.pulumi.awsnative.imagebuilder.inputs.DistributionConfigurationLaunchTemplateConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The distributions of the distribution configuration.
 * 
 */
public final class DistributionConfigurationDistributionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionConfigurationDistributionArgs Empty = new DistributionConfigurationDistributionArgs();

    @Import(name="amiDistributionConfiguration")
    private @Nullable Output<DistributionConfigurationAmiDistributionConfigurationArgs> amiDistributionConfiguration;

    public Optional<Output<DistributionConfigurationAmiDistributionConfigurationArgs>> amiDistributionConfiguration() {
        return Optional.ofNullable(this.amiDistributionConfiguration);
    }

    @Import(name="containerDistributionConfiguration")
    private @Nullable Output<DistributionConfigurationContainerDistributionConfigurationArgs> containerDistributionConfiguration;

    public Optional<Output<DistributionConfigurationContainerDistributionConfigurationArgs>> containerDistributionConfiguration() {
        return Optional.ofNullable(this.containerDistributionConfiguration);
    }

    /**
     * A group of launchTemplateConfiguration settings that apply to image distribution.
     * 
     */
    @Import(name="launchTemplateConfigurations")
    private @Nullable Output<List<DistributionConfigurationLaunchTemplateConfigurationArgs>> launchTemplateConfigurations;

    /**
     * @return A group of launchTemplateConfiguration settings that apply to image distribution.
     * 
     */
    public Optional<Output<List<DistributionConfigurationLaunchTemplateConfigurationArgs>>> launchTemplateConfigurations() {
        return Optional.ofNullable(this.launchTemplateConfigurations);
    }

    /**
     * The License Manager Configuration to associate with the AMI in the specified Region.
     * 
     */
    @Import(name="licenseConfigurationArns")
    private @Nullable Output<List<String>> licenseConfigurationArns;

    /**
     * @return The License Manager Configuration to associate with the AMI in the specified Region.
     * 
     */
    public Optional<Output<List<String>>> licenseConfigurationArns() {
        return Optional.ofNullable(this.licenseConfigurationArns);
    }

    /**
     * region
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return region
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    private DistributionConfigurationDistributionArgs() {}

    private DistributionConfigurationDistributionArgs(DistributionConfigurationDistributionArgs $) {
        this.amiDistributionConfiguration = $.amiDistributionConfiguration;
        this.containerDistributionConfiguration = $.containerDistributionConfiguration;
        this.launchTemplateConfigurations = $.launchTemplateConfigurations;
        this.licenseConfigurationArns = $.licenseConfigurationArns;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionConfigurationDistributionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionConfigurationDistributionArgs $;

        public Builder() {
            $ = new DistributionConfigurationDistributionArgs();
        }

        public Builder(DistributionConfigurationDistributionArgs defaults) {
            $ = new DistributionConfigurationDistributionArgs(Objects.requireNonNull(defaults));
        }

        public Builder amiDistributionConfiguration(@Nullable Output<DistributionConfigurationAmiDistributionConfigurationArgs> amiDistributionConfiguration) {
            $.amiDistributionConfiguration = amiDistributionConfiguration;
            return this;
        }

        public Builder amiDistributionConfiguration(DistributionConfigurationAmiDistributionConfigurationArgs amiDistributionConfiguration) {
            return amiDistributionConfiguration(Output.of(amiDistributionConfiguration));
        }

        public Builder containerDistributionConfiguration(@Nullable Output<DistributionConfigurationContainerDistributionConfigurationArgs> containerDistributionConfiguration) {
            $.containerDistributionConfiguration = containerDistributionConfiguration;
            return this;
        }

        public Builder containerDistributionConfiguration(DistributionConfigurationContainerDistributionConfigurationArgs containerDistributionConfiguration) {
            return containerDistributionConfiguration(Output.of(containerDistributionConfiguration));
        }

        /**
         * @param launchTemplateConfigurations A group of launchTemplateConfiguration settings that apply to image distribution.
         * 
         * @return builder
         * 
         */
        public Builder launchTemplateConfigurations(@Nullable Output<List<DistributionConfigurationLaunchTemplateConfigurationArgs>> launchTemplateConfigurations) {
            $.launchTemplateConfigurations = launchTemplateConfigurations;
            return this;
        }

        /**
         * @param launchTemplateConfigurations A group of launchTemplateConfiguration settings that apply to image distribution.
         * 
         * @return builder
         * 
         */
        public Builder launchTemplateConfigurations(List<DistributionConfigurationLaunchTemplateConfigurationArgs> launchTemplateConfigurations) {
            return launchTemplateConfigurations(Output.of(launchTemplateConfigurations));
        }

        /**
         * @param launchTemplateConfigurations A group of launchTemplateConfiguration settings that apply to image distribution.
         * 
         * @return builder
         * 
         */
        public Builder launchTemplateConfigurations(DistributionConfigurationLaunchTemplateConfigurationArgs... launchTemplateConfigurations) {
            return launchTemplateConfigurations(List.of(launchTemplateConfigurations));
        }

        /**
         * @param licenseConfigurationArns The License Manager Configuration to associate with the AMI in the specified Region.
         * 
         * @return builder
         * 
         */
        public Builder licenseConfigurationArns(@Nullable Output<List<String>> licenseConfigurationArns) {
            $.licenseConfigurationArns = licenseConfigurationArns;
            return this;
        }

        /**
         * @param licenseConfigurationArns The License Manager Configuration to associate with the AMI in the specified Region.
         * 
         * @return builder
         * 
         */
        public Builder licenseConfigurationArns(List<String> licenseConfigurationArns) {
            return licenseConfigurationArns(Output.of(licenseConfigurationArns));
        }

        /**
         * @param licenseConfigurationArns The License Manager Configuration to associate with the AMI in the specified Region.
         * 
         * @return builder
         * 
         */
        public Builder licenseConfigurationArns(String... licenseConfigurationArns) {
            return licenseConfigurationArns(List.of(licenseConfigurationArns));
        }

        /**
         * @param region region
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region region
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public DistributionConfigurationDistributionArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
