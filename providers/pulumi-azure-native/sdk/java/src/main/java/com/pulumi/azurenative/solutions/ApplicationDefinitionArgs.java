// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.solutions;

import com.pulumi.azurenative.solutions.enums.ApplicationLockLevel;
import com.pulumi.azurenative.solutions.inputs.ApplicationAuthorizationArgs;
import com.pulumi.azurenative.solutions.inputs.ApplicationDefinitionArtifactArgs;
import com.pulumi.azurenative.solutions.inputs.ApplicationDeploymentPolicyArgs;
import com.pulumi.azurenative.solutions.inputs.ApplicationManagementPolicyArgs;
import com.pulumi.azurenative.solutions.inputs.ApplicationNotificationPolicyArgs;
import com.pulumi.azurenative.solutions.inputs.ApplicationPackageLockingPolicyDefinitionArgs;
import com.pulumi.azurenative.solutions.inputs.ApplicationPolicyArgs;
import com.pulumi.azurenative.solutions.inputs.SkuArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationDefinitionArgs Empty = new ApplicationDefinitionArgs();

    /**
     * The name of the managed application definition.
     * 
     */
    @Import(name="applicationDefinitionName")
    private @Nullable Output<String> applicationDefinitionName;

    public Optional<Output<String>> applicationDefinitionName() {
        return Optional.ofNullable(this.applicationDefinitionName);
    }

    /**
     * The collection of managed application artifacts. The portal will use the files specified as artifacts to construct the user experience of creating a managed application from a managed application definition.
     * 
     */
    @Import(name="artifacts")
    private @Nullable Output<List<ApplicationDefinitionArtifactArgs>> artifacts;

    public Optional<Output<List<ApplicationDefinitionArtifactArgs>>> artifacts() {
        return Optional.ofNullable(this.artifacts);
    }

    /**
     * The managed application provider authorizations.
     * 
     */
    @Import(name="authorizations")
    private @Nullable Output<List<ApplicationAuthorizationArgs>> authorizations;

    public Optional<Output<List<ApplicationAuthorizationArgs>>> authorizations() {
        return Optional.ofNullable(this.authorizations);
    }

    /**
     * The createUiDefinition json for the backing template with Microsoft.Solutions/applications resource. It can be a JObject or well-formed JSON string.
     * 
     */
    @Import(name="createUiDefinition")
    private @Nullable Output<Object> createUiDefinition;

    public Optional<Output<Object>> createUiDefinition() {
        return Optional.ofNullable(this.createUiDefinition);
    }

    /**
     * The managed application deployment policy.
     * 
     */
    @Import(name="deploymentPolicy")
    private @Nullable Output<ApplicationDeploymentPolicyArgs> deploymentPolicy;

    public Optional<Output<ApplicationDeploymentPolicyArgs>> deploymentPolicy() {
        return Optional.ofNullable(this.deploymentPolicy);
    }

    /**
     * The managed application definition description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The managed application definition display name.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * A value indicating whether the package is enabled or not.
     * 
     */
    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The managed application lock level.
     * 
     */
    @Import(name="lockLevel", required=true)
    private Output<ApplicationLockLevel> lockLevel;

    public Output<ApplicationLockLevel> lockLevel() {
        return this.lockLevel;
    }

    /**
     * The managed application locking policy.
     * 
     */
    @Import(name="lockingPolicy")
    private @Nullable Output<ApplicationPackageLockingPolicyDefinitionArgs> lockingPolicy;

    public Optional<Output<ApplicationPackageLockingPolicyDefinitionArgs>> lockingPolicy() {
        return Optional.ofNullable(this.lockingPolicy);
    }

    /**
     * The inline main template json which has resources to be provisioned. It can be a JObject or well-formed JSON string.
     * 
     */
    @Import(name="mainTemplate")
    private @Nullable Output<Object> mainTemplate;

    public Optional<Output<Object>> mainTemplate() {
        return Optional.ofNullable(this.mainTemplate);
    }

    /**
     * ID of the resource that manages this resource.
     * 
     */
    @Import(name="managedBy")
    private @Nullable Output<String> managedBy;

    public Optional<Output<String>> managedBy() {
        return Optional.ofNullable(this.managedBy);
    }

    /**
     * The managed application management policy that determines publisher&#39;s access to the managed resource group.
     * 
     */
    @Import(name="managementPolicy")
    private @Nullable Output<ApplicationManagementPolicyArgs> managementPolicy;

    public Optional<Output<ApplicationManagementPolicyArgs>> managementPolicy() {
        return Optional.ofNullable(this.managementPolicy);
    }

    /**
     * The managed application notification policy.
     * 
     */
    @Import(name="notificationPolicy")
    private @Nullable Output<ApplicationNotificationPolicyArgs> notificationPolicy;

    public Optional<Output<ApplicationNotificationPolicyArgs>> notificationPolicy() {
        return Optional.ofNullable(this.notificationPolicy);
    }

    /**
     * The managed application definition package file Uri. Use this element
     * 
     */
    @Import(name="packageFileUri")
    private @Nullable Output<String> packageFileUri;

    public Optional<Output<String>> packageFileUri() {
        return Optional.ofNullable(this.packageFileUri);
    }

    /**
     * The managed application provider policies.
     * 
     */
    @Import(name="policies")
    private @Nullable Output<List<ApplicationPolicyArgs>> policies;

    public Optional<Output<List<ApplicationPolicyArgs>>> policies() {
        return Optional.ofNullable(this.policies);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The SKU of the resource.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<SkuArgs> sku;

    public Optional<Output<SkuArgs>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ApplicationDefinitionArgs() {}

    private ApplicationDefinitionArgs(ApplicationDefinitionArgs $) {
        this.applicationDefinitionName = $.applicationDefinitionName;
        this.artifacts = $.artifacts;
        this.authorizations = $.authorizations;
        this.createUiDefinition = $.createUiDefinition;
        this.deploymentPolicy = $.deploymentPolicy;
        this.description = $.description;
        this.displayName = $.displayName;
        this.isEnabled = $.isEnabled;
        this.location = $.location;
        this.lockLevel = $.lockLevel;
        this.lockingPolicy = $.lockingPolicy;
        this.mainTemplate = $.mainTemplate;
        this.managedBy = $.managedBy;
        this.managementPolicy = $.managementPolicy;
        this.notificationPolicy = $.notificationPolicy;
        this.packageFileUri = $.packageFileUri;
        this.policies = $.policies;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationDefinitionArgs $;

        public Builder() {
            $ = new ApplicationDefinitionArgs();
        }

        public Builder(ApplicationDefinitionArgs defaults) {
            $ = new ApplicationDefinitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder applicationDefinitionName(@Nullable Output<String> applicationDefinitionName) {
            $.applicationDefinitionName = applicationDefinitionName;
            return this;
        }

        public Builder applicationDefinitionName(String applicationDefinitionName) {
            return applicationDefinitionName(Output.of(applicationDefinitionName));
        }

        public Builder artifacts(@Nullable Output<List<ApplicationDefinitionArtifactArgs>> artifacts) {
            $.artifacts = artifacts;
            return this;
        }

        public Builder artifacts(List<ApplicationDefinitionArtifactArgs> artifacts) {
            return artifacts(Output.of(artifacts));
        }

        public Builder artifacts(ApplicationDefinitionArtifactArgs... artifacts) {
            return artifacts(List.of(artifacts));
        }

        public Builder authorizations(@Nullable Output<List<ApplicationAuthorizationArgs>> authorizations) {
            $.authorizations = authorizations;
            return this;
        }

        public Builder authorizations(List<ApplicationAuthorizationArgs> authorizations) {
            return authorizations(Output.of(authorizations));
        }

        public Builder authorizations(ApplicationAuthorizationArgs... authorizations) {
            return authorizations(List.of(authorizations));
        }

        public Builder createUiDefinition(@Nullable Output<Object> createUiDefinition) {
            $.createUiDefinition = createUiDefinition;
            return this;
        }

        public Builder createUiDefinition(Object createUiDefinition) {
            return createUiDefinition(Output.of(createUiDefinition));
        }

        public Builder deploymentPolicy(@Nullable Output<ApplicationDeploymentPolicyArgs> deploymentPolicy) {
            $.deploymentPolicy = deploymentPolicy;
            return this;
        }

        public Builder deploymentPolicy(ApplicationDeploymentPolicyArgs deploymentPolicy) {
            return deploymentPolicy(Output.of(deploymentPolicy));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder lockLevel(Output<ApplicationLockLevel> lockLevel) {
            $.lockLevel = lockLevel;
            return this;
        }

        public Builder lockLevel(ApplicationLockLevel lockLevel) {
            return lockLevel(Output.of(lockLevel));
        }

        public Builder lockingPolicy(@Nullable Output<ApplicationPackageLockingPolicyDefinitionArgs> lockingPolicy) {
            $.lockingPolicy = lockingPolicy;
            return this;
        }

        public Builder lockingPolicy(ApplicationPackageLockingPolicyDefinitionArgs lockingPolicy) {
            return lockingPolicy(Output.of(lockingPolicy));
        }

        public Builder mainTemplate(@Nullable Output<Object> mainTemplate) {
            $.mainTemplate = mainTemplate;
            return this;
        }

        public Builder mainTemplate(Object mainTemplate) {
            return mainTemplate(Output.of(mainTemplate));
        }

        public Builder managedBy(@Nullable Output<String> managedBy) {
            $.managedBy = managedBy;
            return this;
        }

        public Builder managedBy(String managedBy) {
            return managedBy(Output.of(managedBy));
        }

        public Builder managementPolicy(@Nullable Output<ApplicationManagementPolicyArgs> managementPolicy) {
            $.managementPolicy = managementPolicy;
            return this;
        }

        public Builder managementPolicy(ApplicationManagementPolicyArgs managementPolicy) {
            return managementPolicy(Output.of(managementPolicy));
        }

        public Builder notificationPolicy(@Nullable Output<ApplicationNotificationPolicyArgs> notificationPolicy) {
            $.notificationPolicy = notificationPolicy;
            return this;
        }

        public Builder notificationPolicy(ApplicationNotificationPolicyArgs notificationPolicy) {
            return notificationPolicy(Output.of(notificationPolicy));
        }

        public Builder packageFileUri(@Nullable Output<String> packageFileUri) {
            $.packageFileUri = packageFileUri;
            return this;
        }

        public Builder packageFileUri(String packageFileUri) {
            return packageFileUri(Output.of(packageFileUri));
        }

        public Builder policies(@Nullable Output<List<ApplicationPolicyArgs>> policies) {
            $.policies = policies;
            return this;
        }

        public Builder policies(List<ApplicationPolicyArgs> policies) {
            return policies(Output.of(policies));
        }

        public Builder policies(ApplicationPolicyArgs... policies) {
            return policies(List.of(policies));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder sku(@Nullable Output<SkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        public Builder sku(SkuArgs sku) {
            return sku(Output.of(sku));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ApplicationDefinitionArgs build() {
            $.lockLevel = Objects.requireNonNull($.lockLevel, "expected parameter 'lockLevel' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
