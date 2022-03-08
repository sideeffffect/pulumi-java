// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dataflow_v1b3.outputs.ComponentSourceResponse;
import io.pulumi.googlenative.dataflow_v1b3.outputs.ComponentTransformResponse;
import io.pulumi.googlenative.dataflow_v1b3.outputs.StageSourceResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ExecutionStageSummaryResponse {
    /**
     * Collections produced and consumed by component transforms of this stage.
     * 
     */
    private final List<ComponentSourceResponse> componentSource;
    /**
     * Transforms that comprise this execution stage.
     * 
     */
    private final List<ComponentTransformResponse> componentTransform;
    /**
     * Input sources for this stage.
     * 
     */
    private final List<StageSourceResponse> inputSource;
    /**
     * Type of transform this stage is executing.
     * 
     */
    private final String kind;
    /**
     * Dataflow service generated name for this stage.
     * 
     */
    private final String name;
    /**
     * Output sources for this stage.
     * 
     */
    private final List<StageSourceResponse> outputSource;
    /**
     * Other stages that must complete before this stage can run.
     * 
     */
    private final List<String> prerequisiteStage;

    @OutputCustomType.Constructor({"componentSource","componentTransform","inputSource","kind","name","outputSource","prerequisiteStage"})
    private ExecutionStageSummaryResponse(
        List<ComponentSourceResponse> componentSource,
        List<ComponentTransformResponse> componentTransform,
        List<StageSourceResponse> inputSource,
        String kind,
        String name,
        List<StageSourceResponse> outputSource,
        List<String> prerequisiteStage) {
        this.componentSource = componentSource;
        this.componentTransform = componentTransform;
        this.inputSource = inputSource;
        this.kind = kind;
        this.name = name;
        this.outputSource = outputSource;
        this.prerequisiteStage = prerequisiteStage;
    }

    /**
     * Collections produced and consumed by component transforms of this stage.
     * 
    */
    public List<ComponentSourceResponse> getComponentSource() {
        return this.componentSource;
    }
    /**
     * Transforms that comprise this execution stage.
     * 
    */
    public List<ComponentTransformResponse> getComponentTransform() {
        return this.componentTransform;
    }
    /**
     * Input sources for this stage.
     * 
    */
    public List<StageSourceResponse> getInputSource() {
        return this.inputSource;
    }
    /**
     * Type of transform this stage is executing.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Dataflow service generated name for this stage.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Output sources for this stage.
     * 
    */
    public List<StageSourceResponse> getOutputSource() {
        return this.outputSource;
    }
    /**
     * Other stages that must complete before this stage can run.
     * 
    */
    public List<String> getPrerequisiteStage() {
        return this.prerequisiteStage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecutionStageSummaryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ComponentSourceResponse> componentSource;
        private List<ComponentTransformResponse> componentTransform;
        private List<StageSourceResponse> inputSource;
        private String kind;
        private String name;
        private List<StageSourceResponse> outputSource;
        private List<String> prerequisiteStage;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecutionStageSummaryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentSource = defaults.componentSource;
    	      this.componentTransform = defaults.componentTransform;
    	      this.inputSource = defaults.inputSource;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.outputSource = defaults.outputSource;
    	      this.prerequisiteStage = defaults.prerequisiteStage;
        }

        public Builder setComponentSource(List<ComponentSourceResponse> componentSource) {
            this.componentSource = Objects.requireNonNull(componentSource);
            return this;
        }

        public Builder setComponentTransform(List<ComponentTransformResponse> componentTransform) {
            this.componentTransform = Objects.requireNonNull(componentTransform);
            return this;
        }

        public Builder setInputSource(List<StageSourceResponse> inputSource) {
            this.inputSource = Objects.requireNonNull(inputSource);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOutputSource(List<StageSourceResponse> outputSource) {
            this.outputSource = Objects.requireNonNull(outputSource);
            return this;
        }

        public Builder setPrerequisiteStage(List<String> prerequisiteStage) {
            this.prerequisiteStage = Objects.requireNonNull(prerequisiteStage);
            return this;
        }
        public ExecutionStageSummaryResponse build() {
            return new ExecutionStageSummaryResponse(componentSource, componentTransform, inputSource, kind, name, outputSource, prerequisiteStage);
        }
    }
}
