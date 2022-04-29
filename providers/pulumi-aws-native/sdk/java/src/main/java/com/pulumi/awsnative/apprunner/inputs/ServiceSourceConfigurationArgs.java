// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apprunner.inputs;

import com.pulumi.awsnative.apprunner.inputs.ServiceAuthenticationConfigurationArgs;
import com.pulumi.awsnative.apprunner.inputs.ServiceCodeRepositoryArgs;
import com.pulumi.awsnative.apprunner.inputs.ServiceImageRepositoryArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Source Code configuration
 * 
 */
public final class ServiceSourceConfigurationArgs extends ResourceArgs {

    public static final ServiceSourceConfigurationArgs Empty = new ServiceSourceConfigurationArgs();

    @Import(name="authenticationConfiguration")
    private @Nullable Output<ServiceAuthenticationConfigurationArgs> authenticationConfiguration;

    public Optional<Output<ServiceAuthenticationConfigurationArgs>> authenticationConfiguration() {
        return Optional.ofNullable(this.authenticationConfiguration);
    }

    /**
     * Auto Deployment enabled
     * 
     */
    @Import(name="autoDeploymentsEnabled")
    private @Nullable Output<Boolean> autoDeploymentsEnabled;

    /**
     * @return Auto Deployment enabled
     * 
     */
    public Optional<Output<Boolean>> autoDeploymentsEnabled() {
        return Optional.ofNullable(this.autoDeploymentsEnabled);
    }

    @Import(name="codeRepository")
    private @Nullable Output<ServiceCodeRepositoryArgs> codeRepository;

    public Optional<Output<ServiceCodeRepositoryArgs>> codeRepository() {
        return Optional.ofNullable(this.codeRepository);
    }

    @Import(name="imageRepository")
    private @Nullable Output<ServiceImageRepositoryArgs> imageRepository;

    public Optional<Output<ServiceImageRepositoryArgs>> imageRepository() {
        return Optional.ofNullable(this.imageRepository);
    }

    private ServiceSourceConfigurationArgs() {}

    private ServiceSourceConfigurationArgs(ServiceSourceConfigurationArgs $) {
        this.authenticationConfiguration = $.authenticationConfiguration;
        this.autoDeploymentsEnabled = $.autoDeploymentsEnabled;
        this.codeRepository = $.codeRepository;
        this.imageRepository = $.imageRepository;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceSourceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceSourceConfigurationArgs $;

        public Builder() {
            $ = new ServiceSourceConfigurationArgs();
        }

        public Builder(ServiceSourceConfigurationArgs defaults) {
            $ = new ServiceSourceConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder authenticationConfiguration(@Nullable Output<ServiceAuthenticationConfigurationArgs> authenticationConfiguration) {
            $.authenticationConfiguration = authenticationConfiguration;
            return this;
        }

        public Builder authenticationConfiguration(ServiceAuthenticationConfigurationArgs authenticationConfiguration) {
            return authenticationConfiguration(Output.of(authenticationConfiguration));
        }

        /**
         * @param autoDeploymentsEnabled Auto Deployment enabled
         * 
         * @return builder
         * 
         */
        public Builder autoDeploymentsEnabled(@Nullable Output<Boolean> autoDeploymentsEnabled) {
            $.autoDeploymentsEnabled = autoDeploymentsEnabled;
            return this;
        }

        /**
         * @param autoDeploymentsEnabled Auto Deployment enabled
         * 
         * @return builder
         * 
         */
        public Builder autoDeploymentsEnabled(Boolean autoDeploymentsEnabled) {
            return autoDeploymentsEnabled(Output.of(autoDeploymentsEnabled));
        }

        public Builder codeRepository(@Nullable Output<ServiceCodeRepositoryArgs> codeRepository) {
            $.codeRepository = codeRepository;
            return this;
        }

        public Builder codeRepository(ServiceCodeRepositoryArgs codeRepository) {
            return codeRepository(Output.of(codeRepository));
        }

        public Builder imageRepository(@Nullable Output<ServiceImageRepositoryArgs> imageRepository) {
            $.imageRepository = imageRepository;
            return this;
        }

        public Builder imageRepository(ServiceImageRepositoryArgs imageRepository) {
            return imageRepository(Output.of(imageRepository));
        }

        public ServiceSourceConfigurationArgs build() {
            return $;
        }
    }

}
