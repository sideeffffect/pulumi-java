// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.inputs.ResizeErrorResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes either the current operation (if the pool AllocationState is Resizing) or the previously completed operation (if the AllocationState is Steady).
 * 
 */
public final class ResizeOperationStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResizeOperationStatusResponse Empty = new ResizeOperationStatusResponse();

    /**
     * This property is set only if an error occurred during the last pool resize, and only when the pool allocationState is Steady.
     * 
     */
    @InputImport(name="errors")
      private final @Nullable List<ResizeErrorResponse> errors;

    public List<ResizeErrorResponse> getErrors() {
        return this.errors == null ? List.of() : this.errors;
    }

    /**
     * The default value is requeue.
     * 
     */
    @InputImport(name="nodeDeallocationOption")
      private final @Nullable String nodeDeallocationOption;

    public Optional<String> getNodeDeallocationOption() {
        return this.nodeDeallocationOption == null ? Optional.empty() : Optional.ofNullable(this.nodeDeallocationOption);
    }

    /**
     * The default value is 15 minutes. The minimum value is 5 minutes. If you specify a value less than 5 minutes, the Batch service returns an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     * 
     */
    @InputImport(name="resizeTimeout")
      private final @Nullable String resizeTimeout;

    public Optional<String> getResizeTimeout() {
        return this.resizeTimeout == null ? Optional.empty() : Optional.ofNullable(this.resizeTimeout);
    }

    @InputImport(name="startTime")
      private final @Nullable String startTime;

    public Optional<String> getStartTime() {
        return this.startTime == null ? Optional.empty() : Optional.ofNullable(this.startTime);
    }

    @InputImport(name="targetDedicatedNodes")
      private final @Nullable Integer targetDedicatedNodes;

    public Optional<Integer> getTargetDedicatedNodes() {
        return this.targetDedicatedNodes == null ? Optional.empty() : Optional.ofNullable(this.targetDedicatedNodes);
    }

    @InputImport(name="targetLowPriorityNodes")
      private final @Nullable Integer targetLowPriorityNodes;

    public Optional<Integer> getTargetLowPriorityNodes() {
        return this.targetLowPriorityNodes == null ? Optional.empty() : Optional.ofNullable(this.targetLowPriorityNodes);
    }

    public ResizeOperationStatusResponse(
        @Nullable List<ResizeErrorResponse> errors,
        @Nullable String nodeDeallocationOption,
        @Nullable String resizeTimeout,
        @Nullable String startTime,
        @Nullable Integer targetDedicatedNodes,
        @Nullable Integer targetLowPriorityNodes) {
        this.errors = errors;
        this.nodeDeallocationOption = nodeDeallocationOption;
        this.resizeTimeout = resizeTimeout;
        this.startTime = startTime;
        this.targetDedicatedNodes = targetDedicatedNodes;
        this.targetLowPriorityNodes = targetLowPriorityNodes;
    }

    private ResizeOperationStatusResponse() {
        this.errors = List.of();
        this.nodeDeallocationOption = null;
        this.resizeTimeout = null;
        this.startTime = null;
        this.targetDedicatedNodes = null;
        this.targetLowPriorityNodes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResizeOperationStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ResizeErrorResponse> errors;
        private @Nullable String nodeDeallocationOption;
        private @Nullable String resizeTimeout;
        private @Nullable String startTime;
        private @Nullable Integer targetDedicatedNodes;
        private @Nullable Integer targetLowPriorityNodes;

        public Builder() {
    	      // Empty
        }

        public Builder(ResizeOperationStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errors = defaults.errors;
    	      this.nodeDeallocationOption = defaults.nodeDeallocationOption;
    	      this.resizeTimeout = defaults.resizeTimeout;
    	      this.startTime = defaults.startTime;
    	      this.targetDedicatedNodes = defaults.targetDedicatedNodes;
    	      this.targetLowPriorityNodes = defaults.targetLowPriorityNodes;
        }

        public Builder errors(@Nullable List<ResizeErrorResponse> errors) {
            this.errors = errors;
            return this;
        }

        public Builder nodeDeallocationOption(@Nullable String nodeDeallocationOption) {
            this.nodeDeallocationOption = nodeDeallocationOption;
            return this;
        }

        public Builder resizeTimeout(@Nullable String resizeTimeout) {
            this.resizeTimeout = resizeTimeout;
            return this;
        }

        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder targetDedicatedNodes(@Nullable Integer targetDedicatedNodes) {
            this.targetDedicatedNodes = targetDedicatedNodes;
            return this;
        }

        public Builder targetLowPriorityNodes(@Nullable Integer targetLowPriorityNodes) {
            this.targetLowPriorityNodes = targetLowPriorityNodes;
            return this;
        }
        public ResizeOperationStatusResponse build() {
            return new ResizeOperationStatusResponse(errors, nodeDeallocationOption, resizeTimeout, startTime, targetDedicatedNodes, targetLowPriorityNodes);
        }
    }
}
