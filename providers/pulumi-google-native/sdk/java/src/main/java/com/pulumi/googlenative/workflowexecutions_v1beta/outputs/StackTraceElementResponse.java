// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.workflowexecutions_v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.workflowexecutions_v1beta.outputs.PositionResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class StackTraceElementResponse {
    /**
     * The source position information of the stack trace element.
     * 
     */
    private final PositionResponse position;
    /**
     * The routine where the error occurred.
     * 
     */
    private final String routine;
    /**
     * The step the error occurred at.
     * 
     */
    private final String step;

    @CustomType.Constructor
    private StackTraceElementResponse(
        @CustomType.Parameter("position") PositionResponse position,
        @CustomType.Parameter("routine") String routine,
        @CustomType.Parameter("step") String step) {
        this.position = position;
        this.routine = routine;
        this.step = step;
    }

    /**
     * The source position information of the stack trace element.
     * 
    */
    public PositionResponse position() {
        return this.position;
    }
    /**
     * The routine where the error occurred.
     * 
    */
    public String routine() {
        return this.routine;
    }
    /**
     * The step the error occurred at.
     * 
    */
    public String step() {
        return this.step;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackTraceElementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PositionResponse position;
        private String routine;
        private String step;

        public Builder() {
    	      // Empty
        }

        public Builder(StackTraceElementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.position = defaults.position;
    	      this.routine = defaults.routine;
    	      this.step = defaults.step;
        }

        public Builder position(PositionResponse position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }
        public Builder routine(String routine) {
            this.routine = Objects.requireNonNull(routine);
            return this;
        }
        public Builder step(String step) {
            this.step = Objects.requireNonNull(step);
            return this;
        }        public StackTraceElementResponse build() {
            return new StackTraceElementResponse(position, routine, step);
        }
    }
}
