// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.securityinsights.enums.AlertSeverity;
import io.pulumi.azurenative.securityinsights.enums.MicrosoftSecurityProductName;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MicrosoftSecurityIncidentCreationAlertRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final MicrosoftSecurityIncidentCreationAlertRuleArgs Empty = new MicrosoftSecurityIncidentCreationAlertRuleArgs();

    /**
     * The Name of the alert rule template used to create this rule.
     * 
     */
    @InputImport(name="alertRuleTemplateName")
      private final @Nullable Input<String> alertRuleTemplateName;

    public Input<String> getAlertRuleTemplateName() {
        return this.alertRuleTemplateName == null ? Input.empty() : this.alertRuleTemplateName;
    }

    /**
     * The description of the alert rule.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The display name for alerts created by this alert rule.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * the alerts' displayNames on which the cases will not be generated
     * 
     */
    @InputImport(name="displayNamesExcludeFilter")
      private final @Nullable Input<List<String>> displayNamesExcludeFilter;

    public Input<List<String>> getDisplayNamesExcludeFilter() {
        return this.displayNamesExcludeFilter == null ? Input.empty() : this.displayNamesExcludeFilter;
    }

    /**
     * the alerts' displayNames on which the cases will be generated
     * 
     */
    @InputImport(name="displayNamesFilter")
      private final @Nullable Input<List<String>> displayNamesFilter;

    public Input<List<String>> getDisplayNamesFilter() {
        return this.displayNamesFilter == null ? Input.empty() : this.displayNamesFilter;
    }

    /**
     * Determines whether this alert rule is enabled or disabled.
     * 
     */
    @InputImport(name="enabled", required=true)
      private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
    }

    /**
     * The kind of the alert rule
     * Expected value is 'MicrosoftSecurityIncidentCreation'.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * The alerts' productName on which the cases will be generated
     * 
     */
    @InputImport(name="productFilter", required=true)
      private final Input<Either<String,MicrosoftSecurityProductName>> productFilter;

    public Input<Either<String,MicrosoftSecurityProductName>> getProductFilter() {
        return this.productFilter;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Alert rule ID
     * 
     */
    @InputImport(name="ruleId")
      private final @Nullable Input<String> ruleId;

    public Input<String> getRuleId() {
        return this.ruleId == null ? Input.empty() : this.ruleId;
    }

    /**
     * the alerts' severities on which the cases will be generated
     * 
     */
    @InputImport(name="severitiesFilter")
      private final @Nullable Input<List<Either<String,AlertSeverity>>> severitiesFilter;

    public Input<List<Either<String,AlertSeverity>>> getSeveritiesFilter() {
        return this.severitiesFilter == null ? Input.empty() : this.severitiesFilter;
    }

    /**
     * The name of the workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
      private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public MicrosoftSecurityIncidentCreationAlertRuleArgs(
        @Nullable Input<String> alertRuleTemplateName,
        @Nullable Input<String> description,
        Input<String> displayName,
        @Nullable Input<List<String>> displayNamesExcludeFilter,
        @Nullable Input<List<String>> displayNamesFilter,
        Input<Boolean> enabled,
        Input<String> kind,
        Input<Either<String,MicrosoftSecurityProductName>> productFilter,
        Input<String> resourceGroupName,
        @Nullable Input<String> ruleId,
        @Nullable Input<List<Either<String,AlertSeverity>>> severitiesFilter,
        Input<String> workspaceName) {
        this.alertRuleTemplateName = alertRuleTemplateName;
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.displayNamesExcludeFilter = displayNamesExcludeFilter;
        this.displayNamesFilter = displayNamesFilter;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.productFilter = Objects.requireNonNull(productFilter, "expected parameter 'productFilter' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleId = ruleId;
        this.severitiesFilter = severitiesFilter;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private MicrosoftSecurityIncidentCreationAlertRuleArgs() {
        this.alertRuleTemplateName = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.displayNamesExcludeFilter = Input.empty();
        this.displayNamesFilter = Input.empty();
        this.enabled = Input.empty();
        this.kind = Input.empty();
        this.productFilter = Input.empty();
        this.resourceGroupName = Input.empty();
        this.ruleId = Input.empty();
        this.severitiesFilter = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MicrosoftSecurityIncidentCreationAlertRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> alertRuleTemplateName;
        private @Nullable Input<String> description;
        private Input<String> displayName;
        private @Nullable Input<List<String>> displayNamesExcludeFilter;
        private @Nullable Input<List<String>> displayNamesFilter;
        private Input<Boolean> enabled;
        private Input<String> kind;
        private Input<Either<String,MicrosoftSecurityProductName>> productFilter;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> ruleId;
        private @Nullable Input<List<Either<String,AlertSeverity>>> severitiesFilter;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(MicrosoftSecurityIncidentCreationAlertRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertRuleTemplateName = defaults.alertRuleTemplateName;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.displayNamesExcludeFilter = defaults.displayNamesExcludeFilter;
    	      this.displayNamesFilter = defaults.displayNamesFilter;
    	      this.enabled = defaults.enabled;
    	      this.kind = defaults.kind;
    	      this.productFilter = defaults.productFilter;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleId = defaults.ruleId;
    	      this.severitiesFilter = defaults.severitiesFilter;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder alertRuleTemplateName(@Nullable Input<String> alertRuleTemplateName) {
            this.alertRuleTemplateName = alertRuleTemplateName;
            return this;
        }

        public Builder alertRuleTemplateName(@Nullable String alertRuleTemplateName) {
            this.alertRuleTemplateName = Input.ofNullable(alertRuleTemplateName);
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

        public Builder displayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder displayNamesExcludeFilter(@Nullable Input<List<String>> displayNamesExcludeFilter) {
            this.displayNamesExcludeFilter = displayNamesExcludeFilter;
            return this;
        }

        public Builder displayNamesExcludeFilter(@Nullable List<String> displayNamesExcludeFilter) {
            this.displayNamesExcludeFilter = Input.ofNullable(displayNamesExcludeFilter);
            return this;
        }

        public Builder displayNamesFilter(@Nullable Input<List<String>> displayNamesFilter) {
            this.displayNamesFilter = displayNamesFilter;
            return this;
        }

        public Builder displayNamesFilter(@Nullable List<String> displayNamesFilter) {
            this.displayNamesFilter = Input.ofNullable(displayNamesFilter);
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

        public Builder kind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder productFilter(Input<Either<String,MicrosoftSecurityProductName>> productFilter) {
            this.productFilter = Objects.requireNonNull(productFilter);
            return this;
        }

        public Builder productFilter(Either<String,MicrosoftSecurityProductName> productFilter) {
            this.productFilter = Input.of(Objects.requireNonNull(productFilter));
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

        public Builder ruleId(@Nullable Input<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        public Builder ruleId(@Nullable String ruleId) {
            this.ruleId = Input.ofNullable(ruleId);
            return this;
        }

        public Builder severitiesFilter(@Nullable Input<List<Either<String,AlertSeverity>>> severitiesFilter) {
            this.severitiesFilter = severitiesFilter;
            return this;
        }

        public Builder severitiesFilter(@Nullable List<Either<String,AlertSeverity>> severitiesFilter) {
            this.severitiesFilter = Input.ofNullable(severitiesFilter);
            return this;
        }

        public Builder workspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }
        public MicrosoftSecurityIncidentCreationAlertRuleArgs build() {
            return new MicrosoftSecurityIncidentCreationAlertRuleArgs(alertRuleTemplateName, description, displayName, displayNamesExcludeFilter, displayNamesFilter, enabled, kind, productFilter, resourceGroupName, ruleId, severitiesFilter, workspaceName);
        }
    }
}
