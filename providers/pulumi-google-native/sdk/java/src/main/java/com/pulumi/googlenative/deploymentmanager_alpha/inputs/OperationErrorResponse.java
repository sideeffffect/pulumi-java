// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.deploymentmanager_alpha.inputs.OperationErrorErrorsItemResponse;
import java.util.List;
import java.util.Objects;


/**
 * [Output Only] If errors are generated during processing of the operation, this field will be populated.
 * 
 */
public final class OperationErrorResponse extends com.pulumi.resources.InvokeArgs {

    public static final OperationErrorResponse Empty = new OperationErrorResponse();

    /**
     * The array of errors encountered while processing this operation.
     * 
     */
    @Import(name="errors", required=true)
      private final List<OperationErrorErrorsItemResponse> errors;

    public List<OperationErrorErrorsItemResponse> errors() {
        return this.errors;
    }

    public OperationErrorResponse(List<OperationErrorErrorsItemResponse> errors) {
        this.errors = Objects.requireNonNull(errors, "expected parameter 'errors' to be non-null");
    }

    private OperationErrorResponse() {
        this.errors = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OperationErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<OperationErrorErrorsItemResponse> errors;

        public Builder() {
    	      // Empty
        }

        public Builder(OperationErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errors = defaults.errors;
        }

        public Builder errors(List<OperationErrorErrorsItemResponse> errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }
        public Builder errors(OperationErrorErrorsItemResponse... errors) {
            return errors(List.of(errors));
        }        public OperationErrorResponse build() {
            return new OperationErrorResponse(errors);
        }
    }
}
