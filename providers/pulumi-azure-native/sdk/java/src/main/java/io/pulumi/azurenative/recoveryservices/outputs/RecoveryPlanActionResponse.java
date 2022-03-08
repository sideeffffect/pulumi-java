// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.RecoveryPlanAutomationRunbookActionDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.RecoveryPlanManualActionDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.RecoveryPlanScriptActionDetailsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RecoveryPlanActionResponse {
    /**
     * The action name.
     * 
     */
    private final String actionName;
    /**
     * The custom details.
     * 
     */
    private final Object customDetails;
    /**
     * The list of failover directions.
     * 
     */
    private final List<String> failoverDirections;
    /**
     * The list of failover types.
     * 
     */
    private final List<String> failoverTypes;

    @OutputCustomType.Constructor({"actionName","customDetails","failoverDirections","failoverTypes"})
    private RecoveryPlanActionResponse(
        String actionName,
        Object customDetails,
        List<String> failoverDirections,
        List<String> failoverTypes) {
        this.actionName = actionName;
        this.customDetails = customDetails;
        this.failoverDirections = failoverDirections;
        this.failoverTypes = failoverTypes;
    }

    /**
     * The action name.
     * 
    */
    public String getActionName() {
        return this.actionName;
    }
    /**
     * The custom details.
     * 
    */
    public Object getCustomDetails() {
        return this.customDetails;
    }
    /**
     * The list of failover directions.
     * 
    */
    public List<String> getFailoverDirections() {
        return this.failoverDirections;
    }
    /**
     * The list of failover types.
     * 
    */
    public List<String> getFailoverTypes() {
        return this.failoverTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecoveryPlanActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionName;
        private Object customDetails;
        private List<String> failoverDirections;
        private List<String> failoverTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(RecoveryPlanActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionName = defaults.actionName;
    	      this.customDetails = defaults.customDetails;
    	      this.failoverDirections = defaults.failoverDirections;
    	      this.failoverTypes = defaults.failoverTypes;
        }

        public Builder setActionName(String actionName) {
            this.actionName = Objects.requireNonNull(actionName);
            return this;
        }

        public Builder setCustomDetails(Object customDetails) {
            this.customDetails = Objects.requireNonNull(customDetails);
            return this;
        }

        public Builder setFailoverDirections(List<String> failoverDirections) {
            this.failoverDirections = Objects.requireNonNull(failoverDirections);
            return this;
        }

        public Builder setFailoverTypes(List<String> failoverTypes) {
            this.failoverTypes = Objects.requireNonNull(failoverTypes);
            return this;
        }
        public RecoveryPlanActionResponse build() {
            return new RecoveryPlanActionResponse(actionName, customDetails, failoverDirections, failoverTypes);
        }
    }
}
