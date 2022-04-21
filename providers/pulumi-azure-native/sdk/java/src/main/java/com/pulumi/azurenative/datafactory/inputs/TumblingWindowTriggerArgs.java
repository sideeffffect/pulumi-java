// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.TumblingWindowFrequency;
import com.pulumi.azurenative.datafactory.inputs.RetryPolicyArgs;
import com.pulumi.azurenative.datafactory.inputs.SelfDependencyTumblingWindowTriggerReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.TriggerDependencyReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.TriggerPipelineReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.TumblingWindowTriggerDependencyReferenceArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Trigger that schedules pipeline runs for all fixed time interval windows from a start time without gaps and also supports backfill scenarios (when start time is in the past).
 * 
 */
public final class TumblingWindowTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final TumblingWindowTriggerArgs Empty = new TumblingWindowTriggerArgs();

    /**
     * List of tags that can be used for describing the trigger.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<Object>> annotations;

    public Optional<Output<List<Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Specifies how long the trigger waits past due time before triggering new run. It doesn&#39;t alter window start and end time. The default is 0. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="delay")
    private @Nullable Output<Object> delay;

    public Optional<Output<Object>> delay() {
        return Optional.ofNullable(this.delay);
    }

    /**
     * Triggers that this trigger depends on. Only tumbling window triggers are supported.
     * 
     */
    @Import(name="dependsOn")
    private @Nullable Output<List<Object>> dependsOn;

    public Optional<Output<List<Object>>> dependsOn() {
        return Optional.ofNullable(this.dependsOn);
    }

    /**
     * Trigger description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The end time for the time period for the trigger during which events are fired for windows that are ready. Only UTC time is currently supported.
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * The frequency of the time windows.
     * 
     */
    @Import(name="frequency", required=true)
    private Output<Either<String,TumblingWindowFrequency>> frequency;

    public Output<Either<String,TumblingWindowFrequency>> frequency() {
        return this.frequency;
    }

    /**
     * The interval of the time windows. The minimum interval allowed is 15 Minutes.
     * 
     */
    @Import(name="interval", required=true)
    private Output<Integer> interval;

    public Output<Integer> interval() {
        return this.interval;
    }

    /**
     * The max number of parallel time windows (ready for execution) for which a new run is triggered.
     * 
     */
    @Import(name="maxConcurrency", required=true)
    private Output<Integer> maxConcurrency;

    public Output<Integer> maxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * Pipeline for which runs are created when an event is fired for trigger window that is ready.
     * 
     */
    @Import(name="pipeline", required=true)
    private Output<TriggerPipelineReferenceArgs> pipeline;

    public Output<TriggerPipelineReferenceArgs> pipeline() {
        return this.pipeline;
    }

    /**
     * Retry policy that will be applied for failed pipeline runs.
     * 
     */
    @Import(name="retryPolicy")
    private @Nullable Output<RetryPolicyArgs> retryPolicy;

    public Optional<Output<RetryPolicyArgs>> retryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }

    /**
     * The start time for the time period for the trigger during which events are fired for windows that are ready. Only UTC time is currently supported.
     * 
     */
    @Import(name="startTime", required=true)
    private Output<String> startTime;

    public Output<String> startTime() {
        return this.startTime;
    }

    /**
     * Trigger type.
     * Expected value is &#39;TumblingWindowTrigger&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private TumblingWindowTriggerArgs() {}

    private TumblingWindowTriggerArgs(TumblingWindowTriggerArgs $) {
        this.annotations = $.annotations;
        this.delay = $.delay;
        this.dependsOn = $.dependsOn;
        this.description = $.description;
        this.endTime = $.endTime;
        this.frequency = $.frequency;
        this.interval = $.interval;
        this.maxConcurrency = $.maxConcurrency;
        this.pipeline = $.pipeline;
        this.retryPolicy = $.retryPolicy;
        this.startTime = $.startTime;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TumblingWindowTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TumblingWindowTriggerArgs $;

        public Builder() {
            $ = new TumblingWindowTriggerArgs();
        }

        public Builder(TumblingWindowTriggerArgs defaults) {
            $ = new TumblingWindowTriggerArgs(Objects.requireNonNull(defaults));
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(List<Object> annotations) {
            return annotations(Output.of(annotations));
        }

        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        public Builder delay(@Nullable Output<Object> delay) {
            $.delay = delay;
            return this;
        }

        public Builder delay(Object delay) {
            return delay(Output.of(delay));
        }

        public Builder dependsOn(@Nullable Output<List<Object>> dependsOn) {
            $.dependsOn = dependsOn;
            return this;
        }

        public Builder dependsOn(List<Object> dependsOn) {
            return dependsOn(Output.of(dependsOn));
        }

        public Builder dependsOn(Object... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        public Builder frequency(Output<Either<String,TumblingWindowFrequency>> frequency) {
            $.frequency = frequency;
            return this;
        }

        public Builder frequency(Either<String,TumblingWindowFrequency> frequency) {
            return frequency(Output.of(frequency));
        }

        public Builder interval(Output<Integer> interval) {
            $.interval = interval;
            return this;
        }

        public Builder interval(Integer interval) {
            return interval(Output.of(interval));
        }

        public Builder maxConcurrency(Output<Integer> maxConcurrency) {
            $.maxConcurrency = maxConcurrency;
            return this;
        }

        public Builder maxConcurrency(Integer maxConcurrency) {
            return maxConcurrency(Output.of(maxConcurrency));
        }

        public Builder pipeline(Output<TriggerPipelineReferenceArgs> pipeline) {
            $.pipeline = pipeline;
            return this;
        }

        public Builder pipeline(TriggerPipelineReferenceArgs pipeline) {
            return pipeline(Output.of(pipeline));
        }

        public Builder retryPolicy(@Nullable Output<RetryPolicyArgs> retryPolicy) {
            $.retryPolicy = retryPolicy;
            return this;
        }

        public Builder retryPolicy(RetryPolicyArgs retryPolicy) {
            return retryPolicy(Output.of(retryPolicy));
        }

        public Builder startTime(Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public TumblingWindowTriggerArgs build() {
            $.frequency = Objects.requireNonNull($.frequency, "expected parameter 'frequency' to be non-null");
            $.interval = Objects.requireNonNull($.interval, "expected parameter 'interval' to be non-null");
            $.maxConcurrency = Objects.requireNonNull($.maxConcurrency, "expected parameter 'maxConcurrency' to be non-null");
            $.pipeline = Objects.requireNonNull($.pipeline, "expected parameter 'pipeline' to be non-null");
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
