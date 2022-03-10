// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.inputs;

import io.pulumi.azurenative.alertsmanagement.inputs.ConditionResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Conditions in alert instance to be matched for a given action rule. Default value is all. Multiple values could be provided with comma separation.
 * 
 */
public final class ConditionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConditionsResponse Empty = new ConditionsResponse();

    /**
     * filter alerts by alert context (payload)
     * 
     */
    @InputImport(name="alertContext")
      private final @Nullable ConditionResponse alertContext;

    public Optional<ConditionResponse> getAlertContext() {
        return this.alertContext == null ? Optional.empty() : Optional.ofNullable(this.alertContext);
    }

    /**
     * filter alerts by alert rule id
     * 
     */
    @InputImport(name="alertRuleId")
      private final @Nullable ConditionResponse alertRuleId;

    public Optional<ConditionResponse> getAlertRuleId() {
        return this.alertRuleId == null ? Optional.empty() : Optional.ofNullable(this.alertRuleId);
    }

    /**
     * filter alerts by alert rule description
     * 
     */
    @InputImport(name="description")
      private final @Nullable ConditionResponse description;

    public Optional<ConditionResponse> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * filter alerts by monitor condition
     * 
     */
    @InputImport(name="monitorCondition")
      private final @Nullable ConditionResponse monitorCondition;

    public Optional<ConditionResponse> getMonitorCondition() {
        return this.monitorCondition == null ? Optional.empty() : Optional.ofNullable(this.monitorCondition);
    }

    /**
     * filter alerts by monitor service
     * 
     */
    @InputImport(name="monitorService")
      private final @Nullable ConditionResponse monitorService;

    public Optional<ConditionResponse> getMonitorService() {
        return this.monitorService == null ? Optional.empty() : Optional.ofNullable(this.monitorService);
    }

    /**
     * filter alerts by severity
     * 
     */
    @InputImport(name="severity")
      private final @Nullable ConditionResponse severity;

    public Optional<ConditionResponse> getSeverity() {
        return this.severity == null ? Optional.empty() : Optional.ofNullable(this.severity);
    }

    /**
     * filter alerts by target resource type
     * 
     */
    @InputImport(name="targetResourceType")
      private final @Nullable ConditionResponse targetResourceType;

    public Optional<ConditionResponse> getTargetResourceType() {
        return this.targetResourceType == null ? Optional.empty() : Optional.ofNullable(this.targetResourceType);
    }

    public ConditionsResponse(
        @Nullable ConditionResponse alertContext,
        @Nullable ConditionResponse alertRuleId,
        @Nullable ConditionResponse description,
        @Nullable ConditionResponse monitorCondition,
        @Nullable ConditionResponse monitorService,
        @Nullable ConditionResponse severity,
        @Nullable ConditionResponse targetResourceType) {
        this.alertContext = alertContext;
        this.alertRuleId = alertRuleId;
        this.description = description;
        this.monitorCondition = monitorCondition;
        this.monitorService = monitorService;
        this.severity = severity;
        this.targetResourceType = targetResourceType;
    }

    private ConditionsResponse() {
        this.alertContext = null;
        this.alertRuleId = null;
        this.description = null;
        this.monitorCondition = null;
        this.monitorService = null;
        this.severity = null;
        this.targetResourceType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConditionResponse alertContext;
        private @Nullable ConditionResponse alertRuleId;
        private @Nullable ConditionResponse description;
        private @Nullable ConditionResponse monitorCondition;
        private @Nullable ConditionResponse monitorService;
        private @Nullable ConditionResponse severity;
        private @Nullable ConditionResponse targetResourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertContext = defaults.alertContext;
    	      this.alertRuleId = defaults.alertRuleId;
    	      this.description = defaults.description;
    	      this.monitorCondition = defaults.monitorCondition;
    	      this.monitorService = defaults.monitorService;
    	      this.severity = defaults.severity;
    	      this.targetResourceType = defaults.targetResourceType;
        }

        public Builder alertContext(@Nullable ConditionResponse alertContext) {
            this.alertContext = alertContext;
            return this;
        }

        public Builder alertRuleId(@Nullable ConditionResponse alertRuleId) {
            this.alertRuleId = alertRuleId;
            return this;
        }

        public Builder description(@Nullable ConditionResponse description) {
            this.description = description;
            return this;
        }

        public Builder monitorCondition(@Nullable ConditionResponse monitorCondition) {
            this.monitorCondition = monitorCondition;
            return this;
        }

        public Builder monitorService(@Nullable ConditionResponse monitorService) {
            this.monitorService = monitorService;
            return this;
        }

        public Builder severity(@Nullable ConditionResponse severity) {
            this.severity = severity;
            return this;
        }

        public Builder targetResourceType(@Nullable ConditionResponse targetResourceType) {
            this.targetResourceType = targetResourceType;
            return this;
        }
        public ConditionsResponse build() {
            return new ConditionsResponse(alertContext, alertRuleId, description, monitorCondition, monitorService, severity, targetResourceType);
        }
    }
}
