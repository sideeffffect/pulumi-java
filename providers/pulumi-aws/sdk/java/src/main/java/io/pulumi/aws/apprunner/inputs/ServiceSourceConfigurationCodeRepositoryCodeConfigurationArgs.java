// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apprunner.inputs;

import io.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValuesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs Empty = new ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs();

    /**
     * Basic configuration for building and running the App Runner service. Use this parameter to quickly launch an App Runner service without providing an apprunner.yaml file in the source code repository (or ignoring the file if it exists). See Code Configuration Values below for more details.
     * 
     */
    @InputImport(name="codeConfigurationValues")
      private final @Nullable Input<ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValuesArgs> codeConfigurationValues;

    public Input<ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValuesArgs> getCodeConfigurationValues() {
        return this.codeConfigurationValues == null ? Input.empty() : this.codeConfigurationValues;
    }

    /**
     * The source of the App Runner configuration. Valid values: `REPOSITORY`, `API`. Values are interpreted as follows:
     * 
     */
    @InputImport(name="configurationSource", required=true)
      private final Input<String> configurationSource;

    public Input<String> getConfigurationSource() {
        return this.configurationSource;
    }

    public ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs(
        @Nullable Input<ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValuesArgs> codeConfigurationValues,
        Input<String> configurationSource) {
        this.codeConfigurationValues = codeConfigurationValues;
        this.configurationSource = Objects.requireNonNull(configurationSource, "expected parameter 'configurationSource' to be non-null");
    }

    private ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs() {
        this.codeConfigurationValues = Input.empty();
        this.configurationSource = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValuesArgs> codeConfigurationValues;
        private Input<String> configurationSource;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeConfigurationValues = defaults.codeConfigurationValues;
    	      this.configurationSource = defaults.configurationSource;
        }

        public Builder codeConfigurationValues(@Nullable Input<ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValuesArgs> codeConfigurationValues) {
            this.codeConfigurationValues = codeConfigurationValues;
            return this;
        }

        public Builder codeConfigurationValues(@Nullable ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValuesArgs codeConfigurationValues) {
            this.codeConfigurationValues = Input.ofNullable(codeConfigurationValues);
            return this;
        }

        public Builder configurationSource(Input<String> configurationSource) {
            this.configurationSource = Objects.requireNonNull(configurationSource);
            return this;
        }

        public Builder configurationSource(String configurationSource) {
            this.configurationSource = Input.of(Objects.requireNonNull(configurationSource));
            return this;
        }
        public ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs build() {
            return new ServiceSourceConfigurationCodeRepositoryCodeConfigurationArgs(codeConfigurationValues, configurationSource);
        }
    }
}
