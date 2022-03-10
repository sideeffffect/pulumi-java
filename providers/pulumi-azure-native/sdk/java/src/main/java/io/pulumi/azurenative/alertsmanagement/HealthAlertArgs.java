// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement;

import io.pulumi.azurenative.alertsmanagement.inputs.HealthAlertActionArgs;
import io.pulumi.azurenative.alertsmanagement.inputs.HealthAlertCriteriaArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HealthAlertArgs extends io.pulumi.resources.ResourceArgs {

    public static final HealthAlertArgs Empty = new HealthAlertArgs();

    /**
     * the array of actions that are performed when the alert rule becomes active, and when an alert condition is resolved.
     * 
     */
    @InputImport(name="actions")
      private final @Nullable Input<List<HealthAlertActionArgs>> actions;

    public Input<List<HealthAlertActionArgs>> getActions() {
        return this.actions == null ? Input.empty() : this.actions;
    }

    /**
     * defines the specific alert criteria information.
     * 
     */
    @InputImport(name="criteria", required=true)
      private final Input<HealthAlertCriteriaArgs> criteria;

    public Input<HealthAlertCriteriaArgs> getCriteria() {
        return this.criteria;
    }

    /**
     * the description of the health alert that will be included in the alert email.
     * 
     */
    @InputImport(name="description", required=true)
      private final Input<String> description;

    public Input<String> getDescription() {
        return this.description;
    }

    /**
     * the flag that indicates whether the health alert is enabled.
     * 
     */
    @InputImport(name="enabled", required=true)
      private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
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
     * The name of the resource group.
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
     * the list of resource id's that this health alert is scoped to.
     * 
     */
    @InputImport(name="scopes")
      private final @Nullable Input<List<String>> scopes;

    public Input<List<String>> getScopes() {
        return this.scopes == null ? Input.empty() : this.scopes;
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

    public HealthAlertArgs(
        @Nullable Input<List<HealthAlertActionArgs>> actions,
        Input<HealthAlertCriteriaArgs> criteria,
        Input<String> description,
        Input<Boolean> enabled,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<String> ruleName,
        @Nullable Input<List<String>> scopes,
        @Nullable Input<Map<String,String>> tags) {
        this.actions = actions;
        this.criteria = Objects.requireNonNull(criteria, "expected parameter 'criteria' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleName = ruleName;
        this.scopes = scopes;
        this.tags = tags;
    }

    private HealthAlertArgs() {
        this.actions = Input.empty();
        this.criteria = Input.empty();
        this.description = Input.empty();
        this.enabled = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.ruleName = Input.empty();
        this.scopes = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthAlertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<HealthAlertActionArgs>> actions;
        private Input<HealthAlertCriteriaArgs> criteria;
        private Input<String> description;
        private Input<Boolean> enabled;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> ruleName;
        private @Nullable Input<List<String>> scopes;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthAlertArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.criteria = defaults.criteria;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleName = defaults.ruleName;
    	      this.scopes = defaults.scopes;
    	      this.tags = defaults.tags;
        }

        public Builder actions(@Nullable Input<List<HealthAlertActionArgs>> actions) {
            this.actions = actions;
            return this;
        }

        public Builder actions(@Nullable List<HealthAlertActionArgs> actions) {
            this.actions = Input.ofNullable(actions);
            return this;
        }

        public Builder criteria(Input<HealthAlertCriteriaArgs> criteria) {
            this.criteria = Objects.requireNonNull(criteria);
            return this;
        }

        public Builder criteria(HealthAlertCriteriaArgs criteria) {
            this.criteria = Input.of(Objects.requireNonNull(criteria));
            return this;
        }

        public Builder description(Input<String> description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder description(String description) {
            this.description = Input.of(Objects.requireNonNull(description));
            return this;
        }

        public Builder enabled(Input<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Input.of(Objects.requireNonNull(enabled));
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

        public Builder scopes(@Nullable Input<List<String>> scopes) {
            this.scopes = scopes;
            return this;
        }

        public Builder scopes(@Nullable List<String> scopes) {
            this.scopes = Input.ofNullable(scopes);
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
        public HealthAlertArgs build() {
            return new HealthAlertArgs(actions, criteria, description, enabled, location, resourceGroupName, ruleName, scopes, tags);
        }
    }
}
