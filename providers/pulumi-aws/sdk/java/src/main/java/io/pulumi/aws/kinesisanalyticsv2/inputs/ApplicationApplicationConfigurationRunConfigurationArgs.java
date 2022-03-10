// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfigurationArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationRunConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationRunConfigurationArgs Empty = new ApplicationApplicationConfigurationRunConfigurationArgs();

    /**
     * The restore behavior of a restarting application.
     * 
     */
    @InputImport(name="applicationRestoreConfiguration")
      private final @Nullable Input<ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfigurationArgs> applicationRestoreConfiguration;

    public Input<ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfigurationArgs> getApplicationRestoreConfiguration() {
        return this.applicationRestoreConfiguration == null ? Input.empty() : this.applicationRestoreConfiguration;
    }

    /**
     * The starting parameters for a Flink-based Kinesis Data Analytics application.
     * 
     */
    @InputImport(name="flinkRunConfiguration")
      private final @Nullable Input<ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationArgs> flinkRunConfiguration;

    public Input<ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationArgs> getFlinkRunConfiguration() {
        return this.flinkRunConfiguration == null ? Input.empty() : this.flinkRunConfiguration;
    }

    public ApplicationApplicationConfigurationRunConfigurationArgs(
        @Nullable Input<ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfigurationArgs> applicationRestoreConfiguration,
        @Nullable Input<ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationArgs> flinkRunConfiguration) {
        this.applicationRestoreConfiguration = applicationRestoreConfiguration;
        this.flinkRunConfiguration = flinkRunConfiguration;
    }

    private ApplicationApplicationConfigurationRunConfigurationArgs() {
        this.applicationRestoreConfiguration = Input.empty();
        this.flinkRunConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationRunConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfigurationArgs> applicationRestoreConfiguration;
        private @Nullable Input<ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationArgs> flinkRunConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationRunConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationRestoreConfiguration = defaults.applicationRestoreConfiguration;
    	      this.flinkRunConfiguration = defaults.flinkRunConfiguration;
        }

        public Builder applicationRestoreConfiguration(@Nullable Input<ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfigurationArgs> applicationRestoreConfiguration) {
            this.applicationRestoreConfiguration = applicationRestoreConfiguration;
            return this;
        }

        public Builder applicationRestoreConfiguration(@Nullable ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfigurationArgs applicationRestoreConfiguration) {
            this.applicationRestoreConfiguration = Input.ofNullable(applicationRestoreConfiguration);
            return this;
        }

        public Builder flinkRunConfiguration(@Nullable Input<ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationArgs> flinkRunConfiguration) {
            this.flinkRunConfiguration = flinkRunConfiguration;
            return this;
        }

        public Builder flinkRunConfiguration(@Nullable ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationArgs flinkRunConfiguration) {
            this.flinkRunConfiguration = Input.ofNullable(flinkRunConfiguration);
            return this;
        }
        public ApplicationApplicationConfigurationRunConfigurationArgs build() {
            return new ApplicationApplicationConfigurationRunConfigurationArgs(applicationRestoreConfiguration, flinkRunConfiguration);
        }
    }
}
