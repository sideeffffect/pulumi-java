// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2;

import io.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionArgs;
import io.pulumi.aws.macie2.inputs.ClassificationJobScheduleFrequencyArgs;
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


public final class ClassificationJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClassificationJobArgs Empty = new ClassificationJobArgs();

    /**
     * The custom data identifiers to use for data analysis and classification.
     * 
     */
    @Import(name="customDataIdentifierIds")
      private final @Nullable Output<List<String>> customDataIdentifierIds;

    public Output<List<String>> customDataIdentifierIds() {
        return this.customDataIdentifierIds == null ? Codegen.empty() : this.customDataIdentifierIds;
    }

    /**
     * A custom description of the job. The description can contain as many as 200 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Specifies whether to analyze all existing, eligible objects immediately after the job is created.
     * 
     */
    @Import(name="initialRun")
      private final @Nullable Output<Boolean> initialRun;

    public Output<Boolean> initialRun() {
        return this.initialRun == null ? Codegen.empty() : this.initialRun;
    }

    /**
     * The status for the job. Valid values are: `CANCELLED`, `RUNNING` and `USER_PAUSED`
     * 
     */
    @Import(name="jobStatus")
      private final @Nullable Output<String> jobStatus;

    public Output<String> jobStatus() {
        return this.jobStatus == null ? Codegen.empty() : this.jobStatus;
    }

    /**
     * The schedule for running the job. Valid values are: `ONE_TIME` - Run the job only once. If you specify this value, don't specify a value for the `schedule_frequency` property. `SCHEDULED` - Run the job on a daily, weekly, or monthly basis. If you specify this value, use the `schedule_frequency` property to define the recurrence pattern for the job.
     * 
     */
    @Import(name="jobType", required=true)
      private final Output<String> jobType;

    public Output<String> jobType() {
        return this.jobType;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> namePrefix() {
        return this.namePrefix == null ? Codegen.empty() : this.namePrefix;
    }

    /**
     * The S3 buckets that contain the objects to analyze, and the scope of that analysis. (documented below)
     * 
     */
    @Import(name="s3JobDefinition", required=true)
      private final Output<ClassificationJobS3JobDefinitionArgs> s3JobDefinition;

    public Output<ClassificationJobS3JobDefinitionArgs> s3JobDefinition() {
        return this.s3JobDefinition;
    }

    /**
     * The sampling depth, as a percentage, to apply when processing objects. This value determines the percentage of eligible objects that the job analyzes. If this value is less than 100, Amazon Macie selects the objects to analyze at random, up to the specified percentage, and analyzes all the data in those objects.
     * 
     */
    @Import(name="samplingPercentage")
      private final @Nullable Output<Integer> samplingPercentage;

    public Output<Integer> samplingPercentage() {
        return this.samplingPercentage == null ? Codegen.empty() : this.samplingPercentage;
    }

    /**
     * The recurrence pattern for running the job. To run the job only once, don't specify a value for this property and set the value for the `job_type` property to `ONE_TIME`. (documented below)
     * 
     */
    @Import(name="scheduleFrequency")
      private final @Nullable Output<ClassificationJobScheduleFrequencyArgs> scheduleFrequency;

    public Output<ClassificationJobScheduleFrequencyArgs> scheduleFrequency() {
        return this.scheduleFrequency == null ? Codegen.empty() : this.scheduleFrequency;
    }

    /**
     * A map of key-value pairs that specifies the tags to associate with the job. A job can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ClassificationJobArgs(
        @Nullable Output<List<String>> customDataIdentifierIds,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> initialRun,
        @Nullable Output<String> jobStatus,
        Output<String> jobType,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        Output<ClassificationJobS3JobDefinitionArgs> s3JobDefinition,
        @Nullable Output<Integer> samplingPercentage,
        @Nullable Output<ClassificationJobScheduleFrequencyArgs> scheduleFrequency,
        @Nullable Output<Map<String,String>> tags) {
        this.customDataIdentifierIds = customDataIdentifierIds;
        this.description = description;
        this.initialRun = initialRun;
        this.jobStatus = jobStatus;
        this.jobType = Objects.requireNonNull(jobType, "expected parameter 'jobType' to be non-null");
        this.name = name;
        this.namePrefix = namePrefix;
        this.s3JobDefinition = Objects.requireNonNull(s3JobDefinition, "expected parameter 's3JobDefinition' to be non-null");
        this.samplingPercentage = samplingPercentage;
        this.scheduleFrequency = scheduleFrequency;
        this.tags = tags;
    }

    private ClassificationJobArgs() {
        this.customDataIdentifierIds = Codegen.empty();
        this.description = Codegen.empty();
        this.initialRun = Codegen.empty();
        this.jobStatus = Codegen.empty();
        this.jobType = Codegen.empty();
        this.name = Codegen.empty();
        this.namePrefix = Codegen.empty();
        this.s3JobDefinition = Codegen.empty();
        this.samplingPercentage = Codegen.empty();
        this.scheduleFrequency = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> customDataIdentifierIds;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> initialRun;
        private @Nullable Output<String> jobStatus;
        private Output<String> jobType;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private Output<ClassificationJobS3JobDefinitionArgs> s3JobDefinition;
        private @Nullable Output<Integer> samplingPercentage;
        private @Nullable Output<ClassificationJobScheduleFrequencyArgs> scheduleFrequency;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customDataIdentifierIds = defaults.customDataIdentifierIds;
    	      this.description = defaults.description;
    	      this.initialRun = defaults.initialRun;
    	      this.jobStatus = defaults.jobStatus;
    	      this.jobType = defaults.jobType;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.s3JobDefinition = defaults.s3JobDefinition;
    	      this.samplingPercentage = defaults.samplingPercentage;
    	      this.scheduleFrequency = defaults.scheduleFrequency;
    	      this.tags = defaults.tags;
        }

        public Builder customDataIdentifierIds(@Nullable Output<List<String>> customDataIdentifierIds) {
            this.customDataIdentifierIds = customDataIdentifierIds;
            return this;
        }
        public Builder customDataIdentifierIds(@Nullable List<String> customDataIdentifierIds) {
            this.customDataIdentifierIds = Codegen.ofNullable(customDataIdentifierIds);
            return this;
        }
        public Builder customDataIdentifierIds(String... customDataIdentifierIds) {
            return customDataIdentifierIds(List.of(customDataIdentifierIds));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder initialRun(@Nullable Output<Boolean> initialRun) {
            this.initialRun = initialRun;
            return this;
        }
        public Builder initialRun(@Nullable Boolean initialRun) {
            this.initialRun = Codegen.ofNullable(initialRun);
            return this;
        }
        public Builder jobStatus(@Nullable Output<String> jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public Builder jobStatus(@Nullable String jobStatus) {
            this.jobStatus = Codegen.ofNullable(jobStatus);
            return this;
        }
        public Builder jobType(Output<String> jobType) {
            this.jobType = Objects.requireNonNull(jobType);
            return this;
        }
        public Builder jobType(String jobType) {
            this.jobType = Output.of(Objects.requireNonNull(jobType));
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
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Codegen.ofNullable(namePrefix);
            return this;
        }
        public Builder s3JobDefinition(Output<ClassificationJobS3JobDefinitionArgs> s3JobDefinition) {
            this.s3JobDefinition = Objects.requireNonNull(s3JobDefinition);
            return this;
        }
        public Builder s3JobDefinition(ClassificationJobS3JobDefinitionArgs s3JobDefinition) {
            this.s3JobDefinition = Output.of(Objects.requireNonNull(s3JobDefinition));
            return this;
        }
        public Builder samplingPercentage(@Nullable Output<Integer> samplingPercentage) {
            this.samplingPercentage = samplingPercentage;
            return this;
        }
        public Builder samplingPercentage(@Nullable Integer samplingPercentage) {
            this.samplingPercentage = Codegen.ofNullable(samplingPercentage);
            return this;
        }
        public Builder scheduleFrequency(@Nullable Output<ClassificationJobScheduleFrequencyArgs> scheduleFrequency) {
            this.scheduleFrequency = scheduleFrequency;
            return this;
        }
        public Builder scheduleFrequency(@Nullable ClassificationJobScheduleFrequencyArgs scheduleFrequency) {
            this.scheduleFrequency = Codegen.ofNullable(scheduleFrequency);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public ClassificationJobArgs build() {
            return new ClassificationJobArgs(customDataIdentifierIds, description, initialRun, jobStatus, jobType, name, namePrefix, s3JobDefinition, samplingPercentage, scheduleFrequency, tags);
        }
    }
}
