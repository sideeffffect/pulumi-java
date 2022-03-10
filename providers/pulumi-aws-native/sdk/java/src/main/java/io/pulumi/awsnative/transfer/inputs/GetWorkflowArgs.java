// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.transfer.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetWorkflowArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWorkflowArgs Empty = new GetWorkflowArgs();

    /**
     * A unique identifier for the workflow.
     * 
     */
    @InputImport(name="workflowId", required=true)
      private final String workflowId;

    public String getWorkflowId() {
        return this.workflowId;
    }

    public GetWorkflowArgs(String workflowId) {
        this.workflowId = Objects.requireNonNull(workflowId, "expected parameter 'workflowId' to be non-null");
    }

    private GetWorkflowArgs() {
        this.workflowId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkflowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String workflowId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkflowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.workflowId = defaults.workflowId;
        }

        public Builder workflowId(String workflowId) {
            this.workflowId = Objects.requireNonNull(workflowId);
            return this;
        }
        public GetWorkflowArgs build() {
            return new GetWorkflowArgs(workflowId);
        }
    }
}
