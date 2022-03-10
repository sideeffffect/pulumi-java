// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics;

import io.pulumi.azurenative.streamanalytics.enums.CompatibilityLevel;
import io.pulumi.azurenative.streamanalytics.enums.EventsOutOfOrderPolicy;
import io.pulumi.azurenative.streamanalytics.enums.OutputErrorPolicy;
import io.pulumi.azurenative.streamanalytics.enums.OutputStartMode;
import io.pulumi.azurenative.streamanalytics.inputs.FunctionArgs;
import io.pulumi.azurenative.streamanalytics.inputs.InputArgs;
import io.pulumi.azurenative.streamanalytics.inputs.OutputArgs;
import io.pulumi.azurenative.streamanalytics.inputs.SkuArgs;
import io.pulumi.azurenative.streamanalytics.inputs.TransformationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StreamingJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamingJobArgs Empty = new StreamingJobArgs();

    /**
     * Controls certain runtime behaviors of the streaming job.
     * 
     */
    @InputImport(name="compatibilityLevel")
      private final @Nullable Input<Either<String,CompatibilityLevel>> compatibilityLevel;

    public Input<Either<String,CompatibilityLevel>> getCompatibilityLevel() {
        return this.compatibilityLevel == null ? Input.empty() : this.compatibilityLevel;
    }

    /**
     * The data locale of the stream analytics job. Value should be the name of a supported .NET Culture from the set https://msdn.microsoft.com/en-us/library/system.globalization.culturetypes(v=vs.110).aspx. Defaults to 'en-US' if none specified.
     * 
     */
    @InputImport(name="dataLocale")
      private final @Nullable Input<String> dataLocale;

    public Input<String> getDataLocale() {
        return this.dataLocale == null ? Input.empty() : this.dataLocale;
    }

    /**
     * The maximum tolerable delay in seconds where events arriving late could be included.  Supported range is -1 to 1814399 (20.23:59:59 days) and -1 is used to specify wait indefinitely. If the property is absent, it is interpreted to have a value of -1.
     * 
     */
    @InputImport(name="eventsLateArrivalMaxDelayInSeconds")
      private final @Nullable Input<Integer> eventsLateArrivalMaxDelayInSeconds;

    public Input<Integer> getEventsLateArrivalMaxDelayInSeconds() {
        return this.eventsLateArrivalMaxDelayInSeconds == null ? Input.empty() : this.eventsLateArrivalMaxDelayInSeconds;
    }

    /**
     * The maximum tolerable delay in seconds where out-of-order events can be adjusted to be back in order.
     * 
     */
    @InputImport(name="eventsOutOfOrderMaxDelayInSeconds")
      private final @Nullable Input<Integer> eventsOutOfOrderMaxDelayInSeconds;

    public Input<Integer> getEventsOutOfOrderMaxDelayInSeconds() {
        return this.eventsOutOfOrderMaxDelayInSeconds == null ? Input.empty() : this.eventsOutOfOrderMaxDelayInSeconds;
    }

    /**
     * Indicates the policy to apply to events that arrive out of order in the input event stream.
     * 
     */
    @InputImport(name="eventsOutOfOrderPolicy")
      private final @Nullable Input<Either<String,EventsOutOfOrderPolicy>> eventsOutOfOrderPolicy;

    public Input<Either<String,EventsOutOfOrderPolicy>> getEventsOutOfOrderPolicy() {
        return this.eventsOutOfOrderPolicy == null ? Input.empty() : this.eventsOutOfOrderPolicy;
    }

    /**
     * A list of one or more functions for the streaming job. The name property for each function is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual transformation.
     * 
     */
    @InputImport(name="functions")
      private final @Nullable Input<List<FunctionArgs>> functions;

    public Input<List<FunctionArgs>> getFunctions() {
        return this.functions == null ? Input.empty() : this.functions;
    }

    /**
     * A list of one or more inputs to the streaming job. The name property for each input is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual input.
     * 
     */
    @InputImport(name="inputs")
      private final @Nullable Input<List<InputArgs>> inputs;

    public Input<List<InputArgs>> getInputs() {
        return this.inputs == null ? Input.empty() : this.inputs;
    }

    /**
     * The name of the streaming job.
     * 
     */
    @InputImport(name="jobName")
      private final @Nullable Input<String> jobName;

    public Input<String> getJobName() {
        return this.jobName == null ? Input.empty() : this.jobName;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Indicates the policy to apply to events that arrive at the output and cannot be written to the external storage due to being malformed (missing column values, column values of wrong type or size).
     * 
     */
    @InputImport(name="outputErrorPolicy")
      private final @Nullable Input<Either<String,OutputErrorPolicy>> outputErrorPolicy;

    public Input<Either<String,OutputErrorPolicy>> getOutputErrorPolicy() {
        return this.outputErrorPolicy == null ? Input.empty() : this.outputErrorPolicy;
    }

    /**
     * This property should only be utilized when it is desired that the job be started immediately upon creation. Value may be JobStartTime, CustomTime, or LastOutputEventTime to indicate whether the starting point of the output event stream should start whenever the job is started, start at a custom user time stamp specified via the outputStartTime property, or start from the last event output time.
     * 
     */
    @InputImport(name="outputStartMode")
      private final @Nullable Input<Either<String,OutputStartMode>> outputStartMode;

    public Input<Either<String,OutputStartMode>> getOutputStartMode() {
        return this.outputStartMode == null ? Input.empty() : this.outputStartMode;
    }

    /**
     * Value is either an ISO-8601 formatted time stamp that indicates the starting point of the output event stream, or null to indicate that the output event stream will start whenever the streaming job is started. This property must have a value if outputStartMode is set to CustomTime.
     * 
     */
    @InputImport(name="outputStartTime")
      private final @Nullable Input<String> outputStartTime;

    public Input<String> getOutputStartTime() {
        return this.outputStartTime == null ? Input.empty() : this.outputStartTime;
    }

    /**
     * A list of one or more outputs for the streaming job. The name property for each output is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual output.
     * 
     */
    @InputImport(name="outputs")
      private final @Nullable Input<List<OutputArgs>> outputs;

    public Input<List<OutputArgs>> getOutputs() {
        return this.outputs == null ? Input.empty() : this.outputs;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Describes the SKU of the streaming job. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="sku")
      private final @Nullable Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Indicates the query and the number of streaming units to use for the streaming job. The name property of the transformation is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual transformation.
     * 
     */
    @InputImport(name="transformation")
      private final @Nullable Input<TransformationArgs> transformation;

    public Input<TransformationArgs> getTransformation() {
        return this.transformation == null ? Input.empty() : this.transformation;
    }

    public StreamingJobArgs(
        @Nullable Input<Either<String,CompatibilityLevel>> compatibilityLevel,
        @Nullable Input<String> dataLocale,
        @Nullable Input<Integer> eventsLateArrivalMaxDelayInSeconds,
        @Nullable Input<Integer> eventsOutOfOrderMaxDelayInSeconds,
        @Nullable Input<Either<String,EventsOutOfOrderPolicy>> eventsOutOfOrderPolicy,
        @Nullable Input<List<FunctionArgs>> functions,
        @Nullable Input<List<InputArgs>> inputs,
        @Nullable Input<String> jobName,
        @Nullable Input<String> location,
        @Nullable Input<Either<String,OutputErrorPolicy>> outputErrorPolicy,
        @Nullable Input<Either<String,OutputStartMode>> outputStartMode,
        @Nullable Input<String> outputStartTime,
        @Nullable Input<List<OutputArgs>> outputs,
        Input<String> resourceGroupName,
        @Nullable Input<SkuArgs> sku,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<TransformationArgs> transformation) {
        this.compatibilityLevel = compatibilityLevel;
        this.dataLocale = dataLocale;
        this.eventsLateArrivalMaxDelayInSeconds = eventsLateArrivalMaxDelayInSeconds;
        this.eventsOutOfOrderMaxDelayInSeconds = eventsOutOfOrderMaxDelayInSeconds;
        this.eventsOutOfOrderPolicy = eventsOutOfOrderPolicy;
        this.functions = functions;
        this.inputs = inputs;
        this.jobName = jobName;
        this.location = location;
        this.outputErrorPolicy = outputErrorPolicy;
        this.outputStartMode = outputStartMode;
        this.outputStartTime = outputStartTime;
        this.outputs = outputs;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
        this.transformation = transformation;
    }

    private StreamingJobArgs() {
        this.compatibilityLevel = Input.empty();
        this.dataLocale = Input.empty();
        this.eventsLateArrivalMaxDelayInSeconds = Input.empty();
        this.eventsOutOfOrderMaxDelayInSeconds = Input.empty();
        this.eventsOutOfOrderPolicy = Input.empty();
        this.functions = Input.empty();
        this.inputs = Input.empty();
        this.jobName = Input.empty();
        this.location = Input.empty();
        this.outputErrorPolicy = Input.empty();
        this.outputStartMode = Input.empty();
        this.outputStartTime = Input.empty();
        this.outputs = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
        this.transformation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,CompatibilityLevel>> compatibilityLevel;
        private @Nullable Input<String> dataLocale;
        private @Nullable Input<Integer> eventsLateArrivalMaxDelayInSeconds;
        private @Nullable Input<Integer> eventsOutOfOrderMaxDelayInSeconds;
        private @Nullable Input<Either<String,EventsOutOfOrderPolicy>> eventsOutOfOrderPolicy;
        private @Nullable Input<List<FunctionArgs>> functions;
        private @Nullable Input<List<InputArgs>> inputs;
        private @Nullable Input<String> jobName;
        private @Nullable Input<String> location;
        private @Nullable Input<Either<String,OutputErrorPolicy>> outputErrorPolicy;
        private @Nullable Input<Either<String,OutputStartMode>> outputStartMode;
        private @Nullable Input<String> outputStartTime;
        private @Nullable Input<List<OutputArgs>> outputs;
        private Input<String> resourceGroupName;
        private @Nullable Input<SkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<TransformationArgs> transformation;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compatibilityLevel = defaults.compatibilityLevel;
    	      this.dataLocale = defaults.dataLocale;
    	      this.eventsLateArrivalMaxDelayInSeconds = defaults.eventsLateArrivalMaxDelayInSeconds;
    	      this.eventsOutOfOrderMaxDelayInSeconds = defaults.eventsOutOfOrderMaxDelayInSeconds;
    	      this.eventsOutOfOrderPolicy = defaults.eventsOutOfOrderPolicy;
    	      this.functions = defaults.functions;
    	      this.inputs = defaults.inputs;
    	      this.jobName = defaults.jobName;
    	      this.location = defaults.location;
    	      this.outputErrorPolicy = defaults.outputErrorPolicy;
    	      this.outputStartMode = defaults.outputStartMode;
    	      this.outputStartTime = defaults.outputStartTime;
    	      this.outputs = defaults.outputs;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.transformation = defaults.transformation;
        }

        public Builder compatibilityLevel(@Nullable Input<Either<String,CompatibilityLevel>> compatibilityLevel) {
            this.compatibilityLevel = compatibilityLevel;
            return this;
        }

        public Builder compatibilityLevel(@Nullable Either<String,CompatibilityLevel> compatibilityLevel) {
            this.compatibilityLevel = Input.ofNullable(compatibilityLevel);
            return this;
        }

        public Builder dataLocale(@Nullable Input<String> dataLocale) {
            this.dataLocale = dataLocale;
            return this;
        }

        public Builder dataLocale(@Nullable String dataLocale) {
            this.dataLocale = Input.ofNullable(dataLocale);
            return this;
        }

        public Builder eventsLateArrivalMaxDelayInSeconds(@Nullable Input<Integer> eventsLateArrivalMaxDelayInSeconds) {
            this.eventsLateArrivalMaxDelayInSeconds = eventsLateArrivalMaxDelayInSeconds;
            return this;
        }

        public Builder eventsLateArrivalMaxDelayInSeconds(@Nullable Integer eventsLateArrivalMaxDelayInSeconds) {
            this.eventsLateArrivalMaxDelayInSeconds = Input.ofNullable(eventsLateArrivalMaxDelayInSeconds);
            return this;
        }

        public Builder eventsOutOfOrderMaxDelayInSeconds(@Nullable Input<Integer> eventsOutOfOrderMaxDelayInSeconds) {
            this.eventsOutOfOrderMaxDelayInSeconds = eventsOutOfOrderMaxDelayInSeconds;
            return this;
        }

        public Builder eventsOutOfOrderMaxDelayInSeconds(@Nullable Integer eventsOutOfOrderMaxDelayInSeconds) {
            this.eventsOutOfOrderMaxDelayInSeconds = Input.ofNullable(eventsOutOfOrderMaxDelayInSeconds);
            return this;
        }

        public Builder eventsOutOfOrderPolicy(@Nullable Input<Either<String,EventsOutOfOrderPolicy>> eventsOutOfOrderPolicy) {
            this.eventsOutOfOrderPolicy = eventsOutOfOrderPolicy;
            return this;
        }

        public Builder eventsOutOfOrderPolicy(@Nullable Either<String,EventsOutOfOrderPolicy> eventsOutOfOrderPolicy) {
            this.eventsOutOfOrderPolicy = Input.ofNullable(eventsOutOfOrderPolicy);
            return this;
        }

        public Builder functions(@Nullable Input<List<FunctionArgs>> functions) {
            this.functions = functions;
            return this;
        }

        public Builder functions(@Nullable List<FunctionArgs> functions) {
            this.functions = Input.ofNullable(functions);
            return this;
        }

        public Builder inputs(@Nullable Input<List<InputArgs>> inputs) {
            this.inputs = inputs;
            return this;
        }

        public Builder inputs(@Nullable List<InputArgs> inputs) {
            this.inputs = Input.ofNullable(inputs);
            return this;
        }

        public Builder jobName(@Nullable Input<String> jobName) {
            this.jobName = jobName;
            return this;
        }

        public Builder jobName(@Nullable String jobName) {
            this.jobName = Input.ofNullable(jobName);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder outputErrorPolicy(@Nullable Input<Either<String,OutputErrorPolicy>> outputErrorPolicy) {
            this.outputErrorPolicy = outputErrorPolicy;
            return this;
        }

        public Builder outputErrorPolicy(@Nullable Either<String,OutputErrorPolicy> outputErrorPolicy) {
            this.outputErrorPolicy = Input.ofNullable(outputErrorPolicy);
            return this;
        }

        public Builder outputStartMode(@Nullable Input<Either<String,OutputStartMode>> outputStartMode) {
            this.outputStartMode = outputStartMode;
            return this;
        }

        public Builder outputStartMode(@Nullable Either<String,OutputStartMode> outputStartMode) {
            this.outputStartMode = Input.ofNullable(outputStartMode);
            return this;
        }

        public Builder outputStartTime(@Nullable Input<String> outputStartTime) {
            this.outputStartTime = outputStartTime;
            return this;
        }

        public Builder outputStartTime(@Nullable String outputStartTime) {
            this.outputStartTime = Input.ofNullable(outputStartTime);
            return this;
        }

        public Builder outputs(@Nullable Input<List<OutputArgs>> outputs) {
            this.outputs = outputs;
            return this;
        }

        public Builder outputs(@Nullable List<OutputArgs> outputs) {
            this.outputs = Input.ofNullable(outputs);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder sku(@Nullable Input<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder sku(@Nullable SkuArgs sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder transformation(@Nullable Input<TransformationArgs> transformation) {
            this.transformation = transformation;
            return this;
        }

        public Builder transformation(@Nullable TransformationArgs transformation) {
            this.transformation = Input.ofNullable(transformation);
            return this;
        }
        public StreamingJobArgs build() {
            return new StreamingJobArgs(compatibilityLevel, dataLocale, eventsLateArrivalMaxDelayInSeconds, eventsOutOfOrderMaxDelayInSeconds, eventsOutOfOrderPolicy, functions, inputs, jobName, location, outputErrorPolicy, outputStartMode, outputStartTime, outputs, resourceGroupName, sku, tags, transformation);
        }
    }
}
