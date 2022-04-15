// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue;

import io.pulumi.aws.glue.inputs.MLTransformInputRecordTableArgs;
import io.pulumi.aws.glue.inputs.MLTransformParametersArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MLTransformArgs extends io.pulumi.resources.ResourceArgs {

    public static final MLTransformArgs Empty = new MLTransformArgs();

    /**
     * Description of the ML Transform.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The version of glue to use, for example "1.0". For information about available versions, see the [AWS Glue Release Notes](https://docs.aws.amazon.com/glue/latest/dg/release-notes.html).
     * 
     */
    @Import(name="glueVersion")
      private final @Nullable Output<String> glueVersion;

    public Output<String> glueVersion() {
        return this.glueVersion == null ? Codegen.empty() : this.glueVersion;
    }

    /**
     * A list of AWS Glue table definitions used by the transform. see Input Record Tables.
     * 
     */
    @Import(name="inputRecordTables", required=true)
      private final Output<List<MLTransformInputRecordTableArgs>> inputRecordTables;

    public Output<List<MLTransformInputRecordTableArgs>> inputRecordTables() {
        return this.inputRecordTables;
    }

    /**
     * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform. You can allocate from `2` to `100` DPUs; the default is `10`. `max_capacity` is a mutually exclusive option with `number_of_workers` and `worker_type`.
     * 
     */
    @Import(name="maxCapacity")
      private final @Nullable Output<Double> maxCapacity;

    public Output<Double> maxCapacity() {
        return this.maxCapacity == null ? Codegen.empty() : this.maxCapacity;
    }

    /**
     * The maximum number of times to retry this ML Transform if it fails.
     * 
     */
    @Import(name="maxRetries")
      private final @Nullable Output<Integer> maxRetries;

    public Output<Integer> maxRetries() {
        return this.maxRetries == null ? Codegen.empty() : this.maxRetries;
    }

    /**
     * The name you assign to this ML Transform. It must be unique in your account.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The number of workers of a defined `worker_type` that are allocated when an ML Transform runs. Required with `worker_type`.
     * 
     */
    @Import(name="numberOfWorkers")
      private final @Nullable Output<Integer> numberOfWorkers;

    public Output<Integer> numberOfWorkers() {
        return this.numberOfWorkers == null ? Codegen.empty() : this.numberOfWorkers;
    }

    /**
     * The algorithmic parameters that are specific to the transform type used. Conditionally dependent on the transform type. see Parameters.
     * 
     */
    @Import(name="parameters", required=true)
      private final Output<MLTransformParametersArgs> parameters;

    public Output<MLTransformParametersArgs> parameters() {
        return this.parameters;
    }

    /**
     * The ARN of the IAM role associated with this ML Transform.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The ML Transform timeout in minutes. The default is 2880 minutes (48 hours).
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<Integer> timeout;

    public Output<Integer> timeout() {
        return this.timeout == null ? Codegen.empty() : this.timeout;
    }

    /**
     * The type of predefined worker that is allocated when an ML Transform runs. Accepts a value of `Standard`, `G.1X`, or `G.2X`. Required with `number_of_workers`.
     * 
     */
    @Import(name="workerType")
      private final @Nullable Output<String> workerType;

    public Output<String> workerType() {
        return this.workerType == null ? Codegen.empty() : this.workerType;
    }

    public MLTransformArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> glueVersion,
        Output<List<MLTransformInputRecordTableArgs>> inputRecordTables,
        @Nullable Output<Double> maxCapacity,
        @Nullable Output<Integer> maxRetries,
        @Nullable Output<String> name,
        @Nullable Output<Integer> numberOfWorkers,
        Output<MLTransformParametersArgs> parameters,
        Output<String> roleArn,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Integer> timeout,
        @Nullable Output<String> workerType) {
        this.description = description;
        this.glueVersion = glueVersion;
        this.inputRecordTables = Objects.requireNonNull(inputRecordTables, "expected parameter 'inputRecordTables' to be non-null");
        this.maxCapacity = maxCapacity;
        this.maxRetries = maxRetries;
        this.name = name;
        this.numberOfWorkers = numberOfWorkers;
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.tags = tags;
        this.timeout = timeout;
        this.workerType = workerType;
    }

    private MLTransformArgs() {
        this.description = Codegen.empty();
        this.glueVersion = Codegen.empty();
        this.inputRecordTables = Codegen.empty();
        this.maxCapacity = Codegen.empty();
        this.maxRetries = Codegen.empty();
        this.name = Codegen.empty();
        this.numberOfWorkers = Codegen.empty();
        this.parameters = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.tags = Codegen.empty();
        this.timeout = Codegen.empty();
        this.workerType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MLTransformArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> glueVersion;
        private Output<List<MLTransformInputRecordTableArgs>> inputRecordTables;
        private @Nullable Output<Double> maxCapacity;
        private @Nullable Output<Integer> maxRetries;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> numberOfWorkers;
        private Output<MLTransformParametersArgs> parameters;
        private Output<String> roleArn;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Integer> timeout;
        private @Nullable Output<String> workerType;

        public Builder() {
    	      // Empty
        }

        public Builder(MLTransformArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.glueVersion = defaults.glueVersion;
    	      this.inputRecordTables = defaults.inputRecordTables;
    	      this.maxCapacity = defaults.maxCapacity;
    	      this.maxRetries = defaults.maxRetries;
    	      this.name = defaults.name;
    	      this.numberOfWorkers = defaults.numberOfWorkers;
    	      this.parameters = defaults.parameters;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
    	      this.workerType = defaults.workerType;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder glueVersion(@Nullable Output<String> glueVersion) {
            this.glueVersion = glueVersion;
            return this;
        }
        public Builder glueVersion(@Nullable String glueVersion) {
            this.glueVersion = Codegen.ofNullable(glueVersion);
            return this;
        }
        public Builder inputRecordTables(Output<List<MLTransformInputRecordTableArgs>> inputRecordTables) {
            this.inputRecordTables = Objects.requireNonNull(inputRecordTables);
            return this;
        }
        public Builder inputRecordTables(List<MLTransformInputRecordTableArgs> inputRecordTables) {
            this.inputRecordTables = Output.of(Objects.requireNonNull(inputRecordTables));
            return this;
        }
        public Builder inputRecordTables(MLTransformInputRecordTableArgs... inputRecordTables) {
            return inputRecordTables(List.of(inputRecordTables));
        }
        public Builder maxCapacity(@Nullable Output<Double> maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }
        public Builder maxCapacity(@Nullable Double maxCapacity) {
            this.maxCapacity = Codegen.ofNullable(maxCapacity);
            return this;
        }
        public Builder maxRetries(@Nullable Output<Integer> maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }
        public Builder maxRetries(@Nullable Integer maxRetries) {
            this.maxRetries = Codegen.ofNullable(maxRetries);
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
        public Builder numberOfWorkers(@Nullable Output<Integer> numberOfWorkers) {
            this.numberOfWorkers = numberOfWorkers;
            return this;
        }
        public Builder numberOfWorkers(@Nullable Integer numberOfWorkers) {
            this.numberOfWorkers = Codegen.ofNullable(numberOfWorkers);
            return this;
        }
        public Builder parameters(Output<MLTransformParametersArgs> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(MLTransformParametersArgs parameters) {
            this.parameters = Output.of(Objects.requireNonNull(parameters));
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
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
        public Builder timeout(@Nullable Output<Integer> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = Codegen.ofNullable(timeout);
            return this;
        }
        public Builder workerType(@Nullable Output<String> workerType) {
            this.workerType = workerType;
            return this;
        }
        public Builder workerType(@Nullable String workerType) {
            this.workerType = Codegen.ofNullable(workerType);
            return this;
        }        public MLTransformArgs build() {
            return new MLTransformArgs(description, glueVersion, inputRecordTables, maxCapacity, maxRetries, name, numberOfWorkers, parameters, roleArn, tags, timeout, workerType);
        }
    }
}
