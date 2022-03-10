// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultServiceAccountsState extends io.pulumi.resources.ResourceArgs {

    public static final DefaultServiceAccountsState Empty = new DefaultServiceAccountsState();

    /**
     * The action to be performed in the default service accounts. Valid values are: `DEPRIVILEGE`, `DELETE`, `DISABLE`. Note that `DEPRIVILEGE` action will ignore the REVERT configuration in the restore_policy
     * 
     */
    @InputImport(name="action")
      private final @Nullable Input<String> action;

    public Input<String> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    /**
     * The project ID where service accounts are created.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The action to be performed in the default service accounts on the resource destroy.
     * Valid values are NONE, REVERT and REVERT_AND_IGNORE_FAILURE. It is applied for any action but in the DEPRIVILEGE.
     * If set to REVERT it attempts to restore all default SAs but the DEPRIVILEGE action.
     * If set to REVERT_AND_IGNORE_FAILURE it is the same behavior as REVERT but ignores errors returned by the API.
     * 
     */
    @InputImport(name="restorePolicy")
      private final @Nullable Input<String> restorePolicy;

    public Input<String> getRestorePolicy() {
        return this.restorePolicy == null ? Input.empty() : this.restorePolicy;
    }

    /**
     * The Service Accounts changed by this resource. It is used for `REVERT` the `action` on the destroy.
     * 
     */
    @InputImport(name="serviceAccounts")
      private final @Nullable Input<Map<String,Object>> serviceAccounts;

    public Input<Map<String,Object>> getServiceAccounts() {
        return this.serviceAccounts == null ? Input.empty() : this.serviceAccounts;
    }

    public DefaultServiceAccountsState(
        @Nullable Input<String> action,
        @Nullable Input<String> project,
        @Nullable Input<String> restorePolicy,
        @Nullable Input<Map<String,Object>> serviceAccounts) {
        this.action = action;
        this.project = project;
        this.restorePolicy = restorePolicy;
        this.serviceAccounts = serviceAccounts;
    }

    private DefaultServiceAccountsState() {
        this.action = Input.empty();
        this.project = Input.empty();
        this.restorePolicy = Input.empty();
        this.serviceAccounts = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultServiceAccountsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> action;
        private @Nullable Input<String> project;
        private @Nullable Input<String> restorePolicy;
        private @Nullable Input<Map<String,Object>> serviceAccounts;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultServiceAccountsState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.project = defaults.project;
    	      this.restorePolicy = defaults.restorePolicy;
    	      this.serviceAccounts = defaults.serviceAccounts;
        }

        public Builder action(@Nullable Input<String> action) {
            this.action = action;
            return this;
        }

        public Builder action(@Nullable String action) {
            this.action = Input.ofNullable(action);
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

        public Builder restorePolicy(@Nullable Input<String> restorePolicy) {
            this.restorePolicy = restorePolicy;
            return this;
        }

        public Builder restorePolicy(@Nullable String restorePolicy) {
            this.restorePolicy = Input.ofNullable(restorePolicy);
            return this;
        }

        public Builder serviceAccounts(@Nullable Input<Map<String,Object>> serviceAccounts) {
            this.serviceAccounts = serviceAccounts;
            return this;
        }

        public Builder serviceAccounts(@Nullable Map<String,Object> serviceAccounts) {
            this.serviceAccounts = Input.ofNullable(serviceAccounts);
            return this;
        }
        public DefaultServiceAccountsState build() {
            return new DefaultServiceAccountsState(action, project, restorePolicy, serviceAccounts);
        }
    }
}
