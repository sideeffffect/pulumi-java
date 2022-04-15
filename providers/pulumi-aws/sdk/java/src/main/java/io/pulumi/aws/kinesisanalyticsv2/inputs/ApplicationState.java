// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationGetArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationCloudwatchLoggingOptionsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationState extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationState Empty = new ApplicationState();

    /**
     * The application's configuration
     * 
     */
    @Import(name="applicationConfiguration")
      private final @Nullable Output<ApplicationApplicationConfigurationGetArgs> applicationConfiguration;

    public Output<ApplicationApplicationConfigurationGetArgs> applicationConfiguration() {
        return this.applicationConfiguration == null ? Codegen.empty() : this.applicationConfiguration;
    }

    /**
     * The ARN of the application.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * A CloudWatch log stream to monitor application configuration errors.
     * 
     */
    @Import(name="cloudwatchLoggingOptions")
      private final @Nullable Output<ApplicationCloudwatchLoggingOptionsGetArgs> cloudwatchLoggingOptions;

    public Output<ApplicationCloudwatchLoggingOptionsGetArgs> cloudwatchLoggingOptions() {
        return this.cloudwatchLoggingOptions == null ? Codegen.empty() : this.cloudwatchLoggingOptions;
    }

    /**
     * The current timestamp when the application was created.
     * 
     */
    @Import(name="createTimestamp")
      private final @Nullable Output<String> createTimestamp;

    public Output<String> createTimestamp() {
        return this.createTimestamp == null ? Codegen.empty() : this.createTimestamp;
    }

    /**
     * A summary description of the application.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Whether to force stop an unresponsive Flink-based application.
     * 
     */
    @Import(name="forceStop")
      private final @Nullable Output<Boolean> forceStop;

    public Output<Boolean> forceStop() {
        return this.forceStop == null ? Codegen.empty() : this.forceStop;
    }

    /**
     * The current timestamp when the application was last updated.
     * 
     */
    @Import(name="lastUpdateTimestamp")
      private final @Nullable Output<String> lastUpdateTimestamp;

    public Output<String> lastUpdateTimestamp() {
        return this.lastUpdateTimestamp == null ? Codegen.empty() : this.lastUpdateTimestamp;
    }

    /**
     * The name of the application.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The runtime environment for the application. Valid values: `SQL-1_0`, `FLINK-1_6`, `FLINK-1_8`, `FLINK-1_11`.
     * 
     */
    @Import(name="runtimeEnvironment")
      private final @Nullable Output<String> runtimeEnvironment;

    public Output<String> runtimeEnvironment() {
        return this.runtimeEnvironment == null ? Codegen.empty() : this.runtimeEnvironment;
    }

    /**
     * The ARN of the IAM role used by the application to access Kinesis data streams, Kinesis Data Firehose delivery streams, Amazon S3 objects, and other external resources.
     * 
     */
    @Import(name="serviceExecutionRole")
      private final @Nullable Output<String> serviceExecutionRole;

    public Output<String> serviceExecutionRole() {
        return this.serviceExecutionRole == null ? Codegen.empty() : this.serviceExecutionRole;
    }

    /**
     * Whether to start or stop the application.
     * 
     */
    @Import(name="startApplication")
      private final @Nullable Output<Boolean> startApplication;

    public Output<Boolean> startApplication() {
        return this.startApplication == null ? Codegen.empty() : this.startApplication;
    }

    /**
     * The status of the application.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * A map of tags to assign to the application. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * The current application version. Kinesis Data Analytics updates the `version_id` each time the application is updated.
     * 
     */
    @Import(name="versionId")
      private final @Nullable Output<Integer> versionId;

    public Output<Integer> versionId() {
        return this.versionId == null ? Codegen.empty() : this.versionId;
    }

    public ApplicationState(
        @Nullable Output<ApplicationApplicationConfigurationGetArgs> applicationConfiguration,
        @Nullable Output<String> arn,
        @Nullable Output<ApplicationCloudwatchLoggingOptionsGetArgs> cloudwatchLoggingOptions,
        @Nullable Output<String> createTimestamp,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> forceStop,
        @Nullable Output<String> lastUpdateTimestamp,
        @Nullable Output<String> name,
        @Nullable Output<String> runtimeEnvironment,
        @Nullable Output<String> serviceExecutionRole,
        @Nullable Output<Boolean> startApplication,
        @Nullable Output<String> status,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<Integer> versionId) {
        this.applicationConfiguration = applicationConfiguration;
        this.arn = arn;
        this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
        this.createTimestamp = createTimestamp;
        this.description = description;
        this.forceStop = forceStop;
        this.lastUpdateTimestamp = lastUpdateTimestamp;
        this.name = name;
        this.runtimeEnvironment = runtimeEnvironment;
        this.serviceExecutionRole = serviceExecutionRole;
        this.startApplication = startApplication;
        this.status = status;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.versionId = versionId;
    }

    private ApplicationState() {
        this.applicationConfiguration = Codegen.empty();
        this.arn = Codegen.empty();
        this.cloudwatchLoggingOptions = Codegen.empty();
        this.createTimestamp = Codegen.empty();
        this.description = Codegen.empty();
        this.forceStop = Codegen.empty();
        this.lastUpdateTimestamp = Codegen.empty();
        this.name = Codegen.empty();
        this.runtimeEnvironment = Codegen.empty();
        this.serviceExecutionRole = Codegen.empty();
        this.startApplication = Codegen.empty();
        this.status = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.versionId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ApplicationApplicationConfigurationGetArgs> applicationConfiguration;
        private @Nullable Output<String> arn;
        private @Nullable Output<ApplicationCloudwatchLoggingOptionsGetArgs> cloudwatchLoggingOptions;
        private @Nullable Output<String> createTimestamp;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> forceStop;
        private @Nullable Output<String> lastUpdateTimestamp;
        private @Nullable Output<String> name;
        private @Nullable Output<String> runtimeEnvironment;
        private @Nullable Output<String> serviceExecutionRole;
        private @Nullable Output<Boolean> startApplication;
        private @Nullable Output<String> status;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<Integer> versionId;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationConfiguration = defaults.applicationConfiguration;
    	      this.arn = defaults.arn;
    	      this.cloudwatchLoggingOptions = defaults.cloudwatchLoggingOptions;
    	      this.createTimestamp = defaults.createTimestamp;
    	      this.description = defaults.description;
    	      this.forceStop = defaults.forceStop;
    	      this.lastUpdateTimestamp = defaults.lastUpdateTimestamp;
    	      this.name = defaults.name;
    	      this.runtimeEnvironment = defaults.runtimeEnvironment;
    	      this.serviceExecutionRole = defaults.serviceExecutionRole;
    	      this.startApplication = defaults.startApplication;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.versionId = defaults.versionId;
        }

        public Builder applicationConfiguration(@Nullable Output<ApplicationApplicationConfigurationGetArgs> applicationConfiguration) {
            this.applicationConfiguration = applicationConfiguration;
            return this;
        }
        public Builder applicationConfiguration(@Nullable ApplicationApplicationConfigurationGetArgs applicationConfiguration) {
            this.applicationConfiguration = Codegen.ofNullable(applicationConfiguration);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder cloudwatchLoggingOptions(@Nullable Output<ApplicationCloudwatchLoggingOptionsGetArgs> cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
            return this;
        }
        public Builder cloudwatchLoggingOptions(@Nullable ApplicationCloudwatchLoggingOptionsGetArgs cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = Codegen.ofNullable(cloudwatchLoggingOptions);
            return this;
        }
        public Builder createTimestamp(@Nullable Output<String> createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Builder createTimestamp(@Nullable String createTimestamp) {
            this.createTimestamp = Codegen.ofNullable(createTimestamp);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder forceStop(@Nullable Output<Boolean> forceStop) {
            this.forceStop = forceStop;
            return this;
        }
        public Builder forceStop(@Nullable Boolean forceStop) {
            this.forceStop = Codegen.ofNullable(forceStop);
            return this;
        }
        public Builder lastUpdateTimestamp(@Nullable Output<String> lastUpdateTimestamp) {
            this.lastUpdateTimestamp = lastUpdateTimestamp;
            return this;
        }
        public Builder lastUpdateTimestamp(@Nullable String lastUpdateTimestamp) {
            this.lastUpdateTimestamp = Codegen.ofNullable(lastUpdateTimestamp);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder runtimeEnvironment(@Nullable Output<String> runtimeEnvironment) {
            this.runtimeEnvironment = runtimeEnvironment;
            return this;
        }
        public Builder runtimeEnvironment(@Nullable String runtimeEnvironment) {
            this.runtimeEnvironment = Codegen.ofNullable(runtimeEnvironment);
            return this;
        }
        public Builder serviceExecutionRole(@Nullable Output<String> serviceExecutionRole) {
            this.serviceExecutionRole = serviceExecutionRole;
            return this;
        }
        public Builder serviceExecutionRole(@Nullable String serviceExecutionRole) {
            this.serviceExecutionRole = Codegen.ofNullable(serviceExecutionRole);
            return this;
        }
        public Builder startApplication(@Nullable Output<Boolean> startApplication) {
            this.startApplication = startApplication;
            return this;
        }
        public Builder startApplication(@Nullable Boolean startApplication) {
            this.startApplication = Codegen.ofNullable(startApplication);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder versionId(@Nullable Output<Integer> versionId) {
            this.versionId = versionId;
            return this;
        }
        public Builder versionId(@Nullable Integer versionId) {
            this.versionId = Codegen.ofNullable(versionId);
            return this;
        }        public ApplicationState build() {
            return new ApplicationState(applicationConfiguration, arn, cloudwatchLoggingOptions, createTimestamp, description, forceStop, lastUpdateTimestamp, name, runtimeEnvironment, serviceExecutionRole, startApplication, status, tags, tagsAll, versionId);
        }
    }
}
