// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.assuredworkloads;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.assuredworkloads.inputs.WorkloadKmsSettingsArgs;
import io.pulumi.gcp.assuredworkloads.inputs.WorkloadResourceSettingArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkloadArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkloadArgs Empty = new WorkloadArgs();

    /**
     * Required. Input only. The billing account used for the resources which are direct children of workload. This billing account is initially associated with the resources created as part of Workload creation. After the initial creation of these resources, the customer can change the assigned billing account. The resource name has the form `billingAccounts/{billing_account_id}`. For example, 'billingAccounts/012345-567890-ABCDEF`.
     * 
     */
    @InputImport(name="billingAccount", required=true)
      private final Input<String> billingAccount;

    public Input<String> getBillingAccount() {
        return this.billingAccount;
    }

    /**
     * Required. Immutable. Compliance Regime associated with this workload. Possible values: COMPLIANCE_REGIME_UNSPECIFIED, IL4, CJIS, FEDRAMP_HIGH, FEDRAMP_MODERATE, US_REGIONAL_ACCESS
     * 
     */
    @InputImport(name="complianceRegime", required=true)
      private final Input<String> complianceRegime;

    public Input<String> getComplianceRegime() {
        return this.complianceRegime;
    }

    /**
     * Required. The user-assigned display name of the Workload. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, and spaces. Example: My Workload
     * 
     */
    @InputImport(name="displayName", required=true)
      private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Input only. Settings used to create a CMEK crypto key. When set a project with a KMS CMEK key is provisioned. This field is mandatory for a subset of Compliance Regimes.
     * 
     */
    @InputImport(name="kmsSettings")
      private final @Nullable Input<WorkloadKmsSettingsArgs> kmsSettings;

    public Input<WorkloadKmsSettingsArgs> getKmsSettings() {
        return this.kmsSettings == null ? Input.empty() : this.kmsSettings;
    }

    /**
     * Optional. Labels applied to the workload.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The location for the resource
     * 
     */
    @InputImport(name="location", required=true)
      private final Input<String> location;

    public Input<String> getLocation() {
        return this.location;
    }

    /**
     * The organization for the resource
     * 
     */
    @InputImport(name="organization", required=true)
      private final Input<String> organization;

    public Input<String> getOrganization() {
        return this.organization;
    }

    /**
     * Input only. The parent resource for the resources managed by this Assured Workload. May be either an organization or a folder. Must be the same or a child of the Workload parent. If not specified all resources are created under the Workload parent. Formats: folders/{folder_id}, organizations/{organization_id}
     * 
     */
    @InputImport(name="provisionedResourcesParent")
      private final @Nullable Input<String> provisionedResourcesParent;

    public Input<String> getProvisionedResourcesParent() {
        return this.provisionedResourcesParent == null ? Input.empty() : this.provisionedResourcesParent;
    }

    /**
     * Input only. Resource properties that are used to customize workload resources. These properties (such as custom project id) will be used to create workload resources if possible. This field is optional.
     * 
     */
    @InputImport(name="resourceSettings")
      private final @Nullable Input<List<WorkloadResourceSettingArgs>> resourceSettings;

    public Input<List<WorkloadResourceSettingArgs>> getResourceSettings() {
        return this.resourceSettings == null ? Input.empty() : this.resourceSettings;
    }

    public WorkloadArgs(
        Input<String> billingAccount,
        Input<String> complianceRegime,
        Input<String> displayName,
        @Nullable Input<WorkloadKmsSettingsArgs> kmsSettings,
        @Nullable Input<Map<String,String>> labels,
        Input<String> location,
        Input<String> organization,
        @Nullable Input<String> provisionedResourcesParent,
        @Nullable Input<List<WorkloadResourceSettingArgs>> resourceSettings) {
        this.billingAccount = Objects.requireNonNull(billingAccount, "expected parameter 'billingAccount' to be non-null");
        this.complianceRegime = Objects.requireNonNull(complianceRegime, "expected parameter 'complianceRegime' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.kmsSettings = kmsSettings;
        this.labels = labels;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.organization = Objects.requireNonNull(organization, "expected parameter 'organization' to be non-null");
        this.provisionedResourcesParent = provisionedResourcesParent;
        this.resourceSettings = resourceSettings;
    }

    private WorkloadArgs() {
        this.billingAccount = Input.empty();
        this.complianceRegime = Input.empty();
        this.displayName = Input.empty();
        this.kmsSettings = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.organization = Input.empty();
        this.provisionedResourcesParent = Input.empty();
        this.resourceSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> billingAccount;
        private Input<String> complianceRegime;
        private Input<String> displayName;
        private @Nullable Input<WorkloadKmsSettingsArgs> kmsSettings;
        private @Nullable Input<Map<String,String>> labels;
        private Input<String> location;
        private Input<String> organization;
        private @Nullable Input<String> provisionedResourcesParent;
        private @Nullable Input<List<WorkloadResourceSettingArgs>> resourceSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingAccount = defaults.billingAccount;
    	      this.complianceRegime = defaults.complianceRegime;
    	      this.displayName = defaults.displayName;
    	      this.kmsSettings = defaults.kmsSettings;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.organization = defaults.organization;
    	      this.provisionedResourcesParent = defaults.provisionedResourcesParent;
    	      this.resourceSettings = defaults.resourceSettings;
        }

        public Builder billingAccount(Input<String> billingAccount) {
            this.billingAccount = Objects.requireNonNull(billingAccount);
            return this;
        }

        public Builder billingAccount(String billingAccount) {
            this.billingAccount = Input.of(Objects.requireNonNull(billingAccount));
            return this;
        }

        public Builder complianceRegime(Input<String> complianceRegime) {
            this.complianceRegime = Objects.requireNonNull(complianceRegime);
            return this;
        }

        public Builder complianceRegime(String complianceRegime) {
            this.complianceRegime = Input.of(Objects.requireNonNull(complianceRegime));
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

        public Builder kmsSettings(@Nullable Input<WorkloadKmsSettingsArgs> kmsSettings) {
            this.kmsSettings = kmsSettings;
            return this;
        }

        public Builder kmsSettings(@Nullable WorkloadKmsSettingsArgs kmsSettings) {
            this.kmsSettings = Input.ofNullable(kmsSettings);
            return this;
        }

        public Builder labels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder location(Input<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder location(String location) {
            this.location = Input.of(Objects.requireNonNull(location));
            return this;
        }

        public Builder organization(Input<String> organization) {
            this.organization = Objects.requireNonNull(organization);
            return this;
        }

        public Builder organization(String organization) {
            this.organization = Input.of(Objects.requireNonNull(organization));
            return this;
        }

        public Builder provisionedResourcesParent(@Nullable Input<String> provisionedResourcesParent) {
            this.provisionedResourcesParent = provisionedResourcesParent;
            return this;
        }

        public Builder provisionedResourcesParent(@Nullable String provisionedResourcesParent) {
            this.provisionedResourcesParent = Input.ofNullable(provisionedResourcesParent);
            return this;
        }

        public Builder resourceSettings(@Nullable Input<List<WorkloadResourceSettingArgs>> resourceSettings) {
            this.resourceSettings = resourceSettings;
            return this;
        }

        public Builder resourceSettings(@Nullable List<WorkloadResourceSettingArgs> resourceSettings) {
            this.resourceSettings = Input.ofNullable(resourceSettings);
            return this;
        }
        public WorkloadArgs build() {
            return new WorkloadArgs(billingAccount, complianceRegime, displayName, kmsSettings, labels, location, organization, provisionedResourcesParent, resourceSettings);
        }
    }
}
