// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs Empty = new ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs();

    /**
     * Describes an application's checkpointing configuration.
     * 
     */
    @InputImport(name="checkpointConfiguration")
      private final @Nullable Input<ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs> checkpointConfiguration;

    public Input<ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs> getCheckpointConfiguration() {
        return this.checkpointConfiguration == null ? Input.empty() : this.checkpointConfiguration;
    }

    /**
     * Describes configuration parameters for CloudWatch logging for an application.
     * 
     */
    @InputImport(name="monitoringConfiguration")
      private final @Nullable Input<ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationArgs> monitoringConfiguration;

    public Input<ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationArgs> getMonitoringConfiguration() {
        return this.monitoringConfiguration == null ? Input.empty() : this.monitoringConfiguration;
    }

    /**
     * Describes parameters for how an application executes multiple tasks simultaneously.
     * 
     */
    @InputImport(name="parallelismConfiguration")
      private final @Nullable Input<ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationArgs> parallelismConfiguration;

    public Input<ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationArgs> getParallelismConfiguration() {
        return this.parallelismConfiguration == null ? Input.empty() : this.parallelismConfiguration;
    }

    public ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs(
        @Nullable Input<ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs> checkpointConfiguration,
        @Nullable Input<ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationArgs> monitoringConfiguration,
        @Nullable Input<ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationArgs> parallelismConfiguration) {
        this.checkpointConfiguration = checkpointConfiguration;
        this.monitoringConfiguration = monitoringConfiguration;
        this.parallelismConfiguration = parallelismConfiguration;
    }

    private ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs() {
        this.checkpointConfiguration = Input.empty();
        this.monitoringConfiguration = Input.empty();
        this.parallelismConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs> checkpointConfiguration;
        private @Nullable Input<ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationArgs> monitoringConfiguration;
        private @Nullable Input<ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationArgs> parallelismConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkpointConfiguration = defaults.checkpointConfiguration;
    	      this.monitoringConfiguration = defaults.monitoringConfiguration;
    	      this.parallelismConfiguration = defaults.parallelismConfiguration;
        }

        public Builder checkpointConfiguration(@Nullable Input<ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs> checkpointConfiguration) {
            this.checkpointConfiguration = checkpointConfiguration;
            return this;
        }

        public Builder checkpointConfiguration(@Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs checkpointConfiguration) {
            this.checkpointConfiguration = Input.ofNullable(checkpointConfiguration);
            return this;
        }

        public Builder monitoringConfiguration(@Nullable Input<ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationArgs> monitoringConfiguration) {
            this.monitoringConfiguration = monitoringConfiguration;
            return this;
        }

        public Builder monitoringConfiguration(@Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationArgs monitoringConfiguration) {
            this.monitoringConfiguration = Input.ofNullable(monitoringConfiguration);
            return this;
        }

        public Builder parallelismConfiguration(@Nullable Input<ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationArgs> parallelismConfiguration) {
            this.parallelismConfiguration = parallelismConfiguration;
            return this;
        }

        public Builder parallelismConfiguration(@Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationArgs parallelismConfiguration) {
            this.parallelismConfiguration = Input.ofNullable(parallelismConfiguration);
            return this;
        }
        public ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs build() {
            return new ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs(checkpointConfiguration, monitoringConfiguration, parallelismConfiguration);
        }
    }
}
