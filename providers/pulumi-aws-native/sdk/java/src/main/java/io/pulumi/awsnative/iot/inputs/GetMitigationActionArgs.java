// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetMitigationActionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetMitigationActionArgs Empty = new GetMitigationActionArgs();

    /**
     * A unique identifier for the mitigation action.
     * 
     */
    @InputImport(name="actionName", required=true)
      private final String actionName;

    public String getActionName() {
        return this.actionName;
    }

    public GetMitigationActionArgs(String actionName) {
        this.actionName = Objects.requireNonNull(actionName, "expected parameter 'actionName' to be non-null");
    }

    private GetMitigationActionArgs() {
        this.actionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMitigationActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMitigationActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionName = defaults.actionName;
        }

        public Builder actionName(String actionName) {
            this.actionName = Objects.requireNonNull(actionName);
            return this;
        }
        public GetMitigationActionArgs build() {
            return new GetMitigationActionArgs(actionName);
        }
    }
}
