// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudfunctions.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class GetFunctionEventTriggerFailurePolicy extends com.pulumi.resources.InvokeArgs {

    public static final GetFunctionEventTriggerFailurePolicy Empty = new GetFunctionEventTriggerFailurePolicy();

    /**
     * Whether the function should be retried on failure.
     * 
     */
    @Import(name="retry", required=true)
      private final Boolean retry;

    public Boolean retry() {
        return this.retry;
    }

    public GetFunctionEventTriggerFailurePolicy(Boolean retry) {
        this.retry = Objects.requireNonNull(retry, "expected parameter 'retry' to be non-null");
    }

    private GetFunctionEventTriggerFailurePolicy() {
        this.retry = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionEventTriggerFailurePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean retry;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionEventTriggerFailurePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retry = defaults.retry;
        }

        public Builder retry(Boolean retry) {
            this.retry = Objects.requireNonNull(retry);
            return this;
        }        public GetFunctionEventTriggerFailurePolicy build() {
            return new GetFunctionEventTriggerFailurePolicy(retry);
        }
    }
}
