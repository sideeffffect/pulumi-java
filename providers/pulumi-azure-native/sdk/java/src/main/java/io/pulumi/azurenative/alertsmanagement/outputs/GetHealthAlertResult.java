// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.outputs;

import io.pulumi.azurenative.alertsmanagement.outputs.HealthAlertActionResponse;
import io.pulumi.azurenative.alertsmanagement.outputs.HealthAlertCriteriaResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetHealthAlertResult {
    /**
     * the array of actions that are performed when the alert rule becomes active, and when an alert condition is resolved.
     * 
     */
    private final @Nullable List<HealthAlertActionResponse> actions;
    /**
     * defines the specific alert criteria information.
     * 
     */
    private final HealthAlertCriteriaResponse criteria;
    /**
     * the description of the health alert that will be included in the alert email.
     * 
     */
    private final String description;
    /**
     * the flag that indicates whether the health alert is enabled.
     * 
     */
    private final Boolean enabled;
    /**
     * Azure resource Id
     * 
     */
    private final String id;
    /**
     * Last time the rule was updated in ISO8601 format.
     * 
     */
    private final String lastUpdatedTime;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Azure resource name
     * 
     */
    private final String name;
    /**
     * the list of resource id's that this health alert is scoped to.
     * 
     */
    private final @Nullable List<String> scopes;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Azure resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"actions","criteria","description","enabled","id","lastUpdatedTime","location","name","scopes","tags","type"})
    private GetHealthAlertResult(
        @Nullable List<HealthAlertActionResponse> actions,
        HealthAlertCriteriaResponse criteria,
        String description,
        Boolean enabled,
        String id,
        String lastUpdatedTime,
        String location,
        String name,
        @Nullable List<String> scopes,
        @Nullable Map<String,String> tags,
        String type) {
        this.actions = actions;
        this.criteria = criteria;
        this.description = description;
        this.enabled = enabled;
        this.id = id;
        this.lastUpdatedTime = lastUpdatedTime;
        this.location = location;
        this.name = name;
        this.scopes = scopes;
        this.tags = tags;
        this.type = type;
    }

    /**
     * the array of actions that are performed when the alert rule becomes active, and when an alert condition is resolved.
     * 
    */
    public List<HealthAlertActionResponse> getActions() {
        return this.actions == null ? List.of() : this.actions;
    }
    /**
     * defines the specific alert criteria information.
     * 
    */
    public HealthAlertCriteriaResponse getCriteria() {
        return this.criteria;
    }
    /**
     * the description of the health alert that will be included in the alert email.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * the flag that indicates whether the health alert is enabled.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * Azure resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Last time the rule was updated in ISO8601 format.
     * 
    */
    public String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    /**
     * Resource location
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Azure resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * the list of resource id's that this health alert is scoped to.
     * 
    */
    public List<String> getScopes() {
        return this.scopes == null ? List.of() : this.scopes;
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Azure resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHealthAlertResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<HealthAlertActionResponse> actions;
        private HealthAlertCriteriaResponse criteria;
        private String description;
        private Boolean enabled;
        private String id;
        private String lastUpdatedTime;
        private String location;
        private String name;
        private @Nullable List<String> scopes;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHealthAlertResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.criteria = defaults.criteria;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.scopes = defaults.scopes;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setActions(@Nullable List<HealthAlertActionResponse> actions) {
            this.actions = actions;
            return this;
        }

        public Builder setCriteria(HealthAlertCriteriaResponse criteria) {
            this.criteria = Objects.requireNonNull(criteria);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastUpdatedTime(String lastUpdatedTime) {
            this.lastUpdatedTime = Objects.requireNonNull(lastUpdatedTime);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setScopes(@Nullable List<String> scopes) {
            this.scopes = scopes;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetHealthAlertResult build() {
            return new GetHealthAlertResult(actions, criteria, description, enabled, id, lastUpdatedTime, location, name, scopes, tags, type);
        }
    }
}
