// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationCloudwatchLoggingOptionsGetArgs;
import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationInputsGetArgs;
import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationOutputGetArgs;
import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyticsApplicationState extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationState Empty = new AnalyticsApplicationState();

    /**
     * The ARN of the Kinesis Analytics Appliation.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The CloudWatch log stream options to monitor application errors.
     * See CloudWatch Logging Options below for more details.
     * 
     */
    @Import(name="cloudwatchLoggingOptions")
      private final @Nullable Output<AnalyticsApplicationCloudwatchLoggingOptionsGetArgs> cloudwatchLoggingOptions;

    public Output<AnalyticsApplicationCloudwatchLoggingOptionsGetArgs> cloudwatchLoggingOptions() {
        return this.cloudwatchLoggingOptions == null ? Codegen.empty() : this.cloudwatchLoggingOptions;
    }

    /**
     * SQL Code to transform input data, and generate output.
     * 
     */
    @Import(name="code")
      private final @Nullable Output<String> code;

    public Output<String> code() {
        return this.code == null ? Codegen.empty() : this.code;
    }

    /**
     * The Timestamp when the application version was created.
     * 
     */
    @Import(name="createTimestamp")
      private final @Nullable Output<String> createTimestamp;

    public Output<String> createTimestamp() {
        return this.createTimestamp == null ? Codegen.empty() : this.createTimestamp;
    }

    /**
     * Description of the application.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Input configuration of the application. See Inputs below for more details.
     * 
     */
    @Import(name="inputs")
      private final @Nullable Output<AnalyticsApplicationInputsGetArgs> inputs;

    public Output<AnalyticsApplicationInputsGetArgs> inputs() {
        return this.inputs == null ? Codegen.empty() : this.inputs;
    }

    /**
     * The Timestamp when the application was last updated.
     * 
     */
    @Import(name="lastUpdateTimestamp")
      private final @Nullable Output<String> lastUpdateTimestamp;

    public Output<String> lastUpdateTimestamp() {
        return this.lastUpdateTimestamp == null ? Codegen.empty() : this.lastUpdateTimestamp;
    }

    /**
     * Name of the Kinesis Analytics Application.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Output destination configuration of the application. See Outputs below for more details.
     * 
     */
    @Import(name="outputs")
      private final @Nullable Output<List<AnalyticsApplicationOutputGetArgs>> outputs;

    public Output<List<AnalyticsApplicationOutputGetArgs>> outputs() {
        return this.outputs == null ? Codegen.empty() : this.outputs;
    }

    /**
     * An S3 Reference Data Source for the application.
     * See Reference Data Sources below for more details.
     * 
     */
    @Import(name="referenceDataSources")
      private final @Nullable Output<AnalyticsApplicationReferenceDataSourcesGetArgs> referenceDataSources;

    public Output<AnalyticsApplicationReferenceDataSourcesGetArgs> referenceDataSources() {
        return this.referenceDataSources == null ? Codegen.empty() : this.referenceDataSources;
    }

    /**
     * Whether to start or stop the Kinesis Analytics Application. To start an application, an input with a defined `starting_position` must be configured.
     * To modify an application's starting position, first stop the application by setting `start_application = false`, then update `starting_position` and set `start_application = true`.
     * 
     */
    @Import(name="startApplication")
      private final @Nullable Output<Boolean> startApplication;

    public Output<Boolean> startApplication() {
        return this.startApplication == null ? Codegen.empty() : this.startApplication;
    }

    /**
     * The Status of the application.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * Key-value map of tags for the Kinesis Analytics Application. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * The Version of the application.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<Integer> version;

    public Output<Integer> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public AnalyticsApplicationState(
        @Nullable Output<String> arn,
        @Nullable Output<AnalyticsApplicationCloudwatchLoggingOptionsGetArgs> cloudwatchLoggingOptions,
        @Nullable Output<String> code,
        @Nullable Output<String> createTimestamp,
        @Nullable Output<String> description,
        @Nullable Output<AnalyticsApplicationInputsGetArgs> inputs,
        @Nullable Output<String> lastUpdateTimestamp,
        @Nullable Output<String> name,
        @Nullable Output<List<AnalyticsApplicationOutputGetArgs>> outputs,
        @Nullable Output<AnalyticsApplicationReferenceDataSourcesGetArgs> referenceDataSources,
        @Nullable Output<Boolean> startApplication,
        @Nullable Output<String> status,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<Integer> version) {
        this.arn = arn;
        this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
        this.code = code;
        this.createTimestamp = createTimestamp;
        this.description = description;
        this.inputs = inputs;
        this.lastUpdateTimestamp = lastUpdateTimestamp;
        this.name = name;
        this.outputs = outputs;
        this.referenceDataSources = referenceDataSources;
        this.startApplication = startApplication;
        this.status = status;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.version = version;
    }

    private AnalyticsApplicationState() {
        this.arn = Codegen.empty();
        this.cloudwatchLoggingOptions = Codegen.empty();
        this.code = Codegen.empty();
        this.createTimestamp = Codegen.empty();
        this.description = Codegen.empty();
        this.inputs = Codegen.empty();
        this.lastUpdateTimestamp = Codegen.empty();
        this.name = Codegen.empty();
        this.outputs = Codegen.empty();
        this.referenceDataSources = Codegen.empty();
        this.startApplication = Codegen.empty();
        this.status = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<AnalyticsApplicationCloudwatchLoggingOptionsGetArgs> cloudwatchLoggingOptions;
        private @Nullable Output<String> code;
        private @Nullable Output<String> createTimestamp;
        private @Nullable Output<String> description;
        private @Nullable Output<AnalyticsApplicationInputsGetArgs> inputs;
        private @Nullable Output<String> lastUpdateTimestamp;
        private @Nullable Output<String> name;
        private @Nullable Output<List<AnalyticsApplicationOutputGetArgs>> outputs;
        private @Nullable Output<AnalyticsApplicationReferenceDataSourcesGetArgs> referenceDataSources;
        private @Nullable Output<Boolean> startApplication;
        private @Nullable Output<String> status;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.cloudwatchLoggingOptions = defaults.cloudwatchLoggingOptions;
    	      this.code = defaults.code;
    	      this.createTimestamp = defaults.createTimestamp;
    	      this.description = defaults.description;
    	      this.inputs = defaults.inputs;
    	      this.lastUpdateTimestamp = defaults.lastUpdateTimestamp;
    	      this.name = defaults.name;
    	      this.outputs = defaults.outputs;
    	      this.referenceDataSources = defaults.referenceDataSources;
    	      this.startApplication = defaults.startApplication;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.version = defaults.version;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder cloudwatchLoggingOptions(@Nullable Output<AnalyticsApplicationCloudwatchLoggingOptionsGetArgs> cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
            return this;
        }
        public Builder cloudwatchLoggingOptions(@Nullable AnalyticsApplicationCloudwatchLoggingOptionsGetArgs cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = Codegen.ofNullable(cloudwatchLoggingOptions);
            return this;
        }
        public Builder code(@Nullable Output<String> code) {
            this.code = code;
            return this;
        }
        public Builder code(@Nullable String code) {
            this.code = Codegen.ofNullable(code);
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
        public Builder inputs(@Nullable Output<AnalyticsApplicationInputsGetArgs> inputs) {
            this.inputs = inputs;
            return this;
        }
        public Builder inputs(@Nullable AnalyticsApplicationInputsGetArgs inputs) {
            this.inputs = Codegen.ofNullable(inputs);
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
        public Builder outputs(@Nullable Output<List<AnalyticsApplicationOutputGetArgs>> outputs) {
            this.outputs = outputs;
            return this;
        }
        public Builder outputs(@Nullable List<AnalyticsApplicationOutputGetArgs> outputs) {
            this.outputs = Codegen.ofNullable(outputs);
            return this;
        }
        public Builder outputs(AnalyticsApplicationOutputGetArgs... outputs) {
            return outputs(List.of(outputs));
        }
        public Builder referenceDataSources(@Nullable Output<AnalyticsApplicationReferenceDataSourcesGetArgs> referenceDataSources) {
            this.referenceDataSources = referenceDataSources;
            return this;
        }
        public Builder referenceDataSources(@Nullable AnalyticsApplicationReferenceDataSourcesGetArgs referenceDataSources) {
            this.referenceDataSources = Codegen.ofNullable(referenceDataSources);
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
        public Builder version(@Nullable Output<Integer> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable Integer version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public AnalyticsApplicationState build() {
            return new AnalyticsApplicationState(arn, cloudwatchLoggingOptions, code, createTimestamp, description, inputs, lastUpdateTimestamp, name, outputs, referenceDataSources, startApplication, status, tags, tagsAll, version);
        }
    }
}
