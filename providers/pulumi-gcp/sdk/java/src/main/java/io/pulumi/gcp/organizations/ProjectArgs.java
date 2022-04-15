// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectArgs Empty = new ProjectArgs();

    /**
     * Create the 'default' network automatically.  Default `true`.
     * If set to `false`, the default network will be deleted.  Note that, for quota purposes, you
     * will still need to have 1 network slot available to create the project successfully, even if
     * you set `auto_create_network` to `false`, since the network will exist momentarily.
     * 
     */
    @Import(name="autoCreateNetwork")
      private final @Nullable Output<Boolean> autoCreateNetwork;

    public Output<Boolean> autoCreateNetwork() {
        return this.autoCreateNetwork == null ? Codegen.empty() : this.autoCreateNetwork;
    }

    /**
     * The alphanumeric ID of the billing account this project
     * belongs to. The user or service account performing this operation with the provider
     * must have at mininum Billing Account User privileges (`roles/billing.user`) on the billing account.
     * See [Google Cloud Billing API Access Control](https://cloud.google.com/billing/docs/how-to/billing-access)
     * for more details.
     * 
     */
    @Import(name="billingAccount")
      private final @Nullable Output<String> billingAccount;

    public Output<String> billingAccount() {
        return this.billingAccount == null ? Codegen.empty() : this.billingAccount;
    }

    /**
     * The numeric ID of the folder this project should be
     * created under. Only one of `org_id` or `folder_id` may be
     * specified. If the `folder_id` is specified, then the project is
     * created under the specified folder. Changing this forces the
     * project to be migrated to the newly specified folder.
     * 
     */
    @Import(name="folderId")
      private final @Nullable Output<String> folderId;

    public Output<String> folderId() {
        return this.folderId == null ? Codegen.empty() : this.folderId;
    }

    /**
     * A set of key/value label pairs to assign to the project.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The display name of the project.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The numeric ID of the organization this project belongs to.
     * Changing this forces a new project to be created.  Only one of
     * `org_id` or `folder_id` may be specified. If the `org_id` is
     * specified then the project is created at the top level. Changing
     * this forces the project to be migrated to the newly specified
     * organization.
     * 
     */
    @Import(name="orgId")
      private final @Nullable Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId == null ? Codegen.empty() : this.orgId;
    }

    /**
     * The project ID. Changing this forces a new project to be created.
     * 
     */
    @Import(name="projectId", required=true)
      private final Output<String> projectId;

    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * If true, the resource can be deleted
     * without deleting the Project via the Google API.
     * 
     */
    @Import(name="skipDelete")
      private final @Nullable Output<Boolean> skipDelete;

    public Output<Boolean> skipDelete() {
        return this.skipDelete == null ? Codegen.empty() : this.skipDelete;
    }

    public ProjectArgs(
        @Nullable Output<Boolean> autoCreateNetwork,
        @Nullable Output<String> billingAccount,
        @Nullable Output<String> folderId,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<String> orgId,
        Output<String> projectId,
        @Nullable Output<Boolean> skipDelete) {
        this.autoCreateNetwork = autoCreateNetwork;
        this.billingAccount = billingAccount;
        this.folderId = folderId;
        this.labels = labels;
        this.name = name;
        this.orgId = orgId;
        this.projectId = Objects.requireNonNull(projectId, "expected parameter 'projectId' to be non-null");
        this.skipDelete = skipDelete;
    }

    private ProjectArgs() {
        this.autoCreateNetwork = Codegen.empty();
        this.billingAccount = Codegen.empty();
        this.folderId = Codegen.empty();
        this.labels = Codegen.empty();
        this.name = Codegen.empty();
        this.orgId = Codegen.empty();
        this.projectId = Codegen.empty();
        this.skipDelete = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> autoCreateNetwork;
        private @Nullable Output<String> billingAccount;
        private @Nullable Output<String> folderId;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<String> orgId;
        private Output<String> projectId;
        private @Nullable Output<Boolean> skipDelete;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoCreateNetwork = defaults.autoCreateNetwork;
    	      this.billingAccount = defaults.billingAccount;
    	      this.folderId = defaults.folderId;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.projectId = defaults.projectId;
    	      this.skipDelete = defaults.skipDelete;
        }

        public Builder autoCreateNetwork(@Nullable Output<Boolean> autoCreateNetwork) {
            this.autoCreateNetwork = autoCreateNetwork;
            return this;
        }
        public Builder autoCreateNetwork(@Nullable Boolean autoCreateNetwork) {
            this.autoCreateNetwork = Codegen.ofNullable(autoCreateNetwork);
            return this;
        }
        public Builder billingAccount(@Nullable Output<String> billingAccount) {
            this.billingAccount = billingAccount;
            return this;
        }
        public Builder billingAccount(@Nullable String billingAccount) {
            this.billingAccount = Codegen.ofNullable(billingAccount);
            return this;
        }
        public Builder folderId(@Nullable Output<String> folderId) {
            this.folderId = folderId;
            return this;
        }
        public Builder folderId(@Nullable String folderId) {
            this.folderId = Codegen.ofNullable(folderId);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder orgId(@Nullable Output<String> orgId) {
            this.orgId = orgId;
            return this;
        }
        public Builder orgId(@Nullable String orgId) {
            this.orgId = Codegen.ofNullable(orgId);
            return this;
        }
        public Builder projectId(Output<String> projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        public Builder projectId(String projectId) {
            this.projectId = Output.of(Objects.requireNonNull(projectId));
            return this;
        }
        public Builder skipDelete(@Nullable Output<Boolean> skipDelete) {
            this.skipDelete = skipDelete;
            return this;
        }
        public Builder skipDelete(@Nullable Boolean skipDelete) {
            this.skipDelete = Codegen.ofNullable(skipDelete);
            return this;
        }        public ProjectArgs build() {
            return new ProjectArgs(autoCreateNetwork, billingAccount, folderId, labels, name, orgId, projectId, skipDelete);
        }
    }
}
