// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.RetryPolicyResponse;
import io.pulumi.azurenative.datafactory.outputs.SelfDependencyTumblingWindowTriggerReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.TriggerDependencyReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.TriggerPipelineReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.TumblingWindowTriggerDependencyReferenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TumblingWindowTriggerResponse {
    /**
     * List of tags that can be used for describing the trigger.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * Specifies how long the trigger waits past due time before triggering new run. It doesn't alter window start and end time. The default is 0. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object delay;
    /**
     * Triggers that this trigger depends on. Only tumbling window triggers are supported.
     * 
     */
    private final @Nullable List<Object> dependsOn;
    /**
     * Trigger description.
     * 
     */
    private final @Nullable String description;
    /**
     * The end time for the time period for the trigger during which events are fired for windows that are ready. Only UTC time is currently supported.
     * 
     */
    private final @Nullable String endTime;
    /**
     * The frequency of the time windows.
     * 
     */
    private final String frequency;
    /**
     * The interval of the time windows. The minimum interval allowed is 15 Minutes.
     * 
     */
    private final Integer interval;
    /**
     * The max number of parallel time windows (ready for execution) for which a new run is triggered.
     * 
     */
    private final Integer maxConcurrency;
    /**
     * Pipeline for which runs are created when an event is fired for trigger window that is ready.
     * 
     */
    private final TriggerPipelineReferenceResponse pipeline;
    /**
     * Retry policy that will be applied for failed pipeline runs.
     * 
     */
    private final @Nullable RetryPolicyResponse retryPolicy;
    /**
     * Indicates if trigger is running or not. Updated when Start/Stop APIs are called on the Trigger.
     * 
     */
    private final String runtimeState;
    /**
     * The start time for the time period for the trigger during which events are fired for windows that are ready. Only UTC time is currently supported.
     * 
     */
    private final String startTime;
    /**
     * Trigger type.
     * Expected value is 'TumblingWindowTrigger'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"annotations","delay","dependsOn","description","endTime","frequency","interval","maxConcurrency","pipeline","retryPolicy","runtimeState","startTime","type"})
    private TumblingWindowTriggerResponse(
        @Nullable List<Object> annotations,
        @Nullable Object delay,
        @Nullable List<Object> dependsOn,
        @Nullable String description,
        @Nullable String endTime,
        String frequency,
        Integer interval,
        Integer maxConcurrency,
        TriggerPipelineReferenceResponse pipeline,
        @Nullable RetryPolicyResponse retryPolicy,
        String runtimeState,
        String startTime,
        String type) {
        this.annotations = annotations;
        this.delay = delay;
        this.dependsOn = dependsOn;
        this.description = description;
        this.endTime = endTime;
        this.frequency = frequency;
        this.interval = interval;
        this.maxConcurrency = maxConcurrency;
        this.pipeline = pipeline;
        this.retryPolicy = retryPolicy;
        this.runtimeState = runtimeState;
        this.startTime = startTime;
        this.type = type;
    }

    /**
     * List of tags that can be used for describing the trigger.
     * 
    */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * Specifies how long the trigger waits past due time before triggering new run. It doesn't alter window start and end time. The default is 0. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> getDelay() {
        return Optional.ofNullable(this.delay);
    }
    /**
     * Triggers that this trigger depends on. Only tumbling window triggers are supported.
     * 
    */
    public List<Object> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Trigger description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The end time for the time period for the trigger during which events are fired for windows that are ready. Only UTC time is currently supported.
     * 
    */
    public Optional<String> getEndTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * The frequency of the time windows.
     * 
    */
    public String getFrequency() {
        return this.frequency;
    }
    /**
     * The interval of the time windows. The minimum interval allowed is 15 Minutes.
     * 
    */
    public Integer getInterval() {
        return this.interval;
    }
    /**
     * The max number of parallel time windows (ready for execution) for which a new run is triggered.
     * 
    */
    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }
    /**
     * Pipeline for which runs are created when an event is fired for trigger window that is ready.
     * 
    */
    public TriggerPipelineReferenceResponse getPipeline() {
        return this.pipeline;
    }
    /**
     * Retry policy that will be applied for failed pipeline runs.
     * 
    */
    public Optional<RetryPolicyResponse> getRetryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }
    /**
     * Indicates if trigger is running or not. Updated when Start/Stop APIs are called on the Trigger.
     * 
    */
    public String getRuntimeState() {
        return this.runtimeState;
    }
    /**
     * The start time for the time period for the trigger during which events are fired for windows that are ready. Only UTC time is currently supported.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * Trigger type.
     * Expected value is 'TumblingWindowTrigger'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TumblingWindowTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable Object delay;
        private @Nullable List<Object> dependsOn;
        private @Nullable String description;
        private @Nullable String endTime;
        private String frequency;
        private Integer interval;
        private Integer maxConcurrency;
        private TriggerPipelineReferenceResponse pipeline;
        private @Nullable RetryPolicyResponse retryPolicy;
        private String runtimeState;
        private String startTime;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TumblingWindowTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.delay = defaults.delay;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.endTime = defaults.endTime;
    	      this.frequency = defaults.frequency;
    	      this.interval = defaults.interval;
    	      this.maxConcurrency = defaults.maxConcurrency;
    	      this.pipeline = defaults.pipeline;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.runtimeState = defaults.runtimeState;
    	      this.startTime = defaults.startTime;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setDelay(@Nullable Object delay) {
            this.delay = delay;
            return this;
        }

        public Builder setDependsOn(@Nullable List<Object> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setFrequency(String frequency) {
            this.frequency = Objects.requireNonNull(frequency);
            return this;
        }

        public Builder setInterval(Integer interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }

        public Builder setMaxConcurrency(Integer maxConcurrency) {
            this.maxConcurrency = Objects.requireNonNull(maxConcurrency);
            return this;
        }

        public Builder setPipeline(TriggerPipelineReferenceResponse pipeline) {
            this.pipeline = Objects.requireNonNull(pipeline);
            return this;
        }

        public Builder setRetryPolicy(@Nullable RetryPolicyResponse retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        public Builder setRuntimeState(String runtimeState) {
            this.runtimeState = Objects.requireNonNull(runtimeState);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public TumblingWindowTriggerResponse build() {
            return new TumblingWindowTriggerResponse(annotations, delay, dependsOn, description, endTime, frequency, interval, maxConcurrency, pipeline, retryPolicy, runtimeState, startTime, type);
        }
    }
}
