// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mwaa.outputs;

import io.pulumi.aws.mwaa.outputs.EnvironmentLoggingConfigurationDagProcessingLogs;
import io.pulumi.aws.mwaa.outputs.EnvironmentLoggingConfigurationSchedulerLogs;
import io.pulumi.aws.mwaa.outputs.EnvironmentLoggingConfigurationTaskLogs;
import io.pulumi.aws.mwaa.outputs.EnvironmentLoggingConfigurationWebserverLogs;
import io.pulumi.aws.mwaa.outputs.EnvironmentLoggingConfigurationWorkerLogs;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnvironmentLoggingConfiguration {
    /**
     * (Optional) Log configuration options for processing DAGs. See Module logging configuration for more information. Disabled by default.
     * 
     */
    private final @Nullable EnvironmentLoggingConfigurationDagProcessingLogs dagProcessingLogs;
    /**
     * Log configuration options for the schedulers. See Module logging configuration for more information. Disabled by default.
     * 
     */
    private final @Nullable EnvironmentLoggingConfigurationSchedulerLogs schedulerLogs;
    /**
     * Log configuration options for DAG tasks. See Module logging configuration for more information. Enabled by default with `INFO` log level.
     * 
     */
    private final @Nullable EnvironmentLoggingConfigurationTaskLogs taskLogs;
    /**
     * Log configuration options for the webservers. See Module logging configuration for more information. Disabled by default.
     * 
     */
    private final @Nullable EnvironmentLoggingConfigurationWebserverLogs webserverLogs;
    /**
     * Log configuration options for the workers. See Module logging configuration for more information. Disabled by default.
     * 
     */
    private final @Nullable EnvironmentLoggingConfigurationWorkerLogs workerLogs;

    @CustomType.Constructor
    private EnvironmentLoggingConfiguration(
        @CustomType.Parameter("dagProcessingLogs") @Nullable EnvironmentLoggingConfigurationDagProcessingLogs dagProcessingLogs,
        @CustomType.Parameter("schedulerLogs") @Nullable EnvironmentLoggingConfigurationSchedulerLogs schedulerLogs,
        @CustomType.Parameter("taskLogs") @Nullable EnvironmentLoggingConfigurationTaskLogs taskLogs,
        @CustomType.Parameter("webserverLogs") @Nullable EnvironmentLoggingConfigurationWebserverLogs webserverLogs,
        @CustomType.Parameter("workerLogs") @Nullable EnvironmentLoggingConfigurationWorkerLogs workerLogs) {
        this.dagProcessingLogs = dagProcessingLogs;
        this.schedulerLogs = schedulerLogs;
        this.taskLogs = taskLogs;
        this.webserverLogs = webserverLogs;
        this.workerLogs = workerLogs;
    }

    /**
     * (Optional) Log configuration options for processing DAGs. See Module logging configuration for more information. Disabled by default.
     * 
    */
    public Optional<EnvironmentLoggingConfigurationDagProcessingLogs> dagProcessingLogs() {
        return Optional.ofNullable(this.dagProcessingLogs);
    }
    /**
     * Log configuration options for the schedulers. See Module logging configuration for more information. Disabled by default.
     * 
    */
    public Optional<EnvironmentLoggingConfigurationSchedulerLogs> schedulerLogs() {
        return Optional.ofNullable(this.schedulerLogs);
    }
    /**
     * Log configuration options for DAG tasks. See Module logging configuration for more information. Enabled by default with `INFO` log level.
     * 
    */
    public Optional<EnvironmentLoggingConfigurationTaskLogs> taskLogs() {
        return Optional.ofNullable(this.taskLogs);
    }
    /**
     * Log configuration options for the webservers. See Module logging configuration for more information. Disabled by default.
     * 
    */
    public Optional<EnvironmentLoggingConfigurationWebserverLogs> webserverLogs() {
        return Optional.ofNullable(this.webserverLogs);
    }
    /**
     * Log configuration options for the workers. See Module logging configuration for more information. Disabled by default.
     * 
    */
    public Optional<EnvironmentLoggingConfigurationWorkerLogs> workerLogs() {
        return Optional.ofNullable(this.workerLogs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentLoggingConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EnvironmentLoggingConfigurationDagProcessingLogs dagProcessingLogs;
        private @Nullable EnvironmentLoggingConfigurationSchedulerLogs schedulerLogs;
        private @Nullable EnvironmentLoggingConfigurationTaskLogs taskLogs;
        private @Nullable EnvironmentLoggingConfigurationWebserverLogs webserverLogs;
        private @Nullable EnvironmentLoggingConfigurationWorkerLogs workerLogs;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentLoggingConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dagProcessingLogs = defaults.dagProcessingLogs;
    	      this.schedulerLogs = defaults.schedulerLogs;
    	      this.taskLogs = defaults.taskLogs;
    	      this.webserverLogs = defaults.webserverLogs;
    	      this.workerLogs = defaults.workerLogs;
        }

        public Builder dagProcessingLogs(@Nullable EnvironmentLoggingConfigurationDagProcessingLogs dagProcessingLogs) {
            this.dagProcessingLogs = dagProcessingLogs;
            return this;
        }
        public Builder schedulerLogs(@Nullable EnvironmentLoggingConfigurationSchedulerLogs schedulerLogs) {
            this.schedulerLogs = schedulerLogs;
            return this;
        }
        public Builder taskLogs(@Nullable EnvironmentLoggingConfigurationTaskLogs taskLogs) {
            this.taskLogs = taskLogs;
            return this;
        }
        public Builder webserverLogs(@Nullable EnvironmentLoggingConfigurationWebserverLogs webserverLogs) {
            this.webserverLogs = webserverLogs;
            return this;
        }
        public Builder workerLogs(@Nullable EnvironmentLoggingConfigurationWorkerLogs workerLogs) {
            this.workerLogs = workerLogs;
            return this;
        }        public EnvironmentLoggingConfiguration build() {
            return new EnvironmentLoggingConfiguration(dagProcessingLogs, schedulerLogs, taskLogs, webserverLogs, workerLogs);
        }
    }
}
