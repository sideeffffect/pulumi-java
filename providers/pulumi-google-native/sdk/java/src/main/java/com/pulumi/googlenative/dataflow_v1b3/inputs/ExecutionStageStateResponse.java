// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow_v1b3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A message describing the state of a particular execution stage.
 * 
 */
public final class ExecutionStageStateResponse extends com.pulumi.resources.InvokeArgs {

    public static final ExecutionStageStateResponse Empty = new ExecutionStageStateResponse();

    /**
     * The time at which the stage transitioned to this state.
     * 
     */
    @Import(name="currentStateTime", required=true)
    private String currentStateTime;

    public String currentStateTime() {
        return this.currentStateTime;
    }

    /**
     * The name of the execution stage.
     * 
     */
    @Import(name="executionStageName", required=true)
    private String executionStageName;

    public String executionStageName() {
        return this.executionStageName;
    }

    /**
     * Executions stage states allow the same set of values as JobState.
     * 
     */
    @Import(name="executionStageState", required=true)
    private String executionStageState;

    public String executionStageState() {
        return this.executionStageState;
    }

    private ExecutionStageStateResponse() {}

    private ExecutionStageStateResponse(ExecutionStageStateResponse $) {
        this.currentStateTime = $.currentStateTime;
        this.executionStageName = $.executionStageName;
        this.executionStageState = $.executionStageState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExecutionStageStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExecutionStageStateResponse $;

        public Builder() {
            $ = new ExecutionStageStateResponse();
        }

        public Builder(ExecutionStageStateResponse defaults) {
            $ = new ExecutionStageStateResponse(Objects.requireNonNull(defaults));
        }

        public Builder currentStateTime(String currentStateTime) {
            $.currentStateTime = currentStateTime;
            return this;
        }

        public Builder executionStageName(String executionStageName) {
            $.executionStageName = executionStageName;
            return this;
        }

        public Builder executionStageState(String executionStageState) {
            $.executionStageState = executionStageState;
            return this;
        }

        public ExecutionStageStateResponse build() {
            $.currentStateTime = Objects.requireNonNull($.currentStateTime, "expected parameter 'currentStateTime' to be non-null");
            $.executionStageName = Objects.requireNonNull($.executionStageName, "expected parameter 'executionStageName' to be non-null");
            $.executionStageState = Objects.requireNonNull($.executionStageState, "expected parameter 'executionStageState' to be non-null");
            return $;
        }
    }

}
