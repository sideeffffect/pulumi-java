// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.insights.inputs.LocationThresholdRuleConditionArgs;
import io.pulumi.azurenative.insights.inputs.ManagementEventRuleConditionArgs;
import io.pulumi.azurenative.insights.inputs.RuleEmailActionArgs;
import io.pulumi.azurenative.insights.inputs.RuleWebhookActionArgs;
import io.pulumi.azurenative.insights.inputs.ThresholdRuleConditionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlertRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertRuleArgs Empty = new AlertRuleArgs();

    /**
     * action that is performed when the alert rule becomes active, and when an alert condition is resolved.
     * 
     */
    @InputImport(name="action")
      private final @Nullable Input<Either<RuleEmailActionArgs,RuleWebhookActionArgs>> action;

    public Input<Either<RuleEmailActionArgs,RuleWebhookActionArgs>> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    /**
     * the array of actions that are performed when the alert rule becomes active, and when an alert condition is resolved.
     * 
     */
    @InputImport(name="actions")
      private final @Nullable Input<List<Either<RuleEmailActionArgs,RuleWebhookActionArgs>>> actions;

    public Input<List<Either<RuleEmailActionArgs,RuleWebhookActionArgs>>> getActions() {
        return this.actions == null ? Input.empty() : this.actions;
    }

    /**
     * the condition that results in the alert rule being activated.
     * 
     */
    @InputImport(name="condition", required=true)
      private final Input<Object> condition;

    public Input<Object> getCondition() {
        return this.condition;
    }

    /**
     * the description of the alert rule that will be included in the alert email.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * the flag that indicates whether the alert rule is enabled.
     * 
     */
    @InputImport(name="isEnabled", required=true)
      private final Input<Boolean> isEnabled;

    public Input<Boolean> getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * the name of the alert rule.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * the provisioning state.
     * 
     */
    @InputImport(name="provisioningState")
      private final @Nullable Input<String> provisioningState;

    public Input<String> getProvisioningState() {
        return this.provisioningState == null ? Input.empty() : this.provisioningState;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the rule.
     * 
     */
    @InputImport(name="ruleName")
      private final @Nullable Input<String> ruleName;

    public Input<String> getRuleName() {
        return this.ruleName == null ? Input.empty() : this.ruleName;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public AlertRuleArgs(
        @Nullable Input<Either<RuleEmailActionArgs,RuleWebhookActionArgs>> action,
        @Nullable Input<List<Either<RuleEmailActionArgs,RuleWebhookActionArgs>>> actions,
        Input<Object> condition,
        @Nullable Input<String> description,
        Input<Boolean> isEnabled,
        @Nullable Input<String> location,
        Input<String> name,
        @Nullable Input<String> provisioningState,
        Input<String> resourceGroupName,
        @Nullable Input<String> ruleName,
        @Nullable Input<Map<String,String>> tags) {
        this.action = action;
        this.actions = actions;
        this.condition = Objects.requireNonNull(condition, "expected parameter 'condition' to be non-null");
        this.description = description;
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.location = location;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.provisioningState = provisioningState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleName = ruleName;
        this.tags = tags;
    }

    private AlertRuleArgs() {
        this.action = Input.empty();
        this.actions = Input.empty();
        this.condition = Input.empty();
        this.description = Input.empty();
        this.isEnabled = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.provisioningState = Input.empty();
        this.resourceGroupName = Input.empty();
        this.ruleName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<RuleEmailActionArgs,RuleWebhookActionArgs>> action;
        private @Nullable Input<List<Either<RuleEmailActionArgs,RuleWebhookActionArgs>>> actions;
        private Input<Object> condition;
        private @Nullable Input<String> description;
        private Input<Boolean> isEnabled;
        private @Nullable Input<String> location;
        private Input<String> name;
        private @Nullable Input<String> provisioningState;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> ruleName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.actions = defaults.actions;
    	      this.condition = defaults.condition;
    	      this.description = defaults.description;
    	      this.isEnabled = defaults.isEnabled;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleName = defaults.ruleName;
    	      this.tags = defaults.tags;
        }

        public Builder action(@Nullable Input<Either<RuleEmailActionArgs,RuleWebhookActionArgs>> action) {
            this.action = action;
            return this;
        }

        public Builder action(@Nullable Either<RuleEmailActionArgs,RuleWebhookActionArgs> action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder actions(@Nullable Input<List<Either<RuleEmailActionArgs,RuleWebhookActionArgs>>> actions) {
            this.actions = actions;
            return this;
        }

        public Builder actions(@Nullable List<Either<RuleEmailActionArgs,RuleWebhookActionArgs>> actions) {
            this.actions = Input.ofNullable(actions);
            return this;
        }

        public Builder condition(Input<Object> condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }

        public Builder condition(Object condition) {
            this.condition = Input.of(Objects.requireNonNull(condition));
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder isEnabled(Input<Boolean> isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Input.of(Objects.requireNonNull(isEnabled));
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder provisioningState(@Nullable Input<String> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = Input.ofNullable(provisioningState);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder ruleName(@Nullable Input<String> ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        public Builder ruleName(@Nullable String ruleName) {
            this.ruleName = Input.ofNullable(ruleName);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public AlertRuleArgs build() {
            return new AlertRuleArgs(action, actions, condition, description, isEnabled, location, name, provisioningState, resourceGroupName, ruleName, tags);
        }
    }
}
