// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.outputs;

import io.pulumi.aws.ecs.outputs.ClusterConfigurationExecuteCommandConfigurationLogConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterConfigurationExecuteCommandConfiguration {
    /**
     * The AWS Key Management Service key ID to encrypt the data between the local client and the container.
     * 
     */
    private final @Nullable String kmsKeyId;
    /**
     * The log configuration for the results of the execute command actions Required when `logging` is `OVERRIDE`. Detailed below.
     * 
     */
    private final @Nullable ClusterConfigurationExecuteCommandConfigurationLogConfiguration logConfiguration;
    /**
     * The log setting to use for redirecting logs for your execute command results. Valid values are `NONE`, `DEFAULT`, and `OVERRIDE`.
     * 
     */
    private final @Nullable String logging;

    @OutputCustomType.Constructor
    private ClusterConfigurationExecuteCommandConfiguration(
        @OutputCustomType.Parameter("kmsKeyId") @Nullable String kmsKeyId,
        @OutputCustomType.Parameter("logConfiguration") @Nullable ClusterConfigurationExecuteCommandConfigurationLogConfiguration logConfiguration,
        @OutputCustomType.Parameter("logging") @Nullable String logging) {
        this.kmsKeyId = kmsKeyId;
        this.logConfiguration = logConfiguration;
        this.logging = logging;
    }

    /**
     * The AWS Key Management Service key ID to encrypt the data between the local client and the container.
     * 
    */
    public Optional<String> getKmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * The log configuration for the results of the execute command actions Required when `logging` is `OVERRIDE`. Detailed below.
     * 
    */
    public Optional<ClusterConfigurationExecuteCommandConfigurationLogConfiguration> getLogConfiguration() {
        return Optional.ofNullable(this.logConfiguration);
    }
    /**
     * The log setting to use for redirecting logs for your execute command results. Valid values are `NONE`, `DEFAULT`, and `OVERRIDE`.
     * 
    */
    public Optional<String> getLogging() {
        return Optional.ofNullable(this.logging);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterConfigurationExecuteCommandConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeyId;
        private @Nullable ClusterConfigurationExecuteCommandConfigurationLogConfiguration logConfiguration;
        private @Nullable String logging;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterConfigurationExecuteCommandConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.logConfiguration = defaults.logConfiguration;
    	      this.logging = defaults.logging;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder logConfiguration(@Nullable ClusterConfigurationExecuteCommandConfigurationLogConfiguration logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }

        public Builder logging(@Nullable String logging) {
            this.logging = logging;
            return this;
        }
        public ClusterConfigurationExecuteCommandConfiguration build() {
            return new ClusterConfigurationExecuteCommandConfiguration(kmsKeyId, logConfiguration, logging);
        }
    }
}
