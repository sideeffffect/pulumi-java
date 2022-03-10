// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iam.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderAwsGetArgs;
import io.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderOidcGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkloadIdentityPoolProviderState extends io.pulumi.resources.ResourceArgs {

    public static final WorkloadIdentityPoolProviderState Empty = new WorkloadIdentityPoolProviderState();

    /**
     * [A Common Expression Language](https://opensource.google/projects/cel) expression, in
     * plain text, to restrict what otherwise valid authentication credentials issued by the
     * provider should not be accepted.
     * The expression must output a boolean representing whether to allow the federation.
     * The following keywords may be referenced in the expressions:
     * * `assertion`: JSON representing the authentication credential issued by the provider.
     * * `google`: The Google attributes mapped from the assertion in the `attribute_mappings`.
     * * `attribute`: The custom attributes mapped from the assertion in the `attribute_mappings`.
     *   The maximum length of the attribute condition expression is 4096 characters. If
     *   unspecified, all valid authentication credential are accepted.
     *   The following example shows how to only allow credentials with a mapped `google.groups`
     *   value of `admins`:
     * 
     */
    @InputImport(name="attributeCondition")
      private final @Nullable Input<String> attributeCondition;

    public Input<String> getAttributeCondition() {
        return this.attributeCondition == null ? Input.empty() : this.attributeCondition;
    }

    /**
     * Maps attributes from authentication credentials issued by an external identity provider
     * to Google Cloud attributes, such as `subject` and `segment`.
     * Each key must be a string specifying the Google Cloud IAM attribute to map to.
     * The following keys are supported:
     * * `google.subject`: The principal IAM is authenticating. You can reference this value
     *   in IAM bindings. This is also the subject that appears in Cloud Logging logs.
     *   Cannot exceed 127 characters.
     * * `google.groups`: Groups the external identity belongs to. You can grant groups
     *   access to resources using an IAM `principalSet` binding; access applies to all
     *   members of the group.
     *   You can also provide custom attributes by specifying `attribute.{custom_attribute}`,
     *   where `{custom_attribute}` is the name of the custom attribute to be mapped. You can
     *   define a maximum of 50 custom attributes. The maximum length of a mapped attribute key
     *   is 100 characters, and the key may only contain the characters [a-z0-9_].
     *   You can reference these attributes in IAM policies to define fine-grained access for a
     *   workload to Google Cloud resources. For example:
     * * `google.subject`:
     *   `principal://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/subject/{value}`
     * * `google.groups`:
     *   `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/group/{value}`
     * * `attribute.{custom_attribute}`:
     *   `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/attribute.{custom_attribute}/{value}`
     *   Each value must be a [Common Expression Language](https://opensource.google/projects/cel)
     *   function that maps an identity provider credential to the normalized attribute specified
     *   by the corresponding map key.
     *   You can use the `assertion` keyword in the expression to access a JSON representation of
     *   the authentication credential issued by the provider.
     *   The maximum length of an attribute mapping expression is 2048 characters. When evaluated,
     *   the total size of all mapped attributes must not exceed 8KB.
     *   For AWS providers, the following rules apply:
     * - If no attribute mapping is defined, the following default mapping applies:
     * - If any custom attribute mappings are defined, they must include a mapping to the
     *   `google.subject` attribute.
     *   For OIDC providers, the following rules apply:
     * - Custom attribute mappings must be defined, and must include a mapping to the
     *   `google.subject` attribute. For example, the following maps the `sub` claim of the
     *   incoming credential to the `subject` attribute on a Google token.
     * 
     */
    @InputImport(name="attributeMapping")
      private final @Nullable Input<Map<String,String>> attributeMapping;

    public Input<Map<String,String>> getAttributeMapping() {
        return this.attributeMapping == null ? Input.empty() : this.attributeMapping;
    }

    /**
     * An Amazon Web Services identity provider. Not compatible with the property oidc.
     * Structure is documented below.
     * 
     */
    @InputImport(name="aws")
      private final @Nullable Input<WorkloadIdentityPoolProviderAwsGetArgs> aws;

    public Input<WorkloadIdentityPoolProviderAwsGetArgs> getAws() {
        return this.aws == null ? Input.empty() : this.aws;
    }

    /**
     * A description for the provider. Cannot exceed 256 characters.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Whether the provider is disabled. You cannot use a disabled provider to exchange tokens.
     * However, existing tokens still grant access.
     * 
     */
    @InputImport(name="disabled")
      private final @Nullable Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled == null ? Input.empty() : this.disabled;
    }

    /**
     * A display name for the provider. Cannot exceed 32 characters.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The resource name of the provider as
     * 'projects/{project_number}/locations/global/workloadIdentityPools/{workload_identity_pool_id}/providers/{workload_identity_pool_provider_id}'.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * An OpenId Connect 1.0 identity provider. Not compatible with the property aws.
     * Structure is documented below.
     * 
     */
    @InputImport(name="oidc")
      private final @Nullable Input<WorkloadIdentityPoolProviderOidcGetArgs> oidc;

    public Input<WorkloadIdentityPoolProviderOidcGetArgs> getOidc() {
        return this.oidc == null ? Input.empty() : this.oidc;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The state of the provider. * STATE_UNSPECIFIED: State unspecified. * ACTIVE: The provider is active, and may be used to
     * validate authentication credentials. * DELETED: The provider is soft-deleted. Soft-deleted providers are permanently
     * deleted after approximately 30 days. You can restore a soft-deleted provider using UndeleteWorkloadIdentityPoolProvider.
     * You cannot reuse the ID of a soft-deleted provider until it is permanently deleted.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * The ID used for the pool, which is the final component of the pool resource name. This
     * value should be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix
     * `gcp-` is reserved for use by Google, and may not be specified.
     * 
     */
    @InputImport(name="workloadIdentityPoolId")
      private final @Nullable Input<String> workloadIdentityPoolId;

    public Input<String> getWorkloadIdentityPoolId() {
        return this.workloadIdentityPoolId == null ? Input.empty() : this.workloadIdentityPoolId;
    }

    /**
     * The ID for the provider, which becomes the final component of the resource name. This
     * value must be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix
     * `gcp-` is reserved for use by Google, and may not be specified.
     * 
     */
    @InputImport(name="workloadIdentityPoolProviderId")
      private final @Nullable Input<String> workloadIdentityPoolProviderId;

    public Input<String> getWorkloadIdentityPoolProviderId() {
        return this.workloadIdentityPoolProviderId == null ? Input.empty() : this.workloadIdentityPoolProviderId;
    }

    public WorkloadIdentityPoolProviderState(
        @Nullable Input<String> attributeCondition,
        @Nullable Input<Map<String,String>> attributeMapping,
        @Nullable Input<WorkloadIdentityPoolProviderAwsGetArgs> aws,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> disabled,
        @Nullable Input<String> displayName,
        @Nullable Input<String> name,
        @Nullable Input<WorkloadIdentityPoolProviderOidcGetArgs> oidc,
        @Nullable Input<String> project,
        @Nullable Input<String> state,
        @Nullable Input<String> workloadIdentityPoolId,
        @Nullable Input<String> workloadIdentityPoolProviderId) {
        this.attributeCondition = attributeCondition;
        this.attributeMapping = attributeMapping;
        this.aws = aws;
        this.description = description;
        this.disabled = disabled;
        this.displayName = displayName;
        this.name = name;
        this.oidc = oidc;
        this.project = project;
        this.state = state;
        this.workloadIdentityPoolId = workloadIdentityPoolId;
        this.workloadIdentityPoolProviderId = workloadIdentityPoolProviderId;
    }

    private WorkloadIdentityPoolProviderState() {
        this.attributeCondition = Input.empty();
        this.attributeMapping = Input.empty();
        this.aws = Input.empty();
        this.description = Input.empty();
        this.disabled = Input.empty();
        this.displayName = Input.empty();
        this.name = Input.empty();
        this.oidc = Input.empty();
        this.project = Input.empty();
        this.state = Input.empty();
        this.workloadIdentityPoolId = Input.empty();
        this.workloadIdentityPoolProviderId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadIdentityPoolProviderState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> attributeCondition;
        private @Nullable Input<Map<String,String>> attributeMapping;
        private @Nullable Input<WorkloadIdentityPoolProviderAwsGetArgs> aws;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> disabled;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> name;
        private @Nullable Input<WorkloadIdentityPoolProviderOidcGetArgs> oidc;
        private @Nullable Input<String> project;
        private @Nullable Input<String> state;
        private @Nullable Input<String> workloadIdentityPoolId;
        private @Nullable Input<String> workloadIdentityPoolProviderId;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadIdentityPoolProviderState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeCondition = defaults.attributeCondition;
    	      this.attributeMapping = defaults.attributeMapping;
    	      this.aws = defaults.aws;
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.oidc = defaults.oidc;
    	      this.project = defaults.project;
    	      this.state = defaults.state;
    	      this.workloadIdentityPoolId = defaults.workloadIdentityPoolId;
    	      this.workloadIdentityPoolProviderId = defaults.workloadIdentityPoolProviderId;
        }

        public Builder attributeCondition(@Nullable Input<String> attributeCondition) {
            this.attributeCondition = attributeCondition;
            return this;
        }

        public Builder attributeCondition(@Nullable String attributeCondition) {
            this.attributeCondition = Input.ofNullable(attributeCondition);
            return this;
        }

        public Builder attributeMapping(@Nullable Input<Map<String,String>> attributeMapping) {
            this.attributeMapping = attributeMapping;
            return this;
        }

        public Builder attributeMapping(@Nullable Map<String,String> attributeMapping) {
            this.attributeMapping = Input.ofNullable(attributeMapping);
            return this;
        }

        public Builder aws(@Nullable Input<WorkloadIdentityPoolProviderAwsGetArgs> aws) {
            this.aws = aws;
            return this;
        }

        public Builder aws(@Nullable WorkloadIdentityPoolProviderAwsGetArgs aws) {
            this.aws = Input.ofNullable(aws);
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

        public Builder disabled(@Nullable Input<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Input.ofNullable(disabled);
            return this;
        }

        public Builder displayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder oidc(@Nullable Input<WorkloadIdentityPoolProviderOidcGetArgs> oidc) {
            this.oidc = oidc;
            return this;
        }

        public Builder oidc(@Nullable WorkloadIdentityPoolProviderOidcGetArgs oidc) {
            this.oidc = Input.ofNullable(oidc);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder state(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder workloadIdentityPoolId(@Nullable Input<String> workloadIdentityPoolId) {
            this.workloadIdentityPoolId = workloadIdentityPoolId;
            return this;
        }

        public Builder workloadIdentityPoolId(@Nullable String workloadIdentityPoolId) {
            this.workloadIdentityPoolId = Input.ofNullable(workloadIdentityPoolId);
            return this;
        }

        public Builder workloadIdentityPoolProviderId(@Nullable Input<String> workloadIdentityPoolProviderId) {
            this.workloadIdentityPoolProviderId = workloadIdentityPoolProviderId;
            return this;
        }

        public Builder workloadIdentityPoolProviderId(@Nullable String workloadIdentityPoolProviderId) {
            this.workloadIdentityPoolProviderId = Input.ofNullable(workloadIdentityPoolProviderId);
            return this;
        }
        public WorkloadIdentityPoolProviderState build() {
            return new WorkloadIdentityPoolProviderState(attributeCondition, attributeMapping, aws, description, disabled, displayName, name, oidc, project, state, workloadIdentityPoolId, workloadIdentityPoolProviderId);
        }
    }
}
