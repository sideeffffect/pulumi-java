// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamRedshiftDestinationConfigurationS3BackupMode;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamCloudWatchLoggingOptionsArgs;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamCopyCommandArgs;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamProcessingConfigurationArgs;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamRedshiftRetryOptionsArgs;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamS3DestinationConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamRedshiftDestinationConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamRedshiftDestinationConfigurationArgs Empty = new DeliveryStreamRedshiftDestinationConfigurationArgs();

    @InputImport(name="cloudWatchLoggingOptions")
      private final @Nullable Input<DeliveryStreamCloudWatchLoggingOptionsArgs> cloudWatchLoggingOptions;

    public Input<DeliveryStreamCloudWatchLoggingOptionsArgs> getCloudWatchLoggingOptions() {
        return this.cloudWatchLoggingOptions == null ? Input.empty() : this.cloudWatchLoggingOptions;
    }

    @InputImport(name="clusterJDBCURL", required=true)
      private final Input<String> clusterJDBCURL;

    public Input<String> getClusterJDBCURL() {
        return this.clusterJDBCURL;
    }

    @InputImport(name="copyCommand", required=true)
      private final Input<DeliveryStreamCopyCommandArgs> copyCommand;

    public Input<DeliveryStreamCopyCommandArgs> getCopyCommand() {
        return this.copyCommand;
    }

    @InputImport(name="password", required=true)
      private final Input<String> password;

    public Input<String> getPassword() {
        return this.password;
    }

    @InputImport(name="processingConfiguration")
      private final @Nullable Input<DeliveryStreamProcessingConfigurationArgs> processingConfiguration;

    public Input<DeliveryStreamProcessingConfigurationArgs> getProcessingConfiguration() {
        return this.processingConfiguration == null ? Input.empty() : this.processingConfiguration;
    }

    @InputImport(name="retryOptions")
      private final @Nullable Input<DeliveryStreamRedshiftRetryOptionsArgs> retryOptions;

    public Input<DeliveryStreamRedshiftRetryOptionsArgs> getRetryOptions() {
        return this.retryOptions == null ? Input.empty() : this.retryOptions;
    }

    @InputImport(name="roleARN", required=true)
      private final Input<String> roleARN;

    public Input<String> getRoleARN() {
        return this.roleARN;
    }

    @InputImport(name="s3BackupConfiguration")
      private final @Nullable Input<DeliveryStreamS3DestinationConfigurationArgs> s3BackupConfiguration;

    public Input<DeliveryStreamS3DestinationConfigurationArgs> getS3BackupConfiguration() {
        return this.s3BackupConfiguration == null ? Input.empty() : this.s3BackupConfiguration;
    }

    @InputImport(name="s3BackupMode")
      private final @Nullable Input<DeliveryStreamRedshiftDestinationConfigurationS3BackupMode> s3BackupMode;

    public Input<DeliveryStreamRedshiftDestinationConfigurationS3BackupMode> getS3BackupMode() {
        return this.s3BackupMode == null ? Input.empty() : this.s3BackupMode;
    }

    @InputImport(name="s3Configuration", required=true)
      private final Input<DeliveryStreamS3DestinationConfigurationArgs> s3Configuration;

    public Input<DeliveryStreamS3DestinationConfigurationArgs> getS3Configuration() {
        return this.s3Configuration;
    }

    @InputImport(name="username", required=true)
      private final Input<String> username;

    public Input<String> getUsername() {
        return this.username;
    }

    public DeliveryStreamRedshiftDestinationConfigurationArgs(
        @Nullable Input<DeliveryStreamCloudWatchLoggingOptionsArgs> cloudWatchLoggingOptions,
        Input<String> clusterJDBCURL,
        Input<DeliveryStreamCopyCommandArgs> copyCommand,
        Input<String> password,
        @Nullable Input<DeliveryStreamProcessingConfigurationArgs> processingConfiguration,
        @Nullable Input<DeliveryStreamRedshiftRetryOptionsArgs> retryOptions,
        Input<String> roleARN,
        @Nullable Input<DeliveryStreamS3DestinationConfigurationArgs> s3BackupConfiguration,
        @Nullable Input<DeliveryStreamRedshiftDestinationConfigurationS3BackupMode> s3BackupMode,
        Input<DeliveryStreamS3DestinationConfigurationArgs> s3Configuration,
        Input<String> username) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
        this.clusterJDBCURL = Objects.requireNonNull(clusterJDBCURL, "expected parameter 'clusterJDBCURL' to be non-null");
        this.copyCommand = Objects.requireNonNull(copyCommand, "expected parameter 'copyCommand' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.processingConfiguration = processingConfiguration;
        this.retryOptions = retryOptions;
        this.roleARN = Objects.requireNonNull(roleARN, "expected parameter 'roleARN' to be non-null");
        this.s3BackupConfiguration = s3BackupConfiguration;
        this.s3BackupMode = s3BackupMode;
        this.s3Configuration = Objects.requireNonNull(s3Configuration, "expected parameter 's3Configuration' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private DeliveryStreamRedshiftDestinationConfigurationArgs() {
        this.cloudWatchLoggingOptions = Input.empty();
        this.clusterJDBCURL = Input.empty();
        this.copyCommand = Input.empty();
        this.password = Input.empty();
        this.processingConfiguration = Input.empty();
        this.retryOptions = Input.empty();
        this.roleARN = Input.empty();
        this.s3BackupConfiguration = Input.empty();
        this.s3BackupMode = Input.empty();
        this.s3Configuration = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamRedshiftDestinationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DeliveryStreamCloudWatchLoggingOptionsArgs> cloudWatchLoggingOptions;
        private Input<String> clusterJDBCURL;
        private Input<DeliveryStreamCopyCommandArgs> copyCommand;
        private Input<String> password;
        private @Nullable Input<DeliveryStreamProcessingConfigurationArgs> processingConfiguration;
        private @Nullable Input<DeliveryStreamRedshiftRetryOptionsArgs> retryOptions;
        private Input<String> roleARN;
        private @Nullable Input<DeliveryStreamS3DestinationConfigurationArgs> s3BackupConfiguration;
        private @Nullable Input<DeliveryStreamRedshiftDestinationConfigurationS3BackupMode> s3BackupMode;
        private Input<DeliveryStreamS3DestinationConfigurationArgs> s3Configuration;
        private Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamRedshiftDestinationConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchLoggingOptions = defaults.cloudWatchLoggingOptions;
    	      this.clusterJDBCURL = defaults.clusterJDBCURL;
    	      this.copyCommand = defaults.copyCommand;
    	      this.password = defaults.password;
    	      this.processingConfiguration = defaults.processingConfiguration;
    	      this.retryOptions = defaults.retryOptions;
    	      this.roleARN = defaults.roleARN;
    	      this.s3BackupConfiguration = defaults.s3BackupConfiguration;
    	      this.s3BackupMode = defaults.s3BackupMode;
    	      this.s3Configuration = defaults.s3Configuration;
    	      this.username = defaults.username;
        }

        public Builder cloudWatchLoggingOptions(@Nullable Input<DeliveryStreamCloudWatchLoggingOptionsArgs> cloudWatchLoggingOptions) {
            this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
            return this;
        }

        public Builder cloudWatchLoggingOptions(@Nullable DeliveryStreamCloudWatchLoggingOptionsArgs cloudWatchLoggingOptions) {
            this.cloudWatchLoggingOptions = Input.ofNullable(cloudWatchLoggingOptions);
            return this;
        }

        public Builder clusterJDBCURL(Input<String> clusterJDBCURL) {
            this.clusterJDBCURL = Objects.requireNonNull(clusterJDBCURL);
            return this;
        }

        public Builder clusterJDBCURL(String clusterJDBCURL) {
            this.clusterJDBCURL = Input.of(Objects.requireNonNull(clusterJDBCURL));
            return this;
        }

        public Builder copyCommand(Input<DeliveryStreamCopyCommandArgs> copyCommand) {
            this.copyCommand = Objects.requireNonNull(copyCommand);
            return this;
        }

        public Builder copyCommand(DeliveryStreamCopyCommandArgs copyCommand) {
            this.copyCommand = Input.of(Objects.requireNonNull(copyCommand));
            return this;
        }

        public Builder password(Input<String> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder password(String password) {
            this.password = Input.of(Objects.requireNonNull(password));
            return this;
        }

        public Builder processingConfiguration(@Nullable Input<DeliveryStreamProcessingConfigurationArgs> processingConfiguration) {
            this.processingConfiguration = processingConfiguration;
            return this;
        }

        public Builder processingConfiguration(@Nullable DeliveryStreamProcessingConfigurationArgs processingConfiguration) {
            this.processingConfiguration = Input.ofNullable(processingConfiguration);
            return this;
        }

        public Builder retryOptions(@Nullable Input<DeliveryStreamRedshiftRetryOptionsArgs> retryOptions) {
            this.retryOptions = retryOptions;
            return this;
        }

        public Builder retryOptions(@Nullable DeliveryStreamRedshiftRetryOptionsArgs retryOptions) {
            this.retryOptions = Input.ofNullable(retryOptions);
            return this;
        }

        public Builder roleARN(Input<String> roleARN) {
            this.roleARN = Objects.requireNonNull(roleARN);
            return this;
        }

        public Builder roleARN(String roleARN) {
            this.roleARN = Input.of(Objects.requireNonNull(roleARN));
            return this;
        }

        public Builder s3BackupConfiguration(@Nullable Input<DeliveryStreamS3DestinationConfigurationArgs> s3BackupConfiguration) {
            this.s3BackupConfiguration = s3BackupConfiguration;
            return this;
        }

        public Builder s3BackupConfiguration(@Nullable DeliveryStreamS3DestinationConfigurationArgs s3BackupConfiguration) {
            this.s3BackupConfiguration = Input.ofNullable(s3BackupConfiguration);
            return this;
        }

        public Builder s3BackupMode(@Nullable Input<DeliveryStreamRedshiftDestinationConfigurationS3BackupMode> s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }

        public Builder s3BackupMode(@Nullable DeliveryStreamRedshiftDestinationConfigurationS3BackupMode s3BackupMode) {
            this.s3BackupMode = Input.ofNullable(s3BackupMode);
            return this;
        }

        public Builder s3Configuration(Input<DeliveryStreamS3DestinationConfigurationArgs> s3Configuration) {
            this.s3Configuration = Objects.requireNonNull(s3Configuration);
            return this;
        }

        public Builder s3Configuration(DeliveryStreamS3DestinationConfigurationArgs s3Configuration) {
            this.s3Configuration = Input.of(Objects.requireNonNull(s3Configuration));
            return this;
        }

        public Builder username(Input<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public Builder username(String username) {
            this.username = Input.of(Objects.requireNonNull(username));
            return this;
        }
        public DeliveryStreamRedshiftDestinationConfigurationArgs build() {
            return new DeliveryStreamRedshiftDestinationConfigurationArgs(cloudWatchLoggingOptions, clusterJDBCURL, copyCommand, password, processingConfiguration, retryOptions, roleARN, s3BackupConfiguration, s3BackupMode, s3Configuration, username);
        }
    }
}
