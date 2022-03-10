// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ExecutionStageStateResponse {
    /**
     * The time at which the stage transitioned to this state.
     * 
     */
    private final String currentStateTime;
    /**
     * The name of the execution stage.
     * 
     */
    private final String executionStageName;
    /**
     * Executions stage states allow the same set of values as JobState.
     * 
     */
    private final String executionStageState;

    @OutputCustomType.Constructor
    private ExecutionStageStateResponse(
        @OutputCustomType.Parameter("currentStateTime") String currentStateTime,
        @OutputCustomType.Parameter("executionStageName") String executionStageName,
        @OutputCustomType.Parameter("executionStageState") String executionStageState) {
        this.currentStateTime = currentStateTime;
        this.executionStageName = executionStageName;
        this.executionStageState = executionStageState;
    }

    /**
     * The time at which the stage transitioned to this state.
     * 
    */
    public String getCurrentStateTime() {
        return this.currentStateTime;
    }
    /**
     * The name of the execution stage.
     * 
    */
    public String getExecutionStageName() {
        return this.executionStageName;
    }
    /**
     * Executions stage states allow the same set of values as JobState.
     * 
    */
    public String getExecutionStageState() {
        return this.executionStageState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecutionStageStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String currentStateTime;
        private String executionStageName;
        private String executionStageState;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecutionStageStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentStateTime = defaults.currentStateTime;
    	      this.executionStageName = defaults.executionStageName;
    	      this.executionStageState = defaults.executionStageState;
        }

        public Builder currentStateTime(String currentStateTime) {
            this.currentStateTime = Objects.requireNonNull(currentStateTime);
            return this;
        }

        public Builder executionStageName(String executionStageName) {
            this.executionStageName = Objects.requireNonNull(executionStageName);
            return this;
        }

        public Builder executionStageState(String executionStageState) {
            this.executionStageState = Objects.requireNonNull(executionStageState);
            return this;
        }
        public ExecutionStageStateResponse build() {
            return new ExecutionStageStateResponse(currentStateTime, executionStageName, executionStageState);
        }
    }
}
